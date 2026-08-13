package C9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x {
    public static final C9.v b(java.lang.String str, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        interfaceC1734n.T(-1149307122);
        if ((i10 & 1) != 0) {
            str = null;
        }
        java.lang.String str2 = str;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1149307122, i6, -1, "moe.tlaster.precompose.navigation.rememberNavigator (Navigator.kt:15)");
        }
        interfaceC1734n.T(395471537);
        java.lang.Object objG = interfaceC1734n.g();
        if (objG == V.InterfaceC1734n.f14931a.a()) {
            objG = new p237x7.l() { // from class: C9.w
                @Override // p237x7.l
                public final java.lang.Object l(java.lang.Object obj) {
                    return C9.x.c((p023c2.a) obj);
                }
            };
            interfaceC1734n.K(objG);
        }
        p237x7.l lVar = (p237x7.l) objG;
        interfaceC1734n.J();
        int i11 = ((i6 << 3) & 112) | 384;
        interfaceC1734n.f(419377738);
        androidx.lifecycle.Y yA = p033d2.a.f44287a.a(interfaceC1734n, 6);
        if (yA == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        F7.c cVarB = p247y7.P.b(C9.z.class);
        p023c2.c cVar = new p023c2.c();
        cVar.a(p247y7.P.b(C9.z.class), lVar);
        androidx.lifecycle.T tB = p033d2.c.b(cVarB, yA, str2, cVar.b(), yA instanceof androidx.lifecycle.InterfaceC2077i ? ((androidx.lifecycle.InterfaceC2077i) yA).k() : p023c2.a.C0466a.f24405b, interfaceC1734n, (i11 << 3) & 896, 0);
        interfaceC1734n.P();
        C9.v vVarI = ((C9.z) tB).i();
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        interfaceC1734n.J();
        return vVarI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C9.z c(p023c2.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "$this$viewModel");
        return new C9.z();
    }
}
