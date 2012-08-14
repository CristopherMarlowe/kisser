/**
 * Created by Steam engine corp. in 07.08.2012 22:56:00
 *
 * @author Christopher Marlowe
 */


package eu.loaders.objs;

import ru.steamengine.rtti.basetypes.ClassPropertyRegistry;
import ru.steamengine.rtti.basetypes.ClassRegistryContext;
import ru.steamengine.rtti.basetypes.ObjectNameProcessor;
import ru.steamengine.rtti.basetypes.ReadNotifier;
import ru.steamengine.rtti.defaultimplementors.DefaultRttiHelper;

public class Object3  extends Ancestor {

    private String name;



    @ClassPropertyRegistry
    public static void reg(ClassRegistryContext<Object3> c) {
        c.regObjCreator(DefaultRttiHelper.getClassCreator(Object3.class, "o3"));
        c.regReadNotfier(new ReadNotifier<Object3>() {
            public void onObjectRead(Object3 object, ReadMode readMode) {
            }
        });
    }


}