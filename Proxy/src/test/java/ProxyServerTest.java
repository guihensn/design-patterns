public class ProxyServerTest {
    public static void main(String args[]){
        Server server = new Server();
        ProxyServer proxyServer = new ProxyServer(server);

        proxyServer.requestWebPage();
        proxyServer.requestWebPage();
        proxyServer.requestWebPage();


    }
}
