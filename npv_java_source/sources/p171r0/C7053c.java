package p171r0;

/* JADX INFO: renamed from: r0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7053c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final p171r0.C7053c.a f53531x = new p171r0.C7053c.a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final p171r0.H f53532y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p171r0.InterfaceC7055e f53533a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.graphics.Outline f53538f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f53540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f53541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f53542j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private p141o0.L1 f53543k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private p141o0.Q1 f53544l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private p141o0.Q1 f53545m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f53546n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private p141o0.N1 f53547o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f53548p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p171r0.C7051a f53549q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f53550r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f53551s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f53552t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f53553u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f53554v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private android.graphics.RectF f53555w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Y0.e f53534b = p161q0.e.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Y0.v f53535c = Y0.v.Ltr;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p237x7.l f53536d = p171r0.C7053c.C0698c.f53557D;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p237x7.l f53537e = new p171r0.C7053c.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f53539g = true;

    /* JADX INFO: renamed from: r0.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX INFO: renamed from: r0.c$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.l {
        b() {
            super(1);
        }

        public final void a(p161q0.g gVar) {
            p141o0.Q1 q6 = p171r0.C7053c.this.f53544l;
            if (!p171r0.C7053c.this.f53546n || !p171r0.C7053c.this.k() || q6 == null) {
                p171r0.C7053c.this.f53536d.l(gVar);
                return;
            }
            p237x7.l lVar = p171r0.C7053c.this.f53536d;
            int iB = p141o0.AbstractC7013x0.f52260a.b();
            p161q0.d dVarF0 = gVar.F0();
            long jI = dVarF0.i();
            dVarF0.h().m();
            try {
                dVarF0.c().b(q6, iB);
                lVar.l(gVar);
            } finally {
                dVarF0.h().s();
                dVarF0.d(jI);
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p161q0.g) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: r0.c$c, reason: collision with other inner class name */
    static final class C0698c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final p171r0.C7053c.C0698c f53557D = new p171r0.C7053c.C0698c();

        C0698c() {
            super(1);
        }

        public final void a(p161q0.g gVar) {
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p161q0.g) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0010  */
    static {
        p171r0.H h6;
        if (p171r0.G.f53496a.a()) {
            h6 = p171r0.I.f53498a;
        } else if (android.os.Build.VERSION.SDK_INT >= 28) {
            h6 = p171r0.K.f53500a;
        } else if (p171r0.U.f53507a.a()) {
            h6 = p171r0.J.f53499a;
        } else {
            h6 = p171r0.I.f53498a;
        }
        f53532y = h6;
    }

    public C7053c(p171r0.InterfaceC7055e interfaceC7055e, p171r0.G g6) {
        this.f53533a = interfaceC7055e;
        n0.g.a aVar = p131n0.g.f51312b;
        this.f53540h = aVar.c();
        this.f53541i = p131n0.m.f51333b.a();
        this.f53549q = new p171r0.C7051a();
        interfaceC7055e.A(false);
        this.f53551s = Y0.p.f16221b.a();
        this.f53552t = Y0.t.f16230b.a();
        this.f53553u = aVar.b();
    }

    private final android.graphics.Outline A() {
        android.graphics.Outline outline = this.f53538f;
        if (outline != null) {
            return outline;
        }
        android.graphics.Outline outline2 = new android.graphics.Outline();
        this.f53538f = outline2;
        return outline2;
    }

    private final android.graphics.RectF B() {
        android.graphics.RectF rectF = this.f53555w;
        if (rectF != null) {
            return rectF;
        }
        android.graphics.RectF rectF2 = new android.graphics.RectF();
        this.f53555w = rectF2;
        return rectF2;
    }

    private final void C() {
        this.f53548p++;
    }

    private final void D() {
        this.f53548p--;
        f();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0091 A[LOOP:0: B:20:0x005a->B:30:0x0091, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0094 A[EDGE_INSN: B:34:0x0094->B:31:0x0094 BREAK  A[LOOP:0: B:20:0x005a->B:30:0x0091], SYNTHETIC] */
    private final void F() {
        p171r0.C7051a c7051a = this.f53549q;
        c7051a.f53522b = c7051a.f53521a;
        p170r.L l6 = c7051a.f53523c;
        if (l6 != null && l6.e()) {
            p170r.L lA = c7051a.f53524d;
            if (lA == null) {
                lA = p170r.X.a();
                c7051a.f53524d = lA;
            }
            lA.j(l6);
            l6.m();
        }
        c7051a.f53525e = true;
        this.f53533a.I(this.f53534b, this.f53535c, this, this.f53537e);
        c7051a.f53525e = false;
        p171r0.C7053c c7053c = c7051a.f53522b;
        if (c7053c != null) {
            c7053c.D();
        }
        p170r.L l10 = c7051a.f53524d;
        if (l10 == null || !l10.e()) {
            return;
        }
        java.lang.Object[] objArr = l10.f53341b;
        long[] jArr = l10.f53340a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j6 = jArr[i6];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i6 != length) {
                        break;
                        break;
                    }
                    i6++;
                } else {
                    int i10 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j6) < 128) {
                            ((p171r0.C7053c) objArr[(i6 << 3) + i11]).D();
                        }
                        j6 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    } else if (i6 != length) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
        }
        l10.m();
    }

    private final void G() {
        if (this.f53533a.k()) {
            return;
        }
        try {
            F();
        } catch (java.lang.Throwable unused) {
        }
    }

    private final void I() {
        this.f53543k = null;
        this.f53544l = null;
        this.f53541i = p131n0.m.f51333b.a();
        this.f53540h = p131n0.g.f51312b.c();
        this.f53542j = 0.0f;
        this.f53539g = true;
        this.f53546n = false;
    }

    private final void Q(long j6, long j10) {
        this.f53533a.F(Y0.p.h(j6), Y0.p.i(j6), j10);
    }

    private final void a0(long j6) {
        if (Y0.t.e(this.f53552t, j6)) {
            return;
        }
        this.f53552t = j6;
        Q(this.f53551s, j6);
        if (this.f53541i == 9205357640488583168L) {
            this.f53539g = true;
            e();
        }
    }

    private final void d(p171r0.C7053c c7053c) {
        if (this.f53549q.i(c7053c)) {
            c7053c.C();
        }
    }

    private final void e() {
        if (this.f53539g) {
            android.graphics.Outline outline = null;
            if (this.f53554v || u() > 0.0f) {
                p141o0.Q1 q6 = this.f53544l;
                if (q6 != null) {
                    android.graphics.RectF rectFB = B();
                    if (!(q6 instanceof p141o0.V)) {
                        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((p141o0.V) q6).s().computeBounds(rectFB, false);
                    android.graphics.Outline outlineG0 = g0(q6);
                    if (outlineG0 != null) {
                        outlineG0.setAlpha(i());
                        outline = outlineG0;
                    }
                    this.f53533a.y(outline, Y0.u.a(java.lang.Math.round(rectFB.width()), java.lang.Math.round(rectFB.height())));
                    if (this.f53546n && this.f53554v) {
                        this.f53533a.A(false);
                        this.f53533a.i();
                    } else {
                        this.f53533a.A(this.f53554v);
                    }
                } else {
                    this.f53533a.A(this.f53554v);
                    p131n0.m.f51333b.b();
                    android.graphics.Outline outlineA = A();
                    long jD = Y0.u.d(this.f53552t);
                    long j6 = this.f53540h;
                    long j10 = this.f53541i;
                    long j11 = j10 == 9205357640488583168L ? jD : j10;
                    outlineA.setRoundRect(java.lang.Math.round(p131n0.g.m(j6)), java.lang.Math.round(p131n0.g.n(j6)), java.lang.Math.round(p131n0.g.m(j6) + p131n0.m.i(j11)), java.lang.Math.round(p131n0.g.n(j6) + p131n0.m.g(j11)), this.f53542j);
                    outlineA.setAlpha(i());
                    this.f53533a.y(outlineA, Y0.u.c(j11));
                }
            } else {
                this.f53533a.A(false);
                this.f53533a.y(null, Y0.t.f16230b.a());
            }
        }
        this.f53539g = false;
    }

    private final void f() {
        if (this.f53550r && this.f53548p == 0) {
            g();
        }
    }

    private final void f0(android.graphics.Canvas canvas) {
        float fH = Y0.p.h(this.f53551s);
        float fI = Y0.p.i(this.f53551s);
        float fH2 = Y0.p.h(this.f53551s) + Y0.t.g(this.f53552t);
        float fI2 = Y0.p.i(this.f53551s) + Y0.t.f(this.f53552t);
        float fI3 = i();
        p141o0.AbstractC7019z0 abstractC7019z0L = l();
        int iJ = j();
        if (fI3 < 1.0f || !p141o0.AbstractC6960f0.E(iJ, p141o0.AbstractC6960f0.f52197a.B()) || abstractC7019z0L != null || p171r0.AbstractC7052b.e(m(), p171r0.AbstractC7052b.f53526a.c())) {
            p141o0.N1 n1A = this.f53547o;
            if (n1A == null) {
                n1A = p141o0.U.a();
                this.f53547o = n1A;
            }
            n1A.b(fI3);
            n1A.u(iJ);
            n1A.A(abstractC7019z0L);
            canvas.saveLayer(fH, fI, fH2, fI2, n1A.w());
        } else {
            canvas.save();
        }
        canvas.translate(fH, fI);
        canvas.concat(this.f53533a.L());
    }

    private final android.graphics.Outline g0(p141o0.Q1 q6) {
        android.graphics.Outline outline;
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 > 28 || q6.c()) {
            android.graphics.Outline outlineA = A();
            if (i6 >= 30) {
                p171r0.N.f53502a.a(outlineA, q6);
            } else {
                if (!(q6 instanceof p141o0.V)) {
                    throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outlineA.setConvexPath(((p141o0.V) q6).s());
            }
            this.f53546n = !outlineA.canClip();
            outline = outlineA;
        } else {
            android.graphics.Outline outline2 = this.f53538f;
            if (outline2 != null) {
                outline2.setEmpty();
            }
            this.f53546n = true;
            this.f53533a.s(true);
            outline = null;
        }
        this.f53544l = q6;
        return outline;
    }

    public final void E(Y0.e eVar, Y0.v vVar, long j6, p237x7.l lVar) {
        a0(j6);
        this.f53534b = eVar;
        this.f53535c = vVar;
        this.f53536d = lVar;
        this.f53533a.s(true);
        F();
    }

    public final void H() {
        if (this.f53550r) {
            return;
        }
        this.f53550r = true;
        f();
    }

    public final void J(float f6) {
        if (this.f53533a.a() == f6) {
            return;
        }
        this.f53533a.b(f6);
    }

    public final void K(long j6) {
        if (p141o0.C7016y0.o(j6, this.f53533a.H())) {
            return;
        }
        this.f53533a.w(j6);
    }

    public final void L(float f6) {
        if (this.f53533a.x() == f6) {
            return;
        }
        this.f53533a.m(f6);
    }

    public final void M(boolean z6) {
        if (this.f53554v != z6) {
            this.f53554v = z6;
            this.f53539g = true;
            e();
        }
    }

    public final void N(int i6) {
        if (p171r0.AbstractC7052b.e(this.f53533a.C(), i6)) {
            return;
        }
        this.f53533a.K(i6);
    }

    public final void O(p141o0.Q1 q6) {
        I();
        this.f53544l = q6;
        e();
    }

    public final void P(long j6) {
        if (p131n0.g.j(this.f53553u, j6)) {
            return;
        }
        this.f53553u = j6;
        this.f53533a.G(j6);
    }

    public final void R(long j6, long j10) {
        W(j6, j10, 0.0f);
    }

    public final void S(p141o0.Z1 z6) {
        this.f53533a.t();
        if (p247y7.AbstractC7350t.b(null, z6)) {
            return;
        }
        this.f53533a.l(z6);
    }

    public final void T(float f6) {
        if (this.f53533a.B() == f6) {
            return;
        }
        this.f53533a.n(f6);
    }

    public final void U(float f6) {
        if (this.f53533a.r() == f6) {
            return;
        }
        this.f53533a.c(f6);
    }

    public final void V(float f6) {
        if (this.f53533a.u() == f6) {
            return;
        }
        this.f53533a.d(f6);
    }

    public final void W(long j6, long j10, float f6) {
        if (p131n0.g.j(this.f53540h, j6) && p131n0.m.f(this.f53541i, j10) && this.f53542j == f6 && this.f53544l == null) {
            return;
        }
        I();
        this.f53540h = j6;
        this.f53541i = j10;
        this.f53542j = f6;
        e();
    }

    public final void X(float f6) {
        if (this.f53533a.o() == f6) {
            return;
        }
        this.f53533a.h(f6);
    }

    public final void Y(float f6) {
        if (this.f53533a.E() == f6) {
            return;
        }
        this.f53533a.g(f6);
    }

    public final void Z(float f6) {
        if (this.f53533a.M() == f6) {
            return;
        }
        this.f53533a.p(f6);
        this.f53539g = true;
        e();
    }

    public final void b0(long j6) {
        if (p141o0.C7016y0.o(j6, this.f53533a.J())) {
            return;
        }
        this.f53533a.D(j6);
    }

    public final void c0(long j6) {
        if (Y0.p.g(this.f53551s, j6)) {
            return;
        }
        this.f53551s = j6;
        Q(j6, this.f53552t);
    }

    public final void d0(float f6) {
        if (this.f53533a.z() == f6) {
            return;
        }
        this.f53533a.j(f6);
    }

    public final void e0(float f6) {
        if (this.f53533a.v() == f6) {
            return;
        }
        this.f53533a.e(f6);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0057 A[LOOP:0: B:10:0x0020->B:20:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x005a A[EDGE_INSN: B:25:0x005a->B:21:0x005a BREAK  A[LOOP:0: B:10:0x0020->B:20:0x0057], SYNTHETIC] */
    public final void g() {
        p171r0.C7051a c7051a = this.f53549q;
        p171r0.C7053c c7053c = c7051a.f53521a;
        if (c7053c != null) {
            c7053c.D();
            c7051a.f53521a = null;
        }
        p170r.L l6 = c7051a.f53523c;
        if (l6 != null) {
            java.lang.Object[] objArr = l6.f53341b;
            long[] jArr = l6.f53340a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i6 = 0;
                while (true) {
                    long j6 = jArr[i6];
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i6 != length) {
                            break;
                            break;
                        }
                        i6++;
                    } else {
                        int i10 = 8 - ((~(i6 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j6) < 128) {
                                ((p171r0.C7053c) objArr[(i6 << 3) + i11]).D();
                            }
                            j6 >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        } else if (i6 != length) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
            }
            l6.m();
        }
        this.f53533a.i();
    }

    public final void h(p141o0.InterfaceC6993q0 interfaceC6993q0, p171r0.C7053c c7053c) {
        if (this.f53550r) {
            return;
        }
        e();
        G();
        boolean z6 = u() > 0.0f;
        if (z6) {
            interfaceC6993q0.v();
        }
        android.graphics.Canvas canvasD = p141o0.H.d(interfaceC6993q0);
        boolean z10 = !canvasD.isHardwareAccelerated();
        if (z10) {
            canvasD.save();
            f0(canvasD);
        }
        boolean z11 = z10 && this.f53554v;
        if (z11) {
            interfaceC6993q0.m();
            p141o0.L1 l1N = n();
            if (l1N instanceof o0.L1.b) {
                p141o0.AbstractC6990p0.e(interfaceC6993q0, l1N.a(), 0, 2, null);
            } else if (l1N instanceof o0.L1.c) {
                p141o0.Q1 q1A = this.f53545m;
                if (q1A != null) {
                    q1A.n();
                } else {
                    q1A = p141o0.Y.a();
                    this.f53545m = q1A;
                }
                p141o0.P1.c(q1A, ((o0.L1.c) l1N).b(), null, 2, null);
                p141o0.AbstractC6990p0.c(interfaceC6993q0, q1A, 0, 2, null);
            } else if (l1N instanceof o0.L1.a) {
                p141o0.AbstractC6990p0.c(interfaceC6993q0, ((o0.L1.a) l1N).b(), 0, 2, null);
            }
        }
        if (c7053c != null) {
            c7053c.d(this);
        }
        this.f53533a.N(interfaceC6993q0);
        if (z11) {
            interfaceC6993q0.s();
        }
        if (z6) {
            interfaceC6993q0.n();
        }
        if (z10) {
            canvasD.restore();
        }
    }

    public final float i() {
        return this.f53533a.a();
    }

    public final int j() {
        return this.f53533a.q();
    }

    public final boolean k() {
        return this.f53554v;
    }

    public final p141o0.AbstractC7019z0 l() {
        return this.f53533a.f();
    }

    public final int m() {
        return this.f53533a.C();
    }

    public final p141o0.L1 n() {
        p141o0.L1 cVar = this.f53543k;
        p141o0.Q1 q6 = this.f53544l;
        if (cVar == null) {
            if (q6 != null) {
                cVar = new o0.L1.a(q6);
            } else {
                long jD = Y0.u.d(this.f53552t);
                long j6 = this.f53540h;
                long j10 = this.f53541i;
                if (j10 != 9205357640488583168L) {
                    jD = j10;
                }
                float fM = p131n0.g.m(j6);
                float fN = p131n0.g.n(j6);
                float fI = fM + p131n0.m.i(jD);
                float fG = fN + p131n0.m.g(jD);
                float f6 = this.f53542j;
                cVar = f6 > 0.0f ? new o0.L1.c(p131n0.l.c(fM, fN, fI, fG, p131n0.b.b(f6, 0.0f, 2, null))) : new o0.L1.b(new p131n0.i(fM, fN, fI, fG));
            }
            this.f53543k = cVar;
        }
        return cVar;
    }

    public final long o() {
        return this.f53553u;
    }

    public final float p() {
        return this.f53533a.B();
    }

    public final float q() {
        return this.f53533a.r();
    }

    public final float r() {
        return this.f53533a.u();
    }

    public final float s() {
        return this.f53533a.o();
    }

    public final float t() {
        return this.f53533a.E();
    }

    public final float u() {
        return this.f53533a.M();
    }

    public final long v() {
        return this.f53552t;
    }

    public final long w() {
        return this.f53551s;
    }

    public final float x() {
        return this.f53533a.z();
    }

    public final float y() {
        return this.f53533a.v();
    }

    public final boolean z() {
        return this.f53550r;
    }
}
