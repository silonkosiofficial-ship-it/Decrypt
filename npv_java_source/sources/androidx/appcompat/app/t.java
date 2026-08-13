package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class t extends p040e.r implements androidx.appcompat.app.InterfaceC1893d {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private androidx.appcompat.app.AbstractC1894e f17630F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final androidx.core.view.AbstractC2027t.a f17631G;

    public t(android.content.Context context, int i6) {
        super(context, i(context, i6));
        this.f17631G = new androidx.core.view.AbstractC2027t.a() { // from class: androidx.appcompat.app.s
            @Override // androidx.core.view.AbstractC2027t.a
            public final boolean r(android.view.KeyEvent keyEvent) {
                return this.f17629C.j(keyEvent);
            }
        };
        androidx.appcompat.app.AbstractC1894e abstractC1894eF = f();
        abstractC1894eF.u(i(context, i6));
        abstractC1894eF.k(null);
    }

    private static int i(android.content.Context context, int i6) {
        if (i6 != 0) {
            return i6;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(p090j.a.f48646w, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p040e.r, android.app.Dialog
    public void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        f().d(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        f().l();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return androidx.core.view.AbstractC2027t.e(this.f17631G, getWindow().getDecorView(), this, keyEvent);
    }

    public androidx.appcompat.app.AbstractC1894e f() {
        if (this.f17630F == null) {
            this.f17630F = androidx.appcompat.app.AbstractC1894e.e(this, this);
        }
        return this.f17630F;
    }

    @Override // android.app.Dialog
    public android.view.View findViewById(int i6) {
        return f().f(i6);
    }

    @Override // androidx.appcompat.app.InterfaceC1893d
    public void g(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.InterfaceC1893d
    public void h(androidx.appcompat.view.b bVar) {
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        f().j();
    }

    boolean j(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean k(int i6) {
        return f().p(i6);
    }

    @Override // androidx.appcompat.app.InterfaceC1893d
    public androidx.appcompat.view.b o(androidx.appcompat.view.b.a aVar) {
        return null;
    }

    @Override // p040e.r, android.app.Dialog
    protected void onCreate(android.os.Bundle bundle) {
        f().i();
        super.onCreate(bundle);
        f().k(bundle);
    }

    @Override // p040e.r, android.app.Dialog
    protected void onStop() {
        super.onStop();
        f().m();
    }

    @Override // p040e.r, android.app.Dialog
    public void setContentView(int i6) {
        f().q(i6);
    }

    @Override // p040e.r, android.app.Dialog
    public void setContentView(android.view.View view) {
        f().r(view);
    }

    @Override // p040e.r, android.app.Dialog
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        f().s(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i6) {
        super.setTitle(i6);
        f().v(getContext().getString(i6));
    }

    @Override // android.app.Dialog
    public void setTitle(java.lang.CharSequence charSequence) {
        super.setTitle(charSequence);
        f().v(charSequence);
    }
}
