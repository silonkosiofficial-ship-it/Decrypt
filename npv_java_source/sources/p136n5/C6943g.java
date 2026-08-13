package p136n5;

/* JADX INFO: renamed from: n5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6943g extends n5.F.d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f51732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f51733b;

    /* JADX INFO: renamed from: n5.g$b */
    static final class b extends n5.F.d.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f51734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f51735b;

        b() {
        }

        @Override // n5.F.d.b.a
        public n5.F.d.b a() {
            byte[] bArr;
            java.lang.String str = this.f51734a;
            if (str != null && (bArr = this.f51735b) != null) {
                return new p136n5.C6943g(str, bArr);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.f51734a == null) {
                sb.append(" filename");
            }
            if (this.f51735b == null) {
                sb.append(" contents");
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
        }

        @Override // n5.F.d.b.a
        public n5.F.d.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new java.lang.NullPointerException("Null contents");
            }
            this.f51735b = bArr;
            return this;
        }

        @Override // n5.F.d.b.a
        public n5.F.d.b.a c(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null filename");
            }
            this.f51734a = str;
            return this;
        }
    }

    private C6943g(java.lang.String str, byte[] bArr) {
        this.f51732a = str;
        this.f51733b = bArr;
    }

    @Override // n5.F.d.b
    public byte[] b() {
        return this.f51733b;
    }

    @Override // n5.F.d.b
    public java.lang.String c() {
        return this.f51732a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5.F.d.b)) {
            return false;
        }
        n5.F.d.b bVar = (n5.F.d.b) obj;
        if (this.f51732a.equals(bVar.c())) {
            if (java.util.Arrays.equals(this.f51733b, bVar instanceof p136n5.C6943g ? ((p136n5.C6943g) bVar).f51733b : bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f51732a.hashCode() ^ 1000003) * 1000003) ^ java.util.Arrays.hashCode(this.f51733b);
    }

    public java.lang.String toString() {
        return "File{filename=" + this.f51732a + ", contents=" + java.util.Arrays.toString(this.f51733b) + "}";
    }
}
