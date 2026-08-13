package j$.time.chrono;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends j$.time.chrono.AbstractC6697c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final j$.time.LocalDate f47763d = j$.time.LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient j$.time.LocalDate f47764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient j$.time.chrono.w f47765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient int f47766c;

    v(j$.time.LocalDate localDate) {
        if (localDate.R(f47763d)) {
            throw new j$.time.DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        j$.time.chrono.w wVarG = j$.time.chrono.w.g(localDate);
        this.f47765b = wVarG;
        this.f47766c = (localDate.getYear() - wVarG.l().getYear()) + 1;
        this.f47764a = localDate;
    }

    v(j$.time.chrono.w wVar, int i6, j$.time.LocalDate localDate) {
        if (localDate.R(f47763d)) {
            throw new j$.time.DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        this.f47765b = wVar;
        this.f47766c = i6;
        this.f47764a = localDate;
    }

    private j$.time.chrono.v T(j$.time.LocalDate localDate) {
        return localDate.equals(this.f47764a) ? this : new j$.time.chrono.v(localDate);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.chrono.C((byte) 4, this);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.ChronoLocalDate C(j$.time.temporal.r rVar) {
        return (j$.time.chrono.v) super.C(rVar);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate
    public final int I() {
        j$.time.chrono.w wVar = this.f47765b;
        j$.time.chrono.w wVarO = wVar.o();
        j$.time.LocalDate localDate = this.f47764a;
        int I10 = (wVarO == null || wVarO.l().getYear() != localDate.getYear()) ? localDate.I() : wVarO.l().Q() - 1;
        return this.f47766c == 1 ? I10 - (wVar.l().Q() - 1) : I10;
    }

    @Override // j$.time.chrono.AbstractC6697c
    final j$.time.chrono.ChronoLocalDate N(long j6) {
        return T(this.f47764a.Y(j6));
    }

    @Override // j$.time.chrono.AbstractC6697c
    final j$.time.chrono.ChronoLocalDate O(long j6) {
        return T(this.f47764a.plusMonths(j6));
    }

    @Override // j$.time.chrono.AbstractC6697c
    final j$.time.chrono.ChronoLocalDate P(long j6) {
        return T(this.f47764a.a0(j6));
    }

    public final j$.time.chrono.w Q() {
        return this.f47765b;
    }

    public final j$.time.chrono.v R(long j6, j$.time.temporal.t tVar) {
        return (j$.time.chrono.v) super.d(j6, tVar);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.temporal.m
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final j$.time.chrono.v c(long j6, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return (j$.time.chrono.v) super.c(j6, sVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
        if (u(aVar) == j6) {
            return this;
        }
        int[] iArr = j$.time.chrono.u.f47762a;
        int i6 = iArr[aVar.ordinal()];
        j$.time.LocalDate localDate = this.f47764a;
        if (i6 == 3 || i6 == 8 || i6 == 9) {
            j$.time.chrono.t tVar = j$.time.chrono.t.f47761e;
            int iA = tVar.F(aVar).a(j6, aVar);
            int i10 = iArr[aVar.ordinal()];
            if (i10 == 3) {
                return T(localDate.g0(tVar.h(this.f47765b, iA)));
            }
            if (i10 == 8) {
                return T(localDate.g0(tVar.h(j$.time.chrono.w.r(iA), this.f47766c)));
            }
            if (i10 == 9) {
                return T(localDate.g0(iA));
            }
        }
        return T(localDate.c(j6, sVar));
    }

    public final j$.time.chrono.v U(j$.time.temporal.q qVar) {
        return (j$.time.chrono.v) super.p(qVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.Chronology a() {
        return j$.time.chrono.t.f47761e;
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final j$.time.chrono.ChronoLocalDate d(long j6, j$.time.temporal.t tVar) {
        return (j$.time.chrono.v) super.d(j6, tVar);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.temporal.m
    public final j$.time.temporal.m d(long j6, j$.time.temporal.t tVar) {
        return (j$.time.chrono.v) super.d(j6, tVar);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || sVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || sVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || sVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (sVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) sVar).M();
        }
        return sVar != null && sVar.u(this);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.chrono.v) {
            return this.f47764a.equals(((j$.time.chrono.v) obj).f47764a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final j$.time.chrono.ChronoLocalDate f(long j6, j$.time.temporal.t tVar) {
        return (j$.time.chrono.v) super.f(j6, tVar);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.temporal.m
    public final j$.time.temporal.m f(long j6, j$.time.temporal.t tVar) {
        return (j$.time.chrono.v) super.f(j6, tVar);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        j$.time.chrono.t.f47761e.getClass();
        return this.f47764a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: k */
    public final j$.time.chrono.ChronoLocalDate p(j$.time.temporal.o oVar) {
        return (j$.time.chrono.v) super.p(oVar);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.temporal.m
    public final j$.time.temporal.m p(j$.time.LocalDate localDate) {
        return (j$.time.chrono.v) super.p(localDate);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v q(j$.time.temporal.s sVar) {
        int iLengthOfMonth;
        if (!(sVar instanceof j$.time.temporal.a)) {
            return sVar.y(this);
        }
        if (!e(sVar)) {
            throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
        int i6 = j$.time.chrono.u.f47762a[aVar.ordinal()];
        if (i6 == 1) {
            iLengthOfMonth = this.f47764a.lengthOfMonth();
        } else if (i6 == 2) {
            iLengthOfMonth = I();
        } else {
            if (i6 != 3) {
                return j$.time.chrono.t.f47761e.F(aVar);
            }
            j$.time.chrono.w wVar = this.f47765b;
            int year = wVar.l().getYear();
            j$.time.chrono.w wVarO = wVar.o();
            iLengthOfMonth = wVarO != null ? (wVarO.l().getYear() - year) + 1 : 999999999 - year;
        }
        return j$.time.temporal.v.j(1L, iLengthOfMonth);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f47764a.toEpochDay();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long u(j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return sVar.q(this);
        }
        int i6 = j$.time.chrono.u.f47762a[((j$.time.temporal.a) sVar).ordinal()];
        int i10 = this.f47766c;
        j$.time.chrono.w wVar = this.f47765b;
        j$.time.LocalDate localDate = this.f47764a;
        switch (i6) {
            case 2:
                return i10 == 1 ? (localDate.Q() - wVar.l().Q()) + 1 : localDate.Q();
            case 3:
                return i10;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
            case 8:
                return wVar.getValue();
            default:
                return localDate.u(sVar);
        }
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.ChronoLocalDateTime w(j$.time.LocalTime localTime) {
        return j$.time.chrono.C6699e.O(this, localTime);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.k z() {
        return this.f47765b;
    }
}
