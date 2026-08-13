package M0;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f6675a;

    public T(java.lang.String str) {
        this.f6675a = str;
    }

    public final java.lang.String a() {
        return this.f6675a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof M0.T) && p247y7.AbstractC7350t.b(this.f6675a, ((M0.T) obj).f6675a);
    }

    public int hashCode() {
        return this.f6675a.hashCode();
    }

    public java.lang.String toString() {
        return "UrlAnnotation(url=" + this.f6675a + ')';
    }
}
