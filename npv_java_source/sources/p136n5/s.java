package p136n5;

/* JADX INFO: loaded from: classes3.dex */
final class s extends n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f51864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f51865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f51866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f51867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f51868e;

    static final class b extends n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b.AbstractC0663a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f51869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f51870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.String f51871c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f51872d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f51873e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f51874f;

        b() {
        }

        @Override // n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b.AbstractC0663a
        public n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b a() {
            java.lang.String str;
            if (this.f51874f == 7 && (str = this.f51870b) != null) {
                return new p136n5.s(this.f51869a, str, this.f51871c, this.f51872d, this.f51873e);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if ((this.f51874f & 1) == 0) {
                sb.append(" pc");
            }
            if (this.f51870b == null) {
                sb.append(" symbol");
            }
            if ((this.f51874f & 2) == 0) {
                sb.append(" offset");
            }
            if ((this.f51874f & 4) == 0) {
                sb.append(" importance");
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
        }

        @Override // n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b.AbstractC0663a
        public n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b.AbstractC0663a b(java.lang.String str) {
            this.f51871c = str;
            return this;
        }

        @Override // n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b.AbstractC0663a
        public n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b.AbstractC0663a c(int i6) {
            this.f51873e = i6;
            this.f51874f = (byte) (this.f51874f | 4);
            return this;
        }

        @Override // n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b.AbstractC0663a
        public n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b.AbstractC0663a d(long j6) {
            this.f51872d = j6;
            this.f51874f = (byte) (this.f51874f | 2);
            return this;
        }

        @Override // n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b.AbstractC0663a
        public n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b.AbstractC0663a e(long j6) {
            this.f51869a = j6;
            this.f51874f = (byte) (this.f51874f | 1);
            return this;
        }

        @Override // n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b.AbstractC0663a
        public n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b.AbstractC0663a f(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null symbol");
            }
            this.f51870b = str;
            return this;
        }
    }

    private s(long j6, java.lang.String str, java.lang.String str2, long j10, int i6) {
        this.f51864a = j6;
        this.f51865b = str;
        this.f51866c = str2;
        this.f51867d = j10;
        this.f51868e = i6;
    }

    @Override // n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b
    public java.lang.String b() {
        return this.f51866c;
    }

    @Override // n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b
    public int c() {
        return this.f51868e;
    }

    @Override // n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b
    public long d() {
        return this.f51867d;
    }

    @Override // n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b
    public long e() {
        return this.f51864a;
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b)) {
            return false;
        }
        n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b abstractC0662b = (n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b) obj;
        return this.f51864a == abstractC0662b.e() && this.f51865b.equals(abstractC0662b.f()) && ((str = this.f51866c) != null ? str.equals(abstractC0662b.b()) : abstractC0662b.b() == null) && this.f51867d == abstractC0662b.d() && this.f51868e == abstractC0662b.c();
    }

    @Override // n5.F.e.d.a.b.AbstractC0660e.AbstractC0662b
    public java.lang.String f() {
        return this.f51865b;
    }

    public int hashCode() {
        long j6 = this.f51864a;
        int iHashCode = (((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ this.f51865b.hashCode()) * 1000003;
        java.lang.String str = this.f51866c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.f51867d;
        return ((iHashCode2 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f51868e;
    }

    public java.lang.String toString() {
        return "Frame{pc=" + this.f51864a + ", symbol=" + this.f51865b + ", file=" + this.f51866c + ", offset=" + this.f51867d + ", importance=" + this.f51868e + "}";
    }
}
