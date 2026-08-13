package Y2;

/* JADX INFO: loaded from: classes.dex */
final class d extends Y2.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f16303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f16304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W2.e f16305c;

    static final class b extends Y2.p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f16306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f16307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private W2.e f16308c;

        b() {
        }

        @Override // Y2.p.a
        public Y2.p a() {
            java.lang.String str = "";
            if (this.f16306a == null) {
                str = " backendName";
            }
            if (this.f16308c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new Y2.d(this.f16306a, this.f16307b, this.f16308c);
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + str);
        }

        @Override // Y2.p.a
        public Y2.p.a b(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null backendName");
            }
            this.f16306a = str;
            return this;
        }

        @Override // Y2.p.a
        public Y2.p.a c(byte[] bArr) {
            this.f16307b = bArr;
            return this;
        }

        @Override // Y2.p.a
        public Y2.p.a d(W2.e eVar) {
            if (eVar == null) {
                throw new java.lang.NullPointerException("Null priority");
            }
            this.f16308c = eVar;
            return this;
        }
    }

    private d(java.lang.String str, byte[] bArr, W2.e eVar) {
        this.f16303a = str;
        this.f16304b = bArr;
        this.f16305c = eVar;
    }

    @Override // Y2.p
    public java.lang.String b() {
        return this.f16303a;
    }

    @Override // Y2.p
    public byte[] c() {
        return this.f16304b;
    }

    @Override // Y2.p
    public W2.e d() {
        return this.f16305c;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Y2.p)) {
            return false;
        }
        Y2.p pVar = (Y2.p) obj;
        if (this.f16303a.equals(pVar.b())) {
            if (java.util.Arrays.equals(this.f16304b, pVar instanceof Y2.d ? ((Y2.d) pVar).f16304b : pVar.c()) && this.f16305c.equals(pVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f16303a.hashCode() ^ 1000003) * 1000003) ^ java.util.Arrays.hashCode(this.f16304b)) * 1000003) ^ this.f16305c.hashCode();
    }
}
