package P0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends android.text.style.MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f8238a;

    public e(float f6) {
        this.f8238a = f6;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f8238a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f8238a);
    }
}
