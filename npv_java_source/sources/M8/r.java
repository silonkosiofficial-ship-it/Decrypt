package M8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r implements M8.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f7164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f7165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f7166c;

    public static final class a extends M8.r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final M8.r.a f7167d = new M8.r.a();

        /* JADX INFO: renamed from: M8.r$a$a, reason: collision with other inner class name */
        static final class C0172a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final M8.r.a.C0172a f7168D = new M8.r.a.C0172a();

            C0172a() {
                super(1);
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final F8.E l(L7.g gVar) {
                p247y7.AbstractC7350t.f(gVar, "$this$null");
                F8.M mN = gVar.n();
                p247y7.AbstractC7350t.e(mN, "getBooleanType(...)");
                return mN;
            }
        }

        private a() {
            super("Boolean", M8.r.a.C0172a.f7168D, null);
        }
    }

    public static final class b extends M8.r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final M8.r.b f7169d = new M8.r.b();

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final M8.r.b.a f7170D = new M8.r.b.a();

            a() {
                super(1);
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final F8.E l(L7.g gVar) {
                p247y7.AbstractC7350t.f(gVar, "$this$null");
                F8.M mD = gVar.D();
                p247y7.AbstractC7350t.e(mD, "getIntType(...)");
                return mD;
            }
        }

        private b() {
            super("Int", M8.r.b.a.f7170D, null);
        }
    }

    public static final class c extends M8.r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final M8.r.c f7171d = new M8.r.c();

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final M8.r.c.a f7172D = new M8.r.c.a();

            a() {
                super(1);
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final F8.E l(L7.g gVar) {
                p247y7.AbstractC7350t.f(gVar, "$this$null");
                F8.M mZ = gVar.Z();
                p247y7.AbstractC7350t.e(mZ, "getUnitType(...)");
                return mZ;
            }
        }

        private c() {
            super("Unit", M8.r.c.a.f7172D, null);
        }
    }

    private r(java.lang.String str, p237x7.l lVar) {
        this.f7164a = str;
        this.f7165b = lVar;
        this.f7166c = "must return " + str;
    }

    public /* synthetic */ r(java.lang.String str, p237x7.l lVar, p247y7.AbstractC7342k abstractC7342k) {
        this(str, lVar);
    }

    @Override // M8.f
    public boolean a(O7.InterfaceC1443y interfaceC1443y) {
        p247y7.AbstractC7350t.f(interfaceC1443y, "functionDescriptor");
        return p247y7.AbstractC7350t.b(interfaceC1443y.l(), this.f7165b.l(p218v8.c.j(interfaceC1443y)));
    }

    @Override // M8.f
    public java.lang.String b(O7.InterfaceC1443y interfaceC1443y) {
        return M8.f.a.a(this, interfaceC1443y);
    }

    @Override // M8.f
    public java.lang.String getDescription() {
        return this.f7166c;
    }
}
