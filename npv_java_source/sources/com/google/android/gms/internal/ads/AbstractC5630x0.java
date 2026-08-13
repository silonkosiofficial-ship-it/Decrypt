package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5630x0 {
    public static int a(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, byte[] bArr, int i6, int i10) {
        int i11 = 0;
        while (i11 < i10) {
            int iK = interfaceC5300u0.K(bArr, i6 + i11, i10 - i11);
            if (iK == -1) {
                break;
            }
            i11 += iK;
        }
        return i11;
    }

    public static void b(boolean z6, java.lang.String str) throws com.google.android.gms.internal.ads.C4708of {
        if (!z6) {
            throw com.google.android.gms.internal.ads.C4708of.a(str, null);
        }
    }

    public static boolean c(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, byte[] bArr, int i6, int i10, boolean z6) throws java.io.EOFException {
        try {
            return interfaceC5300u0.L(bArr, 0, i10, z6);
        } catch (java.io.EOFException e6) {
            if (z6) {
                return false;
            }
            throw e6;
        }
    }

    public static boolean d(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, byte[] bArr, int i6, int i10) {
        try {
            interfaceC5300u0.M(bArr, i6, i10);
            return true;
        } catch (java.io.EOFException unused) {
            return false;
        }
    }

    public static boolean e(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, int i6) {
        try {
            interfaceC5300u0.I(i6);
            return true;
        } catch (java.io.EOFException unused) {
            return false;
        }
    }
}
