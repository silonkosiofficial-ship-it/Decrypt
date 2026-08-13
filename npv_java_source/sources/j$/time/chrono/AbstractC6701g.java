package j$.time.chrono;

/* JADX INFO: renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC6701g {
    public static j$.time.temporal.m a(j$.time.chrono.ChronoLocalDate chronoLocalDate, j$.time.temporal.m mVar) {
        return mVar.c(chronoLocalDate.toEpochDay(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static int b(j$.time.chrono.ChronoLocalDate chronoLocalDate, j$.time.chrono.ChronoLocalDate chronoLocalDate2) {
        int iCompare = java.lang.Long.compare(chronoLocalDate.toEpochDay(), chronoLocalDate2.toEpochDay());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((j$.time.chrono.AbstractC6695a) chronoLocalDate.a()).compareTo(chronoLocalDate2.a());
    }

    public static int c(j$.time.chrono.ChronoLocalDateTime chronoLocalDateTime, j$.time.chrono.ChronoLocalDateTime chronoLocalDateTime2) {
        int iCompareTo = chronoLocalDateTime.b().compareTo(chronoLocalDateTime2.b());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = chronoLocalDateTime.toLocalTime().compareTo(chronoLocalDateTime2.toLocalTime());
        return iCompareTo2 == 0 ? chronoLocalDateTime.a().compareTo(chronoLocalDateTime2.a()) : iCompareTo2;
    }

    public static int d(j$.time.chrono.ChronoZonedDateTime chronoZonedDateTime, j$.time.chrono.ChronoZonedDateTime chronoZonedDateTime2) {
        int iCompare = java.lang.Long.compare(chronoZonedDateTime.L(), chronoZonedDateTime2.L());
        if (iCompare != 0) {
            return iCompare;
        }
        int nano = chronoZonedDateTime.toLocalTime().getNano() - chronoZonedDateTime2.toLocalTime().getNano();
        if (nano != 0) {
            return nano;
        }
        int iCompareTo = chronoZonedDateTime.A().compareTo(chronoZonedDateTime2.A());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = chronoZonedDateTime.s().getId().compareTo(chronoZonedDateTime2.s().getId());
        return iCompareTo2 == 0 ? chronoZonedDateTime.a().compareTo(chronoZonedDateTime2.a()) : iCompareTo2;
    }

    public static int e(j$.time.chrono.ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.n.a(chronoZonedDateTime, sVar);
        }
        int i6 = j$.time.chrono.AbstractC6702h.f47734a[((j$.time.temporal.a) sVar).ordinal()];
        if (i6 != 1) {
            return i6 != 2 ? chronoZonedDateTime.A().n(sVar) : chronoZonedDateTime.i().getTotalSeconds();
        }
        throw new j$.time.temporal.u("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public static int f(j$.time.chrono.k kVar, j$.time.temporal.s sVar) {
        return sVar == j$.time.temporal.a.ERA ? kVar.getValue() : j$.time.temporal.n.a(kVar, sVar);
    }

    public static long g(j$.time.chrono.k kVar, j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.ERA) {
            return kVar.getValue();
        }
        if (sVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
        }
        return sVar.q(kVar);
    }

    public static boolean h(j$.time.chrono.ChronoLocalDate chronoLocalDate, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) sVar).M();
        }
        return sVar != null && sVar.u(chronoLocalDate);
    }

    public static boolean i(j$.time.chrono.k kVar, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return sVar == j$.time.temporal.a.ERA;
        }
        return sVar != null && sVar.u(kVar);
    }

    public static java.lang.Object j(j$.time.chrono.ChronoLocalDate chronoLocalDate, j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.l() || temporalQuery == j$.time.temporal.n.k() || temporalQuery == j$.time.temporal.n.i() || temporalQuery == j$.time.temporal.n.g()) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.n.e()) {
            return chronoLocalDate.a();
        }
        return temporalQuery == j$.time.temporal.n.j() ? j$.time.temporal.b.DAYS : temporalQuery.queryFrom(chronoLocalDate);
    }

    public static java.lang.Object k(j$.time.chrono.ChronoLocalDateTime chronoLocalDateTime, j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.l() || temporalQuery == j$.time.temporal.n.k() || temporalQuery == j$.time.temporal.n.i()) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.n.g()) {
            return chronoLocalDateTime.toLocalTime();
        }
        if (temporalQuery == j$.time.temporal.n.e()) {
            return chronoLocalDateTime.a();
        }
        return temporalQuery == j$.time.temporal.n.j() ? j$.time.temporal.b.NANOS : temporalQuery.queryFrom(chronoLocalDateTime);
    }

    public static java.lang.Object l(j$.time.chrono.ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.k() || temporalQuery == j$.time.temporal.n.l()) {
            return chronoZonedDateTime.s();
        }
        if (temporalQuery == j$.time.temporal.n.i()) {
            return chronoZonedDateTime.i();
        }
        if (temporalQuery == j$.time.temporal.n.g()) {
            return chronoZonedDateTime.toLocalTime();
        }
        if (temporalQuery == j$.time.temporal.n.e()) {
            return chronoZonedDateTime.a();
        }
        return temporalQuery == j$.time.temporal.n.j() ? j$.time.temporal.b.NANOS : temporalQuery.queryFrom(chronoZonedDateTime);
    }

    public static java.lang.Object m(j$.time.chrono.k kVar, j$.time.temporal.TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.n.j() ? j$.time.temporal.b.ERAS : j$.time.temporal.n.c(kVar, temporalQuery);
    }

    public static long n(j$.time.chrono.ChronoLocalDateTime chronoLocalDateTime, j$.time.ZoneOffset zoneOffset) {
        j$.util.Objects.requireNonNull(zoneOffset, "offset");
        return ((chronoLocalDateTime.b().toEpochDay() * 86400) + ((long) chronoLocalDateTime.toLocalTime().toSecondOfDay())) - ((long) zoneOffset.getTotalSeconds());
    }

    public static long o(j$.time.chrono.ChronoZonedDateTime chronoZonedDateTime) {
        return ((chronoZonedDateTime.b().toEpochDay() * 86400) + ((long) chronoZonedDateTime.toLocalTime().toSecondOfDay())) - ((long) chronoZonedDateTime.i().getTotalSeconds());
    }
}
