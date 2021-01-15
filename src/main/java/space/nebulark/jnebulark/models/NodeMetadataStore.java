package space.nebulark.jnebulark.models;

public class NodeMetadataStore {
    private int connectionStatus;
    private String nodeId;
    private String nodeConfig;

    public NodeMetadataStore(int connectionStatus, String nodeId, String nodeConfig) {
        this.connectionStatus = connectionStatus;
        this.nodeId = nodeId;
        this.nodeConfig = nodeConfig;
    }

    public int getConnectionStatus() {
        return this.connectionStatus;
    }

    public String getNodeID() {
        return this.nodeId;
    }

    public String getNodeConfig() {
        return this.nodeConfig;
    }
}
