package M0;

/* JADX INFO: loaded from: classes.dex */
public final class U extends M0.S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f6676a;

    public U(java.lang.String str) {
        super(null);
        this.f6676a = str;
    }

    public final java.lang.String a() {
        return this.f6676a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof M0.U) && p247y7.AbstractC7350t.b(this.f6676a, ((M0.U) obj).f6676a);
    }

    public int hashCode() {
        return this.f6676a.hashCode();
    }

    public java.lang.String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f6676a + ')';
    }
}
