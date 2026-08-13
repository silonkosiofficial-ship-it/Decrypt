package V0;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:20:0x0069  */
    /* JADX WARN: Code duplicated, block: B:21:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:54:0x017f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0191  */
    public static final M0.C a(U0.g gVar, M0.C c6, p237x7.r rVar, Y0.e eVar, boolean z6) {
        float textSize;
        T0.g gVarF;
        R0.q qVarN;
        R0.o oVarL;
        int iB;
        R0.p pVarM;
        int iA;
        long jG = Y0.x.g(c6.k());
        Y0.z.a aVar = Y0.z.f16241b;
        if (!Y0.z.g(jG, aVar.b())) {
            if (Y0.z.g(jG, aVar.a())) {
                textSize = gVar.getTextSize() * Y0.x.h(c6.k());
            }
            if (d(c6)) {
                R0.AbstractC1494h abstractC1494hI = c6.i();
                qVarN = c6.n();
                if (qVarN == null) {
                    qVarN = R0.q.f9331D.d();
                }
                oVarL = c6.l();
                if (oVarL != null) {
                    iB = oVarL.i();
                } else {
                    iB = R0.o.f9321b.b();
                }
                R0.o oVarC = R0.o.c(iB);
                pVarM = c6.m();
                if (pVarM != null) {
                    iA = pVarM.k();
                } else {
                    iA = R0.p.f9325b.a();
                }
                gVar.setTypeface((android.graphics.Typeface) rVar.o(abstractC1494hI, qVarN, oVarC, R0.p.e(iA)));
            }
            if (c6.p() != null && !p247y7.AbstractC7350t.b(c6.p(), T0.h.f12889E.a())) {
                if (android.os.Build.VERSION.SDK_INT >= 24) {
                    V0.c.f15097a.b(gVar, c6.p());
                } else {
                    if (c6.p().isEmpty()) {
                        gVarF = T0.g.f12887b.a();
                    } else {
                        gVarF = c6.p().f(0);
                    }
                    gVar.setTextLocale(gVarF.b());
                }
            }
            if (c6.j() != null && !p247y7.AbstractC7350t.b(c6.j(), "")) {
                gVar.setFontFeatureSettings(c6.j());
            }
            if (c6.u() != null && !p247y7.AbstractC7350t.b(c6.u(), X0.p.f15649c.a())) {
                gVar.setTextScaleX(gVar.getTextScaleX() * c6.u().b());
                gVar.setTextSkewX(gVar.getTextSkewX() + c6.u().c());
            }
            gVar.f(c6.g());
            gVar.e(c6.f(), p131n0.m.f51333b.a(), c6.c());
            gVar.h(c6.r());
            gVar.i(c6.s());
            gVar.g(c6.h());
            if (!Y0.z.g(Y0.x.g(c6.o()), aVar.b()) && Y0.x.h(c6.o()) != 0.0f) {
                float textSize2 = gVar.getTextSize() * gVar.getTextScaleX();
                float fG1 = eVar.g1(c6.o());
                if (textSize2 != 0.0f) {
                    gVar.setLetterSpacing(fG1 / textSize2);
                }
            } else if (Y0.z.g(Y0.x.g(c6.o()), aVar.a())) {
                gVar.setLetterSpacing(Y0.x.h(c6.o()));
            }
            return c(c6.o(), z6, c6.d(), c6.e());
        }
        textSize = eVar.g1(c6.k());
        gVar.setTextSize(textSize);
        if (d(c6)) {
            R0.AbstractC1494h abstractC1494hI2 = c6.i();
            qVarN = c6.n();
            if (qVarN == null) {
                qVarN = R0.q.f9331D.d();
            }
            oVarL = c6.l();
            if (oVarL != null) {
                iB = oVarL.i();
            } else {
                iB = R0.o.f9321b.b();
            }
            R0.o oVarC2 = R0.o.c(iB);
            pVarM = c6.m();
            if (pVarM != null) {
                iA = pVarM.k();
            } else {
                iA = R0.p.f9325b.a();
            }
            gVar.setTypeface((android.graphics.Typeface) rVar.o(abstractC1494hI2, qVarN, oVarC2, R0.p.e(iA)));
        }
        if (c6.p() != null) {
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                V0.c.f15097a.b(gVar, c6.p());
            } else {
                if (c6.p().isEmpty()) {
                    gVarF = T0.g.f12887b.a();
                } else {
                    gVarF = c6.p().f(0);
                }
                gVar.setTextLocale(gVarF.b());
            }
        }
        if (c6.j() != null) {
            gVar.setFontFeatureSettings(c6.j());
        }
        if (c6.u() != null) {
            gVar.setTextScaleX(gVar.getTextScaleX() * c6.u().b());
            gVar.setTextSkewX(gVar.getTextSkewX() + c6.u().c());
        }
        gVar.f(c6.g());
        gVar.e(c6.f(), p131n0.m.f51333b.a(), c6.c());
        gVar.h(c6.r());
        gVar.i(c6.s());
        gVar.g(c6.h());
        if (!Y0.z.g(Y0.x.g(c6.o()), aVar.b())) {
            if (Y0.z.g(Y0.x.g(c6.o()), aVar.a())) {
                gVar.setLetterSpacing(Y0.x.h(c6.o()));
            }
        } else if (Y0.z.g(Y0.x.g(c6.o()), aVar.a())) {
            gVar.setLetterSpacing(Y0.x.h(c6.o()));
        }
        return c(c6.o(), z6, c6.d(), c6.e());
    }

    public static final float b(float f6) {
        if (f6 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f6;
    }

    private static final M0.C c(long j6, boolean z6, long j10, X0.a aVar) {
        long jG = j10;
        boolean z10 = false;
        boolean z11 = z6 && Y0.z.g(Y0.x.g(j6), Y0.z.f16241b.b()) && Y0.x.h(j6) != 0.0f;
        p141o0.C7016y0.a aVar2 = p141o0.C7016y0.f52264b;
        boolean z12 = (p141o0.C7016y0.o(jG, aVar2.g()) || p141o0.C7016y0.o(jG, aVar2.f())) ? false : true;
        if (aVar != null) {
            if (!X0.a.e(aVar.h(), X0.a.f15571b.a())) {
                z10 = true;
            }
        }
        if (!z11 && !z12 && !z10) {
            return null;
        }
        long jA = z11 ? j6 : Y0.x.f16237b.a();
        if (!z12) {
            jG = aVar2.g();
        }
        return new M0.C(0L, 0L, null, null, null, null, null, jA, z10 ? aVar : null, null, null, jG, null, null, null, null, 63103, null);
    }

    public static final boolean d(M0.C c6) {
        return (c6.i() == null && c6.l() == null && c6.n() == null) ? false : true;
    }

    public static final void e(U0.g gVar, X0.t tVar) {
        if (tVar == null) {
            tVar = X0.t.f15657c.a();
        }
        gVar.setFlags(tVar.c() ? gVar.getFlags() | 128 : gVar.getFlags() & (-129));
        int iB = tVar.b();
        X0.t.b.a aVar = X0.t.b.f15662a;
        if (X0.t.b.e(iB, aVar.b())) {
            gVar.setFlags(gVar.getFlags() | 64);
        } else if (X0.t.b.e(iB, aVar.a())) {
            gVar.getFlags();
            gVar.setHinting(1);
            return;
        } else {
            boolean zE = X0.t.b.e(iB, aVar.c());
            gVar.getFlags();
            if (!zE) {
                return;
            }
        }
        gVar.setHinting(0);
    }
}
