package p214v3;

/* JADX INFO: renamed from: v3.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7261o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.view.View f55915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.app.Activity f55916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f55917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f55918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f55919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener f55920f;

    public C7261o0(android.app.Activity activity, android.view.View view, android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f55916b = activity;
        this.f55915a = view;
        this.f55920f = onGlobalLayoutListener;
    }

    private static android.view.ViewTreeObserver f(android.app.Activity activity) {
        android.view.View decorView;
        android.view.Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    private final void g() {
        if (this.f55917c) {
            return;
        }
        android.app.Activity activity = this.f55916b;
        if (activity != null) {
            android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f55920f;
            android.view.ViewTreeObserver viewTreeObserverF = f(activity);
            if (viewTreeObserverF != null) {
                viewTreeObserverF.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        android.view.View view = this.f55915a;
        android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.f55920f;
        p174r3.v.B();
        com.google.android.gms.internal.ads.C5391ur.a(view, onGlobalLayoutListener2);
        this.f55917c = true;
    }

    private final void h() {
        android.app.Activity activity = this.f55916b;
        if (activity != null && this.f55917c) {
            android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f55920f;
            android.view.ViewTreeObserver viewTreeObserverF = f(activity);
            if (viewTreeObserverF != null) {
                viewTreeObserverF.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f55917c = false;
        }
    }

    public final void a() {
        this.f55919e = false;
        h();
    }

    public final void b() {
        this.f55919e = true;
        if (this.f55918d) {
            g();
        }
    }

    public final void c() {
        this.f55918d = true;
        if (this.f55919e) {
            g();
        }
    }

    public final void d() {
        this.f55918d = false;
        h();
    }

    public final void e(android.app.Activity activity) {
        this.f55916b = activity;
    }
}
