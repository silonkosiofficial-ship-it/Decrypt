package N0;

/* JADX INFO: renamed from: N0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1380s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N0.C1380s f7606a = new N0.C1380s();

    private C1380s() {
    }

    public final boolean a(android.graphics.Canvas canvas, android.graphics.Path path) {
        return canvas.clipOutPath(path);
    }

    public final boolean b(android.graphics.Canvas canvas, float f6, float f10, float f11, float f12) {
        return canvas.clipOutRect(f6, f10, f11, f12);
    }

    public final boolean c(android.graphics.Canvas canvas, int i6, int i10, int i11, int i12) {
        return canvas.clipOutRect(i6, i10, i11, i12);
    }

    public final boolean d(android.graphics.Canvas canvas, android.graphics.Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public final boolean e(android.graphics.Canvas canvas, android.graphics.RectF rectF) {
        return canvas.clipOutRect(rectF);
    }
}
