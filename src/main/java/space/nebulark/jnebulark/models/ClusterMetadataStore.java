package space.nebulark.jnebulark.models;

public class ClusterMetadataStore {
    private int nodeCount;
    private int resourceCount;
    private String clusterId;

    public ClusterMetadataStore(String clusterId, int resourceCount, int nodeCount) {
        this.clusterId = clusterId;
        this.resourceCount = resourceCount;
        this.nodeCount = nodeCount;
    }

    public int getNodeCount() {
        return this.nodeCount;
    }

    public int getResourceCount() {
        return this.resourceCount;
    }

    public String clusterId() {
        return this.clusterId;
    }
}
