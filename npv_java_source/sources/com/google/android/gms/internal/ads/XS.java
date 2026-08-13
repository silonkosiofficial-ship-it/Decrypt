package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class XS implements com.google.android.gms.internal.ads.WH {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.os.Message f33138a;

    /* synthetic */ XS(com.google.android.gms.internal.ads.AbstractC5790yT abstractC5790yT) {
    }

    @Override // com.google.android.gms.internal.ads.WH
    public final void a() {
        android.os.Message message = this.f33138a;
        message.getClass();
        message.sendToTarget();
        this.f33138a = null;
        com.google.android.gms.internal.ads.ZT.b(this);
    }

    public final com.google.android.gms.internal.ads.XS b(android.os.Message message, com.google.android.gms.internal.ads.ZT zt) {
        this.f33138a = message;
        return this;
    }

    public final boolean c(android.os.Handler handler) {
        android.os.Message message = this.f33138a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.f33138a = null;
        com.google.android.gms.internal.ads.ZT.b(this);
        return zSendMessageAtFrontOfQueue;
    }
}
