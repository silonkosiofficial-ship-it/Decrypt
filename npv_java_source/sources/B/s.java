package B;

/* JADX INFO: loaded from: classes.dex */
public final class s implements B.q, D0.K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B.t f446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final W8.N f452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Y0.e f453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f454i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.List f455j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f456k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f457l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f458m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f459n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p230x.s f460o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f461p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f462q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ D0.K f463r;

    private s(B.t tVar, int i6, boolean z6, float f6, D0.K k6, float f10, boolean z10, W8.N n6, Y0.e eVar, long j6, java.util.List list, int i10, int i11, int i12, boolean z11, p230x.s sVar, int i13, int i14) {
        this.f446a = tVar;
        this.f447b = i6;
        this.f448c = z6;
        this.f449d = f6;
        this.f450e = f10;
        this.f451f = z10;
        this.f452g = n6;
        this.f453h = eVar;
        this.f454i = j6;
        this.f455j = list;
        this.f456k = i10;
        this.f457l = i11;
        this.f458m = i12;
        this.f459n = z11;
        this.f460o = sVar;
        this.f461p = i13;
        this.f462q = i14;
        this.f463r = k6;
    }

    public /* synthetic */ s(B.t tVar, int i6, boolean z6, float f6, D0.K k6, float f10, boolean z10, W8.N n6, Y0.e eVar, long j6, java.util.List list, int i10, int i11, int i12, boolean z11, p230x.s sVar, int i13, int i14, p247y7.AbstractC7342k abstractC7342k) {
        this(tVar, i6, z6, f6, k6, f10, z10, n6, eVar, j6, list, i10, i11, i12, z11, sVar, i13, i14);
    }

    @Override // B.q
    public long a() {
        return Y0.u.a(getWidth(), getHeight());
    }

    @Override // B.q
    public int b() {
        return this.f461p;
    }

    @Override // B.q
    public int c() {
        return this.f457l;
    }

    @Override // B.q
    public int d() {
        return this.f458m;
    }

    @Override // B.q
    public p230x.s e() {
        return this.f460o;
    }

    @Override // D0.K
    public java.util.Map f() {
        return this.f463r.f();
    }

    @Override // B.q
    public int g() {
        return -i();
    }

    @Override // D0.K
    public int getHeight() {
        return this.f463r.getHeight();
    }

    @Override // D0.K
    public int getWidth() {
        return this.f463r.getWidth();
    }

    @Override // B.q
    public int h() {
        return this.f462q;
    }

    @Override // B.q
    public int i() {
        return this.f456k;
    }

    @Override // B.q
    public java.util.List j() {
        return this.f455j;
    }

    @Override // D0.K
    public void k() {
        this.f463r.k();
    }

    @Override // D0.K
    public p237x7.l l() {
        return this.f463r.l();
    }

    public final boolean m() {
        B.t tVar = this.f446a;
        return ((tVar != null ? tVar.getIndex() : 0) == 0 && this.f447b == 0) ? false : true;
    }

    public final boolean n() {
        return this.f448c;
    }

    public final long o() {
        return this.f454i;
    }

    public final float p() {
        return this.f449d;
    }

    public final W8.N q() {
        return this.f452g;
    }

    public final Y0.e r() {
        return this.f453h;
    }

    public final B.t s() {
        return this.f446a;
    }

    public final int t() {
        return this.f447b;
    }

    public final float u() {
        return this.f450e;
    }

    public final boolean v(int i6, boolean z6) {
        B.t tVar;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (!this.f451f && !j().isEmpty() && (tVar = this.f446a) != null) {
            int iE = tVar.e();
            int i10 = this.f447b - i6;
            if (i10 >= 0 && i10 < iE) {
                B.t tVar2 = (B.t) p097j7.AbstractC6879v.i0(j());
                B.t tVar3 = (B.t) p097j7.AbstractC6879v.t0(j());
                if (!tVar2.q() && !tVar3.q() && (i6 >= 0 ? java.lang.Math.min(i() - tVar2.c(), c() - tVar3.c()) > i6 : java.lang.Math.min((tVar2.c() + tVar2.e()) - i(), (tVar3.c() + tVar3.e()) - c()) > (-i6))) {
                    this.f447b -= i6;
                    java.util.List listJ = j();
                    int size = listJ.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ((B.t) listJ.get(i11)).l(i6, z6);
                    }
                    this.f449d = i6;
                    z10 = true;
                    z10 = true;
                    z10 = true;
                    if (!this.f448c && i6 > 0) {
                        this.f448c = true;
                    }
                }
            }
        }
        return z10;
    }
}
