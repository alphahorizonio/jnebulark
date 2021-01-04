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
    public void webnetesLanding() {
        setView(new WebnetesLandingView());
    }

    @Override
    public void webnetesDashboard() {
        setView(new WebnetesDashboardView());
    }

    @Override
    public void webnetes() {
        setView(new WebnetesView());
    }
}