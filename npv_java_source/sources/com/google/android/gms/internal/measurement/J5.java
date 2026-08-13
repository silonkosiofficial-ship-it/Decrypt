package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
abstract class J5 {
    static /* synthetic */ void a(byte b6, byte b10, byte b11, byte b12, char[] cArr, int i6) throws com.google.android.gms.internal.measurement.C4 {
        if (e(b10) || (((b6 << 28) + (b10 + 112)) >> 30) != 0 || e(b11) || e(b12)) {
            throw com.google.android.gms.internal.measurement.C4.c();
        }
        int i10 = ((b6 & 7) << 18) | ((b10 & 63) << 12) | ((b11 & 63) << 6) | (b12 & 63);
        cArr[i6] = (char) ((i10 >>> 10) + 55232);
        cArr[i6 + 1] = (char) ((i10 & 1023) + 56320);
    }

    static /* synthetic */ void b(byte b6, byte b10, byte b11, char[] cArr, int i6) throws com.google.android.gms.internal.measurement.C4 {
        if (e(b10) || ((b6 == -32 && b10 < -96) || ((b6 == -19 && b10 >= -96) || e(b11)))) {
            throw com.google.android.gms.internal.measurement.C4.c();
        }
        cArr[i6] = (char) (((b6 & 15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
    }

    static /* synthetic */ void c(byte b6, byte b10, char[] cArr, int i6) throws com.google.android.gms.internal.measurement.C4 {
        if (b6 < -62 || e(b10)) {
            throw com.google.android.gms.internal.measurement.C4.c();
        }
        cArr[i6] = (char) (((b6 & 31) << 6) | (b10 & 63));
    }

    static /* synthetic */ void d(byte b6, char[] cArr, int i6) {
        cArr[i6] = (char) b6;
    }

    private static boolean e(byte b6) {
        return b6 > -65;
    }
}
