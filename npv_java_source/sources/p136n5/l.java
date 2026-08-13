package p136n5;

/* JADX INFO: loaded from: classes3.dex */
final class l extends n5.F.e.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f51792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f51793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n5.F.e.d.a f51794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n5.F.e.d.c f51795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n5.F.e.d.AbstractC0665d f51796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n5.F.e.d.f f51797f;

    static final class b extends n5.F.e.d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f51798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f51799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n5.F.e.d.a f51800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private n5.F.e.d.c f51801d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private n5.F.e.d.AbstractC0665d f51802e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private n5.F.e.d.f f51803f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f51804g;

        b() {
        }

        private b(n5.F.e.d dVar) {
            this.f51798a = dVar.f();
            this.f51799b = dVar.g();
            this.f51800c = dVar.b();
            this.f51801d = dVar.c();
            this.f51802e = dVar.d();
            this.f51803f = dVar.e();
            this.f51804g = (byte) 1;
        }

        @Override // n5.F.e.d.b
        public n5.F.e.d a() {
            java.lang.String str;
            n5.F.e.d.a aVar;
            n5.F.e.d.c cVar;
            if (this.f51804g == 1 && (str = this.f51799b) != null && (aVar = this.f51800c) != null && (cVar = this.f51801d) != null) {
                return new p136n5.l(this.f51798a, str, aVar, cVar, this.f51802e, this.f51803f);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if ((1 & this.f51804g) == 0) {
                sb.append(" timestamp");
            }
            if (this.f51799b == null) {
                sb.append(" type");
            }
            if (this.f51800c == null) {
                sb.append(" app");
            }
            if (this.f51801d == null) {
                sb.append(" device");
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
        }

        @Override // n5.F.e.d.b
        public n5.F.e.d.b b(n5.F.e.d.a aVar) {
            if (aVar == null) {
                throw new java.lang.NullPointerException("Null app");
            }
            this.f51800c = aVar;
            return this;
        }

        @Override // n5.F.e.d.b
        public n5.F.e.d.b c(n5.F.e.d.c cVar) {
            if (cVar == null) {
                throw new java.lang.NullPointerException("Null device");
            }
            this.f51801d = cVar;
            return this;
        }

        @Override // n5.F.e.d.b
        public n5.F.e.d.b d(n5.F.e.d.AbstractC0665d abstractC0665d) {
            this.f51802e = abstractC0665d;
            return this;
        }

        @Override // n5.F.e.d.b
        public n5.F.e.d.b e(n5.F.e.d.f fVar) {
            this.f51803f = fVar;
            return this;
        }

        @Override // n5.F.e.d.b
        public n5.F.e.d.b f(long j6) {
            this.f51798a = j6;
            this.f51804g = (byte) (this.f51804g | 1);
            return this;
        }

        @Override // n5.F.e.d.b
        public n5.F.e.d.b g(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null type");
            }
            this.f51799b = str;
            return this;
        }
    }

    private l(long j6, java.lang.String str, n5.F.e.d.a aVar, n5.F.e.d.c cVar, n5.F.e.d.AbstractC0665d abstractC0665d, n5.F.e.d.f fVar) {
        this.f51792a = j6;
        this.f51793b = str;
        this.f51794c = aVar;
        this.f51795d = cVar;
        this.f51796e = abstractC0665d;
        this.f51797f = fVar;
    }

    @Override // n5.F.e.d
    public n5.F.e.d.a b() {
        return this.f51794c;
    }

    @Override // n5.F.e.d
    public n5.F.e.d.c c() {
        return this.f51795d;
    }

    @Override // n5.F.e.d
    public n5.F.e.d.AbstractC0665d d() {
        return this.f51796e;
    }

    @Override // n5.F.e.d
    public n5.F.e.d.f e() {
        return this.f51797f;
    }

    public boolean equals(java.lang.Object obj) {
        n5.F.e.d.AbstractC0665d abstractC0665d;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5.F.e.d)) {
            return false;
        }
        n5.F.e.d dVar = (n5.F.e.d) obj;
        if (this.f51792a == dVar.f() && this.f51793b.equals(dVar.g()) && this.f51794c.equals(dVar.b()) && this.f51795d.equals(dVar.c()) && ((abstractC0665d = this.f51796e) != null ? abstractC0665d.equals(dVar.d()) : dVar.d() == null)) {
            n5.F.e.d.f fVar = this.f51797f;
            n5.F.e.d.f fVarE = dVar.e();
            if (fVar == null) {
                if (fVarE == null) {
                    return true;
                }
            } else if (fVar.equals(fVarE)) {
                return true;
            }
        }
        return false;
    }

    @Override // n5.F.e.d
    public long f() {
        return this.f51792a;
    }

    @Override // n5.F.e.d
    public java.lang.String g() {
        return this.f51793b;
    }

    @Override // n5.F.e.d
    public n5.F.e.d.b h() {
        return new n5.l.b(this);
    }

    public int hashCode() {
        long j6 = this.f51792a;
        int iHashCode = (((((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ this.f51793b.hashCode()) * 1000003) ^ this.f51794c.hashCode()) * 1000003) ^ this.f51795d.hashCode()) * 1000003;
        n5.F.e.d.AbstractC0665d abstractC0665d = this.f51796e;
        int iHashCode2 = (iHashCode ^ (abstractC0665d == null ? 0 : abstractC0665d.hashCode())) * 1000003;
        n5.F.e.d.f fVar = this.f51797f;
        return iHashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "Event{timestamp=" + this.f51792a + ", type=" + this.f51793b + ", app=" + this.f51794c + ", device=" + this.f51795d + ", log=" + this.f51796e + ", rollouts=" + this.f51797f + "}";
    }
}
