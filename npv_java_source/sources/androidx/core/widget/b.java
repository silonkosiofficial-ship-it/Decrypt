package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    private static class a {
        static void a(android.widget.CheckedTextView checkedTextView, android.content.res.ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        static void b(android.widget.CheckedTextView checkedTextView, android.graphics.PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    public static android.graphics.drawable.Drawable a(android.widget.CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkDrawable();
    }

    public static void b(android.widget.CheckedTextView checkedTextView, android.content.res.ColorStateList colorStateList) {
        androidx.core.widget.b.a.a(checkedTextView, colorStateList);
    }

    public static void c(android.widget.CheckedTextView checkedTextView, android.graphics.PorterDuff.Mode mode) {
        androidx.core.widget.b.a.b(checkedTextView, mode);
    }
}
