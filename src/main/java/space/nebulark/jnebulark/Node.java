package space.nebulark.jnebulark;

import java.util.ArrayList;
import java.util.List;

import org.teavm.jso.JSBody;

import space.nebulark.jnebulark.models.ClusterResource;

public class Node {
    public static List<ClusterResource> resources = new ArrayList<ClusterResource>();

    public static void close() {
        System.out.println("closed node");
    }

    public static void createResource(String message) {
        System.out.println("created ressource");
    }

    public static void deleteResources(String message) {
        System.out.println("deleted ressource");
    }

    public static void open(String configYaml) {
        Node.openNode(configYaml, (nodeId, resource) -> Node.resources.add(new ClusterResource(nodeId, resource)));
    }

    @JSBody(params = { "configYaml", "onCreateResource" }, script = "window.webnetesNode = new WebnetesNode("
            + "        async (nodeId, resource) => {" + "onCreateResource(nodeId, JSON.stringify(resource))"
            + "        }," + "        async (nodeId, resource) => {"
            + "          console.log(\"Deleted resource\", nodeId, resource);"
            + "          if (resource.kind === EResourceKind.WORKLOAD)" + "            window.location.reload();"
            + "        }," + "        async (frame) => {" + "          console.log(\"Rejected resource\", frame);"
            + "        }," + "        async (id) => {" + "          console.log(\"Management node acknowledged\", id);"
            + "        }," + "        async (id) => {" + "          console.log(\"Management node joined\", id);"
            + "        }," + "        async (id) => {" + "          console.log(\"Management node left\", id);"
            + "        }," + "        async (metadata, spec, id) => {"
            + "          console.log(\"Resource node acknowledged\", metadata, spec, id);" + "        },"
            + "        async (metadata, spec, id) => {"
            + "          console.log(\"Resource node joined\", metadata, spec, id);" + "        },"
            + "        async (metadata, spec, id) => {"
            + "          console.log(\"Resource node left\", metadata, spec, id);" + "        },"
            + "        async (onStdin, id) => {" + "          console.log(\"Creating terminal\", id);" + "        },"
            + "        async (id, msg) => {" + "          console.log(\"Writing to terminal\", id, msg);" + "        },"
            + "        async (id) => {" + "          console.log(\"Deleting terminal\", id);" + "        },"
            + "        (id) => {" + "          const rawInput = prompt(`Please enter standard input for ${id}\\n`);"
            + "          if (rawInput) return new TextEncoder().encode(rawInput);" + "          return null;"
            + "        }" + "      );" + "window.webnetesNode.open(configYaml)")
    public static native void openNode(String configYaml, OnCreateResourceHandler onCreateResource);

    public static void seedFile(String message) {
        System.out.println("seeded File");
    }
}
