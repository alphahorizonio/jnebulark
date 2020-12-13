package space.nebulark.jnebulark;

import org.teavm.flavour.routing.Routing;
import org.teavm.flavour.templates.BindTemplate;
@BindTemplate("templates/recentSparkDetails.html")
public class RecentSparkDetailsView {

    public void toDashboard() {
        Routing.open(IRoute.class).dashboard();
    }
}