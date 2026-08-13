package N0;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends android.graphics.Canvas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.graphics.Canvas f7583a;

    public final void a(android.graphics.Canvas canvas) {
        this.f7583a = canvas;
    }

    @Override // android.graphics.Canvas
    public boolean clipOutPath(android.graphics.Path path) {
        N0.C1380s c1380s = N0.C1380s.f7606a;
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return c1380s.a(canvas, path);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(float f6, float f10, float f11, float f12) {
        N0.C1380s c1380s = N0.C1380s.f7606a;
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return c1380s.b(canvas, f6, f10, f11, f12);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(int i6, int i10, int i11, int i12) {
        N0.C1380s c1380s = N0.C1380s.f7606a;
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return c1380s.c(canvas, i6, i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(android.graphics.Rect rect) {
        N0.C1380s c1380s = N0.C1380s.f7606a;
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return c1380s.d(canvas, rect);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(android.graphics.RectF rectF) {
        N0.C1380s c1380s = N0.C1380s.f7606a;
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return c1380s.e(canvas, rectF);
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(android.graphics.Path path) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path);
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(android.graphics.Path path, android.graphics.Region.Op op) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float f6, float f10, float f11, float f12) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f6, f10, f11, f12);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float f6, float f10, float f11, float f12, android.graphics.Region.Op op) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f6, f10, f11, f12, op);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int i6, int i10, int i11, int i12) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(i6, i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(android.graphics.Rect rect) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(android.graphics.Rect rect, android.graphics.Region.Op op) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(android.graphics.RectF rectF) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(android.graphics.RectF rectF, android.graphics.Region.Op op) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public void concat(android.graphics.Matrix matrix) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.concat(matrix);
    }

    @Override // android.graphics.Canvas
    public void disableZ() {
        N0.C1386y c1386y = N0.C1386y.f7607a;
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        c1386y.a(canvas);
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int i6, int i10, int i11, int i12) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawARGB(i6, i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public void drawArc(float f6, float f10, float f11, float f12, float f13, float f14, boolean z6, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(f6, f10, f11, f12, f13, f14, z6, paint);
    }

    @Override // android.graphics.Canvas
    public void drawArc(android.graphics.RectF rectF, float f6, float f10, boolean z6, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(rectF, f6, f10, z6, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(android.graphics.Bitmap bitmap, float f6, float f10, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(android.graphics.Bitmap bitmap, android.graphics.Matrix matrix, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(android.graphics.Bitmap bitmap, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(android.graphics.Bitmap bitmap, android.graphics.Rect rect, android.graphics.RectF rectF, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(int[] iArr, int i6, int i10, float f6, float f10, int i11, int i12, boolean z6, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i6, i10, f6, f10, i11, i12, z6, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(int[] iArr, int i6, int i10, int i11, int i12, int i13, int i14, boolean z6, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i6, i10, i11, i12, i13, i14, z6, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(android.graphics.Bitmap bitmap, int i6, int i10, float[] fArr, int i11, int[] iArr, int i12, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmapMesh(bitmap, i6, i10, fArr, i11, iArr, i12, paint);
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float f6, float f10, float f11, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawCircle(f6, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i6) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i6);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i6, android.graphics.BlendMode blendMode) {
        N0.C1386y c1386y = N0.C1386y.f7607a;
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        c1386y.b(canvas, i6, blendMode);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i6, android.graphics.PorterDuff.Mode mode) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i6, mode);
    }

    @Override // android.graphics.Canvas
    public void drawColor(long j6) {
        N0.C1386y c1386y = N0.C1386y.f7607a;
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        c1386y.c(canvas, j6);
    }

    @Override // android.graphics.Canvas
    public void drawColor(long j6, android.graphics.BlendMode blendMode) {
        N0.C1386y c1386y = N0.C1386y.f7607a;
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        c1386y.d(canvas, j6, blendMode);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(android.graphics.RectF rectF, float f6, float f10, android.graphics.RectF rectF2, float f11, float f12, android.graphics.Paint paint) {
        N0.C1386y c1386y = N0.C1386y.f7607a;
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        c1386y.e(canvas, rectF, f6, f10, rectF2, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(android.graphics.RectF rectF, float[] fArr, android.graphics.RectF rectF2, float[] fArr2, android.graphics.Paint paint) {
        N0.C1386y c1386y = N0.C1386y.f7607a;
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        c1386y.f(canvas, rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawGlyphs(int[] iArr, int i6, float[] fArr, int i10, int i11, android.graphics.fonts.Font font, android.graphics.Paint paint) {
        N0.G g6 = N0.G.f7520a;
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        g6.a(canvas, iArr, i6, fArr, i10, i11, font, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLine(float f6, float f10, float f11, float f12, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawLine(f6, f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] fArr, int i6, int i10, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, i6, i10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] fArr, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(float f6, float f10, float f11, float f12, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(f6, f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(android.graphics.RectF rectF, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPaint(android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(android.graphics.NinePatch ninePatch, android.graphics.Rect rect, android.graphics.Paint paint) {
        N0.G g6 = N0.G.f7520a;
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        g6.b(canvas, ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(android.graphics.NinePatch ninePatch, android.graphics.RectF rectF, android.graphics.Paint paint) {
        N0.G g6 = N0.G.f7520a;
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        g6.c(canvas, ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPath(android.graphics.Path path, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(android.graphics.Picture picture) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(android.graphics.Picture picture, android.graphics.Rect rect) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(android.graphics.Picture picture, android.graphics.RectF rectF) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float f6, float f10, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoint(f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] fArr, int i6, int i10, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, i6, i10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] fArr, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPosText(java.lang.String str, float[] fArr, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPosText(char[] cArr, int i6, int i10, float[] fArr, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(cArr, i6, i10, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int i6, int i10, int i11) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawRGB(i6, i10, i11);
    }

    @Override // android.graphics.Canvas
    public void drawRect(float f6, float f10, float f11, float f12, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(f6, f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(android.graphics.Rect rect, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(android.graphics.RectF rectF, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRenderNode(android.graphics.RenderNode renderNode) {
        N0.C1386y c1386y = N0.C1386y.f7607a;
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        c1386y.g(canvas, renderNode);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float f6, float f10, float f11, float f12, float f13, float f14, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(f6, f10, f11, f12, f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(android.graphics.RectF rectF, float f6, float f10, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(rectF, f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(java.lang.CharSequence charSequence, int i6, int i10, float f6, float f10, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(charSequence, i6, i10, f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(java.lang.String str, float f6, float f10, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(java.lang.String str, int i6, int i10, float f6, float f10, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, i6, i10, f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(char[] cArr, int i6, int i10, float f6, float f10, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(cArr, i6, i10, f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(java.lang.String str, android.graphics.Path path, float f6, float f10, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(str, path, f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(char[] cArr, int i6, int i10, android.graphics.Path path, float f6, float f10, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(cArr, i6, i10, path, f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(android.graphics.text.MeasuredText measuredText, int i6, int i10, int i11, int i12, float f6, float f10, boolean z6, android.graphics.Paint paint) {
        N0.C1386y c1386y = N0.C1386y.f7607a;
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        c1386y.h(canvas, measuredText, i6, i10, i11, i12, f6, f10, z6, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(java.lang.CharSequence charSequence, int i6, int i10, int i11, int i12, float f6, float f10, boolean z6, android.graphics.Paint paint) {
        N0.C1375m c1375m = N0.C1375m.f7603a;
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        c1375m.a(canvas, charSequence, i6, i10, i11, i12, f6, f10, z6, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(char[] cArr, int i6, int i10, int i11, int i12, float f6, float f10, boolean z6, android.graphics.Paint paint) {
        N0.C1375m c1375m = N0.C1375m.f7603a;
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        c1375m.b(canvas, cArr, i6, i10, i11, i12, f6, f10, z6, paint);
    }

    @Override // android.graphics.Canvas
    public void drawVertices(android.graphics.Canvas.VertexMode vertexMode, int i6, float[] fArr, int i10, float[] fArr2, int i11, int[] iArr, int i12, short[] sArr, int i13, int i14, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.drawVertices(vertexMode, i6, fArr, i10, fArr2, i11, iArr, i12, sArr, i13, i14, paint);
    }

    @Override // android.graphics.Canvas
    public void enableZ() {
        N0.C1386y c1386y = N0.C1386y.f7607a;
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        c1386y.i(canvas);
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(android.graphics.Rect rect) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.getDensity();
    }

    @Override // android.graphics.Canvas
    public android.graphics.DrawFilter getDrawFilter() {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.getHeight();
    }

    @Override // android.graphics.Canvas
    public void getMatrix(android.graphics.Matrix matrix) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.getSaveCount();
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.getWidth();
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.isOpaque();
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float f6, float f10, float f11, float f12) {
        N0.C c6 = N0.C.f7519a;
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return c6.a(canvas, f6, f10, f11, f12);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float f6, float f10, float f11, float f12, android.graphics.Canvas.EdgeType edgeType) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(f6, f10, f11, f12, edgeType);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(android.graphics.Path path) {
        N0.C c6 = N0.C.f7519a;
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return c6.b(canvas, path);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(android.graphics.Path path, android.graphics.Canvas.EdgeType edgeType) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(android.graphics.RectF rectF) {
        N0.C c6 = N0.C.f7519a;
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return c6.c(canvas, rectF);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(android.graphics.RectF rectF, android.graphics.Canvas.EdgeType edgeType) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public void restore() {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.restore();
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int i6) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.restoreToCount(i6);
    }

    @Override // android.graphics.Canvas
    public void rotate(float f6) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.rotate(f6);
    }

    @Override // android.graphics.Canvas
    public int save() {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.save();
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f6, float f10, float f11, float f12, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f6, f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f6, float f10, float f11, float f12, android.graphics.Paint paint, int i6) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f6, f10, f11, f12, paint, i6);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(android.graphics.RectF rectF, android.graphics.Paint paint) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(android.graphics.RectF rectF, android.graphics.Paint paint, int i6) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint, i6);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float f6, float f10, float f11, float f12, int i6) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f6, f10, f11, f12, i6);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float f6, float f10, float f11, float f12, int i6, int i10) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f6, f10, f11, f12, i6, i10);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(android.graphics.RectF rectF, int i6) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i6);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(android.graphics.RectF rectF, int i6, int i10) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i6, i10);
    }

    @Override // android.graphics.Canvas
    public void scale(float f6, float f10) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.scale(f6, f10);
    }

    @Override // android.graphics.Canvas
    public void setBitmap(android.graphics.Bitmap bitmap) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public void setDensity(int i6) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.setDensity(i6);
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(android.graphics.DrawFilter drawFilter) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public void setMatrix(android.graphics.Matrix matrix) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public void skew(float f6, float f10) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.skew(f6, f10);
    }

    @Override // android.graphics.Canvas
    public void translate(float f6, float f10) {
        android.graphics.Canvas canvas = this.f7583a;
        if (canvas == null) {
            p247y7.AbstractC7350t.p("nativeCanvas");
            canvas = null;
        }
        canvas.translate(f6, f10);
    }
}
