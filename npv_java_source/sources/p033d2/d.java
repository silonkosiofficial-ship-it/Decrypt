package p033d2;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class d {
    public static final androidx.lifecycle.T a(androidx.lifecycle.Y y6, F7.c cVar, java.lang.String str, androidx.lifecycle.V.c cVar2, p023c2.a aVar) {
        androidx.lifecycle.V vA;
        p247y7.AbstractC7350t.f(y6, "<this>");
        p247y7.AbstractC7350t.f(cVar, "modelClass");
        p247y7.AbstractC7350t.f(aVar, "extras");
        if (cVar2 != null) {
            vA = androidx.lifecycle.V.f22790b.a(y6.n(), cVar2, aVar);
        } else {
            vA = y6 instanceof androidx.lifecycle.InterfaceC2077i ? androidx.lifecycle.V.f22790b.a(y6.n(), ((androidx.lifecycle.InterfaceC2077i) y6).j(), aVar) : androidx.lifecycle.V.b.d(androidx.lifecycle.V.f22790b, y6, null, null, 6, null);
        }
        return str != null ? vA.c(str, cVar) : vA.a(cVar);
    }

    public static final androidx.lifecycle.T b(F7.c cVar, androidx.lifecycle.Y y6, java.lang.String str, androidx.lifecycle.V.c cVar2, p023c2.a aVar, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        p247y7.AbstractC7350t.f(cVar, "modelClass");
        interfaceC1734n.f(1673618944);
        if ((i10 & 2) != 0 && (y6 = p033d2.a.f44287a.a(interfaceC1734n, 6)) == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            cVar2 = null;
        }
        if ((i10 & 16) != 0) {
            aVar = y6 instanceof androidx.lifecycle.InterfaceC2077i ? ((androidx.lifecycle.InterfaceC2077i) y6).k() : p023c2.a.C0466a.f24405b;
        }
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(1673618944, i6, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.kt:102)");
        }
        androidx.lifecycle.T tA = p033d2.c.a(y6, cVar, str, cVar2, aVar);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        interfaceC1734n.P();
        return tA;
    }
}
