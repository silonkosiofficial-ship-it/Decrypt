package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC2540Kj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f29005a;

    static {
        byte[] bArr = new byte[128];
        java.util.Arrays.fill(bArr, (byte) -1);
        for (int i6 = 0; i6 < 10; i6++) {
            bArr[i6 + 48] = (byte) i6;
        }
        for (int i10 = 0; i10 < 26; i10++) {
            byte b6 = (byte) (i10 + 10);
            bArr[i10 + 65] = b6;
            bArr[i10 + 97] = b6;
        }
        f29005a = bArr;
    }

    static int a(char c6) {
        if (c6 < 128) {
            return f29005a[c6];
        }
        return -1;
    }
}
