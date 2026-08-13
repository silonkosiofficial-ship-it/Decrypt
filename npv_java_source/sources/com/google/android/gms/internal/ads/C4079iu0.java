package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4079iu0 implements com.google.android.gms.internal.ads.InterfaceC5380ul0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.lang.ThreadLocal f36371f = new com.google.android.gms.internal.ads.C3861gu0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.lang.ThreadLocal f36372g = new com.google.android.gms.internal.ads.C3971hu0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f36373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f36374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f36375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final javax.crypto.spec.SecretKeySpec f36376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f36377e;

    private C4079iu0(byte[] bArr, int i6, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.AbstractC3741fp0.a(1)) {
            throw new java.security.GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i6 != 12 && i6 != 16) {
            throw new java.lang.IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f36377e = i6;
        com.google.android.gms.internal.ads.Ju0.a(bArr.length);
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
        this.f36376d = secretKeySpec;
        javax.crypto.Cipher cipher = (javax.crypto.Cipher) f36371f.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrD = d(cipher.doFinal(new byte[16]));
        this.f36373a = bArrD;
        this.f36374b = d(bArrD);
        this.f36375c = bArr2;
    }

    public static com.google.android.gms.internal.ads.InterfaceC5380ul0 b(com.google.android.gms.internal.ads.C5602wm0 c5602wm0) throws java.security.GeneralSecurityException {
        if (com.google.android.gms.internal.ads.AbstractC3741fp0.a(1)) {
            return new com.google.android.gms.internal.ads.C4079iu0(c5602wm0.d().d(com.google.android.gms.internal.ads.Dl0.a()), c5602wm0.b().b(), c5602wm0.c().c());
        }
        throw new java.security.GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    private static void c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            bArr[i6] = (byte) (bArr[i6] ^ bArr2[i6]);
        }
    }

    private static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i6 = 0;
        while (i6 < 15) {
            byte b6 = bArr[i6];
            int i10 = i6 + 1;
            bArr2[i6] = (byte) (((b6 + b6) ^ ((bArr[i10] & 255) >>> 7)) & 255);
            i6 = i10;
        }
        byte b10 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b10 + b10));
        return bArr2;
    }

    private final byte[] e(javax.crypto.Cipher cipher, int i6, byte[] bArr, int i10, int i11) throws javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, javax.crypto.ShortBufferException {
        int length;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i6;
        if (i11 == 0) {
            c(bArr2, this.f36373a);
            return cipher.doFinal(bArr2);
        }
        byte[] bArr3 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr3);
        int i12 = 0;
        while (true) {
            byte[] bArr4 = bArr2;
            bArr2 = bArr3;
            bArr3 = bArr4;
            if (i11 - i12 <= 16) {
                break;
            }
            for (int i13 = 0; i13 < 16; i13++) {
                bArr2[i13] = (byte) (bArr[(i10 + i12) + i13] ^ bArr2[i13]);
            }
            cipher.doFinal(bArr2, 0, 16, bArr3);
            i12 += 16;
        }
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, i12 + i10, i10 + i11);
        if (bArrCopyOfRange.length == 16) {
            c(bArrCopyOfRange, this.f36373a);
        } else {
            byte[] bArrCopyOf = java.util.Arrays.copyOf(this.f36374b, 16);
            int i14 = 0;
            while (true) {
                length = bArrCopyOfRange.length;
                if (i14 >= length) {
                    break;
                }
                bArrCopyOf[i14] = (byte) (bArrCopyOf[i14] ^ bArrCopyOfRange[i14]);
                i14++;
            }
            bArrCopyOf[length] = (byte) (bArrCopyOf[length] ^ 128);
            bArrCopyOfRange = bArrCopyOf;
        }
        c(bArr2, bArrCopyOfRange);
        cipher.doFinal(bArr2, 0, 16, bArr3);
        return bArr3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5380ul0
    public final byte[] a(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.f36375c;
        int length = bArr.length;
        int length2 = ((length - bArr3.length) - this.f36377e) - 16;
        if (length2 < 0) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        if (!com.google.android.gms.internal.ads.Kq0.c(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        javax.crypto.Cipher cipher = (javax.crypto.Cipher) f36371f.get();
        cipher.init(1, this.f36376d);
        byte[] bArrE = e(cipher, 0, bArr, this.f36375c.length, this.f36377e);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr4 = bArr2;
        byte[] bArrE2 = e(cipher, 1, bArr4, 0, bArr4.length);
        byte[] bArrE3 = e(cipher, 2, bArr, this.f36375c.length + this.f36377e, length2);
        int i6 = length - 16;
        byte b6 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            b6 = (byte) (b6 | (((bArr[i6 + i10] ^ bArrE2[i10]) ^ bArrE[i10]) ^ bArrE3[i10]));
        }
        if (b6 != 0) {
            throw new javax.crypto.AEADBadTagException("tag mismatch");
        }
        javax.crypto.Cipher cipher2 = (javax.crypto.Cipher) f36372g.get();
        cipher2.init(1, this.f36376d, new javax.crypto.spec.IvParameterSpec(bArrE));
        return cipher2.doFinal(bArr, this.f36375c.length + this.f36377e, length2);
    }
}
