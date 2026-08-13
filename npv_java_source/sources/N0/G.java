package N0;

/* JADX INFO: loaded from: classes.dex */
final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N0.G f7520a = new N0.G();

    private G() {
    }

    public final void a(android.graphics.Canvas canvas, int[] iArr, int i6, float[] fArr, int i10, int i11, android.graphics.fonts.Font font, android.graphics.Paint paint) {
        canvas.drawGlyphs(iArr, i6, fArr, i10, i11, font, paint);
    }

    public final void b(android.graphics.Canvas canvas, android.graphics.NinePatch ninePatch, android.graphics.Rect rect, android.graphics.Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public final void c(android.graphics.Canvas canvas, android.graphics.NinePatch ninePatch, android.graphics.RectF rectF, android.graphics.Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }
}
