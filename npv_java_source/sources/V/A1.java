package V;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class A1 {
    public static final p051f0.r a() {
        return new p051f0.r();
    }

    public static final p051f0.r b(java.lang.Object... objArr) {
        p051f0.r rVar = new p051f0.r();
        rVar.addAll(p097j7.AbstractC6872n.R0(objArr));
        return rVar;
    }

    public static final V.InterfaceC1753w0 c(java.lang.Object obj, V.u1 u1Var) {
        return V.AbstractC1698b.d(obj, u1Var);
    }

    public static /* synthetic */ V.InterfaceC1753w0 d(java.lang.Object obj, V.u1 u1Var, int i6, java.lang.Object obj2) {
        if ((i6 & 2) != 0) {
            u1Var = V.v1.p();
        }
        return V.v1.h(obj, u1Var);
    }

    public static final V.G1 e(java.lang.Object obj, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1058319986, i6, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:309)");
        }
        java.lang.Object objG = interfaceC1734n.g();
        if (objG == V.InterfaceC1734n.f14931a.a()) {
            objG = d(obj, null, 2, null);
            interfaceC1734n.K(objG);
        }
        V.InterfaceC1753w0 interfaceC1753w0 = (V.InterfaceC1753w0) objG;
        interfaceC1753w0.setValue(obj);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return interfaceC1753w0;
    }
}
