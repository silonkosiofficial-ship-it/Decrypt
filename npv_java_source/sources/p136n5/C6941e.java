package p136n5;

/* JADX INFO: renamed from: n5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6941e extends n5.F.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f51724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f51725b;

    /* JADX INFO: renamed from: n5.e$b */
    static final class b extends n5.F.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f51726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f51727b;

        b() {
        }

        @Override // n5.F.c.a
        public n5.F.c a() {
            java.lang.String str;
            java.lang.String str2 = this.f51726a;
            if (str2 != null && (str = this.f51727b) != null) {
                return new p136n5.C6941e(str2, str);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.f51726a == null) {
                sb.append(" key");
            }
            if (this.f51727b == null) {
                sb.append(" value");
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
        }

        @Override // n5.F.c.a
        public n5.F.c.a b(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null key");
            }
            this.f51726a = str;
            return this;
        }

        @Override // n5.F.c.a
        public n5.F.c.a c(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null value");
            }
            this.f51727b = str;
            return this;
        }
    }

    private C6941e(java.lang.String str, java.lang.String str2) {
        this.f51724a = str;
        this.f51725b = str2;
    }

    @Override // n5.F.c
    public java.lang.String b() {
        return this.f51724a;
    }

    @Override // n5.F.c
    public java.lang.String c() {
        return this.f51725b;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5.F.c)) {
            return false;
        }
        n5.F.c cVar = (n5.F.c) obj;
        return this.f51724a.equals(cVar.b()) && this.f51725b.equals(cVar.c());
    }

    public int hashCode() {
        return ((this.f51724a.hashCode() ^ 1000003) * 1000003) ^ this.f51725b.hashCode();
    }

    public java.lang.String toString() {
        return "CustomAttribute{key=" + this.f51724a + ", value=" + this.f51725b + "}";
    }
}
