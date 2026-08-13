package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    static class a {
        static int a(android.widget.TextView textView) {
            return textView.getBreakStrategy();
        }

        static android.content.res.ColorStateList b(android.widget.TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        static android.graphics.PorterDuff.Mode c(android.widget.TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        static int d(android.widget.TextView textView) {
            return textView.getHyphenationFrequency();
        }

        static void e(android.widget.TextView textView, int i6) {
            textView.setBreakStrategy(i6);
        }

        static void f(android.widget.TextView textView, android.content.res.ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        static void g(android.widget.TextView textView, android.graphics.PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        static void h(android.widget.TextView textView, int i6) {
            textView.setHyphenationFrequency(i6);
        }
    }

    static class b {
        static android.icu.text.DecimalFormatSymbols a(java.util.Locale locale) {
            return android.icu.text.DecimalFormatSymbols.getInstance(locale);
        }
    }

    static class c {
        static java.lang.CharSequence a(android.text.PrecomputedText precomputedText) {
            return precomputedText;
        }

        static java.lang.String[] b(android.icu.text.DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        static android.text.PrecomputedText.Params c(android.widget.TextView textView) {
            return textView.getTextMetricsParams();
        }

        static void d(android.widget.TextView textView, int i6) {
            textView.setFirstBaselineToTopHeight(i6);
        }
    }

    private static class d implements android.view.ActionMode.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.view.ActionMode.Callback f21875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final android.widget.TextView f21876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.Class f21877c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private java.lang.reflect.Method f21878d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f21879e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f21880f = false;

        d(android.view.ActionMode.Callback callback, android.widget.TextView textView) {
            this.f21875a = callback;
            this.f21876b = textView;
        }

        private android.content.Intent a() {
            return new android.content.Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private android.content.Intent b(android.content.pm.ResolveInfo resolveInfo, android.widget.TextView textView) {
            android.content.Intent intentPutExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !e(textView));
            android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
            return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        private java.util.List c(android.content.Context context, android.content.pm.PackageManager packageManager) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (!(context instanceof android.app.Activity)) {
                return arrayList;
            }
            for (android.content.pm.ResolveInfo resolveInfo : packageManager.queryIntentActivities(a(), 0)) {
                if (f(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        private boolean e(android.widget.TextView textView) {
            return (textView instanceof android.text.Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private boolean f(android.content.pm.ResolveInfo resolveInfo, android.content.Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            java.lang.String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        private void g(android.view.Menu menu) {
            android.content.Context context = this.f21876b.getContext();
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (!this.f21880f) {
                this.f21880f = true;
                try {
                    java.lang.Class<?> cls = java.lang.Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f21877c = cls;
                    this.f21878d = cls.getDeclaredMethod("removeItemAt", java.lang.Integer.TYPE);
                    this.f21879e = true;
                } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
                    this.f21877c = null;
                    this.f21878d = null;
                    this.f21879e = false;
                }
            }
            try {
                java.lang.reflect.Method declaredMethod = (this.f21879e && this.f21877c.isInstance(menu)) ? this.f21878d : menu.getClass().getDeclaredMethod("removeItemAt", java.lang.Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    android.view.MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, java.lang.Integer.valueOf(size));
                    }
                }
                java.util.List listC = c(context, packageManager);
                for (int i6 = 0; i6 < listC.size(); i6++) {
                    android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) listC.get(i6);
                    menu.add(0, 0, i6 + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.f21876b)).setShowAsAction(1);
                }
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
            }
        }

        android.view.ActionMode.Callback d() {
            return this.f21875a;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(android.view.ActionMode actionMode, android.view.MenuItem menuItem) {
            return this.f21875a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
            return this.f21875a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(android.view.ActionMode actionMode) {
            this.f21875a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
            g(menu);
            return this.f21875a.onPrepareActionMode(actionMode, menu);
        }
    }

    public static android.graphics.drawable.Drawable[] a(android.widget.TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static int b(android.widget.TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int c(android.widget.TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    private static int d(android.text.TextDirectionHeuristic textDirectionHeuristic) {
        android.text.TextDirectionHeuristic textDirectionHeuristic2;
        android.text.TextDirectionHeuristic textDirectionHeuristic3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == android.text.TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == android.text.TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == android.text.TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == android.text.TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    private static android.text.TextDirectionHeuristic e(android.widget.TextView textView) {
        if (textView.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod) {
            return android.text.TextDirectionHeuristics.LTR;
        }
        if (android.os.Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = java.lang.Character.getDirectionality(androidx.core.widget.h.c.b(androidx.core.widget.h.b.a(textView.getTextLocale()))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? android.text.TextDirectionHeuristics.RTL : android.text.TextDirectionHeuristics.LTR;
        }
        boolean z6 = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                return android.text.TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return android.text.TextDirectionHeuristics.LTR;
            case 4:
                return android.text.TextDirectionHeuristics.RTL;
            case 5:
                return android.text.TextDirectionHeuristics.LOCALE;
            case 6:
                return android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                return z6 ? android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL : android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    public static androidx.core.text.o.a f(android.widget.TextView textView) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return new androidx.core.text.o.a(androidx.core.widget.h.c.c(textView));
        }
        androidx.core.text.o.a.C0409a c0409a = new androidx.core.text.o.a.C0409a(new android.text.TextPaint(textView.getPaint()));
        c0409a.b(androidx.core.widget.h.a.a(textView));
        c0409a.c(androidx.core.widget.h.a.d(textView));
        c0409a.d(e(textView));
        return c0409a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g(android.widget.TextView textView, android.content.res.ColorStateList colorStateList) {
        B1.i.g(textView);
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            androidx.core.widget.h.a.f(textView, colorStateList);
        } else if (textView instanceof androidx.core.widget.k) {
            ((androidx.core.widget.k) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(android.widget.TextView textView, android.graphics.PorterDuff.Mode mode) {
        B1.i.g(textView);
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            androidx.core.widget.h.a.g(textView, mode);
        } else if (textView instanceof androidx.core.widget.k) {
            ((androidx.core.widget.k) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void i(android.widget.TextView textView, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static void j(android.widget.TextView textView, int i6) {
        B1.i.d(i6);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.widget.h.c.d(textView, i6);
            return;
        }
        android.graphics.Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i6 > java.lang.Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), i6 + i10, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void k(android.widget.TextView textView, int i6) {
        B1.i.d(i6);
        android.graphics.Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i6 > java.lang.Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i6 - i10);
        }
    }

    public static void l(android.widget.TextView textView, int i6) {
        B1.i.d(i6);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i6 != fontMetricsInt) {
            textView.setLineSpacing(i6 - fontMetricsInt, 1.0f);
        }
    }

    public static void m(android.widget.TextView textView, androidx.core.text.o oVar) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        f(textView);
        throw null;
    }

    public static void n(android.widget.TextView textView, int i6) {
        textView.setTextAppearance(i6);
    }

    public static void o(android.widget.TextView textView, androidx.core.text.o.a aVar) {
        textView.setTextDirection(d(aVar.d()));
        textView.getPaint().set(aVar.e());
        androidx.core.widget.h.a.e(textView, aVar.b());
        androidx.core.widget.h.a.h(textView, aVar.c());
    }

    public static android.view.ActionMode.Callback p(android.view.ActionMode.Callback callback) {
        return (!(callback instanceof androidx.core.widget.h.d) || android.os.Build.VERSION.SDK_INT < 26) ? callback : ((androidx.core.widget.h.d) callback).d();
    }

    public static android.view.ActionMode.Callback q(android.widget.TextView textView, android.view.ActionMode.Callback callback) {
        int i6 = android.os.Build.VERSION.SDK_INT;
        return (i6 < 26 || i6 > 27 || (callback instanceof androidx.core.widget.h.d) || callback == null) ? callback : new androidx.core.widget.h.d(callback, textView);
    }
}
