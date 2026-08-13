package S0;

/* JADX INFO: renamed from: S0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1596d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [int] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r17v0, types: [android.view.inputmethod.CursorAnchorInfo$Builder] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder a(android.view.inputmethod.CursorAnchorInfo.Builder builder, int i6, int i10, S0.L l6, M0.K k6, p131n0.i iVar) {
        ?? r10;
        int i11 = i6;
        int iB = l6.b(i11);
        int iB2 = l6.b(i10);
        float[] fArr = new float[(iB2 - iB) * 4];
        k6.w().a(M0.O.b(iB, iB2), fArr, 0);
        while (i11 < i10) {
            int iB3 = l6.b(i11);
            int i12 = (iB3 - iB) * 4;
            p131n0.i iVar2 = new p131n0.i(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i12 + 3]);
            boolean zR = iVar.r(iVar2);
            if (!c(iVar, iVar2.i(), iVar2.l()) || !c(iVar, iVar2.j(), iVar2.e())) {
                r10 = zR;
                r10 = (zR ? 1 : 0) | 2;
            }
            r10 = zR;
            builder.addCharacterBounds(i11, iVar2.i(), iVar2.l(), iVar2.j(), iVar2.e(), k6.c(iB3) == X0.i.Rtl ? r10 | 4 : r10);
            i11++;
        }
        return builder;
    }

    public static final android.view.inputmethod.CursorAnchorInfo b(android.view.inputmethod.CursorAnchorInfo.Builder builder, S0.V v6, S0.L l6, M0.K k6, android.graphics.Matrix matrix, p131n0.i iVar, p131n0.i iVar2, boolean z6, boolean z10, boolean z11, boolean z12) {
        builder.reset();
        builder.setMatrix(matrix);
        int iL = M0.N.l(v6.h());
        builder.setSelectionRange(iL, M0.N.k(v6.h()));
        if (z6) {
            d(builder, iL, l6, k6, iVar);
        }
        if (z10) {
            M0.N nG = v6.g();
            int iL2 = nG != null ? M0.N.l(nG.r()) : -1;
            M0.N nG2 = v6.g();
            int iK = nG2 != null ? M0.N.k(nG2.r()) : -1;
            if (iL2 >= 0 && iL2 < iK) {
                builder.setComposingText(iL2, v6.i().subSequence(iL2, iK));
                a(builder, iL2, iK, l6, k6, iVar);
            }
        }
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 >= 33 && z11) {
            S0.C1594b.a(builder, iVar2);
        }
        if (i6 >= 34 && z12) {
            S0.C1595c.a(builder, k6, iVar);
        }
        return builder.build();
    }

    private static final boolean c(p131n0.i iVar, float f6, float f10) {
        float fI = iVar.i();
        if (f6 <= iVar.j() && fI <= f6) {
            float fL = iVar.l();
            if (f10 <= iVar.e() && fL <= f10) {
                return true;
            }
        }
        return false;
    }

    private static final android.view.inputmethod.CursorAnchorInfo.Builder d(android.view.inputmethod.CursorAnchorInfo.Builder builder, int i6, S0.L l6, M0.K k6, p131n0.i iVar) {
        if (i6 < 0) {
            return builder;
        }
        int iB = l6.b(i6);
        p131n0.i iVarE = k6.e(iB);
        float fJ = E7.j.j(iVarE.i(), 0.0f, Y0.t.g(k6.B()));
        boolean zC = c(iVar, fJ, iVarE.l());
        boolean zC2 = c(iVar, fJ, iVarE.e());
        boolean z6 = k6.c(iB) == X0.i.Rtl;
        int i10 = (zC || zC2) ? 1 : 0;
        if (!zC || !zC2) {
            i10 |= 2;
        }
        builder.setInsertionMarkerLocation(fJ, iVarE.l(), iVarE.e(), iVarE.e(), z6 ? i10 | 4 : i10);
        return builder;
    }
}
