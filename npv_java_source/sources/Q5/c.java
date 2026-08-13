package Q5;

/* JADX INFO: loaded from: classes3.dex */
final class c extends Q5.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Set f9076a;

    c(java.util.Set set) {
        if (set == null) {
            throw new java.lang.NullPointerException("Null rolloutAssignments");
        }
        this.f9076a = set;
    }

    @Override // Q5.e
    public java.util.Set b() {
        return this.f9076a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Q5.e) {
            return this.f9076a.equals(((Q5.e) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f9076a.hashCode() ^ 1000003;
    }

    public java.lang.String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f9076a + "}";
    }
}
