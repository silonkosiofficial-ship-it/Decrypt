package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2484Ja extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2521Ka f28707a;

    C2484Ja(com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2521Ka viewOnAttachStateChangeListenerC2521Ka) {
        this.f28707a = viewOnAttachStateChangeListenerC2521Ka;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        this.f28707a.f();
    }
}
