package R0;

/* JADX INFO: loaded from: classes.dex */
public final class j implements R0.AbstractC1494h.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R0.w f9304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final R0.y f9305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final R0.G f9306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final R0.m f9307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final R0.v f9308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p237x7.l f9309f;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {
        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object l(R0.F f6) {
            return R0.j.this.g(R0.F.b(f6, null, null, 0, 0, null, 30, null)).getValue();
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ R0.F f9312E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(R0.F f6) {
            super(1);
            this.f9312E = f6;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.H l(p237x7.l lVar) {
            R0.H hA = R0.j.this.f9307d.a(this.f9312E, R0.j.this.f(), lVar, R0.j.this.f9309f);
            if (hA == null && (hA = R0.j.this.f9308e.a(this.f9312E, R0.j.this.f(), lVar, R0.j.this.f9309f)) == null) {
                throw new java.lang.IllegalStateException("Could not load font");
            }
            return hA;
        }
    }

    public j(R0.w wVar, R0.y yVar, R0.G g6, R0.m mVar, R0.v vVar) {
        this.f9304a = wVar;
        this.f9305b = yVar;
        this.f9306c = g6;
        this.f9307d = mVar;
        this.f9308e = vVar;
        this.f9309f = new R0.j.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j(R0.w wVar, R0.y yVar, R0.G g6, R0.m mVar, R0.v vVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(wVar, (i6 & 2) != 0 ? R0.y.f9357a.a() : yVar, (i6 & 4) != 0 ? R0.k.b() : g6, (i6 & 8) != 0 ? new R0.m(R0.k.a(), null, 2, 0 == true ? 1 : 0) : mVar, (i6 & 16) != 0 ? new R0.v() : vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V.G1 g(R0.F f6) {
        return this.f9306c.c(f6, new R0.j.b(f6));
    }

    @Override // R0.AbstractC1494h.b
    public V.G1 a(R0.AbstractC1494h abstractC1494h, R0.q qVar, int i6, int i10) {
        return g(new R0.F(this.f9305b.a(abstractC1494h), this.f9305b.c(qVar), this.f9305b.b(i6), this.f9305b.d(i10), this.f9304a.a(), null));
    }

    public final R0.w f() {
        return this.f9304a;
    }
}
