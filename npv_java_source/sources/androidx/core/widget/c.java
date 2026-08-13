package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    static class a {
        static android.content.res.ColorStateList a(android.widget.CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        static android.graphics.PorterDuff.Mode b(android.widget.CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        static void c(android.widget.CompoundButton compoundButton, android.content.res.ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        static void d(android.widget.CompoundButton compoundButton, android.graphics.PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    static class b {
        static android.graphics.drawable.Drawable a(android.widget.CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    public static android.graphics.drawable.Drawable a(android.widget.CompoundButton compoundButton) {
        return androidx.core.widget.c.b.a(compoundButton);
    }

    public static android.content.res.ColorStateList b(android.widget.CompoundButton compoundButton) {
        return androidx.core.widget.c.a.a(compoundButton);
    }

    public static android.graphics.PorterDuff.Mode c(android.widget.CompoundButton compoundButton) {
        return androidx.core.widget.c.a.b(compoundButton);
    }

    public static void d(android.widget.CompoundButton compoundButton, android.content.res.ColorStateList colorStateList) {
        androidx.core.widget.c.a.c(compoundButton, colorStateList);
    }

    public static void e(android.widget.CompoundButton compoundButton, android.graphics.PorterDuff.Mode mode) {
        androidx.core.widget.c.a.d(compoundButton, mode);
    }
}
