package Y2;

/* JADX INFO: loaded from: classes.dex */
final class b extends Y2.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f16273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Integer f16274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y2.h f16275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f16276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f16277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.Map f16278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.Integer f16279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f16280h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f16281i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final byte[] f16282j;

    /* JADX INFO: renamed from: Y2.b$b, reason: collision with other inner class name */
    static final class C0307b extends Y2.i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f16283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.Integer f16284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Y2.h f16285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private java.lang.Long f16286d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private java.lang.Long f16287e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private java.util.Map f16288f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private java.lang.Integer f16289g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private java.lang.String f16290h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte[] f16291i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte[] f16292j;

        C0307b() {
        }

        @Override // Y2.i.a
        public Y2.i d() {
            java.lang.String str = "";
            if (this.f16283a == null) {
                str = " transportName";
            }
            if (this.f16285c == null) {
                str = str + " encodedPayload";
            }
            if (this.f16286d == null) {
                str = str + " eventMillis";
            }
            if (this.f16287e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f16288f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new Y2.b(this.f16283a, this.f16284b, this.f16285c, this.f16286d.longValue(), this.f16287e.longValue(), this.f16288f, this.f16289g, this.f16290h, this.f16291i, this.f16292j);
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + str);
        }

        @Override // Y2.i.a
        protected java.util.Map e() {
            java.util.Map map = this.f16288f;
            if (map != null) {
                return map;
            }
            throw new java.lang.IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // Y2.i.a
        protected Y2.i.a f(java.util.Map map) {
            if (map == null) {
                throw new java.lang.NullPointerException("Null autoMetadata");
            }
            this.f16288f = map;
            return this;
        }

        @Override // Y2.i.a
        public Y2.i.a g(java.lang.Integer num) {
            this.f16284b = num;
            return this;
        }

        @Override // Y2.i.a
        public Y2.i.a h(Y2.h hVar) {
            if (hVar == null) {
                throw new java.lang.NullPointerException("Null encodedPayload");
            }
            this.f16285c = hVar;
            return this;
        }

        @Override // Y2.i.a
        public Y2.i.a i(long j6) {
            this.f16286d = java.lang.Long.valueOf(j6);
            return this;
        }

        @Override // Y2.i.a
        public Y2.i.a j(byte[] bArr) {
            this.f16291i = bArr;
            return this;
        }

        @Override // Y2.i.a
        public Y2.i.a k(byte[] bArr) {
            this.f16292j = bArr;
            return this;
        }

        @Override // Y2.i.a
        public Y2.i.a l(java.lang.Integer num) {
            this.f16289g = num;
            return this;
        }

        @Override // Y2.i.a
        public Y2.i.a m(java.lang.String str) {
            this.f16290h = str;
            return this;
        }

        @Override // Y2.i.a
        public Y2.i.a n(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null transportName");
            }
            this.f16283a = str;
            return this;
        }

        @Override // Y2.i.a
        public Y2.i.a o(long j6) {
            this.f16287e = java.lang.Long.valueOf(j6);
            return this;
        }
    }

    private b(java.lang.String str, java.lang.Integer num, Y2.h hVar, long j6, long j10, java.util.Map map, java.lang.Integer num2, java.lang.String str2, byte[] bArr, byte[] bArr2) {
        this.f16273a = str;
        this.f16274b = num;
        this.f16275c = hVar;
        this.f16276d = j6;
        this.f16277e = j10;
        this.f16278f = map;
        this.f16279g = num2;
        this.f16280h = str2;
        this.f16281i = bArr;
        this.f16282j = bArr2;
    }

    @Override // Y2.i
    protected java.util.Map c() {
        return this.f16278f;
    }

    @Override // Y2.i
    public java.lang.Integer d() {
        return this.f16274b;
    }

    @Override // Y2.i
    public Y2.h e() {
        return this.f16275c;
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Y2.i)) {
            return false;
        }
        Y2.i iVar = (Y2.i) obj;
        if (this.f16273a.equals(iVar.n()) && ((num = this.f16274b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f16275c.equals(iVar.e()) && this.f16276d == iVar.f() && this.f16277e == iVar.o() && this.f16278f.equals(iVar.c()) && ((num2 = this.f16279g) != null ? num2.equals(iVar.l()) : iVar.l() == null) && ((str = this.f16280h) != null ? str.equals(iVar.m()) : iVar.m() == null)) {
            boolean z6 = iVar instanceof Y2.b;
            if (java.util.Arrays.equals(this.f16281i, z6 ? ((Y2.b) iVar).f16281i : iVar.g())) {
                if (java.util.Arrays.equals(this.f16282j, z6 ? ((Y2.b) iVar).f16282j : iVar.h())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Y2.i
    public long f() {
        return this.f16276d;
    }

    @Override // Y2.i
    public byte[] g() {
        return this.f16281i;
    }

    @Override // Y2.i
    public byte[] h() {
        return this.f16282j;
    }

    public int hashCode() {
        int iHashCode = (this.f16273a.hashCode() ^ 1000003) * 1000003;
        java.lang.Integer num = this.f16274b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f16275c.hashCode()) * 1000003;
        long j6 = this.f16276d;
        int i6 = (iHashCode2 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j10 = this.f16277e;
        int iHashCode3 = (((i6 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f16278f.hashCode()) * 1000003;
        java.lang.Integer num2 = this.f16279g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        java.lang.String str = this.f16280h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ java.util.Arrays.hashCode(this.f16281i)) * 1000003) ^ java.util.Arrays.hashCode(this.f16282j);
    }

    @Override // Y2.i
    public java.lang.Integer l() {
        return this.f16279g;
    }

    @Override // Y2.i
    public java.lang.String m() {
        return this.f16280h;
    }

    @Override // Y2.i
    public java.lang.String n() {
        return this.f16273a;
    }

    @Override // Y2.i
    public long o() {
        return this.f16277e;
    }

    public java.lang.String toString() {
        return "EventInternal{transportName=" + this.f16273a + ", code=" + this.f16274b + ", encodedPayload=" + this.f16275c + ", eventMillis=" + this.f16276d + ", uptimeMillis=" + this.f16277e + ", autoMetadata=" + this.f16278f + ", productId=" + this.f16279g + ", pseudonymousId=" + this.f16280h + ", experimentIdsClear=" + java.util.Arrays.toString(this.f16281i) + ", experimentIdsEncrypted=" + java.util.Arrays.toString(this.f16282j) + "}";
    }
}
