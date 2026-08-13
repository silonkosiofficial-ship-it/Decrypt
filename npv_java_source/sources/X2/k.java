package X2;

/* JADX INFO: loaded from: classes.dex */
final class k extends X2.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f15780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f15781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X2.o f15782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Integer f15783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f15784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.List f15785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final X2.x f15786g;

    static final class b extends X2.u.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.Long f15787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.Long f15788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private X2.o f15789c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private java.lang.Integer f15790d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private java.lang.String f15791e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private java.util.List f15792f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private X2.x f15793g;

        b() {
        }

        @Override // X2.u.a
        public X2.u a() {
            java.lang.String str = "";
            if (this.f15787a == null) {
                str = " requestTimeMs";
            }
            if (this.f15788b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new X2.k(this.f15787a.longValue(), this.f15788b.longValue(), this.f15789c, this.f15790d, this.f15791e, this.f15792f, this.f15793g);
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + str);
        }

        @Override // X2.u.a
        public X2.u.a b(X2.o oVar) {
            this.f15789c = oVar;
            return this;
        }

        @Override // X2.u.a
        public X2.u.a c(java.util.List list) {
            this.f15792f = list;
            return this;
        }

        @Override // X2.u.a
        X2.u.a d(java.lang.Integer num) {
            this.f15790d = num;
            return this;
        }

        @Override // X2.u.a
        X2.u.a e(java.lang.String str) {
            this.f15791e = str;
            return this;
        }

        @Override // X2.u.a
        public X2.u.a f(X2.x xVar) {
            this.f15793g = xVar;
            return this;
        }

        @Override // X2.u.a
        public X2.u.a g(long j6) {
            this.f15787a = java.lang.Long.valueOf(j6);
            return this;
        }

        @Override // X2.u.a
        public X2.u.a h(long j6) {
            this.f15788b = java.lang.Long.valueOf(j6);
            return this;
        }
    }

    private k(long j6, long j10, X2.o oVar, java.lang.Integer num, java.lang.String str, java.util.List list, X2.x xVar) {
        this.f15780a = j6;
        this.f15781b = j10;
        this.f15782c = oVar;
        this.f15783d = num;
        this.f15784e = str;
        this.f15785f = list;
        this.f15786g = xVar;
    }

    @Override // X2.u
    public X2.o b() {
        return this.f15782c;
    }

    @Override // X2.u
    public java.util.List c() {
        return this.f15785f;
    }

    @Override // X2.u
    public java.lang.Integer d() {
        return this.f15783d;
    }

    @Override // X2.u
    public java.lang.String e() {
        return this.f15784e;
    }

    public boolean equals(java.lang.Object obj) {
        X2.o oVar;
        java.lang.Integer num;
        java.lang.String str;
        java.util.List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X2.u)) {
            return false;
        }
        X2.u uVar = (X2.u) obj;
        if (this.f15780a == uVar.g() && this.f15781b == uVar.h() && ((oVar = this.f15782c) != null ? oVar.equals(uVar.b()) : uVar.b() == null) && ((num = this.f15783d) != null ? num.equals(uVar.d()) : uVar.d() == null) && ((str = this.f15784e) != null ? str.equals(uVar.e()) : uVar.e() == null) && ((list = this.f15785f) != null ? list.equals(uVar.c()) : uVar.c() == null)) {
            X2.x xVar = this.f15786g;
            X2.x xVarF = uVar.f();
            if (xVar == null) {
                if (xVarF == null) {
                    return true;
                }
            } else if (xVar.equals(xVarF)) {
                return true;
            }
        }
        return false;
    }

    @Override // X2.u
    public X2.x f() {
        return this.f15786g;
    }

    @Override // X2.u
    public long g() {
        return this.f15780a;
    }

    @Override // X2.u
    public long h() {
        return this.f15781b;
    }

    public int hashCode() {
        long j6 = this.f15780a;
        long j10 = this.f15781b;
        int i6 = (((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        X2.o oVar = this.f15782c;
        int iHashCode = (i6 ^ (oVar == null ? 0 : oVar.hashCode())) * 1000003;
        java.lang.Integer num = this.f15783d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        java.lang.String str = this.f15784e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        java.util.List list = this.f15785f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        X2.x xVar = this.f15786g;
        return iHashCode4 ^ (xVar != null ? xVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "LogRequest{requestTimeMs=" + this.f15780a + ", requestUptimeMs=" + this.f15781b + ", clientInfo=" + this.f15782c + ", logSource=" + this.f15783d + ", logSourceName=" + this.f15784e + ", logEvents=" + this.f15785f + ", qosTier=" + this.f15786g + "}";
    }
}
