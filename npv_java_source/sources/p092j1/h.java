package p092j1;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final j1.h.a f49234v = new j1.h.a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f49235w = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p122m1.e f49236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f49237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f49238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f49239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f49240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f49241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f49242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f49243h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f49244i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f49245j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f49246k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f49247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f49248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f49249n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f49250o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f49251p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f49252q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f49253r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f49254s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final java.util.HashMap f49255t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private p072h1.a f49256u;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public h(p092j1.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "frame");
        this.f49241f = Float.NaN;
        this.f49242g = Float.NaN;
        this.f49243h = Float.NaN;
        this.f49244i = Float.NaN;
        this.f49245j = Float.NaN;
        this.f49246k = Float.NaN;
        this.f49247l = Float.NaN;
        this.f49248m = Float.NaN;
        this.f49249n = Float.NaN;
        this.f49250o = Float.NaN;
        this.f49251p = Float.NaN;
        this.f49252q = Float.NaN;
        this.f49253r = Float.NaN;
        this.f49255t = new java.util.HashMap();
        this.f49236a = hVar.f49236a;
        this.f49237b = hVar.f49237b;
        this.f49238c = hVar.f49238c;
        this.f49239d = hVar.f49239d;
        this.f49240e = hVar.f49240e;
        L(hVar);
    }

    public h(p122m1.e eVar) {
        p247y7.AbstractC7350t.f(eVar, "widget");
        this.f49241f = Float.NaN;
        this.f49242g = Float.NaN;
        this.f49243h = Float.NaN;
        this.f49244i = Float.NaN;
        this.f49245j = Float.NaN;
        this.f49246k = Float.NaN;
        this.f49247l = Float.NaN;
        this.f49248m = Float.NaN;
        this.f49249n = Float.NaN;
        this.f49250o = Float.NaN;
        this.f49251p = Float.NaN;
        this.f49252q = Float.NaN;
        this.f49253r = Float.NaN;
        this.f49255t = new java.util.HashMap();
        this.f49236a = eVar;
    }

    private final void a(java.lang.StringBuilder sb, java.lang.String str, float f6) {
        if (java.lang.Float.isNaN(f6)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(f6);
        sb.append(",\n");
    }

    private final void b(java.lang.StringBuilder sb, java.lang.String str, int i6) {
        sb.append(str);
        sb.append(": ");
        sb.append(i6);
        sb.append(",\n");
    }

    private final void u(java.lang.StringBuilder sb, m1.d.b bVar) {
        p122m1.e eVar = this.f49236a;
        p122m1.d dVarL = eVar != null ? eVar.l(bVar) : null;
        if ((dVarL != null ? dVarL.i() : null) == null) {
            return;
        }
        sb.append("Anchor");
        sb.append(bVar.name());
        sb.append(": ['");
        p122m1.d dVarI = dVarL.i();
        p247y7.AbstractC7350t.c(dVarI);
        java.lang.String strS0 = dVarI.m().s0();
        if (strS0 == null) {
            strS0 = "#PARENT";
        }
        sb.append(strS0);
        sb.append("', '");
        p122m1.d dVarI2 = dVarL.i();
        p247y7.AbstractC7350t.c(dVarI2);
        sb.append(dVarI2.p().name());
        sb.append("', '");
        sb.append(dVarL.f());
        sb.append("'],\n");
    }

    public final void A(float f6) {
        this.f49242g = f6;
    }

    public final void B(float f6) {
        this.f49243h = f6;
    }

    public final void C(float f6) {
        this.f49244i = f6;
    }

    public final void D(float f6) {
        this.f49245j = f6;
    }

    public final void E(float f6) {
        this.f49250o = f6;
    }

    public final void F(float f6) {
        this.f49251p = f6;
    }

    public final void G(float f6) {
        this.f49246k = f6;
    }

    public final void H(float f6) {
        this.f49247l = f6;
    }

    public final void I(float f6) {
        this.f49248m = f6;
    }

    public final void J(int i6) {
        this.f49254s = i6;
    }

    public final p092j1.h K() {
        p122m1.e eVar = this.f49236a;
        if (eVar != null) {
            this.f49237b = eVar.C();
            this.f49238c = eVar.t0();
            this.f49239d = eVar.q0();
            this.f49240e = eVar.o();
            L(eVar.u());
        }
        return this;
    }

    public final void L(p092j1.h hVar) {
        if (hVar == null) {
            return;
        }
        this.f49241f = hVar.f49241f;
        this.f49242g = hVar.f49242g;
        this.f49243h = hVar.f49243h;
        this.f49244i = hVar.f49244i;
        this.f49245j = hVar.f49245j;
        this.f49246k = hVar.f49246k;
        this.f49247l = hVar.f49247l;
        this.f49248m = hVar.f49248m;
        this.f49250o = hVar.f49250o;
        this.f49251p = hVar.f49251p;
        this.f49252q = hVar.f49252q;
        this.f49254s = hVar.f49254s;
        y(hVar.f49256u);
        this.f49255t.clear();
        for (p062g1.a aVar : hVar.f49255t.values()) {
            this.f49255t.put(aVar.e(), aVar.a());
        }
    }

    public final float c() {
        return this.f49252q;
    }

    public final java.lang.String d() {
        p122m1.e eVar = this.f49236a;
        if (eVar == null) {
            return "unknown";
        }
        p247y7.AbstractC7350t.c(eVar);
        java.lang.String strS0 = eVar.s0();
        p247y7.AbstractC7350t.c(strS0);
        return strS0;
    }

    public final int e() {
        return this.f49237b;
    }

    public final float f() {
        return this.f49241f;
    }

    public final float g() {
        return this.f49242g;
    }

    public final float h() {
        return this.f49243h;
    }

    public final float i() {
        return this.f49244i;
    }

    public final float j() {
        return this.f49245j;
    }

    public final float k() {
        return this.f49250o;
    }

    public final float l() {
        return this.f49251p;
    }

    public final int m() {
        return this.f49238c;
    }

    public final float n() {
        return this.f49246k;
    }

    public final float o() {
        return this.f49247l;
    }

    public final float p() {
        return this.f49248m;
    }

    public final int q() {
        return this.f49254s;
    }

    public final p122m1.e r() {
        return this.f49236a;
    }

    public final boolean s() {
        return java.lang.Float.isNaN(this.f49243h) && java.lang.Float.isNaN(this.f49244i) && java.lang.Float.isNaN(this.f49245j) && java.lang.Float.isNaN(this.f49246k) && java.lang.Float.isNaN(this.f49247l) && java.lang.Float.isNaN(this.f49248m) && java.lang.Float.isNaN(this.f49250o) && java.lang.Float.isNaN(this.f49251p) && java.lang.Float.isNaN(this.f49252q);
    }

    public final java.lang.StringBuilder t(java.lang.StringBuilder sb, boolean z6) {
        java.lang.String strA;
        p247y7.AbstractC7350t.f(sb, "ret");
        sb.append("{\n");
        b(sb, "left", this.f49237b);
        b(sb, "top", this.f49238c);
        b(sb, "right", this.f49239d);
        b(sb, "bottom", this.f49240e);
        a(sb, "pivotX", this.f49241f);
        a(sb, "pivotY", this.f49242g);
        a(sb, "rotationX", this.f49243h);
        a(sb, "rotationY", this.f49244i);
        a(sb, "rotationZ", this.f49245j);
        a(sb, "translationX", this.f49246k);
        a(sb, "translationY", this.f49247l);
        a(sb, "translationZ", this.f49248m);
        a(sb, "scaleX", this.f49250o);
        a(sb, "scaleY", this.f49251p);
        a(sb, "alpha", this.f49252q);
        b(sb, "visibility", this.f49254s);
        a(sb, "interpolatedPos", this.f49253r);
        if (this.f49236a != null) {
            java.util.Iterator it = m1.d.b.g().iterator();
            while (it.hasNext()) {
                u(sb, (m1.d.b) it.next());
            }
        }
        if (z6) {
            a(sb, "phone_orientation", this.f49249n);
        }
        if (z6) {
            a(sb, "phone_orientation", this.f49249n);
        }
        if (this.f49255t.size() != 0) {
            sb.append("custom : {\n");
            for (java.lang.String str : this.f49255t.keySet()) {
                java.lang.Object obj = this.f49255t.get(str);
                p247y7.AbstractC7350t.c(obj);
                p062g1.a aVar = (p062g1.a) obj;
                sb.append(str);
                sb.append(": ");
                switch (aVar.g()) {
                    case 900:
                        sb.append(aVar.d());
                        break;
                    case 901:
                    case 905:
                        sb.append(aVar.c());
                        break;
                    case 902:
                        sb.append("'");
                        strA = p062g1.a.f45437g.a(aVar.d());
                        sb.append(strA);
                        sb.append("',\n");
                        break;
                    case 903:
                        sb.append("'");
                        strA = aVar.f();
                        sb.append(strA);
                        sb.append("',\n");
                        break;
                    case 904:
                        sb.append("'");
                        sb.append(aVar.b());
                        sb.append("',\n");
                        break;
                    default:
                        break;
                }
                sb.append(",\n");
            }
            sb.append("}\n");
        }
        sb.append("}\n");
        return sb;
    }

    public final void v(float f6) {
        this.f49252q = f6;
    }

    public final void w(java.lang.String str, int i6, float f6) {
        p247y7.AbstractC7350t.f(str, "name");
        if (!this.f49255t.containsKey(str)) {
            this.f49255t.put(str, new p062g1.a(str, i6, f6));
            return;
        }
        java.lang.Object obj = this.f49255t.get(str);
        p247y7.AbstractC7350t.c(obj);
        ((p062g1.a) obj).h(f6);
    }

    public final void x(java.lang.String str, int i6, int i10) {
        p247y7.AbstractC7350t.f(str, "name");
        if (!this.f49255t.containsKey(str)) {
            this.f49255t.put(str, new p062g1.a(str, i6, i10));
            return;
        }
        java.lang.Object obj = this.f49255t.get(str);
        p247y7.AbstractC7350t.c(obj);
        ((p062g1.a) obj).i(i10);
    }

    public final void y(p072h1.a aVar) {
        this.f49256u = aVar;
    }

    public final void z(float f6) {
        this.f49241f = f6;
    }
}
