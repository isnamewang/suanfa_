import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Iterator;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: PACKAGE_NAME.HttpServer
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/4/16 16:10
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/4/16      wusd          v1.0.0               修改原因
 */
public class HttpServer {

    public static void main(String[] args) throws IOException {

        ServerSocketChannel ssc = ServerSocketChannel.open();
        ssc.socket().bind(new InetSocketAddress(8080));
        ssc.configureBlocking(false);

        Selector selector = Selector.open();
        ssc.register(selector, SelectionKey.OP_ACCEPT);

        /*selector.select();
        Iterator<SelectionKey>keyIter = selector.selectedKeys().iterator();
        while (keyIter.hasNext()){
            SelectionKey key = keyIter.next();
            System.out.println(key.channel().toString());
            new Thread(new HttpHandler(key)).run();
            keyIter.remove();
        }*/

        while (true){
            if(selector.select(3000)==0){
                continue;
            }
            Iterator<SelectionKey>keyIter = selector.selectedKeys().iterator();
            while (keyIter.hasNext()){
                SelectionKey key = keyIter.next();
                new Thread(new HttpHandler(key)).run();
                keyIter.remove();
            }

        }
    }
    private static class HttpHandler implements Runnable{

       private int bufferSize = 1024;
       private String localCharset = "UTF-8";
       private SelectionKey key;
       public HttpHandler(SelectionKey key){
           this.key=key;
       }
       public void handleAccept() throws IOException {
           System.out.println("Connexting..."+key.channel().toString());
           SocketChannel clientChannel = ((ServerSocketChannel)key.channel()).accept();
           clientChannel.configureBlocking(false);
           clientChannel.register(key.selector(),SelectionKey.OP_READ,ByteBuffer.allocate(bufferSize));
       }
       public void handleRead() throws IOException {

           SocketChannel sc = (SocketChannel)key.channel();
           ByteBuffer buffer =(ByteBuffer) key.attachment();
           buffer.clear();
           if(sc.read(buffer)==-1){
               sc.close();
           }else{
               buffer.flip();
               String receiverString = Charset.forName(localCharset).newDecoder().decode(buffer).toString();
               String[] requestMessage = receiverString.split("\r\n");
               for(String s :requestMessage){
                   System.out.println(s);
                   if(s.isEmpty())
                       break;
               }
               String[] firstLine = requestMessage[0].split(" ");
               System.out.println();
               System.out.println("Method:\t"+firstLine[0]);
               System.out.println("url:\t"+firstLine[1]);
               System.out.println("Http Version:\t"+firstLine[2]);

               StringBuilder sendString = new StringBuilder();
               sendString.append("HTTP/1.1 200 OK\r\n");
               sendString.append("Content-Type:text/html;charest="+localCharset+"\r\n");
               sendString.append("\r\n");
               sendString.append("<html><head><title>保温</title></head><body>");
               sendString.append("请求时：<br/>");
               for(String s:requestMessage){
                   sendString.append(s+"<br/>");
               }
               sendString.append("</body></html>");
               buffer = ByteBuffer.wrap(sendString.toString().getBytes(localCharset));
               sc.write(buffer);
               sc.close();
           }
       }

        @Override
        public void run() {

           try {
               if(key.isAcceptable())
                   handleAccept();
               if(key.isReadable())
                   handleRead();
           }catch (IOException e){
               e.printStackTrace();
           }

        }
    }

}
