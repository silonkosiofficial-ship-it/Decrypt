package p136n5;

/* JADX INFO: renamed from: n5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6938b extends p136n5.F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f51674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f51675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f51676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f51677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String f51678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.String f51679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f51680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.lang.String f51681i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.lang.String f51682j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final n5.F.e f51683k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final n5.F.d f51684l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final n5.F.a f51685m;

    /* JADX INFO: renamed from: n5.b$b, reason: collision with other inner class name */
    static final class C0669b extends n5.F.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f51686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f51687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f51688c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private java.lang.String f51689d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private java.lang.String f51690e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private java.lang.String f51691f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private java.lang.String f51692g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private java.lang.String f51693h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private java.lang.String f51694i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private n5.F.e f51695j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private n5.F.d f51696k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private n5.F.a f51697l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private byte f51698m;

        C0669b() {
        }

        private C0669b(p136n5.F f6) {
            this.f51686a = f6.m();
            this.f51687b = f6.i();
            this.f51688c = f6.l();
            this.f51689d = f6.j();
            this.f51690e = f6.h();
            this.f51691f = f6.g();
            this.f51692g = f6.d();
            this.f51693h = f6.e();
            this.f51694i = f6.f();
            this.f51695j = f6.n();
            this.f51696k = f6.k();
            this.f51697l = f6.c();
            this.f51698m = (byte) 1;
        }

        @Override // n5.F.b
        public p136n5.F a() {
            if (this.f51698m == 1 && this.f51686a != null && this.f51687b != null && this.f51689d != null && this.f51693h != null && this.f51694i != null) {
                return new p136n5.C6938b(this.f51686a, this.f51687b, this.f51688c, this.f51689d, this.f51690e, this.f51691f, this.f51692g, this.f51693h, this.f51694i, this.f51695j, this.f51696k, this.f51697l);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.f51686a == null) {
                sb.append(" sdkVersion");
            }
            if (this.f51687b == null) {
                sb.append(" gmpAppId");
            }
            if ((1 & this.f51698m) == 0) {
                sb.append(" platform");
            }
            if (this.f51689d == null) {
                sb.append(" installationUuid");
            }
            if (this.f51693h == null) {
                sb.append(" buildVersion");
            }
            if (this.f51694i == null) {
                sb.append(" displayVersion");
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
        }

        @Override // n5.F.b
        public n5.F.b b(n5.F.a aVar) {
            this.f51697l = aVar;
            return this;
        }

        @Override // n5.F.b
        public n5.F.b c(java.lang.String str) {
            this.f51692g = str;
            return this;
        }

        @Override // n5.F.b
        public n5.F.b d(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null buildVersion");
            }
            this.f51693h = str;
            return this;
        }

        @Override // n5.F.b
        public n5.F.b e(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null displayVersion");
            }
            this.f51694i = str;
            return this;
        }

        @Override // n5.F.b
        public n5.F.b f(java.lang.String str) {
            this.f51691f = str;
            return this;
        }

        @Override // n5.F.b
        public n5.F.b g(java.lang.String str) {
            this.f51690e = str;
            return this;
        }

        @Override // n5.F.b
        public n5.F.b h(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null gmpAppId");
            }
            this.f51687b = str;
            return this;
        }

        @Override // n5.F.b
        public n5.F.b i(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null installationUuid");
            }
            this.f51689d = str;
            return this;
        }

        @Override // n5.F.b
        public n5.F.b j(n5.F.d dVar) {
            this.f51696k = dVar;
            return this;
        }

        @Override // n5.F.b
        public n5.F.b k(int i6) {
            this.f51688c = i6;
            this.f51698m = (byte) (this.f51698m | 1);
            return this;
        }

        @Override // n5.F.b
        public n5.F.b l(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null sdkVersion");
            }
            this.f51686a = str;
            return this;
        }

        @Override // n5.F.b
        public n5.F.b m(n5.F.e eVar) {
            this.f51695j = eVar;
            return this;
        }
    }

    private C6938b(java.lang.String str, java.lang.String str2, int i6, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, n5.F.e eVar, n5.F.d dVar, n5.F.a aVar) {
        this.f51674b = str;
        this.f51675c = str2;
        this.f51676d = i6;
        this.f51677e = str3;
        this.f51678f = str4;
        this.f51679g = str5;
        this.f51680h = str6;
        this.f51681i = str7;
        this.f51682j = str8;
        this.f51683k = eVar;
        this.f51684l = dVar;
        this.f51685m = aVar;
    }

    @Override // p136n5.F
    public n5.F.a c() {
        return this.f51685m;
    }

    @Override // p136n5.F
    public java.lang.String d() {
        return this.f51680h;
    }

    @Override // p136n5.F
    public java.lang.String e() {
        return this.f51681i;
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        n5.F.e eVar;
        n5.F.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p136n5.F)) {
            return false;
        }
        p136n5.F f6 = (p136n5.F) obj;
        if (this.f51674b.equals(f6.m()) && this.f51675c.equals(f6.i()) && this.f51676d == f6.l() && this.f51677e.equals(f6.j()) && ((str = this.f51678f) != null ? str.equals(f6.h()) : f6.h() == null) && ((str2 = this.f51679g) != null ? str2.equals(f6.g()) : f6.g() == null) && ((str3 = this.f51680h) != null ? str3.equals(f6.d()) : f6.d() == null) && this.f51681i.equals(f6.e()) && this.f51682j.equals(f6.f()) && ((eVar = this.f51683k) != null ? eVar.equals(f6.n()) : f6.n() == null) && ((dVar = this.f51684l) != null ? dVar.equals(f6.k()) : f6.k() == null)) {
            n5.F.a aVar = this.f51685m;
            n5.F.a aVarC = f6.c();
            if (aVar == null) {
                if (aVarC == null) {
                    return true;
                }
            } else if (aVar.equals(aVarC)) {
                return true;
            }
        }
        return false;
    }

    @Override // p136n5.F
    public java.lang.String f() {
        return this.f51682j;
    }

    @Override // p136n5.F
    public java.lang.String g() {
        return this.f51679g;
    }

    @Override // p136n5.F
    public java.lang.String h() {
        return this.f51678f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f51674b.hashCode() ^ 1000003) * 1000003) ^ this.f51675c.hashCode()) * 1000003) ^ this.f51676d) * 1000003) ^ this.f51677e.hashCode()) * 1000003;
        java.lang.String str = this.f51678f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        java.lang.String str2 = this.f51679g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        java.lang.String str3 = this.f51680h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f51681i.hashCode()) * 1000003) ^ this.f51682j.hashCode()) * 1000003;
        n5.F.e eVar = this.f51683k;
        int iHashCode5 = (iHashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        n5.F.d dVar = this.f51684l;
        int iHashCode6 = (iHashCode5 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        n5.F.a aVar = this.f51685m;
        return iHashCode6 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // p136n5.F
    public java.lang.String i() {
        return this.f51675c;
    }

    @Override // p136n5.F
    public java.lang.String j() {
        return this.f51677e;
    }

    @Override // p136n5.F
    public n5.F.d k() {
        return this.f51684l;
    }

    @Override // p136n5.F
    public int l() {
        return this.f51676d;
    }

    @Override // p136n5.F
    public java.lang.String m() {
        return this.f51674b;
    }

    @Override // p136n5.F
    public n5.F.e n() {
        return this.f51683k;
    }

    @Override // p136n5.F
    protected n5.F.b o() {
        return new p136n5.C6938b.C0669b(this);
    }

    public java.lang.String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f51674b + ", gmpAppId=" + this.f51675c + ", platform=" + this.f51676d + ", installationUuid=" + this.f51677e + ", firebaseInstallationId=" + this.f51678f + ", firebaseAuthenticationToken=" + this.f51679g + ", appQualitySessionId=" + this.f51680h + ", buildVersion=" + this.f51681i + ", displayVersion=" + this.f51682j + ", session=" + this.f51683k + ", ndkPayload=" + this.f51684l + ", appExitInfo=" + this.f51685m + "}";
    }
}
