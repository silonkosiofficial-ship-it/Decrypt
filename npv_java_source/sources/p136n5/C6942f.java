package p136n5;

/* JADX INFO: renamed from: n5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6942f extends n5.F.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f51728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f51729b;

    /* JADX INFO: renamed from: n5.f$b */
    static final class b extends n5.F.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.util.List f51730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f51731b;

        b() {
        }

        @Override // n5.F.d.a
        public n5.F.d a() {
            java.util.List list = this.f51730a;
            if (list != null) {
                return new p136n5.C6942f(list, this.f51731b);
            }
            throw new java.lang.IllegalStateException("Missing required properties: files");
        }

        @Override // n5.F.d.a
        public n5.F.d.a b(java.util.List list) {
            if (list == null) {
                throw new java.lang.NullPointerException("Null files");
            }
            this.f51730a = list;
            return this;
        }

        @Override // n5.F.d.a
        public n5.F.d.a c(java.lang.String str) {
            this.f51731b = str;
            return this;
        }
    }

    private C6942f(java.util.List list, java.lang.String str) {
        this.f51728a = list;
        this.f51729b = str;
    }

    @Override // n5.F.d
    public java.util.List b() {
        return this.f51728a;
    }

    @Override // n5.F.d
    public java.lang.String c() {
        return this.f51729b;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5.F.d)) {
            return false;
        }
        n5.F.d dVar = (n5.F.d) obj;
        if (this.f51728a.equals(dVar.b())) {
            java.lang.String str = this.f51729b;
            java.lang.String strC = dVar.c();
            if (str == null) {
                if (strC == null) {
                    return true;
                }
            } else if (str.equals(strC)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f51728a.hashCode() ^ 1000003) * 1000003;
        java.lang.String str = this.f51729b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "FilesPayload{files=" + this.f51728a + ", orgId=" + this.f51729b + "}";
    }
}
