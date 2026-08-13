package p136n5;

/* JADX INFO: loaded from: classes3.dex */
final class h extends n5.F.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f51736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f51737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f51738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f51739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.Long f51740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f51741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n5.F.e.a f51742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final n5.F.e.f f51743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final n5.F.e.AbstractC0667e f51744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n5.F.e.c f51745j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.util.List f51746k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f51747l;

    static final class b extends n5.F.e.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f51748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f51749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.String f51750c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f51751d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private java.lang.Long f51752e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f51753f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private n5.F.e.a f51754g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private n5.F.e.f f51755h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private n5.F.e.AbstractC0667e f51756i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private n5.F.e.c f51757j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private java.util.List f51758k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f51759l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private byte f51760m;

        b() {
        }

        private b(n5.F.e eVar) {
            this.f51748a = eVar.g();
            this.f51749b = eVar.i();
            this.f51750c = eVar.c();
            this.f51751d = eVar.l();
            this.f51752e = eVar.e();
            this.f51753f = eVar.n();
            this.f51754g = eVar.b();
            this.f51755h = eVar.m();
            this.f51756i = eVar.k();
            this.f51757j = eVar.d();
            this.f51758k = eVar.f();
            this.f51759l = eVar.h();
            this.f51760m = (byte) 7;
        }

        @Override // n5.F.e.b
        public n5.F.e a() {
            java.lang.String str;
            java.lang.String str2;
            n5.F.e.a aVar;
            if (this.f51760m == 7 && (str = this.f51748a) != null && (str2 = this.f51749b) != null && (aVar = this.f51754g) != null) {
                return new p136n5.h(str, str2, this.f51750c, this.f51751d, this.f51752e, this.f51753f, aVar, this.f51755h, this.f51756i, this.f51757j, this.f51758k, this.f51759l);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.f51748a == null) {
                sb.append(" generator");
            }
            if (this.f51749b == null) {
                sb.append(" identifier");
            }
            if ((this.f51760m & 1) == 0) {
                sb.append(" startedAt");
            }
            if ((this.f51760m & 2) == 0) {
                sb.append(" crashed");
            }
            if (this.f51754g == null) {
                sb.append(" app");
            }
            if ((this.f51760m & 4) == 0) {
                sb.append(" generatorType");
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
        }

        @Override // n5.F.e.b
        public n5.F.e.b b(n5.F.e.a aVar) {
            if (aVar == null) {
                throw new java.lang.NullPointerException("Null app");
            }
            this.f51754g = aVar;
            return this;
        }

        @Override // n5.F.e.b
        public n5.F.e.b c(java.lang.String str) {
            this.f51750c = str;
            return this;
        }

        @Override // n5.F.e.b
        public n5.F.e.b d(boolean z6) {
            this.f51753f = z6;
            this.f51760m = (byte) (this.f51760m | 2);
            return this;
        }

        @Override // n5.F.e.b
        public n5.F.e.b e(n5.F.e.c cVar) {
            this.f51757j = cVar;
            return this;
        }

        @Override // n5.F.e.b
        public n5.F.e.b f(java.lang.Long l6) {
            this.f51752e = l6;
            return this;
        }

        @Override // n5.F.e.b
        public n5.F.e.b g(java.util.List list) {
            this.f51758k = list;
            return this;
        }

        @Override // n5.F.e.b
        public n5.F.e.b h(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null generator");
            }
            this.f51748a = str;
            return this;
        }

        @Override // n5.F.e.b
        public n5.F.e.b i(int i6) {
            this.f51759l = i6;
            this.f51760m = (byte) (this.f51760m | 4);
            return this;
        }

        @Override // n5.F.e.b
        public n5.F.e.b j(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null identifier");
            }
            this.f51749b = str;
            return this;
        }

        @Override // n5.F.e.b
        public n5.F.e.b l(n5.F.e.AbstractC0667e abstractC0667e) {
            this.f51756i = abstractC0667e;
            return this;
        }

        @Override // n5.F.e.b
        public n5.F.e.b m(long j6) {
            this.f51751d = j6;
            this.f51760m = (byte) (this.f51760m | 1);
            return this;
        }

        @Override // n5.F.e.b
        public n5.F.e.b n(n5.F.e.f fVar) {
            this.f51755h = fVar;
            return this;
        }
    }

    private h(java.lang.String str, java.lang.String str2, java.lang.String str3, long j6, java.lang.Long l6, boolean z6, n5.F.e.a aVar, n5.F.e.f fVar, n5.F.e.AbstractC0667e abstractC0667e, n5.F.e.c cVar, java.util.List list, int i6) {
        this.f51736a = str;
        this.f51737b = str2;
        this.f51738c = str3;
        this.f51739d = j6;
        this.f51740e = l6;
        this.f51741f = z6;
        this.f51742g = aVar;
        this.f51743h = fVar;
        this.f51744i = abstractC0667e;
        this.f51745j = cVar;
        this.f51746k = list;
        this.f51747l = i6;
    }

    @Override // n5.F.e
    public n5.F.e.a b() {
        return this.f51742g;
    }

    @Override // n5.F.e
    public java.lang.String c() {
        return this.f51738c;
    }

    @Override // n5.F.e
    public n5.F.e.c d() {
        return this.f51745j;
    }

    @Override // n5.F.e
    public java.lang.Long e() {
        return this.f51740e;
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Long l6;
        n5.F.e.f fVar;
        n5.F.e.AbstractC0667e abstractC0667e;
        n5.F.e.c cVar;
        java.util.List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5.F.e)) {
            return false;
        }
        n5.F.e eVar = (n5.F.e) obj;
        return this.f51736a.equals(eVar.g()) && this.f51737b.equals(eVar.i()) && ((str = this.f51738c) != null ? str.equals(eVar.c()) : eVar.c() == null) && this.f51739d == eVar.l() && ((l6 = this.f51740e) != null ? l6.equals(eVar.e()) : eVar.e() == null) && this.f51741f == eVar.n() && this.f51742g.equals(eVar.b()) && ((fVar = this.f51743h) != null ? fVar.equals(eVar.m()) : eVar.m() == null) && ((abstractC0667e = this.f51744i) != null ? abstractC0667e.equals(eVar.k()) : eVar.k() == null) && ((cVar = this.f51745j) != null ? cVar.equals(eVar.d()) : eVar.d() == null) && ((list = this.f51746k) != null ? list.equals(eVar.f()) : eVar.f() == null) && this.f51747l == eVar.h();
    }

    @Override // n5.F.e
    public java.util.List f() {
        return this.f51746k;
    }

    @Override // n5.F.e
    public java.lang.String g() {
        return this.f51736a;
    }

    @Override // n5.F.e
    public int h() {
        return this.f51747l;
    }

    public int hashCode() {
        int iHashCode = (((this.f51736a.hashCode() ^ 1000003) * 1000003) ^ this.f51737b.hashCode()) * 1000003;
        java.lang.String str = this.f51738c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j6 = this.f51739d;
        int i6 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        java.lang.Long l6 = this.f51740e;
        int iHashCode3 = (((((i6 ^ (l6 == null ? 0 : l6.hashCode())) * 1000003) ^ (this.f51741f ? 1231 : 1237)) * 1000003) ^ this.f51742g.hashCode()) * 1000003;
        n5.F.e.f fVar = this.f51743h;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        n5.F.e.AbstractC0667e abstractC0667e = this.f51744i;
        int iHashCode5 = (iHashCode4 ^ (abstractC0667e == null ? 0 : abstractC0667e.hashCode())) * 1000003;
        n5.F.e.c cVar = this.f51745j;
        int iHashCode6 = (iHashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        java.util.List list = this.f51746k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f51747l;
    }

    @Override // n5.F.e
    public java.lang.String i() {
        return this.f51737b;
    }

    @Override // n5.F.e
    public n5.F.e.AbstractC0667e k() {
        return this.f51744i;
    }

    @Override // n5.F.e
    public long l() {
        return this.f51739d;
    }

    @Override // n5.F.e
    public n5.F.e.f m() {
        return this.f51743h;
    }

    @Override // n5.F.e
    public boolean n() {
        return this.f51741f;
    }

    @Override // n5.F.e
    public n5.F.e.b o() {
        return new n5.h.b(this);
    }

    public java.lang.String toString() {
        return "Session{generator=" + this.f51736a + ", identifier=" + this.f51737b + ", appQualitySessionId=" + this.f51738c + ", startedAt=" + this.f51739d + ", endedAt=" + this.f51740e + ", crashed=" + this.f51741f + ", app=" + this.f51742g + ", user=" + this.f51743h + ", os=" + this.f51744i + ", device=" + this.f51745j + ", events=" + this.f51746k + ", generatorType=" + this.f51747l + "}";
    }
}
