package U0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends android.text.TextPaint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p141o0.N1 f14424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private X0.k f14425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p141o0.c2 f14427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p141o0.AbstractC6984n0 f14428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private V.G1 f14429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p131n0.m f14430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p161q0.h f14431h;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p141o0.AbstractC6984n0 f14432D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f14433E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p141o0.AbstractC6984n0 abstractC6984n0, long j6) {
            super(0);
            this.f14432D = abstractC6984n0;
            this.f14433E = j6;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.graphics.Shader b() {
            return ((p141o0.a2) this.f14432D).b(this.f14433E);
        }
    }

    public g(int i6, float f6) {
        super(i6);
        ((android.text.TextPaint) this).density = f6;
        this.f14425b = X0.k.f15631b.c();
        this.f14426c = p161q0.g.f52924B.a();
        this.f14427d = p141o0.c2.f52187d.a();
    }

    private final void a() {
        this.f14429f = null;
        this.f14428e = null;
        this.f14430g = null;
        setShader(null);
    }

    private final p141o0.N1 c() {
        p141o0.N1 n6 = this.f14424a;
        if (n6 != null) {
            return n6;
        }
        p141o0.N1 n1B = p141o0.U.b(this);
        this.f14424a = n1B;
        return n1B;
    }

    public final int b() {
        return this.f14426c;
    }

    public final void d(int i6) {
        if (p141o0.AbstractC6960f0.E(i6, this.f14426c)) {
            return;
        }
        c().u(i6);
        this.f14426c = i6;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    public final void e(p141o0.AbstractC6984n0 abstractC6984n0, long j6, float f6) {
        if (abstractC6984n0 == null) {
            a();
            return;
        }
        if (abstractC6984n0 instanceof p141o0.f2) {
            f(X0.m.c(((p141o0.f2) abstractC6984n0).b(), f6));
            return;
        }
        if (abstractC6984n0 instanceof p141o0.a2) {
            if (p247y7.AbstractC7350t.b(this.f14428e, abstractC6984n0)) {
                p131n0.m mVar = this.f14430g;
                if (!(mVar == null ? false : p131n0.m.f(mVar.m(), j6))) {
                    if (j6 != 9205357640488583168L) {
                        this.f14428e = abstractC6984n0;
                        this.f14430g = p131n0.m.c(j6);
                        this.f14429f = V.v1.e(new U0.g.a(abstractC6984n0, j6));
                    }
                }
            } else {
                if (j6 != 9205357640488583168L) {
                    this.f14428e = abstractC6984n0;
                    this.f14430g = p131n0.m.c(j6);
                    this.f14429f = V.v1.e(new U0.g.a(abstractC6984n0, j6));
                }
            }
            p141o0.N1 n1C = c();
            V.G1 g6 = this.f14429f;
            n1C.x(g6 != null ? (android.graphics.Shader) g6.getValue() : null);
            U0.h.a(this, f6);
        }
    }

    public final void f(long j6) {
        if (j6 != 16) {
            setColor(p141o0.A0.k(j6));
            a();
        }
    }

    public final void g(p161q0.h hVar) {
        if (hVar == null || p247y7.AbstractC7350t.b(this.f14431h, hVar)) {
            return;
        }
        this.f14431h = hVar;
        if (p247y7.AbstractC7350t.b(hVar, p161q0.l.f52928a)) {
            setStyle(android.graphics.Paint.Style.FILL);
            return;
        }
        if (hVar instanceof p161q0.m) {
            c().F(p141o0.O1.f52148a.b());
            p161q0.m mVar = (p161q0.m) hVar;
            c().I(mVar.f());
            c().z(mVar.d());
            c().E(mVar.c());
            c().s(mVar.b());
            p141o0.N1 n1C = c();
            mVar.e();
            n1C.t(null);
        }
    }

    public final void h(p141o0.c2 c2Var) {
        if (c2Var == null || p247y7.AbstractC7350t.b(this.f14427d, c2Var)) {
            return;
        }
        this.f14427d = c2Var;
        if (p247y7.AbstractC7350t.b(c2Var, p141o0.c2.f52187d.a())) {
            clearShadowLayer();
        } else {
            setShadowLayer(V0.f.b(this.f14427d.b()), p131n0.g.m(this.f14427d.d()), p131n0.g.n(this.f14427d.d()), p141o0.A0.k(this.f14427d.c()));
        }
    }

    public final void i(X0.k kVar) {
        if (kVar == null || p247y7.AbstractC7350t.b(this.f14425b, kVar)) {
            return;
        }
        this.f14425b = kVar;
        X0.k.a aVar = X0.k.f15631b;
        setUnderlineText(kVar.d(aVar.d()));
        setStrikeThruText(this.f14425b.d(aVar.b()));
    }
}
