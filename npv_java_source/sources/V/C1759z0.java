package V;

/* JADX INFO: renamed from: V.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1759z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f15096a;

    public C1759z0(java.lang.String str) {
        this.f15096a = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof V.C1759z0) && p247y7.AbstractC7350t.b(this.f15096a, ((V.C1759z0) obj).f15096a);
    }

    public int hashCode() {
        return this.f15096a.hashCode();
    }

    public java.lang.String toString() {
        return "OpaqueKey(key=" + this.f15096a + ')';
    }
}
