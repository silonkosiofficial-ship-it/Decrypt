package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC2447Ia implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2521Ka f28476C;

    RunnableC2447Ia(com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2521Ka viewOnAttachStateChangeListenerC2521Ka) {
        this.f28476C = viewOnAttachStateChangeListenerC2521Ka;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28476C.f();
    }
}
