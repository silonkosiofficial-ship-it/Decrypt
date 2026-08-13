package A;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final D0.I f9a = new A.J(A.C0768b.f80a.f(), p071h0.c.f45778a.l());

    public static final long a(boolean z6, int i6, int i10, int i11, int i12) {
        return !z6 ? Y0.c.a(i6, i11, i10, i12) : Y0.C1859b.f16201b.b(i6, i11, i10, i12);
    }

    public static final D0.I b(A.C0768b.e eVar, p071h0.c.InterfaceC0526c interfaceC0526c, V.InterfaceC1734n interfaceC1734n, int i6) {
        D0.I i10;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-837807694, i6, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:122)");
        }
        if (p247y7.AbstractC7350t.b(eVar, A.C0768b.f80a.f()) && p247y7.AbstractC7350t.b(interfaceC0526c, p071h0.c.f45778a.l())) {
            interfaceC1734n.T(-849081669);
            interfaceC1734n.J();
            i10 = f9a;
        } else {
            interfaceC1734n.T(-849030798);
            boolean z6 = ((((i6 & 14) ^ 6) > 4 && interfaceC1734n.S(eVar)) || (i6 & 6) == 4) | ((((i6 & 112) ^ 48) > 32 && interfaceC1734n.S(interfaceC0526c)) || (i6 & 48) == 32);
            java.lang.Object objG = interfaceC1734n.g();
            if (z6 || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new A.J(eVar, interfaceC0526c);
                interfaceC1734n.K(objG);
            }
            i10 = (A.J) objG;
            interfaceC1734n.J();
        }
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return i10;
    }
}
