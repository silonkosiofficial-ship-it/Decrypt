package p046e5;

/* JADX INFO: loaded from: classes3.dex */
final class G implements p046e5.InterfaceC6532e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Set f44681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Set f44682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Set f44683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Set f44684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.Set f44685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.Set f44686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p046e5.InterfaceC6532e f44687g;

    private static class a implements D5.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.Set f44688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final D5.c f44689b;

        public a(java.util.Set set, D5.c cVar) {
            this.f44688a = set;
            this.f44689b = cVar;
        }
    }

    G(p046e5.C6530c c6530c, p046e5.InterfaceC6532e interfaceC6532e) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.HashSet hashSet3 = new java.util.HashSet();
        java.util.HashSet hashSet4 = new java.util.HashSet();
        java.util.HashSet hashSet5 = new java.util.HashSet();
        for (p046e5.r rVar : c6530c.g()) {
            if (rVar.e()) {
                boolean zG = rVar.g();
                p046e5.F fC = rVar.c();
                if (zG) {
                    hashSet4.add(fC);
                } else {
                    hashSet.add(fC);
                }
            } else if (rVar.d()) {
                hashSet3.add(rVar.c());
            } else {
                boolean zG2 = rVar.g();
                p046e5.F fC2 = rVar.c();
                if (zG2) {
                    hashSet5.add(fC2);
                } else {
                    hashSet2.add(fC2);
                }
            }
        }
        if (!c6530c.k().isEmpty()) {
            hashSet.add(p046e5.F.b(D5.c.class));
        }
        this.f44681a = j$.util.DesugarCollections.unmodifiableSet(hashSet);
        this.f44682b = j$.util.DesugarCollections.unmodifiableSet(hashSet2);
        this.f44683c = j$.util.DesugarCollections.unmodifiableSet(hashSet3);
        this.f44684d = j$.util.DesugarCollections.unmodifiableSet(hashSet4);
        this.f44685e = j$.util.DesugarCollections.unmodifiableSet(hashSet5);
        this.f44686f = c6530c.k();
        this.f44687g = interfaceC6532e;
    }

    @Override // p046e5.InterfaceC6532e
    public java.lang.Object a(java.lang.Class cls) {
        if (!this.f44681a.contains(p046e5.F.b(cls))) {
            throw new p046e5.t(java.lang.String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        java.lang.Object objA = this.f44687g.a(cls);
        return !cls.equals(D5.c.class) ? objA : new e5.G.a(this.f44686f, (D5.c) objA);
    }

    @Override // p046e5.InterfaceC6532e
    public F5.b b(p046e5.F f6) {
        if (this.f44685e.contains(f6)) {
            return this.f44687g.b(f6);
        }
        throw new p046e5.t(java.lang.String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", f6));
    }

    @Override // p046e5.InterfaceC6532e
    public java.lang.Object c(p046e5.F f6) {
        if (this.f44681a.contains(f6)) {
            return this.f44687g.c(f6);
        }
        throw new p046e5.t(java.lang.String.format("Attempting to request an undeclared dependency %s.", f6));
    }

    @Override // p046e5.InterfaceC6532e
    public F5.b d(java.lang.Class cls) {
        return f(p046e5.F.b(cls));
    }

    @Override // p046e5.InterfaceC6532e
    public F5.a e(p046e5.F f6) {
        if (this.f44683c.contains(f6)) {
            return this.f44687g.e(f6);
        }
        throw new p046e5.t(java.lang.String.format("Attempting to request an undeclared dependency Deferred<%s>.", f6));
    }

    @Override // p046e5.InterfaceC6532e
    public F5.b f(p046e5.F f6) {
        if (this.f44682b.contains(f6)) {
            return this.f44687g.f(f6);
        }
        throw new p046e5.t(java.lang.String.format("Attempting to request an undeclared dependency Provider<%s>.", f6));
    }

    @Override // p046e5.InterfaceC6532e
    public /* synthetic */ java.util.Set g(java.lang.Class cls) {
        return p046e5.AbstractC6531d.f(this, cls);
    }

    @Override // p046e5.InterfaceC6532e
    public java.util.Set h(p046e5.F f6) {
        if (this.f44684d.contains(f6)) {
            return this.f44687g.h(f6);
        }
        throw new p046e5.t(java.lang.String.format("Attempting to request an undeclared dependency Set<%s>.", f6));
    }

    @Override // p046e5.InterfaceC6532e
    public F5.a i(java.lang.Class cls) {
        return e(p046e5.F.b(cls));
    }
}
