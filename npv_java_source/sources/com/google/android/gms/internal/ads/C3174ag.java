package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3174ag extends androidx.browser.customtabs.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f34119b = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.content.Context f34120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3588eO f34121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.browser.customtabs.f f34122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.browser.customtabs.c f34123f;

    private final void h(android.content.Context context) {
        java.lang.String strC;
        if (this.f34123f != null || context == null || (strC = androidx.browser.customtabs.c.c(context, null)) == null) {
            return;
        }
        androidx.browser.customtabs.c.a(context, strC, this);
    }

    @Override // androidx.browser.customtabs.e
    public final void a(android.content.ComponentName componentName, androidx.browser.customtabs.c cVar) {
        this.f34123f = cVar;
        cVar.g(0L);
        this.f34122e = cVar.e(new com.google.android.gms.internal.ads.C3078Zf(this));
    }

    public final androidx.browser.customtabs.f c() {
        if (this.f34122e == null) {
            com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Yf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33378C.e();
                }
            });
        }
        return this.f34122e;
    }

    public final void d(android.content.Context context, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        if (this.f34119b.getAndSet(true)) {
            return;
        }
        this.f34120c = context;
        this.f34121d = c3588eO;
        h(context);
    }

    final /* synthetic */ void e() {
        h(this.f34120c);
    }

    final /* synthetic */ void f(int i6) {
        com.google.android.gms.internal.ads.C3588eO c3588eO = this.f34121d;
        if (c3588eO != null) {
            com.google.android.gms.internal.ads.C3479dO c3479dOA = c3588eO.a();
            c3479dOA.b("action", "cct_nav");
            c3479dOA.b("cct_navs", java.lang.String.valueOf(i6));
            c3479dOA.g();
        }
    }

    public final void g(final int i6) {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25266F4)).booleanValue() || this.f34121d == null) {
            return;
        }
        com.google.android.gms.internal.ads.AbstractC3524dr.f34795a.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.Xf
            @Override // java.lang.Runnable
            public final void run() {
                this.f33157C.f(i6);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f34123f = null;
        this.f34122e = null;
    }
}
