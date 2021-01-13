package space.nebulark.jnebulark.bindings;

import org.teavm.jso.JSBody;

import space.nebulark.jnebulark.handlers.OnCreateResourceHandler;

public class WebnetesNode {
    private static OnCreateResourceHandler onCreateResource;

    public static void initialize(OnCreateResourceHandler onCreateResource) {
        WebnetesNode.onCreateResource = onCreateResource;
    }

    public static void open(String resources) {
        WebnetesNode._open(resources, WebnetesNode.onCreateResource);
    }

    public static void createResources(String resources, String nodeId) {
        WebnetesNode._createResources(resources, nodeId);
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
    public static native void _open(String configYaml, OnCreateResourceHandler onCreateResource);

    @JSBody(params = { "resources",
            "nodeId" }, script = "window.webnetesNode && window.webnetesNode.createResources(resources, nodeId)")
    public static native void _createResources(String resources, String nodeId);
}
