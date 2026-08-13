package B;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V.InterfaceC1745s0 f285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V.InterfaceC1745s0 f286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.Object f288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final D.A f289e;

    public B(int i6, int i10) {
        this.f285a = V.AbstractC1730l1.a(i6);
        this.f286b = V.AbstractC1730l1.a(i10);
        this.f289e = new D.A(i6, 30, 100);
    }

    private final void f(int i6) {
        this.f286b.i(i6);
    }

    private final void g(int i6, int i10) {
        if (i6 >= 0.0f) {
            e(i6);
            this.f289e.n(i6);
            f(i10);
        } else {
            throw new java.lang.IllegalArgumentException(("Index should be non-negative (" + i6 + ')').toString());
        }
    }

    public final int a() {
        return this.f285a.d();
    }

    public final D.A b() {
        return this.f289e;
    }

    public final int c() {
        return this.f286b.d();
    }

    public final void d(int i6, int i10) {
        g(i6, i10);
        this.f288d = null;
    }

    public final void e(int i6) {
        this.f285a.i(i6);
    }

    public final void h(B.s sVar) {
        B.t tVarS = sVar.s();
        this.f288d = tVarS != null ? tVarS.getKey() : null;
        if (this.f287c || sVar.d() > 0) {
            this.f287c = true;
            int iT = sVar.t();
            if (iT >= 0.0f) {
                B.t tVarS2 = sVar.s();
                g(tVarS2 != null ? tVarS2.getIndex() : 0, iT);
            } else {
                throw new java.lang.IllegalStateException(("scrollOffset should be non-negative (" + iT + ')').toString());
            }
        }
    }

    public final void i(int i6) {
        if (i6 >= 0.0f) {
            f(i6);
            return;
        }
        throw new java.lang.IllegalStateException(("scrollOffset should be non-negative (" + i6 + ')').toString());
    }

    public final int j(B.m mVar, int i6) {
        int iA = D.t.a(mVar, this.f288d, i6);
        if (i6 != iA) {
            e(iA);
            this.f289e.n(i6);
        }
        return iA;
    }
}
