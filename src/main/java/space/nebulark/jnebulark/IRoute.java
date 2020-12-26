package space.nebulark.jnebulark;

import org.teavm.flavour.routing.Path;
import org.teavm.flavour.routing.PathSet;
import org.teavm.flavour.routing.Route;

@PathSet
public interface IRoute extends Route {
    @Path("/")
    void index();

    @Path("/missionControl")
    void missionControl();

    @Path("/dashboard")
    void dashboard();

    @Path("/sparkDetails")
    void sparkDetails();

    @Path("/recentSparkDetails")
    void recentSparkDetails();

    @Path("/webnetesLanding")
    void webnetesLanding();

    @Path("/webnetesDashboard")
    void webnetesDashboard();
}