package space.nebulark.jnebulark;

import java.util.function.Consumer;

import org.teavm.flavour.routing.Routing;
import org.teavm.flavour.templates.BindTemplate;

@BindTemplate("templates/index.html")
public class IndexView {

    private String nebulaID = "";

    public void next() {
        System.out.println("New Nebula");
        Routing.open(IRoute.class).missionControl();
    }

    public String getNebulaID() {
        System.out.println(nebulaID);
        return nebulaID;
    }

    public void setNebulaID(String nebulaID) {
        this.nebulaID = nebulaID;
    }

    public IRoute route(Consumer<String> consumer) {
        return Routing.build(IRoute.class, consumer);
    }
}
