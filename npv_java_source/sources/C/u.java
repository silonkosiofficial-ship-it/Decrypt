package C;

/* JADX INFO: loaded from: classes.dex */
public final class u implements C.s, D0.K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C.x f1153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f1156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f1157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final W8.N f1158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Y0.e f1159g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f1160h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p237x7.l f1161i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final java.util.List f1162j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f1163k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f1164l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f1165m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f1166n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p230x.s f1167o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f1168p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f1169q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ D0.K f1170r;

    public u(C.x xVar, int i6, boolean z6, float f6, D0.K k6, boolean z10, W8.N n6, Y0.e eVar, int i10, p237x7.l lVar, java.util.List list, int i11, int i12, int i13, boolean z11, p230x.s sVar, int i14, int i15) {
        this.f1153a = xVar;
        this.f1154b = i6;
        this.f1155c = z6;
        this.f1156d = f6;
        this.f1157e = z10;
        this.f1158f = n6;
        this.f1159g = eVar;
        this.f1160h = i10;
        this.f1161i = lVar;
        this.f1162j = list;
        this.f1163k = i11;
        this.f1164l = i12;
        this.f1165m = i13;
        this.f1166n = z11;
        this.f1167o = sVar;
        this.f1168p = i14;
        this.f1169q = i15;
        this.f1170r = k6;
    }

    @Override // C.s
    public long a() {
        return Y0.u.a(getWidth(), getHeight());
    }

    @Override // C.s
    public int b() {
        return this.f1168p;
    }

    @Override // C.s
    public int c() {
        return this.f1164l;
    }

    @Override // C.s
    public int d() {
        return this.f1165m;
    }

    @Override // C.s
    public p230x.s e() {
        return this.f1167o;
    }

    @Override // D0.K
    public java.util.Map f() {
        return this.f1170r.f();
    }

    @Override // C.s
    public int g() {
        return -i();
    }

    @Override // D0.K
    public int getHeight() {
        return this.f1170r.getHeight();
    }

    @Override // D0.K
    public int getWidth() {
        return this.f1170r.getWidth();
    }

    @Override // C.s
    public int h() {
        return this.f1169q;
    }

    @Override // C.s
    public int i() {
        return this.f1163k;
    }

    @Override // C.s
    public java.util.List j() {
        return this.f1162j;
    }

    @Override // D0.K
    public void k() {
        this.f1170r.k();
    }

    @Override // D0.K
    public p237x7.l l() {
        return this.f1170r.l();
    }

    public final boolean m() {
        C.x xVar = this.f1153a;
        return ((xVar != null ? xVar.a() : 0) == 0 && this.f1154b == 0) ? false : true;
    }

    public final boolean n() {
        return this.f1155c;
    }

    public final float o() {
        return this.f1156d;
    }

    public final C.x p() {
        return this.f1153a;
    }

    public final int q() {
        return this.f1154b;
    }

    public final p237x7.l r() {
        return this.f1161i;
    }

    public final int s() {
        return this.f1160h;
    }

    public final boolean t(int i6) {
        C.x xVar;
        boolean z6 = false;
        z6 = false;
        z6 = false;
        z6 = false;
        z6 = false;
        z6 = false;
        z6 = false;
        z6 = false;
        z6 = false;
        if (!this.f1157e && !j().isEmpty() && (xVar = this.f1153a) != null) {
            int iD = xVar.d();
            int i10 = this.f1154b - i6;
            if (i10 >= 0 && i10 < iD) {
                C.v vVar = (C.v) p097j7.AbstractC6879v.i0(j());
                C.v vVar2 = (C.v) p097j7.AbstractC6879v.t0(j());
                if (!vVar.s() && !vVar2.s() && (i6 >= 0 ? java.lang.Math.min(i() - p240y.e.a(vVar, e()), c() - p240y.e.a(vVar2, e())) > i6 : java.lang.Math.min((p240y.e.a(vVar, e()) + vVar.e()) - i(), (p240y.e.a(vVar2, e()) + vVar2.e()) - c()) > (-i6))) {
                    this.f1154b -= i6;
                    java.util.List listJ = j();
                    int size = listJ.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ((C.v) listJ.get(i11)).o(i6);
                    }
                    this.f1156d = i6;
                    z6 = true;
                    z6 = true;
                    z6 = true;
                    if (!this.f1155c && i6 > 0) {
                        this.f1155c = true;
                    }
                }
            }
        }
        return z6;
    }
}
