package p136n5;

/* JADX INFO: loaded from: classes3.dex */
final class x extends n5.F.e.d.AbstractC0666e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f51908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f51909b;

    static final class b extends n5.F.e.d.AbstractC0666e.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f51910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f51911b;

        b() {
        }

        @Override // n5.F.e.d.AbstractC0666e.b.a
        public n5.F.e.d.AbstractC0666e.b a() {
            java.lang.String str;
            java.lang.String str2 = this.f51910a;
            if (str2 != null && (str = this.f51911b) != null) {
                return new p136n5.x(str2, str);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.f51910a == null) {
                sb.append(" rolloutId");
            }
            if (this.f51911b == null) {
                sb.append(" variantId");
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
        }

        @Override // n5.F.e.d.AbstractC0666e.b.a
        public n5.F.e.d.AbstractC0666e.b.a b(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null rolloutId");
            }
            this.f51910a = str;
            return this;
        }

        @Override // n5.F.e.d.AbstractC0666e.b.a
        public n5.F.e.d.AbstractC0666e.b.a c(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null variantId");
            }
            this.f51911b = str;
            return this;
        }
    }

    private x(java.lang.String str, java.lang.String str2) {
        this.f51908a = str;
        this.f51909b = str2;
    }

    @Override // n5.F.e.d.AbstractC0666e.b
    public java.lang.String b() {
        return this.f51908a;
    }

    @Override // n5.F.e.d.AbstractC0666e.b
    public java.lang.String c() {
        return this.f51909b;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5.F.e.d.AbstractC0666e.b)) {
            return false;
        }
        n5.F.e.d.AbstractC0666e.b bVar = (n5.F.e.d.AbstractC0666e.b) obj;
        return this.f51908a.equals(bVar.b()) && this.f51909b.equals(bVar.c());
    }

    public int hashCode() {
        return ((this.f51908a.hashCode() ^ 1000003) * 1000003) ^ this.f51909b.hashCode();
    }

    public java.lang.String toString() {
        return "RolloutVariant{rolloutId=" + this.f51908a + ", variantId=" + this.f51909b + "}";
    }
}
