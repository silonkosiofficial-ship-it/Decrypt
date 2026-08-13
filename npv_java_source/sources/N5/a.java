package N5;

/* JADX INFO: loaded from: classes3.dex */
final class a extends N5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Set f7791a;

    a(java.util.Set set) {
        if (set == null) {
            throw new java.lang.NullPointerException("Null updatedKeys");
        }
        this.f7791a = set;
    }

    @Override // N5.b
    public java.util.Set b() {
        return this.f7791a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof N5.b) {
            return this.f7791a.equals(((N5.b) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f7791a.hashCode() ^ 1000003;
    }

    public java.lang.String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f7791a + "}";
    }
}
