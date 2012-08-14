/**
 * Created by Steam engine corp. in 07.08.2012 22:55:54
 *
 * @author Christopher Marlowe
 */


package eu.loaders.objs;

import ru.steamengine.rtti.basetypes.ClassPropertyRegistry;
import ru.steamengine.rtti.basetypes.ClassRegistryContext;
import ru.steamengine.rtti.defaultimplementors.DefaultRttiHelper;

public class Object1 extends Ancestor {

    private long longData;

    private boolean loaded = false;
    private boolean read = false;

    public long getLongData() {
        return longData;
    }

    @Override
    protected void loaded() {
        loaded = true;
    }

    @Override
    protected void read() {
        read = true;
    }

    public boolean isLoaded() {
        return loaded;
    }

    public boolean isRead() {
        return read;
    }

    @ClassPropertyRegistry
    public static void reg(ClassRegistryContext<Object1> c) {
        c.regObjCreator(DefaultRttiHelper.getClassCreator(Object1.class, "o1"));
        c.regProp("longData  longData  longData");

    }

}
