public class Server implements ServerInterface {
    @Override
    public WebPage requestWebPage() {
        return new WebPage();
    }
}
