package p170r;

/* JADX INFO: loaded from: classes.dex */
public class Y {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int[] f53347C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.Object[] f53348D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f53349E;

    public Y() {
        this(0, 1, null);
    }

    public Y(int i6) {
        this.f53347C = i6 == 0 ? p180s.a.f54036a : new int[i6];
        this.f53348D = i6 == 0 ? p180s.a.f54038c : new java.lang.Object[i6 << 1];
    }

    public /* synthetic */ Y(int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this((i10 & 1) != 0 ? 0 : i6);
    }

    public Y(p170r.Y y6) {
        this(0, 1, null);
        if (y6 != null) {
            g(y6);
        }
    }

    private final int c(java.lang.Object obj, int i6) {
        int i10 = this.f53349E;
        if (i10 == 0) {
            return -1;
        }
        int iA = p180s.a.a(this.f53347C, i10, i6);
        if (iA < 0 || p247y7.AbstractC7350t.b(obj, this.f53348D[iA << 1])) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f53347C[i11] == i6) {
            if (p247y7.AbstractC7350t.b(obj, this.f53348D[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f53347C[i12] == i6; i12--) {
            if (p247y7.AbstractC7350t.b(obj, this.f53348D[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    private final int e() {
        int i6 = this.f53349E;
        if (i6 == 0) {
            return -1;
        }
        int iA = p180s.a.a(this.f53347C, i6, 0);
        if (iA < 0 || this.f53348D[iA << 1] == null) {
            return iA;
        }
        int i10 = iA + 1;
        while (i10 < i6 && this.f53347C[i10] == 0) {
            if (this.f53348D[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = iA - 1; i11 >= 0 && this.f53347C[i11] == 0; i11--) {
            if (this.f53348D[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public final int a(java.lang.Object obj) {
        int i6 = this.f53349E * 2;
        java.lang.Object[] objArr = this.f53348D;
        if (obj == null) {
            for (int i10 = 1; i10 < i6; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i6; i11 += 2) {
            if (p247y7.AbstractC7350t.b(obj, objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public void b(int i6) {
        int i10 = this.f53349E;
        int[] iArr = this.f53347C;
        if (iArr.length < i6) {
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, i6);
            p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f53347C = iArrCopyOf;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f53348D, i6 * 2);
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f53348D = objArrCopyOf;
        }
        if (this.f53349E != i10) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.f53349E > 0) {
            this.f53347C = p180s.a.f54036a;
            this.f53348D = p180s.a.f54038c;
            this.f53349E = 0;
        }
        if (this.f53349E > 0) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public boolean containsKey(java.lang.Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(java.lang.Object obj) {
        return a(obj) >= 0;
    }

    public int d(java.lang.Object obj) {
        return obj == null ? e() : c(obj, obj.hashCode());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof p170r.Y) {
                if (size() != ((p170r.Y) obj).size()) {
                    return false;
                }
                p170r.Y y6 = (p170r.Y) obj;
                int i6 = this.f53349E;
                for (int i10 = 0; i10 < i6; i10++) {
                    java.lang.Object objF = f(i10);
                    java.lang.Object objK = k(i10);
                    java.lang.Object obj2 = y6.get(objF);
                    if (objK == null) {
                        if (obj2 != null || !y6.containsKey(objF)) {
                            return false;
                        }
                    } else if (!p247y7.AbstractC7350t.b(objK, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof java.util.Map) || size() != ((java.util.Map) obj).size()) {
                return false;
            }
            int i11 = this.f53349E;
            for (int i12 = 0; i12 < i11; i12++) {
                java.lang.Object objF2 = f(i12);
                java.lang.Object objK2 = k(i12);
                java.lang.Object obj3 = ((java.util.Map) obj).get(objF2);
                if (objK2 == null) {
                    if (obj3 != null || !((java.util.Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!p247y7.AbstractC7350t.b(objK2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
        }
        return false;
    }

    public java.lang.Object f(int i6) {
        boolean z6 = false;
        if (i6 >= 0 && i6 < this.f53349E) {
            z6 = true;
        }
        if (!z6) {
            p180s.d.a("Expected index to be within 0..size()-1, but was " + i6);
        }
        return this.f53348D[i6 << 1];
    }

    public void g(p170r.Y y6) {
        p247y7.AbstractC7350t.f(y6, "map");
        int i6 = y6.f53349E;
        b(this.f53349E + i6);
        if (this.f53349E != 0) {
            for (int i10 = 0; i10 < i6; i10++) {
                put(y6.f(i10), y6.k(i10));
            }
        } else if (i6 > 0) {
            p097j7.AbstractC6872n.j(y6.f53347C, this.f53347C, 0, 0, i6);
            p097j7.AbstractC6872n.l(y6.f53348D, this.f53348D, 0, 0, i6 << 1);
            this.f53349E = i6;
        }
    }

    public java.lang.Object get(java.lang.Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f53348D[(iD << 1) + 1];
        }
        return null;
    }

    public java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.f53348D[(iD << 1) + 1] : obj2;
    }

    public java.lang.Object h(int i6) {
        if (!(i6 >= 0 && i6 < this.f53349E)) {
            p180s.d.a("Expected index to be within 0..size()-1, but was " + i6);
        }
        java.lang.Object[] objArr = this.f53348D;
        int i10 = i6 << 1;
        java.lang.Object obj = objArr[i10 + 1];
        int i11 = this.f53349E;
        if (i11 <= 1) {
            clear();
        } else {
            int i12 = i11 - 1;
            int[] iArr = this.f53347C;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                if (i6 < i12) {
                    int i13 = i6 + 1;
                    p097j7.AbstractC6872n.j(iArr, iArr, i6, i13, i11);
                    java.lang.Object[] objArr2 = this.f53348D;
                    p097j7.AbstractC6872n.l(objArr2, objArr2, i10, i13 << 1, i11 << 1);
                }
                java.lang.Object[] objArr3 = this.f53348D;
                int i14 = i12 << 1;
                objArr3[i14] = null;
                objArr3[i14 + 1] = null;
            } else {
                int i15 = i11 > 8 ? i11 + (i11 >> 1) : 8;
                int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, i15);
                p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(this, newSize)");
                this.f53347C = iArrCopyOf;
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f53348D, i15 << 1);
                p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
                this.f53348D = objArrCopyOf;
                if (i11 != this.f53349E) {
                    throw new java.util.ConcurrentModificationException();
                }
                if (i6 > 0) {
                    p097j7.AbstractC6872n.j(iArr, this.f53347C, 0, 0, i6);
                    p097j7.AbstractC6872n.l(objArr, this.f53348D, 0, 0, i10);
                }
                if (i6 < i12) {
                    int i16 = i6 + 1;
                    p097j7.AbstractC6872n.j(iArr, this.f53347C, i6, i16, i11);
                    p097j7.AbstractC6872n.l(objArr, this.f53348D, i10, i16 << 1, i11 << 1);
                }
            }
            if (i11 != this.f53349E) {
                throw new java.util.ConcurrentModificationException();
            }
            this.f53349E = i12;
        }
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.f53347C;
        java.lang.Object[] objArr = this.f53348D;
        int i6 = this.f53349E;
        int i10 = 1;
        int i11 = 0;
        int iHashCode = 0;
        while (i11 < i6) {
            java.lang.Object obj = objArr[i10];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i11];
            i11++;
            i10 += 2;
        }
        return iHashCode;
    }

    public boolean isEmpty() {
        return this.f53349E <= 0;
    }

    public java.lang.Object j(int i6, java.lang.Object obj) {
        boolean z6 = false;
        if (i6 >= 0 && i6 < this.f53349E) {
            z6 = true;
        }
        if (!z6) {
            p180s.d.a("Expected index to be within 0..size()-1, but was " + i6);
        }
        int i10 = (i6 << 1) + 1;
        java.lang.Object[] objArr = this.f53348D;
        java.lang.Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public java.lang.Object k(int i6) {
        boolean z6 = false;
        if (i6 >= 0 && i6 < this.f53349E) {
            z6 = true;
        }
        if (!z6) {
            p180s.d.a("Expected index to be within 0..size()-1, but was " + i6);
        }
        return this.f53348D[(i6 << 1) + 1];
    }

    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        int i6 = this.f53349E;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(obj, iHashCode) : e();
        if (iC >= 0) {
            int i10 = (iC << 1) + 1;
            java.lang.Object[] objArr = this.f53348D;
            java.lang.Object obj3 = objArr[i10];
            objArr[i10] = obj2;
            return obj3;
        }
        int i11 = ~iC;
        int[] iArr = this.f53347C;
        if (i6 >= iArr.length) {
            int i12 = 8;
            if (i6 >= 8) {
                i12 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i12 = 4;
            }
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, i12);
            p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f53347C = iArrCopyOf;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f53348D, i12 << 1);
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f53348D = objArrCopyOf;
            if (i6 != this.f53349E) {
                throw new java.util.ConcurrentModificationException();
            }
        }
        if (i11 < i6) {
            int[] iArr2 = this.f53347C;
            int i13 = i11 + 1;
            p097j7.AbstractC6872n.j(iArr2, iArr2, i13, i11, i6);
            java.lang.Object[] objArr2 = this.f53348D;
            p097j7.AbstractC6872n.l(objArr2, objArr2, i13 << 1, i11 << 1, this.f53349E << 1);
        }
        int i14 = this.f53349E;
        if (i6 == i14) {
            int[] iArr3 = this.f53347C;
            if (i11 < iArr3.length) {
                iArr3[i11] = iHashCode;
                java.lang.Object[] objArr3 = this.f53348D;
                int i15 = i11 << 1;
                objArr3[i15] = obj;
                objArr3[i15 + 1] = obj2;
                this.f53349E = i14 + 1;
                return null;
            }
        }
        throw new java.util.ConcurrentModificationException();
    }

    public java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public java.lang.Object remove(java.lang.Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD);
        }
        return null;
    }

    public boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !p247y7.AbstractC7350t.b(obj2, k(iD))) {
            return false;
        }
        h(iD);
        return true;
    }

    public java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return j(iD, obj2);
        }
        return null;
    }

    public boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !p247y7.AbstractC7350t.b(obj2, k(iD))) {
            return false;
        }
        j(iD, obj3);
        return true;
    }

    public int size() {
        return this.f53349E;
    }

    public java.lang.String toString() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.f53349E * 28);
        sb.append('{');
        int i6 = this.f53349E;
        for (int i10 = 0; i10 < i6; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            java.lang.Object objF = f(i10);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            java.lang.Object objK = k(i10);
            if (objK != sb) {
                sb.append(objK);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
