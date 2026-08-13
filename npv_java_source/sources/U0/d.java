package U0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements M0.InterfaceC1346s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f14411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M0.P f14412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f14413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f14414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final R0.AbstractC1494h.b f14415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Y0.e f14416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final U0.g f14417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.CharSequence f14418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final N0.M f14419i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private U0.s f14420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f14421k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f14422l;

    static final class a extends p247y7.AbstractC7352v implements p237x7.r {
        a() {
            super(4);
        }

        public final android.graphics.Typeface a(R0.AbstractC1494h abstractC1494h, R0.q qVar, int i6, int i10) {
            V.G1 g1A = U0.d.this.g().a(abstractC1494h, qVar, i6, i10);
            if (g1A instanceof R0.H.a) {
                java.lang.Object value = g1A.getValue();
                p247y7.AbstractC7350t.d(value, "null cannot be cast to non-null type android.graphics.Typeface");
                return (android.graphics.Typeface) value;
            }
            U0.s sVar = new U0.s(g1A, U0.d.this.f14420j);
            U0.d.this.f14420j = sVar;
            return sVar.a();
        }

        @Override // p237x7.r
        public /* bridge */ /* synthetic */ java.lang.Object o(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return a((R0.AbstractC1494h) obj, (R0.q) obj2, ((R0.o) obj3).i(), ((R0.p) obj4).k());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    public d(java.lang.String str, M0.P p6, java.util.List list, java.util.List list2, R0.AbstractC1494h.b bVar, Y0.e eVar) {
        this.f14411a = str;
        this.f14412b = p6;
        this.f14413c = list;
        this.f14414d = list2;
        this.f14415e = bVar;
        this.f14416f = eVar;
        U0.g gVar = new U0.g(1, eVar.getDensity());
        this.f14417g = gVar;
        this.f14421k = !U0.e.c(p6) ? false : ((java.lang.Boolean) U0.m.f14440a.a().getValue()).booleanValue();
        this.f14422l = U0.e.d(p6.B(), p6.u());
        U0.d.a aVar = new U0.d.a();
        V0.f.e(gVar, p6.E());
        M0.C cA = V0.f.a(gVar, p6.M(), aVar, eVar, !((java.util.Collection) list).isEmpty());
        if (cA != null) {
            int size = list.size() + 1;
            list = new java.util.ArrayList(size);
            int i6 = 0;
            while (i6 < size) {
                list.add(i6 == 0 ? new M0.C1332d.c(cA, 0, this.f14411a.length()) : (M0.C1332d.c) this.f14413c.get(i6 - 1));
                i6++;
            }
        }
        java.lang.CharSequence charSequenceA = U0.c.a(this.f14411a, this.f14417g.getTextSize(), this.f14412b, list, this.f14414d, this.f14416f, aVar, this.f14421k);
        this.f14418h = charSequenceA;
        this.f14419i = new N0.M(charSequenceA, this.f14417g, this.f14422l);
    }

    @Override // M0.InterfaceC1346s
    public float a() {
        return this.f14419i.c();
    }

    @Override // M0.InterfaceC1346s
    public float b() {
        return this.f14419i.b();
    }

    @Override // M0.InterfaceC1346s
    public boolean c() {
        U0.s sVar = this.f14420j;
        return (sVar != null ? sVar.b() : false) || (!this.f14421k && U0.e.c(this.f14412b) && ((java.lang.Boolean) U0.m.f14440a.a().getValue()).booleanValue());
    }

    public final java.lang.CharSequence f() {
        return this.f14418h;
    }

    public final R0.AbstractC1494h.b g() {
        return this.f14415e;
    }

    public final N0.M h() {
        return this.f14419i;
    }

    public final M0.P i() {
        return this.f14412b;
    }

    public final int j() {
        return this.f14422l;
    }

    public final U0.g k() {
        return this.f14417g;
    }
}
