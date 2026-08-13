package C;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V.InterfaceC1745s0 f986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V.InterfaceC1745s0 f987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.Object f989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final D.A f990e;

    public F(int i6, int i10) {
        this.f986a = V.AbstractC1730l1.a(i6);
        this.f987b = V.AbstractC1730l1.a(i10);
        this.f990e = new D.A(i6, 90, 200);
    }

    private final void e(int i6) {
        this.f986a.i(i6);
    }

    private final void f(int i6) {
        this.f987b.i(i6);
    }

    private final void g(int i6, int i10) {
        if (i6 >= 0.0f) {
            e(i6);
            this.f990e.n(i6);
            f(i10);
        } else {
            throw new java.lang.IllegalArgumentException(("Index should be non-negative (" + i6 + ')').toString());
        }
    }

    public final int a() {
        return this.f986a.d();
    }

    public final D.A b() {
        return this.f990e;
    }

    public final int c() {
        return this.f987b.d();
    }

    public final void d(int i6, int i10) {
        g(i6, i10);
        this.f989d = null;
    }

    public final void h(C.u uVar) {
        C.v[] vVarArrB;
        C.v vVar;
        C.v[] vVarArrB2;
        C.v vVar2;
        C.x xVarP = uVar.p();
        this.f989d = (xVarP == null || (vVarArrB2 = xVarP.b()) == null || (vVar2 = (C.v) p097j7.AbstractC6872n.Z(vVarArrB2)) == null) ? null : vVar2.getKey();
        if (this.f988c || uVar.d() > 0) {
            this.f988c = true;
            int iQ = uVar.q();
            if (iQ >= 0.0f) {
                C.x xVarP2 = uVar.p();
                g((xVarP2 == null || (vVarArrB = xVarP2.b()) == null || (vVar = (C.v) p097j7.AbstractC6872n.Z(vVarArrB)) == null) ? 0 : vVar.getIndex(), iQ);
            } else {
                throw new java.lang.IllegalStateException(("scrollOffset should be non-negative (" + iQ + ')').toString());
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

    public final int j(C.InterfaceC0838l interfaceC0838l, int i6) {
        int iA = D.t.a(interfaceC0838l, this.f989d, i6);
        if (i6 != iA) {
            e(iA);
            this.f990e.n(i6);
        }
        return iA;
    }
}
