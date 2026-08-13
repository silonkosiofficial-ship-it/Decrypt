package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC5778yJ extends com.google.android.gms.internal.ads.AbstractBinderC5701xh implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.ref.WeakReference f40028C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.Map f40029D = new java.util.HashMap();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.util.Map f40030E = new java.util.HashMap();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.util.Map f40031F = new java.util.HashMap();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private com.google.android.gms.internal.ads.ZI f40032G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2670Ob f40033H;

    public ViewTreeObserverOnGlobalLayoutListenerC5778yJ(android.view.View view, java.util.HashMap map, java.util.HashMap map2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        p174r3.v.B();
        com.google.android.gms.internal.ads.C5391ur.a(view, this);
        p174r3.v.B();
        com.google.android.gms.internal.ads.C5391ur.b(view, this);
        this.f40028C = new java.lang.ref.WeakReference(view);
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            android.view.View view2 = (android.view.View) entry.getValue();
            if (view2 != null) {
                this.f40029D.put(str, new java.lang.ref.WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f40031F.putAll(this.f40029D);
        for (java.util.Map.Entry entry2 : map2.entrySet()) {
            android.view.View view3 = (android.view.View) entry2.getValue();
            if (view3 != null) {
                this.f40030E.put((java.lang.String) entry2.getKey(), new java.lang.ref.WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.f40031F.putAll(this.f40030E);
        this.f40033H = new com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2670Ob(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5811yh
    public final synchronized void H4(X3.a aVar) {
        try {
            if (this.f40032G != null) {
                java.lang.Object objL0 = X3.b.L0(aVar);
                if (!(objL0 instanceof android.view.View)) {
                    p224w3.p.g("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                this.f40032G.w((android.view.View) objL0);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK
    public final synchronized android.view.View S(java.lang.String str) {
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f40031F.get(str);
        if (weakReference == null) {
            return null;
        }
        return (android.view.View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5811yh
    public final synchronized void X3(X3.a aVar) {
        java.lang.Object objL0 = X3.b.L0(aVar);
        if (!(objL0 instanceof com.google.android.gms.internal.ads.ZI)) {
            p224w3.p.g("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        com.google.android.gms.internal.ads.ZI zi = this.f40032G;
        if (zi != null) {
            zi.C(this);
        }
        com.google.android.gms.internal.ads.ZI zi2 = (com.google.android.gms.internal.ads.ZI) objL0;
        if (!zi2.D()) {
            p224w3.p.d("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.f40032G = zi2;
        zi2.B(this);
        this.f40032G.s(e());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK
    public final synchronized void c2(java.lang.String str, android.view.View view, boolean z6) {
        this.f40031F.put(str, new java.lang.ref.WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f40029D.put(str, new java.lang.ref.WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK
    public final android.view.View e() {
        return (android.view.View) this.f40028C.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5811yh
    public final synchronized void f() {
        com.google.android.gms.internal.ads.ZI zi = this.f40032G;
        if (zi != null) {
            zi.C(this);
            this.f40032G = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK
    public final android.widget.FrameLayout g() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK
    public final com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2670Ob h() {
        return this.f40033H;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK
    public final synchronized X3.a j() {
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK
    public final synchronized java.lang.String k() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK
    public final synchronized java.util.Map l() {
        return this.f40031F;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK
    public final synchronized java.util.Map m() {
        return this.f40029D;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK
    public final synchronized java.util.Map n() {
        return this.f40030E;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(android.view.View view) {
        com.google.android.gms.internal.ads.ZI zi = this.f40032G;
        if (zi != null) {
            zi.l(view, e(), l(), m(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        com.google.android.gms.internal.ads.ZI zi = this.f40032G;
        if (zi != null) {
            zi.j(e(), l(), m(), com.google.android.gms.internal.ads.ZI.H(e()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        com.google.android.gms.internal.ads.ZI zi = this.f40032G;
        if (zi != null) {
            zi.j(e(), l(), m(), com.google.android.gms.internal.ads.ZI.H(e()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.google.android.gms.internal.ads.ZI zi = this.f40032G;
        if (zi != null) {
            zi.u(view, motionEvent, e());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK
    public final synchronized org.json.JSONObject p() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK
    public final synchronized org.json.JSONObject q() {
        com.google.android.gms.internal.ads.ZI zi = this.f40032G;
        if (zi == null) {
            return null;
        }
        return zi.X(e(), l(), m());
    }
}
