package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class HandlerC3906hG0 extends android.os.Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4234kG0 f36041a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandlerC3906hG0(com.google.android.gms.internal.ads.C4234kG0 c4234kG0, android.os.Looper looper) {
        super(looper);
        this.f36041a = c4234kG0;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        com.google.android.gms.internal.ads.C4234kG0.f(this.f36041a, message);
    }
}
