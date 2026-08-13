package p136n5;

/* JADX INFO: loaded from: classes3.dex */
final class v extends n5.F.e.d.AbstractC0665d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f51897a;

    static final class b extends n5.F.e.d.AbstractC0665d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f51898a;

        b() {
        }

        @Override // n5.F.e.d.AbstractC0665d.a
        public n5.F.e.d.AbstractC0665d a() {
            java.lang.String str = this.f51898a;
            if (str != null) {
                return new p136n5.v(str);
            }
            throw new java.lang.IllegalStateException("Missing required properties: content");
        }

        @Override // n5.F.e.d.AbstractC0665d.a
        public n5.F.e.d.AbstractC0665d.a b(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null content");
            }
            this.f51898a = str;
            return this;
        }
    }

    private v(java.lang.String str) {
        this.f51897a = str;
    }

    @Override // n5.F.e.d.AbstractC0665d
    public java.lang.String b() {
        return this.f51897a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n5.F.e.d.AbstractC0665d) {
            return this.f51897a.equals(((n5.F.e.d.AbstractC0665d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f51897a.hashCode() ^ 1000003;
    }

    public java.lang.String toString() {
        return "Log{content=" + this.f51897a + "}";
    }
}
