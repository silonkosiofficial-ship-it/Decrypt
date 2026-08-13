package j$.time.chrono;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends j$.time.chrono.AbstractC6695a implements java.io.Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j$.time.chrono.q f47758e = new j$.time.chrono.q();
    private static final long serialVersionUID = -1440403870442975015L;

    private q() {
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.chrono.ChronoLocalDate B(int i6, int i10, int i11) {
        return j$.time.LocalDate.of(i6, i10, i11);
    }

    @Override // j$.time.chrono.AbstractC6695a, j$.time.chrono.Chronology
    public final j$.time.chrono.ChronoLocalDate E(java.util.Map map, j$.time.format.C c6) {
        return (j$.time.LocalDate) super.E(map, c6);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.v F(j$.time.temporal.a aVar) {
        return aVar.n();
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.chrono.ChronoZonedDateTime G(j$.time.Instant instant, j$.time.ZoneId zoneId) {
        return j$.time.ZonedDateTime.N(instant, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    public final java.util.List H() {
        return j$.com.android.tools.r8.a.i(j$.time.chrono.r.values());
    }

    @Override // j$.time.chrono.Chronology
    public final boolean J(long j6) {
        return (3 & j6) == 0 && (j6 % 100 != 0 || j6 % 400 == 0);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.chrono.k K(int i6) {
        if (i6 == 0) {
            return j$.time.chrono.r.BCE;
        }
        if (i6 == 1) {
            return j$.time.chrono.r.CE;
        }
        throw new j$.time.DateTimeException("Invalid era: " + i6);
    }

    @Override // j$.time.chrono.AbstractC6695a
    final void N(java.util.Map map, j$.time.format.C c6) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        java.lang.Long l6 = (java.lang.Long) map.remove(aVar);
        if (l6 != null) {
            if (c6 != j$.time.format.C.LENIENT) {
                aVar.O(l6.longValue());
            }
            long j6 = 12;
            j$.time.chrono.AbstractC6695a.n(map, j$.time.temporal.a.MONTH_OF_YEAR, ((int) j$.com.android.tools.r8.a.k(l6.longValue(), j6)) + 1);
            j$.time.chrono.AbstractC6695a.n(map, j$.time.temporal.a.YEAR, j$.com.android.tools.r8.a.l(l6.longValue(), j6));
        }
    }

    @Override // j$.time.chrono.AbstractC6695a
    final j$.time.chrono.ChronoLocalDate O(java.util.Map map, j$.time.format.C c6) {
        int iN;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iN2 = aVar.N(((java.lang.Long) map.remove(aVar)).longValue());
        boolean z6 = true;
        if (c6 == j$.time.format.C.LENIENT) {
            return j$.time.LocalDate.of(iN2, 1, 1).plusMonths(j$.com.android.tools.r8.a.n(((java.lang.Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L)).Y(j$.com.android.tools.r8.a.n(((java.lang.Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iN3 = aVar2.N(((java.lang.Long) map.remove(aVar2)).longValue());
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iN4 = aVar3.N(((java.lang.Long) map.remove(aVar3)).longValue());
        if (c6 == j$.time.format.C.SMART) {
            if (iN3 == 4 || iN3 == 6 || iN3 == 9 || iN3 == 11) {
                iN = 30;
            } else if (iN3 == 2) {
                j$.time.Month month = j$.time.Month.FEBRUARY;
                long j6 = iN2;
                int i6 = j$.time.p.f47912b;
                if ((3 & j6) != 0 || (j6 % 100 == 0 && j6 % 400 != 0)) {
                    z6 = false;
                }
                iN = month.N(z6);
            }
            iN4 = java.lang.Math.min(iN4, iN);
        }
        return j$.time.LocalDate.of(iN2, iN3, iN4);
    }

    @Override // j$.time.chrono.AbstractC6695a
    final j$.time.chrono.ChronoLocalDate P(java.util.Map map, j$.time.format.C c6) {
        j$.time.temporal.a aVar;
        long jN;
        long jLongValue;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        java.lang.Long l6 = (java.lang.Long) map.remove(aVar2);
        if (l6 == null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
            if (!map.containsKey(aVar3)) {
                return null;
            }
            aVar3.O(((java.lang.Long) map.get(aVar3)).longValue());
            return null;
        }
        if (c6 != j$.time.format.C.LENIENT) {
            aVar2.O(l6.longValue());
        }
        java.lang.Long l10 = (java.lang.Long) map.remove(j$.time.temporal.a.ERA);
        if (l10 != null) {
            if (l10.longValue() == 1) {
                aVar = j$.time.temporal.a.YEAR;
                jN = l6.longValue();
            } else {
                if (l10.longValue() != 0) {
                    throw new j$.time.DateTimeException("Invalid value for era: " + l10);
                }
                aVar = j$.time.temporal.a.YEAR;
                jN = j$.com.android.tools.r8.a.n(1L, l6.longValue());
            }
            j$.time.chrono.AbstractC6695a.n(map, aVar, jN);
            return null;
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.YEAR;
        java.lang.Long l11 = (java.lang.Long) map.get(aVar4);
        if (c6 == j$.time.format.C.STRICT) {
            if (l11 == null) {
                map.put(aVar2, l6);
                return null;
            }
            long jLongValue2 = l11.longValue();
            jLongValue = l6.longValue();
            if (jLongValue2 <= 0) {
                jLongValue = j$.com.android.tools.r8.a.n(1L, jLongValue);
            }
        } else if (l11 == null || l11.longValue() > 0) {
            jLongValue = l6.longValue();
        } else {
            jLongValue = l6.longValue();
            jLongValue = j$.com.android.tools.r8.a.n(1L, jLongValue);
        }
        j$.time.chrono.AbstractC6695a.n(map, aVar4, jLongValue);
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final java.lang.String getId() {
        return "ISO";
    }

    @Override // j$.time.chrono.Chronology
    public final int h(j$.time.chrono.k kVar, int i6) {
        if (kVar instanceof j$.time.chrono.r) {
            return kVar == j$.time.chrono.r.CE ? i6 : 1 - i6;
        }
        throw new java.lang.ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.chrono.ChronoLocalDate l(long j6) {
        return j$.time.LocalDate.V(j6);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.chrono.ChronoLocalDate o(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return j$.time.LocalDate.O(temporalAccessor);
    }

    @Override // j$.time.chrono.AbstractC6695a
    public final j$.time.chrono.ChronoLocalDate p() {
        j$.time.Clock clockC = j$.time.Clock.c();
        j$.util.Objects.requireNonNull(clockC, "clock");
        return j$.time.LocalDate.O(j$.time.LocalDate.T(clockC));
    }

    @Override // j$.time.chrono.AbstractC6695a, j$.time.chrono.Chronology
    public final j$.time.chrono.ChronoLocalDateTime r(j$.time.LocalDateTime localDateTime) {
        return j$.time.LocalDateTime.N(localDateTime);
    }

    @Override // j$.time.chrono.Chronology
    public final java.lang.String t() {
        return "iso8601";
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.chrono.ChronoLocalDate v(int i6, int i10) {
        return j$.time.LocalDate.W(i6, i10);
    }

    java.lang.Object writeReplace() {
        return new j$.time.chrono.C((byte) 1, this);
    }
}
