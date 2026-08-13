package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4001i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f36231a = new byte[256];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36233c;

    public C4001i9(byte[] bArr) {
        for (int i6 = 0; i6 < 256; i6++) {
            this.f36231a[i6] = (byte) i6;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            byte[] bArr2 = this.f36231a;
            byte b6 = bArr2[i11];
            i10 = (i10 + b6 + bArr[i11 % bArr.length]) & 255;
            bArr2[i11] = bArr2[i10];
            bArr2[i10] = b6;
        }
        this.f36232b = 0;
        this.f36233c = 0;
    }

    public final void a(byte[] bArr) {
        int i6 = this.f36232b;
        int i10 = this.f36233c;
        for (int i11 = 0; i11 < 256; i11++) {
            byte[] bArr2 = this.f36231a;
            i6 = (i6 + 1) & 255;
            byte b6 = bArr2[i6];
            i10 = (i10 + b6) & 255;
            bArr2[i6] = bArr2[i10];
            bArr2[i10] = b6;
            bArr[i11] = (byte) (bArr2[(bArr2[i6] + b6) & 255] ^ bArr[i11]);
        }
        this.f36232b = i6;
        this.f36233c = i10;
    }
}
