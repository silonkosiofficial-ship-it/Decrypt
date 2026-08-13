package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC4793pL extends com.google.android.gms.internal.ads.AbstractBinderC4828pk implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, com.google.android.gms.internal.ads.InterfaceC3176ah {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private android.view.View f37972C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private p184s3.Y0 f37973D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private com.google.android.gms.internal.ads.ZI f37974E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f37975F = false;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f37976G = false;

    public ViewTreeObserverOnGlobalLayoutListenerC4793pL(com.google.android.gms.internal.ads.ZI zi, com.google.android.gms.internal.ads.C3581eJ c3581eJ) {
        this.f37972C = c3581eJ.S();
        this.f37973D = c3581eJ.W();
        this.f37974E = zi;
        if (c3581eJ.f0() != null) {
            c3581eJ.f0().Q0(this);
        }
    }

    private final void g() {
        android.view.View view = this.f37972C;
        if (view == null) {
            return;
        }
        android.view.ViewParent parent = view.getParent();
        if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).removeView(this.f37972C);
        }
    }

    private final void i() {
        android.view.View view;
        com.google.android.gms.internal.ads.ZI zi = this.f37974E;
        if (zi == null || (view = this.f37972C) == null) {
            return;
        }
        zi.j(view, java.util.Collections.emptyMap(), java.util.Collections.emptyMap(), com.google.android.gms.internal.ads.ZI.H(this.f37972C));
    }

    private static final void o6(com.google.android.gms.internal.ads.InterfaceC5267tk interfaceC5267tk, int i6) {
        try {
            interfaceC5267tk.F(i6);
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4938qk
    public final p184s3.Y0 b() {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        if (!this.f37975F) {
            return this.f37973D;
        }
        p224w3.p.d("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4938qk
    public final com.google.android.gms.internal.ads.InterfaceC4382lh c() {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        if (this.f37975F) {
            p224w3.p.d("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        com.google.android.gms.internal.ads.ZI zi = this.f37974E;
        if (zi == null || zi.Q() == null) {
            return null;
        }
        return zi.Q().a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4938qk
    public final void f() {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        g();
        com.google.android.gms.internal.ads.ZI zi = this.f37974E;
        if (zi != null) {
            zi.a();
        }
        this.f37974E = null;
        this.f37972C = null;
        this.f37973D = null;
        this.f37975F = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4938qk
    public final void h3(X3.a aVar, com.google.android.gms.internal.ads.InterfaceC5267tk interfaceC5267tk) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        if (this.f37975F) {
            p224w3.p.d("Instream ad can not be shown after destroy().");
            o6(interfaceC5267tk, 2);
            return;
        }
        android.view.View view = this.f37972C;
        if (view == null || this.f37973D == null) {
            p224w3.p.d("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            o6(interfaceC5267tk, 0);
            return;
        }
        if (this.f37976G) {
            p224w3.p.d("Instream ad should not be used again.");
            o6(interfaceC5267tk, 1);
            return;
        }
        this.f37976G = true;
        g();
        ((android.view.ViewGroup) X3.b.L0(aVar)).addView(this.f37972C, new android.view.ViewGroup.LayoutParams(-1, -1));
        p174r3.v.B();
        com.google.android.gms.internal.ads.C5391ur.a(this.f37972C, this);
        p174r3.v.B();
        com.google.android.gms.internal.ads.C5391ur.b(this.f37972C, this);
        i();
        try {
            interfaceC5267tk.e();
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        i();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4938qk
    public final void zze(X3.a aVar) {
        Q3.AbstractC1477p.e("#008 Must be called on the main UI thread.");
        h3(aVar, new com.google.android.gms.internal.ads.BinderC4683oL(this));
    }
}
