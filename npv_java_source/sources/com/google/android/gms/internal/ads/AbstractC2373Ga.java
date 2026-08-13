package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2373Ga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f27825a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f27826b = 0;

    public static long a(double d6, int i6, android.util.DisplayMetrics displayMetrics) {
        return java.lang.Math.round(d6 / ((double) displayMetrics.density));
    }

    public static java.lang.String b(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        for (int i6 = 0; i6 < bArr.length; i6++) {
            byte b6 = bArr[i6];
            char[] cArr2 = f27825a;
            int i10 = i6 + i6;
            cArr[i10] = cArr2[(b6 & 255) >>> 4];
            cArr[i10 + 1] = cArr2[b6 & 15];
        }
        return new java.lang.String(cArr);
    }

    public static boolean c() {
        return android.os.Looper.myLooper() == android.os.Looper.getMainLooper();
    }

    public static boolean d(java.lang.String str) {
        return str == null || str.isEmpty();
    }

    public static boolean e(android.util.DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static byte[] f(java.lang.String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new java.lang.IllegalArgumentException("String must be of even-length");
        }
        byte[] bArr = new byte[length / 2];
        for (int i6 = 0; i6 < length; i6 += 2) {
            bArr[i6 / 2] = (byte) ((java.lang.Character.digit(str.charAt(i6), 16) << 4) + java.lang.Character.digit(str.charAt(i6 + 1), 16));
        }
        return bArr;
    }
}
