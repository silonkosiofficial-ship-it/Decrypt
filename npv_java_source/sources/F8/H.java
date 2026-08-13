package F8;

/* JADX INFO: loaded from: classes2.dex */
public final class H extends F8.v0 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final E8.n f2842D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p237x7.a f2843E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final E8.i f2844F;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ G8.g f2845D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ F8.H f2846E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(G8.g gVar, F8.H h6) {
            super(0);
            this.f2845D = gVar;
            this.f2846E = h6;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.E b() {
            return this.f2845D.a((J8.i) this.f2846E.f2843E.b());
        }
    }

    public H(E8.n nVar, p237x7.a aVar) {
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(aVar, "computation");
        this.f2842D = nVar;
        this.f2843E = aVar;
        this.f2844F = nVar.d(aVar);
    }

    @Override // F8.v0
    protected F8.E a1() {
        return (F8.E) this.f2844F.b();
    }

    @Override // F8.v0
    public boolean b1() {
        return this.f2844F.h();
    }

    @Override // F8.E
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public F8.H g1(G8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        return new F8.H(this.f2842D, new F8.H.a(gVar, this));
    }
}
