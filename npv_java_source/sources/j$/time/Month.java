package j$.time;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class Month implements j$.time.temporal.TemporalAccessor, j$.time.temporal.o {
    public static final j$.time.Month APRIL;
    public static final j$.time.Month AUGUST;
    public static final j$.time.Month DECEMBER;
    public static final j$.time.Month FEBRUARY;
    public static final j$.time.Month JANUARY;
    public static final j$.time.Month JULY;
    public static final j$.time.Month JUNE;
    public static final j$.time.Month MARCH;
    public static final j$.time.Month MAY;
    public static final j$.time.Month NOVEMBER;
    public static final j$.time.Month OCTOBER;
    public static final j$.time.Month SEPTEMBER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j$.time.Month[] f47694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ j$.time.Month[] f47695b;

    static {
        j$.time.Month month = new j$.time.Month("JANUARY", 0);
        JANUARY = month;
        j$.time.Month month2 = new j$.time.Month("FEBRUARY", 1);
        FEBRUARY = month2;
        j$.time.Month month3 = new j$.time.Month("MARCH", 2);
        MARCH = month3;
        j$.time.Month month4 = new j$.time.Month("APRIL", 3);
        APRIL = month4;
        j$.time.Month month5 = new j$.time.Month("MAY", 4);
        MAY = month5;
        j$.time.Month month6 = new j$.time.Month("JUNE", 5);
        JUNE = month6;
        j$.time.Month month7 = new j$.time.Month("JULY", 6);
        JULY = month7;
        j$.time.Month month8 = new j$.time.Month("AUGUST", 7);
        AUGUST = month8;
        j$.time.Month month9 = new j$.time.Month("SEPTEMBER", 8);
        SEPTEMBER = month9;
        j$.time.Month month10 = new j$.time.Month("OCTOBER", 9);
        OCTOBER = month10;
        j$.time.Month month11 = new j$.time.Month("NOVEMBER", 10);
        NOVEMBER = month11;
        j$.time.Month month12 = new j$.time.Month("DECEMBER", 11);
        DECEMBER = month12;
        f47695b = new j$.time.Month[]{month, month2, month3, month4, month5, month6, month7, month8, month9, month10, month11, month12};
        f47694a = values();
    }

    public static j$.time.Month P(int i6) {
        if (i6 >= 1 && i6 <= 12) {
            return f47694a[i6 - 1];
        }
        throw new j$.time.DateTimeException("Invalid value for MonthOfYear: " + i6);
    }

    public static j$.time.Month valueOf(java.lang.String str) {
        return (j$.time.Month) java.lang.Enum.valueOf(j$.time.Month.class, str);
    }

    public static j$.time.Month[] values() {
        return (j$.time.Month[]) f47695b.clone();
    }

    public final int M(boolean z6) {
        switch (j$.time.h.f47897a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z6 ? 1 : 0) + 91;
            case 3:
                return (z6 ? 1 : 0) + 152;
            case 4:
                return (z6 ? 1 : 0) + 244;
            case 5:
                return (z6 ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z6 ? 1 : 0) + 60;
            case 8:
                return (z6 ? 1 : 0) + 121;
            case 9:
                return (z6 ? 1 : 0) + 182;
            case 10:
                return (z6 ? 1 : 0) + 213;
            case 11:
                return (z6 ? 1 : 0) + 274;
            default:
                return (z6 ? 1 : 0) + 335;
        }
    }

    public final int N(boolean z6) {
        int i6 = j$.time.h.f47897a[ordinal()];
        if (i6 != 1) {
            return (i6 == 2 || i6 == 3 || i6 == 4 || i6 == 5) ? 30 : 31;
        }
        return z6 ? 29 : 28;
    }

    public final int O() {
        int i6 = j$.time.h.f47897a[ordinal()];
        if (i6 != 1) {
            return (i6 == 2 || i6 == 3 || i6 == 4 || i6 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final j$.time.Month Q() {
        return f47694a[((((int) 1) + 12) + ordinal()) % 12];
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return sVar == j$.time.temporal.a.MONTH_OF_YEAR;
        }
        return sVar != null && sVar.u(this);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int n(j$.time.temporal.s sVar) {
        return sVar == j$.time.temporal.a.MONTH_OF_YEAR ? getValue() : j$.time.temporal.n.a(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v q(j$.time.temporal.s sVar) {
        return sVar == j$.time.temporal.a.MONTH_OF_YEAR ? sVar.n() : j$.time.temporal.n.d(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long u(j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (sVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
        }
        return sVar.q(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object x(j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.e()) {
            return j$.time.chrono.q.f47758e;
        }
        return temporalQuery == j$.time.temporal.n.j() ? j$.time.temporal.b.MONTHS : j$.time.temporal.n.c(this, temporalQuery);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m y(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.Chronology.CC.a(mVar).equals(j$.time.chrono.q.f47758e)) {
            throw new j$.time.DateTimeException("Adjustment only supported on ISO date-time");
        }
        return mVar.c(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
