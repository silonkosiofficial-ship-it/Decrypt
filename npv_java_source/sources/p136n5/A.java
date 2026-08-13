package p136n5;

/* JADX INFO: loaded from: classes3.dex */
final class A extends n5.F.e.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f51503a;

    static final class b extends n5.F.e.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f51504a;

        b() {
        }

        @Override // n5.F.e.f.a
        public n5.F.e.f a() {
            java.lang.String str = this.f51504a;
            if (str != null) {
                return new p136n5.A(str);
            }
            throw new java.lang.IllegalStateException("Missing required properties: identifier");
        }

        @Override // n5.F.e.f.a
        public n5.F.e.f.a b(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null identifier");
            }
            this.f51504a = str;
            return this;
        }
    }

    private A(java.lang.String str) {
        this.f51503a = str;
    }

    @Override // n5.F.e.f
    public java.lang.String b() {
        return this.f51503a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n5.F.e.f) {
            return this.f51503a.equals(((n5.F.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f51503a.hashCode() ^ 1000003;
    }

    public java.lang.String toString() {
        return "User{identifier=" + this.f51503a + "}";
    }
}
