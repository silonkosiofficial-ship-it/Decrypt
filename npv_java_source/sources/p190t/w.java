package p190t;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p200u.C7180l0 f54548a = p200u.AbstractC7177k.j(0.0f, 0.0f, null, 7, null);

    public static final V.G1 a(long j6, p200u.InterfaceC7175j interfaceC7175j, java.lang.String str, p237x7.l lVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        p200u.InterfaceC7175j interfaceC7175j2 = (i10 & 2) != 0 ? f54548a : interfaceC7175j;
        java.lang.String str2 = (i10 & 4) != 0 ? "ColorAnimation" : str;
        p237x7.l lVar2 = (i10 & 8) != 0 ? null : lVar;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-451899108, i6, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)");
        }
        boolean zS = interfaceC1734n.S(p141o0.C7016y0.r(j6));
        java.lang.Object objG = interfaceC1734n.g();
        if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = (p200u.x0) p190t.j.a(p141o0.C7016y0.f52264b).l(p141o0.C7016y0.r(j6));
            interfaceC1734n.K(objG);
        }
        int i11 = i6 << 6;
        V.G1 g1E = p200u.AbstractC7161c.e(p141o0.C7016y0.i(j6), (p200u.x0) objG, interfaceC7175j2, null, str2, lVar2, interfaceC1734n, (i6 & 14) | ((i6 << 3) & 896) | (57344 & i11) | (i11 & 458752), 8);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return g1E;
    }
}
