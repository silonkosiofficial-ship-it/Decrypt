package p136n5;

/* JADX INFO: loaded from: classes3.dex */
final class i extends n5.F.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f51761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f51762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f51763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f51764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f51765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String f51766f;

    static final class b extends n5.F.e.a.AbstractC0652a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f51767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f51768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.String f51769c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private java.lang.String f51770d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private java.lang.String f51771e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private java.lang.String f51772f;

        b() {
        }

        @Override // n5.F.e.a.AbstractC0652a
        public n5.F.e.a a() {
            java.lang.String str;
            java.lang.String str2 = this.f51767a;
            if (str2 != null && (str = this.f51768b) != null) {
                return new p136n5.i(str2, str, this.f51769c, null, this.f51770d, this.f51771e, this.f51772f);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.f51767a == null) {
                sb.append(" identifier");
            }
            if (this.f51768b == null) {
                sb.append(" version");
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
        }

        @Override // n5.F.e.a.AbstractC0652a
        public n5.F.e.a.AbstractC0652a b(java.lang.String str) {
            this.f51771e = str;
            return this;
        }

        @Override // n5.F.e.a.AbstractC0652a
        public n5.F.e.a.AbstractC0652a c(java.lang.String str) {
            this.f51772f = str;
            return this;
        }

        @Override // n5.F.e.a.AbstractC0652a
        public n5.F.e.a.AbstractC0652a d(java.lang.String str) {
            this.f51769c = str;
            return this;
        }

        @Override // n5.F.e.a.AbstractC0652a
        public n5.F.e.a.AbstractC0652a e(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null identifier");
            }
            this.f51767a = str;
            return this;
        }

        @Override // n5.F.e.a.AbstractC0652a
        public n5.F.e.a.AbstractC0652a f(java.lang.String str) {
            this.f51770d = str;
            return this;
        }

        @Override // n5.F.e.a.AbstractC0652a
        public n5.F.e.a.AbstractC0652a g(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null version");
            }
            this.f51768b = str;
            return this;
        }
    }

    private i(java.lang.String str, java.lang.String str2, java.lang.String str3, n5.F.e.a.b bVar, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.f51761a = str;
        this.f51762b = str2;
        this.f51763c = str3;
        this.f51764d = str4;
        this.f51765e = str5;
        this.f51766f = str6;
    }

    @Override // n5.F.e.a
    public java.lang.String b() {
        return this.f51765e;
    }

    @Override // n5.F.e.a
    public java.lang.String c() {
        return this.f51766f;
    }

    @Override // n5.F.e.a
    public java.lang.String d() {
        return this.f51763c;
    }

    @Override // n5.F.e.a
    public java.lang.String e() {
        return this.f51761a;
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5.F.e.a)) {
            return false;
        }
        n5.F.e.a aVar = (n5.F.e.a) obj;
        if (this.f51761a.equals(aVar.e()) && this.f51762b.equals(aVar.h()) && ((str = this.f51763c) != null ? str.equals(aVar.d()) : aVar.d() == null)) {
            aVar.g();
            java.lang.String str2 = this.f51764d;
            if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                java.lang.String str3 = this.f51765e;
                if (str3 != null ? str3.equals(aVar.b()) : aVar.b() == null) {
                    java.lang.String str4 = this.f51766f;
                    java.lang.String strC = aVar.c();
                    if (str4 == null) {
                        if (strC == null) {
                            return true;
                        }
                    } else if (str4.equals(strC)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // n5.F.e.a
    public java.lang.String f() {
        return this.f51764d;
    }

    @Override // n5.F.e.a
    public n5.F.e.a.b g() {
        return null;
    }

    @Override // n5.F.e.a
    public java.lang.String h() {
        return this.f51762b;
    }

    public int hashCode() {
        int iHashCode = (((this.f51761a.hashCode() ^ 1000003) * 1000003) ^ this.f51762b.hashCode()) * 1000003;
        java.lang.String str = this.f51763c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        java.lang.String str2 = this.f51764d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        java.lang.String str3 = this.f51765e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        java.lang.String str4 = this.f51766f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "Application{identifier=" + this.f51761a + ", version=" + this.f51762b + ", displayVersion=" + this.f51763c + ", organization=" + ((java.lang.Object) null) + ", installationUuid=" + this.f51764d + ", developmentPlatform=" + this.f51765e + ", developmentPlatformVersion=" + this.f51766f + "}";
    }
}
