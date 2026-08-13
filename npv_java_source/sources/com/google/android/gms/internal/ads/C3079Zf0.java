package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3079Zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2865Tg0 f33635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f33636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3175ag0 f33637c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f33640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final android.content.Intent f33641g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private android.content.ServiceConnection f33643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private android.os.IInterface f33644j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.List f33639e = new java.util.ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f33638d = "OverlayDisplayService";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final android.os.IBinder.DeathRecipient f33642h = new android.os.IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.Rf0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            this.f31305a.k();
        }
    };

    C3079Zf0(android.content.Context context, com.google.android.gms.internal.ads.C3175ag0 c3175ag0, java.lang.String str, android.content.Intent intent, com.google.android.gms.internal.ads.C2273Df0 c2273Df0) {
        this.f33636b = context;
        this.f33637c = c3175ag0;
        final java.lang.String str2 = "OverlayDisplayService";
        this.f33641g = intent;
        this.f33635a = com.google.android.gms.internal.ads.AbstractC3009Xg0.a(new com.google.android.gms.internal.ads.InterfaceC2865Tg0(str2) { // from class: com.google.android.gms.internal.ads.Qf0

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            public final /* synthetic */ java.lang.String f31028C = "OverlayDisplayService";

            @Override // com.google.android.gms.internal.ads.InterfaceC2865Tg0
            public final java.lang.Object a() {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread(this.f31028C, 10);
                handlerThread.start();
                return new android.os.Handler(handlerThread.getLooper());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(final java.lang.Runnable runnable) {
        ((android.os.Handler) this.f33635a.a()).post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Sf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f31734C.l(runnable);
            }
        });
    }

    public final android.os.IInterface c() {
        return this.f33644j;
    }

    public final void i(final java.lang.Runnable runnable) {
        o(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Tf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f31973C.j(runnable);
            }
        });
    }

    final /* synthetic */ void j(java.lang.Runnable runnable) {
        if (this.f33644j != null || this.f33640f) {
            if (!this.f33640f) {
                runnable.run();
                return;
            }
            this.f33637c.c("Waiting to bind to the service.", new java.lang.Object[0]);
            synchronized (this.f33639e) {
                this.f33639e.add(runnable);
            }
            return;
        }
        this.f33637c.c("Initiate binding to the service.", new java.lang.Object[0]);
        synchronized (this.f33639e) {
            this.f33639e.add(runnable);
        }
        com.google.android.gms.internal.ads.ServiceConnectionC3007Xf0 serviceConnectionC3007Xf0 = new com.google.android.gms.internal.ads.ServiceConnectionC3007Xf0(this, null);
        this.f33643i = serviceConnectionC3007Xf0;
        this.f33640f = true;
        if (this.f33636b.bindService(this.f33641g, serviceConnectionC3007Xf0, 1)) {
            return;
        }
        this.f33637c.c("Failed to bind to the service.", new java.lang.Object[0]);
        this.f33640f = false;
        synchronized (this.f33639e) {
            this.f33639e.clear();
        }
    }

    final /* synthetic */ void k() {
        this.f33637c.c("%s : Binder has died.", this.f33638d);
        synchronized (this.f33639e) {
            this.f33639e.clear();
        }
    }

    final /* synthetic */ void l(java.lang.Runnable runnable) {
        try {
            runnable.run();
        } catch (java.lang.RuntimeException e6) {
            this.f33637c.a("error caused by ", e6);
        }
    }

    final /* synthetic */ void m() {
        if (this.f33644j != null) {
            this.f33637c.c("Unbind from service.", new java.lang.Object[0]);
            android.content.Context context = this.f33636b;
            android.content.ServiceConnection serviceConnection = this.f33643i;
            serviceConnection.getClass();
            context.unbindService(serviceConnection);
            this.f33640f = false;
            this.f33644j = null;
            this.f33643i = null;
            synchronized (this.f33639e) {
                this.f33639e.clear();
            }
        }
    }

    public final void n() {
        o(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Uf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f32248C.m();
            }
        });
    }
}
