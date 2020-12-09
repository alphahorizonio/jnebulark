package space.nebulark.jnebulark;

import org.teavm.flavour.templates.BindTemplate;

@BindTemplate("templates/index.html")
public class IndexView {

    private String nebulaID = "";

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
