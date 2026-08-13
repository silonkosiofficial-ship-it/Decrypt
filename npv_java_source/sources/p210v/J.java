package p210v;

/* JADX INFO: loaded from: classes.dex */
public final class J extends androidx.compose.ui.d.c implements F0.InterfaceC0934u, F0.InterfaceC0932s, F0.z0, F0.i0 {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private p237x7.l f55584P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private p237x7.l f55585Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private p237x7.l f55586R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f55587S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f55588T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private long f55589U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private float f55590V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private float f55591W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f55592X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private p210v.W f55593Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private android.view.View f55594Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private Y0.e f55595a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private p210v.V f55596b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final V.InterfaceC1753w0 f55597c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private V.G1 f55598d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private long f55599e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private Y0.t f55600f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private Y8.j f55601g0;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        public final long a() {
            D0.InterfaceC0900t interfaceC0900tI0 = p210v.J.this.I0();
            return interfaceC0900tI0 != null ? D0.AbstractC0901u.e(interfaceC0900tI0) : p131n0.g.f51312b.b();
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            return p131n0.g.d(a());
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        public final long a() {
            return p210v.J.this.f55599e0;
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            return p131n0.g.d(a());
        }
    }

    static final class c extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f55604G;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final v.J.c.a f55606D = new v.J.c.a();

            a() {
                super(1);
            }

            public final void a(long j6) {
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a(((java.lang.Number) obj).longValue());
                return p087i7.M.f46721a;
            }
        }

        c(p127m7.e eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0021  */
        /* JADX WARN: Code duplicated, block: B:13:0x0029  */
        /* JADX WARN: Code duplicated, block: B:15:0x0031 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:18:0x003a  */
        /* JADX WARN: Code duplicated, block: B:20:0x0044 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0038 -> B:11:0x0021). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0042 -> B:21:0x0045). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:18:0x003a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p137n7.b.g()
                int r1 = r4.f55604G
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p087i7.x.b(r5)
                goto L45
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                p087i7.x.b(r5)
                goto L32
            L1e:
                p087i7.x.b(r5)
            L21:
                v.J r5 = p210v.J.this
                Y8.j r5 = p210v.J.T1(r5)
                if (r5 == 0) goto L32
                r4.f55604G = r3
                java.lang.Object r5 = r5.b(r4)
                if (r5 != r0) goto L32
                return r0
            L32:
                v.J r5 = p210v.J.this
                v.V r5 = p210v.J.V1(r5)
                if (r5 == 0) goto L21
                v.J$c$a r5 = v.J.c.a.f55606D
                r4.f55604G = r2
                java.lang.Object r5 = V.AbstractC1729l0.b(r5, r4)
                if (r5 != r0) goto L45
                return r0
            L45:
                v.J r5 = p210v.J.this
                v.V r5 = p210v.J.V1(r5)
                if (r5 == 0) goto L21
                r5.c()
                goto L21
            */
            throw new UnsupportedOperationException("Method not decompiled: v.J.c.B(java.lang.Object):java.lang.Object");
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((v.J.c) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return p210v.J.this.new c(eVar);
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.a {
        d() {
            super(0);
        }

        public final void a() {
            p210v.J.this.c2();
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    private J(p237x7.l lVar, p237x7.l lVar2, p237x7.l lVar3, float f6, boolean z6, long j6, float f10, float f11, boolean z10, p210v.W w6) {
        this.f55584P = lVar;
        this.f55585Q = lVar2;
        this.f55586R = lVar3;
        this.f55587S = f6;
        this.f55588T = z6;
        this.f55589U = j6;
        this.f55590V = f10;
        this.f55591W = f11;
        this.f55592X = z10;
        this.f55593Y = w6;
        this.f55597c0 = V.v1.h(null, V.v1.j());
        this.f55599e0 = p131n0.g.f51312b.b();
    }

    public /* synthetic */ J(p237x7.l lVar, p237x7.l lVar2, p237x7.l lVar3, float f6, boolean z6, long j6, float f10, float f11, boolean z10, p210v.W w6, p247y7.AbstractC7342k abstractC7342k) {
        this(lVar, lVar2, lVar3, f6, z6, j6, f10, f11, z10, w6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D0.InterfaceC0900t I0() {
        return (D0.InterfaceC0900t) this.f55597c0.getValue();
    }

    private final long Y1() {
        if (this.f55598d0 == null) {
            this.f55598d0 = V.v1.e(new v.J.a());
        }
        V.G1 g6 = this.f55598d0;
        return g6 != null ? ((p131n0.g) g6.getValue()).v() : p131n0.g.f51312b.b();
    }

    private final void Z1() {
        p210v.V v6 = this.f55596b0;
        if (v6 != null) {
            v6.dismiss();
        }
        android.view.View viewA = this.f55594Z;
        if (viewA == null) {
            viewA = F0.AbstractC0926l.a(this);
        }
        android.view.View view = viewA;
        this.f55594Z = view;
        Y0.e eVarI = this.f55595a0;
        if (eVarI == null) {
            eVarI = F0.AbstractC0925k.i(this);
        }
        Y0.e eVar = eVarI;
        this.f55595a0 = eVar;
        this.f55596b0 = this.f55593Y.b(view, this.f55588T, this.f55589U, this.f55590V, this.f55591W, this.f55592X, eVar, this.f55587S);
        d2();
    }

    private final void a2(D0.InterfaceC0900t interfaceC0900t) {
        this.f55597c0.setValue(interfaceC0900t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    public final void c2() {
        long jB;
        Y0.e eVarI = this.f55595a0;
        if (eVarI == null) {
            eVarI = F0.AbstractC0925k.i(this);
            this.f55595a0 = eVarI;
        }
        long jV = ((p131n0.g) this.f55584P.l(eVarI)).v();
        if (!p131n0.h.c(jV) || !p131n0.h.c(Y1())) {
            this.f55599e0 = p131n0.g.f51312b.b();
            p210v.V v6 = this.f55596b0;
            if (v6 != null) {
                v6.dismiss();
                return;
            }
            return;
        }
        this.f55599e0 = p131n0.g.r(Y1(), jV);
        p237x7.l lVar = this.f55585Q;
        if (lVar != null) {
            p131n0.g gVarD = p131n0.g.d(((p131n0.g) lVar.l(eVarI)).v());
            if (!p131n0.h.c(gVarD.v())) {
                gVarD = null;
            }
            if (gVarD != null) {
                jB = p131n0.g.r(Y1(), gVarD.v());
            } else {
                jB = p131n0.g.f51312b.b();
            }
        } else {
            jB = p131n0.g.f51312b.b();
        }
        long j6 = jB;
        if (this.f55596b0 == null) {
            Z1();
        }
        p210v.V v10 = this.f55596b0;
        if (v10 != null) {
            v10.b(this.f55599e0, j6, this.f55587S);
        }
        d2();
    }

    private final void d2() {
        Y0.e eVar;
        p210v.V v6 = this.f55596b0;
        if (v6 == null || (eVar = this.f55595a0) == null || Y0.t.d(v6.a(), this.f55600f0)) {
            return;
        }
        p237x7.l lVar = this.f55586R;
        if (lVar != null) {
            lVar.l(Y0.l.c(eVar.P(Y0.u.d(v6.a()))));
        }
        this.f55600f0 = Y0.t.b(v6.a());
    }

    @Override // androidx.compose.ui.d.c
    public void D1() {
        L0();
        this.f55601g0 = Y8.m.b(0, null, null, 7, null);
        W8.AbstractC1788i.d(t1(), null, null, new v.J.c(null), 3, null);
    }

    @Override // androidx.compose.ui.d.c
    public void E1() {
        p210v.V v6 = this.f55596b0;
        if (v6 != null) {
            v6.dismiss();
        }
        this.f55596b0 = null;
    }

    @Override // F0.i0
    public void L0() {
        F0.j0.a(this, new v.J.d());
    }

    @Override // F0.z0
    public void M0(K0.w wVar) {
        wVar.d(p210v.K.b(), new v.J.b());
    }

    public final void b2(p237x7.l lVar, p237x7.l lVar2, float f6, boolean z6, long j6, float f10, float f11, boolean z10, p237x7.l lVar3, p210v.W w6) {
        float f12 = this.f55587S;
        long j10 = this.f55589U;
        float f13 = this.f55590V;
        boolean z11 = this.f55588T;
        float f14 = this.f55591W;
        boolean z12 = this.f55592X;
        p210v.W w10 = this.f55593Y;
        android.view.View view = this.f55594Z;
        Y0.e eVar = this.f55595a0;
        this.f55584P = lVar;
        this.f55585Q = lVar2;
        this.f55587S = f6;
        this.f55588T = z6;
        this.f55589U = j6;
        this.f55590V = f10;
        this.f55591W = f11;
        this.f55592X = z10;
        this.f55586R = lVar3;
        this.f55593Y = w6;
        android.view.View viewA = F0.AbstractC0926l.a(this);
        Y0.e eVarI = F0.AbstractC0925k.i(this);
        if (this.f55596b0 != null && ((!p210v.K.a(f6, f12) && !w6.a()) || !Y0.l.f(j6, j10) || !Y0.i.s(f10, f13) || !Y0.i.s(f11, f14) || z6 != z11 || z10 != z12 || !p247y7.AbstractC7350t.b(w6, w10) || !p247y7.AbstractC7350t.b(viewA, view) || !p247y7.AbstractC7350t.b(eVarI, eVar))) {
            Z1();
        }
        c2();
    }

    @Override // F0.z0
    public /* synthetic */ boolean h0() {
        return F0.y0.a(this);
    }

    @Override // F0.z0
    public /* synthetic */ boolean k1() {
        return F0.y0.b(this);
    }

    @Override // F0.InterfaceC0932s
    public /* synthetic */ void m0() {
        F0.r.a(this);
    }

    @Override // F0.InterfaceC0934u
    public void s(D0.InterfaceC0900t interfaceC0900t) {
        a2(interfaceC0900t);
    }

    @Override // F0.InterfaceC0932s
    public void y(p161q0.c cVar) {
        cVar.l1();
        Y8.j jVar = this.f55601g0;
        if (jVar != null) {
            Y8.n.b(jVar.j(p087i7.M.f46721a));
        }
    }
}
