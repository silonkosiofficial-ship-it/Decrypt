package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Z2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f33455d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f33456a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33458c;

    public static int b(int i6) {
        int i10 = 0;
        while (i10 < 8) {
            int i11 = i10 + 1;
            if ((f33455d[i10] & ((long) i6)) != 0) {
                return i11;
            }
            i10 = i11;
        }
        return -1;
    }

    public static long c(byte[] bArr, int i6, boolean z6) {
        long j6 = ((long) bArr[0]) & 255;
        if (z6) {
            j6 &= ~f33455d[i6 - 1];
        }
        for (int i10 = 1; i10 < i6; i10++) {
            j6 = (j6 << 8) | (((long) bArr[i10]) & 255);
        }
        return j6;
    }

    public final int a() {
        return this.f33458c;
    }

    public final long d(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, boolean z6, boolean z10, int i6) {
        if (this.f33457b == 0) {
            if (!interfaceC5300u0.J(this.f33456a, 0, 1, z6)) {
                return -1L;
            }
            int iB = b(this.f33456a[0] & 255);
            this.f33458c = iB;
            if (iB == -1) {
                throw new java.lang.IllegalStateException("No valid varint length mask found");
            }
            this.f33457b = 1;
        }
        int i10 = this.f33458c;
        if (i10 > i6) {
            this.f33457b = 0;
            return -2L;
        }
        if (i10 != 1) {
            interfaceC5300u0.M(this.f33456a, 1, i10 - 1);
        }
        this.f33457b = 0;
        return c(this.f33456a, this.f33458c, z10);
    }

    public final void e() {
        this.f33457b = 0;
        this.f33458c = 0;
    }
}
