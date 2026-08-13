package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class J implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.view.View f21653C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private android.view.ViewTreeObserver f21654D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.Runnable f21655E;

    private J(android.view.View view, java.lang.Runnable runnable) {
        this.f21653C = view;
        this.f21654D = view.getViewTreeObserver();
        this.f21655E = runnable;
    }

    public static androidx.core.view.J a(android.view.View view, java.lang.Runnable runnable) {
        if (view == null) {
            throw new java.lang.NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new java.lang.NullPointerException("runnable == null");
        }
        androidx.core.view.J j6 = new androidx.core.view.J(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(j6);
        view.addOnAttachStateChangeListener(j6);
        return j6;
    }

    public void b() {
        (this.f21654D.isAlive() ? this.f21654D : this.f21653C.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f21653C.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f21655E.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f21654D = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        b();
    }
}
