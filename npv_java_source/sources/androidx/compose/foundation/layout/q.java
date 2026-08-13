package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
final class q extends androidx.compose.ui.d.c implements F0.E {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private float f19325P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f19326Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private float f19327R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f19328S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f19329T;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X f19330D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D0.X x6) {
            super(1);
            this.f19330D = x6;
        }

        public final void a(D0.X.a aVar) {
            D0.X.a.l(aVar, this.f19330D, 0, 0, 0.0f, 4, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    private q(float f6, float f10, float f11, float f12, boolean z6) {
        this.f19325P = f6;
        this.f19326Q = f10;
        this.f19327R = f11;
        this.f19328S = f12;
        this.f19329T = z6;
    }

    public /* synthetic */ q(float f6, float f10, float f11, float f12, boolean z6, p247y7.AbstractC7342k abstractC7342k) {
        this(f6, f10, f11, f12, z6);
    }

    private final long T1(Y0.e eVar) {
        int iD;
        int iD2;
        float f6 = this.f19327R;
        Y0.i.a aVar = Y0.i.f16208D;
        int i6 = 0;
        int iD3 = !Y0.i.s(f6, aVar.c()) ? E7.j.d(eVar.S0(this.f19327R), 0) : Integer.MAX_VALUE;
        int iD4 = !Y0.i.s(this.f19328S, aVar.c()) ? E7.j.d(eVar.S0(this.f19328S), 0) : Integer.MAX_VALUE;
        if (Y0.i.s(this.f19325P, aVar.c()) || (iD = E7.j.d(E7.j.g(eVar.S0(this.f19325P), iD3), 0)) == Integer.MAX_VALUE) {
            iD = 0;
        }
        if (!Y0.i.s(this.f19326Q, aVar.c()) && (iD2 = E7.j.d(E7.j.g(eVar.S0(this.f19326Q), iD4), 0)) != Integer.MAX_VALUE) {
            i6 = iD2;
        }
        return Y0.c.a(iD, iD3, i6, iD4);
    }

    @Override // F0.E
    public int C(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        long jT1 = T1(interfaceC0896o);
        return Y0.C1859b.j(jT1) ? Y0.C1859b.l(jT1) : Y0.c.i(jT1, interfaceC0895n.S(i6));
    }

    @Override // F0.E
    public int F(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        long jT1 = T1(interfaceC0896o);
        return Y0.C1859b.j(jT1) ? Y0.C1859b.l(jT1) : Y0.c.i(jT1, interfaceC0895n.T(i6));
    }

    public final void U1(boolean z6) {
        this.f19329T = z6;
    }

    public final void V1(float f6) {
        this.f19328S = f6;
    }

    public final void W1(float f6) {
        this.f19327R = f6;
    }

    public final void X1(float f6) {
        this.f19326Q = f6;
    }

    public final void Y1(float f6) {
        this.f19325P = f6;
    }

    @Override // F0.E
    public D0.K f(D0.M m6, D0.G g6, long j6) {
        long jA;
        long jT1 = T1(m6);
        if (this.f19329T) {
            jA = Y0.c.g(j6, jT1);
        } else {
            float f6 = this.f19325P;
            Y0.i.a aVar = Y0.i.f16208D;
            jA = Y0.c.a(!Y0.i.s(f6, aVar.c()) ? Y0.C1859b.n(jT1) : E7.j.g(Y0.C1859b.n(j6), Y0.C1859b.l(jT1)), !Y0.i.s(this.f19327R, aVar.c()) ? Y0.C1859b.l(jT1) : E7.j.d(Y0.C1859b.l(j6), Y0.C1859b.n(jT1)), !Y0.i.s(this.f19326Q, aVar.c()) ? Y0.C1859b.m(jT1) : E7.j.g(Y0.C1859b.m(j6), Y0.C1859b.k(jT1)), !Y0.i.s(this.f19328S, aVar.c()) ? Y0.C1859b.k(jT1) : E7.j.d(Y0.C1859b.k(j6), Y0.C1859b.m(jT1)));
        }
        D0.X xU = g6.U(jA);
        return D0.L.b(m6, xU.I0(), xU.w0(), null, new androidx.compose.foundation.layout.q.a(xU), 4, null);
    }

    @Override // F0.E
    public int k(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        long jT1 = T1(interfaceC0896o);
        return Y0.C1859b.i(jT1) ? Y0.C1859b.k(jT1) : Y0.c.h(jT1, interfaceC0895n.t(i6));
    }

    @Override // F0.E
    public int t(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        long jT1 = T1(interfaceC0896o);
        return Y0.C1859b.i(jT1) ? Y0.C1859b.k(jT1) : Y0.c.h(jT1, interfaceC0895n.n0(i6));
    }
}
