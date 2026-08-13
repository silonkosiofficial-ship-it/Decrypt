package R;

/* JADX INFO: loaded from: classes.dex */
public final class e extends R.f {
    private e(boolean z6, float f6, V.G1 g6) {
        super(z6, f6, g6, null);
    }

    public /* synthetic */ e(boolean z6, float f6, V.G1 g6, p247y7.AbstractC7342k abstractC7342k) {
        this(z6, f6, g6);
    }

    @Override // R.f
    public R.o c(p250z.j jVar, boolean z6, float f6, V.G1 g6, V.G1 g10, V.InterfaceC1734n interfaceC1734n, int i6) {
        interfaceC1734n.T(331259447);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(331259447, i6, -1, "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:92)");
        }
        android.view.ViewGroup viewGroupE = R.t.e((android.view.View) interfaceC1734n.n(androidx.compose.ui.platform.T.i()));
        boolean zS = ((((i6 & 14) ^ 6) > 4 && interfaceC1734n.S(jVar)) || (i6 & 6) == 4) | ((((458752 & i6) ^ 196608) > 131072 && interfaceC1734n.S(this)) || (i6 & 196608) == 131072) | interfaceC1734n.S(viewGroupE);
        java.lang.Object objG = interfaceC1734n.g();
        if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = new R.a(z6, f6, g6, g10, viewGroupE, null);
            interfaceC1734n.K(objG);
        }
        R.a aVar = (R.a) objG;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        interfaceC1734n.J();
        return aVar;
    }
}
