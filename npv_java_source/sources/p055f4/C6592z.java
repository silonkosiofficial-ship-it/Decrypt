package p055f4;

/* JADX INFO: renamed from: f4.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6592z implements android.app.Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.app.Activity f45264C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ p055f4.D f45265D;

    public C6592z(p055f4.D d6, android.app.Activity activity) {
        this.f45265D = d6;
        this.f45264C = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        this.f45265D.f45019a.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        p055f4.D d6 = this.f45265D;
        if (d6.f45024f == null || !d6.f45030l) {
            return;
        }
        d6.f45024f.setOwnerActivity(activity);
        p055f4.D d10 = this.f45265D;
        if (d10.f45020b != null) {
            d10.f45020b.a(activity);
        }
        p055f4.C6592z c6592z = (p055f4.C6592z) this.f45265D.f45029k.getAndSet(null);
        if (c6592z != null) {
            c6592z.b();
            p055f4.D d11 = this.f45265D;
            p055f4.C6592z c6592z2 = new p055f4.C6592z(d11, activity);
            d11.f45019a.registerActivityLifecycleCallbacks(c6592z2);
            this.f45265D.f45029k.set(c6592z2);
        }
        p055f4.D d12 = this.f45265D;
        if (d12.f45024f != null) {
            d12.f45024f.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        if (activity != this.f45264C) {
            return;
        }
        if (activity.isChangingConfigurations()) {
            p055f4.D d6 = this.f45265D;
            if (d6.f45030l && d6.f45024f != null) {
                d6.f45024f.dismiss();
                return;
            }
        }
        this.f45265D.i(new p055f4.Z0(3, "Activity is destroyed."));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }
}
