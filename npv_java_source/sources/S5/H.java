package S5;

/* JADX INFO: loaded from: classes3.dex */
public final class H implements android.app.Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final S5.H f12477C = new S5.H();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static boolean f12478D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static S5.D f12479E;

    private H() {
    }

    public final void a(S5.D d6) {
        f12479E = d6;
        if (d6 == null || !f12478D) {
            return;
        }
        f12478D = false;
        d6.k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        p247y7.AbstractC7350t.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        p247y7.AbstractC7350t.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        p247y7.AbstractC7350t.f(activity, "activity");
        S5.D d6 = f12479E;
        if (d6 != null) {
            d6.h();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        p087i7.M m6;
        p247y7.AbstractC7350t.f(activity, "activity");
        S5.D d6 = f12479E;
        if (d6 != null) {
            d6.k();
            m6 = p087i7.M.f46721a;
        } else {
            m6 = null;
        }
        if (m6 == null) {
            f12478D = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        p247y7.AbstractC7350t.f(activity, "activity");
        p247y7.AbstractC7350t.f(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        p247y7.AbstractC7350t.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        p247y7.AbstractC7350t.f(activity, "activity");
    }
}
