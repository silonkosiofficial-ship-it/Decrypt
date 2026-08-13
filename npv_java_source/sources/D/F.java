package D;

/* JADX INFO: loaded from: classes.dex */
final class F implements p041e0.g, p041e0.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D.F.b f1585d = new D.F.b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p041e0.g f1586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V.InterfaceC1753w0 f1587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Set f1588c;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p041e0.g f1589D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p041e0.g gVar) {
            super(1);
            this.f1589D = gVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(java.lang.Object obj) {
            p041e0.g gVar = this.f1589D;
            return java.lang.Boolean.valueOf(gVar != null ? gVar.a(obj) : true);
        }
    }

    public static final class b {

        static final class a extends p247y7.AbstractC7352v implements p237x7.p {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final D.F.b.a f1590D = new D.F.b.a();

            a() {
                super(2);
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.util.Map u(p041e0.l lVar, D.F f6) {
                java.util.Map mapB = f6.b();
                if (mapB.isEmpty()) {
                    return null;
                }
                return mapB;
            }
        }

        /* JADX INFO: renamed from: D.F$b$b, reason: collision with other inner class name */
        static final class C0032b extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p041e0.g f1591D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0032b(p041e0.g gVar) {
                super(1);
                this.f1591D = gVar;
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final D.F l(java.util.Map map) {
                return new D.F(this.f1591D, map);
            }
        }

        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p041e0.j a(p041e0.g gVar) {
            return p041e0.k.a(D.F.b.a.f1590D, new D.F.b.C0032b(gVar));
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f1593E;

        public static final class a implements V.M {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ D.F f1594a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ java.lang.Object f1595b;

            public a(D.F f6, java.lang.Object obj) {
                this.f1594a = f6;
                this.f1595b = obj;
            }

            @Override // V.M
            public void e() {
                this.f1594a.f1588c.add(this.f1595b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(java.lang.Object obj) {
            super(1);
            this.f1593E = obj;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V.M l(V.N n6) {
            D.F.this.f1588c.remove(this.f1593E);
            return new D.F.c.a(D.F.this, this.f1593E);
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f1597E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.p f1598F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f1599G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(java.lang.Object obj, p237x7.p pVar, int i6) {
            super(2);
            this.f1597E = obj;
            this.f1598F = pVar;
            this.f1599G = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            D.F.this.d(this.f1597E, this.f1598F, interfaceC1734n, V.S0.a(this.f1599G | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public F(p041e0.g gVar) {
        this.f1586a = gVar;
        this.f1587b = V.A1.d(null, null, 2, null);
        this.f1588c = new java.util.LinkedHashSet();
    }

    public F(p041e0.g gVar, java.util.Map map) {
        this(p041e0.i.a(map, new D.F.a(gVar)));
    }

    @Override // p041e0.g
    public boolean a(java.lang.Object obj) {
        return this.f1586a.a(obj);
    }

    @Override // p041e0.g
    public java.util.Map b() {
        p041e0.d dVarH = h();
        if (dVarH != null) {
            java.util.Iterator it = this.f1588c.iterator();
            while (it.hasNext()) {
                dVarH.f(it.next());
            }
        }
        return this.f1586a.b();
    }

    @Override // p041e0.g
    public java.lang.Object c(java.lang.String str) {
        return this.f1586a.c(str);
    }

    @Override // p041e0.d
    public void d(java.lang.Object obj, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        int i10;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-697180401);
        if ((i6 & 6) == 0) {
            i10 = (interfaceC1734nR.l(obj) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i6 & 48) == 0) {
            i10 |= interfaceC1734nR.l(pVar) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i10 |= interfaceC1734nR.l(this) ? 256 : 128;
        }
        if ((i10 & 147) == 146 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-697180401, i10, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
            }
            p041e0.d dVarH = h();
            if (dVarH == null) {
                throw new java.lang.IllegalArgumentException("null wrappedHolder".toString());
            }
            int i11 = i10 & 14;
            dVarH.d(obj, pVar, interfaceC1734nR, i10 & 126);
            boolean zL = interfaceC1734nR.l(this) | interfaceC1734nR.l(obj);
            java.lang.Object objG = interfaceC1734nR.g();
            if (zL || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new D.F.c(obj);
                interfaceC1734nR.K(objG);
            }
            V.Q.b(obj, (p237x7.l) objG, interfaceC1734nR, i11);
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new D.F.d(obj, pVar, i6));
        }
    }

    @Override // p041e0.g
    public e0.g.a e(java.lang.String str, p237x7.a aVar) {
        return this.f1586a.e(str, aVar);
    }

    @Override // p041e0.d
    public void f(java.lang.Object obj) {
        p041e0.d dVarH = h();
        if (dVarH == null) {
            throw new java.lang.IllegalArgumentException("null wrappedHolder".toString());
        }
        dVarH.f(obj);
    }

    public final p041e0.d h() {
        return (p041e0.d) this.f1587b.getValue();
    }

    public final void i(p041e0.d dVar) {
        this.f1587b.setValue(dVar);
    }
}
