package N0;

/* JADX INFO: loaded from: classes.dex */
final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N0.C f7519a = new N0.C();

    private C() {
    }

    public final boolean a(android.graphics.Canvas canvas, float f6, float f10, float f11, float f12) {
        return canvas.quickReject(f6, f10, f11, f12);
    }

    public final boolean b(android.graphics.Canvas canvas, android.graphics.Path path) {
        return canvas.quickReject(path);
    }

    public final boolean c(android.graphics.Canvas canvas, android.graphics.RectF rectF) {
        return canvas.quickReject(rectF);
    }
}
