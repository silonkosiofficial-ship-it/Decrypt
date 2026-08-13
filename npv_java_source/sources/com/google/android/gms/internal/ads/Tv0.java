package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Tv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final java.nio.charset.Charset f32041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f32042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.nio.ByteBuffer f32043c;

    static {
        java.nio.charset.Charset.forName("US-ASCII");
        f32041a = java.nio.charset.Charset.forName("UTF-8");
        java.nio.charset.Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f32042b = bArr;
        f32043c = java.nio.ByteBuffer.wrap(bArr);
        com.google.android.gms.internal.ads.AbstractC4301kv0.f(bArr, 0, 0, false);
    }

    public static int a(boolean z6) {
        return z6 ? 1231 : 1237;
    }

    static int b(int i6, byte[] bArr, int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            i6 = (i6 * 31) + bArr[i12];
        }
        return i6;
    }

    static java.lang.Object c(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(str);
    }
}
