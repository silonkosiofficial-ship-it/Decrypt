package p210v;

/* JADX INFO: renamed from: v.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7212f extends F0.AbstractC0927m {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private p210v.C7210d f55689R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f55690S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private p141o0.AbstractC6984n0 f55691T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private p141o0.e2 f55692U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final p111l0.c f55693V;

    /* JADX INFO: renamed from: v.f$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ o0.L1.a f55694D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p141o0.AbstractC6984n0 f55695E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o0.L1.a aVar, p141o0.AbstractC6984n0 abstractC6984n0) {
            super(1);
            this.f55694D = aVar;
            this.f55695E = abstractC6984n0;
        }

        public final void a(p161q0.c cVar) {
            cVar.l1();
            p161q0.f.j(cVar, this.f55694D.b(), this.f55695E, 0.0f, null, null, 0, 60, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p161q0.c) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: v.f$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p131n0.i f55696D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p247y7.O f55697E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ long f55698F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p141o0.AbstractC7019z0 f55699G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p131n0.i iVar, p247y7.O o6, long j6, p141o0.AbstractC7019z0 abstractC7019z0) {
            super(1);
            this.f55696D = iVar;
            this.f55697E = o6;
            this.f55698F = j6;
            this.f55699G = abstractC7019z0;
        }

        public final void a(p161q0.c cVar) {
            cVar.l1();
            float fI = this.f55696D.i();
            float fL = this.f55696D.l();
            p247y7.O o6 = this.f55697E;
            long j6 = this.f55698F;
            p141o0.AbstractC7019z0 abstractC7019z0 = this.f55699G;
            cVar.F0().c().d(fI, fL);
            try {
                p161q0.f.f(cVar, (p141o0.E1) o6.f57254C, 0L, j6, 0L, 0L, 0.0f, null, abstractC7019z0, 0, 0, 890, null);
            } finally {
                cVar.F0().c().d(-fI, -fL);
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p161q0.c) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: v.f$c */
    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f55700D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p141o0.AbstractC6984n0 f55701E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ long f55702F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ float f55703G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ float f55704H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ long f55705I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ long f55706J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ p161q0.m f55707K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z6, p141o0.AbstractC6984n0 abstractC6984n0, long j6, float f6, float f10, long j10, long j11, p161q0.m mVar) {
            super(1);
            this.f55700D = z6;
            this.f55701E = abstractC6984n0;
            this.f55702F = j6;
            this.f55703G = f6;
            this.f55704H = f10;
            this.f55705I = j10;
            this.f55706J = j11;
            this.f55707K = mVar;
        }

        public final void a(p161q0.c cVar) throws java.lang.Throwable {
            long j6;
            cVar.l1();
            if (this.f55700D) {
                p161q0.f.n(cVar, this.f55701E, 0L, 0L, this.f55702F, 0.0f, null, null, 0, 246, null);
                return;
            }
            float fD = p131n0.a.d(this.f55702F);
            float f6 = this.f55703G;
            if (fD >= f6) {
                p161q0.f.n(cVar, this.f55701E, this.f55705I, this.f55706J, p210v.AbstractC7211e.k(this.f55702F, f6), 0.0f, this.f55707K, null, 0, 208, null);
                return;
            }
            float f10 = this.f55704H;
            float fI = p131n0.m.i(cVar.i()) - this.f55704H;
            float fG = p131n0.m.g(cVar.i()) - this.f55704H;
            int iA = p141o0.AbstractC7013x0.f52260a.a();
            p141o0.AbstractC6984n0 abstractC6984n0 = this.f55701E;
            long j10 = this.f55702F;
            p161q0.d dVarF0 = cVar.F0();
            long jI = dVarF0.i();
            dVarF0.h().m();
            try {
                dVarF0.c().c(f10, f10, fI, fG, iA);
                j6 = jI;
                try {
                    p161q0.f.n(cVar, abstractC6984n0, 0L, 0L, j10, 0.0f, null, null, 0, 246, null);
                    dVarF0.h().s();
                    dVarF0.d(j6);
                } catch (java.lang.Throwable th) {
                    th = th;
                    dVarF0.h().s();
                    dVarF0.d(j6);
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                j6 = jI;
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) throws java.lang.Throwable {
            a((p161q0.c) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: v.f$d */
    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p141o0.Q1 f55708D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p141o0.AbstractC6984n0 f55709E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p141o0.Q1 q6, p141o0.AbstractC6984n0 abstractC6984n0) {
            super(1);
            this.f55708D = q6;
            this.f55709E = abstractC6984n0;
        }

        public final void a(p161q0.c cVar) {
            cVar.l1();
            p161q0.f.j(cVar, this.f55708D, this.f55709E, 0.0f, null, null, 0, 60, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p161q0.c) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: v.f$e */
    static final class e extends p247y7.AbstractC7352v implements p237x7.l {
        e() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p111l0.h l(p111l0.d dVar) {
            if (dVar.B0(p210v.C7212f.this.f2()) < 0.0f || p131n0.m.h(dVar.i()) <= 0.0f) {
                return p210v.AbstractC7211e.i(dVar);
            }
            float f6 = 2;
            float fMin = java.lang.Math.min(Y0.i.s(p210v.C7212f.this.f2(), Y0.i.f16208D.a()) ? 1.0f : (float) java.lang.Math.ceil(dVar.B0(p210v.C7212f.this.f2())), (float) java.lang.Math.ceil(p131n0.m.h(dVar.i()) / f6));
            float f10 = fMin / f6;
            long jA = p131n0.h.a(f10, f10);
            long jA2 = p131n0.n.a(p131n0.m.i(dVar.i()) - fMin, p131n0.m.g(dVar.i()) - fMin);
            boolean z6 = f6 * fMin > p131n0.m.h(dVar.i());
            p141o0.L1 l1A = p210v.C7212f.this.e2().a(dVar.i(), dVar.getLayoutDirection(), dVar);
            if (l1A instanceof o0.L1.a) {
                p210v.C7212f c7212f = p210v.C7212f.this;
                return c7212f.b2(dVar, c7212f.d2(), (o0.L1.a) l1A, z6, fMin);
            }
            if (l1A instanceof o0.L1.c) {
                p210v.C7212f c7212f2 = p210v.C7212f.this;
                return c7212f2.c2(dVar, c7212f2.d2(), (o0.L1.c) l1A, jA, jA2, z6, fMin);
            }
            if (l1A instanceof o0.L1.b) {
                return p210v.AbstractC7211e.j(dVar, p210v.C7212f.this.d2(), jA, jA2, z6, fMin);
            }
            throw new p087i7.s();
        }
    }

    private C7212f(float f6, p141o0.AbstractC6984n0 abstractC6984n0, p141o0.e2 e2Var) {
        this.f55690S = f6;
        this.f55691T = abstractC6984n0;
        this.f55692U = e2Var;
        this.f55693V = (p111l0.c) T1(androidx.compose.ui.draw.b.a(new p210v.C7212f.e()));
    }

    public /* synthetic */ C7212f(float f6, p141o0.AbstractC6984n0 abstractC6984n0, p141o0.e2 e2Var, p247y7.AbstractC7342k abstractC7342k) {
        this(f6, abstractC6984n0, e2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x00db  */
    public final p111l0.h b2(p111l0.d dVar, p141o0.AbstractC6984n0 abstractC6984n0, o0.L1.a aVar, boolean z6, float f6) throws java.lang.Throwable {
        int iB;
        p141o0.AbstractC7019z0 abstractC7019z0B;
        boolean z10;
        p141o0.InterfaceC6993q0 interfaceC6993q0;
        p141o0.E1 e6;
        float f10;
        long j6;
        p161q0.d dVar2;
        if (z6) {
            return dVar.s(new p210v.C7212f.a(aVar, abstractC6984n0));
        }
        if (abstractC6984n0 instanceof p141o0.f2) {
            iB = p141o0.F1.f52118b.a();
            abstractC7019z0B = p141o0.AbstractC7019z0.a.b(p141o0.AbstractC7019z0.f52280b, ((p141o0.f2) abstractC6984n0).b(), 0, 2, null);
        } else {
            iB = p141o0.F1.f52118b.b();
            abstractC7019z0B = null;
        }
        p131n0.i bounds = aVar.b().getBounds();
        if (this.f55689R == null) {
            this.f55689R = new p210v.C7210d(null, null, null, null, 15, null);
        }
        p210v.C7210d c7210d = this.f55689R;
        p247y7.AbstractC7350t.c(c7210d);
        p141o0.Q1 q1G = c7210d.g();
        q1G.a();
        p141o0.P1.b(q1G, bounds, null, 2, null);
        q1G.j(q1G, aVar.b(), p141o0.U1.f52166a.a());
        p247y7.O o6 = new p247y7.O();
        long jA = Y0.u.a((int) java.lang.Math.ceil(bounds.n()), (int) java.lang.Math.ceil(bounds.h()));
        p210v.C7210d c7210d2 = this.f55689R;
        p247y7.AbstractC7350t.c(c7210d2);
        p141o0.E1 e10 = c7210d2.f55680a;
        p141o0.InterfaceC6993q0 interfaceC6993q1 = c7210d2.f55681b;
        p141o0.F1 f1F = e10 != null ? p141o0.F1.f(e10.b()) : null;
        if (!(f1F == null ? false : p141o0.F1.i(f1F.l(), p141o0.F1.f52118b.b()))) {
            z10 = p141o0.F1.h(iB, e10 != null ? p141o0.F1.f(e10.b()) : null);
        }
        if (e10 == null || interfaceC6993q1 == null || p131n0.m.i(dVar.i()) > e10.getWidth() || p131n0.m.g(dVar.i()) > e10.getHeight() || !z10) {
            p141o0.E1 e1B = p141o0.G1.b(Y0.t.g(jA), Y0.t.f(jA), iB, false, null, 24, null);
            c7210d2.f55680a = e1B;
            p141o0.InterfaceC6993q0 interfaceC6993q0A = p141o0.AbstractC6998s0.a(e1B);
            c7210d2.f55681b = interfaceC6993q0A;
            interfaceC6993q0 = interfaceC6993q0A;
            e6 = e1B;
        } else {
            e6 = e10;
            interfaceC6993q0 = interfaceC6993q1;
        }
        p161q0.a aVar2 = c7210d2.f55682c;
        if (aVar2 == null) {
            aVar2 = new p161q0.a();
            c7210d2.f55682c = aVar2;
        }
        p161q0.a aVar3 = aVar2;
        long jD = Y0.u.d(jA);
        Y0.v layoutDirection = dVar.getLayoutDirection();
        p161q0.a.C0685a c0685aH = aVar3.H();
        Y0.e eVarA = c0685aH.a();
        Y0.v vVarB = c0685aH.b();
        p141o0.InterfaceC6993q0 interfaceC6993q0C = c0685aH.c();
        long jD2 = c0685aH.d();
        p161q0.a.C0685a c0685aH2 = aVar3.H();
        c0685aH2.j(dVar);
        c0685aH2.k(layoutDirection);
        c0685aH2.i(interfaceC6993q0);
        c0685aH2.l(jD);
        interfaceC6993q0.m();
        long jA2 = p141o0.C7016y0.f52264b.a();
        p141o0.AbstractC6960f0.a aVar4 = p141o0.AbstractC6960f0.f52197a;
        p161q0.f.m(aVar3, jA2, 0L, jD, 0.0f, null, null, aVar4.a(), 58, null);
        float f11 = -bounds.i();
        float f12 = -bounds.l();
        aVar3.F0().c().d(f11, f12);
        try {
            f12 = f12;
            f10 = f11;
            try {
                p161q0.f.j(aVar3, aVar.b(), abstractC6984n0, 0.0f, new p161q0.m(f6 * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
                float f13 = 1;
                float fI = (p131n0.m.i(aVar3.i()) + f13) / p131n0.m.i(aVar3.i());
                float fG = (p131n0.m.g(aVar3.i()) + f13) / p131n0.m.g(aVar3.i());
                long jW0 = aVar3.W0();
                p161q0.d dVarF0 = aVar3.F0();
                long jI = dVarF0.i();
                dVarF0.h().m();
                try {
                    dVarF0.c().e(fI, fG, jW0);
                    dVar2 = dVarF0;
                    try {
                        p161q0.f.j(aVar3, q1G, abstractC6984n0, 0.0f, null, null, aVar4.a(), 28, null);
                        dVar2.h().s();
                        dVar2.d(jI);
                        aVar3.F0().c().d(-f10, -f12);
                        interfaceC6993q0.s();
                        p161q0.a.C0685a c0685aH3 = aVar3.H();
                        c0685aH3.j(eVarA);
                        c0685aH3.k(vVarB);
                        c0685aH3.i(interfaceC6993q0C);
                        c0685aH3.l(jD2);
                        e6.a();
                        o6.f57254C = e6;
                        return dVar.s(new p210v.C7212f.b(bounds, o6, jA, abstractC7019z0B));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        j6 = jI;
                        try {
                            dVar2.h().s();
                            dVar2.d(j6);
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            aVar3.F0().c().d(-f10, -f12);
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    j6 = jI;
                    dVar2 = dVarF0;
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                f12 = f12;
                f10 = f10;
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            f10 = f11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p111l0.h c2(p111l0.d dVar, p141o0.AbstractC6984n0 abstractC6984n0, o0.L1.c cVar, long j6, long j10, boolean z6, float f6) {
        if (p131n0.l.e(cVar.b())) {
            return dVar.s(new p210v.C7212f.c(z6, abstractC6984n0, cVar.b().h(), f6 / 2, f6, j6, j10, new p161q0.m(f6, 0.0f, 0, 0, null, 30, null)));
        }
        if (this.f55689R == null) {
            this.f55689R = new p210v.C7210d(null, null, null, null, 15, null);
        }
        p210v.C7210d c7210d = this.f55689R;
        p247y7.AbstractC7350t.c(c7210d);
        return dVar.s(new p210v.C7212f.d(p210v.AbstractC7211e.h(c7210d.g(), cVar.b(), f6, z6), abstractC6984n0));
    }

    public final p141o0.AbstractC6984n0 d2() {
        return this.f55691T;
    }

    public final p141o0.e2 e2() {
        return this.f55692U;
    }

    public final float f2() {
        return this.f55690S;
    }

    public final void g2(p141o0.AbstractC6984n0 abstractC6984n0) {
        if (p247y7.AbstractC7350t.b(this.f55691T, abstractC6984n0)) {
            return;
        }
        this.f55691T = abstractC6984n0;
        this.f55693V.N();
    }

    public final void h2(float f6) {
        if (Y0.i.s(this.f55690S, f6)) {
            return;
        }
        this.f55690S = f6;
        this.f55693V.N();
    }

    public final void l0(p141o0.e2 e2Var) {
        if (p247y7.AbstractC7350t.b(this.f55692U, e2Var)) {
            return;
        }
        this.f55692U = e2Var;
        this.f55693V.N();
    }
}
