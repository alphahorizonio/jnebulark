package space.nebulark.jnebulark.handlers;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

@JSFunctor
public interface OnCreateResourceHandler extends JSObject {
    void onCreateResource(String nodeId, String resource);
}
