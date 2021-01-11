package space.nebulark.jnebulark;

import javax.swing.text.Document;

import com.google.inject.spi.Element;

import org.teavm.flavour.routing.Routing;
import org.teavm.flavour.templates.BindTemplate;
import org.teavm.jso.browser.Window;
import org.teavm.jso.dom.html.HTMLElement;
import org.teavm.jso.typedarrays.Uint8Array;

@BindTemplate("templates/webnetesOverview.html")
public class WebnetesOverviewView {
    public boolean visible = true;
    public boolean createVisible = true;

    public void toWebnetesOverview() {
        Routing.open(IRoute.class).webnetesOverview();
    }

    public void toWebnetesExplore() {
        Routing.open(IRoute.class).webnetesExplore();
    }

    public void toWebnetesConfig() {
        Routing.open(IRoute.class).webnetesConfig();
    }

    public void toCluster() {
        Window window = Window.current();
        window.getLocation().replace("https://webnetesctl.vercel.app/");
    }

    public void setHamburgerVisible() {
        boolean otherVisible = !visible;
        this.visible = otherVisible;
    }

    public void setCreateModalVisible() {
        boolean otherVisible = !createVisible;
        this.createVisible = otherVisible;
    }

    public void printMe(String message) {
        System.out.println(message);
    }

    public void close() {
        return;
    }

    public String createRessources(String ressources) {
        return ressources;
    }

    public void deleteRessources(String ressources) {
        return;
    }

    public String open(String ressources) {
        return ressources;
    }

    public String seedFile(String label, String name, String repository, Uint8Array fileInstance) {
        return "seededFile";
    }
}