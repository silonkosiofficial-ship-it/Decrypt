package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3825gc0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.C3825gc0 f35638d = new com.google.android.gms.internal.ads.C3825gc0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.ref.WeakReference f35639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f35640b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35641c = false;

    public static com.google.android.gms.internal.ads.C3825gc0 a() {
        return f35638d;
    }

    public final void c() {
        android.content.Context context = (android.content.Context) this.f35639a.get();
        if (context == null) {
            return;
        }
        boolean zIsDeviceLocked = ((android.app.KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        d(this.f35640b, zIsDeviceLocked);
        this.f35641c = zIsDeviceLocked;
    }

    public final void d(boolean z6, boolean z10) {
        if ((z10 || z6) == (this.f35641c || this.f35640b)) {
            return;
        }
        java.util.Iterator it = com.google.android.gms.internal.ads.C2963Wb0.a().c().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.C2339Fb0) it.next()).g().m(z10 || z6);
        }
    }

    public final void e(android.content.Context context) {
        if (context == null) {
            return;
        }
        this.f35639a = new java.lang.ref.WeakReference(context);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new com.google.android.gms.internal.ads.C3715fc0(this), intentFilter);
    }
}
