package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5298tz0 extends androidx.browser.customtabs.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.ref.WeakReference f39065b;

    public C5298tz0(com.google.android.gms.internal.ads.C3393cg c3393cg) {
        this.f39065b = new java.lang.ref.WeakReference(c3393cg);
    }

    @Override // androidx.browser.customtabs.e
    public final void a(android.content.ComponentName componentName, androidx.browser.customtabs.c cVar) {
        com.google.android.gms.internal.ads.C3393cg c3393cg = (com.google.android.gms.internal.ads.C3393cg) this.f39065b.get();
        if (c3393cg != null) {
            c3393cg.c(cVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.google.android.gms.internal.ads.C3393cg c3393cg = (com.google.android.gms.internal.ads.C3393cg) this.f39065b.get();
        if (c3393cg != null) {
            c3393cg.d();
        }
    }
}
