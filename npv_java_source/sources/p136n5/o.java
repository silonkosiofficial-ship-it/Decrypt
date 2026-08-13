package p136n5;

/* JADX INFO: loaded from: classes3.dex */
final class o extends n5.F.e.d.a.b.AbstractC0654a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f51830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f51831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f51832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f51833d;

    static final class b extends n5.F.e.d.a.b.AbstractC0654a.AbstractC0655a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f51834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f51835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.String f51836c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private java.lang.String f51837d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f51838e;

        b() {
        }

        @Override // n5.F.e.d.a.b.AbstractC0654a.AbstractC0655a
        public n5.F.e.d.a.b.AbstractC0654a a() {
            java.lang.String str;
            if (this.f51838e == 3 && (str = this.f51836c) != null) {
                return new p136n5.o(this.f51834a, this.f51835b, str, this.f51837d);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if ((this.f51838e & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((this.f51838e & 2) == 0) {
                sb.append(" size");
            }
            if (this.f51836c == null) {
                sb.append(" name");
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
        }

        @Override // n5.F.e.d.a.b.AbstractC0654a.AbstractC0655a
        public n5.F.e.d.a.b.AbstractC0654a.AbstractC0655a b(long j6) {
            this.f51834a = j6;
            this.f51838e = (byte) (this.f51838e | 1);
            return this;
        }

        @Override // n5.F.e.d.a.b.AbstractC0654a.AbstractC0655a
        public n5.F.e.d.a.b.AbstractC0654a.AbstractC0655a c(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null name");
            }
            this.f51836c = str;
            return this;
        }

        @Override // n5.F.e.d.a.b.AbstractC0654a.AbstractC0655a
        public n5.F.e.d.a.b.AbstractC0654a.AbstractC0655a d(long j6) {
            this.f51835b = j6;
            this.f51838e = (byte) (this.f51838e | 2);
            return this;
        }

        @Override // n5.F.e.d.a.b.AbstractC0654a.AbstractC0655a
        public n5.F.e.d.a.b.AbstractC0654a.AbstractC0655a e(java.lang.String str) {
            this.f51837d = str;
            return this;
        }
    }

    private o(long j6, long j10, java.lang.String str, java.lang.String str2) {
        this.f51830a = j6;
        this.f51831b = j10;
        this.f51832c = str;
        this.f51833d = str2;
    }

    @Override // n5.F.e.d.a.b.AbstractC0654a
    public long b() {
        return this.f51830a;
    }

    @Override // n5.F.e.d.a.b.AbstractC0654a
    public java.lang.String c() {
        return this.f51832c;
    }

    @Override // n5.F.e.d.a.b.AbstractC0654a
    public long d() {
        return this.f51831b;
    }

    @Override // n5.F.e.d.a.b.AbstractC0654a
    public java.lang.String e() {
        return this.f51833d;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5.F.e.d.a.b.AbstractC0654a)) {
            return false;
        }
        n5.F.e.d.a.b.AbstractC0654a abstractC0654a = (n5.F.e.d.a.b.AbstractC0654a) obj;
        if (this.f51830a == abstractC0654a.b() && this.f51831b == abstractC0654a.d() && this.f51832c.equals(abstractC0654a.c())) {
            java.lang.String str = this.f51833d;
            java.lang.String strE = abstractC0654a.e();
            if (str == null) {
                if (strE == null) {
                    return true;
                }
            } else if (str.equals(strE)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j6 = this.f51830a;
        long j10 = this.f51831b;
        int iHashCode = (((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f51832c.hashCode()) * 1000003;
        java.lang.String str = this.f51833d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "BinaryImage{baseAddress=" + this.f51830a + ", size=" + this.f51831b + ", name=" + this.f51832c + ", uuid=" + this.f51833d + "}";
    }
}
