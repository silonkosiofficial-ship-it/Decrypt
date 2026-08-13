package B;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final D.InterfaceC0876m a(B.D d6, int i6, V.InterfaceC1734n interfaceC1734n, int i10) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1877443446, i10, -1, "androidx.compose.foundation.lazy.rememberLazyListBeyondBoundsState (LazyListBeyondBoundsModifier.kt:26)");
        }
        boolean z6 = ((((i10 & 14) ^ 6) > 4 && interfaceC1734n.S(d6)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC1734n.i(i6)) || (i10 & 48) == 32);
        java.lang.Object objG = interfaceC1734n.g();
        if (z6 || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = new B.h(d6, i6);
            interfaceC1734n.K(objG);
        }
        B.h hVar = (B.h) objG;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return hVar;
    }
}
