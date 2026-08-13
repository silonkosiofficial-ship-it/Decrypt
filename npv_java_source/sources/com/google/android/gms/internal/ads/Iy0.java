package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Iy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f28551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f28552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f28554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f28555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f28558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final android.media.MediaCodec.CryptoInfo f28559i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Gx0 f28560j;

    public Iy0() {
        android.media.MediaCodec.CryptoInfo cryptoInfo = new android.media.MediaCodec.CryptoInfo();
        this.f28559i = cryptoInfo;
        this.f28560j = com.google.android.gms.internal.ads.EW.f27061a >= 24 ? new com.google.android.gms.internal.ads.Gx0(cryptoInfo, null) : null;
    }

    public final android.media.MediaCodec.CryptoInfo a() {
        return this.f28559i;
    }

    public final void b(int i6) {
        if (i6 == 0) {
            return;
        }
        if (this.f28554d == null) {
            int[] iArr = new int[1];
            this.f28554d = iArr;
            this.f28559i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f28554d;
        iArr2[0] = iArr2[0] + i6;
    }

    public final void c(int i6, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        this.f28556f = i6;
        this.f28554d = iArr;
        this.f28555e = iArr2;
        this.f28552b = bArr;
        this.f28551a = bArr2;
        this.f28553c = i10;
        this.f28557g = i11;
        this.f28558h = i12;
        android.media.MediaCodec.CryptoInfo cryptoInfo = this.f28559i;
        cryptoInfo.numSubSamples = i6;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i10;
        if (com.google.android.gms.internal.ads.EW.f27061a >= 24) {
            com.google.android.gms.internal.ads.Gx0 gx0 = this.f28560j;
            gx0.getClass();
            com.google.android.gms.internal.ads.Gx0.a(gx0, i11, i12);
        }
    }
}
