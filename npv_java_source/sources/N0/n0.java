package N0;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final N0.k0 f7604a = new N0.k0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f7605b = a(0, 0);

    public static final long a(int i6, int i10) {
        return N0.o0.a((((long) i10) & 4294967295L) | (((long) i6) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Paint.FontMetricsInt h(N0.l0 l0Var, android.text.TextPaint textPaint, android.text.TextDirectionHeuristic textDirectionHeuristic, P0.h[] hVarArr) {
        int iM = l0Var.m() - 1;
        if (l0Var.i().getLineStart(iM) != l0Var.i().getLineEnd(iM) || hVarArr == null || hVarArr.length == 0) {
            return null;
        }
        android.text.SpannableString spannableString = new android.text.SpannableString("\u200b");
        P0.h hVar = (P0.h) p097j7.AbstractC6872n.Y(hVarArr);
        spannableString.setSpan(hVar.b(0, spannableString.length(), (iM == 0 || !hVar.e()) ? hVar.e() : false), 0, spannableString.length(), 33);
        android.text.StaticLayout staticLayoutA = N0.g0.f7554a.a(spannableString, textPaint, Integer.MAX_VALUE, (2072512 & 8) != 0 ? 0 : 0, (2072512 & 16) != 0 ? spannableString.length() : spannableString.length(), (2072512 & 32) != 0 ? N0.J.f7528a.b() : textDirectionHeuristic, (2072512 & 64) != 0 ? N0.J.f7528a.a() : null, (2072512 & 128) != 0 ? Integer.MAX_VALUE : 0, (2072512 & 256) != 0 ? null : null, (2072512 & 512) != 0 ? Integer.MAX_VALUE : 0, (2072512 & 1024) != 0 ? 1.0f : 0.0f, (2072512 & 2048) != 0 ? 0.0f : 0.0f, (2072512 & 4096) != 0 ? 0 : 0, (2072512 & 8192) != 0 ? false : l0Var.h(), (2072512 & 16384) != 0 ? true : l0Var.e(), (32768 & 2072512) != 0 ? 0 : 0, (65536 & 2072512) != 0 ? 0 : 0, (131072 & 2072512) != 0 ? 0 : 0, (262144 & 2072512) != 0 ? 0 : 0, (524288 & 2072512) != 0 ? null : null, (2072512 & 1048576) != 0 ? null : null);
        android.graphics.Paint.FontMetricsInt fontMetricsInt = new android.graphics.Paint.FontMetricsInt();
        fontMetricsInt.ascent = staticLayoutA.getLineAscent(0);
        fontMetricsInt.descent = staticLayoutA.getLineDescent(0);
        fontMetricsInt.top = staticLayoutA.getLineTop(0);
        fontMetricsInt.bottom = staticLayoutA.getLineBottom(0);
        return fontMetricsInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(P0.h[] hVarArr) {
        int iMax = 0;
        int iMax2 = 0;
        for (P0.h hVar : hVarArr) {
            if (hVar.c() < 0) {
                iMax = java.lang.Math.max(iMax, java.lang.Math.abs(hVar.c()));
            }
            if (hVar.d() < 0) {
                iMax2 = java.lang.Math.max(iMax, java.lang.Math.abs(hVar.d()));
            }
        }
        return (iMax == 0 && iMax2 == 0) ? f7605b : a(iMax, iMax2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final P0.h[] j(N0.l0 l0Var) {
        if (!(l0Var.G() instanceof android.text.Spanned)) {
            return null;
        }
        java.lang.CharSequence charSequenceG = l0Var.G();
        p247y7.AbstractC7350t.d(charSequenceG, "null cannot be cast to non-null type android.text.Spanned");
        if (!N0.T.a((android.text.Spanned) charSequenceG, P0.h.class) && l0Var.G().length() > 0) {
            return null;
        }
        java.lang.CharSequence charSequenceG2 = l0Var.G();
        p247y7.AbstractC7350t.d(charSequenceG2, "null cannot be cast to non-null type android.text.Spanned");
        return (P0.h[]) ((android.text.Spanned) charSequenceG2).getSpans(0, l0Var.G().length(), P0.h.class);
    }

    public static final android.text.TextDirectionHeuristic k(int i6) {
        if (i6 == 0) {
            return android.text.TextDirectionHeuristics.LTR;
        }
        if (i6 == 1) {
            return android.text.TextDirectionHeuristics.RTL;
        }
        if (i6 != 2) {
            if (i6 == 3) {
                return android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
            }
            if (i6 == 4) {
                return android.text.TextDirectionHeuristics.ANYRTL_LTR;
            }
            if (i6 == 5) {
                return android.text.TextDirectionHeuristics.LOCALE;
            }
        }
        return android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(N0.l0 l0Var) {
        if (l0Var.h() || l0Var.J()) {
            return f7605b;
        }
        android.text.TextPaint paint = l0Var.i().getPaint();
        java.lang.CharSequence text = l0Var.i().getText();
        android.graphics.Rect rectC = N0.S.c(paint, text, l0Var.i().getLineStart(0), l0Var.i().getLineEnd(0));
        int lineAscent = l0Var.i().getLineAscent(0);
        int i6 = rectC.top;
        int topPadding = i6 < lineAscent ? lineAscent - i6 : l0Var.i().getTopPadding();
        if (l0Var.m() != 1) {
            int iM = l0Var.m() - 1;
            rectC = N0.S.c(paint, text, l0Var.i().getLineStart(iM), l0Var.i().getLineEnd(iM));
        }
        int lineDescent = l0Var.i().getLineDescent(l0Var.m() - 1);
        int i10 = rectC.bottom;
        int bottomPadding = i10 > lineDescent ? i10 - lineDescent : l0Var.i().getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? f7605b : a(topPadding, bottomPadding);
    }

    public static final boolean m(android.text.Layout layout, int i6) {
        return layout.getEllipsisCount(i6) > 0;
    }
}
