package N;

/* JADX INFO: loaded from: classes.dex */
final class D implements N.w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final N.D.a f7290f = new N.D.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f7291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final N.C1361k f7294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final N.C1360j f7295e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public D(boolean z6, int i6, int i10, N.C1361k c1361k, N.C1360j c1360j) {
        this.f7291a = z6;
        this.f7292b = i6;
        this.f7293c = i10;
        this.f7294d = c1361k;
        this.f7295e = c1360j;
    }

    @Override // N.w
    public int a() {
        return 1;
    }

    @Override // N.w
    public boolean b() {
        return this.f7291a;
    }

    @Override // N.w
    public N.C1360j c() {
        return this.f7295e;
    }

    @Override // N.w
    public N.C1361k d() {
        return this.f7294d;
    }

    @Override // N.w
    public N.C1360j e() {
        return this.f7295e;
    }

    @Override // N.w
    public boolean f(N.w wVar) {
        if (d() != null && wVar != null && (wVar instanceof N.D)) {
            N.D d6 = (N.D) wVar;
            if (l() == d6.l() && g() == d6.g() && b() == d6.b() && !this.f7295e.m(d6.f7295e)) {
                return false;
            }
        }
        return true;
    }

    @Override // N.w
    public int g() {
        return this.f7293c;
    }

    @Override // N.w
    public N.C1360j h() {
        return this.f7295e;
    }

    @Override // N.w
    public N.EnumC1355e i() {
        if (l() < g()) {
            return N.EnumC1355e.NOT_CROSSED;
        }
        return l() > g() ? N.EnumC1355e.CROSSED : this.f7295e.d();
    }

    @Override // N.w
    public void j(p237x7.l lVar) {
    }

    @Override // N.w
    public N.C1360j k() {
        return this.f7295e;
    }

    @Override // N.w
    public int l() {
        return this.f7292b;
    }

    public java.lang.String toString() {
        return "SingleSelectionLayout(isStartHandle=" + b() + ", crossed=" + i() + ", info=\n\t" + this.f7295e + ')';
    }
}
