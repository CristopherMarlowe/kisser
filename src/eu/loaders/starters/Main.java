/**
 * Created by Steam engine corp. in 03.08.2012 1:41:15
 *
 * @author Christopher Marlowe
 */


package eu.loaders.starters;

import eu.loaders.objs.Root;
import ru.steamengine.rtti.basetypes.RegFactoryPlant;
import ru.steamengine.rtti.basetypes.RegistryObjects;
import ru.steamengine.rtti.defaultimplementors.utils.ShutDownNotification2;
import ru.steamengine.rttiutils.utils.DefaultRttiInfoRegistry;
import ru.steamengine.streaming.basetypes.ObjectReader;
import ru.steamengine.xmlstreaming.XMLObjectReader;
import ru.steamengine.xmlstreaming.XMLObjectWriter;

import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws InterruptedException {
    Thread.sleep(5000L);
        RegistryObjects objects = RegFactoryPlant.getFactory().newRegistryObjects();
        DefaultRttiInfoRegistry.register(objects.getRegistry(), ".clr");
        ObjectReader objectReader = new XMLObjectReader(objects.getRegistryUser());
        InputStream stream = Main.class.getResourceAsStream("/data/data.xml");
        Root root = objectReader.read(stream, null);
        new XMLObjectWriter(objects.getRegistryUser()).write(root, System.out);
        ShutDownNotification2.notifyshutdown(objects.getRegistryUser(), root);        

//        while (true) {
//            Thread.sleep(1000L);
//
//
//        }


    }
}
