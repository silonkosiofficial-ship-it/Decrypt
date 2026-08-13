package p233x2;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final x2.d.b f56902g = new x2.d.b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f56904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.os.Bundle f56905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f56906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p233x2.b.C0752b f56907e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p140o.b f56903a = new p140o.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f56908f = true;

    public interface a {
        void a(p233x2.f fVar);
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public interface c {
        android.os.Bundle a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(p233x2.d dVar, androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
        boolean z6;
        p247y7.AbstractC7350t.f(dVar, "this$0");
        p247y7.AbstractC7350t.f(rVar, "<anonymous parameter 0>");
        p247y7.AbstractC7350t.f(aVar, "event");
        if (aVar == androidx.lifecycle.AbstractC2079k.a.ON_START) {
            z6 = true;
        } else if (aVar != androidx.lifecycle.AbstractC2079k.a.ON_STOP) {
            return;
        } else {
            z6 = false;
        }
        dVar.f56908f = z6;
    }

    public final android.os.Bundle b(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "key");
        if (!this.f56906d) {
            throw new java.lang.IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        android.os.Bundle bundle = this.f56905c;
        if (bundle == null) {
            return null;
        }
        android.os.Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        android.os.Bundle bundle3 = this.f56905c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        android.os.Bundle bundle4 = this.f56905c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f56905c = null;
        }
        return bundle2;
    }

    public final x2.d.c c(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "key");
        for (java.util.Map.Entry entry : this.f56903a) {
            p247y7.AbstractC7350t.e(entry, "components");
            java.lang.String str2 = (java.lang.String) entry.getKey();
            x2.d.c cVar = (x2.d.c) entry.getValue();
            if (p247y7.AbstractC7350t.b(str2, str)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(androidx.lifecycle.AbstractC2079k abstractC2079k) {
        p247y7.AbstractC7350t.f(abstractC2079k, "lifecycle");
        if (!(!this.f56904b)) {
            throw new java.lang.IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        abstractC2079k.a(new androidx.lifecycle.InterfaceC2083o() { // from class: x2.c
            @Override // androidx.lifecycle.InterfaceC2083o
            public final void i(androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
                p233x2.d.d(this.f56901C, rVar, aVar);
            }
        });
        this.f56904b = true;
    }

    public final void f(android.os.Bundle bundle) {
        if (!this.f56904b) {
            throw new java.lang.IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.f56906d)) {
            throw new java.lang.IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.f56905c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f56906d = true;
    }

    public final void g(android.os.Bundle bundle) {
        p247y7.AbstractC7350t.f(bundle, "outBundle");
        android.os.Bundle bundle2 = new android.os.Bundle();
        android.os.Bundle bundle3 = this.f56905c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        o.b.d dVarF = this.f56903a.f();
        p247y7.AbstractC7350t.e(dVarF, "this.components.iteratorWithAdditions()");
        while (dVarF.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) dVarF.next();
            bundle2.putBundle((java.lang.String) entry.getKey(), ((x2.d.c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public final void h(java.lang.String str, x2.d.c cVar) {
        p247y7.AbstractC7350t.f(str, "key");
        p247y7.AbstractC7350t.f(cVar, "provider");
        if (((x2.d.c) this.f56903a.o(str, cVar)) != null) {
            throw new java.lang.IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void i(java.lang.Class cls) {
        p247y7.AbstractC7350t.f(cls, "clazz");
        if (!this.f56908f) {
            throw new java.lang.IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        p233x2.b.C0752b c0752b = this.f56907e;
        if (c0752b == null) {
            c0752b = new p233x2.b.C0752b(this);
        }
        this.f56907e = c0752b;
        try {
            cls.getDeclaredConstructor(null);
            p233x2.b.C0752b c0752b2 = this.f56907e;
            if (c0752b2 != null) {
                java.lang.String name = cls.getName();
                p247y7.AbstractC7350t.e(name, "clazz.name");
                c0752b2.b(name);
            }
        } catch (java.lang.NoSuchMethodException e6) {
            throw new java.lang.IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e6);
        }
    }

    public final void j(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "key");
        this.f56903a.s(str);
    }
}
