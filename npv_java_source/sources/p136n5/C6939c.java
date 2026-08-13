package p136n5;

/* JADX INFO: renamed from: n5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6939c extends n5.F.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f51699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f51700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f51701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f51702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f51703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f51704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f51705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f51706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.List f51707i;

    /* JADX INFO: renamed from: n5.c$b */
    static final class b extends n5.F.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f51708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f51709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f51710c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f51711d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f51712e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f51713f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f51714g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private java.lang.String f51715h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private java.util.List f51716i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte f51717j;

        b() {
        }

        @Override // n5.F.a.b
        public n5.F.a a() {
            java.lang.String str;
            if (this.f51717j == 63 && (str = this.f51709b) != null) {
                return new p136n5.C6939c(this.f51708a, str, this.f51710c, this.f51711d, this.f51712e, this.f51713f, this.f51714g, this.f51715h, this.f51716i);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if ((this.f51717j & 1) == 0) {
                sb.append(" pid");
            }
            if (this.f51709b == null) {
                sb.append(" processName");
            }
            if ((this.f51717j & 2) == 0) {
                sb.append(" reasonCode");
            }
            if ((this.f51717j & 4) == 0) {
                sb.append(" importance");
            }
            if ((this.f51717j & 8) == 0) {
                sb.append(" pss");
            }
            if ((this.f51717j & 16) == 0) {
                sb.append(" rss");
            }
            if ((this.f51717j & 32) == 0) {
                sb.append(" timestamp");
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
        }

        @Override // n5.F.a.b
        public n5.F.a.b b(java.util.List list) {
            this.f51716i = list;
            return this;
        }

        @Override // n5.F.a.b
        public n5.F.a.b c(int i6) {
            this.f51711d = i6;
            this.f51717j = (byte) (this.f51717j | 4);
            return this;
        }

        @Override // n5.F.a.b
        public n5.F.a.b d(int i6) {
            this.f51708a = i6;
            this.f51717j = (byte) (this.f51717j | 1);
            return this;
        }

        @Override // n5.F.a.b
        public n5.F.a.b e(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null processName");
            }
            this.f51709b = str;
            return this;
        }

        @Override // n5.F.a.b
        public n5.F.a.b f(long j6) {
            this.f51712e = j6;
            this.f51717j = (byte) (this.f51717j | 8);
            return this;
        }

        @Override // n5.F.a.b
        public n5.F.a.b g(int i6) {
            this.f51710c = i6;
            this.f51717j = (byte) (this.f51717j | 2);
            return this;
        }

        @Override // n5.F.a.b
        public n5.F.a.b h(long j6) {
            this.f51713f = j6;
            this.f51717j = (byte) (this.f51717j | 16);
            return this;
        }

        @Override // n5.F.a.b
        public n5.F.a.b i(long j6) {
            this.f51714g = j6;
            this.f51717j = (byte) (this.f51717j | 32);
            return this;
        }

        @Override // n5.F.a.b
        public n5.F.a.b j(java.lang.String str) {
            this.f51715h = str;
            return this;
        }
    }

    private C6939c(int i6, java.lang.String str, int i10, int i11, long j6, long j10, long j11, java.lang.String str2, java.util.List list) {
        this.f51699a = i6;
        this.f51700b = str;
        this.f51701c = i10;
        this.f51702d = i11;
        this.f51703e = j6;
        this.f51704f = j10;
        this.f51705g = j11;
        this.f51706h = str2;
        this.f51707i = list;
    }

    @Override // n5.F.a
    public java.util.List b() {
        return this.f51707i;
    }

    @Override // n5.F.a
    public int c() {
        return this.f51702d;
    }

    @Override // n5.F.a
    public int d() {
        return this.f51699a;
    }

    @Override // n5.F.a
    public java.lang.String e() {
        return this.f51700b;
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5.F.a)) {
            return false;
        }
        n5.F.a aVar = (n5.F.a) obj;
        if (this.f51699a == aVar.d() && this.f51700b.equals(aVar.e()) && this.f51701c == aVar.g() && this.f51702d == aVar.c() && this.f51703e == aVar.f() && this.f51704f == aVar.h() && this.f51705g == aVar.i() && ((str = this.f51706h) != null ? str.equals(aVar.j()) : aVar.j() == null)) {
            java.util.List list = this.f51707i;
            java.util.List listB = aVar.b();
            if (list == null) {
                if (listB == null) {
                    return true;
                }
            } else if (list.equals(listB)) {
                return true;
            }
        }
        return false;
    }

    @Override // n5.F.a
    public long f() {
        return this.f51703e;
    }

    @Override // n5.F.a
    public int g() {
        return this.f51701c;
    }

    @Override // n5.F.a
    public long h() {
        return this.f51704f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f51699a ^ 1000003) * 1000003) ^ this.f51700b.hashCode()) * 1000003) ^ this.f51701c) * 1000003) ^ this.f51702d) * 1000003;
        long j6 = this.f51703e;
        int i6 = (iHashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j10 = this.f51704f;
        int i10 = (i6 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f51705g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        java.lang.String str = this.f51706h;
        int iHashCode2 = (i11 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        java.util.List list = this.f51707i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // n5.F.a
    public long i() {
        return this.f51705g;
    }

    @Override // n5.F.a
    public java.lang.String j() {
        return this.f51706h;
    }

    public java.lang.String toString() {
        return "ApplicationExitInfo{pid=" + this.f51699a + ", processName=" + this.f51700b + ", reasonCode=" + this.f51701c + ", importance=" + this.f51702d + ", pss=" + this.f51703e + ", rss=" + this.f51704f + ", timestamp=" + this.f51705g + ", traceFile=" + this.f51706h + ", buildIdMappingForArch=" + this.f51707i + "}";
    }
}
