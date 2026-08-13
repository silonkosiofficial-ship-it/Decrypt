package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3533dv0 extends java.io.OutputStream {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final byte[] f34845H = new byte[0];

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f34848E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f34850G;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f34846C = 128;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.ArrayList f34847D = new java.util.ArrayList();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private byte[] f34849F = new byte[128];

    C3533dv0(int i6) {
    }

    private final void g(int i6) {
        this.f34847D.add(new com.google.android.gms.internal.ads.C3424cv0(this.f34849F));
        int length = this.f34848E + this.f34849F.length;
        this.f34848E = length;
        this.f34849F = new byte[java.lang.Math.max(this.f34846C, java.lang.Math.max(i6, length >>> 1))];
        this.f34850G = 0;
    }

    public final synchronized int a() {
        return this.f34848E + this.f34850G;
    }

    public final synchronized com.google.android.gms.internal.ads.AbstractC3753fv0 f() {
        try {
            int i6 = this.f34850G;
            byte[] bArr = this.f34849F;
            if (i6 >= bArr.length) {
                this.f34847D.add(new com.google.android.gms.internal.ads.C3424cv0(this.f34849F));
                this.f34849F = f34845H;
            } else if (i6 > 0) {
                this.f34847D.add(new com.google.android.gms.internal.ads.C3424cv0(java.util.Arrays.copyOf(bArr, i6)));
            }
            this.f34848E += this.f34850G;
            this.f34850G = 0;
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return com.google.android.gms.internal.ads.AbstractC3753fv0.S(this.f34847D);
    }

    public final java.lang.String toString() {
        return java.lang.String.format("<ByteString.Output@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(a()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i6) {
        try {
            if (this.f34850G == this.f34849F.length) {
                g(1);
            }
            byte[] bArr = this.f34849F;
            int i10 = this.f34850G;
            this.f34850G = i10 + 1;
            bArr[i10] = (byte) i6;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i6, int i10) {
        byte[] bArr2 = this.f34849F;
        int length = bArr2.length;
        int i11 = this.f34850G;
        int i12 = length - i11;
        if (i10 <= i12) {
            java.lang.System.arraycopy(bArr, i6, bArr2, i11, i10);
            this.f34850G += i10;
            return;
        }
        java.lang.System.arraycopy(bArr, i6, bArr2, i11, i12);
        int i13 = i10 - i12;
        g(i13);
        java.lang.System.arraycopy(bArr, i6 + i12, this.f34849F, 0, i13);
        this.f34850G = i13;
    }
}
