package I5;

/* JADX INFO: loaded from: classes3.dex */
final class b extends I5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f5070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f5071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I5.f.b f5072c;

    /* JADX INFO: renamed from: I5.b$b, reason: collision with other inner class name */
    static final class C0118b extends I5.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f5073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.Long f5074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private I5.f.b f5075c;

        C0118b() {
        }

        @Override // I5.f.a
        public I5.f a() {
            java.lang.String str = "";
            if (this.f5074b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new I5.b(this.f5073a, this.f5074b.longValue(), this.f5075c);
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + str);
        }

        @Override // I5.f.a
        public I5.f.a b(I5.f.b bVar) {
            this.f5075c = bVar;
            return this;
        }

        @Override // I5.f.a
        public I5.f.a c(java.lang.String str) {
            this.f5073a = str;
            return this;
        }

        @Override // I5.f.a
        public I5.f.a d(long j6) {
            this.f5074b = java.lang.Long.valueOf(j6);
            return this;
        }
    }

    private b(java.lang.String str, long j6, I5.f.b bVar) {
        this.f5070a = str;
        this.f5071b = j6;
        this.f5072c = bVar;
    }

    @Override // I5.f
    public I5.f.b b() {
        return this.f5072c;
    }

    @Override // I5.f
    public java.lang.String c() {
        return this.f5070a;
    }

    @Override // I5.f
    public long d() {
        return this.f5071b;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof I5.f)) {
            return false;
        }
        I5.f fVar = (I5.f) obj;
        java.lang.String str = this.f5070a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f5071b == fVar.d()) {
                I5.f.b bVar = this.f5072c;
                I5.f.b bVarB = fVar.b();
                if (bVar == null) {
                    if (bVarB == null) {
                        return true;
                    }
                } else if (bVar.equals(bVarB)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.String str = this.f5070a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j6 = this.f5071b;
        int i6 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        I5.f.b bVar = this.f5072c;
        return i6 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "TokenResult{token=" + this.f5070a + ", tokenExpirationTimestamp=" + this.f5071b + ", responseCode=" + this.f5072c + "}";
    }
}
