package p210v;

/* JADX INFO: renamed from: v.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C7209c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p210v.C7209c f55679a = new p210v.C7209c();

    private C7209c() {
    }

    public final android.widget.EdgeEffect a(android.content.Context context, android.util.AttributeSet attributeSet) {
        try {
            return new android.widget.EdgeEffect(context, attributeSet);
        } catch (java.lang.Throwable unused) {
            return new android.widget.EdgeEffect(context);
        }
    }

    public final float b(android.widget.EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (java.lang.Throwable unused) {
            return 0.0f;
        }
    }

    public final float c(android.widget.EdgeEffect edgeEffect, float f6, float f10) {
        try {
            return edgeEffect.onPullDistance(f6, f10);
        } catch (java.lang.Throwable unused) {
            edgeEffect.onPull(f6, f10);
            return 0.0f;
        }
    }
}
