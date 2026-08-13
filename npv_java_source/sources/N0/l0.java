package N0;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.text.TextPaint f7585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f7586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f7587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final N0.M f7588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f7589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private O0.i f7590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final android.text.Layout f7591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f7592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f7593i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f7594j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f7595k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f7596l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f7597m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final android.graphics.Paint.FontMetricsInt f7598n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f7599o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final P0.h[] f7600p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final android.graphics.Rect f7601q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private N0.L f7602r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v7 */
    public l0(java.lang.CharSequence charSequence, float f6, android.text.TextPaint textPaint, int i6, android.text.TextUtils.TruncateAt truncateAt, int i10, float f10, float f11, boolean z6, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, N0.M m6) {
        boolean z11;
        boolean z12;
        android.text.TextDirectionHeuristic textDirectionHeuristic;
        android.text.Layout layoutA;
        this.f7585a = textPaint;
        this.f7586b = z6;
        this.f7587c = z10;
        this.f7588d = m6;
        this.f7601q = new android.graphics.Rect();
        int length = charSequence.length();
        android.text.TextDirectionHeuristic textDirectionHeuristicK = N0.n0.k(i10);
        android.text.Layout.Alignment alignmentA = N0.j0.f7579a.a(i6);
        boolean z13 = (charSequence instanceof android.text.Spanned) && ((android.text.Spanned) charSequence).nextSpanTransition(-1, length, P0.a.class) < length;
        android.os.Trace.beginSection("TextLayout:initLayout");
        try {
            android.text.BoringLayout.Metrics metricsA = m6.a();
            double d6 = f6;
            int iCeil = (int) java.lang.Math.ceil(d6);
            if (metricsA == null || m6.b() > f6 || z13) {
                z11 = true;
                this.f7597m = false;
                z12 = false;
                textDirectionHeuristic = textDirectionHeuristicK;
                layoutA = N0.g0.f7554a.a(charSequence, textPaint, iCeil, 0, charSequence.length(), textDirectionHeuristicK, alignmentA, i11, truncateAt, (int) java.lang.Math.ceil(d6), f10, f11, i16, z6, z10, i12, i13, i14, i15, iArr, iArr2);
            } else {
                this.f7597m = true;
                z11 = true;
                layoutA = N0.C1373k.f7582a.a(charSequence, textPaint, iCeil, metricsA, alignmentA, z6, z10, truncateAt, iCeil);
                textDirectionHeuristic = textDirectionHeuristicK;
                z12 = false;
            }
            this.f7591g = layoutA;
            android.os.Trace.endSection();
            int iMin = java.lang.Math.min(layoutA.getLineCount(), i11);
            this.f7592h = iMin;
            int i17 = iMin - 1;
            this.f7589e = (iMin >= i11 && (layoutA.getEllipsisCount(i17) > 0 || layoutA.getLineEnd(i17) != charSequence.length())) ? z11 : z12;
            long jL = N0.n0.l(this);
            P0.h[] hVarArrJ = N0.n0.j(this);
            this.f7600p = hVarArrJ;
            long jI = hVarArrJ != null ? N0.n0.i(hVarArrJ) : N0.n0.f7605b;
            this.f7593i = java.lang.Math.max(N0.o0.c(jL), N0.o0.c(jI));
            this.f7594j = java.lang.Math.max(N0.o0.b(jL), N0.o0.b(jI));
            android.graphics.Paint.FontMetricsInt fontMetricsIntH = N0.n0.h(this, textPaint, textDirectionHeuristic, hVarArrJ);
            this.f7599o = fontMetricsIntH != null ? fontMetricsIntH.bottom - ((int) s(i17)) : z12;
            this.f7598n = fontMetricsIntH;
            this.f7595k = P0.d.b(layoutA, i17, null, 2, null);
            this.f7596l = P0.d.d(layoutA, i17, null, 2, null);
        } catch (java.lang.Throwable th) {
            android.os.Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l0(java.lang.CharSequence charSequence, float f6, android.text.TextPaint textPaint, int i6, android.text.TextUtils.TruncateAt truncateAt, int i10, float f10, float f11, boolean z6, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int[] iArr, int[] iArr2, N0.M m6, int i17, p247y7.AbstractC7342k abstractC7342k) {
        int i18 = (i17 & 8) != 0 ? 0 : i6;
        android.text.TextUtils.TruncateAt truncateAt2 = (i17 & 16) != 0 ? null : truncateAt;
        int i19 = (i17 & 32) != 0 ? 2 : i10;
        this(charSequence, f6, textPaint, i18, truncateAt2, i19, (i17 & 64) != 0 ? 1.0f : f10, (i17 & 128) != 0 ? 0.0f : f11, (i17 & 256) != 0 ? false : z6, (i17 & 512) != 0 ? true : z10, (i17 & 1024) != 0 ? Integer.MAX_VALUE : i11, (i17 & 2048) != 0 ? 0 : i12, (i17 & 4096) != 0 ? 0 : i13, (i17 & 8192) != 0 ? 0 : i14, (i17 & 16384) != 0 ? 0 : i15, (32768 & i17) != 0 ? 0 : i16, (65536 & i17) != 0 ? null : iArr, (131072 & i17) != 0 ? null : iArr2, (i17 & 262144) != 0 ? new N0.M(charSequence, textPaint, i19) : m6);
    }

    public static /* synthetic */ float B(N0.l0 l0Var, int i6, boolean z6, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        return l0Var.A(i6, z6);
    }

    public static /* synthetic */ float E(N0.l0 l0Var, int i6, boolean z6, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        return l0Var.D(i6, z6);
    }

    private final float g(int i6) {
        if (i6 == this.f7592h - 1) {
            return this.f7595k + this.f7596l;
        }
        return 0.0f;
    }

    private final N0.L j() {
        N0.L l6 = this.f7602r;
        if (l6 != null) {
            p247y7.AbstractC7350t.c(l6);
            return l6;
        }
        N0.L l10 = new N0.L(this.f7591g);
        this.f7602r = l10;
        return l10;
    }

    public final float A(int i6, boolean z6) {
        return j().c(i6, true, z6) + g(q(i6));
    }

    public final int[] C(android.graphics.RectF rectF, int i6, p237x7.p pVar) {
        return android.os.Build.VERSION.SDK_INT >= 34 ? N0.C1368f.f7552a.c(this, rectF, i6, pVar) : N0.m0.d(this, this.f7591g, j(), rectF, i6, pVar);
    }

    public final float D(int i6, boolean z6) {
        return j().c(i6, false, z6) + g(q(i6));
    }

    public final void F(int i6, int i10, android.graphics.Path path) {
        this.f7591g.getSelectionPath(i6, i10, path);
        if (this.f7593i == 0 || path.isEmpty()) {
            return;
        }
        path.offset(0.0f, this.f7593i);
    }

    public final java.lang.CharSequence G() {
        return this.f7591g.getText();
    }

    public final android.text.TextPaint H() {
        return this.f7585a;
    }

    public final O0.i I() {
        O0.i iVar = this.f7590f;
        if (iVar != null) {
            return iVar;
        }
        O0.i iVar2 = new O0.i(this.f7591g.getText(), 0, this.f7591g.getText().length(), this.f7585a.getTextLocale());
        this.f7590f = iVar2;
        return iVar2;
    }

    public final boolean J() {
        if (this.f7597m) {
            N0.C1373k c1373k = N0.C1373k.f7582a;
            android.text.Layout layout = this.f7591g;
            p247y7.AbstractC7350t.d(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return c1373k.b((android.text.BoringLayout) layout);
        }
        N0.g0 g0Var = N0.g0.f7554a;
        android.text.Layout layout2 = this.f7591g;
        p247y7.AbstractC7350t.d(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return g0Var.c((android.text.StaticLayout) layout2, this.f7587c);
    }

    public final boolean K(int i6) {
        return this.f7591g.isRtlCharAt(i6);
    }

    public final void L(android.graphics.Canvas canvas) {
        if (canvas.getClipBounds(this.f7601q)) {
            int i6 = this.f7593i;
            if (i6 != 0) {
                canvas.translate(0.0f, i6);
            }
            N0.k0 k0Var = N0.n0.f7604a;
            k0Var.a(canvas);
            this.f7591g.draw(k0Var);
            int i10 = this.f7593i;
            if (i10 != 0) {
                canvas.translate(0.0f, (-1) * i10);
            }
        }
    }

    public final void a(int i6, int i10, float[] fArr, int i11) {
        float fD;
        float fE;
        int length = G().length();
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException("startOffset must be > 0".toString());
        }
        if (i6 >= length) {
            throw new java.lang.IllegalArgumentException("startOffset must be less than text length".toString());
        }
        if (i10 <= i6) {
            throw new java.lang.IllegalArgumentException("endOffset must be greater than startOffset".toString());
        }
        if (i10 > length) {
            throw new java.lang.IllegalArgumentException("endOffset must be smaller or equal to text length".toString());
        }
        if (fArr.length - i11 < (i10 - i6) * 4) {
            throw new java.lang.IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4".toString());
        }
        int iQ = q(i6);
        int iQ2 = q(i10 - 1);
        N0.I i12 = new N0.I(this);
        if (iQ > iQ2) {
            return;
        }
        while (true) {
            int iV = v(iQ);
            int iP = p(iQ);
            int iMin = java.lang.Math.min(i10, iP);
            float fW = w(iQ);
            float fL = l(iQ);
            boolean z6 = z(iQ) == 1;
            boolean z10 = !z6;
            for (int iMax = java.lang.Math.max(i6, iV); iMax < iMin; iMax++) {
                boolean zK = K(iMax);
                if (z6 && !zK) {
                    fD = i12.b(iMax);
                    fE = i12.c(iMax + 1);
                } else if (z6 && zK) {
                    fE = i12.d(iMax);
                    fD = i12.e(iMax + 1);
                } else if (z10 && zK) {
                    fE = i12.b(iMax);
                    fD = i12.c(iMax + 1);
                } else {
                    fD = i12.d(iMax);
                    fE = i12.e(iMax + 1);
                }
                fArr[i11] = fD;
                fArr[i11 + 1] = fW;
                fArr[i11 + 2] = fE;
                fArr[i11 + 3] = fL;
                i11 += 4;
            }
            if (iQ == iQ2) {
                return;
            } else {
                iQ++;
            }
        }
    }

    public final void b(int i6, float[] fArr) {
        float fD;
        float fE;
        int iV = v(i6);
        int iP = p(i6);
        if (fArr.length < (iP - iV) * 2) {
            throw new java.lang.IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2".toString());
        }
        N0.I i10 = new N0.I(this);
        int i11 = 0;
        boolean z6 = z(i6) == 1;
        while (iV < iP) {
            boolean zK = K(iV);
            if (z6 && !zK) {
                fD = i10.b(iV);
                fE = i10.c(iV + 1);
            } else if (z6 && zK) {
                fE = i10.d(iV);
                fD = i10.e(iV + 1);
            } else if (zK) {
                fE = i10.b(iV);
                fD = i10.c(iV + 1);
            } else {
                fD = i10.d(iV);
                fE = i10.e(iV + 1);
            }
            fArr[i11] = fD;
            fArr[i11 + 1] = fE;
            i11 += 2;
            iV++;
        }
    }

    public final android.graphics.RectF c(int i6) {
        float fD;
        float fD2;
        float fA;
        float fA2;
        int iQ = q(i6);
        float fW = w(iQ);
        float fL = l(iQ);
        boolean z6 = z(iQ) == 1;
        boolean zIsRtlCharAt = this.f7591g.isRtlCharAt(i6);
        if (!z6 || zIsRtlCharAt) {
            if (z6 && zIsRtlCharAt) {
                fA = D(i6, false);
                fA2 = D(i6 + 1, true);
            } else if (zIsRtlCharAt) {
                fA = A(i6, false);
                fA2 = A(i6 + 1, true);
            } else {
                fD = D(i6, false);
                fD2 = D(i6 + 1, true);
            }
            float f6 = fA;
            fD = fA2;
            fD2 = f6;
        } else {
            fD = A(i6, false);
            fD2 = A(i6 + 1, true);
        }
        return new android.graphics.RectF(fD, fW, fD2, fL);
    }

    public final boolean d() {
        return this.f7589e;
    }

    public final boolean e() {
        return this.f7587c;
    }

    public final int f() {
        return (this.f7589e ? this.f7591g.getLineBottom(this.f7592h - 1) : this.f7591g.getHeight()) + this.f7593i + this.f7594j + this.f7599o;
    }

    public final boolean h() {
        return this.f7586b;
    }

    public final android.text.Layout i() {
        return this.f7591g;
    }

    public final float k(int i6) {
        return this.f7593i + ((i6 != this.f7592h + (-1) || this.f7598n == null) ? this.f7591g.getLineBaseline(i6) : w(i6) - this.f7598n.ascent);
    }

    public final float l(int i6) {
        if (i6 != this.f7592h - 1 || this.f7598n == null) {
            return this.f7593i + this.f7591g.getLineBottom(i6) + (i6 == this.f7592h + (-1) ? this.f7594j : 0);
        }
        return this.f7591g.getLineBottom(i6 - 1) + this.f7598n.bottom;
    }

    public final int m() {
        return this.f7592h;
    }

    public final int n(int i6) {
        return this.f7591g.getEllipsisCount(i6);
    }

    public final int o(int i6) {
        return this.f7591g.getEllipsisStart(i6);
    }

    public final int p(int i6) {
        return this.f7591g.getEllipsisStart(i6) == 0 ? this.f7591g.getLineEnd(i6) : this.f7591g.getText().length();
    }

    public final int q(int i6) {
        return this.f7591g.getLineForOffset(i6);
    }

    public final int r(int i6) {
        return this.f7591g.getLineForVertical(i6 - this.f7593i);
    }

    public final float s(int i6) {
        return l(i6) - w(i6);
    }

    public final float t(int i6) {
        return this.f7591g.getLineLeft(i6) + (i6 == this.f7592h + (-1) ? this.f7595k : 0.0f);
    }

    public final float u(int i6) {
        return this.f7591g.getLineRight(i6) + (i6 == this.f7592h + (-1) ? this.f7596l : 0.0f);
    }

    public final int v(int i6) {
        return this.f7591g.getLineStart(i6);
    }

    public final float w(int i6) {
        return this.f7591g.getLineTop(i6) + (i6 == 0 ? 0 : this.f7593i);
    }

    public final int x(int i6) {
        if (this.f7591g.getEllipsisStart(i6) == 0) {
            return j().e(i6);
        }
        return this.f7591g.getEllipsisStart(i6) + this.f7591g.getLineStart(i6);
    }

    public final int y(int i6, float f6) {
        return this.f7591g.getOffsetForHorizontal(i6, f6 + ((-1) * g(i6)));
    }

    public final int z(int i6) {
        return this.f7591g.getParagraphDirection(i6);
    }
}
