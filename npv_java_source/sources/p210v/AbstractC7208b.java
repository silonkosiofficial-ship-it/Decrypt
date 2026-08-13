package p210v;

/* JADX INFO: renamed from: v.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7208b {
    public static final p210v.T a(V.InterfaceC1734n interfaceC1734n, int i6) {
        p210v.T t6;
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1476348564, i6, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.android.kt:63)");
        }
        android.content.Context context = (android.content.Context) interfaceC1734n.n(androidx.compose.ui.platform.T.g());
        p210v.Q q6 = (p210v.Q) interfaceC1734n.n(p210v.S.a());
        if (q6 != null) {
            interfaceC1734n.T(1586021609);
            boolean zS = interfaceC1734n.S(context) | interfaceC1734n.S(q6);
            java.lang.Object objG = interfaceC1734n.g();
            if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new p210v.C7207a(context, q6);
                interfaceC1734n.K(objG);
            }
            t6 = (p210v.C7207a) objG;
            interfaceC1734n.J();
        } else {
            interfaceC1734n.T(1586120933);
            interfaceC1734n.J();
            t6 = p210v.P.f55636a;
        }
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return t6;
    }
}
