package p136n5;

/* JADX INFO: loaded from: classes3.dex */
final class n extends n5.F.e.d.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f51820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n5.F.e.d.a.b.c f51821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n5.F.a f51822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n5.F.e.d.a.b.AbstractC0658d f51823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.List f51824e;

    static final class b extends n5.F.e.d.a.b.AbstractC0656b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.util.List f51825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private n5.F.e.d.a.b.c f51826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n5.F.a f51827c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private n5.F.e.d.a.b.AbstractC0658d f51828d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private java.util.List f51829e;

        b() {
        }

        @Override // n5.F.e.d.a.b.AbstractC0656b
        public n5.F.e.d.a.b a() {
            java.util.List list;
            n5.F.e.d.a.b.AbstractC0658d abstractC0658d = this.f51828d;
            if (abstractC0658d != null && (list = this.f51829e) != null) {
                return new p136n5.n(this.f51825a, this.f51826b, this.f51827c, abstractC0658d, list);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.f51828d == null) {
                sb.append(" signal");
            }
            if (this.f51829e == null) {
                sb.append(" binaries");
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
        }

        @Override // n5.F.e.d.a.b.AbstractC0656b
        public n5.F.e.d.a.b.AbstractC0656b b(n5.F.a aVar) {
            this.f51827c = aVar;
            return this;
        }

        @Override // n5.F.e.d.a.b.AbstractC0656b
        public n5.F.e.d.a.b.AbstractC0656b c(java.util.List list) {
            if (list == null) {
                throw new java.lang.NullPointerException("Null binaries");
            }
            this.f51829e = list;
            return this;
        }

        @Override // n5.F.e.d.a.b.AbstractC0656b
        public n5.F.e.d.a.b.AbstractC0656b d(n5.F.e.d.a.b.c cVar) {
            this.f51826b = cVar;
            return this;
        }

        @Override // n5.F.e.d.a.b.AbstractC0656b
        public n5.F.e.d.a.b.AbstractC0656b e(n5.F.e.d.a.b.AbstractC0658d abstractC0658d) {
            if (abstractC0658d == null) {
                throw new java.lang.NullPointerException("Null signal");
            }
            this.f51828d = abstractC0658d;
            return this;
        }

        @Override // n5.F.e.d.a.b.AbstractC0656b
        public n5.F.e.d.a.b.AbstractC0656b f(java.util.List list) {
            this.f51825a = list;
            return this;
        }
    }

    private n(java.util.List list, n5.F.e.d.a.b.c cVar, n5.F.a aVar, n5.F.e.d.a.b.AbstractC0658d abstractC0658d, java.util.List list2) {
        this.f51820a = list;
        this.f51821b = cVar;
        this.f51822c = aVar;
        this.f51823d = abstractC0658d;
        this.f51824e = list2;
    }

    @Override // n5.F.e.d.a.b
    public n5.F.a b() {
        return this.f51822c;
    }

    @Override // n5.F.e.d.a.b
    public java.util.List c() {
        return this.f51824e;
    }

    @Override // n5.F.e.d.a.b
    public n5.F.e.d.a.b.c d() {
        return this.f51821b;
    }

    @Override // n5.F.e.d.a.b
    public n5.F.e.d.a.b.AbstractC0658d e() {
        return this.f51823d;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5.F.e.d.a.b)) {
            return false;
        }
        n5.F.e.d.a.b bVar = (n5.F.e.d.a.b) obj;
        java.util.List list = this.f51820a;
        if (list != null ? list.equals(bVar.f()) : bVar.f() == null) {
            n5.F.e.d.a.b.c cVar = this.f51821b;
            if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                n5.F.a aVar = this.f51822c;
                if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f51823d.equals(bVar.e()) && this.f51824e.equals(bVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // n5.F.e.d.a.b
    public java.util.List f() {
        return this.f51820a;
    }

    public int hashCode() {
        java.util.List list = this.f51820a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        n5.F.e.d.a.b.c cVar = this.f51821b;
        int iHashCode2 = (iHashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        n5.F.a aVar = this.f51822c;
        return ((((iHashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f51823d.hashCode()) * 1000003) ^ this.f51824e.hashCode();
    }

    public java.lang.String toString() {
        return "Execution{threads=" + this.f51820a + ", exception=" + this.f51821b + ", appExitInfo=" + this.f51822c + ", signal=" + this.f51823d + ", binaries=" + this.f51824e + "}";
    }
}
