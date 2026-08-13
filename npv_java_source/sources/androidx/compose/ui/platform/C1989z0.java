package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1989z0 implements F0.m0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private p171r0.C7053c f20437C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p141o0.C1 f20438D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final androidx.compose.ui.platform.r f20439E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private p237x7.p f20440F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private p237x7.a f20441G;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f20443I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private float[] f20445K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f20446L;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f20450P;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private p141o0.L1 f20452R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private p141o0.Q1 f20453S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private p141o0.N1 f20454T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f20455U;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private long f20442H = Y0.u.a(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final float[] f20444J = p141o0.J1.c(null, 1, null);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private Y0.e f20447M = Y0.g.b(1.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Y0.v f20448N = Y0.v.Ltr;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final p161q0.a f20449O = new p161q0.a();

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private long f20451Q = androidx.compose.ui.graphics.f.f19784b.a();

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final p237x7.l f20456V = new androidx.compose.ui.platform.C1989z0.a();

    /* JADX INFO: renamed from: androidx.compose.ui.platform.z0$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {
        a() {
            super(1);
        }

        public final void a(p161q0.g gVar) {
            androidx.compose.ui.platform.C1989z0 c1989z0 = androidx.compose.ui.platform.C1989z0.this;
            p141o0.InterfaceC6993q0 interfaceC6993q0H = gVar.F0().h();
            p237x7.p pVar = c1989z0.f20440F;
            if (pVar != null) {
                pVar.u(interfaceC6993q0H, gVar.F0().f());
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p161q0.g) obj);
            return p087i7.M.f46721a;
        }
    }

    public C1989z0(p171r0.C7053c c7053c, p141o0.C1 c6, androidx.compose.ui.platform.r rVar, p237x7.p pVar, p237x7.a aVar) {
        this.f20437C = c7053c;
        this.f20438D = c6;
        this.f20439E = rVar;
        this.f20440F = pVar;
        this.f20441G = aVar;
    }

    private final void m(p141o0.InterfaceC6993q0 interfaceC6993q0) {
        if (this.f20437C.k()) {
            p141o0.L1 l1N = this.f20437C.n();
            if (l1N instanceof o0.L1.b) {
                p141o0.AbstractC6990p0.e(interfaceC6993q0, ((o0.L1.b) l1N).b(), 0, 2, null);
                return;
            }
            if (!(l1N instanceof o0.L1.c)) {
                if (l1N instanceof o0.L1.a) {
                    p141o0.AbstractC6990p0.c(interfaceC6993q0, ((o0.L1.a) l1N).b(), 0, 2, null);
                    return;
                }
                return;
            }
            p141o0.Q1 q1A = this.f20453S;
            if (q1A == null) {
                q1A = p141o0.Y.a();
                this.f20453S = q1A;
            }
            q1A.a();
            p141o0.P1.c(q1A, ((o0.L1.c) l1N).b(), null, 2, null);
            p141o0.AbstractC6990p0.c(interfaceC6993q0, q1A, 0, 2, null);
        }
    }

    private final float[] n() {
        float[] fArrO = o();
        float[] fArrC = this.f20445K;
        if (fArrC == null) {
            fArrC = p141o0.J1.c(null, 1, null);
            this.f20445K = fArrC;
        }
        if (androidx.compose.ui.platform.I0.a(fArrO, fArrC)) {
            return fArrC;
        }
        return null;
    }

    private final float[] o() {
        r();
        return this.f20444J;
    }

    private final void p(boolean z6) {
        if (z6 != this.f20446L) {
            this.f20446L = z6;
            this.f20439E.x0(this, z6);
        }
    }

    private final void q() {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.compose.ui.platform.R1.f19969a.a(this.f20439E);
        } else {
            this.f20439E.invalidate();
        }
    }

    private final void r() {
        p171r0.C7053c c7053c = this.f20437C;
        long jB = p131n0.h.d(c7053c.o()) ? p131n0.n.b(Y0.u.d(this.f20442H)) : c7053c.o();
        p141o0.J1.h(this.f20444J);
        float[] fArr = this.f20444J;
        float[] fArrC = p141o0.J1.c(null, 1, null);
        p141o0.J1.q(fArrC, -p131n0.g.m(jB), -p131n0.g.n(jB), 0.0f, 4, null);
        p141o0.J1.n(fArr, fArrC);
        float[] fArr2 = this.f20444J;
        float[] fArrC2 = p141o0.J1.c(null, 1, null);
        p141o0.J1.q(fArrC2, c7053c.x(), c7053c.y(), 0.0f, 4, null);
        p141o0.J1.i(fArrC2, c7053c.p());
        p141o0.J1.j(fArrC2, c7053c.q());
        p141o0.J1.k(fArrC2, c7053c.r());
        p141o0.J1.m(fArrC2, c7053c.s(), c7053c.t(), 0.0f, 4, null);
        p141o0.J1.n(fArr2, fArrC2);
        float[] fArr3 = this.f20444J;
        float[] fArrC3 = p141o0.J1.c(null, 1, null);
        p141o0.J1.q(fArrC3, p131n0.g.m(jB), p131n0.g.n(jB), 0.0f, 4, null);
        p141o0.J1.n(fArr3, fArrC3);
    }

    private final void s() {
        p237x7.a aVar;
        p141o0.L1 l6 = this.f20452R;
        if (l6 == null) {
            return;
        }
        p171r0.AbstractC7056f.b(this.f20437C, l6);
        if (!(l6 instanceof o0.L1.a) || android.os.Build.VERSION.SDK_INT >= 33 || (aVar = this.f20441G) == null) {
            return;
        }
        aVar.b();
    }

    @Override // F0.m0
    public void a(float[] fArr) {
        p141o0.J1.n(fArr, o());
    }

    @Override // F0.m0
    public void b(p141o0.InterfaceC6993q0 interfaceC6993q0, p171r0.C7053c c7053c) {
        android.graphics.Canvas canvasD = p141o0.H.d(interfaceC6993q0);
        if (canvasD.isHardwareAccelerated()) {
            j();
            this.f20455U = this.f20437C.u() > 0.0f;
            p161q0.d dVarF0 = this.f20449O.F0();
            dVarF0.g(interfaceC6993q0);
            dVarF0.e(c7053c);
            p171r0.AbstractC7056f.a(this.f20449O, this.f20437C);
            return;
        }
        float fH = Y0.p.h(this.f20437C.w());
        float fI = Y0.p.i(this.f20437C.w());
        float fG = fH + Y0.t.g(this.f20442H);
        float f6 = fI + Y0.t.f(this.f20442H);
        if (this.f20437C.i() < 1.0f) {
            p141o0.N1 n1A = this.f20454T;
            if (n1A == null) {
                n1A = p141o0.U.a();
                this.f20454T = n1A;
            }
            n1A.b(this.f20437C.i());
            canvasD.saveLayer(fH, fI, fG, f6, n1A.w());
        } else {
            interfaceC6993q0.m();
        }
        interfaceC6993q0.d(fH, fI);
        interfaceC6993q0.o(o());
        if (this.f20437C.k()) {
            m(interfaceC6993q0);
        }
        p237x7.p pVar = this.f20440F;
        if (pVar != null) {
            pVar.u(interfaceC6993q0, null);
        }
        interfaceC6993q0.s();
    }

    @Override // F0.m0
    public void c(p237x7.p pVar, p237x7.a aVar) {
        p141o0.C1 c6 = this.f20438D;
        if (c6 == null) {
            throw new java.lang.IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle".toString());
        }
        if (!this.f20437C.z()) {
            throw new java.lang.IllegalArgumentException("layer should have been released before reuse".toString());
        }
        this.f20437C = c6.b();
        this.f20443I = false;
        this.f20440F = pVar;
        this.f20441G = aVar;
        this.f20451Q = androidx.compose.ui.graphics.f.f19784b.a();
        this.f20455U = false;
        this.f20442H = Y0.u.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f20452R = null;
        this.f20450P = 0;
    }

    @Override // F0.m0
    public boolean d(long j6) {
        float fM = p131n0.g.m(j6);
        float fN = p131n0.g.n(j6);
        if (this.f20437C.k()) {
            return androidx.compose.ui.platform.AbstractC1972r1.c(this.f20437C.n(), fM, fN, null, null, 24, null);
        }
        return true;
    }

    @Override // F0.m0
    public void destroy() {
        this.f20440F = null;
        this.f20441G = null;
        this.f20443I = true;
        p(false);
        p141o0.C1 c6 = this.f20438D;
        if (c6 != null) {
            c6.a(this.f20437C);
            this.f20439E.G0(this);
        }
    }

    @Override // F0.m0
    public void e(androidx.compose.ui.graphics.d dVar) {
        boolean z6;
        int iB;
        p171r0.C7053c c7053c;
        long jA;
        p237x7.a aVar;
        int iF = dVar.F() | this.f20450P;
        this.f20448N = dVar.C();
        this.f20447M = dVar.y();
        int i6 = iF & 4096;
        if (i6 != 0) {
            this.f20451Q = dVar.N0();
        }
        if ((iF & 1) != 0) {
            this.f20437C.X(dVar.o());
        }
        if ((iF & 2) != 0) {
            this.f20437C.Y(dVar.E());
        }
        if ((iF & 4) != 0) {
            this.f20437C.J(dVar.f());
        }
        if ((iF & 8) != 0) {
            this.f20437C.d0(dVar.z());
        }
        if ((iF & 16) != 0) {
            this.f20437C.e0(dVar.v());
        }
        if ((iF & 32) != 0) {
            this.f20437C.Z(dVar.J());
            if (dVar.J() > 0.0f && !this.f20455U && (aVar = this.f20441G) != null) {
                aVar.b();
            }
        }
        if ((iF & 64) != 0) {
            this.f20437C.K(dVar.k());
        }
        if ((iF & 128) != 0) {
            this.f20437C.b0(dVar.M());
        }
        if ((iF & 1024) != 0) {
            this.f20437C.V(dVar.u());
        }
        if ((iF & 256) != 0) {
            this.f20437C.T(dVar.B());
        }
        if ((iF & 512) != 0) {
            this.f20437C.U(dVar.r());
        }
        if ((iF & 2048) != 0) {
            this.f20437C.L(dVar.x());
        }
        if (i6 != 0) {
            if (androidx.compose.ui.graphics.f.e(this.f20451Q, androidx.compose.ui.graphics.f.f19784b.a())) {
                c7053c = this.f20437C;
                jA = p131n0.g.f51312b.b();
            } else {
                c7053c = this.f20437C;
                jA = p131n0.h.a(androidx.compose.ui.graphics.f.f(this.f20451Q) * Y0.t.g(this.f20442H), androidx.compose.ui.graphics.f.g(this.f20451Q) * Y0.t.f(this.f20442H));
            }
            c7053c.P(jA);
        }
        if ((iF & 16384) != 0) {
            this.f20437C.M(dVar.s());
        }
        if ((131072 & iF) != 0) {
            p171r0.C7053c c7053c2 = this.f20437C;
            dVar.H();
            c7053c2.S(null);
        }
        if ((32768 & iF) != 0) {
            p171r0.C7053c c7053c3 = this.f20437C;
            int iT = dVar.t();
            androidx.compose.ui.graphics.a.C0377a c0377a = androidx.compose.ui.graphics.a.f19739a;
            if (androidx.compose.ui.graphics.a.e(iT, c0377a.a())) {
                iB = p171r0.AbstractC7052b.f53526a.a();
            } else if (androidx.compose.ui.graphics.a.e(iT, c0377a.c())) {
                iB = p171r0.AbstractC7052b.f53526a.c();
            } else {
                if (!androidx.compose.ui.graphics.a.e(iT, c0377a.b())) {
                    throw new java.lang.IllegalStateException("Not supported composition strategy");
                }
                iB = p171r0.AbstractC7052b.f53526a.b();
            }
            c7053c3.N(iB);
        }
        if (p247y7.AbstractC7350t.b(this.f20452R, dVar.G())) {
            z6 = false;
        } else {
            this.f20452R = dVar.G();
            s();
            z6 = true;
        }
        this.f20450P = dVar.F();
        if (iF != 0 || z6) {
            q();
        }
    }

    @Override // F0.m0
    public long f(long j6, boolean z6) {
        if (!z6) {
            return p141o0.J1.f(o(), j6);
        }
        float[] fArrN = n();
        return fArrN != null ? p141o0.J1.f(fArrN, j6) : p131n0.g.f51312b.a();
    }

    @Override // F0.m0
    public void g(long j6) {
        if (Y0.t.e(j6, this.f20442H)) {
            return;
        }
        this.f20442H = j6;
        invalidate();
    }

    @Override // F0.m0
    public void h(float[] fArr) {
        float[] fArrN = n();
        if (fArrN != null) {
            p141o0.J1.n(fArr, fArrN);
        }
    }

    @Override // F0.m0
    public void i(long j6) {
        this.f20437C.c0(j6);
        q();
    }

    @Override // F0.m0
    public void invalidate() {
        if (this.f20446L || this.f20443I) {
            return;
        }
        this.f20439E.invalidate();
        p(true);
    }

    @Override // F0.m0
    public void j() {
        if (this.f20446L) {
            if (!androidx.compose.ui.graphics.f.e(this.f20451Q, androidx.compose.ui.graphics.f.f19784b.a()) && !Y0.t.e(this.f20437C.v(), this.f20442H)) {
                this.f20437C.P(p131n0.h.a(androidx.compose.ui.graphics.f.f(this.f20451Q) * Y0.t.g(this.f20442H), androidx.compose.ui.graphics.f.g(this.f20451Q) * Y0.t.f(this.f20442H)));
            }
            this.f20437C.E(this.f20447M, this.f20448N, this.f20442H, this.f20456V);
            p(false);
        }
    }

    @Override // F0.m0
    public void k(p131n0.e eVar, boolean z6) {
        if (!z6) {
            p141o0.J1.g(o(), eVar);
            return;
        }
        float[] fArrN = n();
        if (fArrN == null) {
            eVar.g(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            p141o0.J1.g(fArrN, eVar);
        }
    }
}
