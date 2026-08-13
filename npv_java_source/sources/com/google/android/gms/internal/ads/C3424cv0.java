package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C3424cv0 extends com.google.android.gms.internal.ads.AbstractC3315bv0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected final byte[] f34597E;

    C3424cv0(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f34597E = bArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3753fv0
    protected final int C(int i6, int i10, int i11) {
        return com.google.android.gms.internal.ads.Tv0.b(i6, this.f34597E, Y() + i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3753fv0
    public final com.google.android.gms.internal.ads.AbstractC3753fv0 D(int i6, int i10) {
        int iO = com.google.android.gms.internal.ads.AbstractC3753fv0.O(i6, i10, n());
        return iO == 0 ? com.google.android.gms.internal.ads.AbstractC3753fv0.f35478D : new com.google.android.gms.internal.ads.Zu0(this.f34597E, Y() + i6, iO);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3753fv0
    public final com.google.android.gms.internal.ads.AbstractC4301kv0 E() {
        return com.google.android.gms.internal.ads.AbstractC4301kv0.f(this.f34597E, Y(), n(), true);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3753fv0
    public final java.nio.ByteBuffer M() {
        return java.nio.ByteBuffer.wrap(this.f34597E, Y(), n()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3753fv0
    final void N(com.google.android.gms.internal.ads.Wu0 wu0) {
        wu0.a(this.f34597E, Y(), n());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3315bv0
    final boolean X(com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0, int i6, int i10) {
        if (i10 > abstractC3753fv0.n()) {
            throw new java.lang.IllegalArgumentException("Length too large: " + i10 + n());
        }
        int i11 = i6 + i10;
        if (i11 > abstractC3753fv0.n()) {
            throw new java.lang.IllegalArgumentException("Ran off end of other: " + i6 + ", " + i10 + ", " + abstractC3753fv0.n());
        }
        if (!(abstractC3753fv0 instanceof com.google.android.gms.internal.ads.C3424cv0)) {
            return abstractC3753fv0.D(i6, i11).equals(D(0, i10));
        }
        com.google.android.gms.internal.ads.C3424cv0 c3424cv0 = (com.google.android.gms.internal.ads.C3424cv0) abstractC3753fv0;
        byte[] bArr = this.f34597E;
        byte[] bArr2 = c3424cv0.f34597E;
        int iY = Y() + i10;
        int iY2 = Y();
        int iY3 = c3424cv0.Y() + i6;
        while (iY2 < iY) {
            if (bArr[iY2] != bArr2[iY3]) {
                return false;
            }
            iY2++;
            iY3++;
        }
        return true;
    }

    protected int Y() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3753fv0
    public byte e(int i6) {
        return this.f34597E[i6];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3753fv0
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.AbstractC3753fv0) || n() != ((com.google.android.gms.internal.ads.AbstractC3753fv0) obj).n()) {
            return false;
        }
        if (n() == 0) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.C3424cv0)) {
            return obj.equals(this);
        }
        com.google.android.gms.internal.ads.C3424cv0 c3424cv0 = (com.google.android.gms.internal.ads.C3424cv0) obj;
        int iP = P();
        int iP2 = c3424cv0.P();
        if (iP == 0 || iP2 == 0 || iP == iP2) {
            return X(c3424cv0, 0, n());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3753fv0
    byte f(int i6) {
        return this.f34597E[i6];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3753fv0
    public int n() {
        return this.f34597E.length;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3753fv0
    protected void o(byte[] bArr, int i6, int i10, int i11) {
        java.lang.System.arraycopy(this.f34597E, i6, bArr, i10, i11);
    }
}
