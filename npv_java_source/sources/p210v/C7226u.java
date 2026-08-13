package p210v;

/* JADX INFO: renamed from: v.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C7226u extends androidx.compose.ui.platform.H0 implements p111l0.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p210v.C7207a f55723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p210v.C7228w f55724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.graphics.RenderNode f55725e;

    public C7226u(p210v.C7207a c7207a, p210v.C7228w c7228w, p237x7.l lVar) {
        super(lVar);
        this.f55723c = c7207a;
        this.f55724d = c7228w;
    }

    private final boolean g(android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        return n(180.0f, edgeEffect, canvas);
    }

    private final boolean j(android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        return n(270.0f, edgeEffect, canvas);
    }

    private final boolean l(android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        return n(90.0f, edgeEffect, canvas);
    }

    private final boolean m(android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        return n(0.0f, edgeEffect, canvas);
    }

    private final boolean n(float f6, android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        if (f6 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f6);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final android.graphics.RenderNode o() {
        android.graphics.RenderNode renderNode = this.f55725e;
        if (renderNode != null) {
            return renderNode;
        }
        android.graphics.RenderNode renderNodeA = p210v.AbstractC7222p.a("AndroidEdgeEffectOverscrollEffect");
        this.f55725e = renderNodeA;
        return renderNodeA;
    }

    private final boolean p() {
        p210v.C7228w c7228w = this.f55724d;
        return c7228w.r() || c7228w.s() || c7228w.u() || c7228w.v();
    }

    private final boolean q() {
        p210v.C7228w c7228w = this.f55724d;
        return c7228w.y() || c7228w.z() || c7228w.o() || c7228w.p();
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

    /* JADX WARN: Code duplicated, block: B:18:0x0089  */
    /* JADX WARN: Code duplicated, block: B:21:0x009a  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:41:0x010c  */
    /* JADX WARN: Code duplicated, block: B:44:0x011c  */
    /* JADX WARN: Code duplicated, block: B:49:0x012b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0132  */
    /* JADX WARN: Code duplicated, block: B:55:0x014f  */
    /* JADX WARN: Code duplicated, block: B:58:0x015f  */
    /* JADX WARN: Code duplicated, block: B:61:0x016b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0172  */
    /* JADX WARN: Code duplicated, block: B:67:0x018e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0196  */
    /* JADX WARN: Code duplicated, block: B:71:0x0198  */
    /* JADX WARN: Code duplicated, block: B:73:0x019b  */
    @Override // p111l0.g
    public void y(p161q0.c cVar) {
        android.graphics.RenderNode renderNodeO;
        int width;
        int height;
        android.graphics.RecordingCanvas recordingCanvasBeginRecording;
        boolean zJ;
        float f6;
        p141o0.InterfaceC6993q0 interfaceC6993q0B;
        Y0.e density;
        Y0.v layoutDirection;
        p141o0.InterfaceC6993q0 interfaceC6993q0H;
        long jI;
        p171r0.C7053c c7053cF;
        android.widget.EdgeEffect edgeEffectF;
        android.widget.EdgeEffect edgeEffectJ;
        android.widget.EdgeEffect edgeEffectL;
        android.widget.EdgeEffect edgeEffectH;
        this.f55723c.r(cVar.i());
        if (p131n0.m.k(cVar.i())) {
            cVar.l1();
            return;
        }
        this.f55723c.j().getValue();
        float fB0 = cVar.B0(p210v.AbstractC7218l.b());
        android.graphics.Canvas canvasD = p141o0.H.d(cVar.F0().h());
        p210v.C7228w c7228w = this.f55724d;
        boolean zQ = q();
        boolean zP = p();
        try {
            try {
                if (!zQ || !zP) {
                    if (zQ) {
                        renderNodeO = o();
                        width = canvasD.getWidth() + (A7.a.d(fB0) * 2);
                    } else if (!zP) {
                        cVar.l1();
                        return;
                    } else {
                        renderNodeO = o();
                        width = canvasD.getWidth();
                        height = canvasD.getHeight() + (A7.a.d(fB0) * 2);
                    }
                    renderNodeO.setPosition(0, 0, width, height);
                    recordingCanvasBeginRecording = o().beginRecording();
                    if (c7228w.s()) {
                        android.widget.EdgeEffect edgeEffectI = c7228w.i();
                        l(edgeEffectI, recordingCanvasBeginRecording);
                        edgeEffectI.finish();
                    }
                    if (c7228w.r()) {
                        edgeEffectH = c7228w.h();
                        zJ = j(edgeEffectH, recordingCanvasBeginRecording);
                        if (c7228w.t()) {
                            float fN = p131n0.g.n(this.f55723c.i());
                            p210v.C7227v c7227v = p210v.C7227v.f55726a;
                            c7227v.d(c7228w.i(), c7227v.b(edgeEffectH), 1 - fN);
                        }
                    } else {
                        zJ = false;
                    }
                    if (c7228w.z()) {
                        android.widget.EdgeEffect edgeEffectM = c7228w.m();
                        g(edgeEffectM, recordingCanvasBeginRecording);
                        edgeEffectM.finish();
                    }
                    if (c7228w.y()) {
                        edgeEffectL = c7228w.l();
                        if (!m(edgeEffectL, recordingCanvasBeginRecording) || zJ) {
                            zJ = true;
                        } else {
                            zJ = false;
                        }
                        if (c7228w.A()) {
                            float fM = p131n0.g.m(this.f55723c.i());
                            p210v.C7227v c7227v2 = p210v.C7227v.f55726a;
                            c7227v2.d(c7228w.m(), c7227v2.b(edgeEffectL), fM);
                        }
                    }
                    if (c7228w.v()) {
                        android.widget.EdgeEffect edgeEffectK = c7228w.k();
                        j(edgeEffectK, recordingCanvasBeginRecording);
                        edgeEffectK.finish();
                    }
                    if (c7228w.u()) {
                        edgeEffectJ = c7228w.j();
                        if (!l(edgeEffectJ, recordingCanvasBeginRecording) || zJ) {
                            zJ = true;
                        } else {
                            zJ = false;
                        }
                        if (c7228w.w()) {
                            float fN2 = p131n0.g.n(this.f55723c.i());
                            p210v.C7227v c7227v3 = p210v.C7227v.f55726a;
                            c7227v3.d(c7228w.k(), c7227v3.b(edgeEffectJ), fN2);
                        }
                    }
                    if (c7228w.p()) {
                        android.widget.EdgeEffect edgeEffectG = c7228w.g();
                        m(edgeEffectG, recordingCanvasBeginRecording);
                        edgeEffectG.finish();
                    }
                    if (c7228w.o()) {
                        edgeEffectF = c7228w.f();
                        boolean z6 = !g(edgeEffectF, recordingCanvasBeginRecording) || zJ;
                        if (c7228w.q()) {
                            float fM2 = p131n0.g.m(this.f55723c.i());
                            p210v.C7227v c7227v4 = p210v.C7227v.f55726a;
                            c7227v4.d(c7228w.g(), c7227v4.b(edgeEffectF), 1 - fM2);
                        }
                        zJ = z6;
                    }
                    if (zJ) {
                        this.f55723c.k();
                    }
                    if (zP) {
                        f6 = 0.0f;
                    } else {
                        f6 = fB0;
                    }
                    if (zQ) {
                        fB0 = 0.0f;
                    }
                    Y0.v layoutDirection2 = cVar.getLayoutDirection();
                    interfaceC6993q0B = p141o0.H.b(recordingCanvasBeginRecording);
                    long jI2 = cVar.i();
                    density = cVar.F0().getDensity();
                    layoutDirection = cVar.F0().getLayoutDirection();
                    interfaceC6993q0H = cVar.F0().h();
                    jI = cVar.F0().i();
                    c7053cF = cVar.F0().f();
                    p161q0.d dVarF0 = cVar.F0();
                    dVarF0.a(cVar);
                    dVarF0.b(layoutDirection2);
                    dVarF0.g(interfaceC6993q0B);
                    dVarF0.d(jI2);
                    dVarF0.e(null);
                    interfaceC6993q0B.m();
                    cVar.F0().c().d(f6, fB0);
                    cVar.l1();
                    float f10 = -f6;
                    float f11 = -fB0;
                    cVar.F0().c().d(f10, f11);
                    interfaceC6993q0B.s();
                    p161q0.d dVarF1 = cVar.F0();
                    dVarF1.a(density);
                    dVarF1.b(layoutDirection);
                    dVarF1.g(interfaceC6993q0H);
                    dVarF1.d(jI);
                    dVarF1.e(c7053cF);
                    o().endRecording();
                    int iSave = canvasD.save();
                    canvasD.translate(f10, f11);
                    canvasD.drawRenderNode(o());
                    canvasD.restoreToCount(iSave);
                    return;
                }
                renderNodeO = o();
                width = canvasD.getWidth();
                cVar.l1();
                float f12 = -f6;
                float f13 = -fB0;
                cVar.F0().c().d(f12, f13);
                interfaceC6993q0B.s();
                p161q0.d dVarF2 = cVar.F0();
                dVarF2.a(density);
                dVarF2.b(layoutDirection);
                dVarF2.g(interfaceC6993q0H);
                dVarF2.d(jI);
                dVarF2.e(c7053cF);
                o().endRecording();
                int iSave2 = canvasD.save();
                canvasD.translate(f12, f13);
                canvasD.drawRenderNode(o());
                canvasD.restoreToCount(iSave2);
                return;
            } catch (java.lang.Throwable th) {
                cVar.F0().c().d(-f6, -fB0);
                throw th;
            }
            cVar.F0().c().d(f6, fB0);
        } catch (java.lang.Throwable th2) {
            interfaceC6993q0B.s();
            p161q0.d dVarF3 = cVar.F0();
            dVarF3.a(density);
            dVarF3.b(layoutDirection);
            dVarF3.g(interfaceC6993q0H);
            dVarF3.d(jI);
            dVarF3.e(c7053cF);
            throw th2;
        }
        height = canvasD.getHeight();
        renderNodeO.setPosition(0, 0, width, height);
        recordingCanvasBeginRecording = o().beginRecording();
        if (c7228w.s()) {
            android.widget.EdgeEffect edgeEffectI2 = c7228w.i();
            l(edgeEffectI2, recordingCanvasBeginRecording);
            edgeEffectI2.finish();
        }
        if (c7228w.r()) {
            edgeEffectH = c7228w.h();
            zJ = j(edgeEffectH, recordingCanvasBeginRecording);
            if (c7228w.t()) {
                float fN3 = p131n0.g.n(this.f55723c.i());
                p210v.C7227v c7227v5 = p210v.C7227v.f55726a;
                c7227v5.d(c7228w.i(), c7227v5.b(edgeEffectH), 1 - fN3);
            }
        } else {
            zJ = false;
        }
        if (c7228w.z()) {
            android.widget.EdgeEffect edgeEffectM2 = c7228w.m();
            g(edgeEffectM2, recordingCanvasBeginRecording);
            edgeEffectM2.finish();
        }
        if (c7228w.y()) {
            edgeEffectL = c7228w.l();
            if (m(edgeEffectL, recordingCanvasBeginRecording)) {
                zJ = true;
            } else {
                zJ = true;
            }
            if (c7228w.A()) {
                float fM3 = p131n0.g.m(this.f55723c.i());
                p210v.C7227v c7227v6 = p210v.C7227v.f55726a;
                c7227v6.d(c7228w.m(), c7227v6.b(edgeEffectL), fM3);
            }
        }
        if (c7228w.v()) {
            android.widget.EdgeEffect edgeEffectK2 = c7228w.k();
            j(edgeEffectK2, recordingCanvasBeginRecording);
            edgeEffectK2.finish();
        }
        if (c7228w.u()) {
            edgeEffectJ = c7228w.j();
            if (l(edgeEffectJ, recordingCanvasBeginRecording)) {
                zJ = true;
            } else {
                zJ = true;
            }
            if (c7228w.w()) {
                float fN4 = p131n0.g.n(this.f55723c.i());
                p210v.C7227v c7227v7 = p210v.C7227v.f55726a;
                c7227v7.d(c7228w.k(), c7227v7.b(edgeEffectJ), fN4);
            }
        }
        if (c7228w.p()) {
            android.widget.EdgeEffect edgeEffectG2 = c7228w.g();
            m(edgeEffectG2, recordingCanvasBeginRecording);
            edgeEffectG2.finish();
        }
        if (c7228w.o()) {
            edgeEffectF = c7228w.f();
            if (g(edgeEffectF, recordingCanvasBeginRecording)) {
            }
            if (c7228w.q()) {
                float fM4 = p131n0.g.m(this.f55723c.i());
                p210v.C7227v c7227v8 = p210v.C7227v.f55726a;
                c7227v8.d(c7228w.g(), c7227v8.b(edgeEffectF), 1 - fM4);
            }
            zJ = z6;
        }
        if (zJ) {
            this.f55723c.k();
        }
        if (zP) {
            f6 = 0.0f;
        } else {
            f6 = fB0;
        }
        if (zQ) {
            fB0 = 0.0f;
        }
        Y0.v layoutDirection3 = cVar.getLayoutDirection();
        interfaceC6993q0B = p141o0.H.b(recordingCanvasBeginRecording);
        long jI3 = cVar.i();
        density = cVar.F0().getDensity();
        layoutDirection = cVar.F0().getLayoutDirection();
        interfaceC6993q0H = cVar.F0().h();
        jI = cVar.F0().i();
        c7053cF = cVar.F0().f();
        p161q0.d dVarF4 = cVar.F0();
        dVarF4.a(cVar);
        dVarF4.b(layoutDirection3);
        dVarF4.g(interfaceC6993q0B);
        dVarF4.d(jI3);
        dVarF4.e(null);
        interfaceC6993q0B.m();
    }
}
