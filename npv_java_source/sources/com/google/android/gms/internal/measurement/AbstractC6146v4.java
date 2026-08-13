package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6146v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final java.nio.charset.Charset f41255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f41256b;

    static {
        java.nio.charset.Charset.forName("US-ASCII");
        f41255a = java.nio.charset.Charset.forName("UTF-8");
        java.nio.charset.Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f41256b = bArr;
        java.nio.ByteBuffer.wrap(bArr);
        com.google.android.gms.internal.measurement.X3.c(bArr, 0, bArr.length, false);
    }

    static int a(int i6, byte[] bArr, int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            i6 = (i6 * 31) + bArr[i12];
        }
        return i6;
    }

    public static int b(long j6) {
        return (int) (j6 ^ (j6 >>> 32));
    }

    public static int c(boolean z6) {
        return z6 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        int length = bArr.length;
        int iA = a(length, bArr, 0, length);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    static java.lang.Object e(java.lang.Object obj) {
        obj.getClass();
        return obj;
    }

    static java.lang.Object f(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(str);
    }

    static boolean g(com.google.android.gms.internal.measurement.InterfaceC5965a5 interfaceC5965a5) {
        return false;
    }
}
