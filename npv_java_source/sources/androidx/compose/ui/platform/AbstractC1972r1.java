package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1972r1 {
    private static final boolean a(p131n0.k kVar) {
        return p131n0.a.d(kVar.h()) + p131n0.a.d(kVar.i()) <= kVar.j() && p131n0.a.d(kVar.b()) + p131n0.a.d(kVar.c()) <= kVar.j() && p131n0.a.e(kVar.h()) + p131n0.a.e(kVar.b()) <= kVar.d() && p131n0.a.e(kVar.i()) + p131n0.a.e(kVar.c()) <= kVar.d();
    }

    public static final boolean b(p141o0.L1 l6, float f6, float f10, p141o0.Q1 q6, p141o0.Q1 q10) {
        if (l6 instanceof o0.L1.b) {
            return e(((o0.L1.b) l6).b(), f6, f10);
        }
        if (l6 instanceof o0.L1.c) {
            return f((o0.L1.c) l6, f6, f10, q6, q10);
        }
        if (l6 instanceof o0.L1.a) {
            return d(((o0.L1.a) l6).b(), f6, f10, q6, q10);
        }
        throw new p087i7.s();
    }

    public static /* synthetic */ boolean c(p141o0.L1 l6, float f6, float f10, p141o0.Q1 q6, p141o0.Q1 q10, int i6, java.lang.Object obj) {
        if ((i6 & 8) != 0) {
            q6 = null;
        }
        if ((i6 & 16) != 0) {
            q10 = null;
        }
        return b(l6, f6, f10, q6, q10);
    }

    private static final boolean d(p141o0.Q1 q6, float f6, float f10, p141o0.Q1 q10, p141o0.Q1 q11) {
        p131n0.i iVar = new p131n0.i(f6 - 0.005f, f10 - 0.005f, f6 + 0.005f, f10 + 0.005f);
        if (q10 == null) {
            q10 = p141o0.Y.a();
        }
        p141o0.P1.b(q10, iVar, null, 2, null);
        if (q11 == null) {
            q11 = p141o0.Y.a();
        }
        q11.j(q6, q10, p141o0.U1.f52166a.b());
        boolean zIsEmpty = q11.isEmpty();
        q11.a();
        q10.a();
        return !zIsEmpty;
    }

    private static final boolean e(p131n0.i iVar, float f6, float f10) {
        return iVar.i() <= f6 && f6 < iVar.j() && iVar.l() <= f10 && f10 < iVar.e();
    }

    private static final boolean f(o0.L1.c cVar, float f6, float f10, p141o0.Q1 q6, p141o0.Q1 q10) {
        long jC;
        p131n0.k kVarB = cVar.b();
        if (f6 < kVarB.e() || f6 >= kVarB.f() || f10 < kVarB.g() || f10 >= kVarB.a()) {
            return false;
        }
        if (!a(kVarB)) {
            p141o0.Q1 q1A = q10 == null ? p141o0.Y.a() : q10;
            p141o0.P1.c(q1A, kVarB, null, 2, null);
            return d(q1A, f6, f10, q6, q10);
        }
        float fD = p131n0.a.d(kVarB.h()) + kVarB.e();
        float fE = p131n0.a.e(kVarB.h()) + kVarB.g();
        float f11 = kVarB.f() - p131n0.a.d(kVarB.i());
        float fE2 = p131n0.a.e(kVarB.i()) + kVarB.g();
        float f12 = kVarB.f() - p131n0.a.d(kVarB.c());
        float fA = kVarB.a() - p131n0.a.e(kVarB.c());
        float fA2 = kVarB.a() - p131n0.a.e(kVarB.b());
        float fD2 = p131n0.a.d(kVarB.b()) + kVarB.e();
        if (f6 < fD && f10 < fE) {
            jC = kVarB.h();
        } else if (f6 < fD2 && f10 > fA2) {
            jC = kVarB.b();
            fD = fD2;
            fE = fA2;
        } else if (f6 > f11 && f10 < fE2) {
            jC = kVarB.i();
            fD = f11;
            fE = fE2;
        } else {
            if (f6 <= f12 || f10 <= fA) {
                return true;
            }
            jC = kVarB.c();
            fD = f12;
            fE = fA;
        }
        return g(f6, f10, jC, fD, fE);
    }

    private static final boolean g(float f6, float f10, long j6, float f11, float f12) {
        float f13 = f6 - f11;
        float f14 = f10 - f12;
        float fD = p131n0.a.d(j6);
        float fE = p131n0.a.e(j6);
        return ((f13 * f13) / (fD * fD)) + ((f14 * f14) / (fE * fE)) <= 1.0f;
    }
}
