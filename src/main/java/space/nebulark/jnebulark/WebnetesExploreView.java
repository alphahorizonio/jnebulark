package space.nebulark.jnebulark;

import org.teavm.flavour.routing.Routing;
import org.teavm.flavour.templates.BindTemplate;

@BindTemplate("templates/webnetesExplore.html")
public class WebnetesExploreView {

    public void toWebnetesOverview() {
        Routing.open(IRoute.class).webnetesOverview();
    }

    public void toWebnetesExplore() {
        Routing.open(IRoute.class).webnetesExplore();
    }

    public void toWebnetesConfig() {
        Routing.open(IRoute.class).webnetesConfig();
    }

}