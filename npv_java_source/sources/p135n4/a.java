package p135n4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final android.animation.TimeInterpolator f51490a = new android.view.animation.LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final android.animation.TimeInterpolator f51491b = new Y1.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final android.animation.TimeInterpolator f51492c = new Y1.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final android.animation.TimeInterpolator f51493d = new Y1.c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final android.animation.TimeInterpolator f51494e = new android.view.animation.DecelerateInterpolator();

    public static float a(float f6, float f10, float f11) {
        return f6 + (f11 * (f10 - f6));
    }

    public static float b(float f6, float f10, float f11, float f12, float f13) {
        if (f13 <= f11) {
            return f6;
        }
        return f13 >= f12 ? f10 : a(f6, f10, (f13 - f11) / (f12 - f11));
    }

    public static int c(int i6, int i10, float f6) {
        return i6 + java.lang.Math.round(f6 * (i10 - i6));
    }
}
