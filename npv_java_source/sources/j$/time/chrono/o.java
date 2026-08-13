package j$.time.chrono;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends j$.time.chrono.AbstractC6697c {
    private static final long serialVersionUID = -5207853542612002020L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient j$.time.chrono.m f47753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int f47754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient int f47755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f47756d;

    private o(j$.time.chrono.m mVar, int i6, int i10, int i11) {
        mVar.V(i6, i10, i11);
        this.f47753a = mVar;
        this.f47754b = i6;
        this.f47755c = i10;
        this.f47756d = i11;
    }

    private o(j$.time.chrono.m mVar, long j6) {
        int[] iArrW = mVar.W((int) j6);
        this.f47753a = mVar;
        this.f47754b = iArrW[0];
        this.f47755c = iArrW[1];
        this.f47756d = iArrW[2];
    }

    private int Q() {
        return this.f47753a.U(this.f47754b, this.f47755c) + this.f47756d;
    }

    static j$.time.chrono.o R(j$.time.chrono.m mVar, int i6, int i10, int i11) {
        return new j$.time.chrono.o(mVar, i6, i10, i11);
    }

    static j$.time.chrono.o S(j$.time.chrono.m mVar, long j6) {
        return new j$.time.chrono.o(mVar, j6);
    }

    private j$.time.chrono.o V(int i6, int i10, int i11) {
        j$.time.chrono.m mVar = this.f47753a;
        int iX = mVar.X(i6, i10);
        if (i11 > iX) {
            i11 = iX;
        }
        return new j$.time.chrono.o(mVar, i6, i10, i11);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.chrono.C((byte) 6, this);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.ChronoLocalDate C(j$.time.temporal.r rVar) {
        return (j$.time.chrono.o) super.C(rVar);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate
    public final boolean D() {
        return this.f47753a.J(this.f47754b);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate
    public final int I() {
        return this.f47753a.Y(this.f47754b);
    }

    @Override // j$.time.chrono.AbstractC6697c
    final j$.time.chrono.ChronoLocalDate P(long j6) {
        if (j6 == 0) {
            return this;
        }
        long j10 = ((long) this.f47754b) + ((long) ((int) j6));
        int i6 = (int) j10;
        if (j10 == i6) {
            return V(i6, this.f47755c, this.f47756d);
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC6697c
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final j$.time.chrono.o N(long j6) {
        return new j$.time.chrono.o(this.f47753a, toEpochDay() + j6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC6697c
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final j$.time.chrono.o O(long j6) {
        if (j6 == 0) {
            return this;
        }
        long j10 = (((long) this.f47754b) * 12) + ((long) (this.f47755c - 1)) + j6;
        return V(this.f47753a.R(j$.com.android.tools.r8.a.l(j10, 12L)), ((int) j$.com.android.tools.r8.a.k(j10, 12L)) + 1, this.f47756d);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.temporal.m
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final j$.time.chrono.o c(long j6, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return (j$.time.chrono.o) super.c(j6, sVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
        j$.time.chrono.m mVar = this.f47753a;
        mVar.F(aVar).b(j6, aVar);
        int i6 = (int) j6;
        int i10 = j$.time.chrono.n.f47752a[aVar.ordinal()];
        int i11 = this.f47756d;
        int i12 = this.f47755c;
        int i13 = this.f47754b;
        switch (i10) {
            case 1:
                return V(i13, i12, i6);
            case 2:
                return N(java.lang.Math.min(i6, I()) - Q());
            case 3:
                return N((j6 - u(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return N(j6 - ((long) (((int) j$.com.android.tools.r8.a.k(toEpochDay() + 3, 7)) + 1)));
            case 5:
                return N(j6 - u(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return N(j6 - u(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new j$.time.chrono.o(mVar, j6);
            case 8:
                return N((j6 - u(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return V(i13, i6, i11);
            case 10:
                return O(j6 - (((((long) i13) * 12) + ((long) i12)) - 1));
            case 11:
                if (i13 < 1) {
                    i6 = 1 - i6;
                }
                return V(i6, i12, i11);
            case 12:
                return V(i6, i12, i11);
            case 13:
                return V(1 - i13, i12, i11);
            default:
                throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.Chronology a() {
        return this.f47753a;
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final j$.time.chrono.ChronoLocalDate d(long j6, j$.time.temporal.t tVar) {
        return (j$.time.chrono.o) super.d(j6, tVar);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.temporal.m
    public final j$.time.temporal.m d(long j6, j$.time.temporal.t tVar) {
        return (j$.time.chrono.o) super.d(j6, tVar);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j$.time.chrono.o)) {
            return false;
        }
        j$.time.chrono.o oVar = (j$.time.chrono.o) obj;
        return this.f47754b == oVar.f47754b && this.f47755c == oVar.f47755c && this.f47756d == oVar.f47756d && this.f47753a.equals(oVar.f47753a);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final j$.time.chrono.ChronoLocalDate f(long j6, j$.time.temporal.t tVar) {
        return (j$.time.chrono.o) super.f(j6, tVar);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.temporal.m
    public final j$.time.temporal.m f(long j6, j$.time.temporal.t tVar) {
        return (j$.time.chrono.o) super.f(j6, tVar);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        int iHashCode = this.f47753a.getId().hashCode();
        int i6 = this.f47754b;
        return (iHashCode ^ (i6 & (-2048))) ^ (((i6 << 11) + (this.f47755c << 6)) + this.f47756d);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: k */
    public final j$.time.chrono.ChronoLocalDate p(j$.time.temporal.o oVar) {
        return (j$.time.chrono.o) super.p(oVar);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.temporal.m
    public final j$.time.temporal.m p(j$.time.LocalDate localDate) {
        return (j$.time.chrono.o) super.p(localDate);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v q(j$.time.temporal.s sVar) {
        int iX;
        long j6;
        if (!(sVar instanceof j$.time.temporal.a)) {
            return sVar.y(this);
        }
        if (!j$.time.chrono.AbstractC6701g.h(this, sVar)) {
            throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
        int i6 = j$.time.chrono.n.f47752a[aVar.ordinal()];
        j$.time.chrono.m mVar = this.f47753a;
        if (i6 != 1) {
            if (i6 == 2) {
                iX = I();
            } else {
                if (i6 != 3) {
                    return mVar.F(aVar);
                }
                j6 = 5;
            }
            return j$.time.temporal.v.j(1L, j6);
        }
        iX = mVar.X(this.f47754b, this.f47755c);
        j6 = iX;
        return j$.time.temporal.v.j(1L, j6);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f47753a.V(this.f47754b, this.f47755c, this.f47756d);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long u(j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return sVar.q(this);
        }
        int i6 = j$.time.chrono.n.f47752a[((j$.time.temporal.a) sVar).ordinal()];
        int i10 = this.f47755c;
        int i11 = this.f47756d;
        int i12 = this.f47754b;
        switch (i6) {
            case 1:
                return i11;
            case 2:
                return Q();
            case 3:
                return ((i11 - 1) / 7) + 1;
            case 4:
                return ((int) j$.com.android.tools.r8.a.k(toEpochDay() + 3, 7)) + 1;
            case 5:
                return ((i11 - 1) % 7) + 1;
            case 6:
                return ((Q() - 1) % 7) + 1;
            case 7:
                return toEpochDay();
            case 8:
                return ((Q() - 1) / 7) + 1;
            case 9:
                return i10;
            case 10:
                return ((((long) i12) * 12) + ((long) i10)) - 1;
            case 11:
                return i12;
            case 12:
                return i12;
            case 13:
                return i12 <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
        }
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.ChronoLocalDateTime w(j$.time.LocalTime localTime) {
        return j$.time.chrono.C6699e.O(this, localTime);
    }

    final void writeExternal(java.io.ObjectOutput objectOutput) throws java.io.IOException {
        objectOutput.writeObject(this.f47753a);
        objectOutput.writeInt(j$.time.temporal.n.a(this, j$.time.temporal.a.YEAR));
        objectOutput.writeByte(j$.time.temporal.n.a(this, j$.time.temporal.a.MONTH_OF_YEAR));
        objectOutput.writeByte(j$.time.temporal.n.a(this, j$.time.temporal.a.DAY_OF_MONTH));
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.k z() {
        return j$.time.chrono.p.AH;
    }
}
