package space.nebulark.jnebulark;

import org.apache.http.impl.conn.SystemDefaultRoutePlanner;
import org.teavm.flavour.templates.BindTemplate;
import org.teavm.flavour.widgets.ApplicationTemplate;

@BindTemplate("templates/missionControl.html")
public class MissionControlView {
    private String nebulaId;

    public MissionControlView(String nebulaId) {
        this.nebulaId = nebulaId;
    }


}