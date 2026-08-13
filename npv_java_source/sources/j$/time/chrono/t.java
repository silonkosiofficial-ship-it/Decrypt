package j$.time.chrono;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends j$.time.chrono.AbstractC6695a implements java.io.Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j$.time.chrono.t f47761e = new j$.time.chrono.t();
    private static final long serialVersionUID = 459996390165777884L;

    private t() {
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.chrono.ChronoLocalDate B(int i6, int i10, int i11) {
        return new j$.time.chrono.v(j$.time.LocalDate.of(i6, i10, i11));
    }

    @Override // j$.time.chrono.AbstractC6695a, j$.time.chrono.Chronology
    public final j$.time.chrono.ChronoLocalDate E(java.util.Map map, j$.time.format.C c6) {
        return (j$.time.chrono.v) super.E(map, c6);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.v F(j$.time.temporal.a aVar) {
        long year;
        long value;
        switch (j$.time.chrono.s.f47760a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.u("Unsupported field: " + aVar);
            case 5:
                return j$.time.temporal.v.k(1L, j$.time.chrono.w.v(), 999999999 - j$.time.chrono.w.h().l().getYear());
            case 6:
                return j$.time.temporal.v.k(1L, j$.time.chrono.w.t(), j$.time.temporal.a.DAY_OF_YEAR.n().d());
            case 7:
                year = j$.time.chrono.v.f47763d.getYear();
                value = 999999999;
                break;
            case 8:
                year = j$.time.chrono.w.f47767d.getValue();
                value = j$.time.chrono.w.h().getValue();
                break;
            default:
                return aVar.n();
        }
        return j$.time.temporal.v.j(year, value);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.chrono.ChronoZonedDateTime G(j$.time.Instant instant, j$.time.ZoneId zoneId) {
        return j$.time.chrono.j.P(this, instant, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    public final java.util.List H() {
        return j$.com.android.tools.r8.a.i(j$.time.chrono.w.B());
    }

    @Override // j$.time.chrono.Chronology
    public final boolean J(long j6) {
        return j$.time.chrono.q.f47758e.J(j6);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.chrono.k K(int i6) {
        return j$.time.chrono.w.r(i6);
    }

    @Override // j$.time.chrono.AbstractC6695a
    final j$.time.chrono.ChronoLocalDate P(java.util.Map map, j$.time.format.C c6) {
        j$.time.chrono.v vVarU;
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        java.lang.Long l6 = (java.lang.Long) map.get(aVar);
        j$.time.chrono.w wVarR = l6 != null ? j$.time.chrono.w.r(F(aVar).a(l6.longValue(), aVar)) : null;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        java.lang.Long l10 = (java.lang.Long) map.get(aVar2);
        int iA = l10 != null ? F(aVar2).a(l10.longValue(), aVar2) : 0;
        if (wVarR == null && l10 != null && !map.containsKey(j$.time.temporal.a.YEAR) && c6 != j$.time.format.C.STRICT) {
            wVarR = j$.time.chrono.w.B()[j$.time.chrono.w.B().length - 1];
        }
        if (l10 != null && wVarR != null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                j$.time.temporal.a aVar4 = j$.time.temporal.a.DAY_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    map.remove(aVar);
                    map.remove(aVar2);
                    if (c6 == j$.time.format.C.LENIENT) {
                        return new j$.time.chrono.v(j$.time.LocalDate.of((wVarR.l().getYear() + iA) - 1, 1, 1)).R(j$.com.android.tools.r8.a.n(((java.lang.Long) map.remove(aVar3)).longValue(), 1L), j$.time.temporal.b.MONTHS).R(j$.com.android.tools.r8.a.n(((java.lang.Long) map.remove(aVar4)).longValue(), 1L), j$.time.temporal.b.DAYS);
                    }
                    int iA2 = F(aVar3).a(((java.lang.Long) map.remove(aVar3)).longValue(), aVar3);
                    int iA3 = F(aVar4).a(((java.lang.Long) map.remove(aVar4)).longValue(), aVar4);
                    if (c6 != j$.time.format.C.SMART) {
                        j$.time.LocalDate localDate = j$.time.chrono.v.f47763d;
                        j$.util.Objects.requireNonNull(wVarR, "era");
                        j$.time.LocalDate localDateOf = j$.time.LocalDate.of((wVarR.l().getYear() + iA) - 1, iA2, iA3);
                        if (localDateOf.R(wVarR.l()) || wVarR != j$.time.chrono.w.g(localDateOf)) {
                            throw new j$.time.DateTimeException("year, month, and day not valid for Era");
                        }
                        return new j$.time.chrono.v(wVarR, iA, localDateOf);
                    }
                    if (iA < 1) {
                        throw new j$.time.DateTimeException("Invalid YearOfEra: " + iA);
                    }
                    int year = (wVarR.l().getYear() + iA) - 1;
                    try {
                        vVarU = new j$.time.chrono.v(j$.time.LocalDate.of(year, iA2, iA3));
                    } catch (j$.time.DateTimeException unused) {
                        vVarU = new j$.time.chrono.v(j$.time.LocalDate.of(year, iA2, 1)).U(new j$.time.temporal.q(0));
                    }
                    if (vVarU.Q() == wVarR || j$.time.temporal.n.a(vVarU, j$.time.temporal.a.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return vVarU;
                    }
                    throw new j$.time.DateTimeException("Invalid YearOfEra for Era: " + wVarR + " " + iA);
                }
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar5)) {
                map.remove(aVar);
                map.remove(aVar2);
                if (c6 == j$.time.format.C.LENIENT) {
                    return new j$.time.chrono.v(j$.time.LocalDate.W((wVarR.l().getYear() + iA) - 1, 1)).R(j$.com.android.tools.r8.a.n(((java.lang.Long) map.remove(aVar5)).longValue(), 1L), j$.time.temporal.b.DAYS);
                }
                int iA4 = F(aVar5).a(((java.lang.Long) map.remove(aVar5)).longValue(), aVar5);
                j$.time.LocalDate localDate2 = j$.time.chrono.v.f47763d;
                j$.util.Objects.requireNonNull(wVarR, "era");
                int year2 = wVarR.l().getYear();
                j$.time.LocalDate localDateW = iA == 1 ? j$.time.LocalDate.W(year2, (wVarR.l().Q() + iA4) - 1) : j$.time.LocalDate.W((year2 + iA) - 1, iA4);
                if (localDateW.R(wVarR.l()) || wVarR != j$.time.chrono.w.g(localDateW)) {
                    throw new j$.time.DateTimeException("Invalid parameters");
                }
                return new j$.time.chrono.v(wVarR, iA, localDateW);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final java.lang.String getId() {
        return "Japanese";
    }

    @Override // j$.time.chrono.Chronology
    public final int h(j$.time.chrono.k kVar, int i6) {
        if (!(kVar instanceof j$.time.chrono.w)) {
            throw new java.lang.ClassCastException("Era must be JapaneseEra");
        }
        j$.time.chrono.w wVar = (j$.time.chrono.w) kVar;
        int year = (wVar.l().getYear() + i6) - 1;
        if (i6 == 1) {
            return year;
        }
        if (year < -999999999 || year > 999999999 || year < wVar.l().getYear() || kVar != j$.time.chrono.w.g(j$.time.LocalDate.of(year, 1, 1))) {
            throw new j$.time.DateTimeException("Invalid yearOfEra value");
        }
        return year;
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.chrono.ChronoLocalDate l(long j6) {
        return new j$.time.chrono.v(j$.time.LocalDate.V(j6));
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.chrono.ChronoLocalDate o(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof j$.time.chrono.v ? (j$.time.chrono.v) temporalAccessor : new j$.time.chrono.v(j$.time.LocalDate.O(temporalAccessor));
    }

    @Override // j$.time.chrono.AbstractC6695a
    public final j$.time.chrono.ChronoLocalDate p() {
        return new j$.time.chrono.v(j$.time.LocalDate.O(j$.time.LocalDate.T(j$.time.Clock.c())));
    }

    @Override // j$.time.chrono.Chronology
    public final java.lang.String t() {
        return "japanese";
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.chrono.ChronoLocalDate v(int i6, int i10) {
        return new j$.time.chrono.v(j$.time.LocalDate.W(i6, i10));
    }

    java.lang.Object writeReplace() {
        return new j$.time.chrono.C((byte) 1, this);
    }
}
