package S;

/* JADX INFO: renamed from: S.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1580t0 extends androidx.compose.ui.d.c implements F0.InterfaceC0921h, F0.E {

    /* JADX INFO: renamed from: S.t0$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f11798D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ D0.X f11799E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f11800F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i6, D0.X x6, int i10) {
            super(1);
            this.f11798D = i6;
            this.f11799E = x6;
            this.f11800F = i10;
        }

        public final void a(D0.X.a aVar) {
            D0.X.a.h(aVar, this.f11799E, A7.a.d((this.f11798D - this.f11799E.I0()) / 2.0f), A7.a.d((this.f11800F - this.f11799E.w0()) / 2.0f), 0.0f, 4, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    @Override // F0.E
    public /* synthetic */ int C(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.d(this, interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // F0.E
    public /* synthetic */ int F(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return F0.D.b(this, interfaceC0896o, interfaceC0895n, i6);
    }

    @Override // F0.E
    public D0.K f(D0.M m6, D0.G g6, long j6) {
        float f6 = 0;
        float fQ = Y0.i.q(E7.j.c(((Y0.i) F0.AbstractC0923i.a(this, S.AbstractC1554k0.a())).v(), Y0.i.q(f6)));
        D0.X xU = g6.U(j6);
        boolean z6 = A1() && (java.lang.Float.isNaN(fQ) ^ true) && Y0.i.o(fQ, Y0.i.q(f6)) > 0;
        int iS0 = true ^ java.lang.Float.isNaN(fQ) ? m6.S0(fQ) : 0;
        int iI0 = xU.I0();
        if (z6) {
            iI0 = java.lang.Math.max(iI0, iS0);
        }
        int i6 = iI0;
        int iMax = z6 ? java.lang.Math.max(xU.w0(), iS0) : xU.w0();
        return D0.L.b(m6, i6, iMax, null, new S.C1580t0.a(i6, xU, iMax), 4, null);
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
