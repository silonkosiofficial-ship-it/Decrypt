package j$.time.chrono;

/* JADX INFO: renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6695a implements j$.time.chrono.Chronology {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j$.util.concurrent.ConcurrentHashMap f47721a = new j$.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j$.util.concurrent.ConcurrentHashMap f47722b = new j$.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.Locale f47723c = new java.util.Locale("ja", "JP", "JP");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f47724d = 0;

    protected AbstractC6695a() {
    }

    static j$.time.chrono.ChronoLocalDate M(j$.time.chrono.ChronoLocalDate chronoLocalDate, long j6, long j10, long j11) {
        long j12;
        j$.time.chrono.ChronoLocalDate chronoLocalDateD = chronoLocalDate.d(j6, (j$.time.temporal.t) j$.time.temporal.b.MONTHS);
        j$.time.temporal.b bVar = j$.time.temporal.b.WEEKS;
        j$.time.chrono.ChronoLocalDate chronoLocalDateD2 = chronoLocalDateD.d(j10, (j$.time.temporal.t) bVar);
        if (j11 <= 7) {
            if (j11 < 1) {
                chronoLocalDateD2 = chronoLocalDateD2.d(j$.com.android.tools.r8.a.n(j11, 7L) / 7, (j$.time.temporal.t) bVar);
                j12 = j11 + 6;
            }
            return chronoLocalDateD2.p(new j$.time.temporal.p(j$.time.DayOfWeek.M((int) j11).getValue(), 0));
        }
        j12 = j11 - 1;
        chronoLocalDateD2 = chronoLocalDateD2.d(j12 / 7, (j$.time.temporal.t) bVar);
        j11 = (j12 % 7) + 1;
        return chronoLocalDateD2.p(new j$.time.temporal.p(j$.time.DayOfWeek.M((int) j11).getValue(), 0));
    }

    static void n(java.util.Map map, j$.time.temporal.a aVar, long j6) {
        java.lang.Long l6 = (java.lang.Long) map.get(aVar);
        if (l6 == null || l6.longValue() == j6) {
            map.put(aVar, java.lang.Long.valueOf(j6));
            return;
        }
        throw new j$.time.DateTimeException("Conflict found: " + aVar + " " + l6 + " differs from " + aVar + " " + j6);
    }

    private static boolean q() {
        if (f47721a.get("ISO") != null) {
            return false;
        }
        j$.time.chrono.m mVar = j$.time.chrono.m.f47740p;
        y(mVar, mVar.getId());
        j$.time.chrono.t tVar = j$.time.chrono.t.f47761e;
        tVar.getClass();
        y(tVar, "Japanese");
        j$.time.chrono.y yVar = j$.time.chrono.y.f47773e;
        yVar.getClass();
        y(yVar, "Minguo");
        j$.time.chrono.E e6 = j$.time.chrono.E.f47717e;
        e6.getClass();
        y(e6, "ThaiBuddhist");
        for (j$.time.chrono.AbstractC6695a abstractC6695a : java.util.ServiceLoader.load(j$.time.chrono.AbstractC6695a.class, null)) {
            if (!abstractC6695a.getId().equals("ISO")) {
                y(abstractC6695a, abstractC6695a.getId());
            }
        }
        j$.time.chrono.q qVar = j$.time.chrono.q.f47758e;
        qVar.getClass();
        y(qVar, "ISO");
        return true;
    }

    static j$.time.chrono.Chronology u(java.lang.String str) {
        j$.util.Objects.requireNonNull(str, "id");
        do {
            j$.time.chrono.Chronology chronology = (j$.time.chrono.Chronology) f47721a.get(str);
            if (chronology == null) {
                chronology = (j$.time.chrono.Chronology) f47722b.get(str);
            }
            if (chronology != null) {
                return chronology;
            }
        } while (q());
        for (j$.time.chrono.Chronology chronology2 : java.util.ServiceLoader.load(j$.time.chrono.Chronology.class)) {
            if (str.equals(chronology2.getId()) || str.equals(chronology2.t())) {
                return chronology2;
            }
        }
        throw new j$.time.DateTimeException("Unknown chronology: " + str);
    }

    static j$.time.chrono.Chronology x(java.util.Locale locale) {
        j$.util.Objects.requireNonNull(locale, "locale");
        java.lang.String unicodeLocaleType = locale.getUnicodeLocaleType("ca");
        if (unicodeLocaleType == null) {
            unicodeLocaleType = locale.equals(f47723c) ? "japanese" : null;
        }
        if (unicodeLocaleType == null || "iso".equals(unicodeLocaleType) || "iso8601".equals(unicodeLocaleType)) {
            return j$.time.chrono.q.f47758e;
        }
        do {
            j$.time.chrono.Chronology chronology = (j$.time.chrono.Chronology) f47722b.get(unicodeLocaleType);
            if (chronology != null) {
                return chronology;
            }
        } while (q());
        for (j$.time.chrono.Chronology chronology2 : java.util.ServiceLoader.load(j$.time.chrono.Chronology.class)) {
            if (unicodeLocaleType.equals(chronology2.t())) {
                return chronology2;
            }
        }
        throw new j$.time.DateTimeException("Unknown calendar system: ".concat(unicodeLocaleType));
    }

    static j$.time.chrono.Chronology y(j$.time.chrono.Chronology chronology, java.lang.String str) {
        java.lang.String strT;
        j$.time.chrono.Chronology chronology2 = (j$.time.chrono.Chronology) f47721a.putIfAbsent(str, chronology);
        if (chronology2 == null && (strT = chronology.t()) != null) {
            f47722b.putIfAbsent(strT, chronology);
        }
        return chronology2;
    }

    @Override // j$.time.chrono.Chronology
    public j$.time.chrono.ChronoLocalDate E(java.util.Map map, j$.time.format.C c6) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return l(((java.lang.Long) map.remove(aVar)).longValue());
        }
        N(map, c6);
        j$.time.chrono.ChronoLocalDate chronoLocalDateP = P(map, c6);
        if (chronoLocalDateP != null) {
            return chronoLocalDateP;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (!map.containsKey(aVar2)) {
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
        if (map.containsKey(aVar3)) {
            if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                return O(map, c6);
            }
            j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(aVar4)) {
                j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(aVar5)) {
                    int iA = F(aVar2).a(((java.lang.Long) map.remove(aVar2)).longValue(), aVar2);
                    if (c6 == j$.time.format.C.LENIENT) {
                        long jN = j$.com.android.tools.r8.a.n(((java.lang.Long) map.remove(aVar3)).longValue(), 1L);
                        return B(iA, 1, 1).d(jN, (j$.time.temporal.t) j$.time.temporal.b.MONTHS).d(j$.com.android.tools.r8.a.n(((java.lang.Long) map.remove(aVar4)).longValue(), 1L), (j$.time.temporal.t) j$.time.temporal.b.WEEKS).d(j$.com.android.tools.r8.a.n(((java.lang.Long) map.remove(aVar5)).longValue(), 1L), (j$.time.temporal.t) j$.time.temporal.b.DAYS);
                    }
                    int iA2 = F(aVar3).a(((java.lang.Long) map.remove(aVar3)).longValue(), aVar3);
                    j$.time.chrono.ChronoLocalDate chronoLocalDateD = B(iA, iA2, 1).d((F(aVar5).a(((java.lang.Long) map.remove(aVar5)).longValue(), aVar5) - 1) + ((F(aVar4).a(((java.lang.Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7), (j$.time.temporal.t) j$.time.temporal.b.DAYS);
                    if (c6 != j$.time.format.C.STRICT || chronoLocalDateD.n(aVar3) == iA2) {
                        return chronoLocalDateD;
                    }
                    throw new j$.time.DateTimeException("Strict mode rejected resolved date as it is in a different month");
                }
                j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                if (map.containsKey(aVar6)) {
                    int iA3 = F(aVar2).a(((java.lang.Long) map.remove(aVar2)).longValue(), aVar2);
                    if (c6 == j$.time.format.C.LENIENT) {
                        return M(B(iA3, 1, 1), j$.com.android.tools.r8.a.n(((java.lang.Long) map.remove(aVar3)).longValue(), 1L), j$.com.android.tools.r8.a.n(((java.lang.Long) map.remove(aVar4)).longValue(), 1L), j$.com.android.tools.r8.a.n(((java.lang.Long) map.remove(aVar6)).longValue(), 1L));
                    }
                    int iA4 = F(aVar3).a(((java.lang.Long) map.remove(aVar3)).longValue(), aVar3);
                    j$.time.chrono.ChronoLocalDate chronoLocalDateP2 = B(iA3, iA4, 1).d((F(aVar4).a(((java.lang.Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7, (j$.time.temporal.t) j$.time.temporal.b.DAYS).p(new j$.time.temporal.p(j$.time.DayOfWeek.M(F(aVar6).a(((java.lang.Long) map.remove(aVar6)).longValue(), aVar6)).getValue(), 0));
                    if (c6 != j$.time.format.C.STRICT || chronoLocalDateP2.n(aVar3) == iA4) {
                        return chronoLocalDateP2;
                    }
                    throw new j$.time.DateTimeException("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
        if (map.containsKey(aVar7)) {
            int iA5 = F(aVar2).a(((java.lang.Long) map.remove(aVar2)).longValue(), aVar2);
            if (c6 != j$.time.format.C.LENIENT) {
                return v(iA5, F(aVar7).a(((java.lang.Long) map.remove(aVar7)).longValue(), aVar7));
            }
            return v(iA5, 1).d(j$.com.android.tools.r8.a.n(((java.lang.Long) map.remove(aVar7)).longValue(), 1L), (j$.time.temporal.t) j$.time.temporal.b.DAYS);
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(aVar8)) {
            return null;
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(aVar9)) {
            int iA6 = F(aVar2).a(((java.lang.Long) map.remove(aVar2)).longValue(), aVar2);
            if (c6 == j$.time.format.C.LENIENT) {
                return v(iA6, 1).d(j$.com.android.tools.r8.a.n(((java.lang.Long) map.remove(aVar8)).longValue(), 1L), (j$.time.temporal.t) j$.time.temporal.b.WEEKS).d(j$.com.android.tools.r8.a.n(((java.lang.Long) map.remove(aVar9)).longValue(), 1L), (j$.time.temporal.t) j$.time.temporal.b.DAYS);
            }
            j$.time.chrono.ChronoLocalDate chronoLocalDateD2 = v(iA6, 1).d((F(aVar9).a(((java.lang.Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((F(aVar8).a(((java.lang.Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7), (j$.time.temporal.t) j$.time.temporal.b.DAYS);
            if (c6 != j$.time.format.C.STRICT || chronoLocalDateD2.n(aVar2) == iA6) {
                return chronoLocalDateD2;
            }
            throw new j$.time.DateTimeException("Strict mode rejected resolved date as it is in a different year");
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
        if (!map.containsKey(aVar10)) {
            return null;
        }
        int iA7 = F(aVar2).a(((java.lang.Long) map.remove(aVar2)).longValue(), aVar2);
        if (c6 == j$.time.format.C.LENIENT) {
            return M(v(iA7, 1), 0L, j$.com.android.tools.r8.a.n(((java.lang.Long) map.remove(aVar8)).longValue(), 1L), j$.com.android.tools.r8.a.n(((java.lang.Long) map.remove(aVar10)).longValue(), 1L));
        }
        j$.time.chrono.ChronoLocalDate chronoLocalDateP3 = v(iA7, 1).d((F(aVar8).a(((java.lang.Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (j$.time.temporal.t) j$.time.temporal.b.DAYS).p(new j$.time.temporal.p(j$.time.DayOfWeek.M(F(aVar10).a(((java.lang.Long) map.remove(aVar10)).longValue(), aVar10)).getValue(), 0));
        if (c6 != j$.time.format.C.STRICT || chronoLocalDateP3.n(aVar2) == iA7) {
            return chronoLocalDateP3;
        }
        throw new j$.time.DateTimeException("Strict mode rejected resolved date as it is in a different year");
    }

    void N(java.util.Map map, j$.time.format.C c6) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        java.lang.Long l6 = (java.lang.Long) map.remove(aVar);
        if (l6 != null) {
            if (c6 != j$.time.format.C.LENIENT) {
                aVar.O(l6.longValue());
            }
            j$.time.chrono.ChronoLocalDate chronoLocalDateC = p().c(1L, (j$.time.temporal.s) j$.time.temporal.a.DAY_OF_MONTH).c(l6.longValue(), (j$.time.temporal.s) aVar);
            j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
            n(map, aVar2, chronoLocalDateC.n(aVar2));
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            n(map, aVar3, chronoLocalDateC.n(aVar3));
        }
    }

    j$.time.chrono.ChronoLocalDate O(java.util.Map map, j$.time.format.C c6) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = F(aVar).a(((java.lang.Long) map.remove(aVar)).longValue(), aVar);
        if (c6 == j$.time.format.C.LENIENT) {
            long jN = j$.com.android.tools.r8.a.n(((java.lang.Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return B(iA, 1, 1).d(jN, (j$.time.temporal.t) j$.time.temporal.b.MONTHS).d(j$.com.android.tools.r8.a.n(((java.lang.Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (j$.time.temporal.t) j$.time.temporal.b.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = F(aVar2).a(((java.lang.Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = F(aVar3).a(((java.lang.Long) map.remove(aVar3)).longValue(), aVar3);
        if (c6 != j$.time.format.C.SMART) {
            return B(iA, iA2, iA3);
        }
        try {
            return B(iA, iA2, iA3);
        } catch (j$.time.DateTimeException unused) {
            return B(iA, iA2, 1).p(new j$.time.temporal.q(0));
        }
    }

    j$.time.chrono.ChronoLocalDate P(java.util.Map map, j$.time.format.C c6) {
        j$.time.chrono.k kVarZ;
        long jH;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        java.lang.Long l6 = (java.lang.Long) map.remove(aVar);
        if (l6 == null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            if (!map.containsKey(aVar2)) {
                return null;
            }
            F(aVar2).b(((java.lang.Long) map.get(aVar2)).longValue(), aVar2);
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
        java.lang.Long l10 = (java.lang.Long) map.remove(aVar3);
        int iA = c6 != j$.time.format.C.LENIENT ? F(aVar).a(l6.longValue(), aVar) : j$.com.android.tools.r8.a.f(l6.longValue());
        if (l10 != null) {
            n(map, j$.time.temporal.a.YEAR, h(K(F(aVar3).a(l10.longValue(), aVar3)), iA));
            return null;
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.YEAR;
        if (!map.containsKey(aVar4)) {
            if (c6 == j$.time.format.C.STRICT) {
                map.put(aVar, l6);
                return null;
            }
            java.util.List listH = H();
            if (listH.isEmpty()) {
                jH = iA;
            } else {
                kVarZ = (j$.time.chrono.k) listH.get(listH.size() - 1);
            }
            n(map, aVar4, jH);
            return null;
        }
        kVarZ = v(F(aVar4).a(((java.lang.Long) map.get(aVar4)).longValue(), aVar4), 1).z();
        jH = h(kVarZ, iA);
        n(map, aVar4, jH);
        return null;
    }

    @Override // j$.time.chrono.Chronology
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j$.time.chrono.AbstractC6695a) && compareTo((j$.time.chrono.AbstractC6695a) obj) == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.Chronology chronology) {
        return getId().compareTo(chronology.getId());
    }

    @Override // j$.time.chrono.Chronology
    public final int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    public abstract /* synthetic */ j$.time.chrono.ChronoLocalDate p();

    @Override // j$.time.chrono.Chronology
    public j$.time.chrono.ChronoLocalDateTime r(j$.time.LocalDateTime localDateTime) {
        try {
            return o(localDateTime).w(j$.time.LocalTime.N(localDateTime));
        } catch (j$.time.DateTimeException e6) {
            throw new j$.time.DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + j$.time.LocalDateTime.class, e6);
        }
    }

    @Override // j$.time.chrono.Chronology
    public final java.lang.String toString() {
        return getId();
    }
}
