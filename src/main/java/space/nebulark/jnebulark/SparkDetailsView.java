package space.nebulark.jnebulark;

import org.teavm.flavour.routing.Routing;
import org.teavm.flavour.templates.BindTemplate;
@BindTemplate("templates/sparkDetails.html")
public class SparkDetailsView {

    public void toDashboard() {
        Routing.open(IRoute.class).dashboard();
    }
}