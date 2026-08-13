package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5569wS implements com.google.android.gms.internal.ads.InterfaceC4447mD {
    protected C5569wS() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4447mD
    public final long a() {
        return java.lang.System.currentTimeMillis();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4447mD
    public final long b() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4447mD
    public final long c() {
        return java.lang.System.nanoTime();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4447mD
    public final com.google.android.gms.internal.ads.InterfaceC5666xI d(android.os.Looper looper, android.os.Handler.Callback callback) {
        return new com.google.android.gms.internal.ads.ZT(new android.os.Handler(looper, callback));
    }
}
