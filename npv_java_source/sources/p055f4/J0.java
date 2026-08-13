package p055f4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class J0 extends p055f4.F0 implements java.util.Set, j$.util.Set {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private transient p055f4.I0 f45049D;

    J0() {
    }

    public static p055f4.J0 C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        return E(4, "IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    }

    private static p055f4.J0 E(int i6, java.lang.Object... objArr) {
        if (i6 == 0) {
            return p055f4.M0.f45059K;
        }
        if (i6 == 1) {
            java.lang.Object obj = objArr[0];
            j$.util.Objects.requireNonNull(obj);
            return new p055f4.N0(obj);
        }
        int iN = n(i6);
        java.lang.Object[] objArr2 = new java.lang.Object[iN];
        int i10 = iN - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i6; i13++) {
            java.lang.Object obj2 = objArr[i13];
            if (obj2 == null) {
                throw new java.lang.NullPointerException("at index " + i13);
            }
            int iHashCode = obj2.hashCode();
            int iA = p055f4.D0.a(iHashCode);
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
            return new p055f4.N0(obj4);
        }
        if (n(i12) < iN / 2) {
            return E(i12, objArr);
        }
        if (i12 < 3) {
            objArr = java.util.Arrays.copyOf(objArr, i12);
        }
        return new p055f4.M0(objArr, i11, objArr2, i10, i12);
    }

    static int n(int i6) {
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

    public static p055f4.J0 w() {
        return p055f4.M0.f45059K;
    }

    boolean D() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof p055f4.J0) && D() && ((p055f4.J0) obj).D() && hashCode() != obj.hashCode()) {
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

    @Override // java.util.Collection, java.util.Set
    public abstract int hashCode();

    public final p055f4.I0 o() {
        p055f4.I0 i6 = this.f45049D;
        if (i6 != null) {
            return i6;
        }
        p055f4.I0 i0S = s();
        this.f45049D = i0S;
        return i0S;
    }

    p055f4.I0 s() {
        java.lang.Object[] array = toArray();
        int i6 = p055f4.I0.f45047E;
        return p055f4.I0.o(array, array.length);
    }
}
