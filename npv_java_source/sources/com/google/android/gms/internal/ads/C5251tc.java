package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5251tc extends com.google.android.gms.internal.ads.AbstractC4702oc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.security.MessageDigest f38996c;

    @Override // com.google.android.gms.internal.ads.AbstractC4702oc
    public final byte[] b(java.lang.String str) {
        byte[] bArr;
        byte[] bArrArray;
        java.lang.String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        int i6 = 4;
        if (length == 1) {
            int iA = com.google.android.gms.internal.ads.AbstractC5141sc.a(strArrSplit[0]);
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(4);
            byteBufferAllocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iA);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                    int iA2 = com.google.android.gms.internal.ads.AbstractC5141sc.a(strArrSplit[i10]);
                    int i11 = (iA2 >> 16) ^ ((char) iA2);
                    byte b6 = (byte) i11;
                    byte b10 = (byte) (i11 >> 8);
                    int i12 = i10 + i10;
                    bArr[i12] = new byte[]{b6, b10}[0];
                    bArr[i12 + 1] = b10;
                }
            } else {
                bArr = new byte[length];
                for (int i13 = 0; i13 < strArrSplit.length; i13++) {
                    int iA3 = com.google.android.gms.internal.ads.AbstractC5141sc.a(strArrSplit[i13]);
                    bArr[i13] = (byte) ((iA3 >> 24) ^ (((iA3 & 255) ^ ((iA3 >> 8) & 255)) ^ ((iA3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.f38996c = a();
        synchronized (this.f37841a) {
            try {
                java.security.MessageDigest messageDigest = this.f38996c;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.f38996c.update(bArrArray);
                byte[] bArrDigest = this.f38996c.digest();
                int length2 = bArrDigest.length;
                if (length2 <= 4) {
                    i6 = length2;
                }
                byte[] bArr2 = new byte[i6];
                java.lang.System.arraycopy(bArrDigest, 0, bArr2, 0, i6);
                return bArr2;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
