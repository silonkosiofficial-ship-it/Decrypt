package androidx.appcompat.view;

/* JADX INFO: loaded from: classes.dex */
public class e extends androidx.appcompat.view.b implements androidx.appcompat.view.menu.g.a {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private android.content.Context f17660E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private androidx.appcompat.widget.ActionBarContextView f17661F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private androidx.appcompat.view.b.a f17662G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private java.lang.ref.WeakReference f17663H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f17664I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f17665J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f17666K;

    public e(android.content.Context context, androidx.appcompat.widget.ActionBarContextView actionBarContextView, androidx.appcompat.view.b.a aVar, boolean z6) {
        this.f17660E = context;
        this.f17661F = actionBarContextView;
        this.f17662G = aVar;
        androidx.appcompat.view.menu.g gVarS = new androidx.appcompat.view.menu.g(actionBarContextView.getContext()).S(1);
        this.f17666K = gVarS;
        gVarS.R(this);
        this.f17665J = z6;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, android.view.MenuItem menuItem) {
        return this.f17662G.d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        k();
        this.f17661F.l();
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f17664I) {
            return;
        }
        this.f17664I = true;
        this.f17662G.a(this);
    }

    @Override // androidx.appcompat.view.b
    public android.view.View d() {
        java.lang.ref.WeakReference weakReference = this.f17663H;
        if (weakReference != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public android.view.Menu e() {
        return this.f17666K;
    }

    @Override // androidx.appcompat.view.b
    public android.view.MenuInflater f() {
        return new androidx.appcompat.view.g(this.f17661F.getContext());
    }

    @Override // androidx.appcompat.view.b
    public java.lang.CharSequence g() {
        return this.f17661F.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public java.lang.CharSequence i() {
        return this.f17661F.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f17662G.c(this, this.f17666K);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f17661F.j();
    }

    @Override // androidx.appcompat.view.b
    public void m(android.view.View view) {
        this.f17661F.setCustomView(view);
        this.f17663H = view != null ? new java.lang.ref.WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void n(int i6) {
        o(this.f17660E.getString(i6));
    }

    @Override // androidx.appcompat.view.b
    public void o(java.lang.CharSequence charSequence) {
        this.f17661F.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void q(int i6) {
        r(this.f17660E.getString(i6));
    }

    @Override // androidx.appcompat.view.b
    public void r(java.lang.CharSequence charSequence) {
        this.f17661F.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void s(boolean z6) {
        super.s(z6);
        this.f17661F.setTitleOptional(z6);
    }
}
