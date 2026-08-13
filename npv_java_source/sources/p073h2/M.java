package p073h2;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f45999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Integer f46000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p073h2.E f46001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f46002d;

    public M(java.util.List list, java.lang.Integer num, p073h2.E e6, int i6) {
        p247y7.AbstractC7350t.f(list, "pages");
        p247y7.AbstractC7350t.f(e6, "config");
        this.f45999a = list;
        this.f46000b = num;
        this.f46001c = e6;
        this.f46002d = i6;
    }

    public final java.lang.Integer a() {
        return this.f46000b;
    }

    public final p073h2.E b() {
        return this.f46001c;
    }

    public final java.util.List c() {
        return this.f45999a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p073h2.M) {
            p073h2.M m6 = (p073h2.M) obj;
            if (p247y7.AbstractC7350t.b(this.f45999a, m6.f45999a) && p247y7.AbstractC7350t.b(this.f46000b, m6.f46000b) && p247y7.AbstractC7350t.b(this.f46001c, m6.f46001c) && this.f46002d == m6.f46002d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f45999a.hashCode();
        java.lang.Integer num = this.f46000b;
        return iHashCode + (num != null ? num.hashCode() : 0) + this.f46001c.hashCode() + this.f46002d;
    }

    public java.lang.String toString() {
        return "PagingState(pages=" + this.f45999a + ", anchorPosition=" + this.f46000b + ", config=" + this.f46001c + ", leadingPlaceholderCount=" + this.f46002d + ')';
    }
}
