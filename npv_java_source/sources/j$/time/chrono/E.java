package j$.time.chrono;

/* JADX INFO: loaded from: classes4.dex */
public final class E extends j$.time.chrono.AbstractC6695a implements java.io.Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j$.time.chrono.E f47717e = new j$.time.chrono.E();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.HashMap map3 = new java.util.HashMap();
        map.put("en", new java.lang.String[]{"BB", "BE"});
        map.put("th", new java.lang.String[]{"BB", "BE"});
        map2.put("en", new java.lang.String[]{"B.B.", "B.E."});
        map2.put("th", new java.lang.String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new java.lang.String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new java.lang.String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private E() {
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.chrono.ChronoLocalDate B(int i6, int i10, int i11) {
        return new j$.time.chrono.G(j$.time.LocalDate.of(i6 - 543, i10, i11));
    }

    @Override // j$.time.chrono.AbstractC6695a, j$.time.chrono.Chronology
    public final j$.time.chrono.ChronoLocalDate E(java.util.Map map, j$.time.format.C c6) {
        return (j$.time.chrono.G) super.E(map, c6);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.v F(j$.time.temporal.a aVar) {
        int i6 = j$.time.chrono.D.f47716a[aVar.ordinal()];
        if (i6 == 1) {
            j$.time.temporal.v vVarN = j$.time.temporal.a.PROLEPTIC_MONTH.n();
            return j$.time.temporal.v.j(vVarN.e() + 6516, vVarN.d() + 6516);
        }
        if (i6 == 2) {
            j$.time.temporal.v vVarN2 = j$.time.temporal.a.YEAR.n();
            return j$.time.temporal.v.k(1L, (-(vVarN2.e() + 543)) + 1, vVarN2.d() + 543);
        }
        if (i6 != 3) {
            return aVar.n();
        }
        j$.time.temporal.v vVarN3 = j$.time.temporal.a.YEAR.n();
        return j$.time.temporal.v.j(vVarN3.e() + 543, vVarN3.d() + 543);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.chrono.ChronoZonedDateTime G(j$.time.Instant instant, j$.time.ZoneId zoneId) {
        return j$.time.chrono.j.P(this, instant, zoneId);
    }

    @Override // j$.time.chrono.Chronology
    public final java.util.List H() {
        return j$.com.android.tools.r8.a.i(j$.time.chrono.H.values());
    }

    @Override // j$.time.chrono.Chronology
    public final boolean J(long j6) {
        return j$.time.chrono.q.f47758e.J(j6 - 543);
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.chrono.k K(int i6) {
        if (i6 == 0) {
            return j$.time.chrono.H.BEFORE_BE;
        }
        if (i6 == 1) {
            return j$.time.chrono.H.BE;
        }
        throw new j$.time.DateTimeException("Invalid era: " + i6);
    }

    @Override // j$.time.chrono.Chronology
    public final java.lang.String getId() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.Chronology
    public final int h(j$.time.chrono.k kVar, int i6) {
        if (kVar instanceof j$.time.chrono.H) {
            return kVar == j$.time.chrono.H.BE ? i6 : 1 - i6;
        }
        throw new java.lang.ClassCastException("Era must be BuddhistEra");
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.chrono.ChronoLocalDate l(long j6) {
        return new j$.time.chrono.G(j$.time.LocalDate.V(j6));
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.chrono.ChronoLocalDate o(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof j$.time.chrono.G ? (j$.time.chrono.G) temporalAccessor : new j$.time.chrono.G(j$.time.LocalDate.O(temporalAccessor));
    }

    @Override // j$.time.chrono.AbstractC6695a
    public final j$.time.chrono.ChronoLocalDate p() {
        return new j$.time.chrono.G(j$.time.LocalDate.O(j$.time.LocalDate.T(j$.time.Clock.c())));
    }

    @Override // j$.time.chrono.Chronology
    public final java.lang.String t() {
        return "buddhist";
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.chrono.ChronoLocalDate v(int i6, int i10) {
        return new j$.time.chrono.G(j$.time.LocalDate.W(i6 - 543, i10));
    }

    java.lang.Object writeReplace() {
        return new j$.time.chrono.C((byte) 1, this);
    }
}
