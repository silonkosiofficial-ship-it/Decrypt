package j$.time;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class DayOfWeek implements j$.time.temporal.TemporalAccessor, j$.time.temporal.o {
    public static final j$.time.DayOfWeek FRIDAY;
    public static final j$.time.DayOfWeek MONDAY;
    public static final j$.time.DayOfWeek SATURDAY;
    public static final j$.time.DayOfWeek SUNDAY;
    public static final j$.time.DayOfWeek THURSDAY;
    public static final j$.time.DayOfWeek TUESDAY;
    public static final j$.time.DayOfWeek WEDNESDAY;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j$.time.DayOfWeek[] f47677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ j$.time.DayOfWeek[] f47678b;

    static {
        j$.time.DayOfWeek dayOfWeek = new j$.time.DayOfWeek("MONDAY", 0);
        MONDAY = dayOfWeek;
        j$.time.DayOfWeek dayOfWeek2 = new j$.time.DayOfWeek("TUESDAY", 1);
        TUESDAY = dayOfWeek2;
        j$.time.DayOfWeek dayOfWeek3 = new j$.time.DayOfWeek("WEDNESDAY", 2);
        WEDNESDAY = dayOfWeek3;
        j$.time.DayOfWeek dayOfWeek4 = new j$.time.DayOfWeek("THURSDAY", 3);
        THURSDAY = dayOfWeek4;
        j$.time.DayOfWeek dayOfWeek5 = new j$.time.DayOfWeek("FRIDAY", 4);
        FRIDAY = dayOfWeek5;
        j$.time.DayOfWeek dayOfWeek6 = new j$.time.DayOfWeek("SATURDAY", 5);
        SATURDAY = dayOfWeek6;
        j$.time.DayOfWeek dayOfWeek7 = new j$.time.DayOfWeek("SUNDAY", 6);
        SUNDAY = dayOfWeek7;
        f47678b = new j$.time.DayOfWeek[]{dayOfWeek, dayOfWeek2, dayOfWeek3, dayOfWeek4, dayOfWeek5, dayOfWeek6, dayOfWeek7};
        f47677a = values();
    }

    public static j$.time.DayOfWeek M(int i6) {
        if (i6 >= 1 && i6 <= 7) {
            return f47677a[i6 - 1];
        }
        throw new j$.time.DateTimeException("Invalid value for DayOfWeek: " + i6);
    }

    public static j$.time.DayOfWeek valueOf(java.lang.String str) {
        return (j$.time.DayOfWeek) java.lang.Enum.valueOf(j$.time.DayOfWeek.class, str);
    }

    public static j$.time.DayOfWeek[] values() {
        return (j$.time.DayOfWeek[]) f47678b.clone();
    }

    public final j$.time.DayOfWeek N(long j6) {
        return f47677a[((((int) (j6 % 7)) + 7) + ordinal()) % 7];
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return sVar == j$.time.temporal.a.DAY_OF_WEEK;
        }
        return sVar != null && sVar.u(this);
    }

    public java.lang.String getDisplayName(j$.time.format.TextStyle textStyle, java.util.Locale locale) {
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder = new j$.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.i(j$.time.temporal.a.DAY_OF_WEEK, textStyle);
        return dateTimeFormatterBuilder.v(locale).a(this);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int n(j$.time.temporal.s sVar) {
        return sVar == j$.time.temporal.a.DAY_OF_WEEK ? getValue() : j$.time.temporal.n.a(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v q(j$.time.temporal.s sVar) {
        return sVar == j$.time.temporal.a.DAY_OF_WEEK ? sVar.n() : j$.time.temporal.n.d(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long u(j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (sVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
        }
        return sVar.q(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object x(j$.time.temporal.TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.n.j() ? j$.time.temporal.b.DAYS : j$.time.temporal.n.c(this, temporalQuery);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m y(j$.time.temporal.m mVar) {
        return mVar.c(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }
}
