package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes3.dex */
abstract class f {
    static java.lang.String a(android.content.Context context, long j6, boolean z6, boolean z10, boolean z11) {
        java.lang.String strD = d(j6);
        if (z6) {
            strD = java.lang.String.format(context.getString(p125m4.h.f50687q), strD);
        }
        if (z10) {
            return java.lang.String.format(context.getString(p125m4.h.f50686p), strD);
        }
        return z11 ? java.lang.String.format(context.getString(p125m4.h.f50683m), strD) : strD;
    }

    static java.lang.String b(long j6) {
        return c(j6, java.util.Locale.getDefault());
    }

    static java.lang.String c(long j6, java.util.Locale locale) {
        return android.os.Build.VERSION.SDK_INT >= 24 ? com.google.android.material.datepicker.z.f(locale).format(new java.util.Date(j6)) : com.google.android.material.datepicker.z.e(locale).format(new java.util.Date(j6));
    }

    static java.lang.String d(long j6) {
        return i(j6) ? b(j6) : g(j6);
    }

    static java.lang.String e(android.content.Context context, int i6) {
        return com.google.android.material.datepicker.z.i().get(1) == i6 ? java.lang.String.format(context.getString(p125m4.h.f50684n), java.lang.Integer.valueOf(i6)) : java.lang.String.format(context.getString(p125m4.h.f50685o), java.lang.Integer.valueOf(i6));
    }

    static java.lang.String f(long j6) {
        return android.os.Build.VERSION.SDK_INT >= 24 ? com.google.android.material.datepicker.z.m(java.util.Locale.getDefault()).format(new java.util.Date(j6)) : android.text.format.DateUtils.formatDateTime(null, j6, 8228);
    }

    static java.lang.String g(long j6) {
        return h(j6, java.util.Locale.getDefault());
    }

    static java.lang.String h(long j6, java.util.Locale locale) {
        return android.os.Build.VERSION.SDK_INT >= 24 ? com.google.android.material.datepicker.z.n(locale).format(new java.util.Date(j6)) : com.google.android.material.datepicker.z.e(locale).format(new java.util.Date(j6));
    }

    private static boolean i(long j6) {
        java.util.Calendar calendarI = com.google.android.material.datepicker.z.i();
        java.util.Calendar calendarK = com.google.android.material.datepicker.z.k();
        calendarK.setTimeInMillis(j6);
        return calendarI.get(1) == calendarK.get(1);
    }
}
