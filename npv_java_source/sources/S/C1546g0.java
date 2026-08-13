package S;

/* JADX INFO: renamed from: S.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1546g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S.C1546g0 f11090a = new S.C1546g0();

    private C1546g0() {
    }

    public final S.C1544f0 a(S.C1591z c1591z, long j6) {
        S.C1544f0 c1544f0H = c1591z.h();
        if (c1544f0H != null) {
            return c1544f0H;
        }
        p141o0.C7016y0.a aVar = p141o0.C7016y0.f52264b;
        S.C1544f0 c1544f0 = new S.C1544f0(aVar.f(), j6, aVar.f(), p141o0.C7016y0.m(j6, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        c1591z.g0(c1544f0);
        return c1544f0;
    }

    public final S.C1544f0 b(V.InterfaceC1734n interfaceC1734n, int i6) {
        interfaceC1734n.T(-1519621781);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1519621781, i6, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:592)");
        }
        long jW = ((p141o0.C7016y0) interfaceC1734n.n(S.J.a())).w();
        S.C1544f0 c1544f0A = a(S.C1562o0.f11478a.a(interfaceC1734n, 6), jW);
        if (p141o0.C7016y0.o(c1544f0A.e(), jW)) {
            if (V.AbstractC1741q.H()) {
                V.AbstractC1741q.P();
            }
            interfaceC1734n.J();
            return c1544f0A;
        }
        S.C1544f0 c1544f0C = c1544f0A.c((5 & 1) != 0 ? c1544f0A.f11075a : 0L, (5 & 2) != 0 ? c1544f0A.f11076b : jW, (5 & 4) != 0 ? c1544f0A.f11077c : 0L, (5 & 8) != 0 ? c1544f0A.f11078d : p141o0.C7016y0.m(jW, 0.38f, 0.0f, 0.0f, 0.0f, 14, null));
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        interfaceC1734n.J();
        return c1544f0C;
    }
}
