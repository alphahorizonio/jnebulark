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

    public String label = "";
    public String name = "";
    public String repository = "";
    public String fileInstance = "";

    public void setLabel(String newLabel) {
        this.label = newLabel;
    }

    public String getLabel() {
        return this.label;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setRepository(String newRepository) {
        this.repository = newRepository;
    }

    public String getRepository() {
        return this.repository;
    }

    public void setFileinstance(String newFileinstance) {
        this.fileInstance = newFileinstance;
    }

    public String getFileInstance() {
        return this.fileInstance;
    }

    public void setConfig(String newConfig) {
        this.config = newConfig;
    }

    public String getConfig() {
        return this.config;
    }

    public void closeAndOpenNode() {
        closeNode();
        openNode();
    }

    public void openNode() {
        WebnetesNode.initialize((String nodeId, String definition) -> ClusterResourcesStore.getInstance()
                .addClusterResource(new ClusterResource(nodeId, definition)));
        WebnetesNode.open(this.config);
    }

    public void closeNode() {
        WebnetesNode.close();
    }

    public void createResourceInExplore() {
        Window window = Window.current();
        String boy = window.getDocument().getElementById("create-box").getTitle();
        // Node.open(boy);
    }

    public void deleteResourceInExplore() {
        Window window = Window.current();
        String boy = window.getDocument().getElementById("create-box").getTitle();
    }

    public void seedFileInExplore(String label, String name, String repository, String fileInstance) {
        WebnetesNode.seedFile(label, name, repository, fileInstance);
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
}