package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4219k9 {
    public static java.lang.String a(byte[] bArr, boolean z6) {
        return android.util.Base64.encodeToString(bArr, true != z6 ? 2 : 11);
    }

    public static byte[] b(java.lang.String str, boolean z6) {
        byte[] bArrDecode = android.util.Base64.decode(str, 2);
        if (bArrDecode.length != 0 || str.length() <= 0) {
            return bArrDecode;
        }
        throw new java.lang.IllegalArgumentException("Unable to decode ".concat(str));
    }
}
