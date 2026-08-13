package D;

/* JADX INFO: renamed from: D.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0880q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p041e0.d f1693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.a f1694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f1695c = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: D.q$a */
    private final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Object f1696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.Object f1697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f1698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private p237x7.p f1699d;

        /* JADX INFO: renamed from: D.q$a$a, reason: collision with other inner class name */
        static final class C0035a extends p247y7.AbstractC7352v implements p237x7.p {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ D.C0880q f1701D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ D.C0880q.a f1702E;

            /* JADX INFO: renamed from: D.q$a$a$a, reason: collision with other inner class name */
            static final class C0036a extends p247y7.AbstractC7352v implements p237x7.l {

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                final /* synthetic */ D.C0880q.a f1703D;

                /* JADX INFO: renamed from: D.q$a$a$a$a, reason: collision with other inner class name */
                public static final class C0037a implements V.M {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ D.C0880q.a f1704a;

                    public C0037a(D.C0880q.a aVar) {
                        this.f1704a = aVar;
                    }

                    @Override // V.M
                    public void e() {
                        this.f1704a.f1699d = null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0036a(D.C0880q.a aVar) {
                    super(1);
                    this.f1703D = aVar;
                }

                @Override // p237x7.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final V.M l(V.N n6) {
                    return new D.C0880q.a.C0035a.C0036a.C0037a(this.f1703D);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0035a(D.C0880q c0880q, D.C0880q.a aVar) {
                super(2);
                this.f1701D = c0880q;
                this.f1702E = aVar;
            }

            public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
                if ((i6 & 3) == 2 && interfaceC1734n.u()) {
                    interfaceC1734n.A();
                    return;
                }
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.Q(1403994769, i6, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:91)");
                }
                D.InterfaceC0881s interfaceC0881s = (D.InterfaceC0881s) this.f1701D.d().b();
                int iF = this.f1702E.f();
                if ((iF >= interfaceC0881s.a() || !p247y7.AbstractC7350t.b(interfaceC0881s.b(iF), this.f1702E.g())) && (iF = interfaceC0881s.d(this.f1702E.g())) != -1) {
                    this.f1702E.f1698c = iF;
                }
                int i10 = iF;
                if (i10 != -1) {
                    interfaceC1734n.T(-660479623);
                    D.r.a(interfaceC0881s, D.S.a(this.f1701D.f1693a), i10, D.S.a(this.f1702E.g()), interfaceC1734n, 0);
                } else {
                    interfaceC1734n.T(-660272047);
                }
                interfaceC1734n.J();
                java.lang.Object objG = this.f1702E.g();
                boolean zL = interfaceC1734n.l(this.f1702E);
                D.C0880q.a aVar = this.f1702E;
                java.lang.Object objG2 = interfaceC1734n.g();
                if (zL || objG2 == V.InterfaceC1734n.f14931a.a()) {
                    objG2 = new D.C0880q.a.C0035a.C0036a(aVar);
                    interfaceC1734n.K(objG2);
                }
                V.Q.b(objG, (p237x7.l) objG2, interfaceC1734n, 0);
                if (V.AbstractC1741q.H()) {
                    V.AbstractC1741q.P();
                }
            }

            @Override // p237x7.p
            public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
                a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
                return p087i7.M.f46721a;
            }
        }

        public a(int i6, java.lang.Object obj, java.lang.Object obj2) {
            this.f1696a = obj;
            this.f1697b = obj2;
            this.f1698c = i6;
        }

        private final p237x7.p c() {
            return p031d0.c.c(1403994769, true, new D.C0880q.a.C0035a(D.C0880q.this, this));
        }

        public final p237x7.p d() {
            p237x7.p pVar = this.f1699d;
            if (pVar != null) {
                return pVar;
            }
            p237x7.p pVarC = c();
            this.f1699d = pVarC;
            return pVarC;
        }

        public final java.lang.Object e() {
            return this.f1697b;
        }

        public final int f() {
            return this.f1698c;
        }

        public final java.lang.Object g() {
            return this.f1696a;
        }
    }

    public C0880q(p041e0.d dVar, p237x7.a aVar) {
        this.f1693a = dVar;
        this.f1694b = aVar;
    }

    public final p237x7.p b(int i6, java.lang.Object obj, java.lang.Object obj2) {
        D.C0880q.a aVar = (D.C0880q.a) this.f1695c.get(obj);
        if (aVar == null || aVar.f() != i6 || !p247y7.AbstractC7350t.b(aVar.e(), obj2)) {
            aVar = new D.C0880q.a(i6, obj, obj2);
            this.f1695c.put(obj, aVar);
        }
        return aVar.d();
    }

    public final java.lang.Object c(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        D.C0880q.a aVar = (D.C0880q.a) this.f1695c.get(obj);
        if (aVar != null) {
            return aVar.e();
        }
        D.InterfaceC0881s interfaceC0881s = (D.InterfaceC0881s) this.f1694b.b();
        int iD = interfaceC0881s.d(obj);
        if (iD != -1) {
            return interfaceC0881s.e(iD);
        }
        return null;
    }

    public final p237x7.a d() {
        return this.f1694b;
    }
}
