package p136n5;

/* JADX INFO: loaded from: classes3.dex */
final class t extends n5.F.e.d.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f51875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f51876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f51877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f51878d;

    static final class b extends n5.F.e.d.a.c.AbstractC0664a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f51879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f51880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f51881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f51882d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f51883e;

        b() {
        }

        @Override // n5.F.e.d.a.c.AbstractC0664a
        public n5.F.e.d.a.c a() {
            java.lang.String str;
            if (this.f51883e == 7 && (str = this.f51879a) != null) {
                return new p136n5.t(str, this.f51880b, this.f51881c, this.f51882d);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.f51879a == null) {
                sb.append(" processName");
            }
            if ((this.f51883e & 1) == 0) {
                sb.append(" pid");
            }
            if ((this.f51883e & 2) == 0) {
                sb.append(" importance");
            }
            if ((this.f51883e & 4) == 0) {
                sb.append(" defaultProcess");
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
        }

        @Override // n5.F.e.d.a.c.AbstractC0664a
        public n5.F.e.d.a.c.AbstractC0664a b(boolean z6) {
            this.f51882d = z6;
            this.f51883e = (byte) (this.f51883e | 4);
            return this;
        }

        @Override // n5.F.e.d.a.c.AbstractC0664a
        public n5.F.e.d.a.c.AbstractC0664a c(int i6) {
            this.f51881c = i6;
            this.f51883e = (byte) (this.f51883e | 2);
            return this;
        }

        @Override // n5.F.e.d.a.c.AbstractC0664a
        public n5.F.e.d.a.c.AbstractC0664a d(int i6) {
            this.f51880b = i6;
            this.f51883e = (byte) (this.f51883e | 1);
            return this;
        }

        @Override // n5.F.e.d.a.c.AbstractC0664a
        public n5.F.e.d.a.c.AbstractC0664a e(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null processName");
            }
            this.f51879a = str;
            return this;
        }
    }

    private t(java.lang.String str, int i6, int i10, boolean z6) {
        this.f51875a = str;
        this.f51876b = i6;
        this.f51877c = i10;
        this.f51878d = z6;
    }

    @Override // n5.F.e.d.a.c
    public int b() {
        return this.f51877c;
    }

    @Override // n5.F.e.d.a.c
    public int c() {
        return this.f51876b;
    }

    @Override // n5.F.e.d.a.c
    public java.lang.String d() {
        return this.f51875a;
    }

    @Override // n5.F.e.d.a.c
    public boolean e() {
        return this.f51878d;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5.F.e.d.a.c)) {
            return false;
        }
        n5.F.e.d.a.c cVar = (n5.F.e.d.a.c) obj;
        return this.f51875a.equals(cVar.d()) && this.f51876b == cVar.c() && this.f51877c == cVar.b() && this.f51878d == cVar.e();
    }

    public int hashCode() {
        return ((((((this.f51875a.hashCode() ^ 1000003) * 1000003) ^ this.f51876b) * 1000003) ^ this.f51877c) * 1000003) ^ (this.f51878d ? 1231 : 1237);
    }

    public java.lang.String toString() {
        return "ProcessDetails{processName=" + this.f51875a + ", pid=" + this.f51876b + ", importance=" + this.f51877c + ", defaultProcess=" + this.f51878d + "}";
    }
}
