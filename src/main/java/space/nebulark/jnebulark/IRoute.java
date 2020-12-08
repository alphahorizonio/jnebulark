package space.nebulark.jnebulark;

import org.teavm.flavour.routing.Path;
import org.teavm.flavour.routing.PathParameter;
import org.teavm.flavour.routing.PathSet;
import org.teavm.flavour.routing.Route;

@PathSet
public interface IRoute extends Route {
    @Path("/")
    void index();
    
    @Path("/missionControl/{nebulaId}")
    void missionControl(@PathParameter("nebulaId") String nebulaID);
}