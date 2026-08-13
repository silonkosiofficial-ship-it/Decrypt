package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
abstract class Tw0 {
    static /* bridge */ /* synthetic */ void a(byte b6, byte b10, byte b11, byte b12, char[] cArr, int i6) throws com.google.android.gms.internal.ads.Vv0 {
        if (g(b10) || (((b6 << 28) + (b10 + 112)) >> 30) != 0 || g(b11) || g(b12)) {
            throw new com.google.android.gms.internal.ads.Vv0("Protocol message had invalid UTF-8.");
        }
        int i10 = ((b6 & 7) << 18) | ((b10 & 63) << 12) | ((b11 & 63) << 6) | (b12 & 63);
        cArr[i6] = (char) ((i10 >>> 10) + 55232);
        cArr[i6 + 1] = (char) ((i10 & 1023) + 56320);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
  0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    static /* bridge */ /* synthetic */ void b(byte b6, byte b10, byte b11, char[] cArr, int i6) throws com.google.android.gms.internal.ads.Vv0 {
        if (!g(b10)) {
            if (b6 != -32) {
                if (b6 != -19) {
                    if (!g(b11)) {
                        cArr[i6] = (char) (((b6 & 15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
                        return;
                    }
                } else if (b10 < -96) {
                    b6 = -19;
                    if (!g(b11)) {
                        cArr[i6] = (char) (((b6 & 15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
                        return;
                    }
                }
            } else if (b10 >= -96) {
                b6 = -32;
                if (b6 != -19) {
                    if (!g(b11)) {
                        cArr[i6] = (char) (((b6 & 15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
                        return;
                    }
                } else if (b10 < -96) {
                    b6 = -19;
                    if (!g(b11)) {
                        cArr[i6] = (char) (((b6 & 15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
                        return;
                    }
                }
            }
        }
        throw new com.google.android.gms.internal.ads.Vv0("Protocol message had invalid UTF-8.");
    }

    static /* bridge */ /* synthetic */ void c(byte b6, byte b10, char[] cArr, int i6) throws com.google.android.gms.internal.ads.Vv0 {
        if (b6 < -62 || g(b10)) {
            throw new com.google.android.gms.internal.ads.Vv0("Protocol message had invalid UTF-8.");
        }
        cArr[i6] = (char) (((b6 & 31) << 6) | (b10 & 63));
    }

    static /* bridge */ /* synthetic */ boolean d(byte b6) {
        return b6 >= 0;
    }

    static /* bridge */ /* synthetic */ boolean e(byte b6) {
        return b6 < -16;
    }

    static /* bridge */ /* synthetic */ boolean f(byte b6) {
        return b6 < -32;
    }

    private static boolean g(byte b6) {
        return b6 > -65;
    }
}
