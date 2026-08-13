package j$.time;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements j$.time.temporal.m, j$.time.temporal.o, java.lang.Comparable, java.io.Serializable {
    private static final long serialVersionUID = 4183400860270640070L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47917b;

    static {
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder = new j$.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.n(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.D.EXCEEDS_PAD);
        dateTimeFormatterBuilder.e('-');
        dateTimeFormatterBuilder.m(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        dateTimeFormatterBuilder.toFormatter();
    }

    private r(int i6, int i10) {
        this.f47916a = i6;
        this.f47917b = i10;
    }

    private long M() {
        return ((((long) this.f47916a) * 12) + ((long) this.f47917b)) - 1;
    }

    static j$.time.r Q(java.io.DataInput dataInput) throws java.io.IOException {
        int i6 = dataInput.readInt();
        byte b6 = dataInput.readByte();
        j$.time.temporal.a.YEAR.O(i6);
        j$.time.temporal.a.MONTH_OF_YEAR.O(b6);
        return new j$.time.r(i6, b6);
    }

    private j$.time.r R(int i6, int i10) {
        return (this.f47916a == i6 && this.f47917b == i10) ? this : new j$.time.r(i6, i10);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.n((byte) 12, this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final j$.time.r d(long j6, j$.time.temporal.t tVar) {
        if (!(tVar instanceof j$.time.temporal.b)) {
            return (j$.time.r) tVar.n(this, j6);
        }
        switch (j$.time.q.f47915b[((j$.time.temporal.b) tVar).ordinal()]) {
            case 1:
                return O(j6);
            case 2:
                return P(j6);
            case 3:
                return P(j$.com.android.tools.r8.a.m(j6, 10));
            case 4:
                return P(j$.com.android.tools.r8.a.m(j6, 100));
            case 5:
                return P(j$.com.android.tools.r8.a.m(j6, 1000));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(j$.com.android.tools.r8.a.g(u(aVar), j6), aVar);
            default:
                throw new j$.time.temporal.u("Unsupported unit: " + tVar);
        }
    }

    public final j$.time.r O(long j6) {
        if (j6 == 0) {
            return this;
        }
        long j10 = (((long) this.f47916a) * 12) + ((long) (this.f47917b - 1)) + j6;
        long j11 = 12;
        return R(j$.time.temporal.a.YEAR.N(j$.com.android.tools.r8.a.l(j10, j11)), ((int) j$.com.android.tools.r8.a.k(j10, j11)) + 1);
    }

    public final j$.time.r P(long j6) {
        return j6 == 0 ? this : R(j$.time.temporal.a.YEAR.N(((long) this.f47916a) + j6), this.f47917b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final j$.time.r c(long j6, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return (j$.time.r) sVar.x(this, j6);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
        aVar.O(j6);
        int i6 = j$.time.q.f47914a[aVar.ordinal()];
        int i10 = this.f47916a;
        if (i6 == 1) {
            int i11 = (int) j6;
            j$.time.temporal.a.MONTH_OF_YEAR.O(i11);
            return R(i10, i11);
        }
        if (i6 == 2) {
            return O(j6 - M());
        }
        int i12 = this.f47917b;
        if (i6 == 3) {
            if (i10 < 1) {
                j6 = 1 - j6;
            }
            int i13 = (int) j6;
            j$.time.temporal.a.YEAR.O(i13);
            return R(i13, i12);
        }
        if (i6 == 4) {
            int i14 = (int) j6;
            j$.time.temporal.a.YEAR.O(i14);
            return R(i14, i12);
        }
        if (i6 != 5) {
            throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
        }
        if (u(j$.time.temporal.a.ERA) == j6) {
            return this;
        }
        int i15 = 1 - i10;
        j$.time.temporal.a.YEAR.O(i15);
        return R(i15, i12);
    }

    final void T(java.io.DataOutput dataOutput) {
        dataOutput.writeInt(this.f47916a);
        dataOutput.writeByte(this.f47917b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        j$.time.r rVar = (j$.time.r) obj;
        int i6 = this.f47916a - rVar.f47916a;
        return i6 == 0 ? this.f47917b - rVar.f47917b : i6;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return sVar == j$.time.temporal.a.YEAR || sVar == j$.time.temporal.a.MONTH_OF_YEAR || sVar == j$.time.temporal.a.PROLEPTIC_MONTH || sVar == j$.time.temporal.a.YEAR_OF_ERA || sVar == j$.time.temporal.a.ERA;
        }
        return sVar != null && sVar.u(this);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j$.time.r)) {
            return false;
        }
        j$.time.r rVar = (j$.time.r) obj;
        return this.f47916a == rVar.f47916a && this.f47917b == rVar.f47917b;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m f(long j6, j$.time.temporal.t tVar) {
        return j6 == Long.MIN_VALUE ? d(Long.MAX_VALUE, tVar).d(1L, tVar) : d(-j6, tVar);
    }

    public final int hashCode() {
        return (this.f47917b << 27) ^ this.f47916a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int n(j$.time.temporal.s sVar) {
        return q(sVar).a(u(sVar), sVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m p(j$.time.LocalDate localDate) {
        return (j$.time.r) j$.time.chrono.AbstractC6701g.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v q(j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.v.j(1L, this.f47916a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.n.d(this, sVar);
    }

    public final java.lang.String toString() {
        int i6;
        int i10 = this.f47916a;
        int iAbs = java.lang.Math.abs(i10);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(9);
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
            sb.append(i10);
        }
        int i11 = this.f47917b;
        sb.append(i11 < 10 ? "-0" : "-");
        sb.append(i11);
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long u(j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return sVar.q(this);
        }
        int i6 = j$.time.q.f47914a[((j$.time.temporal.a) sVar).ordinal()];
        if (i6 == 1) {
            return this.f47917b;
        }
        if (i6 == 2) {
            return M();
        }
        int i10 = this.f47916a;
        if (i6 == 3) {
            if (i10 < 1) {
                i10 = 1 - i10;
            }
            return i10;
        }
        if (i6 == 4) {
            return i10;
        }
        if (i6 == 5) {
            return i10 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object x(j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.e()) {
            return j$.time.chrono.q.f47758e;
        }
        return temporalQuery == j$.time.temporal.n.j() ? j$.time.temporal.b.MONTHS : j$.time.temporal.n.c(this, temporalQuery);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m y(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.Chronology.CC.a(mVar).equals(j$.time.chrono.q.f47758e)) {
            throw new j$.time.DateTimeException("Adjustment only supported on ISO date-time");
        }
        return mVar.c(M(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }
}
