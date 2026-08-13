package p141o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class M1 {
    public static final void a(p161q0.g gVar, p141o0.L1 l6, p141o0.AbstractC6984n0 abstractC6984n0, float f6, p161q0.h hVar, p141o0.AbstractC7019z0 abstractC7019z0, int i6) {
        p141o0.Q1 q1B;
        if (l6 instanceof o0.L1.b) {
            p131n0.i iVarB = ((o0.L1.b) l6).b();
            gVar.C0(abstractC6984n0, g(iVarB), e(iVarB), f6, hVar, abstractC7019z0, i6);
            return;
        }
        if (l6 instanceof o0.L1.c) {
            o0.L1.c cVar = (o0.L1.c) l6;
            q1B = cVar.c();
            if (q1B == null) {
                p131n0.k kVarB = cVar.b();
                gVar.d1(abstractC6984n0, h(kVarB), f(kVarB), p131n0.b.b(p131n0.a.d(kVarB.b()), 0.0f, 2, null), f6, hVar, abstractC7019z0, i6);
                return;
            }
        } else {
            if (!(l6 instanceof o0.L1.a)) {
                throw new p087i7.s();
            }
            q1B = ((o0.L1.a) l6).b();
        }
        gVar.p1(q1B, abstractC6984n0, f6, hVar, abstractC7019z0, i6);
    }

    public static /* synthetic */ void b(p161q0.g gVar, p141o0.L1 l6, p141o0.AbstractC6984n0 abstractC6984n0, float f6, p161q0.h hVar, p141o0.AbstractC7019z0 abstractC7019z0, int i6, int i10, java.lang.Object obj) {
        if ((i10 & 4) != 0) {
            f6 = 1.0f;
        }
        float f10 = f6;
        if ((i10 & 8) != 0) {
            hVar = p161q0.l.f52928a;
        }
        p161q0.h hVar2 = hVar;
        if ((i10 & 16) != 0) {
            abstractC7019z0 = null;
        }
        p141o0.AbstractC7019z0 abstractC7019z1 = abstractC7019z0;
        if ((i10 & 32) != 0) {
            i6 = p161q0.g.f52924B.a();
        }
        a(gVar, l6, abstractC6984n0, f10, hVar2, abstractC7019z1, i6);
    }

    public static final void c(p161q0.g gVar, p141o0.L1 l6, long j6, float f6, p161q0.h hVar, p141o0.AbstractC7019z0 abstractC7019z0, int i6) {
        p141o0.Q1 q1B;
        if (l6 instanceof o0.L1.b) {
            p131n0.i iVarB = ((o0.L1.b) l6).b();
            gVar.U0(j6, g(iVarB), e(iVarB), f6, hVar, abstractC7019z0, i6);
            return;
        }
        if (l6 instanceof o0.L1.c) {
            o0.L1.c cVar = (o0.L1.c) l6;
            q1B = cVar.c();
            if (q1B == null) {
                p131n0.k kVarB = cVar.b();
                gVar.a0(j6, h(kVarB), f(kVarB), p131n0.b.b(p131n0.a.d(kVarB.b()), 0.0f, 2, null), hVar, f6, abstractC7019z0, i6);
                return;
            }
        } else {
            if (!(l6 instanceof o0.L1.a)) {
                throw new p087i7.s();
            }
            q1B = ((o0.L1.a) l6).b();
        }
        gVar.Q0(q1B, j6, f6, hVar, abstractC7019z0, i6);
    }

    private static final long e(p131n0.i iVar) {
        return p131n0.n.a(iVar.n(), iVar.h());
    }

    private static final long f(p131n0.k kVar) {
        return p131n0.n.a(kVar.j(), kVar.d());
    }

    private static final long g(p131n0.i iVar) {
        return p131n0.h.a(iVar.i(), iVar.l());
    }

    private static final long h(p131n0.k kVar) {
        return p131n0.h.a(kVar.e(), kVar.g());
    }
}
