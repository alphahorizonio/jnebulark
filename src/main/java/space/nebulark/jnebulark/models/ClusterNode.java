package space.nebulark.jnebulark.models;

public class ClusterNode {
    private String nodeId;
    private String nodeConfig;

    public ClusterNode(String nodeId, String nodeConfig) {
        this.nodeId = nodeId;
        this.nodeConfig = nodeConfig;
    }

    public String getNodeID() {
        return this.nodeId;
    }

    public String getNodeConfig() {
        return this.nodeConfig;
    }
}
