package A;

/* JADX INFO: renamed from: A.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0775i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final D0.I f118a = new A.C0776j(A.C0768b.f80a.g(), p071h0.c.f45778a.k());

    public static final D0.I a(A.C0768b.m mVar, h0.c.b bVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        D0.I i10;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(1089876336, i6, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:106)");
        }
        if (p247y7.AbstractC7350t.b(mVar, A.C0768b.f80a.g()) && p247y7.AbstractC7350t.b(bVar, p071h0.c.f45778a.k())) {
            interfaceC1734n.T(345962472);
            interfaceC1734n.J();
            i10 = f118a;
        } else {
            interfaceC1734n.T(346016319);
            boolean z6 = ((((i6 & 14) ^ 6) > 4 && interfaceC1734n.S(mVar)) || (i6 & 6) == 4) | ((((i6 & 112) ^ 48) > 32 && interfaceC1734n.S(bVar)) || (i6 & 48) == 32);
            java.lang.Object objG = interfaceC1734n.g();
            if (z6 || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new A.C0776j(mVar, bVar);
                interfaceC1734n.K(objG);
            }
            i10 = (A.C0776j) objG;
            interfaceC1734n.J();
        }
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return i10;
    }

    public static final long b(boolean z6, int i6, int i10, int i11, int i12) {
        return !z6 ? Y0.c.a(i10, i12, i6, i11) : Y0.C1859b.f16201b.a(i10, i12, i6, i11);
    }
}
