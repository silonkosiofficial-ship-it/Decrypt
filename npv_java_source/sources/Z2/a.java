package Z2;

/* JADX INFO: loaded from: classes.dex */
final class a extends Z2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Iterable f16672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f16673b;

    static final class b extends Z2.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.Iterable f16674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f16675b;

        b() {
        }

        @Override // Z2.f.a
        public Z2.f a() {
            java.lang.String str = "";
            if (this.f16674a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new Z2.a(this.f16674a, this.f16675b);
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + str);
        }

        @Override // Z2.f.a
        public Z2.f.a b(java.lang.Iterable iterable) {
            if (iterable == null) {
                throw new java.lang.NullPointerException("Null events");
            }
            this.f16674a = iterable;
            return this;
        }

        @Override // Z2.f.a
        public Z2.f.a c(byte[] bArr) {
            this.f16675b = bArr;
            return this;
        }
    }

    private a(java.lang.Iterable iterable, byte[] bArr) {
        this.f16672a = iterable;
        this.f16673b = bArr;
    }

    @Override // Z2.f
    public java.lang.Iterable b() {
        return this.f16672a;
    }

    @Override // Z2.f
    public byte[] c() {
        return this.f16673b;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Z2.f)) {
            return false;
        }
        Z2.f fVar = (Z2.f) obj;
        if (this.f16672a.equals(fVar.b())) {
            if (java.util.Arrays.equals(this.f16673b, fVar instanceof Z2.a ? ((Z2.a) fVar).f16673b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f16672a.hashCode() ^ 1000003) * 1000003) ^ java.util.Arrays.hashCode(this.f16673b);
    }

    public java.lang.String toString() {
        return "BackendRequest{events=" + this.f16672a + ", extras=" + java.util.Arrays.toString(this.f16673b) + "}";
    }
}
