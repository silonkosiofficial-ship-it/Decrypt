package Z0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z0.d f16669a = new Z0.d();

    private d() {
    }

    public final float a(float f6, float f10, float f11, float f12, float f13) {
        return b(f6, f10, java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, c(f11, f12, f13))));
    }

    public final float b(float f6, float f10, float f11) {
        return f6 + ((f10 - f6) * f11);
    }

    public final float c(float f6, float f10, float f11) {
        if (f6 == f10) {
            return 0.0f;
        }
        return (f11 - f6) / (f10 - f6);
    }
}
