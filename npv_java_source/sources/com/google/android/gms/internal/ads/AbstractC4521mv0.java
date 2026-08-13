package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC4521mv0 extends com.google.android.gms.internal.ads.AbstractC5070rv0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final byte[] f37435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f37436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f37437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f37438g;

    AbstractC4521mv0(int i6) {
        super(null);
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[java.lang.Math.max(i6, 20)];
        this.f37435d = bArr;
        this.f37436e = bArr.length;
    }

    final void C(byte b6) {
        byte[] bArr = this.f37435d;
        int i6 = this.f37437f;
        bArr[i6] = b6;
        this.f37437f = i6 + 1;
        this.f37438g++;
    }

    final void D(int i6) {
        int i10 = this.f37437f;
        byte[] bArr = this.f37435d;
        bArr[i10] = (byte) i6;
        bArr[i10 + 1] = (byte) (i6 >> 8);
        bArr[i10 + 2] = (byte) (i6 >> 16);
        bArr[i10 + 3] = (byte) (i6 >> 24);
        this.f37437f = i10 + 4;
        this.f37438g += 4;
    }

    final void E(long j6) {
        int i6 = this.f37437f;
        byte[] bArr = this.f37435d;
        bArr[i6] = (byte) j6;
        bArr[i6 + 1] = (byte) (j6 >> 8);
        bArr[i6 + 2] = (byte) (j6 >> 16);
        bArr[i6 + 3] = (byte) (j6 >> 24);
        bArr[i6 + 4] = (byte) (j6 >> 32);
        bArr[i6 + 5] = (byte) (j6 >> 40);
        bArr[i6 + 6] = (byte) (j6 >> 48);
        bArr[i6 + 7] = (byte) (j6 >> 56);
        this.f37437f = i6 + 8;
        this.f37438g += 8;
    }

    final void F(int i6) {
        int i10;
        if (com.google.android.gms.internal.ads.AbstractC5070rv0.f38575c) {
            long j6 = this.f37437f;
            while ((i6 & (-128)) != 0) {
                byte[] bArr = this.f37435d;
                int i11 = this.f37437f;
                this.f37437f = i11 + 1;
                com.google.android.gms.internal.ads.Sw0.y(bArr, i11, (byte) (i6 | 128));
                i6 >>>= 7;
            }
            byte[] bArr2 = this.f37435d;
            int i12 = this.f37437f;
            this.f37437f = i12 + 1;
            com.google.android.gms.internal.ads.Sw0.y(bArr2, i12, (byte) i6);
            i10 = this.f37438g + ((int) (((long) this.f37437f) - j6));
        } else {
            while ((i6 & (-128)) != 0) {
                byte[] bArr3 = this.f37435d;
                int i13 = this.f37437f;
                this.f37437f = i13 + 1;
                bArr3[i13] = (byte) (i6 | 128);
                this.f37438g++;
                i6 >>>= 7;
            }
            byte[] bArr4 = this.f37435d;
            int i14 = this.f37437f;
            this.f37437f = i14 + 1;
            bArr4[i14] = (byte) i6;
            i10 = this.f37438g + 1;
        }
        this.f37438g = i10;
    }

    final void G(long j6) {
        if (com.google.android.gms.internal.ads.AbstractC5070rv0.f38575c) {
            long j10 = this.f37437f;
            while (true) {
                int i6 = (int) j6;
                if ((j6 & (-128)) == 0) {
                    byte[] bArr = this.f37435d;
                    int i10 = this.f37437f;
                    this.f37437f = i10 + 1;
                    com.google.android.gms.internal.ads.Sw0.y(bArr, i10, (byte) i6);
                    this.f37438g += (int) (((long) this.f37437f) - j10);
                    return;
                }
                byte[] bArr2 = this.f37435d;
                int i11 = this.f37437f;
                this.f37437f = i11 + 1;
                com.google.android.gms.internal.ads.Sw0.y(bArr2, i11, (byte) (i6 | 128));
                j6 >>>= 7;
            }
        } else {
            while (true) {
                int i12 = (int) j6;
                if ((j6 & (-128)) == 0) {
                    byte[] bArr3 = this.f37435d;
                    int i13 = this.f37437f;
                    this.f37437f = i13 + 1;
                    bArr3[i13] = (byte) i12;
                    this.f37438g++;
                    return;
                }
                byte[] bArr4 = this.f37435d;
                int i14 = this.f37437f;
                this.f37437f = i14 + 1;
                bArr4[i14] = (byte) (i12 | 128);
                this.f37438g++;
                j6 >>>= 7;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5070rv0
    public final int n() {
        throw new java.lang.UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
