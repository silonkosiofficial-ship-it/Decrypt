package androidx.core.text;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.reflect.Method f21624a;

    static class a {
        static java.lang.String a(java.util.Locale locale) {
            return locale.getScript();
        }
    }

    static class b {
        static android.icu.util.ULocale a(java.lang.Object obj) {
            return android.icu.util.ULocale.addLikelySubtags((android.icu.util.ULocale) obj);
        }

        static android.icu.util.ULocale b(java.util.Locale locale) {
            return android.icu.util.ULocale.forLocale(locale);
        }

        static java.lang.String c(java.lang.Object obj) {
            return ((android.icu.util.ULocale) obj).getScript();
        }
    }

    static {
        if (android.os.Build.VERSION.SDK_INT < 24) {
            try {
                f21624a = java.lang.Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", java.util.Locale.class);
            } catch (java.lang.Exception e6) {
                throw new java.lang.IllegalStateException(e6);
            }
        }
    }

    public static java.lang.String a(java.util.Locale locale) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return androidx.core.text.c.b.c(androidx.core.text.c.b.a(androidx.core.text.c.b.b(locale)));
        }
        try {
            return androidx.core.text.c.a.a((java.util.Locale) f21624a.invoke(null, locale));
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e6) {
            return androidx.core.text.c.a.a(locale);
        }
    }
}
