package P7;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements P7.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L7.g f8389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p138n8.c f8390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f8391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f8392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f8393e;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.M b() {
            return P7.j.this.f8389a.o(P7.j.this.e()).w();
        }
    }

    public j(L7.g gVar, p138n8.c cVar, java.util.Map map, boolean z6) {
        p247y7.AbstractC7350t.f(gVar, "builtIns");
        p247y7.AbstractC7350t.f(cVar, "fqName");
        p247y7.AbstractC7350t.f(map, "allValueArguments");
        this.f8389a = gVar;
        this.f8390b = cVar;
        this.f8391c = map;
        this.f8392d = z6;
        this.f8393e = p087i7.AbstractC6669o.a(p087i7.r.PUBLICATION, new P7.j.a());
    }

    public /* synthetic */ j(L7.g gVar, p138n8.c cVar, java.util.Map map, boolean z6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(gVar, cVar, map, (i6 & 8) != 0 ? false : z6);
    }

    @Override // P7.c
    public java.util.Map a() {
        return this.f8391c;
    }

    @Override // P7.c
    public p138n8.c e() {
        return this.f8390b;
    }

    @Override // P7.c
    public F8.E getType() {
        java.lang.Object value = this.f8393e.getValue();
        p247y7.AbstractC7350t.e(value, "getValue(...)");
        return (F8.E) value;
    }

    @Override // P7.c
    public O7.a0 o() {
        O7.a0 a0Var = O7.a0.f8143a;
        p247y7.AbstractC7350t.e(a0Var, "NO_SOURCE");
        return a0Var;
    }
}
