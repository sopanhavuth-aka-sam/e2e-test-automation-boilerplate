
public class Given {

    @Given("^I open the (url|site) \"(.*)\"")
    public void i_open_the_url_site(String url) {
        openurl(url);
    }
}