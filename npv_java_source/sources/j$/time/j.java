package j$.time;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements j$.time.temporal.TemporalAccessor, j$.time.temporal.o, java.lang.Comparable, java.io.Serializable {
    private static final long serialVersionUID = -939150713474957432L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47900b;

    static {
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder = new j$.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.f("--");
        dateTimeFormatterBuilder.m(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        dateTimeFormatterBuilder.e('-');
        dateTimeFormatterBuilder.m(j$.time.temporal.a.DAY_OF_MONTH, 2);
        dateTimeFormatterBuilder.toFormatter();
    }

    private j(int i6, int i10) {
        this.f47899a = i6;
        this.f47900b = i10;
    }

    static j$.time.j M(java.io.DataInput dataInput) throws java.io.IOException {
        byte b6 = dataInput.readByte();
        byte b10 = dataInput.readByte();
        j$.time.Month monthP = j$.time.Month.P(b6);
        j$.util.Objects.requireNonNull(monthP, "month");
        j$.time.temporal.a.DAY_OF_MONTH.O(b10);
        if (b10 <= monthP.O()) {
            return new j$.time.j(monthP.getValue(), b10);
        }
        throw new j$.time.DateTimeException("Illegal value for DayOfMonth field, value " + ((int) b10) + " is not valid for month " + monthP.name());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.n((byte) 13, this);
    }

    final void N(java.io.DataOutput dataOutput) {
        dataOutput.writeByte(this.f47899a);
        dataOutput.writeByte(this.f47900b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        j$.time.j jVar = (j$.time.j) obj;
        int i6 = this.f47899a - jVar.f47899a;
        return i6 == 0 ? this.f47900b - jVar.f47900b : i6;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return sVar == j$.time.temporal.a.MONTH_OF_YEAR || sVar == j$.time.temporal.a.DAY_OF_MONTH;
        }
        return sVar != null && sVar.u(this);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j$.time.j)) {
            return false;
        }
        j$.time.j jVar = (j$.time.j) obj;
        return this.f47899a == jVar.f47899a && this.f47900b == jVar.f47900b;
    }

    public final int hashCode() {
        return (this.f47899a << 6) + this.f47900b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int n(j$.time.temporal.s sVar) {
        return q(sVar).a(u(sVar), sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v q(j$.time.temporal.s sVar) {
        int i6;
        if (sVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return sVar.n();
        }
        if (sVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.n.d(this, sVar);
        }
        int i10 = this.f47899a;
        j$.time.Month monthP = j$.time.Month.P(i10);
        monthP.getClass();
        int i11 = j$.time.h.f47897a[monthP.ordinal()];
        if (i11 != 1) {
            i6 = (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) ? 30 : 31;
        } else {
            i6 = 28;
        }
        return j$.time.temporal.v.k(1L, i6, j$.time.Month.P(i10).O());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(10);
        sb.append("--");
        int i6 = this.f47899a;
        sb.append(i6 < 10 ? "0" : "");
        sb.append(i6);
        int i10 = this.f47900b;
        sb.append(i10 < 10 ? "-0" : "-");
        sb.append(i10);
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long u(j$.time.temporal.s sVar) {
        int i6;
        if (!(sVar instanceof j$.time.temporal.a)) {
            return sVar.q(this);
        }
        int i10 = j$.time.i.f47898a[((j$.time.temporal.a) sVar).ordinal()];
        if (i10 == 1) {
            i6 = this.f47900b;
        } else {
            if (i10 != 2) {
                throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
            }
            i6 = this.f47899a;
        }
        return i6;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object x(j$.time.temporal.TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.n.e() ? j$.time.chrono.q.f47758e : j$.time.temporal.n.c(this, temporalQuery);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m y(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.Chronology.CC.a(mVar).equals(j$.time.chrono.q.f47758e)) {
            throw new j$.time.DateTimeException("Adjustment only supported on ISO date-time");
        }
        j$.time.temporal.m mVarC = mVar.c(this.f47899a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return mVarC.c(java.lang.Math.min(mVarC.q(aVar).d(), this.f47900b), aVar);
    }
}
