package E4;

/* JADX INFO: loaded from: classes3.dex */
public class e extends E4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f2109a = -1.0f;

    @Override // E4.d
    public void a(E4.m mVar, float f6, float f10, float f11) {
        mVar.o(0.0f, f11 * f10, 180.0f, 180.0f - f6);
        double d6 = f11;
        double d10 = f10;
        mVar.m((float) (java.lang.Math.sin(java.lang.Math.toRadians(f6)) * d6 * d10), (float) (java.lang.Math.sin(java.lang.Math.toRadians(90.0f - f6)) * d6 * d10));
    }
}
