package androidx.core.view.animation;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.core.view.animation.a$a, reason: collision with other inner class name */
    static class C0411a {
        static android.view.animation.Interpolator a(float f6, float f10) {
            return new android.view.animation.PathInterpolator(f6, f10);
        }

        static android.view.animation.Interpolator b(float f6, float f10, float f11, float f12) {
            return new android.view.animation.PathInterpolator(f6, f10, f11, f12);
        }

        static android.view.animation.Interpolator c(android.graphics.Path path) {
            return new android.view.animation.PathInterpolator(path);
        }
    }

    public static android.view.animation.Interpolator a(float f6, float f10, float f11, float f12) {
        return androidx.core.view.animation.a.C0411a.b(f6, f10, f11, f12);
    }

    public static android.view.animation.Interpolator b(android.graphics.Path path) {
        return androidx.core.view.animation.a.C0411a.c(path);
    }
}
