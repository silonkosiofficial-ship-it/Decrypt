package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5027ra implements android.app.Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.app.Application f38507C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.ref.WeakReference f38508D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f38509E = false;

    public C5027ra(android.app.Application application, android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f38508D = new java.lang.ref.WeakReference(activityLifecycleCallbacks);
        this.f38507C = application;
    }

    protected final void a(com.google.android.gms.internal.ads.InterfaceC4918qa interfaceC4918qa) {
        try {
            android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (android.app.Application.ActivityLifecycleCallbacks) this.f38508D.get();
            if (activityLifecycleCallbacks != null) {
                interfaceC4918qa.a(activityLifecycleCallbacks);
            } else {
                if (this.f38509E) {
                    return;
                }
                this.f38507C.unregisterActivityLifecycleCallbacks(this);
                this.f38509E = true;
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        a(new com.google.android.gms.internal.ads.C4148ja(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        a(new com.google.android.gms.internal.ads.C4808pa(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        a(new com.google.android.gms.internal.ads.C4478ma(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        a(new com.google.android.gms.internal.ads.C4368la(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        a(new com.google.android.gms.internal.ads.C4698oa(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        a(new com.google.android.gms.internal.ads.C4258ka(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        a(new com.google.android.gms.internal.ads.C4588na(this, activity));
    }
}
