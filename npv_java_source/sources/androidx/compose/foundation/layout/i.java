package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
abstract class i extends androidx.compose.ui.d.c implements F0.E {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X f19265D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D0.X x6) {
            super(1);
            this.f19265D = x6;
        }

        public final void a(D0.X.a aVar) {
            D0.X.a.n(aVar, this.f19265D, Y0.p.f16221b.a(), 0.0f, 2, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    public abstract long T1(D0.M m6, D0.G g6, long j6);

    public abstract boolean U1();

    @Override // F0.E
    public final D0.K f(D0.M m6, D0.G g6, long j6) {
        long jT1 = T1(m6, g6, j6);
        if (U1()) {
            jT1 = Y0.c.g(j6, jT1);
        }
        D0.X xU = g6.U(jT1);
        return D0.L.b(m6, xU.I0(), xU.w0(), null, new androidx.compose.foundation.layout.i.a(xU), 4, null);
    }

    @Override // F0.E
    public int k(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return interfaceC0895n.t(i6);
    }

    @Override // F0.E
    public int t(D0.InterfaceC0896o interfaceC0896o, D0.InterfaceC0895n interfaceC0895n, int i6) {
        return interfaceC0895n.n0(i6);
    }
}
