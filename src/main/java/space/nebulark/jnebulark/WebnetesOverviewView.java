package space.nebulark.jnebulark;

import org.teavm.flavour.routing.Routing;
import org.teavm.flavour.templates.BindTemplate;
import org.teavm.jso.typedarrays.Uint8Array;

@BindTemplate("templates/webnetesOverview.html")
public class WebnetesOverviewView {

    public void toWebnetesOverview() {
        Routing.open(IRoute.class).webnetesOverview();
    }

    public void toWebnetesExplore() {
        Routing.open(IRoute.class).webnetesExplore();
    }

    public void toWebnetesConfig() {
        Routing.open(IRoute.class).webnetesConfig();
    }

    public void printMe() {
        System.out.println("works");
    }

    public void close() {
        return;
    }

    public String createRessources(String ressources) {
        return ressources;
    }

    public void deleteRessources(String ressources) {
        return;
    }

    public String open(String ressources) {
        return ressources;
    }

    public String seedFile(String label, String name, String repository, Uint8Array fileInstance) {
        return "seededFile";
    }
}