package p136n5;

/* JADX INFO: loaded from: classes3.dex */
final class p extends n5.F.e.d.a.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f51839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f51840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f51841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n5.F.e.d.a.b.c f51842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f51843e;

    static final class b extends n5.F.e.d.a.b.c.AbstractC0657a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f51844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f51845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.util.List f51846c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private n5.F.e.d.a.b.c f51847d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f51848e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f51849f;

        b() {
        }

        @Override // n5.F.e.d.a.b.c.AbstractC0657a
        public n5.F.e.d.a.b.c a() {
            java.lang.String str;
            java.util.List list;
            if (this.f51849f == 1 && (str = this.f51844a) != null && (list = this.f51846c) != null) {
                return new p136n5.p(str, this.f51845b, list, this.f51847d, this.f51848e);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.f51844a == null) {
                sb.append(" type");
            }
            if (this.f51846c == null) {
                sb.append(" frames");
            }
            if ((1 & this.f51849f) == 0) {
                sb.append(" overflowCount");
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
        }

        @Override // n5.F.e.d.a.b.c.AbstractC0657a
        public n5.F.e.d.a.b.c.AbstractC0657a b(n5.F.e.d.a.b.c cVar) {
            this.f51847d = cVar;
            return this;
        }

        @Override // n5.F.e.d.a.b.c.AbstractC0657a
        public n5.F.e.d.a.b.c.AbstractC0657a c(java.util.List list) {
            if (list == null) {
                throw new java.lang.NullPointerException("Null frames");
            }
            this.f51846c = list;
            return this;
        }

        @Override // n5.F.e.d.a.b.c.AbstractC0657a
        public n5.F.e.d.a.b.c.AbstractC0657a d(int i6) {
            this.f51848e = i6;
            this.f51849f = (byte) (this.f51849f | 1);
            return this;
        }

        @Override // n5.F.e.d.a.b.c.AbstractC0657a
        public n5.F.e.d.a.b.c.AbstractC0657a e(java.lang.String str) {
            this.f51845b = str;
            return this;
        }

        @Override // n5.F.e.d.a.b.c.AbstractC0657a
        public n5.F.e.d.a.b.c.AbstractC0657a f(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null type");
            }
            this.f51844a = str;
            return this;
        }
    }

    private p(java.lang.String str, java.lang.String str2, java.util.List list, n5.F.e.d.a.b.c cVar, int i6) {
        this.f51839a = str;
        this.f51840b = str2;
        this.f51841c = list;
        this.f51842d = cVar;
        this.f51843e = i6;
    }

    @Override // n5.F.e.d.a.b.c
    public n5.F.e.d.a.b.c b() {
        return this.f51842d;
    }

    @Override // n5.F.e.d.a.b.c
    public java.util.List c() {
        return this.f51841c;
    }

    @Override // n5.F.e.d.a.b.c
    public int d() {
        return this.f51843e;
    }

    @Override // n5.F.e.d.a.b.c
    public java.lang.String e() {
        return this.f51840b;
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        n5.F.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5.F.e.d.a.b.c)) {
            return false;
        }
        n5.F.e.d.a.b.c cVar2 = (n5.F.e.d.a.b.c) obj;
        return this.f51839a.equals(cVar2.f()) && ((str = this.f51840b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f51841c.equals(cVar2.c()) && ((cVar = this.f51842d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f51843e == cVar2.d();
    }

    @Override // n5.F.e.d.a.b.c
    public java.lang.String f() {
        return this.f51839a;
    }

    public int hashCode() {
        int iHashCode = (this.f51839a.hashCode() ^ 1000003) * 1000003;
        java.lang.String str = this.f51840b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f51841c.hashCode()) * 1000003;
        n5.F.e.d.a.b.c cVar = this.f51842d;
        return ((iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f51843e;
    }

    public java.lang.String toString() {
        return "Exception{type=" + this.f51839a + ", reason=" + this.f51840b + ", frames=" + this.f51841c + ", causedBy=" + this.f51842d + ", overflowCount=" + this.f51843e + "}";
    }
}
