package space.nebulark.jnebulark;

import org.teavm.flavour.templates.BindTemplate;
import org.teavm.flavour.widgets.ApplicationTemplate;
import org.teavm.flavour.widgets.RouteBinder;

@BindTemplate("templates/master.html")
public class Client extends ApplicationTemplate implements IRoute {
    public static void main(String[] args) {
        Client client = new Client();
        new RouteBinder().withDefault(IRoute.class, r -> r.index()).add(client).update();

        client.bind("application-content");
    }

    @Override
    public void index() {
        setView(new IndexView());
    }

    @Override
    public void missionControl() {
        setView(new MissionControlView());
    }

    @Override
    public void dashboard() {
        setView(new DashboardView());
    }

    @Override
    public void sparkDetails() {
        setView(new SparkDetailsView());
    }

    @Override
    public void recentSparkDetails() {
        setView(new RecentSparkDetailsView());
    }

    @Override
    public void webnetesConfig() {
        setView(new WebnetesConfigView());
    }

    @Override
    public void webnetesOverview() {
        setView(new WebnetesOverviewView());
    }

    @Override
    public void webnetesExplore() {
        setView(new WebnetesExploreView());
    }
}