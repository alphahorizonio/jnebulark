package space.nebulark.jnebulark;

import org.teavm.flavour.routing.Routing;
import org.teavm.flavour.templates.BindTemplate;
import org.teavm.jso.browser.Window;
import org.teavm.jso.typedarrays.Uint8Array;

import space.nebulark.jnebulark.bindings.WebnetesNode;
import space.nebulark.jnebulark.data.DefaultFormValues;
import space.nebulark.jnebulark.models.ClusterResource;
import space.nebulark.jnebulark.stores.ClusterResourcesStore;

@BindTemplate("templates/webnetesConfig.html")
public class WebnetesConfigView {
    public boolean createVisible = true;
    public boolean fileVisible = true;
    public boolean inviteVisible = true;
    public boolean terminalVisible = true;

    public String config = DefaultFormValues.DEFAULT_NODE_CONFIG;

    public void setConfig(String newConfig) {
        this.config = newConfig;
    }

    public String getConfig() {
        return this.config;
    }

    public void openNode() {
        WebnetesNode.initialize((String nodeId, String definition) -> ClusterResourcesStore.getInstance()
                .addClusterResource(new ClusterResource(nodeId, definition)));

        WebnetesNode.open(this.config);
    }

    public void openInExplore() {
        // Node.open("ey");
    }

    public void deleteResourcesInExplore() {
        // Node.open("ey");
    }

    public void closeinExplore() {
        // Node.open("ey");
    }

    public void seedInExplore() {
        // Node.open("ey");
    }

    public void createResourceInExplore() {
        Window window = Window.current();
        String boy = window.getDocument().getElementById("create-box").getTitle();
        // Node.open(boy);
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

    public void toCluster() {
        Window window = Window.current();
        window.getLocation().replace("https://webnetesctl.vercel.app/");
    }

    public void toggleTerminalVisibility() {
        boolean otherVisible = !terminalVisible;
        this.terminalVisible = otherVisible;
    }

    public void setCreateModalVisible() {
        boolean otherVisible = !createVisible;
        this.createVisible = otherVisible;
    }

    public void setInviteModalVisible() {
        boolean otherVisible = !inviteVisible;
        this.inviteVisible = otherVisible;
    }

    public void setFileModalVisible() {
        boolean otherVisible = !fileVisible;
        this.fileVisible = otherVisible;
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