package j$.time;

/* JADX INFO: loaded from: classes4.dex */
public final class Instant implements j$.time.temporal.m, j$.time.temporal.o, java.lang.Comparable<j$.time.Instant>, java.io.Serializable {
    private static final long serialVersionUID = -665713676816604388L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f47682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47683b;
    public static final j$.time.Instant EPOCH = new j$.time.Instant(0, 0);
    public static final j$.time.Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final j$.time.Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    private Instant(long j6, int i6) {
        this.f47682a = j6;
        this.f47683b = i6;
    }

    private static j$.time.Instant M(long j6, int i6) {
        if ((((long) i6) | j6) == 0) {
            return EPOCH;
        }
        if (j6 < -31557014167219200L || j6 > 31556889864403199L) {
            throw new j$.time.DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new j$.time.Instant(j6, i6);
    }

    public static j$.time.Instant N(j$.time.temporal.TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof j$.time.Instant) {
            return (j$.time.Instant) temporalAccessor;
        }
        j$.util.Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.u(j$.time.temporal.a.INSTANT_SECONDS), temporalAccessor.n(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (j$.time.DateTimeException e6) {
            throw new j$.time.DateTimeException("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e6);
        }
    }

    public static j$.time.Instant P(long j6) {
        return M(j6, 0);
    }

    private j$.time.Instant Q(long j6, long j10) {
        if ((j6 | j10) == 0) {
            return this;
        }
        return ofEpochSecond(j$.com.android.tools.r8.a.g(j$.com.android.tools.r8.a.g(this.f47682a, j6), j10 / 1000000000), ((long) this.f47683b) + (j10 % 1000000000));
    }

    public static j$.time.Instant ofEpochMilli(long j6) {
        long j10 = 1000;
        return M(j$.com.android.tools.r8.a.l(j6, j10), ((int) j$.com.android.tools.r8.a.k(j6, j10)) * 1000000);
    }

    public static j$.time.Instant ofEpochSecond(long j6, long j10) {
        return M(j$.com.android.tools.r8.a.g(j6, j$.com.android.tools.r8.a.l(j10, 1000000000L)), (int) j$.com.android.tools.r8.a.k(j10, 1000000000L));
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.n((byte) 2, this);
    }

    public final int O() {
        return this.f47683b;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final j$.time.Instant d(long j6, j$.time.temporal.t tVar) {
        if (!(tVar instanceof j$.time.temporal.b)) {
            return (j$.time.Instant) tVar.n(this, j6);
        }
        switch (j$.time.c.f47711b[((j$.time.temporal.b) tVar).ordinal()]) {
            case 1:
                return Q(0L, j6);
            case 2:
                return Q(j6 / 1000000, (j6 % 1000000) * 1000);
            case 3:
                return Q(j6 / 1000, (j6 % 1000) * 1000000);
            case 4:
                return Q(j6, 0L);
            case 5:
                return Q(j$.com.android.tools.r8.a.m(j6, 60), 0L);
            case 6:
                return Q(j$.com.android.tools.r8.a.m(j6, 3600), 0L);
            case 7:
                return Q(j$.com.android.tools.r8.a.m(j6, 43200), 0L);
            case 8:
                return Q(j$.com.android.tools.r8.a.m(j6, 86400), 0L);
            default:
                throw new j$.time.temporal.u("Unsupported unit: " + tVar);
        }
    }

    final void S(java.io.DataOutput dataOutput) {
        dataOutput.writeLong(this.f47682a);
        dataOutput.writeInt(this.f47683b);
    }

    public j$.time.OffsetDateTime atOffset(j$.time.ZoneOffset zoneOffset) {
        return j$.time.OffsetDateTime.N(this, zoneOffset);
    }

    public j$.time.ZonedDateTime atZone(j$.time.ZoneId zoneId) {
        return j$.time.ZonedDateTime.N(this, zoneId);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (r6 != r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r6 != r2) goto L20;
     */
    @Override // j$.time.temporal.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.temporal.m c(long r6, j$.time.temporal.s r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof j$.time.temporal.a
            if (r0 == 0) goto L52
            r0 = r8
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            r0.O(r6)
            int[] r1 = j$.time.c.f47710a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            int r2 = r5.f47683b
            long r3 = r5.f47682a
            if (r0 == r1) goto L4b
            r1 = 2
            if (r0 == r1) goto L45
            r1 = 3
            if (r0 == r1) goto L39
            r1 = 4
            if (r0 != r1) goto L2d
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 == 0) goto L2b
            j$.time.Instant r6 = M(r6, r2)
            goto L58
        L2b:
            r6 = r5
            goto L58
        L2d:
            j$.time.temporal.u r6 = new j$.time.temporal.u
            java.lang.String r7 = "Unsupported field: "
            java.lang.String r7 = j$.time.b.a(r7, r8)
            r6.<init>(r7)
            throw r6
        L39:
            int r6 = (int) r6
            r7 = 1000000(0xf4240, float:1.401298E-39)
            int r6 = r6 * r7
            if (r6 == r2) goto L2b
        L40:
            j$.time.Instant r6 = M(r3, r6)
            goto L58
        L45:
            int r6 = (int) r6
            int r6 = r6 * 1000
            if (r6 == r2) goto L2b
            goto L40
        L4b:
            long r0 = (long) r2
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 == 0) goto L2b
            int r6 = (int) r6
            goto L40
        L52:
            j$.time.temporal.m r6 = r8.x(r5, r6)
            j$.time.Instant r6 = (j$.time.Instant) r6
        L58:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.Instant.c(long, j$.time.temporal.s):j$.time.temporal.m");
    }

    @Override // java.lang.Comparable
    public int compareTo(j$.time.Instant instant) {
        int iCompare = java.lang.Long.compare(this.f47682a, instant.f47682a);
        return iCompare != 0 ? iCompare : this.f47683b - instant.f47683b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return sVar == j$.time.temporal.a.INSTANT_SECONDS || sVar == j$.time.temporal.a.NANO_OF_SECOND || sVar == j$.time.temporal.a.MICRO_OF_SECOND || sVar == j$.time.temporal.a.MILLI_OF_SECOND;
        }
        return sVar != null && sVar.u(this);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j$.time.Instant)) {
            return false;
        }
        j$.time.Instant instant = (j$.time.Instant) obj;
        return this.f47682a == instant.f47682a && this.f47683b == instant.f47683b;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m f(long j6, j$.time.temporal.t tVar) {
        return j6 == Long.MIN_VALUE ? d(Long.MAX_VALUE, tVar).d(1L, tVar) : d(-j6, tVar);
    }

    public long getEpochSecond() {
        return this.f47682a;
    }

    public int hashCode() {
        long j6 = this.f47682a;
        return (this.f47683b * 51) + ((int) (j6 ^ (j6 >>> 32)));
    }

    public boolean isAfter(j$.time.Instant instant) {
        return compareTo(instant) > 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int n(j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.n.d(this, sVar).a(sVar.q(this), sVar);
        }
        int i6 = j$.time.c.f47710a[((j$.time.temporal.a) sVar).ordinal()];
        int i10 = this.f47683b;
        if (i6 == 1) {
            return i10;
        }
        if (i6 == 2) {
            return i10 / 1000;
        }
        if (i6 == 3) {
            return i10 / 1000000;
        }
        if (i6 == 4) {
            j$.time.temporal.a.INSTANT_SECONDS.N(this.f47682a);
        }
        throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m p(j$.time.LocalDate localDate) {
        return (j$.time.Instant) j$.time.chrono.AbstractC6701g.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v q(j$.time.temporal.s sVar) {
        return j$.time.temporal.n.d(this, sVar);
    }

    public long toEpochMilli() {
        long jM;
        int i6;
        long j6 = this.f47682a;
        int i10 = this.f47683b;
        if (j6 >= 0 || i10 <= 0) {
            jM = j$.com.android.tools.r8.a.m(j6, 1000);
            i6 = i10 / 1000000;
        } else {
            jM = j$.com.android.tools.r8.a.m(j6 + 1, 1000);
            i6 = (i10 / 1000000) - 1000;
        }
        return j$.com.android.tools.r8.a.g(jM, i6);
    }

    public java.lang.String toString() {
        return j$.time.format.DateTimeFormatter.f47795j.a(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long u(j$.time.temporal.s sVar) {
        int i6;
        if (!(sVar instanceof j$.time.temporal.a)) {
            return sVar.q(this);
        }
        int i10 = j$.time.c.f47710a[((j$.time.temporal.a) sVar).ordinal()];
        int i11 = this.f47683b;
        if (i10 == 1) {
            return i11;
        }
        if (i10 == 2) {
            i6 = i11 / 1000;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    return this.f47682a;
                }
                throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
            }
            i6 = i11 / 1000000;
        }
        return i6;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object x(j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.j()) {
            return j$.time.temporal.b.NANOS;
        }
        if (temporalQuery == j$.time.temporal.n.e() || temporalQuery == j$.time.temporal.n.l() || temporalQuery == j$.time.temporal.n.k() || temporalQuery == j$.time.temporal.n.i() || temporalQuery == j$.time.temporal.n.f() || temporalQuery == j$.time.temporal.n.g()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m y(j$.time.temporal.m mVar) {
        return mVar.c(this.f47682a, j$.time.temporal.a.INSTANT_SECONDS).c(this.f47683b, j$.time.temporal.a.NANO_OF_SECOND);
    }
}
