package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C6256m2 extends com.google.android.gms.internal.play_billing.AbstractC6250l2 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected final byte[] f41590E;

    C6256m2(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f41590E = bArr;
    }

    protected int D() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6268o2
    public byte d(int i6) {
        return this.f41590E[i6];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6268o2
    byte e(int i6) {
        return this.f41590E[i6];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6268o2
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.play_billing.AbstractC6268o2) || f() != ((com.google.android.gms.internal.play_billing.AbstractC6268o2) obj).f()) {
            return false;
        }
        if (f() == 0) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.play_billing.C6256m2)) {
            return obj.equals(this);
        }
        com.google.android.gms.internal.play_billing.C6256m2 c6256m2 = (com.google.android.gms.internal.play_billing.C6256m2) obj;
        int iW = w();
        int iW2 = c6256m2.w();
        if (iW != 0 && iW2 != 0 && iW != iW2) {
            return false;
        }
        int iF = f();
        if (iF > c6256m2.f()) {
            throw new java.lang.IllegalArgumentException("Length too large: " + iF + f());
        }
        if (iF > c6256m2.f()) {
            throw new java.lang.IllegalArgumentException("Ran off end of other: 0, " + iF + ", " + c6256m2.f());
        }
        byte[] bArr = this.f41590E;
        byte[] bArr2 = c6256m2.f41590E;
        c6256m2.D();
        int i6 = 0;
        int i10 = 0;
        while (i6 < iF) {
            if (bArr[i6] != bArr2[i10]) {
                return false;
            }
            i6++;
            i10++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6268o2
    public int f() {
        return this.f41590E.length;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6268o2
    protected final int g(int i6, int i10, int i11) {
        return com.google.android.gms.internal.play_billing.Q2.b(i6, this.f41590E, 0, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6268o2
    public final com.google.android.gms.internal.play_billing.AbstractC6268o2 n(int i6, int i10) {
        int iS = com.google.android.gms.internal.play_billing.AbstractC6268o2.s(0, i10, f());
        return iS == 0 ? com.google.android.gms.internal.play_billing.AbstractC6268o2.f41602D : new com.google.android.gms.internal.play_billing.C6238j2(this.f41590E, 0, iS);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6268o2
    final void o(com.google.android.gms.internal.play_billing.AbstractC6220g2 abstractC6220g2) {
        ((com.google.android.gms.internal.play_billing.C6291s2) abstractC6220g2).A(this.f41590E, 0, f());
    }
}
