package p230x;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p230x.y f56602a = new p230x.y();

    private y() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p230x.p a(V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(1107739818, i6, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:570)");
        }
        p200u.B b6 = p190t.B.b(interfaceC1734n, 0);
        boolean zS = interfaceC1734n.S(b6);
        java.lang.Object objG = interfaceC1734n.g();
        if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = new p230x.j(b6, null, 2, 0 == true ? 1 : 0);
            interfaceC1734n.K(objG);
        }
        p230x.j jVar = (p230x.j) objG;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return jVar;
    }

    public final p210v.T b(V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(1809802212, i6, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:583)");
        }
        p210v.T tA = p210v.AbstractC7208b.a(interfaceC1734n, 0);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return tA;
    }

    public final boolean c(Y0.v vVar, p230x.s sVar, boolean z6) {
        return (vVar != Y0.v.Rtl || sVar == p230x.s.Vertical) ? !z6 : z6;
    }
}
