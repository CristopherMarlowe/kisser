/**
 * Created by Steam engine corp. in 03.08.2012 21:48:16
 *
 * @author Christopher Marlowe
 */


package eu.loaders.objs;

import ru.steamengine.rtti.basetypes.*;
import ru.steamengine.rtti.defaultimplementors.DefaultRttiHelper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Root {

    private final List<Object> objects = new ArrayList<Object>();
    private boolean loaded = false;
    private String s1;

    private Object1 object1;
    private Object2 object2;
    private Object3 object3;
    private String name;


    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public Object1 getObject1() {
        return object1;
    }

    public void setObject1(Object1 object1) {
        this.object1 = object1;
    }

    public Object2 getObject2() {
        return object2;
    }

    public void setObject2(Object2 object2) {
        this.object2 = object2;
    }

    public Object3 getObject3() {
        return object3;
    }

    public void setObject3(Object3 object3) {
        this.object3 = object3;
    }

    public boolean isLoaded() {
        return loaded;
    }

    @ClassPropertyRegistry
    public static void reg(ClassRegistryContext<Root> c) {
        c.regObjCreator(DefaultRttiHelper.getClassCreator(Root.class, "root"));
        c.regNameProcessor(new ObjectNameProcessor<Root>() {
            public String getName(Root root) {
                return root.name;
            }

            public void setName(Root root, String name) {
                root.name = name;
            }
        });
        c.regObjProcessor(new ObjectProcessor<Root>() {
            public Iterator<Object> getIterator(Root root) {
                return root.objects.iterator();
            }

            public boolean setChild(
                    Object object,
                    Root root,
                    int position) {
                root.objects.add(object);
                return true;
            }
        });
        c.regLoadNotfier(new LoadNotifier<Root>() {
            public void objectLoaded(Root object) {
                object.loaded = true;
            }
        });
        c.regShutDownNotifier(new ShutDownNotifier<Root>() {
            public void shuttingDown(Root object) {
            }
        });
        c.regProp(DefaultRttiHelper.classProps(Root.class));


    }
}
