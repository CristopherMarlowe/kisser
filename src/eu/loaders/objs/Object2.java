/**
 * Created by Steam engine corp. in 07.08.2012 22:56:00
 *
 * @author Christopher Marlowe
 */


package eu.loaders.objs;

import ru.steamengine.rtti.basetypes.ClassPropertyRegistry;
import ru.steamengine.rtti.basetypes.ClassRegistryContext;
import ru.steamengine.rtti.defaultimplementors.DefaultListedItem;
import ru.steamengine.rtti.defaultimplementors.DefaultRttiHelper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Object2 extends Ancestor  {

    private final List<Long> longs = new ArrayList<Long>() {
        {
            add(1001L);
            add(1001L);
            add(1001L);
            add(null);
            add(1001L);
        }};

    @ClassPropertyRegistry
    public static void reg(ClassRegistryContext<Object2> c) {
        c.regObjCreator(DefaultRttiHelper.getClassCreator(Object2.class, "o2"));
        c.regProp("list1", new DefaultListedItem<Object2, Long>() {
            @Override
            public Iterator<Long> getIterator(Object2 object2) {
                return object2.longs.iterator();
            }

            @Override
            public void clear(Object2 object2) {
                object2.longs.clear();
            }

            @Override
            public void setItemValue(
                    Object2 object2,
                    Long aLong,
                    int index) {
                object2.longs.add(aLong);
            }

            @Override
            public Class<Long> getItemClass() {
                return Long.class;
            }
        });
    }

}
