package C6;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1368g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f1362a = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f1363b = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f1364c = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p237x7.l f1365d = new p237x7.l() { // from class: C6.e
        @Override // p237x7.l
        public final java.lang.Object l(java.lang.Object obj) {
            return C6.j.i((F6.j) obj);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1366e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1367f = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1369h = W6.w.f15387a.b();

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M h(p237x7.l lVar, p237x7.l lVar2, F6.j jVar) {
        p247y7.AbstractC7350t.f(jVar, "<this>");
        lVar.l(jVar);
        lVar2.l(jVar);
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M i(F6.j jVar) {
        p247y7.AbstractC7350t.f(jVar, "<this>");
        return p087i7.M.f46721a;
    }

    public static /* synthetic */ void q(C6.j jVar, I6.r rVar, p237x7.l lVar, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            lVar = new p237x7.l() { // from class: C6.f
                @Override // p237x7.l
                public final java.lang.Object l(java.lang.Object obj2) {
                    return C6.j.r(obj2);
                }
            };
        }
        jVar.o(rVar, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M r(java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "<this>");
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M s(p237x7.l lVar, p237x7.l lVar2, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "<this>");
        if (lVar != null) {
            lVar.l(obj);
        }
        lVar2.l(obj);
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M t(I6.r rVar, C6.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "scope");
        W6.InterfaceC1768b interfaceC1768b = (W6.InterfaceC1768b) cVar.x0().g(I6.AbstractC1262s.a(), new p237x7.a() { // from class: C6.i
            @Override // p237x7.a
            public final java.lang.Object b() {
                return C6.j.u();
            }
        });
        java.lang.Object obj = cVar.o().f1363b.get(rVar.getKey());
        p247y7.AbstractC7350t.c(obj);
        java.lang.Object objA = rVar.a((p237x7.l) obj);
        rVar.b(objA, cVar);
        interfaceC1768b.f(rVar.getKey(), objA);
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W6.InterfaceC1768b u() {
        return W6.AbstractC1770d.a(true);
    }

    public final void g(final p237x7.l lVar) {
        p247y7.AbstractC7350t.f(lVar, "block");
        final p237x7.l lVar2 = this.f1365d;
        this.f1365d = new p237x7.l() { // from class: C6.d
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return C6.j.h(lVar2, lVar, (F6.j) obj);
            }
        };
    }

    public final p237x7.l j() {
        return this.f1365d;
    }

    public final boolean k() {
        return this.f1368g;
    }

    public final boolean l() {
        return this.f1366e;
    }

    public final boolean m() {
        return this.f1367f;
    }

    public final void n(C6.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "client");
        java.util.Iterator it = this.f1362a.values().iterator();
        while (it.hasNext()) {
            ((p237x7.l) it.next()).l(cVar);
        }
        java.util.Iterator it2 = this.f1364c.values().iterator();
        while (it2.hasNext()) {
            ((p237x7.l) it2.next()).l(cVar);
        }
    }

    public final void o(final I6.r rVar, final p237x7.l lVar) {
        p247y7.AbstractC7350t.f(rVar, "plugin");
        p247y7.AbstractC7350t.f(lVar, "configure");
        final p237x7.l lVar2 = (p237x7.l) this.f1363b.get(rVar.getKey());
        this.f1363b.put(rVar.getKey(), new p237x7.l() { // from class: C6.g
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return C6.j.s(lVar2, lVar, obj);
            }
        });
        if (this.f1362a.containsKey(rVar.getKey())) {
            return;
        }
        this.f1362a.put(rVar.getKey(), new p237x7.l() { // from class: C6.h
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return C6.j.t(rVar, (C6.c) obj);
            }
        });
    }

    public final void p(java.lang.String str, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(str, "key");
        p247y7.AbstractC7350t.f(lVar, "block");
        this.f1364c.put(str, lVar);
    }

    public final void v(C6.j jVar) {
        p247y7.AbstractC7350t.f(jVar, "other");
        this.f1366e = jVar.f1366e;
        this.f1367f = jVar.f1367f;
        this.f1368g = jVar.f1368g;
        this.f1362a.putAll(jVar.f1362a);
        this.f1363b.putAll(jVar.f1363b);
        this.f1364c.putAll(jVar.f1364c);
    }
}
