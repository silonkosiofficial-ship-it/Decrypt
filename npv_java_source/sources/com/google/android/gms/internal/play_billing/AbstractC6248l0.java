package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6248l0 extends com.google.android.gms.internal.play_billing.Z implements java.util.Set, j$.util.Set {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private transient com.google.android.gms.internal.play_billing.AbstractC6206e0 f41574D;

    AbstractC6248l0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.internal.play_billing.AbstractC6248l0 E(int i6, java.lang.Object... objArr) {
        if (i6 == 0) {
            return com.google.android.gms.internal.play_billing.H0.f41411K;
        }
        if (i6 == 1) {
            java.lang.Object obj = objArr[0];
            j$.util.Objects.requireNonNull(obj);
            return new com.google.android.gms.internal.play_billing.K0(obj);
        }
        int iS = s(i6);
        java.lang.Object[] objArr2 = new java.lang.Object[iS];
        int i10 = iS - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i6; i13++) {
            java.lang.Object obj2 = objArr[i13];
            com.google.android.gms.internal.play_billing.AbstractC6301u0.a(obj2, i13);
            int iHashCode = obj2.hashCode();
            int iA = com.google.android.gms.internal.play_billing.W.a(iHashCode);
            while (true) {
                int i14 = iA & i10;
                java.lang.Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += iHashCode;
                    i12++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iA++;
            }
        }
        java.util.Arrays.fill(objArr, i12, i6, (java.lang.Object) null);
        if (i12 == 1) {
            java.lang.Object obj4 = objArr[0];
            j$.util.Objects.requireNonNull(obj4);
            return new com.google.android.gms.internal.play_billing.K0(obj4);
        }
        if (s(i12) < iS / 2) {
            return E(i12, objArr);
        }
        int length = objArr.length;
        if (i12 < (length >> 1) + (length >> 2)) {
            objArr = java.util.Arrays.copyOf(objArr, i12);
        }
        return new com.google.android.gms.internal.play_billing.H0(objArr, i11, objArr2, i10, i12);
    }

    static int s(int i6) {
        int iMax = java.lang.Math.max(i6, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new java.lang.IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = java.lang.Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    boolean D() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof com.google.android.gms.internal.play_billing.AbstractC6248l0) && D() && ((com.google.android.gms.internal.play_billing.AbstractC6248l0) obj).D() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.Z
    public com.google.android.gms.internal.play_billing.AbstractC6206e0 g() {
        com.google.android.gms.internal.play_billing.AbstractC6206e0 abstractC6206e0 = this.f41574D;
        if (abstractC6206e0 != null) {
            return abstractC6206e0;
        }
        com.google.android.gms.internal.play_billing.AbstractC6206e0 abstractC6206e0W = w();
        this.f41574D = abstractC6206e0W;
        return abstractC6206e0W;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return com.google.android.gms.internal.play_billing.J0.a(this);
    }

    com.google.android.gms.internal.play_billing.AbstractC6206e0 w() {
        java.lang.Object[] array = toArray();
        int i6 = com.google.android.gms.internal.play_billing.AbstractC6206e0.f41547E;
        return com.google.android.gms.internal.play_billing.AbstractC6206e0.C(array, array.length);
    }
}
