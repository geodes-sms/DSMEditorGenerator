/*
 * generated by Xtext 2.19.0
 */
package ca.udem.iro.geodes.interaction.ide

import ca.udem.iro.geodes.interaction.InteractiontxtRuntimeModule
import ca.udem.iro.geodes.interaction.InteractiontxtStandaloneSetup
import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class InteractiontxtIdeSetup extends InteractiontxtStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new InteractiontxtRuntimeModule, new InteractiontxtIdeModule))
	}
	
}
