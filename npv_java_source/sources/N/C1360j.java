package N;

/* JADX INFO: renamed from: N.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1360j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f7427g = M0.K.f6654g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f7428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f7432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final M0.K f7433f;

    public C1360j(long j6, int i6, int i10, int i11, int i12, M0.K k6) {
        this.f7428a = j6;
        this.f7429b = i6;
        this.f7430c = i10;
        this.f7431d = i11;
        this.f7432e = i12;
        this.f7433f = k6;
    }

    private final X0.i b() {
        return N.x.b(this.f7433f, this.f7431d);
    }

    private final X0.i j() {
        return N.x.b(this.f7433f, this.f7430c);
    }

    public final N.C1361k.a a(int i6) {
        return new N.C1361k.a(N.x.b(this.f7433f, i6), i6, this.f7428a);
    }

    public final java.lang.String c() {
        return this.f7433f.l().j().i();
    }

    public final N.EnumC1355e d() {
        int i6 = this.f7430c;
        int i10 = this.f7431d;
        if (i6 < i10) {
            return N.EnumC1355e.NOT_CROSSED;
        }
        return i6 > i10 ? N.EnumC1355e.CROSSED : N.EnumC1355e.COLLAPSED;
    }

    public final int e() {
        return this.f7431d;
    }

    public final int f() {
        return this.f7432e;
    }

    public final int g() {
        return this.f7430c;
    }

    public final long h() {
        return this.f7428a;
    }

    public final int i() {
        return this.f7429b;
    }

    public final M0.K k() {
        return this.f7433f;
    }

    public final int l() {
        return c().length();
    }

    public final boolean m(N.C1360j c1360j) {
        return (this.f7428a == c1360j.f7428a && this.f7430c == c1360j.f7430c && this.f7431d == c1360j.f7431d) ? false : true;
    }

    public java.lang.String toString() {
        return "SelectionInfo(id=" + this.f7428a + ", range=(" + this.f7430c + '-' + j() + ',' + this.f7431d + '-' + b() + "), prevOffset=" + this.f7432e + ')';
    }
}
