package p136n5;

/* JADX INFO: loaded from: classes3.dex */
final class m extends n5.F.e.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n5.F.e.d.a.b f51805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f51806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f51807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Boolean f51808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n5.F.e.d.a.c f51809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.List f51810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f51811g;

    static final class b extends n5.F.e.d.a.AbstractC0653a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private n5.F.e.d.a.b f51812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.util.List f51813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.util.List f51814c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private java.lang.Boolean f51815d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private n5.F.e.d.a.c f51816e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private java.util.List f51817f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f51818g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private byte f51819h;

        b() {
        }

        private b(n5.F.e.d.a aVar) {
            this.f51812a = aVar.f();
            this.f51813b = aVar.e();
            this.f51814c = aVar.g();
            this.f51815d = aVar.c();
            this.f51816e = aVar.d();
            this.f51817f = aVar.b();
            this.f51818g = aVar.h();
            this.f51819h = (byte) 1;
        }

        @Override // n5.F.e.d.a.AbstractC0653a
        public n5.F.e.d.a a() {
            n5.F.e.d.a.b bVar;
            if (this.f51819h == 1 && (bVar = this.f51812a) != null) {
                return new p136n5.m(bVar, this.f51813b, this.f51814c, this.f51815d, this.f51816e, this.f51817f, this.f51818g);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.f51812a == null) {
                sb.append(" execution");
            }
            if ((1 & this.f51819h) == 0) {
                sb.append(" uiOrientation");
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
        }

        @Override // n5.F.e.d.a.AbstractC0653a
        public n5.F.e.d.a.AbstractC0653a b(java.util.List list) {
            this.f51817f = list;
            return this;
        }

        @Override // n5.F.e.d.a.AbstractC0653a
        public n5.F.e.d.a.AbstractC0653a c(java.lang.Boolean bool) {
            this.f51815d = bool;
            return this;
        }

        @Override // n5.F.e.d.a.AbstractC0653a
        public n5.F.e.d.a.AbstractC0653a d(n5.F.e.d.a.c cVar) {
            this.f51816e = cVar;
            return this;
        }

        @Override // n5.F.e.d.a.AbstractC0653a
        public n5.F.e.d.a.AbstractC0653a e(java.util.List list) {
            this.f51813b = list;
            return this;
        }

        @Override // n5.F.e.d.a.AbstractC0653a
        public n5.F.e.d.a.AbstractC0653a f(n5.F.e.d.a.b bVar) {
            if (bVar == null) {
                throw new java.lang.NullPointerException("Null execution");
            }
            this.f51812a = bVar;
            return this;
        }

        @Override // n5.F.e.d.a.AbstractC0653a
        public n5.F.e.d.a.AbstractC0653a g(java.util.List list) {
            this.f51814c = list;
            return this;
        }

        @Override // n5.F.e.d.a.AbstractC0653a
        public n5.F.e.d.a.AbstractC0653a h(int i6) {
            this.f51818g = i6;
            this.f51819h = (byte) (this.f51819h | 1);
            return this;
        }
    }

    private m(n5.F.e.d.a.b bVar, java.util.List list, java.util.List list2, java.lang.Boolean bool, n5.F.e.d.a.c cVar, java.util.List list3, int i6) {
        this.f51805a = bVar;
        this.f51806b = list;
        this.f51807c = list2;
        this.f51808d = bool;
        this.f51809e = cVar;
        this.f51810f = list3;
        this.f51811g = i6;
    }

    @Override // n5.F.e.d.a
    public java.util.List b() {
        return this.f51810f;
    }

    @Override // n5.F.e.d.a
    public java.lang.Boolean c() {
        return this.f51808d;
    }

    @Override // n5.F.e.d.a
    public n5.F.e.d.a.c d() {
        return this.f51809e;
    }

    @Override // n5.F.e.d.a
    public java.util.List e() {
        return this.f51806b;
    }

    public boolean equals(java.lang.Object obj) {
        java.util.List list;
        java.util.List list2;
        java.lang.Boolean bool;
        n5.F.e.d.a.c cVar;
        java.util.List list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5.F.e.d.a)) {
            return false;
        }
        n5.F.e.d.a aVar = (n5.F.e.d.a) obj;
        return this.f51805a.equals(aVar.f()) && ((list = this.f51806b) != null ? list.equals(aVar.e()) : aVar.e() == null) && ((list2 = this.f51807c) != null ? list2.equals(aVar.g()) : aVar.g() == null) && ((bool = this.f51808d) != null ? bool.equals(aVar.c()) : aVar.c() == null) && ((cVar = this.f51809e) != null ? cVar.equals(aVar.d()) : aVar.d() == null) && ((list3 = this.f51810f) != null ? list3.equals(aVar.b()) : aVar.b() == null) && this.f51811g == aVar.h();
    }

    @Override // n5.F.e.d.a
    public n5.F.e.d.a.b f() {
        return this.f51805a;
    }

    @Override // n5.F.e.d.a
    public java.util.List g() {
        return this.f51807c;
    }

    @Override // n5.F.e.d.a
    public int h() {
        return this.f51811g;
    }

    public int hashCode() {
        int iHashCode = (this.f51805a.hashCode() ^ 1000003) * 1000003;
        java.util.List list = this.f51806b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        java.util.List list2 = this.f51807c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        java.lang.Boolean bool = this.f51808d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        n5.F.e.d.a.c cVar = this.f51809e;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        java.util.List list3 = this.f51810f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f51811g;
    }

    @Override // n5.F.e.d.a
    public n5.F.e.d.a.AbstractC0653a i() {
        return new n5.m.b(this);
    }

    public java.lang.String toString() {
        return "Application{execution=" + this.f51805a + ", customAttributes=" + this.f51806b + ", internalKeys=" + this.f51807c + ", background=" + this.f51808d + ", currentProcessDetails=" + this.f51809e + ", appProcessDetails=" + this.f51810f + ", uiOrientation=" + this.f51811g + "}";
    }
}
