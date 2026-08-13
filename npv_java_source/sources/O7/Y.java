package O7;

/* JADX INFO: loaded from: classes2.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O7.InterfaceC1424e f8136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f8137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G8.g f8138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final E8.i f8139d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ F7.k[] f8135f = {p247y7.P.j(new p247y7.G(p247y7.P.b(O7.Y.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final O7.Y.a f8134e = new O7.Y.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final O7.Y a(O7.InterfaceC1424e interfaceC1424e, E8.n nVar, G8.g gVar, p237x7.l lVar) {
            p247y7.AbstractC7350t.f(interfaceC1424e, "classDescriptor");
            p247y7.AbstractC7350t.f(nVar, "storageManager");
            p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefinerForOwnerModule");
            p247y7.AbstractC7350t.f(lVar, "scopeFactory");
            return new O7.Y(interfaceC1424e, nVar, lVar, gVar, null);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ G8.g f8141E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(G8.g gVar) {
            super(0);
            this.f8141E = gVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p248y8.h b() {
            return (p248y8.h) O7.Y.this.f8137b.l(this.f8141E);
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {
        c() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p248y8.h b() {
            return (p248y8.h) O7.Y.this.f8137b.l(O7.Y.this.f8138c);
        }
    }

    private Y(O7.InterfaceC1424e interfaceC1424e, E8.n nVar, p237x7.l lVar, G8.g gVar) {
        this.f8136a = interfaceC1424e;
        this.f8137b = lVar;
        this.f8138c = gVar;
        this.f8139d = nVar.d(new O7.Y.c());
    }

    public /* synthetic */ Y(O7.InterfaceC1424e interfaceC1424e, E8.n nVar, p237x7.l lVar, G8.g gVar, p247y7.AbstractC7342k abstractC7342k) {
        this(interfaceC1424e, nVar, lVar, gVar);
    }

    private final p248y8.h d() {
        return (p248y8.h) E8.m.a(this.f8139d, this, f8135f[0]);
    }

    public final p248y8.h c(G8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        if (!gVar.d(p218v8.c.p(this.f8136a))) {
            return d();
        }
        F8.e0 e0VarP = this.f8136a.p();
        p247y7.AbstractC7350t.e(e0VarP, "getTypeConstructor(...)");
        return !gVar.e(e0VarP) ? d() : gVar.c(this.f8136a, new O7.Y.b(gVar));
    }
}
