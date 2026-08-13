package p143o2;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f52511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f52512b;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final o2.u.a f52513D = new o2.u.a();

        a() {
            super(1);
        }

        public final void a(p243y2.e eVar) {
            p247y7.AbstractC7350t.f(eVar, "it");
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p243y2.e) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.l f52514D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p237x7.l lVar) {
            super(1);
            this.f52514D = lVar;
        }

        public final void a(p243y2.e eVar) {
            p247y7.AbstractC7350t.f(eVar, "it");
            this.f52514D.l(new p143o2.C7022b(eVar));
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p243y2.e) obj);
            return p087i7.M.f46721a;
        }
    }

    public u(java.lang.String str, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(str, "sql");
        p247y7.AbstractC7350t.f(lVar, "onBindStatement");
        this.f52511a = str;
        this.f52512b = new o2.u.b(lVar);
    }

    public /* synthetic */ u(java.lang.String str, p237x7.l lVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(str, (i6 & 2) != 0 ? o2.u.a.f52513D : lVar);
    }

    public final p237x7.l a() {
        return this.f52512b;
    }

    public final java.lang.String b() {
        return this.f52511a;
    }
}
