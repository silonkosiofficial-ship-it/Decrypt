package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3714fc implements android.app.Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private android.app.Activity f35363C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private android.content.Context f35364D;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private java.lang.Runnable f35370J;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private long f35372L;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.Object f35365E = new java.lang.Object();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f35366F = true;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f35367G = false;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final java.util.List f35368H = new java.util.ArrayList();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final java.util.List f35369I = new java.util.ArrayList();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f35371K = false;

    C3714fc() {
    }

    private final void k(android.app.Activity activity) {
        synchronized (this.f35365E) {
            try {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.f35363C = activity;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final android.app.Activity a() {
        return this.f35363C;
    }

    public final android.content.Context b() {
        return this.f35364D;
    }

    public final void f(com.google.android.gms.internal.ads.InterfaceC3824gc interfaceC3824gc) {
        synchronized (this.f35365E) {
            this.f35368H.add(interfaceC3824gc);
        }
    }

    public final void g(android.app.Application application, android.content.Context context) {
        if (this.f35371K) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof android.app.Activity) {
            k((android.app.Activity) context);
        }
        this.f35364D = application;
        this.f35372L = ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25515c1)).longValue();
        this.f35371K = true;
    }

    public final void h(com.google.android.gms.internal.ads.InterfaceC3824gc interfaceC3824gc) {
        synchronized (this.f35365E) {
            this.f35368H.remove(interfaceC3824gc);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        synchronized (this.f35365E) {
            try {
                android.app.Activity activity2 = this.f35363C;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.f35363C = null;
                }
                java.util.Iterator it = this.f35369I.iterator();
                while (it.hasNext()) {
                    androidx.appcompat.app.D.a(it.next());
                    try {
                        throw null;
                    } catch (java.lang.Exception e6) {
                        p174r3.v.s().x(e6, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        p224w3.p.e("", e6);
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        k(activity);
        synchronized (this.f35365E) {
            java.util.Iterator it = this.f35369I.iterator();
            while (it.hasNext()) {
                androidx.appcompat.app.D.a(it.next());
                try {
                    throw null;
                } catch (java.lang.Exception e6) {
                    p174r3.v.s().x(e6, "AppActivityTracker.ActivityListener.onActivityPaused");
                    p224w3.p.e("", e6);
                }
            }
        }
        this.f35367G = true;
        java.lang.Runnable runnable = this.f35370J;
        if (runnable != null) {
            p214v3.E0.f55826l.removeCallbacks(runnable);
        }
        com.google.android.gms.internal.ads.HandlerC2345Fe0 handlerC2345Fe0 = p214v3.E0.f55826l;
        com.google.android.gms.internal.ads.RunnableC3604ec runnableC3604ec = new com.google.android.gms.internal.ads.RunnableC3604ec(this);
        this.f35370J = runnableC3604ec;
        handlerC2345Fe0.postDelayed(runnableC3604ec, this.f35372L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        k(activity);
        this.f35367G = false;
        boolean z6 = !this.f35366F;
        this.f35366F = true;
        java.lang.Runnable runnable = this.f35370J;
        if (runnable != null) {
            p214v3.E0.f55826l.removeCallbacks(runnable);
        }
        synchronized (this.f35365E) {
            java.util.Iterator it = this.f35369I.iterator();
            while (it.hasNext()) {
                androidx.appcompat.app.D.a(it.next());
                try {
                    throw null;
                } catch (java.lang.Exception e6) {
                    p174r3.v.s().x(e6, "AppActivityTracker.ActivityListener.onActivityResumed");
                    p224w3.p.e("", e6);
                }
            }
            if (z6) {
                java.util.Iterator it2 = this.f35368H.iterator();
                while (it2.hasNext()) {
                    try {
                        ((com.google.android.gms.internal.ads.InterfaceC3824gc) it2.next()).a(true);
                    } catch (java.lang.Exception e10) {
                        p224w3.p.e("", e10);
                    }
                }
            } else {
                p224w3.p.b("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        k(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }
}
