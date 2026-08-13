package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class OF0 extends com.google.android.gms.internal.ads.AbstractC5619wv {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f30467i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f30468j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f30469k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f30470l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f30471m = com.google.android.gms.internal.ads.EW.f27066f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f30472n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f30473o;

    @Override // com.google.android.gms.internal.ads.InterfaceC2954Vu
    public final void a(java.nio.ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i6 = iLimit - iPosition;
        if (i6 == 0) {
            return;
        }
        int iMin = java.lang.Math.min(i6, this.f30470l);
        this.f30473o += (long) (iMin / this.f39715b.f31387d);
        this.f30470l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f30470l <= 0) {
            int i10 = i6 - iMin;
            int length = (this.f30472n + i10) - this.f30471m.length;
            java.nio.ByteBuffer byteBufferJ = j(length);
            int iMax = java.lang.Math.max(0, java.lang.Math.min(length, this.f30472n));
            byteBufferJ.put(this.f30471m, 0, iMax);
            int iMax2 = java.lang.Math.max(0, java.lang.Math.min(length - iMax, i10));
            byteBuffer.limit(byteBuffer.position() + iMax2);
            byteBufferJ.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i11 = i10 - iMax2;
            int i12 = this.f30472n - iMax;
            this.f30472n = i12;
            byte[] bArr = this.f30471m;
            java.lang.System.arraycopy(bArr, iMax, bArr, 0, i12);
            byteBuffer.get(this.f30471m, this.f30472n, i11);
            this.f30472n += i11;
            byteBufferJ.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5619wv, com.google.android.gms.internal.ads.InterfaceC2954Vu
    public final java.nio.ByteBuffer b() {
        int i6;
        if (super.g() && (i6 = this.f30472n) > 0) {
            j(i6).put(this.f30471m, 0, this.f30472n).flip();
            this.f30472n = 0;
        }
        return super.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5619wv, com.google.android.gms.internal.ads.InterfaceC2954Vu
    public final boolean g() {
        return super.g() && this.f30472n == 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5619wv
    public final com.google.android.gms.internal.ads.C2809Rt h(com.google.android.gms.internal.ads.C2809Rt c2809Rt) throws com.google.android.gms.internal.ads.C5397uu {
        if (c2809Rt.f31386c != 2) {
            throw new com.google.android.gms.internal.ads.C5397uu("Unhandled input format:", c2809Rt);
        }
        this.f30469k = true;
        return (this.f30467i == 0 && this.f30468j == 0) ? com.google.android.gms.internal.ads.C2809Rt.f31383e : c2809Rt;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5619wv
    protected final void k() {
        if (this.f30469k) {
            this.f30469k = false;
            int i6 = this.f30468j;
            int i10 = this.f39715b.f31387d;
            this.f30471m = new byte[i6 * i10];
            this.f30470l = this.f30467i * i10;
        }
        this.f30472n = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5619wv
    protected final void l() {
        if (this.f30469k) {
            int i6 = this.f30472n;
            if (i6 > 0) {
                this.f30473o += (long) (i6 / this.f39715b.f31387d);
            }
            this.f30472n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5619wv
    protected final void m() {
        this.f30471m = com.google.android.gms.internal.ads.EW.f27066f;
    }

    public final long o() {
        return this.f30473o;
    }

    public final void p() {
        this.f30473o = 0L;
    }

    public final void q(int i6, int i10) {
        this.f30467i = i6;
        this.f30468j = i10;
    }
}
