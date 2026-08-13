package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC4923qc0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.webkit.WebView f38291C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C5032rc0 f38292D;

    RunnableC4923qc0(com.google.android.gms.internal.ads.C5032rc0 c5032rc0) {
        this.f38292D = c5032rc0;
        this.f38291C = c5032rc0.f38514e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f38291C.destroy();
    }
}
