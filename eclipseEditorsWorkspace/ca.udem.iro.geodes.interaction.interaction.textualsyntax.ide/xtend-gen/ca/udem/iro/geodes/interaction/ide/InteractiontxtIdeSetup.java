/**
 * generated by Xtext 2.19.0
 */
package ca.udem.iro.geodes.interaction.ide;

import ca.udem.iro.geodes.interaction.InteractiontxtRuntimeModule;
import ca.udem.iro.geodes.interaction.InteractiontxtStandaloneSetup;
import ca.udem.iro.geodes.interaction.ide.InteractiontxtIdeModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class InteractiontxtIdeSetup extends InteractiontxtStandaloneSetup {
  @Override
  public Injector createInjector() {
    InteractiontxtRuntimeModule _interactiontxtRuntimeModule = new InteractiontxtRuntimeModule();
    InteractiontxtIdeModule _interactiontxtIdeModule = new InteractiontxtIdeModule();
    return Guice.createInjector(Modules2.mixin(_interactiontxtRuntimeModule, _interactiontxtIdeModule));
  }
}