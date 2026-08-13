package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class W5 extends com.google.android.gms.internal.ads.AbstractC3434d0 {
    public W5(com.google.android.gms.internal.ads.C3267bV c3267bV, long j6, long j10) {
        super(new com.google.android.gms.internal.ads.Y(), new com.google.android.gms.internal.ads.U5(c3267bV, null), j6, 0L, j6 + 1, 0L, j10, 188L, 1000);
    }

    static /* bridge */ /* synthetic */ int h(byte[] bArr, int i6) {
        return (bArr[i6 + 3] & 255) | ((bArr[i6] & 255) << 24) | ((bArr[i6 + 1] & 255) << 16) | ((bArr[i6 + 2] & 255) << 8);
    }
}
