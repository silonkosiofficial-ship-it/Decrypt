package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final java.nio.charset.Charset f41448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f41449b;

    static {
        java.nio.charset.Charset.forName("US-ASCII");
        f41448a = java.nio.charset.Charset.forName("UTF-8");
        java.nio.charset.Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f41449b = bArr;
        java.nio.ByteBuffer.wrap(bArr);
        int i6 = com.google.android.gms.internal.play_billing.AbstractC6285r2.f41643a;
        try {
            new com.google.android.gms.internal.play_billing.C6274p2(bArr, 0, 0, false, null).c(0);
        } catch (com.google.android.gms.internal.play_billing.S2 e6) {
            throw new java.lang.IllegalArgumentException(e6);
        }
    }

    public static int a(boolean z6) {
        return z6 ? 1231 : 1237;
    }

    static int b(int i6, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            i6 = (i6 * 31) + bArr[i12];
        }
        return i6;
    }

    static java.lang.Object c(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException("messageType");
    }
}
