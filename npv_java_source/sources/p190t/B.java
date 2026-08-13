package p190t;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f54415a = android.view.ViewConfiguration.getScrollFriction();

    public static final float a() {
        return f54415a;
    }

    public static final p200u.B b(V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(904445851, i6, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        Y0.e eVar = (Y0.e) interfaceC1734n.n(androidx.compose.ui.platform.AbstractC1966p0.e());
        boolean zH = interfaceC1734n.h(eVar.getDensity());
        java.lang.Object objG = interfaceC1734n.g();
        if (zH || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = p200u.D.d(new p190t.A(eVar));
            interfaceC1734n.K(objG);
        }
        p200u.B b6 = (p200u.B) objG;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return b6;
    }
}
