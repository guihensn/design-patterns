public class ProxyServer implements ServerInterface{
    private Server server;
    private WebPage webPage;

    public ProxyServer(Server server){
        this.server = server;
    }

    @Override
    public WebPage requestWebPage() {
        if(webPage == null ){
            System.out.println("Proxy server: Requesting the server to send me a new page.");
            this.webPage = server.requestWebPage();
        }
        System.out.println("Proxy server: Giving the webpage to the user.");
        return  this.webPage;
    }
}
