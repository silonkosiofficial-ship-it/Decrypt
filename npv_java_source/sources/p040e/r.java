package p040e;

/* JADX INFO: loaded from: classes.dex */
public class r extends android.app.Dialog implements androidx.lifecycle.r, p040e.A, p233x2.f {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private androidx.lifecycle.C2087t f44417C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p233x2.e f44418D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p040e.x f44419E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(android.content.Context context, int i6) {
        super(context, i6);
        p247y7.AbstractC7350t.f(context, "context");
        this.f44418D = p233x2.e.f56909d.a(this);
        this.f44419E = new p040e.x(new java.lang.Runnable() { // from class: e.q
            @Override // java.lang.Runnable
            public final void run() {
                p040e.r.e(this.f44416C);
            }
        });
    }

    public /* synthetic */ r(android.content.Context context, int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this(context, (i10 & 2) != 0 ? 0 : i6);
    }

    private final androidx.lifecycle.C2087t c() {
        androidx.lifecycle.C2087t c2087t = this.f44417C;
        if (c2087t != null) {
            return c2087t;
        }
        androidx.lifecycle.C2087t c2087t2 = new androidx.lifecycle.C2087t(this);
        this.f44417C = c2087t2;
        return c2087t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(p040e.r rVar) {
        p247y7.AbstractC7350t.f(rVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        p247y7.AbstractC7350t.f(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // p040e.A
    public final p040e.x b() {
        return this.f44419E;
    }

    public void d() {
        android.view.Window window = getWindow();
        p247y7.AbstractC7350t.c(window);
        android.view.View decorView = window.getDecorView();
        p247y7.AbstractC7350t.e(decorView, "window!!.decorView");
        androidx.lifecycle.Z.b(decorView, this);
        android.view.Window window2 = getWindow();
        p247y7.AbstractC7350t.c(window2);
        android.view.View decorView2 = window2.getDecorView();
        p247y7.AbstractC7350t.e(decorView2, "window!!.decorView");
        p040e.D.b(decorView2, this);
        android.view.Window window3 = getWindow();
        p247y7.AbstractC7350t.c(window3);
        android.view.View decorView3 = window3.getDecorView();
        p247y7.AbstractC7350t.e(decorView3, "window!!.decorView");
        p233x2.g.b(decorView3, this);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f44419E.l();
    }

    @Override // android.app.Dialog
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            p040e.x xVar = this.f44419E;
            android.window.OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            p247y7.AbstractC7350t.e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            xVar.o(onBackInvokedDispatcher);
        }
        this.f44418D.d(bundle);
        c().i(androidx.lifecycle.AbstractC2079k.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public android.os.Bundle onSaveInstanceState() {
        android.os.Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        p247y7.AbstractC7350t.e(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f44418D.e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        c().i(androidx.lifecycle.AbstractC2079k.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        c().i(androidx.lifecycle.AbstractC2079k.a.ON_DESTROY);
        this.f44417C = null;
        super.onStop();
    }

    @Override // p233x2.f
    public p233x2.d p() {
        return this.f44418D.b();
    }

    @Override // android.app.Dialog
    public void setContentView(int i6) {
        d();
        super.setContentView(i6);
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View view) {
        p247y7.AbstractC7350t.f(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        p247y7.AbstractC7350t.f(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.r
    public androidx.lifecycle.AbstractC2079k u() {
        return c();
    }
}
