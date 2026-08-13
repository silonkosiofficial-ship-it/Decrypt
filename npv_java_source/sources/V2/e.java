package V2;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f15112a = p141o0.A0.e(0.0f, 0.0f, 0.0f, 0.3f, null, 16, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p237x7.l f15113b = V2.e.a.f15114D;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final V2.e.a f15114D = new V2.e.a();

        a() {
            super(1);
        }

        public final long a(long j6) {
            return p141o0.A0.h(V2.e.f15112a, j6);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return p141o0.C7016y0.i(a(((p141o0.C7016y0) obj).w()));
        }
    }

    private static final android.view.Window c(V.InterfaceC1734n interfaceC1734n, int i6) {
        interfaceC1734n.f(1009281237);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(1009281237, i6, -1, "com.google.accompanist.systemuicontroller.findWindow (SystemUiController.kt:208)");
        }
        android.view.ViewParent parent = ((android.view.View) interfaceC1734n.n(androidx.compose.ui.platform.T.i())).getParent();
        androidx.compose.ui.window.j jVar = parent instanceof androidx.compose.ui.window.j ? (androidx.compose.ui.window.j) parent : null;
        android.view.Window windowA = jVar != null ? jVar.a() : null;
        if (windowA == null) {
            android.content.Context context = ((android.view.View) interfaceC1734n.n(androidx.compose.ui.platform.T.i())).getContext();
            p247y7.AbstractC7350t.e(context, "getContext(...)");
            windowA = d(context);
        }
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        interfaceC1734n.P();
        return windowA;
    }

    private static final android.view.Window d(android.content.Context context) {
        while (!(context instanceof android.app.Activity)) {
            if (!(context instanceof android.content.ContextWrapper)) {
                return null;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
            p247y7.AbstractC7350t.e(context, "getBaseContext(...)");
        }
        return ((android.app.Activity) context).getWindow();
    }

    public static final V2.d e(android.view.Window window, V.InterfaceC1734n interfaceC1734n, int i6, int i10) {
        interfaceC1734n.f(-715745933);
        if ((i10 & 1) != 0) {
            window = c(interfaceC1734n, 0);
        }
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-715745933, i6, -1, "com.google.accompanist.systemuicontroller.rememberSystemUiController (SystemUiController.kt:201)");
        }
        android.view.View view = (android.view.View) interfaceC1734n.n(androidx.compose.ui.platform.T.i());
        interfaceC1734n.f(-1044852491);
        boolean zS = interfaceC1734n.S(view) | interfaceC1734n.S(window);
        java.lang.Object objG = interfaceC1734n.g();
        if (zS || objG == V.InterfaceC1734n.f14931a.a()) {
            objG = new V2.b(view, window);
            interfaceC1734n.K(objG);
        }
        V2.b bVar = (V2.b) objG;
        interfaceC1734n.P();
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        interfaceC1734n.P();
        return bVar;
    }
}
