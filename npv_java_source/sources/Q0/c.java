package Q0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f8751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.lang.Object[] f8752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8753c;

    public c(int i6) {
        if (i6 == 0) {
            this.f8751a = Q0.a.f8739a;
            this.f8752b = Q0.a.f8740b;
        } else {
            this.f8751a = new int[i6];
            this.f8752b = new java.lang.Object[i6 << 1];
        }
        this.f8753c = 0;
    }

    public /* synthetic */ c(int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this((i10 & 1) != 0 ? 0 : i6);
    }

    public final boolean a(java.lang.Object obj) {
        return d(obj) >= 0;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f8752b[(iD << 1) + 1];
        }
        return null;
    }

    protected final int c(java.lang.Object obj, int i6) {
        int i10 = this.f8753c;
        if (i10 == 0) {
            return -1;
        }
        int iA = Q0.a.a(this.f8751a, i10, i6);
        if (iA < 0 || p247y7.AbstractC7350t.b(obj, this.f8752b[iA << 1])) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f8751a[i11] == i6) {
            if (p247y7.AbstractC7350t.b(obj, this.f8752b[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f8751a[i12] == i6; i12--) {
            if (p247y7.AbstractC7350t.b(obj, this.f8752b[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int d(java.lang.Object obj) {
        return obj == null ? e() : c(obj, obj.hashCode());
    }

    protected final int e() {
        int i6 = this.f8753c;
        if (i6 == 0) {
            return -1;
        }
        int iA = Q0.a.a(this.f8751a, i6, 0);
        if (iA < 0 || this.f8752b[iA << 1] == null) {
            return iA;
        }
        int i10 = iA + 1;
        while (i10 < i6 && this.f8751a[i10] == 0) {
            if (this.f8752b[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = iA - 1; i11 >= 0 && this.f8751a[i11] == 0; i11--) {
            if (this.f8752b[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof Q0.c) {
                Q0.c cVar = (Q0.c) obj;
                int i6 = this.f8753c;
                if (i6 != cVar.f8753c) {
                    return false;
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    java.lang.Object objG = g(i10);
                    java.lang.Object objH = h(i10);
                    java.lang.Object objB = cVar.b(objG);
                    if (objH == null) {
                        if (objB != null || !cVar.a(objG)) {
                            return false;
                        }
                    } else if (!p247y7.AbstractC7350t.b(objH, objB)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof java.util.Map) || this.f8753c != ((java.util.Map) obj).size()) {
                return false;
            }
            int i11 = this.f8753c;
            for (int i12 = 0; i12 < i11; i12++) {
                java.lang.Object objG2 = g(i12);
                java.lang.Object objH2 = h(i12);
                java.lang.Object obj2 = ((java.util.Map) obj).get(objG2);
                if (objH2 == null) {
                    if (obj2 != null || !((java.util.Map) obj).containsKey(objG2)) {
                        return false;
                    }
                } else if (!p247y7.AbstractC7350t.b(objH2, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
        }
        return false;
    }

    public final boolean f() {
        return this.f8753c <= 0;
    }

    public final java.lang.Object g(int i6) {
        return this.f8752b[i6 << 1];
    }

    public final java.lang.Object h(int i6) {
        return this.f8752b[(i6 << 1) + 1];
    }

    public int hashCode() {
        int[] iArr = this.f8751a;
        java.lang.Object[] objArr = this.f8752b;
        int i6 = this.f8753c;
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

    public java.lang.String toString() {
        if (f()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.f8753c * 28);
        sb.append('{');
        int i6 = this.f8753c;
        for (int i10 = 0; i10 < i6; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            java.lang.Object objG = g(i10);
            if (objG != this) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            java.lang.Object objH = h(i10);
            if (objH != this) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
