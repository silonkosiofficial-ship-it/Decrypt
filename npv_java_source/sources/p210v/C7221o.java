package p210v;

/* JADX INFO: renamed from: v.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C7221o extends androidx.compose.ui.platform.H0 implements p111l0.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p210v.C7207a f55720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p210v.C7228w f55721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p210v.Q f55722e;

    public C7221o(p210v.C7207a c7207a, p210v.C7228w c7228w, p210v.Q q6, p237x7.l lVar) {
        super(lVar);
        this.f55720c = c7207a;
        this.f55721d = c7228w;
        this.f55722e = q6;
    }

    private final boolean g(p161q0.g gVar, android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        return n(180.0f, p131n0.h.a(-p131n0.m.i(gVar.i()), (-p131n0.m.g(gVar.i())) + gVar.B0(this.f55722e.a().c())), edgeEffect, canvas);
    }

    private final boolean j(p161q0.g gVar, android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        return n(270.0f, p131n0.h.a(-p131n0.m.g(gVar.i()), gVar.B0(this.f55722e.a().a(gVar.getLayoutDirection()))), edgeEffect, canvas);
    }

    private final boolean l(p161q0.g gVar, android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        return n(90.0f, p131n0.h.a(0.0f, (-A7.a.d(p131n0.m.i(gVar.i()))) + gVar.B0(this.f55722e.a().b(gVar.getLayoutDirection()))), edgeEffect, canvas);
    }

    private final boolean m(p161q0.g gVar, android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        return n(0.0f, p131n0.h.a(0.0f, gVar.B0(this.f55722e.a().d())), edgeEffect, canvas);
    }

    private final boolean n(float f6, long j6, android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f6);
        canvas.translate(p131n0.g.m(j6), p131n0.g.n(j6));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // androidx.compose.ui.d
    public /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar) {
        return p071h0.f.a(this, dVar);
    }

    @Override // androidx.compose.ui.d
    public /* synthetic */ java.lang.Object c(java.lang.Object obj, p237x7.p pVar) {
        return p071h0.g.b(this, obj, pVar);
    }

    @Override // androidx.compose.ui.d
    public /* synthetic */ boolean d(p237x7.l lVar) {
        return p071h0.g.a(this, lVar);
    }

    @Override // p111l0.g
    public void y(p161q0.c cVar) {
        this.f55720c.r(cVar.i());
        boolean zK = p131n0.m.k(cVar.i());
        cVar.l1();
        if (zK) {
            return;
        }
        this.f55720c.j().getValue();
        android.graphics.Canvas canvasD = p141o0.H.d(cVar.F0().h());
        p210v.C7228w c7228w = this.f55721d;
        boolean zJ = c7228w.r() ? j(cVar, c7228w.h(), canvasD) : false;
        if (c7228w.y()) {
            zJ = m(cVar, c7228w.l(), canvasD) || zJ;
        }
        if (c7228w.u()) {
            zJ = l(cVar, c7228w.j(), canvasD) || zJ;
        }
        if (c7228w.o()) {
            zJ = g(cVar, c7228w.f(), canvasD) || zJ;
        }
        if (zJ) {
            this.f55720c.k();
        }
    }
}
