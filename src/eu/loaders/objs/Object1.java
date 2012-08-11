/**
 * Created by Steam engine corp. in 07.08.2012 22:55:54
 *
 * @author Christopher Marlowe
 */


package eu.loaders.objs;

import ru.steamengine.rtti.basetypes.ClassPropertyRegistry;
import ru.steamengine.rtti.basetypes.ClassRegistryContext;
import ru.steamengine.rtti.defaultimplementors.DefaultRttiHelper;

public class Object1 {

    private long longData;

    public long getLongData() {
        return longData;
    }

    @ClassPropertyRegistry
    public static void reg(ClassRegistryContext<Object1> c) {
        c.regObjCreator(DefaultRttiHelper.getClassCreator(Object1.class, "o1"));
        c.regProp("longData  longData  longData");

    }

}
