package D0;

/* JADX INFO: loaded from: classes.dex */
public abstract class X implements D0.O {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f1804C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f1805D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private long f1806E = Y0.u.a(0, 0);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private long f1807F = D0.Y.f1811b;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private long f1808G = Y0.p.f16221b.a();

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1809a;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void f(D0.X x6) {
            if (x6 instanceof F0.X) {
                ((F0.X) x6).g0(this.f1809a);
            }
        }

        public static /* synthetic */ void h(D0.X.a aVar, D0.X x6, int i6, int i10, float f6, int i11, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i11 & 4) != 0) {
                f6 = 0.0f;
            }
            aVar.g(x6, i6, i10, f6);
        }

        public static /* synthetic */ void j(D0.X.a aVar, D0.X x6, long j6, float f6, int i6, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i6 & 2) != 0) {
                f6 = 0.0f;
            }
            aVar.i(x6, j6, f6);
        }

        public static /* synthetic */ void l(D0.X.a aVar, D0.X x6, int i6, int i10, float f6, int i11, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i11 & 4) != 0) {
                f6 = 0.0f;
            }
            aVar.k(x6, i6, i10, f6);
        }

        public static /* synthetic */ void n(D0.X.a aVar, D0.X x6, long j6, float f6, int i6, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i6 & 2) != 0) {
                f6 = 0.0f;
            }
            aVar.m(x6, j6, f6);
        }

        public static /* synthetic */ void p(D0.X.a aVar, D0.X x6, int i6, int i10, float f6, p237x7.l lVar, int i11, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i11 & 4) != 0) {
                f6 = 0.0f;
            }
            float f10 = f6;
            if ((i11 & 8) != 0) {
                lVar = D0.Y.f1810a;
            }
            aVar.o(x6, i6, i10, f10, lVar);
        }

        public static /* synthetic */ void s(D0.X.a aVar, D0.X x6, long j6, float f6, p237x7.l lVar, int i6, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i6 & 2) != 0) {
                f6 = 0.0f;
            }
            float f10 = f6;
            if ((i6 & 4) != 0) {
                lVar = D0.Y.f1810a;
            }
            aVar.q(x6, j6, f10, lVar);
        }

        public static /* synthetic */ void t(D0.X.a aVar, D0.X x6, long j6, p171r0.C7053c c7053c, float f6, int i6, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i6 & 4) != 0) {
                f6 = 0.0f;
            }
            aVar.r(x6, j6, c7053c, f6);
        }

        public static /* synthetic */ void v(D0.X.a aVar, D0.X x6, int i6, int i10, float f6, p237x7.l lVar, int i11, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i11 & 4) != 0) {
                f6 = 0.0f;
            }
            float f10 = f6;
            if ((i11 & 8) != 0) {
                lVar = D0.Y.f1810a;
            }
            aVar.u(x6, i6, i10, f10, lVar);
        }

        public static /* synthetic */ void y(D0.X.a aVar, D0.X x6, long j6, float f6, p237x7.l lVar, int i6, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i6 & 2) != 0) {
                f6 = 0.0f;
            }
            float f10 = f6;
            if ((i6 & 4) != 0) {
                lVar = D0.Y.f1810a;
            }
            aVar.w(x6, j6, f10, lVar);
        }

        public static /* synthetic */ void z(D0.X.a aVar, D0.X x6, long j6, p171r0.C7053c c7053c, float f6, int i6, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i6 & 4) != 0) {
                f6 = 0.0f;
            }
            aVar.x(x6, j6, c7053c, f6);
        }

        public final void A(p237x7.l lVar) {
            this.f1809a = true;
            lVar.l(this);
            this.f1809a = false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract Y0.v d();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract int e();

        public final void g(D0.X x6, int i6, int i10, float f6) {
            long jA = Y0.q.a(i6, i10);
            f(x6);
            x6.R0(Y0.p.l(jA, x6.f1808G), f6, null);
        }

        public final void i(D0.X x6, long j6, float f6) {
            f(x6);
            x6.R0(Y0.p.l(j6, x6.f1808G), f6, null);
        }

        public final void k(D0.X x6, int i6, int i10, float f6) {
            long jA = Y0.q.a(i6, i10);
            if (d() != Y0.v.Ltr && e() != 0) {
                jA = Y0.q.a((e() - x6.I0()) - Y0.p.h(jA), Y0.p.i(jA));
            }
            f(x6);
            x6.R0(Y0.p.l(jA, x6.f1808G), f6, null);
        }

        public final void m(D0.X x6, long j6, float f6) {
            if (d() != Y0.v.Ltr && e() != 0) {
                j6 = Y0.q.a((e() - x6.I0()) - Y0.p.h(j6), Y0.p.i(j6));
            }
            f(x6);
            x6.R0(Y0.p.l(j6, x6.f1808G), f6, null);
        }

        public final void o(D0.X x6, int i6, int i10, float f6, p237x7.l lVar) {
            long jA = Y0.q.a(i6, i10);
            if (d() != Y0.v.Ltr && e() != 0) {
                jA = Y0.q.a((e() - x6.I0()) - Y0.p.h(jA), Y0.p.i(jA));
            }
            f(x6);
            x6.R0(Y0.p.l(jA, x6.f1808G), f6, lVar);
        }

        public final void q(D0.X x6, long j6, float f6, p237x7.l lVar) {
            if (d() != Y0.v.Ltr && e() != 0) {
                j6 = Y0.q.a((e() - x6.I0()) - Y0.p.h(j6), Y0.p.i(j6));
            }
            f(x6);
            x6.R0(Y0.p.l(j6, x6.f1808G), f6, lVar);
        }

        public final void r(D0.X x6, long j6, p171r0.C7053c c7053c, float f6) {
            if (d() != Y0.v.Ltr && e() != 0) {
                j6 = Y0.q.a((e() - x6.I0()) - Y0.p.h(j6), Y0.p.i(j6));
            }
            f(x6);
            x6.M0(Y0.p.l(j6, x6.f1808G), f6, c7053c);
        }

        public final void u(D0.X x6, int i6, int i10, float f6, p237x7.l lVar) {
            long jA = Y0.q.a(i6, i10);
            f(x6);
            x6.R0(Y0.p.l(jA, x6.f1808G), f6, lVar);
        }

        public final void w(D0.X x6, long j6, float f6, p237x7.l lVar) {
            f(x6);
            x6.R0(Y0.p.l(j6, x6.f1808G), f6, lVar);
        }

        public final void x(D0.X x6, long j6, p171r0.C7053c c7053c, float f6) {
            f(x6);
            x6.M0(Y0.p.l(j6, x6.f1808G), f6, c7053c);
        }
    }

    private final void L0() {
        this.f1804C = E7.j.k(Y0.t.g(this.f1806E), Y0.C1859b.n(this.f1807F), Y0.C1859b.l(this.f1807F));
        this.f1805D = E7.j.k(Y0.t.f(this.f1806E), Y0.C1859b.m(this.f1807F), Y0.C1859b.k(this.f1807F));
        this.f1808G = Y0.q.a((this.f1804C - Y0.t.g(this.f1806E)) / 2, (this.f1805D - Y0.t.f(this.f1806E)) / 2);
    }

    public int D0() {
        return Y0.t.g(this.f1806E);
    }

    protected final long E0() {
        return this.f1807F;
    }

    public final int I0() {
        return this.f1804C;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void M0(long j6, float f6, p171r0.C7053c c7053c) {
        R0(j6, f6, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void R0(long j6, float f6, p237x7.l lVar);

    protected final void Y0(long j6) {
        if (Y0.t.e(this.f1806E, j6)) {
            return;
        }
        this.f1806E = j6;
        L0();
    }

    public /* synthetic */ java.lang.Object Z() {
        return D0.N.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a1(long j6) {
        if (Y0.C1859b.f(this.f1807F, j6)) {
            return;
        }
        this.f1807F = j6;
        L0();
    }

    protected final long u0() {
        return this.f1808G;
    }

    public final int w0() {
        return this.f1805D;
    }

    public int x0() {
        return Y0.t.f(this.f1806E);
    }

    protected final long z0() {
        return this.f1806E;
    }
}
