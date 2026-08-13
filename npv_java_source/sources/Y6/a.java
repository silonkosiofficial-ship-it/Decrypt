package Y6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.TimeZone f16416a = j$.util.DesugarTimeZone.getTimeZone("GMT");

    public static final Y6.b a(java.lang.Long l6) {
        java.util.Calendar calendar = java.util.Calendar.getInstance(f16416a, java.util.Locale.ROOT);
        p247y7.AbstractC7350t.c(calendar);
        return c(calendar, l6);
    }

    public static /* synthetic */ Y6.b b(java.lang.Long l6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            l6 = null;
        }
        return a(l6);
    }

    public static final Y6.b c(java.util.Calendar calendar, java.lang.Long l6) {
        p247y7.AbstractC7350t.f(calendar, "<this>");
        if (l6 != null) {
            calendar.setTimeInMillis(l6.longValue());
        }
        int i6 = calendar.get(15) + calendar.get(16);
        return new Y6.b(calendar.get(13), calendar.get(12), calendar.get(11), Y6.d.f16445D.a((calendar.get(7) + 5) % 7), calendar.get(5), calendar.get(6), Y6.c.f16429D.a(calendar.get(2)), calendar.get(1), calendar.getTimeInMillis() + ((long) i6));
    }
}
