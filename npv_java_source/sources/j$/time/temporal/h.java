package j$.time.temporal;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
abstract class h implements j$.time.temporal.s {
    public static final j$.time.temporal.h DAY_OF_QUARTER;
    public static final j$.time.temporal.h QUARTER_OF_YEAR;
    public static final j$.time.temporal.h WEEK_BASED_YEAR;
    public static final j$.time.temporal.h WEEK_OF_WEEK_BASED_YEAR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f47936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ j$.time.temporal.h[] f47937b;

    static {
        j$.time.temporal.h hVar = new j$.time.temporal.h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.s
            public final j$.time.temporal.v n() {
                return j$.time.temporal.v.k(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.h, j$.time.temporal.s
            public final j$.time.temporal.TemporalAccessor p(java.util.Map map, j$.time.temporal.TemporalAccessor temporalAccessor, j$.time.format.C c6) {
                long jN;
                j$.time.LocalDate localDatePlusMonths;
                j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
                java.lang.Long l6 = (java.lang.Long) map.get(aVar);
                j$.time.temporal.s sVar = j$.time.temporal.h.QUARTER_OF_YEAR;
                java.lang.Long l10 = (java.lang.Long) map.get(sVar);
                if (l6 == null || l10 == null) {
                    return null;
                }
                int iN = aVar.N(l6.longValue());
                long jLongValue = ((java.lang.Long) map.get(j$.time.temporal.h.DAY_OF_QUARTER)).longValue();
                j$.time.temporal.s sVar2 = j$.time.temporal.j.f47940a;
                if (!j$.time.chrono.Chronology.CC.a(temporalAccessor).equals(j$.time.chrono.q.f47758e)) {
                    throw new j$.time.DateTimeException("Resolve requires IsoChronology");
                }
                if (c6 == j$.time.format.C.LENIENT) {
                    localDatePlusMonths = j$.time.LocalDate.of(iN, 1, 1).plusMonths(j$.com.android.tools.r8.a.m(j$.com.android.tools.r8.a.n(l10.longValue(), 1L), 3));
                    jN = j$.com.android.tools.r8.a.n(jLongValue, 1L);
                } else {
                    j$.time.LocalDate localDateOf = j$.time.LocalDate.of(iN, ((sVar.n().a(l10.longValue(), sVar) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        (c6 == j$.time.format.C.STRICT ? y(localDateOf) : n()).b(jLongValue, this);
                    }
                    jN = jLongValue - 1;
                    localDatePlusMonths = localDateOf;
                }
                map.remove(this);
                map.remove(aVar);
                map.remove(sVar);
                return localDatePlusMonths.Y(jN);
            }

            @Override // j$.time.temporal.s
            public final long q(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (!u(temporalAccessor)) {
                    throw new j$.time.temporal.u("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.n(j$.time.temporal.a.DAY_OF_YEAR) - j$.time.temporal.h.f47936a[((temporalAccessor.n(j$.time.temporal.a.MONTH_OF_YEAR) - 1) / 3) + (j$.time.chrono.q.f47758e.J(temporalAccessor.u(j$.time.temporal.a.YEAR)) ? 4 : 0)];
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "DayOfQuarter";
            }

            @Override // j$.time.temporal.s
            public final boolean u(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (temporalAccessor.e(j$.time.temporal.a.DAY_OF_YEAR) && temporalAccessor.e(j$.time.temporal.a.MONTH_OF_YEAR) && temporalAccessor.e(j$.time.temporal.a.YEAR)) {
                    j$.time.temporal.s sVar = j$.time.temporal.j.f47940a;
                    if (j$.time.chrono.Chronology.CC.a(temporalAccessor).equals(j$.time.chrono.q.f47758e)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.s
            public final j$.time.temporal.m x(j$.time.temporal.m mVar, long j6) {
                long jQ = q(mVar);
                n().b(j6, this);
                j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_YEAR;
                return mVar.c((j6 - jQ) + mVar.u(aVar), aVar);
            }

            @Override // j$.time.temporal.s
            public final j$.time.temporal.v y(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (!u(temporalAccessor)) {
                    throw new j$.time.temporal.u("Unsupported field: DayOfQuarter");
                }
                long jU = temporalAccessor.u(j$.time.temporal.h.QUARTER_OF_YEAR);
                if (jU == 1) {
                    return j$.time.chrono.q.f47758e.J(temporalAccessor.u(j$.time.temporal.a.YEAR)) ? j$.time.temporal.v.j(1L, 91L) : j$.time.temporal.v.j(1L, 90L);
                }
                if (jU == 2) {
                    return j$.time.temporal.v.j(1L, 91L);
                }
                return (jU == 3 || jU == 4) ? j$.time.temporal.v.j(1L, 92L) : n();
            }
        };
        DAY_OF_QUARTER = hVar;
        j$.time.temporal.h hVar2 = new j$.time.temporal.h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.s
            public final j$.time.temporal.v n() {
                return j$.time.temporal.v.j(1L, 4L);
            }

            @Override // j$.time.temporal.s
            public final long q(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (u(temporalAccessor)) {
                    return (temporalAccessor.u(j$.time.temporal.a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new j$.time.temporal.u("Unsupported field: QuarterOfYear");
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "QuarterOfYear";
            }

            @Override // j$.time.temporal.s
            public final boolean u(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (temporalAccessor.e(j$.time.temporal.a.MONTH_OF_YEAR)) {
                    j$.time.temporal.s sVar = j$.time.temporal.j.f47940a;
                    if (j$.time.chrono.Chronology.CC.a(temporalAccessor).equals(j$.time.chrono.q.f47758e)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.s
            public final j$.time.temporal.m x(j$.time.temporal.m mVar, long j6) {
                long jQ = q(mVar);
                n().b(j6, this);
                j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
                return mVar.c(((j6 - jQ) * 3) + mVar.u(aVar), aVar);
            }

            @Override // j$.time.temporal.s
            public final j$.time.temporal.v y(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (u(temporalAccessor)) {
                    return n();
                }
                throw new j$.time.temporal.u("Unsupported field: QuarterOfYear");
            }
        };
        QUARTER_OF_YEAR = hVar2;
        j$.time.temporal.h hVar3 = new j$.time.temporal.h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.s
            public final j$.time.temporal.v n() {
                return j$.time.temporal.v.k(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.h, j$.time.temporal.s
            public final j$.time.temporal.TemporalAccessor p(java.util.Map map, j$.time.temporal.TemporalAccessor temporalAccessor, j$.time.format.C c6) {
                j$.time.LocalDate localDateC;
                long j6;
                long j10;
                j$.time.temporal.s sVar = j$.time.temporal.h.WEEK_BASED_YEAR;
                java.lang.Long l6 = (java.lang.Long) map.get(sVar);
                j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_WEEK;
                java.lang.Long l10 = (java.lang.Long) map.get(aVar);
                if (l6 == null || l10 == null) {
                    return null;
                }
                int iA = sVar.n().a(l6.longValue(), sVar);
                long jLongValue = ((java.lang.Long) map.get(j$.time.temporal.h.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                j$.time.temporal.s sVar2 = j$.time.temporal.j.f47940a;
                if (!j$.time.chrono.Chronology.CC.a(temporalAccessor).equals(j$.time.chrono.q.f47758e)) {
                    throw new j$.time.DateTimeException("Resolve requires IsoChronology");
                }
                j$.time.LocalDate localDateOf = j$.time.LocalDate.of(iA, 1, 4);
                if (c6 == j$.time.format.C.LENIENT) {
                    long jLongValue2 = l10.longValue();
                    if (jLongValue2 > 7) {
                        j10 = jLongValue2 - 1;
                        localDateOf = localDateOf.Z(j10 / 7);
                    } else {
                        j6 = 1;
                        if (jLongValue2 < 1) {
                            localDateOf = localDateOf.Z(j$.com.android.tools.r8.a.n(jLongValue2, 7L) / 7);
                            j10 = jLongValue2 + 6;
                        }
                        localDateC = localDateOf.Z(j$.com.android.tools.r8.a.n(jLongValue, j6)).c(jLongValue2, aVar);
                    }
                    j6 = 1;
                    jLongValue2 = (j10 % 7) + 1;
                    localDateC = localDateOf.Z(j$.com.android.tools.r8.a.n(jLongValue, j6)).c(jLongValue2, aVar);
                } else {
                    int iN = aVar.N(l10.longValue());
                    if (jLongValue < 1 || jLongValue > 52) {
                        (c6 == j$.time.format.C.STRICT ? j$.time.temporal.h.R(localDateOf) : n()).b(jLongValue, this);
                    }
                    localDateC = localDateOf.Z(jLongValue - 1).c(iN, aVar);
                }
                map.remove(this);
                map.remove(sVar);
                map.remove(aVar);
                return localDateC;
            }

            @Override // j$.time.temporal.s
            public final long q(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (u(temporalAccessor)) {
                    return j$.time.temporal.h.O(j$.time.LocalDate.O(temporalAccessor));
                }
                throw new j$.time.temporal.u("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // j$.time.temporal.s
            public final boolean u(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (temporalAccessor.e(j$.time.temporal.a.EPOCH_DAY)) {
                    j$.time.temporal.s sVar = j$.time.temporal.j.f47940a;
                    if (j$.time.chrono.Chronology.CC.a(temporalAccessor).equals(j$.time.chrono.q.f47758e)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.s
            public final j$.time.temporal.m x(j$.time.temporal.m mVar, long j6) {
                n().b(j6, this);
                return mVar.d(j$.com.android.tools.r8.a.n(j6, q(mVar)), j$.time.temporal.b.WEEKS);
            }

            @Override // j$.time.temporal.s
            public final j$.time.temporal.v y(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (u(temporalAccessor)) {
                    return j$.time.temporal.h.R(j$.time.LocalDate.O(temporalAccessor));
                }
                throw new j$.time.temporal.u("Unsupported field: WeekOfWeekBasedYear");
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        j$.time.temporal.h hVar4 = new j$.time.temporal.h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.s
            public final j$.time.temporal.v n() {
                return j$.time.temporal.a.YEAR.n();
            }

            @Override // j$.time.temporal.s
            public final long q(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (u(temporalAccessor)) {
                    return j$.time.temporal.h.S(j$.time.LocalDate.O(temporalAccessor));
                }
                throw new j$.time.temporal.u("Unsupported field: WeekBasedYear");
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "WeekBasedYear";
            }

            @Override // j$.time.temporal.s
            public final boolean u(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (temporalAccessor.e(j$.time.temporal.a.EPOCH_DAY)) {
                    j$.time.temporal.s sVar = j$.time.temporal.j.f47940a;
                    if (j$.time.chrono.Chronology.CC.a(temporalAccessor).equals(j$.time.chrono.q.f47758e)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.s
            public final j$.time.temporal.m x(j$.time.temporal.m mVar, long j6) {
                if (!u(mVar)) {
                    throw new j$.time.temporal.u("Unsupported field: WeekBasedYear");
                }
                int iA = j$.time.temporal.a.YEAR.n().a(j6, j$.time.temporal.h.WEEK_BASED_YEAR);
                j$.time.LocalDate localDateO = j$.time.LocalDate.O(mVar);
                j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_WEEK;
                int iN = localDateO.n(aVar);
                int iO = j$.time.temporal.h.O(localDateO);
                if (iO == 53 && j$.time.temporal.h.T(iA) == 52) {
                    iO = 52;
                }
                j$.time.LocalDate localDateOf = j$.time.LocalDate.of(iA, 1, 4);
                return mVar.p(localDateOf.Y(((iO - 1) * 7) + (iN - localDateOf.n(aVar))));
            }

            @Override // j$.time.temporal.s
            public final j$.time.temporal.v y(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (u(temporalAccessor)) {
                    return j$.time.temporal.a.YEAR.n();
                }
                throw new j$.time.temporal.u("Unsupported field: WeekBasedYear");
            }
        };
        WEEK_BASED_YEAR = hVar4;
        f47937b = new j$.time.temporal.h[]{hVar, hVar2, hVar3, hVar4};
        f47936a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    static int O(j$.time.LocalDate localDate) {
        int iOrdinal = localDate.getDayOfWeek().ordinal();
        int i6 = 1;
        int iQ = localDate.Q() - 1;
        int i10 = (3 - iOrdinal) + iQ;
        int i11 = i10 - ((i10 / 7) * 7);
        int i12 = i11 - 3;
        if (i12 < -3) {
            i12 = i11 + 4;
        }
        if (iQ < i12) {
            return (int) j$.time.temporal.v.j(1L, T(S(localDate.f0(180).a0(-1L)))).d();
        }
        int i13 = ((iQ - i12) / 7) + 1;
        if (i13 != 53 || i12 == -3 || (i12 == -2 && localDate.D())) {
            i6 = i13;
        }
        return i6;
    }

    static j$.time.temporal.v R(j$.time.LocalDate localDate) {
        return j$.time.temporal.v.j(1L, T(S(localDate)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int S(j$.time.LocalDate localDate) {
        int year = localDate.getYear();
        int iQ = localDate.Q();
        if (iQ <= 3) {
            return iQ - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
        }
        if (iQ >= 363) {
            return ((iQ - 363) - (localDate.D() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int T(int i6) {
        j$.time.LocalDate localDateOf = j$.time.LocalDate.of(i6, 1, 1);
        if (localDateOf.getDayOfWeek() != j$.time.DayOfWeek.THURSDAY) {
            return (localDateOf.getDayOfWeek() == j$.time.DayOfWeek.WEDNESDAY && localDateOf.D()) ? 53 : 52;
        }
        return 53;
    }

    public static j$.time.temporal.h valueOf(java.lang.String str) {
        return (j$.time.temporal.h) java.lang.Enum.valueOf(j$.time.temporal.h.class, str);
    }

    public static j$.time.temporal.h[] values() {
        return (j$.time.temporal.h[]) f47937b.clone();
    }

    @Override // j$.time.temporal.s
    public final boolean M() {
        return true;
    }

    public /* synthetic */ j$.time.temporal.TemporalAccessor p(java.util.Map map, j$.time.temporal.TemporalAccessor temporalAccessor, j$.time.format.C c6) {
        return null;
    }
}
