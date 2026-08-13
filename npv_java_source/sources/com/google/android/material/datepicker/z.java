package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes3.dex */
abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static java.util.concurrent.atomic.AtomicReference f43322a = new java.util.concurrent.atomic.AtomicReference();

    static long a(long j6) {
        java.util.Calendar calendarK = k();
        calendarK.setTimeInMillis(j6);
        return c(calendarK).getTimeInMillis();
    }

    private static android.icu.text.DateFormat b(java.lang.String str, java.util.Locale locale) {
        android.icu.text.DateFormat instanceForSkeleton = android.icu.text.DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(j());
        instanceForSkeleton.setContext(android.icu.text.DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    static java.util.Calendar c(java.util.Calendar calendar) {
        java.util.Calendar calendarL = l(calendar);
        java.util.Calendar calendarK = k();
        calendarK.set(calendarL.get(1), calendarL.get(2), calendarL.get(5));
        return calendarK;
    }

    private static java.text.DateFormat d(int i6, java.util.Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i6, locale);
        dateInstance.setTimeZone(h());
        return dateInstance;
    }

    static java.text.DateFormat e(java.util.Locale locale) {
        return d(0, locale);
    }

    static android.icu.text.DateFormat f(java.util.Locale locale) {
        return b("MMMMEEEEd", locale);
    }

    static com.google.android.material.datepicker.t g() {
        com.google.android.material.datepicker.t tVar = (com.google.android.material.datepicker.t) f43322a.get();
        return tVar == null ? com.google.android.material.datepicker.t.c() : tVar;
    }

    private static java.util.TimeZone h() {
        return j$.util.DesugarTimeZone.getTimeZone("UTC");
    }

    static java.util.Calendar i() {
        java.util.Calendar calendarA = g().a();
        calendarA.set(11, 0);
        calendarA.set(12, 0);
        calendarA.set(13, 0);
        calendarA.set(14, 0);
        calendarA.setTimeZone(h());
        return calendarA;
    }

    private static android.icu.util.TimeZone j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    static java.util.Calendar k() {
        return l(null);
    }

    static java.util.Calendar l(java.util.Calendar calendar) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(h());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    static android.icu.text.DateFormat m(java.util.Locale locale) {
        return b("yMMMM", locale);
    }

    static android.icu.text.DateFormat n(java.util.Locale locale) {
        return b("yMMMMEEEEd", locale);
    }
}
