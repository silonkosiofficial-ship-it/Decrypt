package A;

/* JADX INFO: renamed from: A.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0785t extends androidx.core.view.C2013l0.b implements java.lang.Runnable, androidx.core.view.G, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final A.T f149E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f150F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f151G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private androidx.core.view.C2038y0 f152H;

    public RunnableC0785t(A.T t6) {
        super(!t6.c() ? 1 : 0);
        this.f149E = t6;
    }

    @Override // androidx.core.view.G
    public androidx.core.view.C2038y0 a(android.view.View view, androidx.core.view.C2038y0 c2038y0) {
        this.f152H = c2038y0;
        this.f149E.i(c2038y0);
        if (this.f150F) {
            if (android.os.Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f151G) {
            this.f149E.h(c2038y0);
            A.T.g(this.f149E, c2038y0, 0, 2, null);
        }
        return this.f149E.c() ? androidx.core.view.C2038y0.f21777b : c2038y0;
    }

    @Override // androidx.core.view.C2013l0.b
    public void c(androidx.core.view.C2013l0 c2013l0) {
        this.f150F = false;
        this.f151G = false;
        androidx.core.view.C2038y0 c2038y0 = this.f152H;
        if (c2013l0.a() != 0 && c2038y0 != null) {
            this.f149E.h(c2038y0);
            this.f149E.i(c2038y0);
            A.T.g(this.f149E, c2038y0, 0, 2, null);
        }
        this.f152H = null;
        super.c(c2013l0);
    }

    @Override // androidx.core.view.C2013l0.b
    public void d(androidx.core.view.C2013l0 c2013l0) {
        this.f150F = true;
        this.f151G = true;
        super.d(c2013l0);
    }

    @Override // androidx.core.view.C2013l0.b
    public androidx.core.view.C2038y0 e(androidx.core.view.C2038y0 c2038y0, java.util.List list) {
        A.T.g(this.f149E, c2038y0, 0, 2, null);
        return this.f149E.c() ? androidx.core.view.C2038y0.f21777b : c2038y0;
    }

    @Override // androidx.core.view.C2013l0.b
    public androidx.core.view.C2013l0.a f(androidx.core.view.C2013l0 c2013l0, androidx.core.view.C2013l0.a aVar) {
        this.f150F = false;
        return super.f(c2013l0, aVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f150F) {
            this.f150F = false;
            this.f151G = false;
            androidx.core.view.C2038y0 c2038y0 = this.f152H;
            if (c2038y0 != null) {
                this.f149E.h(c2038y0);
                A.T.g(this.f149E, c2038y0, 0, 2, null);
                this.f152H = null;
            }
        }
    }
}
