package ca.udem.iro.geodes.interaction.generator;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class Helper {
    public static void saveResourceAsXml(Resource resource) {
        try {
            Map<String, String> saveOptions = new HashMap<String, String>();
            Resource xmlResource = new XMIResourceImpl(URI.createURI(resource.getURI().toString().replace("interactiontxt", "interactionxmi")));
            xmlResource.getContents().add(resource.getContents().get(0));
            saveOptions.put(org.eclipse.emf.ecore.xmi.XMIResource.OPTION_ENCODING,"UTF-8");
            xmlResource.save(saveOptions);
            System.out.println("XMI file created.");
        } catch (IOException e) {
            System.out.println("Error during creating XMI.");
        e.printStackTrace();
        }
    }
}
