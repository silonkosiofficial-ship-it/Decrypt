package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC5738xz0 extends android.content.BroadcastReceiver implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.os.Handler f39967C;

    public RunnableC5738xz0(com.google.android.gms.internal.ads.C5958zz0 c5958zz0, android.os.Handler handler, com.google.android.gms.internal.ads.InterfaceC5848yz0 interfaceC5848yz0) {
        this.f39967C = handler;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f39967C.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
