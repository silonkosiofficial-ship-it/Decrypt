package N0;

/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {
    private static final float a(int i6, int i10, float[] fArr) {
        return fArr[(i6 - i10) * 2];
    }

    private static final float b(int i6, int i10, float[] fArr) {
        return fArr[((i6 - i10) * 2) + 1];
    }

    private static final int c(N0.L.a aVar, android.graphics.RectF rectF, int i6, int i10, int i11, float f6, float f10, float[] fArr, O0.f fVar, p237x7.p pVar) {
        int iB;
        int iD;
        if (!g(rectF, f6, f10)) {
            return -1;
        }
        if ((aVar.c() || rectF.right < f10) && (!aVar.c() || rectF.left > f6)) {
            iB = aVar.b();
            int iA = aVar.a();
            while (iA - iB > 1) {
                int i12 = (iA + iB) / 2;
                float fA = a(i12, i6, fArr);
                if ((aVar.c() || fA <= rectF.right) && (!aVar.c() || fA >= rectF.left)) {
                    iB = i12;
                } else {
                    iA = i12;
                }
            }
            if (aVar.c()) {
                iB = iA;
            }
        } else {
            iB = aVar.a() - 1;
        }
        int iC = fVar.c(iB + 1);
        if (iC == -1 || (iD = fVar.d(iC)) <= aVar.b()) {
            return -1;
        }
        int iD2 = E7.j.d(iC, aVar.b());
        int iG = E7.j.g(iD, aVar.a());
        android.graphics.RectF rectF2 = new android.graphics.RectF(0.0f, i10, 0.0f, i11);
        while (true) {
            rectF2.left = aVar.c() ? a(iG - 1, i6, fArr) : a(iD2, i6, fArr);
            rectF2.right = aVar.c() ? b(iD2, i6, fArr) : b(iG - 1, i6, fArr);
            if (((java.lang.Boolean) pVar.u(rectF2, rectF)).booleanValue()) {
                return iG;
            }
            iG = fVar.b(iG);
            if (iG == -1 || iG <= aVar.b()) {
                return -1;
            }
            iD2 = E7.j.d(fVar.c(iG), aVar.b());
        }
    }

    public static final int[] d(N0.l0 l0Var, android.text.Layout layout, N0.L l6, android.graphics.RectF rectF, int i6, p237x7.p pVar) {
        int iF;
        int i10;
        int iF2;
        O0.f jVar = i6 == 1 ? new O0.j(l0Var.G(), l0Var.I()) : O0.g.a(l0Var.G(), l0Var.H());
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > l0Var.l(lineForVertical) && (lineForVertical = lineForVertical + 1) >= l0Var.m()) {
            return null;
        }
        int i11 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < l0Var.w(0)) {
            return null;
        }
        while (true) {
            iF = f(l0Var, layout, l6, i11, rectF, jVar, pVar, true);
            i10 = i11;
            if (iF != -1 || i10 >= lineForVertical2) {
                break;
            }
            i11 = i10 + 1;
        }
        if (iF == -1) {
            return null;
        }
        int i12 = lineForVertical2;
        boolean z6 = false;
        while (true) {
            iF2 = f(l0Var, layout, l6, i12, rectF, jVar, pVar, z6);
            if (iF2 != -1 || i10 >= lineForVertical2) {
                break;
            }
            lineForVertical2--;
            z6 = false;
            i12 = lineForVertical2;
        }
        if (iF2 == -1) {
            return null;
        }
        return new int[]{jVar.c(iF + 1), jVar.d(iF2 - 1)};
    }

    private static final int e(N0.L.a aVar, android.graphics.RectF rectF, int i6, int i10, int i11, float f6, float f10, float[] fArr, O0.f fVar, p237x7.p pVar) {
        int iB;
        int iC;
        if (!g(rectF, f6, f10)) {
            return -1;
        }
        if ((aVar.c() || rectF.left > f6) && (!aVar.c() || rectF.right < f10)) {
            iB = aVar.b();
            int iA = aVar.a();
            while (iA - iB > 1) {
                int i12 = (iA + iB) / 2;
                float fA = a(i12, i6, fArr);
                if ((aVar.c() || fA <= rectF.left) && (!aVar.c() || fA >= rectF.right)) {
                    iB = i12;
                } else {
                    iA = i12;
                }
            }
            if (aVar.c()) {
                iB = iA;
            }
        } else {
            iB = aVar.b();
        }
        int iD = fVar.d(iB);
        if (iD == -1 || (iC = fVar.c(iD)) >= aVar.a()) {
            return -1;
        }
        int iD2 = E7.j.d(iC, aVar.b());
        int iG = E7.j.g(iD, aVar.a());
        android.graphics.RectF rectF2 = new android.graphics.RectF(0.0f, i10, 0.0f, i11);
        while (true) {
            rectF2.left = aVar.c() ? a(iG - 1, i6, fArr) : a(iD2, i6, fArr);
            rectF2.right = aVar.c() ? b(iD2, i6, fArr) : b(iG - 1, i6, fArr);
            if (((java.lang.Boolean) pVar.u(rectF2, rectF)).booleanValue()) {
                return iD2;
            }
            iD2 = fVar.a(iD2);
            if (iD2 == -1 || iD2 >= aVar.a()) {
                return -1;
            }
            iG = E7.j.g(fVar.d(iD2), aVar.a());
        }
    }

    private static final int f(N0.l0 l0Var, android.text.Layout layout, N0.L l6, int i6, android.graphics.RectF rectF, O0.f fVar, p237x7.p pVar, boolean z6) {
        int lineTop = layout.getLineTop(i6);
        int lineBottom = layout.getLineBottom(i6);
        int lineStart = layout.getLineStart(i6);
        int lineEnd = layout.getLineEnd(i6);
        if (lineStart == lineEnd) {
            return -1;
        }
        float[] fArr = new float[(lineEnd - lineStart) * 2];
        l0Var.b(i6, fArr);
        N0.L.a[] aVarArrD = l6.d(i6);
        E7.g gVarB0 = z6 ? p097j7.AbstractC6872n.b0(aVarArrD) : E7.j.n(p097j7.AbstractC6872n.e0(aVarArrD), 0);
        int iF = gVarB0.f();
        int iG = gVarB0.g();
        int iO = gVarB0.o();
        if ((iO <= 0 || iF > iG) && (iO >= 0 || iG > iF)) {
            return -1;
        }
        int i10 = iF;
        while (true) {
            N0.L.a aVar = aVarArrD[i10];
            float fA = a(aVar.c() ? aVar.a() - 1 : aVar.b(), lineStart, fArr);
            float fB = b(aVar.c() ? aVar.b() : aVar.a() - 1, lineStart, fArr);
            int iE = z6 ? e(aVar, rectF, lineStart, lineTop, lineBottom, fA, fB, fArr, fVar, pVar) : c(aVar, rectF, lineStart, lineTop, lineBottom, fA, fB, fArr, fVar, pVar);
            if (iE >= 0) {
                return iE;
            }
            if (i10 == iG) {
                return -1;
            }
            i10 += iO;
            iG = iG;
            aVarArrD = aVarArrD;
        }
    }

    private static final boolean g(android.graphics.RectF rectF, float f6, float f10) {
        return f10 >= rectF.left && f6 <= rectF.right;
    }
}
