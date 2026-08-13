package androidx.vectordrawable.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class f implements android.animation.TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.vectordrawable.graphics.drawable.f f23715a = new androidx.vectordrawable.graphics.drawable.f();

    public static androidx.vectordrawable.graphics.drawable.f a() {
        return f23715a;
    }

    @Override // android.animation.TypeEvaluator
    public java.lang.Object evaluate(float f6, java.lang.Object obj, java.lang.Object obj2) {
        int iIntValue = ((java.lang.Integer) obj).intValue();
        float f10 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((java.lang.Integer) obj2).intValue();
        float fPow = (float) java.lang.Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) java.lang.Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) java.lang.Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) java.lang.Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float f11 = f10 + (((((iIntValue2 >> 24) & 255) / 255.0f) - f10) * f6);
        float fPow5 = fPow2 + ((((float) java.lang.Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d)) - fPow2) * f6);
        float fPow6 = fPow3 + (f6 * (((float) java.lang.Math.pow((iIntValue2 & 255) / 255.0f, 2.2d)) - fPow3));
        return java.lang.Integer.valueOf((java.lang.Math.round(((float) java.lang.Math.pow(fPow + ((fPow4 - fPow) * f6), 0.45454545454545453d)) * 255.0f) << 16) | (java.lang.Math.round(f11 * 255.0f) << 24) | (java.lang.Math.round(((float) java.lang.Math.pow(fPow5, 0.45454545454545453d)) * 255.0f) << 8) | java.lang.Math.round(((float) java.lang.Math.pow(fPow6, 0.45454545454545453d)) * 255.0f));
    }
}
