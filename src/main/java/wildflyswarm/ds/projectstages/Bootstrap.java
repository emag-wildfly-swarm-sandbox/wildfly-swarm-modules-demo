package wildflyswarm.ds.projectstages;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.jaxrs.JAXRSArchive;

public class Bootstrap {

  public static void main(String[] args) throws Exception {
    Swarm swarm = new Swarm(args);

    JAXRSArchive archive = ShrinkWrap.create(JAXRSArchive.class);
    archive.addClass(MyController.class);

    swarm.start(archive);
  }

}
