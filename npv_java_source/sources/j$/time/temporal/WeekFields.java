package j$.time.temporal;

/* JADX INFO: loaded from: classes4.dex */
public final class WeekFields implements java.io.Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final j$.util.concurrent.ConcurrentHashMap f47922g = new j$.util.concurrent.ConcurrentHashMap(4, 0.75f, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j$.time.temporal.t f47923h;
    private static final long serialVersionUID = -1177360819670808121L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.time.DayOfWeek f47924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient j$.time.temporal.s f47926c = j$.time.temporal.w.e(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient j$.time.temporal.s f47927d = j$.time.temporal.w.h(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient j$.time.temporal.s f47928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient j$.time.temporal.s f47929f;

    static {
        new j$.time.temporal.WeekFields(j$.time.DayOfWeek.MONDAY, 4);
        f(j$.time.DayOfWeek.SUNDAY, 1);
        f47923h = j$.time.temporal.j.f47943d;
    }

    private WeekFields(j$.time.DayOfWeek dayOfWeek, int i6) {
        j$.time.temporal.b bVar = j$.time.temporal.b.NANOS;
        this.f47928e = j$.time.temporal.w.i(this);
        this.f47929f = j$.time.temporal.w.g(this);
        j$.util.Objects.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i6 < 1 || i6 > 7) {
            throw new java.lang.IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f47924a = dayOfWeek;
        this.f47925b = i6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static j$.time.temporal.WeekFields f(j$.time.DayOfWeek dayOfWeek, int i6) {
        java.lang.String str = dayOfWeek.toString() + i6;
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = f47922g;
        j$.time.temporal.WeekFields weekFields = (j$.time.temporal.WeekFields) concurrentHashMap.get(str);
        if (weekFields != null) {
            return weekFields;
        }
        concurrentHashMap.putIfAbsent(str, new j$.time.temporal.WeekFields(dayOfWeek, i6));
        return (j$.time.temporal.WeekFields) concurrentHashMap.get(str);
    }

    public static j$.time.temporal.WeekFields of(java.util.Locale locale) {
        j$.util.Objects.requireNonNull(locale, "locale");
        java.util.Calendar calendar = java.util.Calendar.getInstance(new java.util.Locale(locale.getLanguage(), locale.getCountry()));
        return f(j$.time.DayOfWeek.SUNDAY.N(calendar.getFirstDayOfWeek() - 1), calendar.getMinimalDaysInFirstWeek());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        if (this.f47924a == null) {
            throw new java.io.InvalidObjectException("firstDayOfWeek is null");
        }
        int i6 = this.f47925b;
        if (i6 < 1 || i6 > 7) {
            throw new java.io.InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private java.lang.Object readResolve() throws java.io.InvalidObjectException {
        try {
            return f(this.f47924a, this.f47925b);
        } catch (java.lang.IllegalArgumentException e6) {
            throw new java.io.InvalidObjectException("Invalid serialized WeekFields: " + e6.getMessage());
        }
    }

    public final j$.time.temporal.s d() {
        return this.f47926c;
    }

    public final int e() {
        return this.f47925b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j$.time.temporal.WeekFields) && hashCode() == obj.hashCode();
    }

    public final j$.time.temporal.s g() {
        return this.f47929f;
    }

    public j$.time.DayOfWeek getFirstDayOfWeek() {
        return this.f47924a;
    }

    public final j$.time.temporal.s h() {
        return this.f47927d;
    }

    public final int hashCode() {
        return (this.f47924a.ordinal() * 7) + this.f47925b;
    }

    public final j$.time.temporal.s i() {
        return this.f47928e;
    }

    public final java.lang.String toString() {
        return "WeekFields[" + this.f47924a + "," + this.f47925b + "]";
    }
}
