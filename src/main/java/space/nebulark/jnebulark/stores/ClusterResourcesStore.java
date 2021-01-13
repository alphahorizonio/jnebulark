package space.nebulark.jnebulark.stores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import space.nebulark.jnebulark.models.ClusterResource;

public final class ClusterResourcesStore {
    private static ClusterResourcesStore INSTANCE;

    private Collection<ClusterResource> resources = new ArrayList<ClusterResource>();

    private ClusterResourcesStore() {
    }

    public static ClusterResourcesStore getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ClusterResourcesStore();
        }

        return INSTANCE;
    }

    public void addClusterResource(ClusterResource resource) {
        this.resources.add(resource);
    }

    public Collection<ClusterResource> getAll() {
        return Collections.unmodifiableCollection(resources);
    }
}
