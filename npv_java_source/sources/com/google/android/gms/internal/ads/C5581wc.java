package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5581wc extends com.google.android.gms.internal.ads.AbstractC4702oc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.security.MessageDigest f39651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f39652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f39653e;

    public C5581wc(int i6) {
        int i10 = i6 >> 3;
        this.f39652d = (i6 & 7) > 0 ? i10 + 1 : i10;
        this.f39653e = i6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4702oc
    public final byte[] b(java.lang.String str) {
        synchronized (this.f37841a) {
            try {
                java.security.MessageDigest messageDigestA = a();
                this.f39651c = messageDigestA;
                if (messageDigestA == null) {
                    return new byte[0];
                }
                messageDigestA.reset();
                this.f39651c.update(str.getBytes(java.nio.charset.Charset.forName("UTF-8")));
                byte[] bArrDigest = this.f39651c.digest();
                int length = bArrDigest.length;
                int i6 = this.f39652d;
                if (length > i6) {
                    length = i6;
                }
                byte[] bArr = new byte[length];
                java.lang.System.arraycopy(bArrDigest, 0, bArr, 0, length);
                if ((this.f39653e & 7) > 0) {
                    long j6 = 0;
                    for (int i10 = 0; i10 < length; i10++) {
                        if (i10 > 0) {
                            j6 <<= 8;
                        }
                        j6 += (long) (bArr[i10] & 255);
                    }
                    long j10 = j6 >>> (8 - (this.f39653e & 7));
                    int i11 = this.f39652d;
                    while (true) {
                        i11--;
                        if (i11 < 0) {
                            break;
                        }
                        bArr[i11] = (byte) (255 & j10);
                        j10 >>>= 8;
                    }
                }
                return bArr;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
