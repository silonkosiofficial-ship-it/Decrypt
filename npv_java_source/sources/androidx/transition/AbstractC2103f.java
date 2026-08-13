package androidx.transition;

/* JADX INFO: renamed from: androidx.transition.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2103f {

    /* JADX INFO: renamed from: androidx.transition.f$a */
    static class a {
        static <T, V> android.animation.ObjectAnimator a(T t6, android.util.Property<T, V> property, android.graphics.Path path) {
            return android.animation.ObjectAnimator.ofObject(t6, property, (android.animation.TypeConverter) null, path);
        }
    }

    static android.animation.ObjectAnimator a(java.lang.Object obj, android.util.Property property, android.graphics.Path path) {
        return androidx.transition.AbstractC2103f.a.a(obj, property, path);
    }
}
