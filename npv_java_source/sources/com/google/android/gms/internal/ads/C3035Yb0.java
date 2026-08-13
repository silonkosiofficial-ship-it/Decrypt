package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Yb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3035Yb0 implements android.app.Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f33375C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected boolean f33376D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC2999Xb0 f33377E;

    private final void a(boolean z6) {
        if (this.f33376D != z6) {
            this.f33376D = z6;
            if (this.f33375C) {
                b(z6);
                com.google.android.gms.internal.ads.InterfaceC2999Xb0 interfaceC2999Xb0 = this.f33377E;
                if (interfaceC2999Xb0 != null) {
                    interfaceC2999Xb0.a(z6);
                }
            }
        }
    }

    private final boolean h() {
        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
        android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100 || c();
    }

    protected void b(boolean z6) {
    }

    protected boolean c() {
        return false;
    }

    public final void d(android.content.Context context) {
        if (context instanceof android.app.Application) {
            ((android.app.Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void e(com.google.android.gms.internal.ads.InterfaceC2999Xb0 interfaceC2999Xb0) {
        this.f33377E = interfaceC2999Xb0;
    }

    public final void f() {
        this.f33375C = true;
        boolean zH = h();
        this.f33376D = zH;
        b(zH);
    }

    public final void g() {
        this.f33375C = false;
        this.f33377E = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
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
        a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        a(h());
    }
}
