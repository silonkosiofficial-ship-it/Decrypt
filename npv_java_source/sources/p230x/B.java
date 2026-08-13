package p230x;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.G1 f56293D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(V.G1 g6) {
            super(1);
            this.f56293D = g6;
        }

        public final java.lang.Float a(float f6) {
            return (java.lang.Float) ((p237x7.l) this.f56293D.getValue()).l(java.lang.Float.valueOf(f6));
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Number) obj).floatValue());
        }
    }

    public static final p230x.A a(p237x7.l lVar) {
        return new p230x.k(lVar);
    }

    public static final p230x.A b(p237x7.l lVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-180460798, i6, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:161)");
        }
        V.G1 g1N = V.v1.n(lVar, interfaceC1734n, i6 & 14);
        java.lang.Object objG = interfaceC1734n.g();
        if (objG == V.InterfaceC1734n.f14931a.a()) {
            objG = a(new x.B.a(g1N));
            interfaceC1734n.K(objG);
        }
        p230x.A a6 = (p230x.A) objG;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return a6;
    }
}
