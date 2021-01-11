package space.nebulark.jnebulark;

import org.teavm.flavour.routing.Routing;
import org.teavm.jso.browser.Window;
import org.teavm.flavour.templates.BindTemplate;

@BindTemplate("templates/webnetesExplore.html")
public class WebnetesExploreView {
    public boolean createVisible = true;
    public boolean fileVisible = true;
    public boolean inviteVisible = true;

    public void setCreateModalVisible() {
        boolean otherVisible = !createVisible;
        this.createVisible = otherVisible;
    }

    public void setInviteModalVisible() {
        boolean otherVisible = !inviteVisible;
        this.inviteVisible = otherVisible;
    }

    public void toCluster() {
        Window window = Window.current();
        window.getLocation().replace("https://webnetesctl.vercel.app/");
    }

    public void setFileModalVisible() {
        boolean otherVisible = !fileVisible;
        this.fileVisible = otherVisible;
    }

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