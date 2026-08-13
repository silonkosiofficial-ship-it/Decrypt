package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3930ha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static javax.crypto.Cipher f36088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.Object f36089b = new java.lang.Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.Object f36090c = new java.lang.Object();

    public C3930ha(java.security.SecureRandom secureRandom) {
    }

    private static final javax.crypto.Cipher c() {
        javax.crypto.Cipher cipher;
        synchronized (f36090c) {
            try {
                if (f36088a == null) {
                    f36088a = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f36088a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    public final java.lang.String a(byte[] bArr, byte[] bArr2) throws com.google.android.gms.internal.ads.C3820ga {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
            synchronized (f36089b) {
                c().init(1, secretKeySpec, (java.security.SecureRandom) null);
                bArrDoFinal = c().doFinal(bArr2);
                iv = c().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return com.google.android.gms.internal.ads.AbstractC4219k9.a(bArr3, false);
        } catch (java.security.InvalidKeyException e6) {
            throw new com.google.android.gms.internal.ads.C3820ga(this, e6);
        } catch (java.security.NoSuchAlgorithmException e10) {
            throw new com.google.android.gms.internal.ads.C3820ga(this, e10);
        } catch (javax.crypto.BadPaddingException e11) {
            throw new com.google.android.gms.internal.ads.C3820ga(this, e11);
        } catch (javax.crypto.IllegalBlockSizeException e12) {
            throw new com.google.android.gms.internal.ads.C3820ga(this, e12);
        } catch (javax.crypto.NoSuchPaddingException e13) {
            throw new com.google.android.gms.internal.ads.C3820ga(this, e13);
        }
    }

    public final byte[] b(byte[] bArr, java.lang.String str) throws com.google.android.gms.internal.ads.C3820ga {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrB = com.google.android.gms.internal.ads.AbstractC4219k9.b(str, false);
            int length2 = bArrB.length;
            if (length2 <= 16) {
                throw new com.google.android.gms.internal.ads.C3820ga(this);
            }
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrB);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
            synchronized (f36089b) {
                c().init(2, secretKeySpec, new javax.crypto.spec.IvParameterSpec(bArr2));
                bArrDoFinal = c().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (java.lang.IllegalArgumentException e6) {
            throw new com.google.android.gms.internal.ads.C3820ga(this, e6);
        } catch (java.security.InvalidAlgorithmParameterException e10) {
            throw new com.google.android.gms.internal.ads.C3820ga(this, e10);
        } catch (java.security.InvalidKeyException e11) {
            throw new com.google.android.gms.internal.ads.C3820ga(this, e11);
        } catch (java.security.NoSuchAlgorithmException e12) {
            throw new com.google.android.gms.internal.ads.C3820ga(this, e12);
        } catch (javax.crypto.BadPaddingException e13) {
            throw new com.google.android.gms.internal.ads.C3820ga(this, e13);
        } catch (javax.crypto.IllegalBlockSizeException e14) {
            throw new com.google.android.gms.internal.ads.C3820ga(this, e14);
        } catch (javax.crypto.NoSuchPaddingException e15) {
            throw new com.google.android.gms.internal.ads.C3820ga(this, e15);
        }
    }
}
