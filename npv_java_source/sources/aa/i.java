package aa;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements aa.k {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f17306C;

    public i(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "language");
        this.f17306C = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aa.i.class != obj.getClass()) {
            return false;
        }
        return p247y7.AbstractC7350t.b(this.f17306C, ((aa.i) obj).f17306C);
    }

    public int hashCode() {
        return this.f17306C.hashCode();
    }

    public java.lang.String toString() {
        return "LanguageQualifier(language='" + this.f17306C + "')";
    }
}
