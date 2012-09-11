package eu.loaders.objs;

import ru.steamengine.rtti.basetypes.*;

public class Ancestor {

    private String name;

    public String getName() {
        return name;
    }

    protected void loaded() {

    }

    protected void read() {

    }

    @ClassPropertyRegistry
    public static void reg(ClassRegistryContext<Ancestor> c) {
        c.regNameProcessor(new ObjectNameProcessor<Ancestor>() {
            public String getName(Ancestor ancestor) {
                return ancestor.name;
            }

            public void setName(Ancestor ancestor, String name) {
                ancestor.name = name;
            }
        });

        c.regReadNotfier(new ReadNotifier<Ancestor>() {
            public void onObjectRead(Ancestor object, ReadMode readMode) {
                object.read();
            }
        });


        c.regLoadNotfier(new LoadNotifier<Ancestor>() {
            public void objectLoaded(Ancestor object) {
                object.loaded();
            }
        });

    }
}
