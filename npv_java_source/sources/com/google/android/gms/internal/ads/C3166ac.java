package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3166ac implements android.app.Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.app.Application f34112C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.ref.WeakReference f34113D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f34114E = false;

    public C3166ac(android.app.Application application, android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f34113D = new java.lang.ref.WeakReference(activityLifecycleCallbacks);
        this.f34112C = application;
    }

    protected final void a(com.google.android.gms.internal.ads.InterfaceC3070Zb interfaceC3070Zb) {
        try {
            android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (android.app.Application.ActivityLifecycleCallbacks) this.f34113D.get();
            if (activityLifecycleCallbacks != null) {
                interfaceC3070Zb.a(activityLifecycleCallbacks);
            } else {
                if (this.f34114E) {
                    return;
                }
                this.f34112C.unregisterActivityLifecycleCallbacks(this);
                this.f34114E = true;
            }
        } catch (java.lang.Exception e6) {
            p224w3.p.e("Error while dispatching lifecycle callback.", e6);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        a(new com.google.android.gms.internal.ads.C2818Sb(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        a(new com.google.android.gms.internal.ads.C3034Yb(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        a(new com.google.android.gms.internal.ads.C2926Vb(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        a(new com.google.android.gms.internal.ads.C2890Ub(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        a(new com.google.android.gms.internal.ads.C2998Xb(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        a(new com.google.android.gms.internal.ads.C2854Tb(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        a(new com.google.android.gms.internal.ads.C2962Wb(this, activity));
    }
}
