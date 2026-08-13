package K;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K.i0 f5861a = new K.i0();

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p247y7.M f5862D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p247y7.M f5863E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p247y7.M m6, p247y7.M m10) {
            super(1);
            this.f5862D = m6;
            this.f5863E = m10;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.CharSequence l(S8.InterfaceC1639l interfaceC1639l) {
            p247y7.M m6 = this.f5862D;
            if (m6.f57252C == -1) {
                m6.f57252C = interfaceC1639l.d().f();
            }
            this.f5863E.f57252C = interfaceC1639l.d().g() + 1;
            return "";
        }
    }

    private i0() {
    }

    private final void A(K.z0 z0Var, android.view.inputmethod.DeleteGesture deleteGesture, K.y0 y0Var) {
        e(z0Var, K.j0.w(y0Var, p141o0.X1.f(deleteGesture.getDeletionArea()), L(deleteGesture.getGranularity()), M0.I.f6638a.h()), J.d.f5556a.a());
    }

    private final void B(H.C1230w c1230w, android.view.inputmethod.DeleteRangeGesture deleteRangeGesture, N.F f6) {
        if (f6 != null) {
            f6.X(K.j0.x(c1230w, p141o0.X1.f(deleteRangeGesture.getDeletionStartArea()), p141o0.X1.f(deleteRangeGesture.getDeletionEndArea()), L(deleteRangeGesture.getGranularity()), M0.I.f6638a.h()));
        }
    }

    private final void C(K.z0 z0Var, android.view.inputmethod.DeleteRangeGesture deleteRangeGesture, K.y0 y0Var) {
        e(z0Var, K.j0.y(y0Var, p141o0.X1.f(deleteRangeGesture.getDeletionStartArea()), p141o0.X1.f(deleteRangeGesture.getDeletionEndArea()), L(deleteRangeGesture.getGranularity()), M0.I.f6638a.h()), J.d.f5556a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(K.z0 z0Var) {
        K.z0.b(z0Var);
        K.z0.a(z0Var);
        L.a aVar = L.a.MergeIfPossible;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(N.F f6) {
        if (f6 != null) {
            f6.n();
        }
    }

    private final void H(H.C1230w c1230w, android.view.inputmethod.SelectGesture selectGesture, N.F f6) {
        if (f6 != null) {
            f6.g0(K.j0.v(c1230w, p141o0.X1.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), M0.I.f6638a.h()));
        }
    }

    private final void I(K.z0 z0Var, android.view.inputmethod.SelectGesture selectGesture, K.y0 y0Var) {
        e(z0Var, K.j0.w(y0Var, p141o0.X1.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), M0.I.f6638a.h()), J.d.f5556a.b());
    }

    private final void J(H.C1230w c1230w, android.view.inputmethod.SelectRangeGesture selectRangeGesture, N.F f6) {
        if (f6 != null) {
            f6.g0(K.j0.x(c1230w, p141o0.X1.f(selectRangeGesture.getSelectionStartArea()), p141o0.X1.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), M0.I.f6638a.h()));
        }
    }

    private final void K(K.z0 z0Var, android.view.inputmethod.SelectRangeGesture selectRangeGesture, K.y0 y0Var) {
        e(z0Var, K.j0.y(y0Var, p141o0.X1.f(selectRangeGesture.getSelectionStartArea()), p141o0.X1.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), M0.I.f6638a.h()), J.d.f5556a.b());
    }

    private final int L(int i6) {
        return i6 != 1 ? M0.E.f6635a.a() : M0.E.f6635a.b();
    }

    private final int c(K.z0 z0Var, android.view.inputmethod.HandwritingGesture handwritingGesture) {
        K.z0.b(z0Var);
        K.z0.a(z0Var);
        L.a aVar = L.a.MergeIfPossible;
        throw null;
    }

    private final int d(android.view.inputmethod.HandwritingGesture handwritingGesture, p237x7.l lVar) {
        java.lang.String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        lVar.l(new S0.C1593a(fallbackText, 1));
        return 5;
    }

    private final void e(K.z0 z0Var, long j6, int i6) {
        if (!M0.N.h(j6)) {
            throw null;
        }
        K.z0.b(z0Var);
        K.z0.a(z0Var);
        L.a aVar = L.a.MergeIfPossible;
        throw null;
    }

    private final int f(H.C1230w c1230w, android.view.inputmethod.DeleteGesture deleteGesture, M0.C1332d c1332d, p237x7.l lVar) {
        int iL = L(deleteGesture.getGranularity());
        long jV = K.j0.v(c1230w, p141o0.X1.f(deleteGesture.getDeletionArea()), iL, M0.I.f6638a.h());
        if (M0.N.h(jV)) {
            return f5861a.d(K.d0.a(deleteGesture), lVar);
        }
        k(jV, c1332d, M0.E.d(iL, M0.E.f6635a.b()), lVar);
        return 1;
    }

    private final int g(K.z0 z0Var, android.view.inputmethod.DeleteGesture deleteGesture, K.y0 y0Var) {
        int iL = L(deleteGesture.getGranularity());
        long jW = K.j0.w(y0Var, p141o0.X1.f(deleteGesture.getDeletionArea()), iL, M0.I.f6638a.h());
        if (M0.N.h(jW)) {
            return f5861a.c(z0Var, K.d0.a(deleteGesture));
        }
        j(z0Var, jW, M0.E.d(iL, M0.E.f6635a.b()));
        return 1;
    }

    private final int h(H.C1230w c1230w, android.view.inputmethod.DeleteRangeGesture deleteRangeGesture, M0.C1332d c1332d, p237x7.l lVar) {
        int iL = L(deleteRangeGesture.getGranularity());
        long jX = K.j0.x(c1230w, p141o0.X1.f(deleteRangeGesture.getDeletionStartArea()), p141o0.X1.f(deleteRangeGesture.getDeletionEndArea()), iL, M0.I.f6638a.h());
        if (M0.N.h(jX)) {
            return f5861a.d(K.d0.a(deleteRangeGesture), lVar);
        }
        k(jX, c1332d, M0.E.d(iL, M0.E.f6635a.b()), lVar);
        return 1;
    }

    private final int i(K.z0 z0Var, android.view.inputmethod.DeleteRangeGesture deleteRangeGesture, K.y0 y0Var) {
        int iL = L(deleteRangeGesture.getGranularity());
        long jY = K.j0.y(y0Var, p141o0.X1.f(deleteRangeGesture.getDeletionStartArea()), p141o0.X1.f(deleteRangeGesture.getDeletionEndArea()), iL, M0.I.f6638a.h());
        if (M0.N.h(jY)) {
            return f5861a.c(z0Var, K.d0.a(deleteRangeGesture));
        }
        j(z0Var, jY, M0.E.d(iL, M0.E.f6635a.b()));
        return 1;
    }

    private final void j(K.z0 z0Var, long j6, boolean z6) {
        if (z6) {
            throw null;
        }
        K.z0.c(z0Var, "", j6, null, false, 12, null);
    }

    private final void k(long j6, M0.C1332d c1332d, boolean z6, p237x7.l lVar) {
        if (z6) {
            j6 = K.j0.m(j6, c1332d);
        }
        lVar.l(K.j0.n(new S0.U(M0.N.i(j6), M0.N.i(j6)), new S0.C1599g(M0.N.j(j6), 0)));
    }

    private final int n(H.C1230w c1230w, android.view.inputmethod.InsertGesture insertGesture, androidx.compose.ui.platform.A1 a6, p237x7.l lVar) {
        int iQ;
        H.V vJ;
        M0.K kF;
        if (a6 == null || (iQ = K.j0.q(c1230w, K.j0.F(insertGesture.getInsertionPoint()), a6)) == -1 || ((vJ = c1230w.j()) != null && (kF = vJ.f()) != null && K.j0.z(kF, iQ))) {
            return d(K.d0.a(insertGesture), lVar);
        }
        p(iQ, insertGesture.getTextToInsert(), lVar);
        return 1;
    }

    private final int o(K.z0 z0Var, android.view.inputmethod.InsertGesture insertGesture, K.y0 y0Var, androidx.compose.ui.platform.A1 a6) {
        int iR = K.j0.r(y0Var, K.j0.F(insertGesture.getInsertionPoint()), a6);
        if (iR == -1) {
            return c(z0Var, K.d0.a(insertGesture));
        }
        K.z0.c(z0Var, insertGesture.getTextToInsert(), M0.O.a(iR), null, false, 12, null);
        return 1;
    }

    private final void p(int i6, java.lang.String str, p237x7.l lVar) {
        lVar.l(K.j0.n(new S0.U(i6, i6), new S0.C1593a(str, 1)));
    }

    private final int q(H.C1230w c1230w, android.view.inputmethod.JoinOrSplitGesture joinOrSplitGesture, M0.C1332d c1332d, androidx.compose.ui.platform.A1 a6, p237x7.l lVar) {
        int iQ;
        H.V vJ;
        M0.K kF;
        if (a6 == null || (iQ = K.j0.q(c1230w, K.j0.F(joinOrSplitGesture.getJoinOrSplitPoint()), a6)) == -1 || ((vJ = c1230w.j()) != null && (kF = vJ.f()) != null && K.j0.z(kF, iQ))) {
            return d(K.d0.a(joinOrSplitGesture), lVar);
        }
        long jE = K.j0.E(c1332d, iQ);
        if (M0.N.h(jE)) {
            p(M0.N.n(jE), " ", lVar);
        } else {
            k(jE, c1332d, false, lVar);
        }
        return 1;
    }

    private final int r(K.z0 z0Var, android.view.inputmethod.JoinOrSplitGesture joinOrSplitGesture, K.y0 y0Var, androidx.compose.ui.platform.A1 a6) {
        throw null;
    }

    private final int s(H.C1230w c1230w, android.view.inputmethod.RemoveSpaceGesture removeSpaceGesture, M0.C1332d c1332d, androidx.compose.ui.platform.A1 a6, p237x7.l lVar) {
        H.V vJ = c1230w.j();
        long jT = K.j0.t(vJ != null ? vJ.f() : null, K.j0.F(removeSpaceGesture.getStartPoint()), K.j0.F(removeSpaceGesture.getEndPoint()), c1230w.i(), a6);
        if (M0.N.h(jT)) {
            return f5861a.d(K.d0.a(removeSpaceGesture), lVar);
        }
        p247y7.M m6 = new p247y7.M();
        m6.f57252C = -1;
        p247y7.M m10 = new p247y7.M();
        m10.f57252C = -1;
        java.lang.String strF = new S8.o("\\s+").f(M0.O.e(c1332d, jT), new K.i0.a(m6, m10));
        if (m6.f57252C == -1 || m10.f57252C == -1) {
            return d(K.d0.a(removeSpaceGesture), lVar);
        }
        int iN = M0.N.n(jT) + m6.f57252C;
        int iN2 = M0.N.n(jT) + m10.f57252C;
        java.lang.String strSubstring = strF.substring(m6.f57252C, strF.length() - (M0.N.j(jT) - m10.f57252C));
        p247y7.AbstractC7350t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        lVar.l(K.j0.n(new S0.U(iN, iN2), new S0.C1593a(strSubstring, 1)));
        return 1;
    }

    private final int t(K.z0 z0Var, android.view.inputmethod.RemoveSpaceGesture removeSpaceGesture, K.y0 y0Var, androidx.compose.ui.platform.A1 a6) {
        throw null;
    }

    private final int u(H.C1230w c1230w, android.view.inputmethod.SelectGesture selectGesture, N.F f6, p237x7.l lVar) {
        long jV = K.j0.v(c1230w, p141o0.X1.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), M0.I.f6638a.h());
        if (M0.N.h(jV)) {
            return f5861a.d(K.d0.a(selectGesture), lVar);
        }
        y(jV, f6, lVar);
        return 1;
    }

    private final int v(K.z0 z0Var, android.view.inputmethod.SelectGesture selectGesture, K.y0 y0Var) {
        if (M0.N.h(K.j0.w(y0Var, p141o0.X1.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), M0.I.f6638a.h()))) {
            return f5861a.c(z0Var, K.d0.a(selectGesture));
        }
        throw null;
    }

    private final int w(H.C1230w c1230w, android.view.inputmethod.SelectRangeGesture selectRangeGesture, N.F f6, p237x7.l lVar) {
        long jX = K.j0.x(c1230w, p141o0.X1.f(selectRangeGesture.getSelectionStartArea()), p141o0.X1.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), M0.I.f6638a.h());
        if (M0.N.h(jX)) {
            return f5861a.d(K.d0.a(selectRangeGesture), lVar);
        }
        y(jX, f6, lVar);
        return 1;
    }

    private final int x(K.z0 z0Var, android.view.inputmethod.SelectRangeGesture selectRangeGesture, K.y0 y0Var) {
        if (M0.N.h(K.j0.y(y0Var, p141o0.X1.f(selectRangeGesture.getSelectionStartArea()), p141o0.X1.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), M0.I.f6638a.h()))) {
            return f5861a.c(z0Var, K.d0.a(selectRangeGesture));
        }
        throw null;
    }

    private final void y(long j6, N.F f6, p237x7.l lVar) {
        lVar.l(new S0.U(M0.N.n(j6), M0.N.i(j6)));
        if (f6 != null) {
            f6.v(true);
        }
    }

    private final void z(H.C1230w c1230w, android.view.inputmethod.DeleteGesture deleteGesture, N.F f6) {
        if (f6 != null) {
            f6.X(K.j0.v(c1230w, p141o0.X1.f(deleteGesture.getDeletionArea()), L(deleteGesture.getGranularity()), M0.I.f6638a.h()));
        }
    }

    public final boolean D(H.C1230w c1230w, android.view.inputmethod.PreviewableHandwritingGesture previewableHandwritingGesture, final N.F f6, android.os.CancellationSignal cancellationSignal) {
        M0.K kF;
        M0.J jL;
        M0.C1332d c1332dW = c1230w.w();
        if (c1332dW == null) {
            return false;
        }
        H.V vJ = c1230w.j();
        if (!p247y7.AbstractC7350t.b(c1332dW, (vJ == null || (kF = vJ.f()) == null || (jL = kF.l()) == null) ? null : jL.j())) {
            return false;
        }
        if (K.e0.a(previewableHandwritingGesture)) {
            H(c1230w, K.f0.a(previewableHandwritingGesture), f6);
        } else if (K.B.a(previewableHandwritingGesture)) {
            z(c1230w, K.C.a(previewableHandwritingGesture), f6);
        } else if (K.D.a(previewableHandwritingGesture)) {
            J(c1230w, K.E.a(previewableHandwritingGesture), f6);
        } else {
            if (!K.F.a(previewableHandwritingGesture)) {
                return false;
            }
            B(c1230w, K.G.a(previewableHandwritingGesture), f6);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() { // from class: K.g0
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                K.i0.G(f6);
            }
        });
        return true;
    }

    public final boolean E(final K.z0 z0Var, android.view.inputmethod.PreviewableHandwritingGesture previewableHandwritingGesture, K.y0 y0Var, android.os.CancellationSignal cancellationSignal) {
        if (K.e0.a(previewableHandwritingGesture)) {
            I(z0Var, K.f0.a(previewableHandwritingGesture), y0Var);
        } else if (K.B.a(previewableHandwritingGesture)) {
            A(z0Var, K.C.a(previewableHandwritingGesture), y0Var);
        } else if (K.D.a(previewableHandwritingGesture)) {
            K(z0Var, K.E.a(previewableHandwritingGesture), y0Var);
        } else {
            if (!K.F.a(previewableHandwritingGesture)) {
                return false;
            }
            C(z0Var, K.G.a(previewableHandwritingGesture), y0Var);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener(z0Var) { // from class: K.h0
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                K.i0.F(null);
            }
        });
        return true;
    }

    public final int l(H.C1230w c1230w, android.view.inputmethod.HandwritingGesture handwritingGesture, N.F f6, androidx.compose.ui.platform.A1 a6, p237x7.l lVar) {
        M0.K kF;
        M0.J jL;
        M0.C1332d c1332dW = c1230w.w();
        if (c1332dW == null) {
            return 3;
        }
        H.V vJ = c1230w.j();
        if (!p247y7.AbstractC7350t.b(c1332dW, (vJ == null || (kF = vJ.f()) == null || (jL = kF.l()) == null) ? null : jL.j())) {
            return 3;
        }
        if (K.e0.a(handwritingGesture)) {
            return u(c1230w, K.f0.a(handwritingGesture), f6, lVar);
        }
        if (K.B.a(handwritingGesture)) {
            return f(c1230w, K.C.a(handwritingGesture), c1332dW, lVar);
        }
        if (K.D.a(handwritingGesture)) {
            return w(c1230w, K.E.a(handwritingGesture), f6, lVar);
        }
        if (K.F.a(handwritingGesture)) {
            return h(c1230w, K.G.a(handwritingGesture), c1332dW, lVar);
        }
        if (K.O.a(handwritingGesture)) {
            return q(c1230w, K.P.a(handwritingGesture), c1332dW, a6, lVar);
        }
        if (K.J.a(handwritingGesture)) {
            return n(c1230w, K.K.a(handwritingGesture), a6, lVar);
        }
        if (K.M.a(handwritingGesture)) {
            return s(c1230w, K.N.a(handwritingGesture), c1332dW, a6, lVar);
        }
        return 2;
    }

    public final int m(K.z0 z0Var, android.view.inputmethod.HandwritingGesture handwritingGesture, K.y0 y0Var, androidx.compose.ui.platform.A1 a6) {
        if (K.e0.a(handwritingGesture)) {
            return v(z0Var, K.f0.a(handwritingGesture), y0Var);
        }
        if (K.B.a(handwritingGesture)) {
            return g(z0Var, K.C.a(handwritingGesture), y0Var);
        }
        if (K.D.a(handwritingGesture)) {
            return x(z0Var, K.E.a(handwritingGesture), y0Var);
        }
        if (K.F.a(handwritingGesture)) {
            return i(z0Var, K.G.a(handwritingGesture), y0Var);
        }
        if (K.O.a(handwritingGesture)) {
            return r(z0Var, K.P.a(handwritingGesture), y0Var, a6);
        }
        if (K.J.a(handwritingGesture)) {
            return o(z0Var, K.K.a(handwritingGesture), y0Var, a6);
        }
        if (K.M.a(handwritingGesture)) {
            return t(z0Var, K.N.a(handwritingGesture), y0Var, a6);
        }
        return 2;
    }
}
