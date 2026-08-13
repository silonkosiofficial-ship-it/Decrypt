package L8;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f6442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f6443b;

    public a(java.lang.Object obj, java.lang.Object obj2) {
        this.f6442a = obj;
        this.f6443b = obj2;
    }

    public final java.lang.Object a() {
        return this.f6442a;
    }

    public final java.lang.Object b() {
        return this.f6443b;
    }

    public final java.lang.Object c() {
        return this.f6442a;
    }

    public final java.lang.Object d() {
        return this.f6443b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L8.a)) {
            return false;
        }
        L8.a aVar = (L8.a) obj;
        return p247y7.AbstractC7350t.b(this.f6442a, aVar.f6442a) && p247y7.AbstractC7350t.b(this.f6443b, aVar.f6443b);
    }

    public int hashCode() {
        java.lang.Object obj = this.f6442a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        java.lang.Object obj2 = this.f6443b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ApproximationBounds(lower=" + this.f6442a + ", upper=" + this.f6443b + ')';
    }
}
