package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class WE0 extends com.google.android.gms.internal.ads.AbstractC5619wv {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f32707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f32708j;

    WE0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2954Vu
    public final void a(java.nio.ByteBuffer byteBuffer) {
        int[] iArr = this.f32708j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        java.nio.ByteBuffer byteBufferJ = j(((iLimit - iPosition) / this.f39715b.f31387d) * this.f39716c.f31387d);
        while (iPosition < iLimit) {
            for (int i6 : iArr) {
                byteBufferJ.putShort(byteBuffer.getShort(i6 + i6 + iPosition));
            }
            iPosition += this.f39715b.f31387d;
        }
        byteBuffer.position(iLimit);
        byteBufferJ.flip();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5619wv
    public final com.google.android.gms.internal.ads.C2809Rt h(com.google.android.gms.internal.ads.C2809Rt c2809Rt) throws com.google.android.gms.internal.ads.C5397uu {
        int[] iArr = this.f32707i;
        if (iArr == null) {
            return com.google.android.gms.internal.ads.C2809Rt.f31383e;
        }
        if (c2809Rt.f31386c != 2) {
            throw new com.google.android.gms.internal.ads.C5397uu("Unhandled input format:", c2809Rt);
        }
        boolean z6 = c2809Rt.f31385b != iArr.length;
        int i6 = 0;
        while (true) {
            int length = iArr.length;
            if (i6 >= length) {
                return z6 ? new com.google.android.gms.internal.ads.C2809Rt(c2809Rt.f31384a, length, 2) : com.google.android.gms.internal.ads.C2809Rt.f31383e;
            }
            int i10 = iArr[i6];
            if (i10 >= c2809Rt.f31385b) {
                throw new com.google.android.gms.internal.ads.C5397uu("Unhandled input format:", c2809Rt);
            }
            z6 |= i10 != i6;
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5619wv
    protected final void k() {
        this.f32708j = this.f32707i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5619wv
    protected final void m() {
        this.f32708j = null;
        this.f32707i = null;
    }

    public final void o(int[] iArr) {
        this.f32707i = iArr;
    }
}
