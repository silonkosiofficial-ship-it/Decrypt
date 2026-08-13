package p136n5;

/* JADX INFO: loaded from: classes3.dex */
final class y extends n5.F.e.d.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f51912a;

    static final class b extends n5.F.e.d.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.util.List f51913a;

        b() {
        }

        @Override // n5.F.e.d.f.a
        public n5.F.e.d.f a() {
            java.util.List list = this.f51913a;
            if (list != null) {
                return new p136n5.y(list);
            }
            throw new java.lang.IllegalStateException("Missing required properties: rolloutAssignments");
        }

        @Override // n5.F.e.d.f.a
        public n5.F.e.d.f.a b(java.util.List list) {
            if (list == null) {
                throw new java.lang.NullPointerException("Null rolloutAssignments");
            }
            this.f51913a = list;
            return this;
        }
    }

    private y(java.util.List list) {
        this.f51912a = list;
    }

    @Override // n5.F.e.d.f
    public java.util.List b() {
        return this.f51912a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n5.F.e.d.f) {
            return this.f51912a.equals(((n5.F.e.d.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f51912a.hashCode() ^ 1000003;
    }

    public java.lang.String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f51912a + "}";
    }
}
