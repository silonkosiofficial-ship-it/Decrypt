package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC4848pu implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC4958qu f38097C;

    RunnableC4848pu(com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC4958qu viewTreeObserverOnGlobalLayoutListenerC4958qu) {
        this.f38097C = viewTreeObserverOnGlobalLayoutListenerC4958qu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
