package net.xolt.addons.boatphase;

import net.xolt.addons.boatphase.modules.BoatGlitch;
import net.xolt.addons.boatphase.modules.BoatPhase;
import minegame159.meteorclient.MeteorAddon;
import minegame159.meteorclient.systems.modules.Modules;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BoatPhaseAddon extends MeteorAddon {

	public static final Logger LOG = LogManager.getLogger();

	@Override
	public void onInitialize() {
		LOG.info("Initializing Boat Phase Addon");
		Modules.get().add(new BoatPhase());
		Modules.get().add(new BoatGlitch());
	}

}