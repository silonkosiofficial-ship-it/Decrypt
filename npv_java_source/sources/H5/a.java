package H5;

/* JADX INFO: loaded from: classes3.dex */
final class a extends H5.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f4368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H5.c.a f4369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f4370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f4371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f4372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f4373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f4374h;

    static final class b extends H5.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f4375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private H5.c.a f4376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.String f4377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private java.lang.String f4378d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private java.lang.Long f4379e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private java.lang.Long f4380f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private java.lang.String f4381g;

        b() {
        }

        private b(H5.d dVar) {
            this.f4375a = dVar.d();
            this.f4376b = dVar.g();
            this.f4377c = dVar.b();
            this.f4378d = dVar.f();
            this.f4379e = java.lang.Long.valueOf(dVar.c());
            this.f4380f = java.lang.Long.valueOf(dVar.h());
            this.f4381g = dVar.e();
        }

        @Override // H5.d.a
        public H5.d a() {
            java.lang.String str = "";
            if (this.f4376b == null) {
                str = " registrationStatus";
            }
            if (this.f4379e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f4380f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new H5.a(this.f4375a, this.f4376b, this.f4377c, this.f4378d, this.f4379e.longValue(), this.f4380f.longValue(), this.f4381g);
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + str);
        }

        @Override // H5.d.a
        public H5.d.a b(java.lang.String str) {
            this.f4377c = str;
            return this;
        }

        @Override // H5.d.a
        public H5.d.a c(long j6) {
            this.f4379e = java.lang.Long.valueOf(j6);
            return this;
        }

        @Override // H5.d.a
        public H5.d.a d(java.lang.String str) {
            this.f4375a = str;
            return this;
        }

        @Override // H5.d.a
        public H5.d.a e(java.lang.String str) {
            this.f4381g = str;
            return this;
        }

        @Override // H5.d.a
        public H5.d.a f(java.lang.String str) {
            this.f4378d = str;
            return this;
        }

        @Override // H5.d.a
        public H5.d.a g(H5.c.a aVar) {
            if (aVar == null) {
                throw new java.lang.NullPointerException("Null registrationStatus");
            }
            this.f4376b = aVar;
            return this;
        }

        @Override // H5.d.a
        public H5.d.a h(long j6) {
            this.f4380f = java.lang.Long.valueOf(j6);
            return this;
        }
    }

    private a(java.lang.String str, H5.c.a aVar, java.lang.String str2, java.lang.String str3, long j6, long j10, java.lang.String str4) {
        this.f4368b = str;
        this.f4369c = aVar;
        this.f4370d = str2;
        this.f4371e = str3;
        this.f4372f = j6;
        this.f4373g = j10;
        this.f4374h = str4;
    }

    @Override // H5.d
    public java.lang.String b() {
        return this.f4370d;
    }

    @Override // H5.d
    public long c() {
        return this.f4372f;
    }

    @Override // H5.d
    public java.lang.String d() {
        return this.f4368b;
    }

    @Override // H5.d
    public java.lang.String e() {
        return this.f4374h;
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H5.d)) {
            return false;
        }
        H5.d dVar = (H5.d) obj;
        java.lang.String str3 = this.f4368b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f4369c.equals(dVar.g()) && ((str = this.f4370d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f4371e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f4372f == dVar.c() && this.f4373g == dVar.h()) {
                java.lang.String str4 = this.f4374h;
                java.lang.String strE = dVar.e();
                if (str4 == null) {
                    if (strE == null) {
                        return true;
                    }
                } else if (str4.equals(strE)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // H5.d
    public java.lang.String f() {
        return this.f4371e;
    }

    @Override // H5.d
    public H5.c.a g() {
        return this.f4369c;
    }

    @Override // H5.d
    public long h() {
        return this.f4373g;
    }

    public int hashCode() {
        java.lang.String str = this.f4368b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f4369c.hashCode()) * 1000003;
        java.lang.String str2 = this.f4370d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        java.lang.String str3 = this.f4371e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j6 = this.f4372f;
        int i6 = (iHashCode3 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j10 = this.f4373g;
        int i10 = (i6 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        java.lang.String str4 = this.f4374h;
        return i10 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // H5.d
    public H5.d.a n() {
        return new H5.a.b(this);
    }

    public java.lang.String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f4368b + ", registrationStatus=" + this.f4369c + ", authToken=" + this.f4370d + ", refreshToken=" + this.f4371e + ", expiresInSecs=" + this.f4372f + ", tokenCreationEpochInSecs=" + this.f4373g + ", fisError=" + this.f4374h + "}";
    }
}
