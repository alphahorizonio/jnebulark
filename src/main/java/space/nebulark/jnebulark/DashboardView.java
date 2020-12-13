package space.nebulark.jnebulark;

import org.teavm.flavour.routing.Routing;
import org.teavm.flavour.templates.BindTemplate;

@BindTemplate("templates/dashboard.html")
public class DashboardView {
   public boolean visible = true;

   public void visible() {
       visible = false;
       System.out.println("Hallo");
   }

   public void invisible() {
       visible = true;
       System.out.println("invis");
   }

   public boolean getVisible() {
        System.out.println(visible);
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void toSparkDetails() {
        Routing.open(IRoute.class).sparkDetails();
    }

    public void toRecentSparkDetails() {
        System.out.println("Hello");
        Routing.open(IRoute.class).recentSparkDetails();
    }
}
