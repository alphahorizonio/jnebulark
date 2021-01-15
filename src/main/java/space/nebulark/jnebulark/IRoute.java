package space.nebulark.jnebulark;

import org.teavm.flavour.routing.Path;
import org.teavm.flavour.routing.PathSet;
import org.teavm.flavour.routing.Route;

@PathSet
public interface IRoute extends Route {
    @Path("/")
    void index();

    @Path("/webnetesConfig")
    void webnetesConfig();

    @Path("/webnetesOverview")
    void webnetesOverview();

    @Path("/webnetesExplore")
    void webnetesExplore();
}