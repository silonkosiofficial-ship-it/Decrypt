package W6;

/* JADX INFO: renamed from: W6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1767a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f15367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p017b7.a f15368b;

    public C1767a(java.lang.String str, p017b7.a aVar) {
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(aVar, "type");
        this.f15367a = str;
        this.f15368b = aVar;
        if (!(!S8.r.s0(str))) {
            throw new java.lang.IllegalArgumentException("Name can't be blank".toString());
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W6.C1767a)) {
            return false;
        }
        W6.C1767a c1767a = (W6.C1767a) obj;
        return p247y7.AbstractC7350t.b(this.f15367a, c1767a.f15367a) && p247y7.AbstractC7350t.b(this.f15368b, c1767a.f15368b);
    }

    public int hashCode() {
        return (this.f15367a.hashCode() * 31) + this.f15368b.hashCode();
    }

    public java.lang.String toString() {
        return "AttributeKey: " + this.f15367a;
    }
}
