package space.nebulark.jnebulark;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

@JSFunctor
public interface OnCreateResourceHandler extends JSObject {
    void onCreateResource();
}
