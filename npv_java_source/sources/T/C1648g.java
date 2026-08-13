package T;

/* JADX INFO: renamed from: T.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1648g extends T.AbstractC1647f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final T.C1648g.a f12816e = new T.C1648g.a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f12817f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final j$.time.ZoneId f12818g = j$.time.ZoneId.of("UTC");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f12820d;

    /* JADX INFO: renamed from: T.g$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        private final j$.time.format.DateTimeFormatter b(java.lang.String str, java.util.Locale locale, java.util.Map map) {
            java.lang.String str2 = "P:" + str + locale.toLanguageTag();
            java.lang.Object objWithDecimalStyle = map.get(str2);
            if (objWithDecimalStyle == null) {
                objWithDecimalStyle = j$.time.format.DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(j$.time.format.DecimalStyle.of(locale));
                map.put(str2, objWithDecimalStyle);
            }
            p247y7.AbstractC7350t.d(objWithDecimalStyle, "null cannot be cast to non-null type java.time.format.DateTimeFormatter");
            return (j$.time.format.DateTimeFormatter) objWithDecimalStyle;
        }

        public final java.lang.String a(long j6, java.lang.String str, java.util.Locale locale, java.util.Map map) {
            return j$.time.Instant.ofEpochMilli(j6).atZone(c()).b().format(b(str, locale, map));
        }

        public final j$.time.ZoneId c() {
            return T.C1648g.f12818g;
        }
    }

    public C1648g(java.util.Locale locale) {
        super(locale);
        this.f12819c = j$.time.temporal.WeekFields.of(locale).getFirstDayOfWeek().getValue();
        j$.time.DayOfWeek[] dayOfWeekArrValues = j$.time.DayOfWeek.values();
        java.util.ArrayList arrayList = new java.util.ArrayList(dayOfWeekArrValues.length);
        for (j$.time.DayOfWeek dayOfWeek : dayOfWeekArrValues) {
            arrayList.add(p087i7.B.a(dayOfWeek.getDisplayName(j$.time.format.TextStyle.FULL, locale), dayOfWeek.getDisplayName(j$.time.format.TextStyle.NARROW, locale)));
        }
        this.f12820d = arrayList;
    }

    private final T.j n(j$.time.LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - d();
        if (value < 0) {
            value += 7;
        }
        return new T.j(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.w(j$.time.LocalTime.MIDNIGHT).m(f12818g).toInstant().toEpochMilli());
    }

    private final j$.time.LocalDate o(T.j jVar) {
        return j$.time.Instant.ofEpochMilli(jVar.d()).atZone(f12818g).b();
    }

    @Override // T.AbstractC1647f
    public java.lang.String a(long j6, java.lang.String str, java.util.Locale locale) {
        return f12816e.a(j6, str, locale, e());
    }

    @Override // T.AbstractC1647f
    public T.C1646e b(long j6) {
        j$.time.LocalDate localDate = j$.time.Instant.ofEpochMilli(j6).atZone(f12818g).b();
        return new T.C1646e(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), localDate.atStartOfDay().toEpochSecond(j$.time.ZoneOffset.UTC) * ((long) 1000));
    }

    @Override // T.AbstractC1647f
    public T.k c(java.util.Locale locale) {
        return T.AbstractC1649h.a(j$.time.format.DateTimeFormatterBuilder.getLocalizedDateTimePattern(j$.time.format.FormatStyle.SHORT, null, j$.time.chrono.Chronology.CC.ofLocale(locale), locale));
    }

    @Override // T.AbstractC1647f
    public int d() {
        return this.f12819c;
    }

    @Override // T.AbstractC1647f
    public T.j f(int i6, int i10) {
        return n(j$.time.LocalDate.of(i6, i10, 1));
    }

    @Override // T.AbstractC1647f
    public T.j g(long j6) {
        return n(j$.time.Instant.ofEpochMilli(j6).atZone(f12818g).withDayOfMonth(1).b());
    }

    @Override // T.AbstractC1647f
    public T.j h(T.C1646e c1646e) {
        return n(j$.time.LocalDate.of(c1646e.m(), c1646e.g(), 1));
    }

    @Override // T.AbstractC1647f
    public T.C1646e i() {
        j$.time.LocalDate localDateNow = j$.time.LocalDate.now();
        return new T.C1646e(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.getDayOfMonth(), localDateNow.w(j$.time.LocalTime.MIDNIGHT).m(f12818g).toInstant().toEpochMilli());
    }

    @Override // T.AbstractC1647f
    public java.util.List j() {
        return this.f12820d;
    }

    @Override // T.AbstractC1647f
    public T.C1646e k(java.lang.String str, java.lang.String str2) {
        try {
            j$.time.LocalDate localDate = j$.time.LocalDate.parse(str, j$.time.format.DateTimeFormatter.ofPattern(str2));
            return new T.C1646e(localDate.getYear(), localDate.getMonth().getValue(), localDate.getDayOfMonth(), localDate.w(j$.time.LocalTime.MIDNIGHT).m(f12818g).toInstant().toEpochMilli());
        } catch (j$.time.format.DateTimeParseException unused) {
            return null;
        }
    }

    @Override // T.AbstractC1647f
    public T.j l(T.j jVar, int i6) {
        return i6 <= 0 ? jVar : n(o(jVar).plusMonths(i6));
    }

    public java.lang.String toString() {
        return "CalendarModel";
    }
}
