package W2;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f15330a;

    private b(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("name is null");
        }
        this.f15330a = str;
    }

    public static W2.b b(java.lang.String str) {
        return new W2.b(str);
    }

    public java.lang.String a() {
        return this.f15330a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof W2.b) {
            return this.f15330a.equals(((W2.b) obj).f15330a);
        }
        return false;
    }

    public int hashCode() {
        return this.f15330a.hashCode() ^ 1000003;
    }

    public java.lang.String toString() {
        return "Encoding{name=\"" + this.f15330a + "\"}";
    }
}
