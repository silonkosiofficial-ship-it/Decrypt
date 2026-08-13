package p136n5;

/* JADX INFO: loaded from: classes3.dex */
final class u extends n5.F.e.d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Double f51884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f51885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f51886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f51887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f51888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f51889f;

    static final class b extends n5.F.e.d.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.Double f51890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f51891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f51892c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f51893d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f51894e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f51895f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f51896g;

        b() {
        }

        @Override // n5.F.e.d.c.a
        public n5.F.e.d.c a() {
            if (this.f51896g == 31) {
                return new p136n5.u(this.f51890a, this.f51891b, this.f51892c, this.f51893d, this.f51894e, this.f51895f);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if ((this.f51896g & 1) == 0) {
                sb.append(" batteryVelocity");
            }
            if ((this.f51896g & 2) == 0) {
                sb.append(" proximityOn");
            }
            if ((this.f51896g & 4) == 0) {
                sb.append(" orientation");
            }
            if ((this.f51896g & 8) == 0) {
                sb.append(" ramUsed");
            }
            if ((this.f51896g & 16) == 0) {
                sb.append(" diskUsed");
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
        }

        @Override // n5.F.e.d.c.a
        public n5.F.e.d.c.a b(java.lang.Double d6) {
            this.f51890a = d6;
            return this;
        }

        @Override // n5.F.e.d.c.a
        public n5.F.e.d.c.a c(int i6) {
            this.f51891b = i6;
            this.f51896g = (byte) (this.f51896g | 1);
            return this;
        }

        @Override // n5.F.e.d.c.a
        public n5.F.e.d.c.a d(long j6) {
            this.f51895f = j6;
            this.f51896g = (byte) (this.f51896g | 16);
            return this;
        }

        @Override // n5.F.e.d.c.a
        public n5.F.e.d.c.a e(int i6) {
            this.f51893d = i6;
            this.f51896g = (byte) (this.f51896g | 4);
            return this;
        }

        @Override // n5.F.e.d.c.a
        public n5.F.e.d.c.a f(boolean z6) {
            this.f51892c = z6;
            this.f51896g = (byte) (this.f51896g | 2);
            return this;
        }

        @Override // n5.F.e.d.c.a
        public n5.F.e.d.c.a g(long j6) {
            this.f51894e = j6;
            this.f51896g = (byte) (this.f51896g | 8);
            return this;
        }
    }

    private u(java.lang.Double d6, int i6, boolean z6, int i10, long j6, long j10) {
        this.f51884a = d6;
        this.f51885b = i6;
        this.f51886c = z6;
        this.f51887d = i10;
        this.f51888e = j6;
        this.f51889f = j10;
    }

    @Override // n5.F.e.d.c
    public java.lang.Double b() {
        return this.f51884a;
    }

    @Override // n5.F.e.d.c
    public int c() {
        return this.f51885b;
    }

    @Override // n5.F.e.d.c
    public long d() {
        return this.f51889f;
    }

    @Override // n5.F.e.d.c
    public int e() {
        return this.f51887d;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5.F.e.d.c)) {
            return false;
        }
        n5.F.e.d.c cVar = (n5.F.e.d.c) obj;
        java.lang.Double d6 = this.f51884a;
        if (d6 != null ? d6.equals(cVar.b()) : cVar.b() == null) {
            if (this.f51885b == cVar.c() && this.f51886c == cVar.g() && this.f51887d == cVar.e() && this.f51888e == cVar.f() && this.f51889f == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // n5.F.e.d.c
    public long f() {
        return this.f51888e;
    }

    @Override // n5.F.e.d.c
    public boolean g() {
        return this.f51886c;
    }

    public int hashCode() {
        java.lang.Double d6 = this.f51884a;
        int iHashCode = ((((((((d6 == null ? 0 : d6.hashCode()) ^ 1000003) * 1000003) ^ this.f51885b) * 1000003) ^ (this.f51886c ? 1231 : 1237)) * 1000003) ^ this.f51887d) * 1000003;
        long j6 = this.f51888e;
        long j10 = this.f51889f;
        return ((iHashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public java.lang.String toString() {
        return "Device{batteryLevel=" + this.f51884a + ", batteryVelocity=" + this.f51885b + ", proximityOn=" + this.f51886c + ", orientation=" + this.f51887d + ", ramUsed=" + this.f51888e + ", diskUsed=" + this.f51889f + "}";
    }
}
