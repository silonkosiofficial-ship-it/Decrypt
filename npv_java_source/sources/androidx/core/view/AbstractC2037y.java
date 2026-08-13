package androidx.core.view;

/* JADX INFO: renamed from: androidx.core.view.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2037y {

    /* JADX INFO: renamed from: androidx.core.view.y$a */
    static class a {
        static int a(android.view.MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        static java.lang.CharSequence b(android.view.MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        static android.content.res.ColorStateList c(android.view.MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        static android.graphics.PorterDuff.Mode d(android.view.MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        static int e(android.view.MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        static java.lang.CharSequence f(android.view.MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        static android.view.MenuItem g(android.view.MenuItem menuItem, char c6, int i6) {
            return menuItem.setAlphabeticShortcut(c6, i6);
        }

        static android.view.MenuItem h(android.view.MenuItem menuItem, java.lang.CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        static android.view.MenuItem i(android.view.MenuItem menuItem, android.content.res.ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        static android.view.MenuItem j(android.view.MenuItem menuItem, android.graphics.PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        static android.view.MenuItem k(android.view.MenuItem menuItem, char c6, int i6) {
            return menuItem.setNumericShortcut(c6, i6);
        }

        static android.view.MenuItem l(android.view.MenuItem menuItem, char c6, char c10, int i6, int i10) {
            return menuItem.setShortcut(c6, c10, i6, i10);
        }

        static android.view.MenuItem m(android.view.MenuItem menuItem, java.lang.CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    public static android.view.MenuItem a(android.view.MenuItem menuItem, androidx.core.view.AbstractC1992b abstractC1992b) {
        return menuItem instanceof p212v1.b ? ((p212v1.b) menuItem).a(abstractC1992b) : menuItem;
    }

    public static void b(android.view.MenuItem menuItem, char c6, int i6) {
        if (menuItem instanceof p212v1.b) {
            ((p212v1.b) menuItem).setAlphabeticShortcut(c6, i6);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.view.AbstractC2037y.a.g(menuItem, c6, i6);
        }
    }

    public static void c(android.view.MenuItem menuItem, java.lang.CharSequence charSequence) {
        if (menuItem instanceof p212v1.b) {
            ((p212v1.b) menuItem).setContentDescription(charSequence);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.view.AbstractC2037y.a.h(menuItem, charSequence);
        }
    }

    public static void d(android.view.MenuItem menuItem, android.content.res.ColorStateList colorStateList) {
        if (menuItem instanceof p212v1.b) {
            ((p212v1.b) menuItem).setIconTintList(colorStateList);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.view.AbstractC2037y.a.i(menuItem, colorStateList);
        }
    }

    public static void e(android.view.MenuItem menuItem, android.graphics.PorterDuff.Mode mode) {
        if (menuItem instanceof p212v1.b) {
            ((p212v1.b) menuItem).setIconTintMode(mode);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.view.AbstractC2037y.a.j(menuItem, mode);
        }
    }

    public static void f(android.view.MenuItem menuItem, char c6, int i6) {
        if (menuItem instanceof p212v1.b) {
            ((p212v1.b) menuItem).setNumericShortcut(c6, i6);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.view.AbstractC2037y.a.k(menuItem, c6, i6);
        }
    }

    public static void g(android.view.MenuItem menuItem, java.lang.CharSequence charSequence) {
        if (menuItem instanceof p212v1.b) {
            ((p212v1.b) menuItem).setTooltipText(charSequence);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.view.AbstractC2037y.a.m(menuItem, charSequence);
        }
    }
}
