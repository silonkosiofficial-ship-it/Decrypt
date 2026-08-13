package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3983i0 implements com.google.android.gms.internal.ads.InterfaceC5300u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4884qB0 f36185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f36186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f36187d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f36190g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f36188e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f36184a = new byte[4096];

    static {
        com.google.android.gms.internal.ads.AbstractC4986r8.b("media3.extractor");
    }

    public C3983i0(com.google.android.gms.internal.ads.InterfaceC4884qB0 interfaceC4884qB0, long j6, long j10) {
        this.f36185b = interfaceC4884qB0;
        this.f36187d = j6;
        this.f36186c = j10;
    }

    private final int i(byte[] bArr, int i6, int i10) {
        int i11 = this.f36190g;
        if (i11 == 0) {
            return 0;
        }
        int iMin = java.lang.Math.min(i11, i10);
        java.lang.System.arraycopy(this.f36188e, 0, bArr, i6, iMin);
        o(iMin);
        return iMin;
    }

    private final int k(byte[] bArr, int i6, int i10, int i11, boolean z6) throws java.io.EOFException, java.io.InterruptedIOException {
        if (java.lang.Thread.interrupted()) {
            throw new java.io.InterruptedIOException();
        }
        int iH = this.f36185b.H(bArr, i6 + i11, i10 - i11);
        if (iH != -1) {
            return i11 + iH;
        }
        if (i11 == 0 && z6) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    private final int l(int i6) {
        int iMin = java.lang.Math.min(this.f36190g, i6);
        o(iMin);
        return iMin;
    }

    private final void m(int i6) {
        if (i6 != -1) {
            this.f36187d += (long) i6;
        }
    }

    private final void n(int i6) {
        int i10 = this.f36189f + i6;
        int length = this.f36188e.length;
        if (i10 > length) {
            this.f36188e = java.util.Arrays.copyOf(this.f36188e, java.lang.Math.max(65536 + i10, java.lang.Math.min(length + length, i10 + 524288)));
        }
    }

    private final void o(int i6) {
        int i10 = this.f36190g - i6;
        this.f36190g = i10;
        this.f36189f = 0;
        byte[] bArr = this.f36188e;
        byte[] bArr2 = i10 < bArr.length + (-524288) ? new byte[65536 + i10] : bArr;
        java.lang.System.arraycopy(bArr, i6, bArr2, 0, i10);
        this.f36188e = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5300u0
    public final void D(int i6) throws java.io.EOFException, java.io.InterruptedIOException {
        g(i6, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5300u0
    public final int G(int i6) throws java.io.EOFException, java.io.InterruptedIOException {
        int iL = l(1);
        if (iL == 0) {
            iL = k(this.f36184a, 0, java.lang.Math.min(1, 4096), 0, true);
        }
        m(iL);
        return iL;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5300u0, com.google.android.gms.internal.ads.InterfaceC4884qB0
    public final int H(byte[] bArr, int i6, int i10) throws java.io.EOFException, java.io.InterruptedIOException {
        int i11 = i(bArr, i6, i10);
        if (i11 == 0) {
            i11 = k(bArr, i6, i10, 0, true);
        }
        m(i11);
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5300u0
    public final void I(int i6) throws java.io.EOFException, java.io.InterruptedIOException {
        h(i6, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5300u0
    public final boolean J(byte[] bArr, int i6, int i10, boolean z6) throws java.io.EOFException, java.io.InterruptedIOException {
        int i11 = i(bArr, i6, i10);
        while (i11 < i10 && i11 != -1) {
            i11 = k(bArr, i6, i10, i11, z6);
        }
        m(i11);
        return i11 != -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5300u0
    public final int K(byte[] bArr, int i6, int i10) throws java.io.EOFException, java.io.InterruptedIOException {
        int iMin;
        n(i10);
        int i11 = this.f36190g;
        int i12 = this.f36189f;
        int i13 = i11 - i12;
        if (i13 == 0) {
            iMin = k(this.f36188e, i12, i10, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f36190g += iMin;
        } else {
            iMin = java.lang.Math.min(i10, i13);
        }
        java.lang.System.arraycopy(this.f36188e, this.f36189f, bArr, i6, iMin);
        this.f36189f += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5300u0
    public final boolean L(byte[] bArr, int i6, int i10, boolean z6) {
        if (!g(i10, z6)) {
            return false;
        }
        java.lang.System.arraycopy(this.f36188e, this.f36189f - i10, bArr, i6, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5300u0
    public final void M(byte[] bArr, int i6, int i10) throws java.io.EOFException, java.io.InterruptedIOException {
        J(bArr, i6, i10, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5300u0
    public final void N(byte[] bArr, int i6, int i10) {
        L(bArr, i6, i10, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5300u0
    public final long d() {
        return this.f36187d + ((long) this.f36189f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5300u0
    public final long e() {
        return this.f36187d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5300u0
    public final long f() {
        return this.f36186c;
    }

    public final boolean g(int i6, boolean z6) throws java.io.EOFException, java.io.InterruptedIOException {
        n(i6);
        int iK = this.f36190g - this.f36189f;
        while (iK < i6) {
            iK = k(this.f36188e, this.f36189f, i6, iK, z6);
            if (iK == -1) {
                return false;
            }
            this.f36190g = this.f36189f + iK;
        }
        this.f36189f += i6;
        return true;
    }

    public final boolean h(int i6, boolean z6) throws java.io.EOFException, java.io.InterruptedIOException {
        int iL = l(i6);
        while (iL < i6 && iL != -1) {
            iL = k(this.f36184a, -iL, java.lang.Math.min(i6, iL + 4096), iL, false);
        }
        m(iL);
        return iL != -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5300u0
    public final void j() {
        this.f36189f = 0;
    }
}
