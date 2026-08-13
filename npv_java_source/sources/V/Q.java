package V;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final V.N f14707a = new V.N();

    public static final void a(java.lang.Object obj, java.lang.Object obj2, p237x7.l lVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(1429097729, i6, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:195)");
        }
        boolean zS = interfaceC1734n.S(obj) | interfaceC1734n.S(obj2);
        java.lang.Object objG = interfaceC1734n.g();
        if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = new V.L(lVar);
            interfaceC1734n.K(objG);
        }
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
    }

    public static final void b(java.lang.Object obj, p237x7.l lVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1371986847, i6, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:155)");
        }
        boolean zS = interfaceC1734n.S(obj);
        java.lang.Object objG = interfaceC1734n.g();
        if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = new V.L(lVar);
            interfaceC1734n.K(objG);
        }
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
    }

    public static final void c(java.lang.Object[] objArr, p237x7.l lVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1307627122, i6, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:276)");
        }
        boolean zS = false;
        for (java.lang.Object obj : java.util.Arrays.copyOf(objArr, objArr.length)) {
            zS |= interfaceC1734n.S(obj);
        }
        java.lang.Object objG = interfaceC1734n.g();
        if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
            interfaceC1734n.K(new V.L(lVar));
        }
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
    }

    public static final void d(java.lang.Object obj, java.lang.Object obj2, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(590241125, i6, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        p127m7.i iVarC = interfaceC1734n.C();
        boolean zS = interfaceC1734n.S(obj) | interfaceC1734n.S(obj2);
        java.lang.Object objG = interfaceC1734n.g();
        if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = new V.C1708e0(iVarC, pVar);
            interfaceC1734n.K(objG);
        }
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
    }

    public static final void e(java.lang.Object obj, p237x7.p pVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(1179185413, i6, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:337)");
        }
        p127m7.i iVarC = interfaceC1734n.C();
        boolean zS = interfaceC1734n.S(obj);
        java.lang.Object objG = interfaceC1734n.g();
        if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = new V.C1708e0(iVarC, pVar);
            interfaceC1734n.K(objG);
        }
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
    }

    public static final void f(p237x7.a aVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1288466761, i6, -1, "androidx.compose.runtime.SideEffect (Effects.kt:48)");
        }
        interfaceC1734n.m(aVar);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
    }

    public static final W8.N h(p127m7.i iVar, V.InterfaceC1734n interfaceC1734n) {
        p127m7.i iVarO0;
        W8.InterfaceC1822z0.b bVar = W8.InterfaceC1822z0.f15544h;
        if (iVar.i(bVar) != null) {
            W8.InterfaceC1819y interfaceC1819yB = W8.D0.b(null, 1, null);
            interfaceC1819yB.g(new java.lang.IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            iVarO0 = interfaceC1819yB;
        } else {
            p127m7.i iVarC = interfaceC1734n.C();
            iVarO0 = iVarC.o0(W8.C0.a((W8.InterfaceC1822z0) iVarC.i(bVar))).o0(iVar);
        }
        return W8.O.a(iVarO0);
    }
}
