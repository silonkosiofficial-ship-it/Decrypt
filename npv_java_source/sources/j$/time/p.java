package j$.time;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements j$.time.temporal.m, j$.time.temporal.o, java.lang.Comparable, java.io.Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f47912b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47913a;

    static {
        j$.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder = new j$.time.format.DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.n(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.D.EXCEEDS_PAD);
        dateTimeFormatterBuilder.toFormatter();
    }

    private p(int i6) {
        this.f47913a = i6;
    }

    public static j$.time.p M(int i6) {
        j$.time.temporal.a.YEAR.O(i6);
        return new j$.time.p(i6);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.n((byte) 11, this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final j$.time.p d(long j6, j$.time.temporal.t tVar) {
        if (!(tVar instanceof j$.time.temporal.b)) {
            return (j$.time.p) tVar.n(this, j6);
        }
        int i6 = j$.time.o.f47911b[((j$.time.temporal.b) tVar).ordinal()];
        if (i6 == 1) {
            return O(j6);
        }
        if (i6 == 2) {
            return O(j$.com.android.tools.r8.a.m(j6, 10));
        }
        if (i6 == 3) {
            return O(j$.com.android.tools.r8.a.m(j6, 100));
        }
        if (i6 == 4) {
            return O(j$.com.android.tools.r8.a.m(j6, 1000));
        }
        if (i6 == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return c(j$.com.android.tools.r8.a.g(u(aVar), j6), aVar);
        }
        throw new j$.time.temporal.u("Unsupported unit: " + tVar);
    }

    public final j$.time.p O(long j6) {
        return j6 == 0 ? this : M(j$.time.temporal.a.YEAR.N(((long) this.f47913a) + j6));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final j$.time.p c(long j6, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return (j$.time.p) sVar.x(this, j6);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
        aVar.O(j6);
        int i6 = j$.time.o.f47910a[aVar.ordinal()];
        int i10 = this.f47913a;
        if (i6 == 1) {
            if (i10 < 1) {
                j6 = 1 - j6;
            }
            return M((int) j6);
        }
        if (i6 == 2) {
            return M((int) j6);
        }
        if (i6 == 3) {
            return u(j$.time.temporal.a.ERA) == j6 ? this : M(1 - i10);
        }
        throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
    }

    final void Q(java.io.DataOutput dataOutput) {
        dataOutput.writeInt(this.f47913a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return this.f47913a - ((j$.time.p) obj).f47913a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return sVar == j$.time.temporal.a.YEAR || sVar == j$.time.temporal.a.YEAR_OF_ERA || sVar == j$.time.temporal.a.ERA;
        }
        return sVar != null && sVar.u(this);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.p) {
            return this.f47913a == ((j$.time.p) obj).f47913a;
        }
        return false;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m f(long j6, j$.time.temporal.t tVar) {
        return j6 == Long.MIN_VALUE ? d(Long.MAX_VALUE, tVar).d(1L, tVar) : d(-j6, tVar);
    }

    public final int hashCode() {
        return this.f47913a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int n(j$.time.temporal.s sVar) {
        return q(sVar).a(u(sVar), sVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m p(j$.time.LocalDate localDate) {
        return (j$.time.p) j$.time.chrono.AbstractC6701g.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v q(j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.v.j(1L, this.f47913a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.n.d(this, sVar);
    }

    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f47913a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long u(j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return sVar.q(this);
        }
        int i6 = j$.time.o.f47910a[((j$.time.temporal.a) sVar).ordinal()];
        int i10 = this.f47913a;
        if (i6 == 1) {
            if (i10 < 1) {
                i10 = 1 - i10;
            }
            return i10;
        }
        if (i6 == 2) {
            return i10;
        }
        if (i6 == 3) {
            return i10 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object x(j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.e()) {
            return j$.time.chrono.q.f47758e;
        }
        return temporalQuery == j$.time.temporal.n.j() ? j$.time.temporal.b.YEARS : j$.time.temporal.n.c(this, temporalQuery);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m y(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.Chronology.CC.a(mVar).equals(j$.time.chrono.q.f47758e)) {
            throw new j$.time.DateTimeException("Adjustment only supported on ISO date-time");
        }
        return mVar.c(this.f47913a, j$.time.temporal.a.YEAR);
    }
}
