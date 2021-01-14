package space.nebulark.jnebulark;

import org.teavm.flavour.routing.Routing;
import org.teavm.flavour.templates.BindTemplate;

@BindTemplate("templates/index.html")
public class IndexView {

    private String nebulaID = "";

    public String getNebulaID() {
        System.out.println(nebulaID);
        return nebulaID;
    }

    public void setNebulaID(String nebulaID) {
        this.nebulaID = nebulaID;
    }
}
