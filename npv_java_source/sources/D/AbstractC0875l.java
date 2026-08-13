package D;

/* JADX INFO: renamed from: D.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0875l {
    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, D.InterfaceC0876m interfaceC0876m, D.C0873j c0873j, boolean z6, Y0.v vVar, p230x.s sVar, boolean z10, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(1331498025, i6, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutBeyondBoundsModifier (LazyLayoutBeyondBoundsModifierLocal.kt:51)");
        }
        if (z10) {
            interfaceC1734n.T(-1890632411);
            boolean z11 = ((((i6 & 112) ^ 48) > 32 && interfaceC1734n.S(interfaceC0876m)) || (i6 & 48) == 32) | ((((i6 & 896) ^ 384) > 256 && interfaceC1734n.S(c0873j)) || (i6 & 384) == 256) | ((((i6 & 7168) ^ 3072) > 2048 && interfaceC1734n.d(z6)) || (i6 & 3072) == 2048) | ((((57344 & i6) ^ 24576) > 16384 && interfaceC1734n.S(vVar)) || (i6 & 24576) == 16384) | ((((458752 & i6) ^ 196608) > 131072 && interfaceC1734n.S(sVar)) || (i6 & 196608) == 131072);
            java.lang.Object objG = interfaceC1734n.g();
            if (z11 || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new D.C0874k(interfaceC0876m, c0873j, z6, vVar, sVar);
                interfaceC1734n.K(objG);
            }
            dVar = dVar.b((D.C0874k) objG);
        } else {
            interfaceC1734n.T(-1890658823);
        }
        interfaceC1734n.J();
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Void c() {
        throw new java.lang.IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
    }
}
