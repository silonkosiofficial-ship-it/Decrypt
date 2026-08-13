package N4;

/* JADX INFO: renamed from: N4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C1406f extends N4.G implements java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final M4.c f7728C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final N4.G f7729D;

    C1406f(M4.c cVar, N4.G g6) {
        this.f7728C = (M4.c) M4.h.i(cVar);
        this.f7729D = (N4.G) M4.h.i(g6);
    }

    @Override // N4.G, java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return this.f7729D.compare(this.f7728C.apply(obj), this.f7728C.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof N4.C1406f)) {
            return false;
        }
        N4.C1406f c1406f = (N4.C1406f) obj;
        return this.f7728C.equals(c1406f.f7728C) && this.f7729D.equals(c1406f.f7729D);
    }

    public int hashCode() {
        return M4.f.b(this.f7728C, this.f7729D);
    }

    public java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.f7729D);
        java.lang.String strValueOf2 = java.lang.String.valueOf(this.f7728C);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(strValueOf.length() + 13 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append(".onResultOf(");
        sb.append(strValueOf2);
        sb.append(")");
        return sb.toString();
    }
}
