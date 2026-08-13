package J6;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W6.C1767a f5728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6.c f5729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f5730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f5731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p237x7.a f5732e;

    public d(W6.C1767a c1767a, C6.c cVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(c1767a, "key");
        p247y7.AbstractC7350t.f(cVar, "client");
        p247y7.AbstractC7350t.f(obj, "pluginConfig");
        this.f5728a = c1767a;
        this.f5729b = cVar;
        this.f5730c = obj;
        this.f5731d = new java.util.ArrayList();
        this.f5732e = new p237x7.a() { // from class: J6.c
            @Override // p237x7.a
            public final java.lang.Object b() {
                return J6.d.g();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M g() {
        return p087i7.M.f46721a;
    }

    public final C6.c b() {
        return this.f5729b;
    }

    public final java.util.List c() {
        return this.f5731d;
    }

    public final p237x7.a d() {
        return this.f5732e;
    }

    public final java.lang.Object e() {
        return this.f5730c;
    }

    public final void f(J6.a aVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(aVar, "hook");
        this.f5731d.add(new J6.j(aVar, obj));
    }

    public final void h(p237x7.s sVar) {
        p247y7.AbstractC7350t.f(sVar, "block");
        f(J6.n.f5754a, sVar);
    }
}
