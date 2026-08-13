package P0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends android.text.style.MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.graphics.Typeface f8272a;

    public o(android.graphics.Typeface typeface) {
        this.f8272a = typeface;
    }

    private final void a(android.graphics.Paint paint) {
        paint.setTypeface(this.f8272a);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint textPaint) {
        a(textPaint);
    }
}
