package space.nebulark.jnebulark;

import org.teavm.flavour.routing.Routing;
import org.teavm.flavour.templates.BindTemplate;
@BindTemplate("templates/missionControl.html")
public class MissionControlView {

    public void toDashboard() {
        Routing.open(IRoute.class).dashboard();
    }
}