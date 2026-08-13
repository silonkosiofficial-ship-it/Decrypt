package I5;

/* JADX INFO: loaded from: classes3.dex */
final class a extends I5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f5060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f5061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f5062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I5.f f5063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final I5.d.b f5064e;

    static final class b extends I5.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f5065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f5066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.String f5067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private I5.f f5068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private I5.d.b f5069e;

        b() {
        }

        @Override // I5.d.a
        public I5.d a() {
            return new I5.a(this.f5065a, this.f5066b, this.f5067c, this.f5068d, this.f5069e);
        }

        @Override // I5.d.a
        public I5.d.a b(I5.f fVar) {
            this.f5068d = fVar;
            return this;
        }

        @Override // I5.d.a
        public I5.d.a c(java.lang.String str) {
            this.f5066b = str;
            return this;
        }

        @Override // I5.d.a
        public I5.d.a d(java.lang.String str) {
            this.f5067c = str;
            return this;
        }

        @Override // I5.d.a
        public I5.d.a e(I5.d.b bVar) {
            this.f5069e = bVar;
            return this;
        }

        @Override // I5.d.a
        public I5.d.a f(java.lang.String str) {
            this.f5065a = str;
            return this;
        }
    }

    private a(java.lang.String str, java.lang.String str2, java.lang.String str3, I5.f fVar, I5.d.b bVar) {
        this.f5060a = str;
        this.f5061b = str2;
        this.f5062c = str3;
        this.f5063d = fVar;
        this.f5064e = bVar;
    }

    @Override // I5.d
    public I5.f b() {
        return this.f5063d;
    }

    @Override // I5.d
    public java.lang.String c() {
        return this.f5061b;
    }

    @Override // I5.d
    public java.lang.String d() {
        return this.f5062c;
    }

    @Override // I5.d
    public I5.d.b e() {
        return this.f5064e;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof I5.d)) {
            return false;
        }
        I5.d dVar = (I5.d) obj;
        java.lang.String str = this.f5060a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            java.lang.String str2 = this.f5061b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                java.lang.String str3 = this.f5062c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    I5.f fVar = this.f5063d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        I5.d.b bVar = this.f5064e;
                        I5.d.b bVarE = dVar.e();
                        if (bVar == null) {
                            if (bVarE == null) {
                                return true;
                            }
                        } else if (bVar.equals(bVarE)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // I5.d
    public java.lang.String f() {
        return this.f5060a;
    }

    public int hashCode() {
        java.lang.String str = this.f5060a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        java.lang.String str2 = this.f5061b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        java.lang.String str3 = this.f5062c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        I5.f fVar = this.f5063d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        I5.d.b bVar = this.f5064e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "InstallationResponse{uri=" + this.f5060a + ", fid=" + this.f5061b + ", refreshToken=" + this.f5062c + ", authToken=" + this.f5063d + ", responseCode=" + this.f5064e + "}";
    }
}
