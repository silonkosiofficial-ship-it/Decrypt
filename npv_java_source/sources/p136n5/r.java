package p136n5;

/* JADX INFO: loaded from: classes3.dex */
final class r extends n5.F.e.d.a.b.AbstractC0660e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f51857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f51858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f51859c;

    static final class b extends n5.F.e.d.a.b.AbstractC0660e.AbstractC0661a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f51860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f51861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.util.List f51862c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f51863d;

        b() {
        }

        @Override // n5.F.e.d.a.b.AbstractC0660e.AbstractC0661a
        public n5.F.e.d.a.b.AbstractC0660e a() {
            java.lang.String str;
            java.util.List list;
            if (this.f51863d == 1 && (str = this.f51860a) != null && (list = this.f51862c) != null) {
                return new p136n5.r(str, this.f51861b, list);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.f51860a == null) {
                sb.append(" name");
            }
            if ((1 & this.f51863d) == 0) {
                sb.append(" importance");
            }
            if (this.f51862c == null) {
                sb.append(" frames");
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + ((java.lang.Object) sb));
        }

        @Override // n5.F.e.d.a.b.AbstractC0660e.AbstractC0661a
        public n5.F.e.d.a.b.AbstractC0660e.AbstractC0661a b(java.util.List list) {
            if (list == null) {
                throw new java.lang.NullPointerException("Null frames");
            }
            this.f51862c = list;
            return this;
        }

        @Override // n5.F.e.d.a.b.AbstractC0660e.AbstractC0661a
        public n5.F.e.d.a.b.AbstractC0660e.AbstractC0661a c(int i6) {
            this.f51861b = i6;
            this.f51863d = (byte) (this.f51863d | 1);
            return this;
        }

        @Override // n5.F.e.d.a.b.AbstractC0660e.AbstractC0661a
        public n5.F.e.d.a.b.AbstractC0660e.AbstractC0661a d(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null name");
            }
            this.f51860a = str;
            return this;
        }
    }

    private r(java.lang.String str, int i6, java.util.List list) {
        this.f51857a = str;
        this.f51858b = i6;
        this.f51859c = list;
    }

    @Override // n5.F.e.d.a.b.AbstractC0660e
    public java.util.List b() {
        return this.f51859c;
    }

    @Override // n5.F.e.d.a.b.AbstractC0660e
    public int c() {
        return this.f51858b;
    }

    @Override // n5.F.e.d.a.b.AbstractC0660e
    public java.lang.String d() {
        return this.f51857a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5.F.e.d.a.b.AbstractC0660e)) {
            return false;
        }
        n5.F.e.d.a.b.AbstractC0660e abstractC0660e = (n5.F.e.d.a.b.AbstractC0660e) obj;
        return this.f51857a.equals(abstractC0660e.d()) && this.f51858b == abstractC0660e.c() && this.f51859c.equals(abstractC0660e.b());
    }

    public int hashCode() {
        return ((((this.f51857a.hashCode() ^ 1000003) * 1000003) ^ this.f51858b) * 1000003) ^ this.f51859c.hashCode();
    }

    public java.lang.String toString() {
        return "Thread{name=" + this.f51857a + ", importance=" + this.f51858b + ", frames=" + this.f51859c + "}";
    }
}
