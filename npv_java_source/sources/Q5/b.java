package Q5;

/* JADX INFO: loaded from: classes3.dex */
final class b extends Q5.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f9065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f9066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f9067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f9068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f9069f;

    /* JADX INFO: renamed from: Q5.b$b, reason: collision with other inner class name */
    static final class C0208b extends Q5.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f9070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f9071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.String f9072c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private java.lang.String f9073d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f9074e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f9075f;

        C0208b() {
        }

        @Override // Q5.d.a
        public Q5.d a() {
            if (this.f9075f == 1 && this.f9070a != null && this.f9071b != null && this.f9072c != null && this.f9073d != null) {
                return new Q5.b(this.f9070a, this.f9071b, this.f9072c, this.f9073d, this.f9074e);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.f9070a == null) {
                sb.append(" rolloutId");
            }
            if (this.f9071b == null) {
                sb.append(" variantId");
            }
            if (this.f9072c == null) {
                sb.append(" parameterKey");
            }
            if (this.f9073d == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f9075f) == 0) {
                sb.append(" templateVersion");
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
        }

        @Override // Q5.d.a
        public Q5.d.a b(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null parameterKey");
            }
            this.f9072c = str;
            return this;
        }

        @Override // Q5.d.a
        public Q5.d.a c(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null parameterValue");
            }
            this.f9073d = str;
            return this;
        }

        @Override // Q5.d.a
        public Q5.d.a d(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null rolloutId");
            }
            this.f9070a = str;
            return this;
        }

        @Override // Q5.d.a
        public Q5.d.a e(long j6) {
            this.f9074e = j6;
            this.f9075f = (byte) (this.f9075f | 1);
            return this;
        }

        @Override // Q5.d.a
        public Q5.d.a f(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null variantId");
            }
            this.f9071b = str;
            return this;
        }
    }

    private b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j6) {
        this.f9065b = str;
        this.f9066c = str2;
        this.f9067d = str3;
        this.f9068e = str4;
        this.f9069f = j6;
    }

    @Override // Q5.d
    public java.lang.String b() {
        return this.f9067d;
    }

    @Override // Q5.d
    public java.lang.String c() {
        return this.f9068e;
    }

    @Override // Q5.d
    public java.lang.String d() {
        return this.f9065b;
    }

    @Override // Q5.d
    public long e() {
        return this.f9069f;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Q5.d)) {
            return false;
        }
        Q5.d dVar = (Q5.d) obj;
        return this.f9065b.equals(dVar.d()) && this.f9066c.equals(dVar.f()) && this.f9067d.equals(dVar.b()) && this.f9068e.equals(dVar.c()) && this.f9069f == dVar.e();
    }

    @Override // Q5.d
    public java.lang.String f() {
        return this.f9066c;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f9065b.hashCode() ^ 1000003) * 1000003) ^ this.f9066c.hashCode()) * 1000003) ^ this.f9067d.hashCode()) * 1000003) ^ this.f9068e.hashCode()) * 1000003;
        long j6 = this.f9069f;
        return iHashCode ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public java.lang.String toString() {
        return "RolloutAssignment{rolloutId=" + this.f9065b + ", variantId=" + this.f9066c + ", parameterKey=" + this.f9067d + ", parameterValue=" + this.f9068e + ", templateVersion=" + this.f9069f + "}";
    }
}
