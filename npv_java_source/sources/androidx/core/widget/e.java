package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    static class a {
        static android.content.res.ColorStateList a(android.widget.ImageView imageView) {
            return imageView.getImageTintList();
        }

        static android.graphics.PorterDuff.Mode b(android.widget.ImageView imageView) {
            return imageView.getImageTintMode();
        }

        static void c(android.widget.ImageView imageView, android.content.res.ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        static void d(android.widget.ImageView imageView, android.graphics.PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    public static android.content.res.ColorStateList a(android.widget.ImageView imageView) {
        return androidx.core.widget.e.a.a(imageView);
    }

    public static android.graphics.PorterDuff.Mode b(android.widget.ImageView imageView) {
        return androidx.core.widget.e.a.b(imageView);
    }

    public static void c(android.widget.ImageView imageView, android.content.res.ColorStateList colorStateList) {
        androidx.core.widget.e.a.c(imageView, colorStateList);
    }

    public static void d(android.widget.ImageView imageView, android.graphics.PorterDuff.Mode mode) {
        androidx.core.widget.e.a.d(imageView, mode);
    }
}
