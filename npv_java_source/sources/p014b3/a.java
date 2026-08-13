package p014b3;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p014b3.a f24133e = new p014b3.a.C0459a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p014b3.f f24134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f24135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p014b3.b f24136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f24137d;

    /* JADX INFO: renamed from: b3.a$a, reason: collision with other inner class name */
    public static final class C0459a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p014b3.f f24138a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.util.List f24139b = new java.util.ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p014b3.b f24140c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private java.lang.String f24141d = "";

        C0459a() {
        }

        public p014b3.a.C0459a a(p014b3.d dVar) {
            this.f24139b.add(dVar);
            return this;
        }

        public p014b3.a b() {
            return new p014b3.a(this.f24138a, j$.util.DesugarCollections.unmodifiableList(this.f24139b), this.f24140c, this.f24141d);
        }

        public p014b3.a.C0459a c(java.lang.String str) {
            this.f24141d = str;
            return this;
        }

        public p014b3.a.C0459a d(p014b3.b bVar) {
            this.f24140c = bVar;
            return this;
        }

        public p014b3.a.C0459a e(p014b3.f fVar) {
            this.f24138a = fVar;
            return this;
        }
    }

    a(p014b3.f fVar, java.util.List list, p014b3.b bVar, java.lang.String str) {
        this.f24134a = fVar;
        this.f24135b = list;
        this.f24136c = bVar;
        this.f24137d = str;
    }

    public static p014b3.a.C0459a e() {
        return new p014b3.a.C0459a();
    }

    public java.lang.String a() {
        return this.f24137d;
    }

    public p014b3.b b() {
        return this.f24136c;
    }

    public java.util.List c() {
        return this.f24135b;
    }

    public p014b3.f d() {
        return this.f24134a;
    }

    public byte[] f() {
        return Y2.m.a(this);
    }
}
