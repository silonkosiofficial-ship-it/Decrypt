package p233x2;

/* JADX INFO: loaded from: classes.dex */
public final class b implements androidx.lifecycle.InterfaceC2083o {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final x2.b.a f56898D = new x2.b.a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p233x2.f f56899C;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX INFO: renamed from: x2.b$b, reason: collision with other inner class name */
    public static final class C0752b implements x2.d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.Set f56900a;

        public C0752b(p233x2.d dVar) {
            p247y7.AbstractC7350t.f(dVar, "registry");
            this.f56900a = new java.util.LinkedHashSet();
            dVar.h("androidx.savedstate.Restarter", this);
        }

        @Override // x2.d.c
        public android.os.Bundle a() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putStringArrayList("classes_to_restore", new java.util.ArrayList<>(this.f56900a));
            return bundle;
        }

        public final void b(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "className");
            this.f56900a.add(str);
        }
    }

    public b(p233x2.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "owner");
        this.f56899C = fVar;
    }

    private final void a(java.lang.String str) {
        try {
            java.lang.Class<? extends U> clsAsSubclass = java.lang.Class.forName(str, false, p233x2.b.class.getClassLoader()).asSubclass(x2.d.a.class);
            p247y7.AbstractC7350t.e(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                java.lang.reflect.Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
                    p247y7.AbstractC7350t.e(objNewInstance, "{\n                constr…wInstance()\n            }");
                    ((x2.d.a) objNewInstance).a(this.f56899C);
                } catch (java.lang.Exception e6) {
                    throw new java.lang.RuntimeException("Failed to instantiate " + str, e6);
                }
            } catch (java.lang.NoSuchMethodException e10) {
                throw new java.lang.IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        } catch (java.lang.ClassNotFoundException e11) {
            throw new java.lang.RuntimeException("Class " + str + " wasn't found", e11);
        }
    }

    @Override // androidx.lifecycle.InterfaceC2083o
    public void i(androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
        p247y7.AbstractC7350t.f(rVar, "source");
        p247y7.AbstractC7350t.f(aVar, "event");
        if (aVar != androidx.lifecycle.AbstractC2079k.a.ON_CREATE) {
            throw new java.lang.AssertionError("Next event must be ON_CREATE");
        }
        rVar.u().d(this);
        android.os.Bundle bundleB = this.f56899C.p().b("androidx.savedstate.Restarter");
        if (bundleB == null) {
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayList = bundleB.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new java.lang.IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        java.util.Iterator<java.lang.String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }
}
