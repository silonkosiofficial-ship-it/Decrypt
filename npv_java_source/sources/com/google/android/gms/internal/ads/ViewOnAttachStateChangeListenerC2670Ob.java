package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC2670Ob implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, android.app.Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final long f30523R = ((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25713v1)).longValue();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f30524C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private android.app.Application f30525D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final android.view.WindowManager f30526E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final android.os.PowerManager f30527F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final android.app.KeyguardManager f30528G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    android.content.BroadcastReceiver f30529H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private java.lang.ref.WeakReference f30530I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    final java.lang.ref.WeakReference f30531J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3166ac f30532K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final p214v3.C7233a0 f30533L = new p214v3.C7233a0(f30523R);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f30534M = false;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f30535N = -1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final java.util.HashSet f30536O = new java.util.HashSet();

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final android.util.DisplayMetrics f30537P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final android.graphics.Rect f30538Q;

    public ViewOnAttachStateChangeListenerC2670Ob(android.content.Context context, android.view.View view) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f30524C = applicationContext;
        android.view.WindowManager windowManager = (android.view.WindowManager) applicationContext.getSystemService("window");
        this.f30526E = windowManager;
        this.f30527F = (android.os.PowerManager) applicationContext.getSystemService("power");
        this.f30528G = (android.app.KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof android.app.Application) {
            android.app.Application application = (android.app.Application) applicationContext;
            this.f30525D = application;
            this.f30532K = new com.google.android.gms.internal.ads.C3166ac(application, this);
        }
        this.f30537P = context.getResources().getDisplayMetrics();
        android.graphics.Rect rect = new android.graphics.Rect();
        this.f30538Q = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        java.lang.ref.WeakReference weakReference = this.f30531J;
        android.view.View view2 = weakReference != null ? (android.view.View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m(view2);
        }
        this.f30531J = new java.lang.ref.WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                l(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final int h(int i6) {
        return (int) (i6 / this.f30537P.density);
    }

    private final void i(android.app.Activity activity, int i6) {
        android.view.Window window;
        if (this.f30531J == null || (window = activity.getWindow()) == null) {
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f30531J;
        android.view.View viewPeekDecorView = window.peekDecorView();
        android.view.View view = (android.view.View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f30535N = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:55:0x012f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0134  */
    /* JADX WARN: Code duplicated, block: B:58:0x0138  */
    /* JADX WARN: Code duplicated, block: B:59:0x013c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void j(int i6) {
        java.lang.ref.WeakReference weakReference;
        boolean globalVisibleRect;
        boolean localVisibleRect;
        android.view.View view;
        java.util.List listEmptyList;
        boolean z6;
        int i10;
        boolean z10;
        int i11;
        if (this.f30536O.isEmpty() || (weakReference = this.f30531J) == null) {
            return;
        }
        android.view.View view2 = (android.view.View) weakReference.get();
        android.graphics.Rect rect = new android.graphics.Rect();
        android.graphics.Rect rect2 = new android.graphics.Rect();
        android.graphics.Rect rect3 = new android.graphics.Rect();
        android.graphics.Rect rect4 = new android.graphics.Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view2 != null) {
            globalVisibleRect = view2.getGlobalVisibleRect(rect2);
            localVisibleRect = view2.getLocalVisibleRect(rect3);
            view2.getHitRect(rect4);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
            } catch (java.lang.Exception e6) {
                p224w3.p.e("Failure getting view location.", e6);
            }
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25431U4)).booleanValue()) {
                rect.left = iArr2[0];
                i11 = iArr2[1];
            } else {
                rect.left = iArr[0];
                i11 = iArr[1];
            }
            rect.top = i11;
            rect.right = rect.left + view2.getWidth();
            rect.bottom = rect.top + view2.getHeight();
            view = view2;
        } else {
            globalVisibleRect = false;
            localVisibleRect = false;
            view = null;
        }
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25743y1)).booleanValue() || view == null) {
            listEmptyList = java.util.Collections.emptyList();
        } else {
            try {
                listEmptyList = new java.util.ArrayList();
                android.view.ViewParent parent = view.getParent();
                while (parent instanceof android.view.View) {
                    android.view.View view3 = (android.view.View) parent;
                    android.graphics.Rect rect5 = new android.graphics.Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                        listEmptyList.add(a(rect5));
                    }
                    parent = parent.getParent();
                }
            } catch (java.lang.Exception e10) {
                p174r3.v.s().x(e10, "PositionWatcher.getParentScrollViewRects");
                listEmptyList = java.util.Collections.emptyList();
            }
        }
        java.util.List list = listEmptyList;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i12 = this.f30535N;
        if (i12 != -1) {
            windowVisibility = i12;
        }
        p174r3.v.t();
        long jC0 = p214v3.E0.c0(view);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.va)).booleanValue()) {
            if (view2 != null) {
                android.os.PowerManager powerManager = this.f30527F;
                android.app.KeyguardManager keyguardManager = this.f30528G;
                p174r3.v.t();
                if (p214v3.E0.s(view, powerManager, keyguardManager)) {
                    if (!globalVisibleRect) {
                        z6 = 0;
                        globalVisibleRect = false;
                    } else if (!localVisibleRect) {
                        globalVisibleRect = true;
                        z6 = 0;
                        localVisibleRect = false;
                    } else if (jC0 < ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.ya)).intValue() || windowVisibility != 0) {
                        globalVisibleRect = true;
                        localVisibleRect = true;
                    } else {
                        z6 = 1;
                        globalVisibleRect = true;
                        localVisibleRect = true;
                        windowVisibility = 0;
                    }
                }
            }
            z6 = 0;
        } else {
            if (view2 != null) {
                android.os.PowerManager powerManager2 = this.f30527F;
                android.app.KeyguardManager keyguardManager2 = this.f30528G;
                p174r3.v.t();
                if (p214v3.E0.s(view, powerManager2, keyguardManager2)) {
                    if (!globalVisibleRect) {
                        z6 = 0;
                        globalVisibleRect = false;
                    } else if (!localVisibleRect) {
                        globalVisibleRect = true;
                        z6 = 0;
                        localVisibleRect = false;
                    } else if (windowVisibility == 0) {
                        z6 = 1;
                        globalVisibleRect = true;
                        localVisibleRect = true;
                        windowVisibility = 0;
                    } else {
                        globalVisibleRect = true;
                        localVisibleRect = true;
                    }
                }
            }
            z6 = 0;
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Aa)).booleanValue()) {
            android.os.PowerManager powerManager3 = this.f30527F;
            android.app.KeyguardManager keyguardManager3 = this.f30528G;
            p174r3.v.t();
            int i13 = true != p214v3.E0.s(view, powerManager3, keyguardManager3) ? 0 : 64;
            int i14 = true != globalVisibleRect ? 0 : 8;
            int i15 = true != localVisibleRect ? 0 : 16;
            int i16 = windowVisibility == 0 ? 128 : 0;
            int i17 = jC0 >= ((long) ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.ya)).intValue()) ? 32 : 0;
            p174r3.v.t();
            p214v3.E0.k(view, i17 | i16 | i13 | i14 | i15 | z6, null);
            i10 = 1;
        } else {
            i10 = 1;
        }
        if (i6 == i10 && !this.f30533L.b() && z6 == this.f30534M) {
            return;
        }
        if (z6 != 0 || this.f30534M) {
            z10 = true;
        } else {
            z10 = true;
            if (i6 == 1) {
                return;
            }
        }
        com.google.android.gms.internal.ads.C2596Mb c2596Mb = new com.google.android.gms.internal.ads.C2596Mb(p174r3.v.c().c(), this.f30527F.isScreenOn(), (view == null || !view.isAttachedToWindow()) ? false : z10, view != null ? view.getWindowVisibility() : 8, a(this.f30538Q), a(rect), a(rect2), globalVisibleRect, a(rect3), localVisibleRect, jC0, a(rect4), this.f30537P.density, z6, list);
        java.util.Iterator it = this.f30536O.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.InterfaceC2633Nb) it.next()).L(c2596Mb);
        }
        this.f30534M = z6;
    }

    private final void k() {
        p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Kb
            @Override // java.lang.Runnable
            public final void run() {
                this.f28974C.d();
            }
        });
    }

    private final void l(android.view.View view) {
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f30530I = new java.lang.ref.WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f30529H == null) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f30529H = new com.google.android.gms.internal.ads.C2560Lb(this);
            p174r3.v.z().c(this.f30524C, this.f30529H, intentFilter);
        }
        android.app.Application application = this.f30525D;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f30532K);
            } catch (java.lang.Exception e6) {
                p224w3.p.e("Error registering activity lifecycle callbacks.", e6);
            }
        }
    }

    private final void m(android.view.View view) {
        try {
            java.lang.ref.WeakReference weakReference = this.f30530I;
            if (weakReference != null) {
                android.view.ViewTreeObserver viewTreeObserver = (android.view.ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f30530I = null;
            }
        } catch (java.lang.Exception e6) {
            p224w3.p.e("Error while unregistering listeners from the last ViewTreeObserver.", e6);
        }
        try {
            android.view.ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (java.lang.Exception e10) {
            p224w3.p.e("Error while unregistering listeners from the ViewTreeObserver.", e10);
        }
        if (this.f30529H != null) {
            try {
                p174r3.v.z().d(this.f30524C, this.f30529H);
            } catch (java.lang.IllegalStateException e11) {
                p224w3.p.e("Failed trying to unregister the receiver", e11);
            } catch (java.lang.Exception e12) {
                p174r3.v.s().x(e12, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f30529H = null;
        }
        android.app.Application application = this.f30525D;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f30532K);
            } catch (java.lang.Exception e13) {
                p224w3.p.e("Error registering activity lifecycle callbacks.", e13);
            }
        }
    }

    final android.graphics.Rect a(android.graphics.Rect rect) {
        return new android.graphics.Rect(h(rect.left), h(rect.top), h(rect.right), h(rect.bottom));
    }

    public final void c(com.google.android.gms.internal.ads.InterfaceC2633Nb interfaceC2633Nb) {
        this.f30536O.add(interfaceC2633Nb);
        j(3);
    }

    final /* synthetic */ void d() {
        j(3);
    }

    public final void e(com.google.android.gms.internal.ads.InterfaceC2633Nb interfaceC2633Nb) {
        this.f30536O.remove(interfaceC2633Nb);
    }

    public final void f() {
        this.f30533L.a(f30523R);
    }

    public final void g(long j6) {
        this.f30533L.a(j6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        i(activity, 4);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        j(3);
        k();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        j(2);
        k();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        j(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        this.f30535N = -1;
        l(view);
        j(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        this.f30535N = -1;
        j(3);
        k();
        m(view);
    }
}
