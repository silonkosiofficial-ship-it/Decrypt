package K;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    public static final class a implements S0.InterfaceC1601i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ S0.InterfaceC1601i[] f5864a;

        a(S0.InterfaceC1601i[] interfaceC1601iArr) {
            this.f5864a = interfaceC1601iArr;
        }

        @Override // S0.InterfaceC1601i
        public void a(S0.C1604l c1604l) {
            for (S0.InterfaceC1601i interfaceC1601i : this.f5864a) {
                interfaceC1601i.a(c1604l);
            }
        }
    }

    private static final boolean A(int i6) {
        int type = java.lang.Character.getType(i6);
        return type == 14 || type == 13 || i6 == 10;
    }

    private static final boolean B(int i6) {
        int type = java.lang.Character.getType(i6);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    private static final boolean C(int i6) {
        return java.lang.Character.isWhitespace(i6) || i6 == 160;
    }

    private static final boolean D(int i6) {
        return C(i6) && !A(i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long E(java.lang.CharSequence charSequence, int i6) {
        int iCharCount = i6;
        while (iCharCount > 0) {
            int iC = K.AbstractC1284f.c(charSequence, iCharCount);
            if (!C(iC)) {
                break;
            }
            iCharCount -= java.lang.Character.charCount(iC);
        }
        while (i6 < charSequence.length()) {
            int iB = K.AbstractC1284f.b(charSequence, i6);
            if (!C(iB)) {
                break;
            }
            i6 += K.AbstractC1284f.a(iB);
        }
        return M0.O.b(iCharCount, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long F(android.graphics.PointF pointF) {
        return p131n0.h.a(pointF.x, pointF.y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j6, java.lang.CharSequence charSequence) {
        int iN = M0.N.n(j6);
        int i6 = M0.N.i(j6);
        int iCodePointBefore = iN > 0 ? java.lang.Character.codePointBefore(charSequence, iN) : 10;
        int iCodePointAt = i6 < charSequence.length() ? java.lang.Character.codePointAt(charSequence, i6) : 10;
        if (D(iCodePointBefore) && (C(iCodePointAt) || B(iCodePointAt))) {
            do {
                iN -= java.lang.Character.charCount(iCodePointBefore);
                if (iN == 0) {
                    break;
                }
                iCodePointBefore = java.lang.Character.codePointBefore(charSequence, iN);
            } while (D(iCodePointBefore));
            return M0.O.b(iN, i6);
        }
        if (!D(iCodePointAt)) {
            return j6;
        }
        if (!C(iCodePointBefore) && !B(iCodePointBefore)) {
            return j6;
        }
        do {
            i6 += java.lang.Character.charCount(iCodePointAt);
            if (i6 == charSequence.length()) {
                break;
            }
            iCodePointAt = java.lang.Character.codePointAt(charSequence, i6);
        } while (D(iCodePointAt));
        return M0.O.b(iN, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S0.InterfaceC1601i n(S0.InterfaceC1601i... interfaceC1601iArr) {
        return new K.j0.a(interfaceC1601iArr);
    }

    private static final long o(long j6, long j10) {
        return M0.O.b(java.lang.Math.min(M0.N.n(j6), M0.N.n(j6)), java.lang.Math.max(M0.N.i(j10), M0.N.i(j10)));
    }

    private static final int p(M0.C1338j c1338j, long j6, androidx.compose.ui.platform.A1 a6) {
        float fH = a6 != null ? a6.h() : 0.0f;
        int iP = c1338j.p(p131n0.g.n(j6));
        if (p131n0.g.n(j6) < c1338j.t(iP) - fH || p131n0.g.n(j6) > c1338j.l(iP) + fH || p131n0.g.m(j6) < (-fH) || p131n0.g.m(j6) > c1338j.A() + fH) {
            return -1;
        }
        return iP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(H.C1230w c1230w, long j6, androidx.compose.ui.platform.A1 a6) {
        M0.K kF;
        M0.C1338j c1338jW;
        H.V vJ = c1230w.j();
        if (vJ == null || (kF = vJ.f()) == null || (c1338jW = kF.w()) == null) {
            return -1;
        }
        return s(c1338jW, j6, c1230w.i(), a6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(K.y0 y0Var, long j6, androidx.compose.ui.platform.A1 a6) {
        throw null;
    }

    private static final int s(M0.C1338j c1338j, long j6, D0.InterfaceC0900t interfaceC0900t, androidx.compose.ui.platform.A1 a6) {
        long jS;
        int iP;
        if (interfaceC0900t == null || (iP = p(c1338j, (jS = interfaceC0900t.s(j6)), a6)) == -1) {
            return -1;
        }
        return c1338j.u(p131n0.g.g(jS, 0.0f, (c1338j.t(iP) + c1338j.l(iP)) / 2.0f, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long t(M0.K k6, long j6, long j10, D0.InterfaceC0900t interfaceC0900t, androidx.compose.ui.platform.A1 a6) {
        if (k6 == null || interfaceC0900t == null) {
            return M0.N.f6666b.a();
        }
        long jS = interfaceC0900t.s(j6);
        long jS2 = interfaceC0900t.s(j10);
        int iP = p(k6.w(), jS, a6);
        int iP2 = p(k6.w(), jS2, a6);
        if (iP != -1) {
            if (iP2 != -1) {
                iP = java.lang.Math.min(iP, iP2);
            }
            iP2 = iP;
        } else if (iP2 == -1) {
            return M0.N.f6666b.a();
        }
        float fV = (k6.v(iP2) + k6.m(iP2)) / 2;
        return k6.w().z(new p131n0.i(java.lang.Math.min(p131n0.g.m(jS), p131n0.g.m(jS2)), fV - 0.1f, java.lang.Math.max(p131n0.g.m(jS), p131n0.g.m(jS2)), fV + 0.1f), M0.E.f6635a.a(), M0.I.f6638a.g());
    }

    private static final long u(M0.C1338j c1338j, p131n0.i iVar, D0.InterfaceC0900t interfaceC0900t, int i6, M0.I i10) {
        return (c1338j == null || interfaceC0900t == null) ? M0.N.f6666b.a() : c1338j.z(iVar.t(interfaceC0900t.s(p131n0.g.f51312b.c())), i6, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(H.C1230w c1230w, p131n0.i iVar, int i6, M0.I i10) {
        M0.K kF;
        H.V vJ = c1230w.j();
        return u((vJ == null || (kF = vJ.f()) == null) ? null : kF.w(), iVar, c1230w.i(), i6, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(K.y0 y0Var, p131n0.i iVar, int i6, M0.I i10) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long x(H.C1230w c1230w, p131n0.i iVar, p131n0.i iVar2, int i6, M0.I i10) {
        long jV = v(c1230w, iVar, i6, i10);
        if (!M0.N.h(jV)) {
            long jV2 = v(c1230w, iVar2, i6, i10);
            if (!M0.N.h(jV2)) {
                return o(jV, jV2);
            }
        }
        return M0.N.f6666b.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long y(K.y0 y0Var, p131n0.i iVar, p131n0.i iVar2, int i6, M0.I i10) {
        long jW = w(y0Var, iVar, i6, i10);
        if (!M0.N.h(jW)) {
            long jW2 = w(y0Var, iVar2, i6, i10);
            if (!M0.N.h(jW2)) {
                return o(jW, jW2);
            }
        }
        return M0.N.f6666b.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z(M0.K k6, int i6) {
        int iQ = k6.q(i6);
        if (i6 == k6.u(iQ) || i6 == M0.K.p(k6, iQ, false, 2, null)) {
            return k6.y(i6) != k6.c(i6);
        }
        return k6.c(i6) != k6.c(i6 - 1);
    }
}
