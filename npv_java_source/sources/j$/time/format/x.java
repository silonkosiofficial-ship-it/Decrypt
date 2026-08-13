package j$.time.format;

/* JADX INFO: loaded from: classes4.dex */
final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j$.time.temporal.TemporalAccessor f47890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j$.time.format.DateTimeFormatter f47891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47892c;

    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ec A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x00b9, please report this as an issue */
    x(j$.time.temporal.TemporalAccessor temporalAccessor, j$.time.format.DateTimeFormatter dateTimeFormatter) {
        int i6;
        java.lang.Object objRequireNonNull;
        j$.time.chrono.Chronology chronologyB = dateTimeFormatter.b();
        j$.time.ZoneId zoneIdE = dateTimeFormatter.e();
        if (chronologyB != null || zoneIdE != null) {
            j$.time.chrono.Chronology chronology = (j$.time.chrono.Chronology) temporalAccessor.x(j$.time.temporal.n.e());
            j$.time.ZoneId zoneId = (j$.time.ZoneId) temporalAccessor.x(j$.time.temporal.n.l());
            j$.time.chrono.ChronoLocalDate chronoLocalDateO = null;
            chronologyB = j$.util.Objects.equals(chronologyB, chronology) ? null : chronologyB;
            zoneIdE = j$.util.Objects.equals(zoneIdE, zoneId) ? null : zoneIdE;
            if (chronologyB != null || zoneIdE != null) {
                j$.time.chrono.Chronology chronology2 = chronologyB != null ? chronologyB : chronology;
                if (zoneIdE == null) {
                    zoneId = zoneIdE != null ? zoneIdE : zoneId;
                    if (chronologyB != null) {
                        if (temporalAccessor.e(j$.time.temporal.a.EPOCH_DAY)) {
                            chronoLocalDateO = chronology2.o(temporalAccessor);
                        } else if (chronologyB == j$.time.chrono.q.f47758e || chronology != null) {
                            for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                                if (!aVar.M() && temporalAccessor.e(aVar)) {
                                    throw new j$.time.DateTimeException("Unable to apply override chronology '" + chronologyB + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                                }
                            }
                        }
                    }
                    temporalAccessor = new j$.time.format.w(chronoLocalDateO, temporalAccessor, chronology2, zoneId);
                } else if (temporalAccessor.e(j$.time.temporal.a.INSTANT_SECONDS)) {
                    j$.time.chrono.q qVar = j$.time.chrono.q.f47758e;
                    if (chronology2 == null) {
                        objRequireNonNull = chronology2;
                        objRequireNonNull = j$.util.Objects.requireNonNull(qVar, "defaultObj");
                    }
                    objRequireNonNull = chronology2;
                    temporalAccessor = ((j$.time.chrono.Chronology) objRequireNonNull).G(j$.time.Instant.N(temporalAccessor), zoneIdE);
                } else {
                    if (zoneIdE.normalized() instanceof j$.time.ZoneOffset) {
                        j$.time.temporal.a aVar2 = j$.time.temporal.a.OFFSET_SECONDS;
                        if (temporalAccessor.e(aVar2) && temporalAccessor.n(aVar2) != zoneIdE.getRules().d(j$.time.Instant.EPOCH).getTotalSeconds()) {
                            throw new j$.time.DateTimeException("Unable to apply override zone '" + zoneIdE + "' because the temporal object being formatted has a different offset but does not represent an instant: " + temporalAccessor);
                        }
                    }
                    if (zoneIdE != null) {
                    }
                    if (chronologyB != null) {
                        if (temporalAccessor.e(j$.time.temporal.a.EPOCH_DAY)) {
                            chronoLocalDateO = chronology2.o(temporalAccessor);
                        } else if (chronologyB == j$.time.chrono.q.f47758e) {
                            while (i6 < r2) {
                                if (!aVar.M()) {
                                }
                            }
                        } else {
                            while (i6 < r2) {
                                if (!aVar.M()) {
                                }
                            }
                        }
                    }
                    temporalAccessor = new j$.time.format.w(chronoLocalDateO, temporalAccessor, chronology2, zoneId);
                }
            }
        }
        this.f47890a = temporalAccessor;
        this.f47891b = dateTimeFormatter;
    }

    final void a() {
        this.f47892c--;
    }

    final j$.time.format.DecimalStyle b() {
        return this.f47891b.c();
    }

    final java.util.Locale c() {
        return this.f47891b.d();
    }

    final j$.time.temporal.TemporalAccessor d() {
        return this.f47890a;
    }

    final java.lang.Long e(j$.time.temporal.s sVar) {
        int i6 = this.f47892c;
        j$.time.temporal.TemporalAccessor temporalAccessor = this.f47890a;
        if (i6 <= 0 || temporalAccessor.e(sVar)) {
            return java.lang.Long.valueOf(temporalAccessor.u(sVar));
        }
        return null;
    }

    final java.lang.Object f(j$.time.temporal.TemporalQuery temporalQuery) {
        j$.time.temporal.TemporalAccessor temporalAccessor = this.f47890a;
        java.lang.Object objX = temporalAccessor.x(temporalQuery);
        if (objX != null || this.f47892c != 0) {
            return objX;
        }
        throw new j$.time.DateTimeException("Unable to extract " + temporalQuery + " from temporal " + temporalAccessor);
    }

    final void g() {
        this.f47892c++;
    }

    public final java.lang.String toString() {
        return this.f47890a.toString();
    }
}
