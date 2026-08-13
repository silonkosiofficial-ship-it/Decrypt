package p136n5;

/* JADX INFO: loaded from: classes3.dex */
final class q extends n5.F.e.d.a.b.AbstractC0658d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f51850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f51851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f51852c;

    static final class b extends n5.F.e.d.a.b.AbstractC0658d.AbstractC0659a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f51853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f51854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f51855c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f51856d;

        b() {
        }

        @Override // n5.F.e.d.a.b.AbstractC0658d.AbstractC0659a
        public n5.F.e.d.a.b.AbstractC0658d a() {
            java.lang.String str;
            java.lang.String str2;
            if (this.f51856d == 1 && (str = this.f51853a) != null && (str2 = this.f51854b) != null) {
                return new p136n5.q(str, str2, this.f51855c);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.f51853a == null) {
                sb.append(" name");
            }
            if (this.f51854b == null) {
                sb.append(" code");
            }
            if ((1 & this.f51856d) == 0) {
                sb.append(" address");
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
        }

        @Override // n5.F.e.d.a.b.AbstractC0658d.AbstractC0659a
        public n5.F.e.d.a.b.AbstractC0658d.AbstractC0659a b(long j6) {
            this.f51855c = j6;
            this.f51856d = (byte) (this.f51856d | 1);
            return this;
        }

        @Override // n5.F.e.d.a.b.AbstractC0658d.AbstractC0659a
        public n5.F.e.d.a.b.AbstractC0658d.AbstractC0659a c(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null code");
            }
            this.f51854b = str;
            return this;
        }

        @Override // n5.F.e.d.a.b.AbstractC0658d.AbstractC0659a
        public n5.F.e.d.a.b.AbstractC0658d.AbstractC0659a d(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null name");
            }
            this.f51853a = str;
            return this;
        }
    }

    private q(java.lang.String str, java.lang.String str2, long j6) {
        this.f51850a = str;
        this.f51851b = str2;
        this.f51852c = j6;
    }

    @Override // n5.F.e.d.a.b.AbstractC0658d
    public long b() {
        return this.f51852c;
    }

    @Override // n5.F.e.d.a.b.AbstractC0658d
    public java.lang.String c() {
        return this.f51851b;
    }

    @Override // n5.F.e.d.a.b.AbstractC0658d
    public java.lang.String d() {
        return this.f51850a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5.F.e.d.a.b.AbstractC0658d)) {
            return false;
        }
        n5.F.e.d.a.b.AbstractC0658d abstractC0658d = (n5.F.e.d.a.b.AbstractC0658d) obj;
        return this.f51850a.equals(abstractC0658d.d()) && this.f51851b.equals(abstractC0658d.c()) && this.f51852c == abstractC0658d.b();
    }

    public int hashCode() {
        int iHashCode = (((this.f51850a.hashCode() ^ 1000003) * 1000003) ^ this.f51851b.hashCode()) * 1000003;
        long j6 = this.f51852c;
        return iHashCode ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public java.lang.String toString() {
        return "Signal{name=" + this.f51850a + ", code=" + this.f51851b + ", address=" + this.f51852c + "}";
    }
}
