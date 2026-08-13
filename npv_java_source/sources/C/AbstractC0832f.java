package C;

/* JADX INFO: renamed from: C.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0832f {
    public static final D.InterfaceC0876m a(C.K k6, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(2004349821, i6, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridBeyondBoundsState (LazyGridBeyondBoundsModifier.kt:23)");
        }
        boolean z6 = (((i6 & 14) ^ 6) > 4 && interfaceC1734n.S(k6)) || (i6 & 6) == 4;
        java.lang.Object objG = interfaceC1734n.g();
        if (z6 || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = new C.C0833g(k6);
            interfaceC1734n.K(objG);
        }
        C.C0833g c0833g = (C.C0833g) objG;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return c0833g;
    }
}
