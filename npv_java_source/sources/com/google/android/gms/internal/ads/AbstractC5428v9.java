package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC5428v9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean f39347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static java.security.MessageDigest f39348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.Object f39349c = new java.lang.Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.Object f39350d = new java.lang.Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final java.util.concurrent.CountDownLatch f39351e = new java.util.concurrent.CountDownLatch(1);

    static com.google.android.gms.internal.ads.C3671f9 a(byte[] bArr, java.lang.String str) {
        java.util.Vector vectorC = c(bArr, 255);
        if (vectorC == null || vectorC.isEmpty()) {
            return null;
        }
        com.google.android.gms.internal.ads.C3671f9 c3671f9B0 = com.google.android.gms.internal.ads.C3781g9.b0();
        int size = vectorC.size();
        for (int i6 = 0; i6 < size; i6++) {
            c3671f9B0.z(com.google.android.gms.internal.ads.AbstractC3753fv0.T(h((byte[]) vectorC.get(i6), str, false), 0, 256));
        }
        byte[] bArrF = f(bArr);
        com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0 = com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D;
        c3671f9B0.A(com.google.android.gms.internal.ads.AbstractC3753fv0.T(bArrF, 0, bArrF.length));
        return c3671f9B0;
    }

    static java.lang.String b(byte[] bArr, java.lang.String str) {
        com.google.android.gms.internal.ads.C3671f9 c3671f9A = a(bArr, str);
        return com.google.android.gms.internal.ads.AbstractC4219k9.a(c3671f9A == null ? h(g(4096).l(), str, true) : ((com.google.android.gms.internal.ads.C3781g9) c3671f9A.u()).l(), true);
    }

    static java.util.Vector c(byte[] bArr, int i6) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i10 = length + 254;
        java.util.Vector vector = new java.util.Vector();
        for (int i11 = 0; i11 < i10 / 255; i11++) {
            int i12 = i11 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i12 > 255) {
                    length2 = i12 + 255;
                }
                vector.add(java.util.Arrays.copyOfRange(bArr, i12, length2));
            } catch (java.lang.IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    static void e() {
        synchronized (f39350d) {
            try {
                if (!f39347a) {
                    f39347a = true;
                    new java.lang.Thread(new com.google.android.gms.internal.ads.RunnableC5208t9(null)).start();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static byte[] f(byte[] bArr) {
        byte[] bArrDigest;
        java.security.MessageDigest messageDigest;
        synchronized (f39349c) {
            try {
                e();
                java.security.MessageDigest messageDigest2 = null;
                try {
                    if (f39351e.await(2L, java.util.concurrent.TimeUnit.SECONDS) && (messageDigest = f39348b) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (java.lang.InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new java.security.NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = f39348b.digest();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return bArrDigest;
    }

    static com.google.android.gms.internal.ads.Q8 g(int i6) {
        com.google.android.gms.internal.ads.C5316u8 c5316u8B0 = com.google.android.gms.internal.ads.Q8.B0();
        c5316u8B0.C(4096L);
        return (com.google.android.gms.internal.ads.Q8) c5316u8B0.u();
    }

    private static byte[] h(byte[] bArr, java.lang.String str, boolean z6) {
        java.nio.ByteBuffer byteBufferPut;
        int length = bArr.length;
        int i6 = true != z6 ? 255 : 239;
        if (length > i6) {
            bArr = g(4096).l();
        }
        int i10 = i6 + 1;
        int length2 = bArr.length;
        byte b6 = (byte) length2;
        if (length2 < i6) {
            byte[] bArr2 = new byte[i6 - length2];
            new java.security.SecureRandom().nextBytes(bArr2);
            byteBufferPut = java.nio.ByteBuffer.allocate(i10).put(b6).put(bArr).put(bArr2);
        } else {
            byteBufferPut = java.nio.ByteBuffer.allocate(i10).put(b6).put(bArr);
        }
        byte[] bArrArray = byteBufferPut.array();
        if (z6) {
            bArrArray = java.nio.ByteBuffer.allocate(256).put(f(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        com.google.android.gms.internal.ads.InterfaceC5538w9[] interfaceC5538w9Arr = new com.google.android.gms.internal.ads.L9().f29253G2;
        int length3 = interfaceC5538w9Arr.length;
        for (int i11 = 0; i11 < 12; i11++) {
            interfaceC5538w9Arr[i11].a(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new com.google.android.gms.internal.ads.C4001i9(str.getBytes("UTF-8")).a(bArr3);
        }
        return bArr3;
    }
}
