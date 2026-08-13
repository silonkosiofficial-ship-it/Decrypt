package V2;

/* JADX INFO: loaded from: classes.dex */
public final class b implements V2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.view.View f15109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.view.Window f15110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.core.view.X0 f15111c;

    public b(android.view.View view, android.view.Window window) {
        p247y7.AbstractC7350t.f(view, "view");
        this.f15109a = view;
        this.f15110b = window;
        this.f15111c = window != null ? androidx.core.view.AbstractC2011k0.a(window, view) : null;
    }

    @Override // V2.d
    public void a(long j6, boolean z6, p237x7.l lVar) {
        androidx.core.view.X0 x6;
        p247y7.AbstractC7350t.f(lVar, "transformColorForLightContent");
        e(z6);
        android.view.Window window = this.f15110b;
        if (window == null) {
            return;
        }
        if (z6 && ((x6 = this.f15111c) == null || !x6.b())) {
            j6 = ((p141o0.C7016y0) lVar.l(p141o0.C7016y0.i(j6))).w();
        }
        window.setStatusBarColor(p141o0.A0.k(j6));
    }

    @Override // V2.d
    public void b(long j6, boolean z6, boolean z10, p237x7.l lVar) {
        androidx.core.view.X0 x6;
        p247y7.AbstractC7350t.f(lVar, "transformColorForLightContent");
        d(z6);
        c(z10);
        android.view.Window window = this.f15110b;
        if (window == null) {
            return;
        }
        if (z6 && ((x6 = this.f15111c) == null || !x6.a())) {
            j6 = ((p141o0.C7016y0) lVar.l(p141o0.C7016y0.i(j6))).w();
        }
        window.setNavigationBarColor(p141o0.A0.k(j6));
    }

    public void c(boolean z6) {
        android.view.Window window;
        if (android.os.Build.VERSION.SDK_INT < 29 || (window = this.f15110b) == null) {
            return;
        }
        window.setNavigationBarContrastEnforced(z6);
    }

    public void d(boolean z6) {
        androidx.core.view.X0 x6 = this.f15111c;
        if (x6 == null) {
            return;
        }
        x6.c(z6);
    }

    public void e(boolean z6) {
        androidx.core.view.X0 x6 = this.f15111c;
        if (x6 == null) {
            return;
        }
        x6.d(z6);
    }
}
