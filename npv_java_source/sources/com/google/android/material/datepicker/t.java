package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes3.dex */
class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.material.datepicker.t f43319c = new com.google.android.material.datepicker.t(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Long f43320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.TimeZone f43321b;

    private t(java.lang.Long l6, java.util.TimeZone timeZone) {
        this.f43320a = l6;
        this.f43321b = timeZone;
    }

    static com.google.android.material.datepicker.t c() {
        return f43319c;
    }

    java.util.Calendar a() {
        return b(this.f43321b);
    }

    java.util.Calendar b(java.util.TimeZone timeZone) {
        java.util.Calendar calendar = timeZone == null ? java.util.Calendar.getInstance() : java.util.Calendar.getInstance(timeZone);
        java.lang.Long l6 = this.f43320a;
        if (l6 != null) {
            calendar.setTimeInMillis(l6.longValue());
        }
        return calendar;
    }
}
