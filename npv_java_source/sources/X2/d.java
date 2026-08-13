package X2;

/* JADX INFO: loaded from: classes.dex */
final class d extends X2.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f15745a;

    d(java.util.List list) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null logRequests");
        }
        this.f15745a = list;
    }

    @Override // X2.n
    public java.util.List c() {
        return this.f15745a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof X2.n) {
            return this.f15745a.equals(((X2.n) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f15745a.hashCode() ^ 1000003;
    }

    public java.lang.String toString() {
        return "BatchedLogRequest{logRequests=" + this.f15745a + "}";
    }
}
