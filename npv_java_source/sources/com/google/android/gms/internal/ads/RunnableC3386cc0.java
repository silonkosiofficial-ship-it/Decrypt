package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3386cc0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ android.webkit.WebView f34544C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ java.lang.String f34545D;

    RunnableC3386cc0(com.google.android.gms.internal.ads.C3496dc0 c3496dc0, android.webkit.WebView webView, java.lang.String str) {
        this.f34544C = webView;
        this.f34545D = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.C3496dc0.k(this.f34544C, this.f34545D);
    }
}
