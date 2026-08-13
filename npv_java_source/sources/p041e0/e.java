package p041e0;

/* JADX INFO: loaded from: classes.dex */
final class e implements p041e0.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0.e.c f44485d = new e0.e.c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p041e0.j f44486e = p041e0.k.a(e0.e.a.f44490D, e0.e.b.f44491D);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f44487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f44488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p041e0.g f44489c;

    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final e0.e.a f44490D = new e0.e.a();

        a() {
            super(2);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Map u(p041e0.l lVar, p041e0.e eVar) {
            return eVar.h();
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final e0.e.b f44491D = new e0.e.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p041e0.e l(java.util.Map map) {
            return new p041e0.e(map);
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p041e0.j a() {
            return p041e0.e.f44486e;
        }
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Object f44492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f44493b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p041e0.g f44494c;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p041e0.e f44496D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p041e0.e eVar) {
                super(1);
                this.f44496D = eVar;
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean l(java.lang.Object obj) {
                p041e0.g gVarG = this.f44496D.g();
                return java.lang.Boolean.valueOf(gVarG != null ? gVarG.a(obj) : true);
            }
        }

        public d(java.lang.Object obj) {
            this.f44492a = obj;
            this.f44494c = p041e0.i.a((java.util.Map) p041e0.e.this.f44487a.get(obj), new e0.e.d.a(p041e0.e.this));
        }

        public final p041e0.g a() {
            return this.f44494c;
        }

        public final void b(java.util.Map map) {
            if (this.f44493b) {
                java.util.Map mapB = this.f44494c.b();
                if (mapB.isEmpty()) {
                    map.remove(this.f44492a);
                } else {
                    map.put(this.f44492a, mapB);
                }
            }
        }

        public final void c(boolean z6) {
            this.f44493b = z6;
        }
    }

    /* JADX INFO: renamed from: e0.e$e, reason: collision with other inner class name */
    static final class C0494e extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f44498E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ e0.e.d f44499F;

        /* JADX INFO: renamed from: e0.e$e$a */
        public static final class a implements V.M {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e0.e.d f44500a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p041e0.e f44501b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ java.lang.Object f44502c;

            public a(e0.e.d dVar, p041e0.e eVar, java.lang.Object obj) {
                this.f44500a = dVar;
                this.f44501b = eVar;
                this.f44502c = obj;
            }

            @Override // V.M
            public void e() {
                this.f44500a.b(this.f44501b.f44487a);
                this.f44501b.f44488b.remove(this.f44502c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0494e(java.lang.Object obj, e0.e.d dVar) {
            super(1);
            this.f44498E = obj;
            this.f44499F = dVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V.M l(V.N n6) {
            boolean z6 = !p041e0.e.this.f44488b.containsKey(this.f44498E);
            java.lang.Object obj = this.f44498E;
            if (z6) {
                p041e0.e.this.f44487a.remove(this.f44498E);
                p041e0.e.this.f44488b.put(this.f44498E, this.f44499F);
                return new p041e0.e.C0494e.a(this.f44499F, p041e0.e.this, this.f44498E);
            }
            throw new java.lang.IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
        }
    }

    static final class f extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f44504E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.p f44505F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f44506G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(java.lang.Object obj, p237x7.p pVar, int i6) {
            super(2);
            this.f44504E = obj;
            this.f44505F = pVar;
            this.f44506G = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            p041e0.e.this.d(this.f44504E, this.f44505F, interfaceC1734n, V.S0.a(this.f44506G | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public e(java.util.Map map) {
        this.f44487a = map;
        this.f44488b = new java.util.LinkedHashMap();
    }

    public /* synthetic */ e(java.util.Map map, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? new java.util.LinkedHashMap() : map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Map h() {
        java.util.Map mapU = p097j7.S.u(this.f44487a);
        java.util.Iterator it = this.f44488b.values().iterator();
        while (it.hasNext()) {
            ((e0.e.d) it.next()).b(mapU);
        }
        if (mapU.isEmpty()) {
            return null;
        }
        return mapU;
    }

    @Override // p041e0.d
    public void d(java.lang.Object obj, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        int i10;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-1198538093);
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
                V.AbstractC1741q.Q(-1198538093, i10, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:75)");
            }
            interfaceC1734nR.w(207, obj);
            java.lang.Object objG = interfaceC1734nR.g();
            V.InterfaceC1734n.a aVar = V.InterfaceC1734n.f14931a;
            if (objG == aVar.a()) {
                p041e0.g gVar = this.f44489c;
                if (!(gVar != null ? gVar.a(obj) : true)) {
                    throw new java.lang.IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                objG = new e0.e.d(obj);
                interfaceC1734nR.K(objG);
            }
            e0.e.d dVar = (e0.e.d) objG;
            V.AbstractC1756y.a(p041e0.i.d().d(dVar.a()), pVar, interfaceC1734nR, (i10 & 112) | V.P0.f14698i);
            p087i7.M m6 = p087i7.M.f46721a;
            boolean zL = interfaceC1734nR.l(this) | interfaceC1734nR.l(obj) | interfaceC1734nR.l(dVar);
            java.lang.Object objG2 = interfaceC1734nR.g();
            if (zL || objG2 == aVar.a()) {
                objG2 = new p041e0.e.C0494e(obj, dVar);
                interfaceC1734nR.K(objG2);
            }
            V.Q.b(m6, (p237x7.l) objG2, interfaceC1734nR, 6);
            interfaceC1734nR.e();
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new e0.e.f(obj, pVar, i6));
        }
    }

    @Override // p041e0.d
    public void f(java.lang.Object obj) {
        e0.e.d dVar = (e0.e.d) this.f44488b.get(obj);
        if (dVar != null) {
            dVar.c(false);
        } else {
            this.f44487a.remove(obj);
        }
    }

    public final p041e0.g g() {
        return this.f44489c;
    }

    public final void i(p041e0.g gVar) {
        this.f44489c = gVar;
    }
}
