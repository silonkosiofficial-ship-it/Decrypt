package S8;

/* JADX INFO: renamed from: S8.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1637j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f12676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E7.i f12677b;

    public C1637j(java.lang.String str, E7.i iVar) {
        p247y7.AbstractC7350t.f(str, "value");
        p247y7.AbstractC7350t.f(iVar, "range");
        this.f12676a = str;
        this.f12677b = iVar;
    }

    public final E7.i a() {
        return this.f12677b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S8.C1637j)) {
            return false;
        }
        S8.C1637j c1637j = (S8.C1637j) obj;
        return p247y7.AbstractC7350t.b(this.f12676a, c1637j.f12676a) && p247y7.AbstractC7350t.b(this.f12677b, c1637j.f12677b);
    }

    public int hashCode() {
        return (this.f12676a.hashCode() * 31) + this.f12677b.hashCode();
    }

    public java.lang.String toString() {
        return "MatchGroup(value=" + this.f12676a + ", range=" + this.f12677b + ')';
    }
}
