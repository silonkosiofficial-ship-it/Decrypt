package P0;

/* JADX INFO: loaded from: classes.dex */
public class a extends android.text.style.MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f8235a;

    public a(float f6) {
        this.f8235a = f6;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.baselineShift += (int) java.lang.Math.ceil(textPaint.ascent() * this.f8235a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint textPaint) {
        textPaint.baselineShift += (int) java.lang.Math.ceil(textPaint.ascent() * this.f8235a);
    }
}
