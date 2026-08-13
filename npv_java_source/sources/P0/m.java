package P0;

/* JADX INFO: loaded from: classes.dex */
public class m extends android.text.style.MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f8269a;

    public m(float f6) {
        this.f8269a = f6;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setTextSkewX(this.f8269a + textPaint.getTextSkewX());
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint textPaint) {
        textPaint.setTextSkewX(this.f8269a + textPaint.getTextSkewX());
    }
}
