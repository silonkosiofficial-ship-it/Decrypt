package com.google.firebase.sessions;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.google.firebase.sessions.c.b f44227f = new com.google.firebase.sessions.c.b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S5.I f44228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.a f44229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f44230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f44231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private S5.y f44232e;

    /* synthetic */ class a extends p247y7.C7348q implements p237x7.a {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final com.google.firebase.sessions.c.a f44233L = new com.google.firebase.sessions.c.a();

        a() {
            super(0, java.util.UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final java.util.UUID b() {
            return java.util.UUID.randomUUID();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final com.google.firebase.sessions.c a() {
            java.lang.Object objJ = Q4.n.a(Q4.c.f9032a).j(com.google.firebase.sessions.c.class);
            p247y7.AbstractC7350t.e(objJ, "Firebase.app[SessionGenerator::class.java]");
            return (com.google.firebase.sessions.c) objJ;
        }
    }

    public c(S5.I i6, p237x7.a aVar) {
        p247y7.AbstractC7350t.f(i6, "timeProvider");
        p247y7.AbstractC7350t.f(aVar, "uuidGenerator");
        this.f44228a = i6;
        this.f44229b = aVar;
        this.f44230c = b();
        this.f44231d = -1;
    }

    public /* synthetic */ c(S5.I i6, p237x7.a aVar, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this(i6, (i10 & 2) != 0 ? com.google.firebase.sessions.c.a.f44233L : aVar);
    }

    private final java.lang.String b() {
        java.lang.String string = ((java.util.UUID) this.f44229b.b()).toString();
        p247y7.AbstractC7350t.e(string, "uuidGenerator().toString()");
        java.lang.String lowerCase = S8.r.R(string, "-", "", false, 4, null).toLowerCase(java.util.Locale.ROOT);
        p247y7.AbstractC7350t.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final S5.y a() {
        int i6 = this.f44231d + 1;
        this.f44231d = i6;
        this.f44232e = new S5.y(i6 == 0 ? this.f44230c : b(), this.f44230c, this.f44231d, this.f44228a.a());
        return c();
    }

    public final S5.y c() {
        S5.y yVar = this.f44232e;
        if (yVar != null) {
            return yVar;
        }
        p247y7.AbstractC7350t.p("currentSession");
        return null;
    }
}
