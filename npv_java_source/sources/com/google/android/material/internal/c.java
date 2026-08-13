package com.google.android.material.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static void a(android.view.Window window, boolean z6, java.lang.Integer num, java.lang.Integer num2) {
        boolean z10 = num == null || num.intValue() == 0;
        boolean z11 = num2 == null || num2.intValue() == 0;
        if (z10 || z11) {
            int iB = p195t4.a.b(window.getContext(), android.R.attr.colorBackground, -16777216);
            if (z10) {
                num = java.lang.Integer.valueOf(iB);
            }
            if (z11) {
                num2 = java.lang.Integer.valueOf(iB);
            }
        }
        androidx.core.view.AbstractC2011k0.b(window, !z6);
        int iC = c(window.getContext(), z6);
        int iB2 = b(window.getContext(), z6);
        window.setStatusBarColor(iC);
        window.setNavigationBarColor(iB2);
        f(window, d(iC, p195t4.a.h(num.intValue())));
        e(window, d(iB2, p195t4.a.h(num2.intValue())));
    }

    private static int b(android.content.Context context, boolean z6) {
        if (z6 && android.os.Build.VERSION.SDK_INT < 27) {
            return androidx.core.graphics.a.k(p195t4.a.b(context, android.R.attr.navigationBarColor, -16777216), 128);
        }
        if (z6) {
            return 0;
        }
        return p195t4.a.b(context, android.R.attr.navigationBarColor, -16777216);
    }

    private static int c(android.content.Context context, boolean z6) {
        if (z6) {
            return 0;
        }
        return p195t4.a.b(context, android.R.attr.statusBarColor, -16777216);
    }

    private static boolean d(int i6, boolean z6) {
        return p195t4.a.h(i6) || (i6 == 0 && z6);
    }

    public static void e(android.view.Window window, boolean z6) {
        androidx.core.view.AbstractC2011k0.a(window, window.getDecorView()).c(z6);
    }

    public static void f(android.view.Window window, boolean z6) {
        androidx.core.view.AbstractC2011k0.a(window, window.getDecorView()).d(z6);
    }
}
