package space.nebulark.jnebulark.stores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import space.nebulark.jnebulark.models.ClusterNode;

public final class ClusterNodesStore {
    private static ClusterNodesStore INSTANCE;

    private Collection<ClusterNode> resources = new ArrayList<ClusterNode>();

    private ClusterNodesStore() {
    }

    public static ClusterNodesStore getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ClusterNodesStore();
        }

        return INSTANCE;
    }

    public void addClusterResource(ClusterNode resource) {
        this.resources.add(resource);
    }

    public Collection<ClusterNode> getAll() {
        return Collections.unmodifiableCollection(resources);
    }
}
