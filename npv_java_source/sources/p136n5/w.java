package p136n5;

/* JADX INFO: loaded from: classes3.dex */
final class w extends n5.F.e.d.AbstractC0666e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n5.F.e.d.AbstractC0666e.b f51899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f51900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f51901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f51902d;

    static final class b extends n5.F.e.d.AbstractC0666e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private n5.F.e.d.AbstractC0666e.b f51903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f51904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.String f51905c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f51906d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f51907e;

        b() {
        }

        @Override // n5.F.e.d.AbstractC0666e.a
        public n5.F.e.d.AbstractC0666e a() {
            n5.F.e.d.AbstractC0666e.b bVar;
            java.lang.String str;
            java.lang.String str2;
            if (this.f51907e == 1 && (bVar = this.f51903a) != null && (str = this.f51904b) != null && (str2 = this.f51905c) != null) {
                return new p136n5.w(bVar, str, str2, this.f51906d);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.f51903a == null) {
                sb.append(" rolloutVariant");
            }
            if (this.f51904b == null) {
                sb.append(" parameterKey");
            }
            if (this.f51905c == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f51907e) == 0) {
                sb.append(" templateVersion");
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
        }

        @Override // n5.F.e.d.AbstractC0666e.a
        public n5.F.e.d.AbstractC0666e.a b(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null parameterKey");
            }
            this.f51904b = str;
            return this;
        }

        @Override // n5.F.e.d.AbstractC0666e.a
        public n5.F.e.d.AbstractC0666e.a c(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null parameterValue");
            }
            this.f51905c = str;
            return this;
        }

        @Override // n5.F.e.d.AbstractC0666e.a
        public n5.F.e.d.AbstractC0666e.a d(n5.F.e.d.AbstractC0666e.b bVar) {
            if (bVar == null) {
                throw new java.lang.NullPointerException("Null rolloutVariant");
            }
            this.f51903a = bVar;
            return this;
        }

        @Override // n5.F.e.d.AbstractC0666e.a
        public n5.F.e.d.AbstractC0666e.a e(long j6) {
            this.f51906d = j6;
            this.f51907e = (byte) (this.f51907e | 1);
            return this;
        }
    }

    private w(n5.F.e.d.AbstractC0666e.b bVar, java.lang.String str, java.lang.String str2, long j6) {
        this.f51899a = bVar;
        this.f51900b = str;
        this.f51901c = str2;
        this.f51902d = j6;
    }

    @Override // n5.F.e.d.AbstractC0666e
    public java.lang.String b() {
        return this.f51900b;
    }

    @Override // n5.F.e.d.AbstractC0666e
    public java.lang.String c() {
        return this.f51901c;
    }

    @Override // n5.F.e.d.AbstractC0666e
    public n5.F.e.d.AbstractC0666e.b d() {
        return this.f51899a;
    }

    @Override // n5.F.e.d.AbstractC0666e
    public long e() {
        return this.f51902d;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5.F.e.d.AbstractC0666e)) {
            return false;
        }
        n5.F.e.d.AbstractC0666e abstractC0666e = (n5.F.e.d.AbstractC0666e) obj;
        return this.f51899a.equals(abstractC0666e.d()) && this.f51900b.equals(abstractC0666e.b()) && this.f51901c.equals(abstractC0666e.c()) && this.f51902d == abstractC0666e.e();
    }

    public int hashCode() {
        int iHashCode = (((((this.f51899a.hashCode() ^ 1000003) * 1000003) ^ this.f51900b.hashCode()) * 1000003) ^ this.f51901c.hashCode()) * 1000003;
        long j6 = this.f51902d;
        return iHashCode ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public java.lang.String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f51899a + ", parameterKey=" + this.f51900b + ", parameterValue=" + this.f51901c + ", templateVersion=" + this.f51902d + "}";
    }
}
