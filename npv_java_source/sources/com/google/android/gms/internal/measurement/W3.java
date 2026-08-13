package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
class W3 extends com.google.android.gms.internal.measurement.T3 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected final byte[] f40700F;

    W3(byte[] bArr) {
        super();
        bArr.getClass();
        this.f40700F = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.L3
    final void C(com.google.android.gms.internal.measurement.M3 m6) {
        m6.a(this.f40700F, P(), E());
    }

    @Override // com.google.android.gms.internal.measurement.L3
    byte D(int i6) {
        return this.f40700F[i6];
    }

    @Override // com.google.android.gms.internal.measurement.L3
    public int E() {
        return this.f40700F.length;
    }

    @Override // com.google.android.gms.internal.measurement.L3
    protected final int M(int i6, int i10, int i11) {
        return com.google.android.gms.internal.measurement.AbstractC6146v4.a(i6, this.f40700F, P(), i11);
    }

    @Override // com.google.android.gms.internal.measurement.T3
    final boolean O(com.google.android.gms.internal.measurement.L3 l6, int i6, int i10) {
        if (i10 > l6.E()) {
            throw new java.lang.IllegalArgumentException("Length too large: " + i10 + E());
        }
        if (i10 > l6.E()) {
            throw new java.lang.IllegalArgumentException("Ran off end of other: 0, " + i10 + ", " + l6.E());
        }
        if (!(l6 instanceof com.google.android.gms.internal.measurement.W3)) {
            return l6.n(0, i10).equals(n(0, i10));
        }
        com.google.android.gms.internal.measurement.W3 w6 = (com.google.android.gms.internal.measurement.W3) l6;
        byte[] bArr = this.f40700F;
        byte[] bArr2 = w6.f40700F;
        int iP = P() + i10;
        int iP2 = P();
        int iP3 = w6.P();
        while (iP2 < iP) {
            if (bArr[iP2] != bArr2[iP3]) {
                return false;
            }
            iP2++;
            iP3++;
        }
        return true;
    }

    protected int P() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.L3
    public byte d(int i6) {
        return this.f40700F[i6];
    }

    @Override // com.google.android.gms.internal.measurement.L3
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.L3) || E() != ((com.google.android.gms.internal.measurement.L3) obj).E()) {
            return false;
        }
        if (E() == 0) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.W3)) {
            return obj.equals(this);
        }
        com.google.android.gms.internal.measurement.W3 w6 = (com.google.android.gms.internal.measurement.W3) obj;
        int iE = e();
        int iE2 = w6.e();
        if (iE == 0 || iE2 == 0 || iE == iE2) {
            return O(w6, 0, E());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.L3
    public final com.google.android.gms.internal.measurement.L3 n(int i6, int i10) {
        int iG = com.google.android.gms.internal.measurement.L3.g(0, i10, E());
        return iG == 0 ? com.google.android.gms.internal.measurement.L3.f40566D : new com.google.android.gms.internal.measurement.P3(this.f40700F, P(), iG);
    }
}
