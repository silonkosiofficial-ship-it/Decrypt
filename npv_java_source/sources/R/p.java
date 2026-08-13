package R;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p200u.w0 f9236a = new p200u.w0(15, 0, p200u.H.e(), 2, null);

    public static final F0.InterfaceC0924j c(p250z.j jVar, boolean z6, float f6, p141o0.B0 b6, p237x7.a aVar) {
        return R.t.d(jVar, z6, f6, b6, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p200u.InterfaceC7175j d(p250z.i iVar) {
        if ((iVar instanceof p250z.g) || (!(iVar instanceof p250z.d) && !(iVar instanceof p250z.b))) {
            return f9236a;
        }
        return new p200u.w0(45, 0, p200u.H.e(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p200u.InterfaceC7175j e(p250z.i iVar) {
        return ((iVar instanceof p250z.g) || (iVar instanceof p250z.d) || !(iVar instanceof p250z.b)) ? f9236a : new p200u.w0(150, 0, p200u.H.e(), 2, null);
    }

    public static final p210v.G f(boolean z6, float f6, long j6, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        boolean z10 = true;
        if ((i10 & 1) != 0) {
            z6 = true;
        }
        if ((i10 & 2) != 0) {
            f6 = Y0.i.f16208D.c();
        }
        if ((i10 & 4) != 0) {
            j6 = p141o0.C7016y0.f52264b.g();
        }
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(1635163520, i6, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:146)");
        }
        V.G1 g1N = V.v1.n(p141o0.C7016y0.i(j6), interfaceC1734n, (i6 >> 6) & 14);
        boolean z11 = (((i6 & 14) ^ 6) > 4 && interfaceC1734n.d(z6)) || (i6 & 6) == 4;
        if ((((i6 & 112) ^ 48) <= 32 || !interfaceC1734n.h(f6)) && (i6 & 48) != 32) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        java.lang.Object objG = interfaceC1734n.g();
        if (z12 || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = new R.e(z6, f6, g1N, null);
            interfaceC1734n.K(objG);
        }
        R.e eVar = (R.e) objG;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return eVar;
    }
}
