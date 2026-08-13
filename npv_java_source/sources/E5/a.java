package E5;

/* JADX INFO: loaded from: classes3.dex */
final class a extends E5.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f2233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f2234b;

    a(java.lang.String str, java.util.List list) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null userAgent");
        }
        this.f2233a = str;
        if (list == null) {
            throw new java.lang.NullPointerException("Null usedDates");
        }
        this.f2234b = list;
    }

    @Override // E5.l
    public java.util.List b() {
        return this.f2234b;
    }

    @Override // E5.l
    public java.lang.String c() {
        return this.f2233a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof E5.l)) {
            return false;
        }
        E5.l lVar = (E5.l) obj;
        return this.f2233a.equals(lVar.c()) && this.f2234b.equals(lVar.b());
    }

    public int hashCode() {
        return ((this.f2233a.hashCode() ^ 1000003) * 1000003) ^ this.f2234b.hashCode();
    }

    public java.lang.String toString() {
        return "HeartBeatResult{userAgent=" + this.f2233a + ", usedDates=" + this.f2234b + "}";
    }
}
