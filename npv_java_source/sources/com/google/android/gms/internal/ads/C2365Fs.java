package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2365Fs extends com.google.android.gms.internal.ads.L7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final com.google.android.gms.internal.ads.C2365Fs f27467c = new com.google.android.gms.internal.ads.C2365Fs();

    C2365Fs() {
    }

    @Override // com.google.android.gms.internal.ads.L7
    public final com.google.android.gms.internal.ads.P7 b(java.lang.String str, byte[] bArr, java.lang.String str2) {
        if ("moov".equals(str)) {
            return new com.google.android.gms.internal.ads.S7();
        }
        return "mvhd".equals(str) ? new com.google.android.gms.internal.ads.T7() : new com.google.android.gms.internal.ads.U7(str);
    }
}
