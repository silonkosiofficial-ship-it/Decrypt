package Y1;

/* JADX INFO: loaded from: classes.dex */
abstract class d implements android.view.animation.Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f16249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f16250b;

    protected d(float[] fArr) {
        this.f16249a = fArr;
        this.f16250b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f6) {
        if (f6 >= 1.0f) {
            return 1.0f;
        }
        if (f6 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f16249a;
        int iMin = java.lang.Math.min((int) ((fArr.length - 1) * f6), fArr.length - 2);
        float f10 = this.f16250b;
        float f11 = (f6 - (iMin * f10)) / f10;
        float[] fArr2 = this.f16249a;
        float f12 = fArr2[iMin];
        return f12 + (f11 * (fArr2[iMin + 1] - f12));
    }
}
