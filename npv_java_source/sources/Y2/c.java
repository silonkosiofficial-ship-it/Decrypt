package Y2;

/* JADX INFO: loaded from: classes.dex */
final class c extends Y2.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y2.p f16293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f16294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W2.c f16295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final W2.g f16296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final W2.b f16297e;

    static final class b extends Y2.o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Y2.p f16298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.String f16299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private W2.c f16300c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private W2.g f16301d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private W2.b f16302e;

        b() {
        }

        @Override // Y2.o.a
        public Y2.o a() {
            java.lang.String str = "";
            if (this.f16298a == null) {
                str = " transportContext";
            }
            if (this.f16299b == null) {
                str = str + " transportName";
            }
            if (this.f16300c == null) {
                str = str + " event";
            }
            if (this.f16301d == null) {
                str = str + " transformer";
            }
            if (this.f16302e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new Y2.c(this.f16298a, this.f16299b, this.f16300c, this.f16301d, this.f16302e);
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + str);
        }

        @Override // Y2.o.a
        Y2.o.a b(W2.b bVar) {
            if (bVar == null) {
                throw new java.lang.NullPointerException("Null encoding");
            }
            this.f16302e = bVar;
            return this;
        }

        @Override // Y2.o.a
        Y2.o.a c(W2.c cVar) {
            if (cVar == null) {
                throw new java.lang.NullPointerException("Null event");
            }
            this.f16300c = cVar;
            return this;
        }

        @Override // Y2.o.a
        Y2.o.a d(W2.g gVar) {
            if (gVar == null) {
                throw new java.lang.NullPointerException("Null transformer");
            }
            this.f16301d = gVar;
            return this;
        }

        @Override // Y2.o.a
        public Y2.o.a e(Y2.p pVar) {
            if (pVar == null) {
                throw new java.lang.NullPointerException("Null transportContext");
            }
            this.f16298a = pVar;
            return this;
        }

        @Override // Y2.o.a
        public Y2.o.a f(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("Null transportName");
            }
            this.f16299b = str;
            return this;
        }
    }

    private c(Y2.p pVar, java.lang.String str, W2.c cVar, W2.g gVar, W2.b bVar) {
        this.f16293a = pVar;
        this.f16294b = str;
        this.f16295c = cVar;
        this.f16296d = gVar;
        this.f16297e = bVar;
    }

    @Override // Y2.o
    public W2.b b() {
        return this.f16297e;
    }

    @Override // Y2.o
    W2.c c() {
        return this.f16295c;
    }

    @Override // Y2.o
    W2.g e() {
        return this.f16296d;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Y2.o)) {
            return false;
        }
        Y2.o oVar = (Y2.o) obj;
        return this.f16293a.equals(oVar.f()) && this.f16294b.equals(oVar.g()) && this.f16295c.equals(oVar.c()) && this.f16296d.equals(oVar.e()) && this.f16297e.equals(oVar.b());
    }

    @Override // Y2.o
    public Y2.p f() {
        return this.f16293a;
    }

    @Override // Y2.o
    public java.lang.String g() {
        return this.f16294b;
    }

    public int hashCode() {
        return ((((((((this.f16293a.hashCode() ^ 1000003) * 1000003) ^ this.f16294b.hashCode()) * 1000003) ^ this.f16295c.hashCode()) * 1000003) ^ this.f16296d.hashCode()) * 1000003) ^ this.f16297e.hashCode();
    }

    public java.lang.String toString() {
        return "SendRequest{transportContext=" + this.f16293a + ", transportName=" + this.f16294b + ", event=" + this.f16295c + ", transformer=" + this.f16296d + ", encoding=" + this.f16297e + "}";
    }
}
