package D;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final D.Q.a f1619a;

    public static final class a implements D.P {
        a() {
        }

        @Override // D.P
        public void a(D.N n6) {
        }
    }

    static {
        java.lang.String lowerCase = android.os.Build.FINGERPRINT.toLowerCase(java.util.Locale.ROOT);
        p247y7.AbstractC7350t.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        f1619a = p247y7.AbstractC7350t.b(lowerCase, "robolectric") ? new D.Q.a() : null;
    }

    public static final D.P a(V.InterfaceC1734n interfaceC1734n, int i6) {
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(1141871251, i6, -1, "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:32)");
        }
        D.P p6 = f1619a;
        if (p6 != null) {
            interfaceC1734n.T(1213893039);
        } else {
            interfaceC1734n.T(1213931944);
            android.view.View view = (android.view.View) interfaceC1734n.n(androidx.compose.ui.platform.T.i());
            boolean zS = interfaceC1734n.S(view);
            java.lang.Object objG = interfaceC1734n.g();
            if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
                objG = new D.RunnableC0864a(view);
                interfaceC1734n.K(objG);
            }
            p6 = (D.RunnableC0864a) objG;
        }
        interfaceC1734n.J();
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        return p6;
    }
}
