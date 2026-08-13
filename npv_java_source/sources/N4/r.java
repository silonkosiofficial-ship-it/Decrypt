package N4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r extends N4.AbstractC1414n implements java.util.Set {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private transient N4.AbstractC1415o f7782D;

    r() {
    }

    public static N4.r C(java.util.Collection collection) {
        if ((collection instanceof N4.r) && !(collection instanceof java.util.SortedSet)) {
            N4.r rVar = (N4.r) collection;
            if (!rVar.n()) {
                return rVar;
            }
        }
        java.lang.Object[] array = collection.toArray();
        return w(array.length, array);
    }

    public static N4.r M() {
        return N4.K.f7704K;
    }

    public static N4.r N(java.lang.Object obj) {
        return new N4.N(obj);
    }

    public static N4.r O(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return w(3, obj, obj2, obj3);
    }

    public static N4.r P(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object... objArr) {
        M4.h.e(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        java.lang.Object[] objArr2 = new java.lang.Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        java.lang.System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return w(length, objArr2);
    }

    private static boolean Q(int i6, int i10) {
        return i6 < (i10 >> 1) + (i10 >> 2);
    }

    static int s(int i6) {
        int iMax = java.lang.Math.max(i6, 2);
        if (iMax >= 751619276) {
            M4.h.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = java.lang.Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    private static N4.r w(int i6, java.lang.Object... objArr) {
        if (i6 == 0) {
            return M();
        }
        if (i6 == 1) {
            java.lang.Object obj = objArr[0];
            j$.util.Objects.requireNonNull(obj);
            return N(obj);
        }
        int iS = s(i6);
        java.lang.Object[] objArr2 = new java.lang.Object[iS];
        int i10 = iS - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i6; i13++) {
            java.lang.Object objA = N4.F.a(objArr[i13], i13);
            int iHashCode = objA.hashCode();
            int iB = N4.AbstractC1413m.b(iHashCode);
            while (true) {
                int i14 = iB & i10;
                java.lang.Object obj2 = objArr2[i14];
                if (obj2 == null) {
                    objArr[i12] = objA;
                    objArr2[i14] = objA;
                    i11 += iHashCode;
                    i12++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iB++;
            }
        }
        java.util.Arrays.fill(objArr, i12, i6, (java.lang.Object) null);
        if (i12 == 1) {
            java.lang.Object obj3 = objArr[0];
            j$.util.Objects.requireNonNull(obj3);
            return new N4.N(obj3);
        }
        if (s(i12) < iS / 2) {
            return w(i12, objArr);
        }
        if (Q(i12, objArr.length)) {
            objArr = java.util.Arrays.copyOf(objArr, i12);
        }
        return new N4.K(objArr, i11, objArr2, i10, i12);
    }

    N4.AbstractC1415o D() {
        return N4.AbstractC1415o.o(toArray());
    }

    boolean E() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof N4.r) && E() && ((N4.r) obj).E() && hashCode() != obj.hashCode()) {
            return false;
        }
        return N4.M.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return N4.M.b(this);
    }

    public N4.AbstractC1415o o() {
        N4.AbstractC1415o abstractC1415o = this.f7782D;
        if (abstractC1415o != null) {
            return abstractC1415o;
        }
        N4.AbstractC1415o abstractC1415oD = D();
        this.f7782D = abstractC1415oD;
        return abstractC1415oD;
    }
}
