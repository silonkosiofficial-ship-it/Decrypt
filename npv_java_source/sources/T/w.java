package T;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f12878D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ M0.P f12879E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.p f12880F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f12881G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j6, M0.P p6, p237x7.p pVar, int i6) {
            super(2);
            this.f12878D = j6;
            this.f12879E = p6;
            this.f12880F = pVar;
            this.f12881G = i6;
        }

        public final void a(V.InterfaceC1734n interfaceC1734n, int i6) {
            T.w.a(this.f12878D, this.f12879E, this.f12880F, interfaceC1734n, V.S0.a(this.f12881G | 1));
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((V.InterfaceC1734n) obj, ((java.lang.Number) obj2).intValue());
            return p087i7.M.f46721a;
        }
    }

    public static final void a(long j6, M0.P p6, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        int i10;
        V.InterfaceC1734n interfaceC1734nR = interfaceC1734n.r(-716124955);
        if ((i6 & 6) == 0) {
            i10 = (interfaceC1734nR.j(j6) ? 4 : 2) | i6;
        } else {
            i10 = i6;
        }
        if ((i6 & 48) == 0) {
            i10 |= interfaceC1734nR.S(p6) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i10 |= interfaceC1734nR.l(pVar) ? 256 : 128;
        }
        if ((i10 & 147) == 146 && interfaceC1734nR.u()) {
            interfaceC1734nR.A();
        } else {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.Q(-716124955, i10, -1, "androidx.compose.material3.internal.ProvideContentColorTextStyle (ProvideContentColorTextStyle.kt:38)");
            }
            V.AbstractC1756y.b(new V.P0[]{S.J.a().d(p141o0.C7016y0.i(j6)), S.m1.c().d(((M0.P) interfaceC1734nR.n(S.m1.c())).I(p6))}, pVar, interfaceC1734nR, V.P0.f14698i | ((i10 >> 3) & 112));
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
        }
        V.InterfaceC1709e1 interfaceC1709e1X = interfaceC1734nR.x();
        if (interfaceC1709e1X != null) {
            interfaceC1709e1X.a(new T.w.a(j6, p6, pVar, i6));
        }
    }
}
