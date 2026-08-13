package p054f3;

/* JADX INFO: loaded from: classes.dex */
final class c extends f3.f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f44942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f44943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Set f44944c;

    static final class b extends f3.f.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.Long f44945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.Long f44946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.util.Set f44947c;

        b() {
        }

        @Override // f3.f.b.a
        public f3.f.b a() {
            java.lang.String str = "";
            if (this.f44945a == null) {
                str = " delta";
            }
            if (this.f44946b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f44947c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new p054f3.c(this.f44945a.longValue(), this.f44946b.longValue(), this.f44947c);
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + str);
        }

        @Override // f3.f.b.a
        public f3.f.b.a b(long j6) {
            this.f44945a = java.lang.Long.valueOf(j6);
            return this;
        }

        @Override // f3.f.b.a
        public f3.f.b.a c(java.util.Set set) {
            if (set == null) {
                throw new java.lang.NullPointerException("Null flags");
            }
            this.f44947c = set;
            return this;
        }

        @Override // f3.f.b.a
        public f3.f.b.a d(long j6) {
            this.f44946b = java.lang.Long.valueOf(j6);
            return this;
        }
    }

    private c(long j6, long j10, java.util.Set set) {
        this.f44942a = j6;
        this.f44943b = j10;
        this.f44944c = set;
    }

    @Override // f3.f.b
    long b() {
        return this.f44942a;
    }

    @Override // f3.f.b
    java.util.Set c() {
        return this.f44944c;
    }

    @Override // f3.f.b
    long d() {
        return this.f44943b;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f3.f.b)) {
            return false;
        }
        f3.f.b bVar = (f3.f.b) obj;
        return this.f44942a == bVar.b() && this.f44943b == bVar.d() && this.f44944c.equals(bVar.c());
    }

    public int hashCode() {
        long j6 = this.f44942a;
        int i6 = (((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003;
        long j10 = this.f44943b;
        return ((i6 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f44944c.hashCode();
    }

    public java.lang.String toString() {
        return "ConfigValue{delta=" + this.f44942a + ", maxAllowedDelay=" + this.f44943b + ", flags=" + this.f44944c + "}";
    }
}
