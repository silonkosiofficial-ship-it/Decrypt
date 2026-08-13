package androidx.compose.foundation.lazy;

/* JADX INFO: loaded from: classes.dex */
final class b extends androidx.compose.ui.d.c implements F0.E {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private float f19348P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private V.G1 f19349Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private V.G1 f19350R;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X f19351D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D0.X x6) {
            super(1);
            this.f19351D = x6;
        }

        public final void a(D0.X.a aVar) {
            D0.X.a.h(aVar, this.f19351D, 0, 0, 0.0f, 4, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    public b(float f6, V.G1 g6, V.G1 g10) {
        this.f19348P = f6;
        this.f19349Q = g6;
        this.f19350R = g10;
    }

    @Override // F0.E
    public /* synthetic */ int C(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.d(this, interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // F0.E
    public /* synthetic */ int F(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.b(this, interfaceC0896o, interfaceC0895n, i6);
    }

    public final void T1(float f6) {
        this.f19348P = f6;
    }

    public final void U1(V.G1 g6) {
        this.f19350R = g6;
    }

    public final void V1(V.G1 g6) {
        this.f19349Q = g6;
    }

    @Override // F0.E
    public D0.K f(D0.M m6, D0.G g6, long j6) {
        V.G1 g10 = this.f19349Q;
        int iRound = (g10 == null || ((java.lang.Number) g10.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : java.lang.Math.round(((java.lang.Number) g10.getValue()).floatValue() * this.f19348P);
        V.G1 g11 = this.f19350R;
        int iRound2 = (g11 == null || ((java.lang.Number) g11.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : java.lang.Math.round(((java.lang.Number) g11.getValue()).floatValue() * this.f19348P);
        int iN = iRound != Integer.MAX_VALUE ? iRound : Y0.C1859b.n(j6);
        int iM = iRound2 != Integer.MAX_VALUE ? iRound2 : Y0.C1859b.m(j6);
        if (iRound == Integer.MAX_VALUE) {
            iRound = Y0.C1859b.l(j6);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = Y0.C1859b.k(j6);
        }
        D0.X xU = g6.U(Y0.c.a(iN, iRound, iM, iRound2));
        return D0.L.b(m6, xU.I0(), xU.w0(), null, new androidx.compose.foundation.lazy.b.a(xU), 4, null);
    }

    @Override // F0.E
    public /* synthetic */ int k(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.a(this, interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // F0.E
    public /* synthetic */ int t(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.c(this, interfaceC0896o, interfaceC0895n, i6);
    }
}
