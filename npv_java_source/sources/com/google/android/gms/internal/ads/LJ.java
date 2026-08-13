package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class LJ implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.PL f29463C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final V3.f f29464D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3946hi f29465E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3838gj f29466F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    java.lang.String f29467G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    java.lang.Long f29468H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    java.lang.ref.WeakReference f29469I;

    public LJ(com.google.android.gms.internal.ads.PL pl, V3.f fVar) {
        this.f29463C = pl;
        this.f29464D = fVar;
    }

    private final void d() {
        android.view.View view;
        this.f29467G = null;
        this.f29468H = null;
        java.lang.ref.WeakReference weakReference = this.f29469I;
        if (weakReference == null || (view = (android.view.View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.f29469I = null;
    }

    public final com.google.android.gms.internal.ads.InterfaceC3946hi a() {
        return this.f29465E;
    }

    public final void b() {
        if (this.f29465E == null || this.f29468H == null) {
            return;
        }
        d();
        try {
            this.f29465E.d();
        } catch (android.os.RemoteException e6) {
            p224w3.p.i("#007 Could not call remote method.", e6);
        }
    }

    public final void c(final com.google.android.gms.internal.ads.InterfaceC3946hi interfaceC3946hi) {
        this.f29465E = interfaceC3946hi;
        com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj = this.f29466F;
        if (interfaceC3838gj != null) {
            this.f29463C.n("/unconfirmedClick", interfaceC3838gj);
        }
        com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj2 = new com.google.android.gms.internal.ads.InterfaceC3838gj() { // from class: com.google.android.gms.internal.ads.KJ
            @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
            public final void a(java.lang.Object obj, java.util.Map map) {
                com.google.android.gms.internal.ads.LJ lj = this.f28888a;
                try {
                    lj.f29468H = java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) map.get("timestamp")));
                } catch (java.lang.NumberFormatException unused) {
                    p224w3.p.d("Failed to call parse unconfirmedClickTimestamp.");
                }
                com.google.android.gms.internal.ads.InterfaceC3946hi interfaceC3946hi2 = interfaceC3946hi;
                lj.f29467G = (java.lang.String) map.get("id");
                java.lang.String str = (java.lang.String) map.get("asset_id");
                if (interfaceC3946hi2 == null) {
                    p224w3.p.b("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    interfaceC3946hi2.G(str);
                } catch (android.os.RemoteException e6) {
                    p224w3.p.i("#007 Could not call remote method.", e6);
                }
            }
        };
        this.f29466F = interfaceC3838gj2;
        this.f29463C.l("/unconfirmedClick", interfaceC3838gj2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.ref.WeakReference weakReference = this.f29469I;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f29467G != null && this.f29468H != null) {
            java.util.HashMap map = new java.util.HashMap();
            map.put("id", this.f29467G);
            map.put("time_interval", java.lang.String.valueOf(this.f29464D.a() - this.f29468H.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.f29463C.j("sendMessageToNativeJs", map);
        }
        d();
    }
}
