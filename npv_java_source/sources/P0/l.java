package P0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends android.text.style.CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f8266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f8267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f8268d;

    public l(int i6, float f6, float f10, float f11) {
        this.f8265a = i6;
        this.f8266b = f6;
        this.f8267c = f10;
        this.f8268d = f11;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setShadowLayer(this.f8268d, this.f8266b, this.f8267c, this.f8265a);
    }
}
