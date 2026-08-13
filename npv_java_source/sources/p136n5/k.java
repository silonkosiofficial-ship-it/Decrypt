package p136n5;

/* JADX INFO: loaded from: classes3.dex */
final class k extends n5.F.e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f51773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f51774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f51775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f51776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f51777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f51778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f51779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f51780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.lang.String f51781i;

    static final class b extends n5.F.e.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f51782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f51783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f51784c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f51785d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f51786e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f51787f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f51788g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private java.lang.String f51789h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private java.lang.String f51790i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte f51791j;

        b() {
        }

        @Override // n5.F.e.c.a
        public n5.F.e.c a() {
            java.lang.String str;
            java.lang.String str2;
            java.lang.String str3;
            if (this.f51791j == 63 && (str = this.f51783b) != null && (str2 = this.f51789h) != null && (str3 = this.f51790i) != null) {
                return new p136n5.k(this.f51782a, str, this.f51784c, this.f51785d, this.f51786e, this.f51787f, this.f51788g, str2, str3);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if ((this.f51791j & 1) == 0) {
                sb.append(" arch");
            }
            if (this.f51783b == null) {
                sb.append(" model");
            }
            if ((this.f51791j & 2) == 0) {
                sb.append(" cores");
            }
            if ((this.f51791j & 4) == 0) {
                sb.append(" ram");
            }
            if ((this.f51791j & 8) == 0) {
                sb.append(" diskSpace");
            }
            if ((this.f51791j & 16) == 0) {
                sb.append(" simulator");
            }
            if ((this.f51791j & 32) == 0) {
                sb.append(" state");
            }
            if (this.f51789h == null) {
                sb.append(" manufacturer");
            }
            if (this.f51790i == null) {
                sb.append(" modelClass");
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
        }

        @Override // n5.F.e.c.a
        public n5.F.e.c.a b(int i6) {
            this.f51782a = i6;
            this.f51791j = (byte) (this.f51791j | 1);
            return this;
        }

        @Override // n5.F.e.c.a
        public n5.F.e.c.a c(int i6) {
            this.f51784c = i6;
            this.f51791j = (byte) (this.f51791j | 2);
            return this;
        }

        @Override // n5.F.e.c.a
        public n5.F.e.c.a d(long j6) {
            this.f51786e = j6;
            this.f51791j = (byte) (this.f51791j | 8);
            return this;
        }

        @Override // n5.F.e.c.a
        public n5.F.e.c.a e(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null manufacturer");
            }
            this.f51789h = str;
            return this;
        }

        @Override // n5.F.e.c.a
        public n5.F.e.c.a f(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null model");
            }
            this.f51783b = str;
            return this;
        }

        @Override // n5.F.e.c.a
        public n5.F.e.c.a g(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null modelClass");
            }
            this.f51790i = str;
            return this;
        }

        @Override // n5.F.e.c.a
        public n5.F.e.c.a h(long j6) {
            this.f51785d = j6;
            this.f51791j = (byte) (this.f51791j | 4);
            return this;
        }

        @Override // n5.F.e.c.a
        public n5.F.e.c.a i(boolean z6) {
            this.f51787f = z6;
            this.f51791j = (byte) (this.f51791j | 16);
            return this;
        }

        @Override // n5.F.e.c.a
        public n5.F.e.c.a j(int i6) {
            this.f51788g = i6;
            this.f51791j = (byte) (this.f51791j | 32);
            return this;
        }
    }

    private k(int i6, java.lang.String str, int i10, long j6, long j10, boolean z6, int i11, java.lang.String str2, java.lang.String str3) {
        this.f51773a = i6;
        this.f51774b = str;
        this.f51775c = i10;
        this.f51776d = j6;
        this.f51777e = j10;
        this.f51778f = z6;
        this.f51779g = i11;
        this.f51780h = str2;
        this.f51781i = str3;
    }

    @Override // n5.F.e.c
    public int b() {
        return this.f51773a;
    }

    @Override // n5.F.e.c
    public int c() {
        return this.f51775c;
    }

    @Override // n5.F.e.c
    public long d() {
        return this.f51777e;
    }

    @Override // n5.F.e.c
    public java.lang.String e() {
        return this.f51780h;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5.F.e.c)) {
            return false;
        }
        n5.F.e.c cVar = (n5.F.e.c) obj;
        return this.f51773a == cVar.b() && this.f51774b.equals(cVar.f()) && this.f51775c == cVar.c() && this.f51776d == cVar.h() && this.f51777e == cVar.d() && this.f51778f == cVar.j() && this.f51779g == cVar.i() && this.f51780h.equals(cVar.e()) && this.f51781i.equals(cVar.g());
    }

    @Override // n5.F.e.c
    public java.lang.String f() {
        return this.f51774b;
    }

    @Override // n5.F.e.c
    public java.lang.String g() {
        return this.f51781i;
    }

    @Override // n5.F.e.c
    public long h() {
        return this.f51776d;
    }

    public int hashCode() {
        int iHashCode = (((((this.f51773a ^ 1000003) * 1000003) ^ this.f51774b.hashCode()) * 1000003) ^ this.f51775c) * 1000003;
        long j6 = this.f51776d;
        int i6 = (iHashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j10 = this.f51777e;
        return ((((((((i6 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f51778f ? 1231 : 1237)) * 1000003) ^ this.f51779g) * 1000003) ^ this.f51780h.hashCode()) * 1000003) ^ this.f51781i.hashCode();
    }

    @Override // n5.F.e.c
    public int i() {
        return this.f51779g;
    }

    @Override // n5.F.e.c
    public boolean j() {
        return this.f51778f;
    }

    public java.lang.String toString() {
        return "Device{arch=" + this.f51773a + ", model=" + this.f51774b + ", cores=" + this.f51775c + ", ram=" + this.f51776d + ", diskSpace=" + this.f51777e + ", simulator=" + this.f51778f + ", state=" + this.f51779g + ", manufacturer=" + this.f51780h + ", modelClass=" + this.f51781i + "}";
    }
}
