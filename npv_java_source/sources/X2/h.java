package X2;

/* JADX INFO: loaded from: classes.dex */
final class h extends X2.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Integer f15758a;

    static final class b extends X2.r.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.Integer f15759a;

        b() {
        }

        @Override // X2.r.a
        public X2.r a() {
            return new X2.h(this.f15759a);
        }

        @Override // X2.r.a
        public X2.r.a b(java.lang.Integer num) {
            this.f15759a = num;
            return this;
        }
    }

    private h(java.lang.Integer num) {
        this.f15758a = num;
    }

    @Override // X2.r
    public java.lang.Integer b() {
        return this.f15758a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X2.r)) {
            return false;
        }
        java.lang.Integer num = this.f15758a;
        java.lang.Integer numB = ((X2.r) obj).b();
        if (num == null) {
            return numB == null;
        }
        return num.equals(numB);
    }

    public int hashCode() {
        java.lang.Integer num = this.f15758a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public java.lang.String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f15758a + "}";
    }
}
