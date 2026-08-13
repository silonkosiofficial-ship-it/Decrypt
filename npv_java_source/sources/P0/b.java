package P0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends android.text.style.MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f8236a;

    public b(java.lang.String str) {
        this.f8236a = str;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.f8236a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.f8236a);
    }
}
