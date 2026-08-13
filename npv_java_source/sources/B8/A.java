package B8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p108k8.c f811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p108k8.g f812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O7.a0 f813c;

    public static final class a extends B8.A {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p088i8.c f814d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final B8.A.a f815e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final p138n8.b f816f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final p088i8.c.EnumC0572c f817g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f818h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p088i8.c cVar, p108k8.c cVar2, p108k8.g gVar, O7.a0 a0Var, B8.A.a aVar) {
            super(cVar2, gVar, a0Var, null);
            p247y7.AbstractC7350t.f(cVar, "classProto");
            p247y7.AbstractC7350t.f(cVar2, "nameResolver");
            p247y7.AbstractC7350t.f(gVar, "typeTable");
            this.f814d = cVar;
            this.f815e = aVar;
            this.f816f = B8.y.a(cVar2, cVar.F0());
            p088i8.c.EnumC0572c enumC0572c = (p088i8.c.EnumC0572c) p108k8.b.f49789f.d(cVar.E0());
            this.f817g = enumC0572c == null ? p088i8.c.EnumC0572c.CLASS : enumC0572c;
            java.lang.Boolean boolD = p108k8.b.f49790g.d(cVar.E0());
            p247y7.AbstractC7350t.e(boolD, "get(...)");
            this.f818h = boolD.booleanValue();
        }

        @Override // B8.A
        public p138n8.c a() {
            p138n8.c cVarB = this.f816f.b();
            p247y7.AbstractC7350t.e(cVarB, "asSingleFqName(...)");
            return cVarB;
        }

        public final p138n8.b e() {
            return this.f816f;
        }

        public final p088i8.c f() {
            return this.f814d;
        }

        public final p088i8.c.EnumC0572c g() {
            return this.f817g;
        }

        public final B8.A.a h() {
            return this.f815e;
        }

        public final boolean i() {
            return this.f818h;
        }
    }

    public static final class b extends B8.A {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p138n8.c f819d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p138n8.c cVar, p108k8.c cVar2, p108k8.g gVar, O7.a0 a0Var) {
            super(cVar2, gVar, a0Var, null);
            p247y7.AbstractC7350t.f(cVar, "fqName");
            p247y7.AbstractC7350t.f(cVar2, "nameResolver");
            p247y7.AbstractC7350t.f(gVar, "typeTable");
            this.f819d = cVar;
        }

        @Override // B8.A
        public p138n8.c a() {
            return this.f819d;
        }
    }

    private A(p108k8.c cVar, p108k8.g gVar, O7.a0 a0Var) {
        this.f811a = cVar;
        this.f812b = gVar;
        this.f813c = a0Var;
    }

    public /* synthetic */ A(p108k8.c cVar, p108k8.g gVar, O7.a0 a0Var, p247y7.AbstractC7342k abstractC7342k) {
        this(cVar, gVar, a0Var);
    }

    public abstract p138n8.c a();

    public final p108k8.c b() {
        return this.f811a;
    }

    public final O7.a0 c() {
        return this.f813c;
    }

    public final p108k8.g d() {
        return this.f812b;
    }

    public java.lang.String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
