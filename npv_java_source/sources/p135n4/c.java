package p135n4;

/* JADX INFO: loaded from: classes3.dex */
public class c implements android.animation.TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p135n4.c f51495a = new p135n4.c();

    public static p135n4.c b() {
        return f51495a;
    }

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Integer evaluate(float f6, java.lang.Integer num, java.lang.Integer num2) {
        int iIntValue = num.intValue();
        float f10 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = num2.intValue();
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
