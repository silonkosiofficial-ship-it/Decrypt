package p097j7;

/* JADX INFO: loaded from: classes3.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f49287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f49288b;

    public L(int i6, java.lang.Object obj) {
        this.f49287a = i6;
        this.f49288b = obj;
    }

    public final int a() {
        return this.f49287a;
    }

    public final java.lang.Object b() {
        return this.f49288b;
    }

    public final int c() {
        return this.f49287a;
    }

    public final java.lang.Object d() {
        return this.f49288b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p097j7.L)) {
            return false;
        }
        p097j7.L l6 = (p097j7.L) obj;
        return this.f49287a == l6.f49287a && p247y7.AbstractC7350t.b(this.f49288b, l6.f49288b);
    }

    public int hashCode() {
        int i6 = this.f49287a * 31;
        java.lang.Object obj = this.f49288b;
        return i6 + (obj == null ? 0 : obj.hashCode());
    }

    public java.lang.String toString() {
        return "IndexedValue(index=" + this.f49287a + ", value=" + this.f49288b + ')';
    }
}
