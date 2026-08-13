package P0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends android.text.style.CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f8270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f8271b;

    public n(boolean z6, boolean z10) {
        this.f8270a = z6;
        this.f8271b = z10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setUnderlineText(this.f8270a);
        textPaint.setStrikeThruText(this.f8271b);
    }
}
