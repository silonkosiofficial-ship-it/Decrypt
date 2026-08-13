package aa;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements aa.k {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f17307C;

    public l(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "region");
        this.f17307C = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aa.l.class != obj.getClass()) {
            return false;
        }
        return p247y7.AbstractC7350t.b(this.f17307C, ((aa.l) obj).f17307C);
    }

    public int hashCode() {
        return this.f17307C.hashCode();
    }

    public java.lang.String toString() {
        return "RegionQualifier(region='" + this.f17307C + "')";
    }
}
