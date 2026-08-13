package j$.time;

/* JADX INFO: loaded from: classes4.dex */
public final class LocalDate implements j$.time.temporal.m, j$.time.temporal.o, j$.time.chrono.ChronoLocalDate, java.io.Serializable {
    private static final long serialVersionUID = 2942565459149668126L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final short f47685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final short f47686c;
    public static final j$.time.LocalDate MIN = of(-999999999, 1, 1);
    public static final j$.time.LocalDate MAX = of(999999999, 12, 31);

    static {
        of(1970, 1, 1);
    }

    private LocalDate(int i6, int i10, int i11) {
        this.f47684a = i6;
        this.f47685b = (short) i10;
        this.f47686c = (short) i11;
    }

    private static j$.time.LocalDate N(int i6, int i10, int i11) {
        int i12 = 28;
        if (i11 > 28) {
            if (i10 != 2) {
                i12 = (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) ? 30 : 31;
            } else if (j$.time.chrono.q.f47758e.J(i6)) {
                i12 = 29;
            }
            if (i11 > i12) {
                if (i11 == 29) {
                    throw new j$.time.DateTimeException("Invalid date 'February 29' as '" + i6 + "' is not a leap year");
                }
                throw new j$.time.DateTimeException("Invalid date '" + j$.time.Month.P(i10).name() + " " + i11 + "'");
            }
        }
        return new j$.time.LocalDate(i6, i10, i11);
    }

    public static j$.time.LocalDate O(j$.time.temporal.TemporalAccessor temporalAccessor) {
        j$.util.Objects.requireNonNull(temporalAccessor, "temporal");
        j$.time.LocalDate localDate = (j$.time.LocalDate) temporalAccessor.x(j$.time.temporal.n.f());
        if (localDate != null) {
            return localDate;
        }
        throw new j$.time.DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    private int P(j$.time.temporal.s sVar) {
        int i6;
        int i10 = j$.time.e.f47776a[((j$.time.temporal.a) sVar).ordinal()];
        short s6 = this.f47686c;
        int i11 = this.f47684a;
        switch (i10) {
            case 1:
                return s6;
            case 2:
                return Q();
            case 3:
                i6 = (s6 - 1) / 7;
                break;
            case 4:
                return i11 >= 1 ? i11 : 1 - i11;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                i6 = (s6 - 1) % 7;
                break;
            case 7:
                return ((Q() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.u("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((Q() - 1) / 7) + 1;
            case 10:
                return this.f47685b;
            case 11:
                throw new j$.time.temporal.u("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i11;
            case 13:
                return i11 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
        }
        return i6 + 1;
    }

    public static j$.time.LocalDate T(j$.time.Clock clock) {
        j$.util.Objects.requireNonNull(clock, "clock");
        j$.time.Instant instant = clock.instant();
        j$.time.ZoneId zoneIdA = clock.a();
        j$.util.Objects.requireNonNull(instant, "instant");
        j$.util.Objects.requireNonNull(zoneIdA, "zone");
        return V(j$.com.android.tools.r8.a.l(instant.getEpochSecond() + ((long) zoneIdA.getRules().d(instant).getTotalSeconds()), 86400));
    }

    public static j$.time.LocalDate U(int i6, j$.time.Month month, int i10) {
        j$.time.temporal.a.YEAR.O(i6);
        j$.util.Objects.requireNonNull(month, "month");
        j$.time.temporal.a.DAY_OF_MONTH.O(i10);
        return N(i6, month.getValue(), i10);
    }

    public static j$.time.LocalDate V(long j6) {
        long j10;
        j$.time.temporal.a.EPOCH_DAY.O(j6);
        long j11 = 719468 + j6;
        if (j11 < 0) {
            long j12 = ((j6 + 719469) / 146097) - 1;
            j10 = j12 * 400;
            j11 += (-j12) * 146097;
        } else {
            j10 = 0;
        }
        long j13 = ((j11 * 400) + 591) / 146097;
        long j14 = j11 - ((j13 / 400) + (((j13 / 4) + (j13 * 365)) - (j13 / 100)));
        if (j14 < 0) {
            j13--;
            j14 = j11 - ((j13 / 400) + (((j13 / 4) + (365 * j13)) - (j13 / 100)));
        }
        int i6 = (int) j14;
        int i10 = ((i6 * 5) + 2) / 153;
        return new j$.time.LocalDate(j$.time.temporal.a.YEAR.N(j13 + j10 + ((long) (i10 / 10))), ((i10 + 2) % 12) + 1, (i6 - (((i10 * 306) + 5) / 10)) + 1);
    }

    public static j$.time.LocalDate W(int i6, int i10) {
        long j6 = i6;
        j$.time.temporal.a.YEAR.O(j6);
        j$.time.temporal.a.DAY_OF_YEAR.O(i10);
        boolean zJ = j$.time.chrono.q.f47758e.J(j6);
        if (i10 == 366 && !zJ) {
            throw new j$.time.DateTimeException("Invalid date 'DayOfYear 366' as '" + i6 + "' is not a leap year");
        }
        j$.time.Month monthP = j$.time.Month.P(((i10 - 1) / 31) + 1);
        if (i10 > (monthP.N(zJ) + monthP.M(zJ)) - 1) {
            monthP = monthP.Q();
        }
        return new j$.time.LocalDate(i6, monthP.getValue(), (i10 - monthP.M(zJ)) + 1);
    }

    private static j$.time.LocalDate b0(int i6, int i10, int i11) {
        int i12;
        if (i10 != 2) {
            if (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) {
                i12 = 30;
            }
            return new j$.time.LocalDate(i6, i10, i11);
        }
        i12 = j$.time.chrono.q.f47758e.J((long) i6) ? 29 : 28;
        i11 = java.lang.Math.min(i11, i12);
        return new j$.time.LocalDate(i6, i10, i11);
    }

    public static j$.time.LocalDate now() {
        return T(j$.time.Clock.c());
    }

    public static j$.time.LocalDate of(int i6, int i10, int i11) {
        j$.time.temporal.a.YEAR.O(i6);
        j$.time.temporal.a.MONTH_OF_YEAR.O(i10);
        j$.time.temporal.a.DAY_OF_MONTH.O(i11);
        return N(i6, i10, i11);
    }

    public static j$.time.LocalDate parse(java.lang.CharSequence charSequence) {
        return parse(charSequence, j$.time.format.DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public static j$.time.LocalDate parse(java.lang.CharSequence charSequence, j$.time.format.DateTimeFormatter dateTimeFormatter) {
        j$.util.Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (j$.time.LocalDate) dateTimeFormatter.parse(charSequence, new j$.time.d(0));
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.n((byte) 3, this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.ChronoLocalDate C(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.m) {
            j$.time.m mVar = (j$.time.m) rVar;
            return plusMonths(mVar.d()).Y(mVar.a());
        }
        j$.util.Objects.requireNonNull(rVar, "amountToAdd");
        return (j$.time.LocalDate) rVar.n(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean D() {
        return j$.time.chrono.q.f47758e.J(this.f47684a);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int I() {
        return D() ? 366 : 365;
    }

    final int M(j$.time.LocalDate localDate) {
        int i6 = this.f47684a - localDate.f47684a;
        if (i6 != 0) {
            return i6;
        }
        int i10 = this.f47685b - localDate.f47685b;
        return i10 == 0 ? this.f47686c - localDate.f47686c : i10;
    }

    public final int Q() {
        return (getMonth().M(D()) + this.f47686c) - 1;
    }

    public final boolean R(j$.time.chrono.ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof j$.time.LocalDate) {
            return M((j$.time.LocalDate) chronoLocalDate) < 0;
        }
        return toEpochDay() < chronoLocalDate.toEpochDay();
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final j$.time.LocalDate f(long j6, j$.time.temporal.t tVar) {
        return j6 == Long.MIN_VALUE ? d(Long.MAX_VALUE, tVar).d(1L, tVar) : d(-j6, tVar);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final j$.time.LocalDate d(long j6, j$.time.temporal.t tVar) {
        if (!(tVar instanceof j$.time.temporal.b)) {
            return (j$.time.LocalDate) tVar.n(this, j6);
        }
        switch (j$.time.e.f47777b[((j$.time.temporal.b) tVar).ordinal()]) {
            case 1:
                return Y(j6);
            case 2:
                return Z(j6);
            case 3:
                return plusMonths(j6);
            case 4:
                return a0(j6);
            case 5:
                return a0(j$.com.android.tools.r8.a.m(j6, 10));
            case 6:
                return a0(j$.com.android.tools.r8.a.m(j6, 100));
            case 7:
                return a0(j$.com.android.tools.r8.a.m(j6, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(j$.com.android.tools.r8.a.g(u(aVar), j6), aVar);
            default:
                throw new j$.time.temporal.u("Unsupported unit: " + tVar);
        }
    }

    public final j$.time.LocalDate Y(long j6) {
        if (j6 == 0) {
            return this;
        }
        long j10 = ((long) this.f47686c) + j6;
        if (j10 > 0) {
            short s6 = this.f47685b;
            int i6 = this.f47684a;
            if (j10 <= 28) {
                return new j$.time.LocalDate(i6, s6, (int) j10);
            }
            if (j10 <= 59) {
                long jLengthOfMonth = lengthOfMonth();
                if (j10 <= jLengthOfMonth) {
                    return new j$.time.LocalDate(i6, s6, (int) j10);
                }
                if (s6 < 12) {
                    return new j$.time.LocalDate(i6, s6 + 1, (int) (j10 - jLengthOfMonth));
                }
                int i10 = i6 + 1;
                j$.time.temporal.a.YEAR.O(i10);
                return new j$.time.LocalDate(i10, 1, (int) (j10 - jLengthOfMonth));
            }
        }
        return V(j$.com.android.tools.r8.a.g(toEpochDay(), j6));
    }

    public final j$.time.LocalDate Z(long j6) {
        return Y(j$.com.android.tools.r8.a.m(j6, 7));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.Chronology a() {
        return j$.time.chrono.q.f47758e;
    }

    public final j$.time.LocalDate a0(long j6) {
        return j6 == 0 ? this : b0(j$.time.temporal.a.YEAR.N(((long) this.f47684a) + j6), this.f47685b, this.f47686c);
    }

    public j$.time.LocalDateTime atStartOfDay() {
        return j$.time.LocalDateTime.of(this, j$.time.LocalTime.MIDNIGHT);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: atTime, reason: merged with bridge method [inline-methods] */
    public j$.time.LocalDateTime w(j$.time.LocalTime localTime) {
        return j$.time.LocalDateTime.of(this, localTime);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final j$.time.LocalDate c(long j6, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return (j$.time.LocalDate) sVar.x(this, j6);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
        aVar.O(j6);
        int i6 = j$.time.e.f47776a[aVar.ordinal()];
        short s6 = this.f47685b;
        int i10 = this.f47684a;
        switch (i6) {
            case 1:
                return e0((int) j6);
            case 2:
                return f0((int) j6);
            case 3:
                return Z(j6 - u(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (i10 < 1) {
                    j6 = 1 - j6;
                }
                return g0((int) j6);
            case 5:
                return Y(j6 - ((long) getDayOfWeek().getValue()));
            case 6:
                return Y(j6 - u(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return Y(j6 - u(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return V(j6);
            case 9:
                return Z(j6 - u(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i11 = (int) j6;
                if (s6 == i11) {
                    return this;
                }
                j$.time.temporal.a.MONTH_OF_YEAR.O(i11);
                return b0(i10, i11, this.f47686c);
            case 11:
                return plusMonths(j6 - (((((long) i10) * 12) + ((long) s6)) - 1));
            case 12:
                return g0((int) j6);
            case 13:
                return u(j$.time.temporal.a.ERA) == j6 ? this : g0(1 - i10);
            default:
                throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public int compareTo(j$.time.chrono.ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof j$.time.LocalDate ? M((j$.time.LocalDate) chronoLocalDate) : j$.time.chrono.AbstractC6701g.b(this, chronoLocalDate);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final j$.time.LocalDate p(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.LocalDate ? (j$.time.LocalDate) oVar : (j$.time.LocalDate) oVar.y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.s sVar) {
        return j$.time.chrono.AbstractC6701g.h(this, sVar);
    }

    public final j$.time.LocalDate e0(int i6) {
        return this.f47686c == i6 ? this : of(this.f47684a, this.f47685b, i6);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j$.time.LocalDate) && M((j$.time.LocalDate) obj) == 0;
    }

    public final j$.time.LocalDate f0(int i6) {
        return Q() == i6 ? this : W(this.f47684a, i6);
    }

    public java.lang.String format(j$.time.format.DateTimeFormatter dateTimeFormatter) {
        j$.util.Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    public final j$.time.LocalDate g0(int i6) {
        if (this.f47684a == i6) {
            return this;
        }
        j$.time.temporal.a.YEAR.O(i6);
        return b0(i6, this.f47685b, this.f47686c);
    }

    public int getDayOfMonth() {
        return this.f47686c;
    }

    public j$.time.DayOfWeek getDayOfWeek() {
        return j$.time.DayOfWeek.M(((int) j$.com.android.tools.r8.a.k(toEpochDay() + 3, 7)) + 1);
    }

    public j$.time.Month getMonth() {
        return j$.time.Month.P(this.f47685b);
    }

    public int getMonthValue() {
        return this.f47685b;
    }

    public int getYear() {
        return this.f47684a;
    }

    final void h0(java.io.DataOutput dataOutput) throws java.io.IOException {
        dataOutput.writeInt(this.f47684a);
        dataOutput.writeByte(this.f47685b);
        dataOutput.writeByte(this.f47686c);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        int i6 = this.f47684a;
        return (((i6 << 11) + (this.f47685b << 6)) + this.f47686c) ^ (i6 & (-2048));
    }

    public int lengthOfMonth() {
        short s6 = this.f47685b;
        if (s6 != 2) {
            return (s6 == 4 || s6 == 6 || s6 == 9 || s6 == 11) ? 30 : 31;
        }
        return D() ? 29 : 28;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int n(j$.time.temporal.s sVar) {
        return sVar instanceof j$.time.temporal.a ? P(sVar) : j$.time.temporal.n.a(this, sVar);
    }

    public j$.time.LocalDate plusMonths(long j6) {
        if (j6 == 0) {
            return this;
        }
        long j10 = (((long) this.f47684a) * 12) + ((long) (this.f47685b - 1)) + j6;
        long j11 = 12;
        return b0(j$.time.temporal.a.YEAR.N(j$.com.android.tools.r8.a.l(j10, j11)), ((int) j$.com.android.tools.r8.a.k(j10, j11)) + 1, this.f47686c);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v q(j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return sVar.y(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
        if (!aVar.M()) {
            throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
        }
        int i6 = j$.time.e.f47776a[aVar.ordinal()];
        if (i6 == 1) {
            return j$.time.temporal.v.j(1L, lengthOfMonth());
        }
        if (i6 == 2) {
            return j$.time.temporal.v.j(1L, I());
        }
        if (i6 == 3) {
            return j$.time.temporal.v.j(1L, (getMonth() != j$.time.Month.FEBRUARY || D()) ? 5L : 4L);
        }
        if (i6 != 4) {
            return ((j$.time.temporal.a) sVar).n();
        }
        return j$.time.temporal.v.j(1L, getYear() <= 0 ? 1000000000L : 999999999L);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        long j6;
        long j10 = this.f47684a;
        long j11 = this.f47685b;
        long j12 = 365 * j10;
        if (j10 >= 0) {
            j6 = ((j10 + 399) / 400) + (((3 + j10) / 4) - ((99 + j10) / 100)) + j12;
        } else {
            j6 = j12 - ((j10 / (-400)) + ((j10 / (-4)) - (j10 / (-100))));
        }
        long j13 = (((367 * j11) - 362) / 12) + j6 + ((long) (this.f47686c - 1));
        if (j11 > 2) {
            j13 = !D() ? j13 - 2 : j13 - 1;
        }
        return j13 - 719528;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public java.lang.String toString() {
        int i6;
        int i10 = this.f47684a;
        int iAbs = java.lang.Math.abs(i10);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(10);
        if (iAbs < 1000) {
            if (i10 < 0) {
                sb.append(i10 - 10000);
                i6 = 1;
            } else {
                sb.append(i10 + 10000);
                i6 = 0;
            }
            sb.deleteCharAt(i6);
        } else {
            if (i10 > 9999) {
                sb.append('+');
            }
            sb.append(i10);
        }
        short s6 = this.f47685b;
        sb.append(s6 < 10 ? "-0" : "-");
        sb.append((int) s6);
        short s10 = this.f47686c;
        sb.append(s10 < 10 ? "-0" : "-");
        sb.append((int) s10);
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long u(j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return sVar.q(this);
        }
        if (sVar == j$.time.temporal.a.EPOCH_DAY) {
            return toEpochDay();
        }
        return sVar == j$.time.temporal.a.PROLEPTIC_MONTH ? ((((long) this.f47684a) * 12) + ((long) this.f47685b)) - 1 : P(sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object x(j$.time.temporal.TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.n.f() ? this : j$.time.chrono.AbstractC6701g.j(this, temporalQuery);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m y(j$.time.temporal.m mVar) {
        return j$.time.chrono.AbstractC6701g.a(this, mVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.k z() {
        return getYear() >= 1 ? j$.time.chrono.r.CE : j$.time.chrono.r.BCE;
    }
}
