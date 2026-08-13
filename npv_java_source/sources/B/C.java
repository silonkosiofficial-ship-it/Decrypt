package B;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {
    public static final D.E a(B.D d6, boolean z6, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(596174919, i6, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazyListSemantics.kt:26)");
        }
        boolean z10 = ((((i6 & 14) ^ 6) > 4 && interfaceC1734n.S(d6)) || (i6 & 6) == 4) | ((((i6 & 112) ^ 48) > 32 && interfaceC1734n.d(z6)) || (i6 & 48) == 32);
        java.lang.Object objG = interfaceC1734n.g();
        if (z10 || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = B.AbstractC0794e.a(d6, z6);
            interfaceC1734n.K(objG);
        }
        D.E e6 = (D.E) objG;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return e6;
    }
}
