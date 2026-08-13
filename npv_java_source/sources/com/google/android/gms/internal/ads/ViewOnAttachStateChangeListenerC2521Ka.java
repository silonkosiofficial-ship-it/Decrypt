package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC2521Ka implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, android.app.Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final android.os.Handler f28948O = new android.os.Handler(android.os.Looper.getMainLooper());

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f28949C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private android.app.Application f28950D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final android.os.PowerManager f28951E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final android.app.KeyguardManager f28952F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private android.content.BroadcastReceiver f28953G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5467va f28954H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private java.lang.ref.WeakReference f28955I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private java.lang.ref.WeakReference f28956J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C5027ra f28957K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private byte f28958L = -1;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f28959M = -1;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private long f28960N = -3;

    public ViewOnAttachStateChangeListenerC2521Ka(android.content.Context context, com.google.android.gms.internal.ads.C5467va c5467va) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f28949C = applicationContext;
        this.f28954H = c5467va;
        this.f28951E = (android.os.PowerManager) applicationContext.getSystemService("power");
        this.f28952F = (android.app.KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof android.app.Application) {
            android.app.Application application = (android.app.Application) applicationContext;
            this.f28950D = application;
            this.f28957K = new com.google.android.gms.internal.ads.C5027ra(application, this);
        }
        d(null);
    }

    private final void e(android.app.Activity activity, int i6) {
        android.view.Window window;
        if (this.f28956J == null || (window = activity.getWindow()) == null) {
            return;
        }
        android.view.View viewPeekDecorView = window.peekDecorView();
        android.view.View viewB = b();
        if (viewB == null || viewPeekDecorView == null || viewB.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f28959M = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    public final void f() {
        android.app.Activity activity;
        if (this.f28956J == null) {
            return;
        }
        android.view.View viewB = b();
        if (viewB == null) {
            this.f28960N = -3L;
            this.f28958L = (byte) -1;
            return;
        }
        int i6 = 0;
        int i10 = viewB.getVisibility() != 0 ? 1 : 0;
        if (!viewB.isShown()) {
            i10 |= 2;
        }
        android.os.PowerManager powerManager = this.f28951E;
        if (powerManager != null && !powerManager.isScreenOn()) {
            i10 |= 4;
        }
        if (!this.f28954H.a()) {
            android.app.KeyguardManager keyguardManager = this.f28952F;
            if (keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode()) {
                i10 |= 8;
            } else {
                int i11 = com.google.android.gms.internal.ads.AbstractC2373Ga.f27826b;
                android.view.View rootView = viewB.getRootView();
                if (rootView == null) {
                    rootView = viewB;
                }
                android.content.Context context = rootView.getContext();
                while (true) {
                    if (!(context instanceof android.content.ContextWrapper) || i6 >= 10) {
                        activity = null;
                        break;
                    } else if (context instanceof android.app.Activity) {
                        activity = (android.app.Activity) context;
                        break;
                    } else {
                        context = ((android.content.ContextWrapper) context).getBaseContext();
                        i6++;
                    }
                }
                if (activity != null) {
                    android.view.Window window = activity.getWindow();
                    android.view.WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                    if (attributes == null || (attributes.flags & 524288) == 0) {
                        i10 |= 8;
                    }
                } else {
                    i10 |= 8;
                }
            }
        }
        if (!viewB.getGlobalVisibleRect(new android.graphics.Rect())) {
            i10 |= 16;
        }
        if (!viewB.getLocalVisibleRect(new android.graphics.Rect())) {
            i10 |= 32;
        }
        int windowVisibility = viewB.getWindowVisibility();
        int i12 = this.f28959M;
        if (i12 != -1) {
            windowVisibility = i12;
        }
        if (windowVisibility != 0) {
            i10 |= 64;
        }
        if (this.f28958L != i10) {
            this.f28958L = (byte) i10;
            this.f28960N = i10 == 0 ? android.os.SystemClock.elapsedRealtime() : (-3) - ((long) i10);
        }
    }

    private final void g() {
        f28948O.post(new com.google.android.gms.internal.ads.RunnableC2447Ia(this));
    }

    private final void h(android.view.View view) {
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f28955I = new java.lang.ref.WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f28953G == null) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            com.google.android.gms.internal.ads.C2484Ja c2484Ja = new com.google.android.gms.internal.ads.C2484Ja(this);
            this.f28953G = c2484Ja;
            this.f28949C.registerReceiver(c2484Ja, intentFilter);
        }
        android.app.Application application = this.f28950D;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f28957K);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    private final void i(android.view.View view) {
        try {
            java.lang.ref.WeakReference weakReference = this.f28955I;
            if (weakReference != null) {
                android.view.ViewTreeObserver viewTreeObserver = (android.view.ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f28955I = null;
            }
        } catch (java.lang.Exception unused) {
        }
        try {
            android.view.ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (java.lang.Exception unused2) {
        }
        android.content.BroadcastReceiver broadcastReceiver = this.f28953G;
        if (broadcastReceiver != null) {
            try {
                this.f28949C.unregisterReceiver(broadcastReceiver);
            } catch (java.lang.Exception unused3) {
            }
            this.f28953G = null;
        }
        android.app.Application application = this.f28950D;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f28957K);
            } catch (java.lang.Exception unused4) {
            }
        }
    }

    public final long a() {
        if (this.f28960N <= -2 && b() == null) {
            this.f28960N = -3L;
        }
        return this.f28960N;
    }

    final android.view.View b() {
        java.lang.ref.WeakReference weakReference = this.f28956J;
        if (weakReference != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    final void d(android.view.View view) {
        long j6;
        android.view.View viewB = b();
        if (viewB != null) {
            viewB.removeOnAttachStateChangeListener(this);
            i(viewB);
        }
        this.f28956J = new java.lang.ref.WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                h(view);
            }
            view.addOnAttachStateChangeListener(this);
            j6 = -2;
        } else {
            j6 = -3;
        }
        this.f28960N = j6;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        e(activity, 0);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        e(activity, 4);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        e(activity, 0);
        f();
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        e(activity, 0);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        f();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        f();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        this.f28959M = -1;
        h(view);
        f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        this.f28959M = -1;
        f();
        g();
        i(view);
    }
}
