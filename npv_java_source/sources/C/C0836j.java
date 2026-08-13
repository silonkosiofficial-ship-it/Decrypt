package C;

/* JADX INFO: renamed from: C.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0836j extends D.AbstractC0878o implements C.E {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C.C0836j.b f1091d = new C.C0836j.b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f1092e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p237x7.p f1093f = C.C0836j.a.f1097D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C.J f1094a = new C.J(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D.I f1095b = new D.I();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1096c;

    /* JADX INFO: renamed from: C.j$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final C.C0836j.a f1097D = new C.C0836j.a();

        a() {
            super(2);
        }

        public final long a(C.q qVar, int i6) {
            return C.I.a(1);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            return C.C0829c.a(a((C.q) obj, ((java.lang.Number) obj2).intValue()));
        }
    }

    /* JADX INFO: renamed from: C.j$b */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public C0836j(p237x7.l lVar) {
        lVar.l(this);
    }

    @Override // C.E
    public void a(int i6, p237x7.l lVar, p237x7.p pVar, p237x7.l lVar2, p237x7.r rVar) {
        f().c(i6, new C.C0835i(lVar, pVar == null ? f1093f : pVar, lVar2, rVar));
        if (pVar != null) {
            this.f1096c = true;
        }
    }

    public final boolean i() {
        return this.f1096c;
    }

    @Override // D.AbstractC0878o
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public D.I f() {
        return this.f1095b;
    }

    public final C.J k() {
        return this.f1094a;
    }
}
