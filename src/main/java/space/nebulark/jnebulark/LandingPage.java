package space.nebulark.jnebulark;

import org.teavm.flavour.templates.BindTemplate;
import org.teavm.flavour.widgets.ApplicationTemplate;

@BindTemplate("templates/landingPage.html")
public class LandingPage extends ApplicationTemplate {

    private String nebulaID = "";

    public static void main(String[] args) {
       LandingPage landingPage = new LandingPage();
       landingPage.bind("application-content");
    }

    public void next() {
        System.out.println("New Nebula");
    }

    public String getNebulaID() {
        System.out.println(nebulaID);
        return nebulaID;
    }

    public void setNebulaID(String nebulaID) {
        this.nebulaID = nebulaID;
    }
}
