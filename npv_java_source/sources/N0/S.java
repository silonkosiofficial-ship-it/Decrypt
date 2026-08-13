package N0;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {
    private static final void a(android.graphics.Rect rect, android.graphics.Rect rect2) {
        rect.right += rect2.width();
        rect.top = java.lang.Math.min(rect.top, rect2.top);
        rect.bottom = java.lang.Math.max(rect.bottom, rect2.bottom);
    }

    private static final void b(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i6, int i10, android.graphics.Rect rect) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            N0.Q.a(paint, charSequence, i6, i10, rect);
        } else {
            paint.getTextBounds(charSequence.toString(), i6, i10, rect);
        }
    }

    public static final android.graphics.Rect c(android.text.TextPaint textPaint, java.lang.CharSequence charSequence, int i6, int i10) {
        if (charSequence instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence;
            if (N0.T.b(spanned, android.text.style.MetricAffectingSpan.class, i6, i10)) {
                android.graphics.Rect rect = new android.graphics.Rect();
                android.graphics.Rect rect2 = new android.graphics.Rect();
                android.text.TextPaint textPaint2 = new android.text.TextPaint();
                while (i6 < i10) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i6, i10, android.text.style.MetricAffectingSpan.class);
                    android.text.style.MetricAffectingSpan[] metricAffectingSpanArr = (android.text.style.MetricAffectingSpan[]) spanned.getSpans(i6, iNextSpanTransition, android.text.style.MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (android.text.style.MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    b(textPaint2, charSequence, i6, iNextSpanTransition, rect2);
                    a(rect, rect2);
                    i6 = iNextSpanTransition;
                }
                return rect;
            }
        }
        return d(textPaint, charSequence, i6, i10);
    }

    public static final android.graphics.Rect d(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i6, int i10) {
        android.graphics.Rect rect = new android.graphics.Rect();
        b(paint, charSequence, i6, i10, rect);
        return rect;
    }
}
