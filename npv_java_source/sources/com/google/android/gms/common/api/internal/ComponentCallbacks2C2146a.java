package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C2146a implements android.app.Application.ActivityLifecycleCallbacks, android.content.ComponentCallbacks2 {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final com.google.android.gms.common.api.internal.ComponentCallbacks2C2146a f24879G = new com.google.android.gms.common.api.internal.ComponentCallbacks2C2146a();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f24880C = new java.util.concurrent.atomic.AtomicBoolean();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f24881D = new java.util.concurrent.atomic.AtomicBoolean();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.ArrayList f24882E = new java.util.ArrayList();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f24883F = false;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.a$a, reason: collision with other inner class name */
    public interface InterfaceC0470a {
        void a(boolean z6);
    }

    private ComponentCallbacks2C2146a() {
    }

    public static com.google.android.gms.common.api.internal.ComponentCallbacks2C2146a b() {
        return f24879G;
    }

    public static void c(android.app.Application application) {
        com.google.android.gms.common.api.internal.ComponentCallbacks2C2146a componentCallbacks2C2146a = f24879G;
        synchronized (componentCallbacks2C2146a) {
            try {
                if (!componentCallbacks2C2146a.f24883F) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C2146a);
                    application.registerComponentCallbacks(componentCallbacks2C2146a);
                    componentCallbacks2C2146a.f24883F = true;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private final void f(boolean z6) {
        synchronized (f24879G) {
            try {
                java.util.Iterator it = this.f24882E.iterator();
                while (it.hasNext()) {
                    ((com.google.android.gms.common.api.internal.ComponentCallbacks2C2146a.InterfaceC0470a) it.next()).a(z6);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void a(com.google.android.gms.common.api.internal.ComponentCallbacks2C2146a.InterfaceC0470a interfaceC0470a) {
        synchronized (f24879G) {
            this.f24882E.add(interfaceC0470a);
        }
    }

    public boolean d() {
        return this.f24880C.get();
    }

    public boolean e(boolean z6) {
        if (!this.f24881D.get()) {
            if (!V3.n.b()) {
                return z6;
            }
            android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
            android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f24881D.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f24880C.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f24881D;
        boolean zCompareAndSet = this.f24880C.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f24881D;
        boolean zCompareAndSet = this.f24880C.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
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

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i6) {
        if (i6 == 20 && this.f24880C.compareAndSet(false, true)) {
            this.f24881D.set(true);
            f(true);
        }
    }
}
