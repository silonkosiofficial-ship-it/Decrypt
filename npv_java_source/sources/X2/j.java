package X2;

/* JADX INFO: loaded from: classes.dex */
final class j extends X2.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f15762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Integer f15763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X2.p f15764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f15765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f15766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String f15767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f15768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final X2.w f15769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final X2.q f15770i;

    static final class b extends X2.t.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.Long f15771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.Integer f15772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private X2.p f15773c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private java.lang.Long f15774d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte[] f15775e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private java.lang.String f15776f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private java.lang.Long f15777g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private X2.w f15778h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private X2.q f15779i;

        b() {
        }

        @Override // X2.t.a
        public X2.t a() {
            java.lang.String str = "";
            if (this.f15771a == null) {
                str = " eventTimeMs";
            }
            if (this.f15774d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f15777g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new X2.j(this.f15771a.longValue(), this.f15772b, this.f15773c, this.f15774d.longValue(), this.f15775e, this.f15776f, this.f15777g.longValue(), this.f15778h, this.f15779i);
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + str);
        }

        @Override // X2.t.a
        public X2.t.a b(X2.p pVar) {
            this.f15773c = pVar;
            return this;
        }

        @Override // X2.t.a
        public X2.t.a c(java.lang.Integer num) {
            this.f15772b = num;
            return this;
        }

        @Override // X2.t.a
        public X2.t.a d(long j6) {
            this.f15771a = java.lang.Long.valueOf(j6);
            return this;
        }

        @Override // X2.t.a
        public X2.t.a e(long j6) {
            this.f15774d = java.lang.Long.valueOf(j6);
            return this;
        }

        @Override // X2.t.a
        public X2.t.a f(X2.q qVar) {
            this.f15779i = qVar;
            return this;
        }

        @Override // X2.t.a
        public X2.t.a g(X2.w wVar) {
            this.f15778h = wVar;
            return this;
        }

        @Override // X2.t.a
        X2.t.a h(byte[] bArr) {
            this.f15775e = bArr;
            return this;
        }

        @Override // X2.t.a
        X2.t.a i(java.lang.String str) {
            this.f15776f = str;
            return this;
        }

        @Override // X2.t.a
        public X2.t.a j(long j6) {
            this.f15777g = java.lang.Long.valueOf(j6);
            return this;
        }
    }

    private j(long j6, java.lang.Integer num, X2.p pVar, long j10, byte[] bArr, java.lang.String str, long j11, X2.w wVar, X2.q qVar) {
        this.f15762a = j6;
        this.f15763b = num;
        this.f15764c = pVar;
        this.f15765d = j10;
        this.f15766e = bArr;
        this.f15767f = str;
        this.f15768g = j11;
        this.f15769h = wVar;
        this.f15770i = qVar;
    }

    @Override // X2.t
    public X2.p b() {
        return this.f15764c;
    }

    @Override // X2.t
    public java.lang.Integer c() {
        return this.f15763b;
    }

    @Override // X2.t
    public long d() {
        return this.f15762a;
    }

    @Override // X2.t
    public long e() {
        return this.f15765d;
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.Integer num;
        X2.p pVar;
        java.lang.String str;
        X2.w wVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X2.t)) {
            return false;
        }
        X2.t tVar = (X2.t) obj;
        if (this.f15762a == tVar.d() && ((num = this.f15763b) != null ? num.equals(tVar.c()) : tVar.c() == null) && ((pVar = this.f15764c) != null ? pVar.equals(tVar.b()) : tVar.b() == null) && this.f15765d == tVar.e()) {
            if (java.util.Arrays.equals(this.f15766e, tVar instanceof X2.j ? ((X2.j) tVar).f15766e : tVar.h()) && ((str = this.f15767f) != null ? str.equals(tVar.i()) : tVar.i() == null) && this.f15768g == tVar.j() && ((wVar = this.f15769h) != null ? wVar.equals(tVar.g()) : tVar.g() == null)) {
                X2.q qVar = this.f15770i;
                X2.q qVarF = tVar.f();
                if (qVar == null) {
                    if (qVarF == null) {
                        return true;
                    }
                } else if (qVar.equals(qVarF)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X2.t
    public X2.q f() {
        return this.f15770i;
    }

    @Override // X2.t
    public X2.w g() {
        return this.f15769h;
    }

    @Override // X2.t
    public byte[] h() {
        return this.f15766e;
    }

    public int hashCode() {
        long j6 = this.f15762a;
        int i6 = (((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003;
        java.lang.Integer num = this.f15763b;
        int iHashCode = (i6 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        X2.p pVar = this.f15764c;
        int iHashCode2 = pVar == null ? 0 : pVar.hashCode();
        long j10 = this.f15765d;
        int iHashCode3 = (((((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ java.util.Arrays.hashCode(this.f15766e)) * 1000003;
        java.lang.String str = this.f15767f;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j11 = this.f15768g;
        int i10 = (((iHashCode3 ^ iHashCode4) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        X2.w wVar = this.f15769h;
        int iHashCode5 = (i10 ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        X2.q qVar = this.f15770i;
        return iHashCode5 ^ (qVar != null ? qVar.hashCode() : 0);
    }

    @Override // X2.t
    public java.lang.String i() {
        return this.f15767f;
    }

    @Override // X2.t
    public long j() {
        return this.f15768g;
    }

    public java.lang.String toString() {
        return "LogEvent{eventTimeMs=" + this.f15762a + ", eventCode=" + this.f15763b + ", complianceData=" + this.f15764c + ", eventUptimeMs=" + this.f15765d + ", sourceExtension=" + java.util.Arrays.toString(this.f15766e) + ", sourceExtensionJsonProto3=" + this.f15767f + ", timezoneOffsetSeconds=" + this.f15768g + ", networkConnectionInfo=" + this.f15769h + ", experimentIds=" + this.f15770i + "}";
    }
}
