package space.nebulark.jnebulark;

import org.teavm.flavour.templates.BindTemplate;
import org.teavm.flavour.widgets.ApplicationTemplate;

@BindTemplate("templates/landingPage.html")
public class LandingPage extends ApplicationTemplate {
    private String userName = "";

    public static void main(String[] args) {
       LandingPage landingPage = new LandingPage();
       landingPage.bind("application-content");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
