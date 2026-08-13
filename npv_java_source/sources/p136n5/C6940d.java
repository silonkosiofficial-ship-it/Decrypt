package p136n5;

/* JADX INFO: renamed from: n5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6940d extends n5.F.a.AbstractC0650a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f51718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f51719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f51720c;

    /* JADX INFO: renamed from: n5.d$b */
    static final class b extends n5.F.a.AbstractC0650a.AbstractC0651a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f51721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f51722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.String f51723c;

        b() {
        }

        @Override // n5.F.a.AbstractC0650a.AbstractC0651a
        public n5.F.a.AbstractC0650a a() {
            java.lang.String str;
            java.lang.String str2;
            java.lang.String str3 = this.f51721a;
            if (str3 != null && (str = this.f51722b) != null && (str2 = this.f51723c) != null) {
                return new p136n5.C6940d(str3, str, str2);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.f51721a == null) {
                sb.append(" arch");
            }
            if (this.f51722b == null) {
                sb.append(" libraryName");
            }
            if (this.f51723c == null) {
                sb.append(" buildId");
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
        }

        @Override // n5.F.a.AbstractC0650a.AbstractC0651a
        public n5.F.a.AbstractC0650a.AbstractC0651a b(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null arch");
            }
            this.f51721a = str;
            return this;
        }

        @Override // n5.F.a.AbstractC0650a.AbstractC0651a
        public n5.F.a.AbstractC0650a.AbstractC0651a c(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null buildId");
            }
            this.f51723c = str;
            return this;
        }

        @Override // n5.F.a.AbstractC0650a.AbstractC0651a
        public n5.F.a.AbstractC0650a.AbstractC0651a d(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null libraryName");
            }
            this.f51722b = str;
            return this;
        }
    }

    private C6940d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f51718a = str;
        this.f51719b = str2;
        this.f51720c = str3;
    }

    @Override // n5.F.a.AbstractC0650a
    public java.lang.String b() {
        return this.f51718a;
    }

    @Override // n5.F.a.AbstractC0650a
    public java.lang.String c() {
        return this.f51720c;
    }

    @Override // n5.F.a.AbstractC0650a
    public java.lang.String d() {
        return this.f51719b;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5.F.a.AbstractC0650a)) {
            return false;
        }
        n5.F.a.AbstractC0650a abstractC0650a = (n5.F.a.AbstractC0650a) obj;
        return this.f51718a.equals(abstractC0650a.b()) && this.f51719b.equals(abstractC0650a.d()) && this.f51720c.equals(abstractC0650a.c());
    }

    public int hashCode() {
        return ((((this.f51718a.hashCode() ^ 1000003) * 1000003) ^ this.f51719b.hashCode()) * 1000003) ^ this.f51720c.hashCode();
    }

    public java.lang.String toString() {
        return "BuildIdMappingForArch{arch=" + this.f51718a + ", libraryName=" + this.f51719b + ", buildId=" + this.f51720c + "}";
    }
}
