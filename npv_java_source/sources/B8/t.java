package B8;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Object f927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p138n8.b f929f;

    public t(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.String str, p138n8.b bVar) {
        p247y7.AbstractC7350t.f(str, "filePath");
        p247y7.AbstractC7350t.f(bVar, "classId");
        this.f924a = obj;
        this.f925b = obj2;
        this.f926c = obj3;
        this.f927d = obj4;
        this.f928e = str;
        this.f929f = bVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B8.t)) {
            return false;
        }
        B8.t tVar = (B8.t) obj;
        return p247y7.AbstractC7350t.b(this.f924a, tVar.f924a) && p247y7.AbstractC7350t.b(this.f925b, tVar.f925b) && p247y7.AbstractC7350t.b(this.f926c, tVar.f926c) && p247y7.AbstractC7350t.b(this.f927d, tVar.f927d) && p247y7.AbstractC7350t.b(this.f928e, tVar.f928e) && p247y7.AbstractC7350t.b(this.f929f, tVar.f929f);
    }

    public int hashCode() {
        java.lang.Object obj = this.f924a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        java.lang.Object obj2 = this.f925b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        java.lang.Object obj3 = this.f926c;
        int iHashCode3 = (iHashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        java.lang.Object obj4 = this.f927d;
        return ((((iHashCode3 + (obj4 != null ? obj4.hashCode() : 0)) * 31) + this.f928e.hashCode()) * 31) + this.f929f.hashCode();
    }

    public java.lang.String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f924a + ", compilerVersion=" + this.f925b + ", languageVersion=" + this.f926c + ", expectedVersion=" + this.f927d + ", filePath=" + this.f928e + ", classId=" + this.f929f + ')';
    }
}
