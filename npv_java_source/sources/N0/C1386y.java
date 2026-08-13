package N0;

/* JADX INFO: renamed from: N0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1386y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N0.C1386y f7607a = new N0.C1386y();

    private C1386y() {
    }

    public final void a(android.graphics.Canvas canvas) {
        canvas.disableZ();
    }

    public final void b(android.graphics.Canvas canvas, int i6, android.graphics.BlendMode blendMode) {
        canvas.drawColor(i6, blendMode);
    }

    public final void c(android.graphics.Canvas canvas, long j6) {
        canvas.drawColor(j6);
    }

    public final void d(android.graphics.Canvas canvas, long j6, android.graphics.BlendMode blendMode) {
        canvas.drawColor(j6, blendMode);
    }

    public final void e(android.graphics.Canvas canvas, android.graphics.RectF rectF, float f6, float f10, android.graphics.RectF rectF2, float f11, float f12, android.graphics.Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f6, f10, rectF2, f11, f12, paint);
    }

    public final void f(android.graphics.Canvas canvas, android.graphics.RectF rectF, float[] fArr, android.graphics.RectF rectF2, float[] fArr2, android.graphics.Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public final void g(android.graphics.Canvas canvas, android.graphics.RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public final void h(android.graphics.Canvas canvas, android.graphics.text.MeasuredText measuredText, int i6, int i10, int i11, int i12, float f6, float f10, boolean z6, android.graphics.Paint paint) {
        canvas.drawTextRun(measuredText, i6, i10, i11, i12, f6, f10, z6, paint);
    }

    public final void i(android.graphics.Canvas canvas) {
        canvas.enableZ();
    }
}
