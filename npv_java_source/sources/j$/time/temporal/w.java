package j$.time.temporal;

/* JADX INFO: loaded from: classes4.dex */
final class w implements j$.time.temporal.s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final j$.time.temporal.v f47963f = j$.time.temporal.v.j(1, 7);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final j$.time.temporal.v f47964g = j$.time.temporal.v.k(0, 4, 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final j$.time.temporal.v f47965h = j$.time.temporal.v.k(0, 52, 54);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final j$.time.temporal.v f47966i = j$.time.temporal.v.k(1, 52, 53);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f47967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j$.time.temporal.WeekFields f47968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j$.time.temporal.t f47969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j$.time.temporal.t f47970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j$.time.temporal.v f47971e;

    private w(java.lang.String str, j$.time.temporal.WeekFields weekFields, j$.time.temporal.t tVar, j$.time.temporal.t tVar2, j$.time.temporal.v vVar) {
        this.f47967a = str;
        this.f47968b = weekFields;
        this.f47969c = tVar;
        this.f47970d = tVar2;
        this.f47971e = vVar;
    }

    private static int a(int i6, int i10) {
        return ((i10 - 1) + (i6 + 7)) / 7;
    }

    private int b(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return j$.time.temporal.n.h(temporalAccessor.n(j$.time.temporal.a.DAY_OF_WEEK) - this.f47968b.getFirstDayOfWeek().getValue()) + 1;
    }

    private int c(j$.time.temporal.TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        int iN = temporalAccessor.n(j$.time.temporal.a.YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_YEAR;
        int iN2 = temporalAccessor.n(aVar);
        int iL = l(iN2, iB);
        int iA = a(iL, iN2);
        if (iA == 0) {
            return iN - 1;
        }
        return iA >= a(iL, this.f47968b.e() + ((int) temporalAccessor.q(aVar).d())) ? iN + 1 : iN;
    }

    private int d(j$.time.temporal.TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_YEAR;
        int iN = temporalAccessor.n(aVar);
        int iL = l(iN, iB);
        int iA = a(iL, iN);
        if (iA == 0) {
            return d(j$.time.chrono.Chronology.CC.a(temporalAccessor).o(temporalAccessor).f(iN, (j$.time.temporal.t) j$.time.temporal.b.DAYS));
        }
        if (iA <= 50) {
            return iA;
        }
        int iA2 = a(iL, this.f47968b.e() + ((int) temporalAccessor.q(aVar).d()));
        return iA >= iA2 ? (iA - iA2) + 1 : iA;
    }

    static j$.time.temporal.w e(j$.time.temporal.WeekFields weekFields) {
        return new j$.time.temporal.w("DayOfWeek", weekFields, j$.time.temporal.b.DAYS, j$.time.temporal.b.WEEKS, f47963f);
    }

    private j$.time.chrono.ChronoLocalDate f(j$.time.chrono.Chronology chronology, int i6, int i10, int i11) {
        j$.time.chrono.ChronoLocalDate chronoLocalDateB = chronology.B(i6, 1, 1);
        int iL = l(1, b(chronoLocalDateB));
        return chronoLocalDateB.d(((java.lang.Math.min(i10, a(iL, this.f47968b.e() + chronoLocalDateB.I()) - 1) - 1) * 7) + (i11 - 1) + (-iL), (j$.time.temporal.t) j$.time.temporal.b.DAYS);
    }

    static j$.time.temporal.w g(j$.time.temporal.WeekFields weekFields) {
        return new j$.time.temporal.w("WeekBasedYear", weekFields, j$.time.temporal.j.f47943d, j$.time.temporal.b.FOREVER, j$.time.temporal.a.YEAR.n());
    }

    static j$.time.temporal.w h(j$.time.temporal.WeekFields weekFields) {
        return new j$.time.temporal.w("WeekOfMonth", weekFields, j$.time.temporal.b.WEEKS, j$.time.temporal.b.MONTHS, f47964g);
    }

    static j$.time.temporal.w i(j$.time.temporal.WeekFields weekFields) {
        return new j$.time.temporal.w("WeekOfWeekBasedYear", weekFields, j$.time.temporal.b.WEEKS, j$.time.temporal.j.f47943d, f47966i);
    }

    private j$.time.temporal.v j(j$.time.temporal.TemporalAccessor temporalAccessor, j$.time.temporal.s sVar) {
        int iL = l(temporalAccessor.n(sVar), b(temporalAccessor));
        j$.time.temporal.v vVarQ = temporalAccessor.q(sVar);
        return j$.time.temporal.v.j(a(iL, (int) vVarQ.e()), a(iL, (int) vVarQ.d()));
    }

    private j$.time.temporal.v k(j$.time.temporal.TemporalAccessor temporalAccessor) {
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_YEAR;
        if (!temporalAccessor.e(aVar)) {
            return f47965h;
        }
        int iB = b(temporalAccessor);
        int iN = temporalAccessor.n(aVar);
        int iL = l(iN, iB);
        int iA = a(iL, iN);
        if (iA == 0) {
            return k(j$.time.chrono.Chronology.CC.a(temporalAccessor).o(temporalAccessor).f(iN + 7, (j$.time.temporal.t) j$.time.temporal.b.DAYS));
        }
        int iD = (int) temporalAccessor.q(aVar).d();
        int iA2 = a(iL, this.f47968b.e() + iD);
        return iA >= iA2 ? k(j$.time.chrono.Chronology.CC.a(temporalAccessor).o(temporalAccessor).d((iD - iN) + 8, (j$.time.temporal.t) j$.time.temporal.b.DAYS)) : j$.time.temporal.v.j(1L, iA2 - 1);
    }

    private int l(int i6, int i10) {
        int iH = j$.time.temporal.n.h(i6 - i10);
        return iH + 1 > this.f47968b.e() ? 7 - iH : -iH;
    }

    @Override // j$.time.temporal.s
    public final boolean M() {
        return true;
    }

    @Override // j$.time.temporal.s
    public final j$.time.temporal.v n() {
        return this.f47971e;
    }

    @Override // j$.time.temporal.s
    public final j$.time.temporal.TemporalAccessor p(java.util.Map map, j$.time.temporal.TemporalAccessor temporalAccessor, j$.time.format.C c6) {
        j$.time.chrono.ChronoLocalDate chronoLocalDateD;
        j$.time.chrono.ChronoLocalDate chronoLocalDateD2;
        j$.time.temporal.a aVar;
        j$.time.chrono.ChronoLocalDate chronoLocalDateD3;
        long jLongValue = ((java.lang.Long) map.get(this)).longValue();
        int iF = j$.com.android.tools.r8.a.f(jLongValue);
        j$.time.temporal.b bVar = j$.time.temporal.b.WEEKS;
        j$.time.temporal.v vVar = this.f47971e;
        j$.time.temporal.WeekFields weekFields = this.f47968b;
        j$.time.temporal.t tVar = this.f47970d;
        if (tVar == bVar) {
            long jH = j$.time.temporal.n.h((vVar.a(jLongValue, this) - 1) + (weekFields.getFirstDayOfWeek().getValue() - 1)) + 1;
            map.remove(this);
            map.put(j$.time.temporal.a.DAY_OF_WEEK, java.lang.Long.valueOf(jH));
        } else {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
            if (map.containsKey(aVar2)) {
                int iH = j$.time.temporal.n.h(aVar2.N(((java.lang.Long) map.get(aVar2)).longValue()) - weekFields.getFirstDayOfWeek().getValue()) + 1;
                j$.time.chrono.Chronology chronologyA = j$.time.chrono.Chronology.CC.a(temporalAccessor);
                j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
                if (map.containsKey(aVar3)) {
                    int iN = aVar3.N(((java.lang.Long) map.get(aVar3)).longValue());
                    j$.time.temporal.b bVar2 = j$.time.temporal.b.MONTHS;
                    if (tVar == bVar2) {
                        j$.time.temporal.a aVar4 = j$.time.temporal.a.MONTH_OF_YEAR;
                        if (map.containsKey(aVar4)) {
                            long jLongValue2 = ((java.lang.Long) map.get(aVar4)).longValue();
                            long j6 = iF;
                            if (c6 == j$.time.format.C.LENIENT) {
                                j$.time.chrono.ChronoLocalDate chronoLocalDateD4 = chronologyA.B(iN, 1, 1).d(j$.com.android.tools.r8.a.n(jLongValue2, 1L), (j$.time.temporal.t) bVar2);
                                int iB = b(chronoLocalDateD4);
                                int iN2 = chronoLocalDateD4.n(j$.time.temporal.a.DAY_OF_MONTH);
                                chronoLocalDateD3 = chronoLocalDateD4.d(j$.com.android.tools.r8.a.g(j$.com.android.tools.r8.a.m(j$.com.android.tools.r8.a.n(j6, a(l(iN2, iB), iN2)), 7), iH - b(chronoLocalDateD4)), (j$.time.temporal.t) j$.time.temporal.b.DAYS);
                                aVar = aVar4;
                            } else {
                                aVar = aVar4;
                                j$.time.chrono.ChronoLocalDate chronoLocalDateB = chronologyA.B(iN, aVar.N(jLongValue2), 1);
                                long jA = vVar.a(j6, this);
                                int iB2 = b(chronoLocalDateB);
                                int iN3 = chronoLocalDateB.n(j$.time.temporal.a.DAY_OF_MONTH);
                                j$.time.chrono.ChronoLocalDate chronoLocalDateD5 = chronoLocalDateB.d((((int) (jA - ((long) a(l(iN3, iB2), iN3)))) * 7) + (iH - b(chronoLocalDateB)), (j$.time.temporal.t) j$.time.temporal.b.DAYS);
                                if (c6 == j$.time.format.C.STRICT && chronoLocalDateD5.u(aVar) != jLongValue2) {
                                    throw new j$.time.DateTimeException("Strict mode rejected resolved date as it is in a different month");
                                }
                                chronoLocalDateD3 = chronoLocalDateD5;
                            }
                            map.remove(this);
                            map.remove(aVar3);
                            map.remove(aVar);
                            map.remove(aVar2);
                            return chronoLocalDateD3;
                        }
                    }
                    if (tVar == j$.time.temporal.b.YEARS) {
                        long j10 = iF;
                        j$.time.chrono.ChronoLocalDate chronoLocalDateB2 = chronologyA.B(iN, 1, 1);
                        if (c6 == j$.time.format.C.LENIENT) {
                            int iB3 = b(chronoLocalDateB2);
                            int iN4 = chronoLocalDateB2.n(j$.time.temporal.a.DAY_OF_YEAR);
                            chronoLocalDateD2 = chronoLocalDateB2.d(j$.com.android.tools.r8.a.g(j$.com.android.tools.r8.a.m(j$.com.android.tools.r8.a.n(j10, a(l(iN4, iB3), iN4)), 7), iH - b(chronoLocalDateB2)), (j$.time.temporal.t) j$.time.temporal.b.DAYS);
                        } else {
                            long jA2 = vVar.a(j10, this);
                            int iB4 = b(chronoLocalDateB2);
                            int iN5 = chronoLocalDateB2.n(j$.time.temporal.a.DAY_OF_YEAR);
                            j$.time.chrono.ChronoLocalDate chronoLocalDateD6 = chronoLocalDateB2.d((((int) (jA2 - ((long) a(l(iN5, iB4), iN5)))) * 7) + (iH - b(chronoLocalDateB2)), (j$.time.temporal.t) j$.time.temporal.b.DAYS);
                            if (c6 == j$.time.format.C.STRICT && chronoLocalDateD6.u(aVar3) != iN) {
                                throw new j$.time.DateTimeException("Strict mode rejected resolved date as it is in a different year");
                            }
                            chronoLocalDateD2 = chronoLocalDateD6;
                        }
                        map.remove(this);
                        map.remove(aVar3);
                        map.remove(aVar2);
                        return chronoLocalDateD2;
                    }
                } else if ((tVar == j$.time.temporal.WeekFields.f47923h || tVar == j$.time.temporal.b.FOREVER) && map.containsKey(weekFields.f47929f) && map.containsKey(weekFields.f47928e)) {
                    int iA = ((j$.time.temporal.w) weekFields.f47929f).f47971e.a(((java.lang.Long) map.get(weekFields.f47929f)).longValue(), weekFields.f47929f);
                    if (c6 == j$.time.format.C.LENIENT) {
                        chronoLocalDateD = f(chronologyA, iA, 1, iH).d(j$.com.android.tools.r8.a.n(((java.lang.Long) map.get(weekFields.f47928e)).longValue(), 1L), (j$.time.temporal.t) bVar);
                    } else {
                        j$.time.chrono.ChronoLocalDate chronoLocalDateF = f(chronologyA, iA, ((j$.time.temporal.w) weekFields.f47928e).f47971e.a(((java.lang.Long) map.get(weekFields.f47928e)).longValue(), weekFields.f47928e), iH);
                        if (c6 == j$.time.format.C.STRICT && c(chronoLocalDateF) != iA) {
                            throw new j$.time.DateTimeException("Strict mode rejected resolved date as it is in a different week-based-year");
                        }
                        chronoLocalDateD = chronoLocalDateF;
                    }
                    map.remove(this);
                    map.remove(weekFields.f47929f);
                    map.remove(weekFields.f47928e);
                    map.remove(aVar2);
                    return chronoLocalDateD;
                }
            }
        }
        return null;
    }

    @Override // j$.time.temporal.s
    public final long q(j$.time.temporal.TemporalAccessor temporalAccessor) {
        int iC;
        j$.time.temporal.b bVar = j$.time.temporal.b.WEEKS;
        j$.time.temporal.t tVar = this.f47970d;
        if (tVar == bVar) {
            iC = b(temporalAccessor);
        } else {
            if (tVar == j$.time.temporal.b.MONTHS) {
                int iB = b(temporalAccessor);
                int iN = temporalAccessor.n(j$.time.temporal.a.DAY_OF_MONTH);
                return a(l(iN, iB), iN);
            }
            if (tVar == j$.time.temporal.b.YEARS) {
                int iB2 = b(temporalAccessor);
                int iN2 = temporalAccessor.n(j$.time.temporal.a.DAY_OF_YEAR);
                return a(l(iN2, iB2), iN2);
            }
            if (tVar == j$.time.temporal.WeekFields.f47923h) {
                iC = d(temporalAccessor);
            } else {
                if (tVar != j$.time.temporal.b.FOREVER) {
                    throw new java.lang.IllegalStateException("unreachable, rangeUnit: " + tVar + ", this: " + this);
                }
                iC = c(temporalAccessor);
            }
        }
        return iC;
    }

    public final java.lang.String toString() {
        return this.f47967a + "[" + this.f47968b.toString() + "]";
    }

    @Override // j$.time.temporal.s
    public final boolean u(j$.time.temporal.TemporalAccessor temporalAccessor) {
        j$.time.temporal.a aVar;
        if (!temporalAccessor.e(j$.time.temporal.a.DAY_OF_WEEK)) {
            return false;
        }
        j$.time.temporal.b bVar = j$.time.temporal.b.WEEKS;
        j$.time.temporal.t tVar = this.f47970d;
        if (tVar == bVar) {
            return true;
        }
        if (tVar == j$.time.temporal.b.MONTHS) {
            aVar = j$.time.temporal.a.DAY_OF_MONTH;
        } else if (tVar == j$.time.temporal.b.YEARS || tVar == j$.time.temporal.WeekFields.f47923h) {
            aVar = j$.time.temporal.a.DAY_OF_YEAR;
        } else {
            if (tVar != j$.time.temporal.b.FOREVER) {
                return false;
            }
            aVar = j$.time.temporal.a.YEAR;
        }
        return temporalAccessor.e(aVar);
    }

    @Override // j$.time.temporal.s
    public final j$.time.temporal.m x(j$.time.temporal.m mVar, long j6) {
        int iA = this.f47971e.a(j6, this);
        int iN = mVar.n(this);
        if (iA == iN) {
            return mVar;
        }
        if (this.f47970d != j$.time.temporal.b.FOREVER) {
            return mVar.d(iA - iN, this.f47969c);
        }
        j$.time.temporal.WeekFields weekFields = this.f47968b;
        return f(j$.time.chrono.Chronology.CC.a(mVar), (int) j6, mVar.n(weekFields.f47928e), mVar.n(weekFields.f47926c));
    }

    @Override // j$.time.temporal.s
    public final j$.time.temporal.v y(j$.time.temporal.TemporalAccessor temporalAccessor) {
        j$.time.temporal.b bVar = j$.time.temporal.b.WEEKS;
        j$.time.temporal.t tVar = this.f47970d;
        if (tVar == bVar) {
            return this.f47971e;
        }
        if (tVar == j$.time.temporal.b.MONTHS) {
            return j(temporalAccessor, j$.time.temporal.a.DAY_OF_MONTH);
        }
        if (tVar == j$.time.temporal.b.YEARS) {
            return j(temporalAccessor, j$.time.temporal.a.DAY_OF_YEAR);
        }
        if (tVar == j$.time.temporal.WeekFields.f47923h) {
            return k(temporalAccessor);
        }
        if (tVar == j$.time.temporal.b.FOREVER) {
            return j$.time.temporal.a.YEAR.n();
        }
        throw new java.lang.IllegalStateException("unreachable, rangeUnit: " + tVar + ", this: " + this);
    }
}
