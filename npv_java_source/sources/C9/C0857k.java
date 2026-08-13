package C9;

/* JADX INFO: renamed from: C9.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0857k extends androidx.lifecycle.T implements C9.Q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C9.C0857k.b f1484c = new C9.C0857k.b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f1485d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final androidx.lifecycle.V.c f1486e = new C9.C0857k.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f1487b = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: C9.k$a */
    public static final class a implements androidx.lifecycle.V.c {
        a() {
        }

        @Override // androidx.lifecycle.V.c
        public /* synthetic */ androidx.lifecycle.T a(java.lang.Class cls) {
            return androidx.lifecycle.W.b(this, cls);
        }

        @Override // androidx.lifecycle.V.c
        public androidx.lifecycle.T b(F7.c cVar, p023c2.a aVar) {
            p247y7.AbstractC7350t.f(cVar, "modelClass");
            p247y7.AbstractC7350t.f(aVar, "extras");
            return new C9.C0857k();
        }

        @Override // androidx.lifecycle.V.c
        public /* synthetic */ androidx.lifecycle.T c(java.lang.Class cls, p023c2.a aVar) {
            return androidx.lifecycle.W.c(this, cls, aVar);
        }
    }

    /* JADX INFO: renamed from: C9.k$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final C9.C0857k a(androidx.lifecycle.X x6) {
            p247y7.AbstractC7350t.f(x6, "viewModelStore");
            return (C9.C0857k) androidx.lifecycle.V.b.c(androidx.lifecycle.V.f22790b, x6, C9.C0857k.f1486e, null, 4, null).a(p247y7.P.b(C9.C0857k.class));
        }
    }

    @Override // C9.Q
    public void a(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "backStackEntryId");
        androidx.lifecycle.X x6 = (androidx.lifecycle.X) this.f1487b.remove(str);
        if (x6 != null) {
            x6.a();
        }
    }

    @Override // C9.Q
    public androidx.lifecycle.X b(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "backStackEntryId");
        androidx.lifecycle.X x6 = (androidx.lifecycle.X) this.f1487b.get(str);
        if (x6 != null) {
            return x6;
        }
        androidx.lifecycle.X x10 = new androidx.lifecycle.X();
        this.f1487b.put(str, x10);
        return x10;
    }

    @Override // androidx.lifecycle.T
    protected void g() {
        java.util.Iterator it = this.f1487b.values().iterator();
        while (it.hasNext()) {
            ((androidx.lifecycle.X) it.next()).a();
        }
        this.f1487b.clear();
    }
}
