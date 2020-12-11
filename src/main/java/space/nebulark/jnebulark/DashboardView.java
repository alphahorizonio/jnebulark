package space.nebulark.jnebulark;

import org.teavm.flavour.templates.BindTemplate;

@BindTemplate("templates/dashboard.html")
public class DashboardView {
   public boolean visible = true;

   public void visible() {
       visible = !visible;
       System.out.println("Hallo");
   }

   public boolean getVisible() {
        System.out.println(visible);
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
