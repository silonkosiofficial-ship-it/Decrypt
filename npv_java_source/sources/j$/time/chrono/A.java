package j$.time.chrono;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends j$.time.chrono.AbstractC6697c {
    private static final long serialVersionUID = 1300372329181994526L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient j$.time.LocalDate f47712a;

    A(j$.time.LocalDate localDate) {
        j$.util.Objects.requireNonNull(localDate, "isoDate");
        this.f47712a = localDate;
    }

    private int Q() {
        return this.f47712a.getYear() - 1911;
    }

    private j$.time.chrono.A S(j$.time.LocalDate localDate) {
        return localDate.equals(this.f47712a) ? this : new j$.time.chrono.A(localDate);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.chrono.C((byte) 7, this);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.ChronoLocalDate C(j$.time.temporal.r rVar) {
        return (j$.time.chrono.A) super.C(rVar);
    }

    @Override // j$.time.chrono.AbstractC6697c
    final j$.time.chrono.ChronoLocalDate N(long j6) {
        return S(this.f47712a.Y(j6));
    }

    @Override // j$.time.chrono.AbstractC6697c
    final j$.time.chrono.ChronoLocalDate O(long j6) {
        return S(this.f47712a.plusMonths(j6));
    }

    @Override // j$.time.chrono.AbstractC6697c
    final j$.time.chrono.ChronoLocalDate P(long j6) {
        return S(this.f47712a.a0(j6));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    @Override // j$.time.chrono.AbstractC6697c, j$.time.temporal.m
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final j$.time.chrono.A c(long j6, j$.time.temporal.s sVar) {
        int iA;
        int i6;
        int i10;
        if (!(sVar instanceof j$.time.temporal.a)) {
            return (j$.time.chrono.A) super.c(j6, sVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
        if (u(aVar) == j6) {
            return this;
        }
        int[] iArr = j$.time.chrono.z.f47774a;
        int i11 = iArr[aVar.ordinal()];
        j$.time.LocalDate localDate = this.f47712a;
        if (i11 == 4) {
            iA = j$.time.chrono.y.f47773e.F(aVar).a(j6, aVar);
            i6 = iArr[aVar.ordinal()];
            if (i6 != 4) {
                if (Q() >= 1) {
                    i10 = iA + 1911;
                } else {
                    i10 = 1912 - iA;
                }
                return S(localDate.g0(i10));
            }
            if (i6 != 6) {
                return S(localDate.g0(iA + 1911));
            }
            if (i6 == 7) {
                return S(localDate.g0(1912 - Q()));
            }
        } else {
            if (i11 == 5) {
                j$.time.chrono.y.f47773e.F(aVar).b(j6, aVar);
                return S(localDate.plusMonths(j6 - (((((long) Q()) * 12) + ((long) localDate.getMonthValue())) - 1)));
            }
            if (i11 == 6 || i11 == 7) {
                iA = j$.time.chrono.y.f47773e.F(aVar).a(j6, aVar);
                i6 = iArr[aVar.ordinal()];
                if (i6 != 4) {
                    if (Q() >= 1) {
                        i10 = iA + 1911;
                    } else {
                        i10 = 1912 - iA;
                    }
                    return S(localDate.g0(i10));
                }
                if (i6 != 6) {
                    return S(localDate.g0(iA + 1911));
                }
                if (i6 == 7) {
                    return S(localDate.g0(1912 - Q()));
                }
            }
        }
        return S(localDate.c(j6, sVar));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.Chronology a() {
        return j$.time.chrono.y.f47773e;
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final j$.time.chrono.ChronoLocalDate d(long j6, j$.time.temporal.t tVar) {
        return (j$.time.chrono.A) super.d(j6, tVar);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.temporal.m
    public final j$.time.temporal.m d(long j6, j$.time.temporal.t tVar) {
        return (j$.time.chrono.A) super.d(j6, tVar);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.chrono.A) {
            return this.f47712a.equals(((j$.time.chrono.A) obj).f47712a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public final j$.time.chrono.ChronoLocalDate f(long j6, j$.time.temporal.t tVar) {
        return (j$.time.chrono.A) super.f(j6, tVar);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.temporal.m
    public final j$.time.temporal.m f(long j6, j$.time.temporal.t tVar) {
        return (j$.time.chrono.A) super.f(j6, tVar);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        j$.time.chrono.y.f47773e.getClass();
        return this.f47712a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: k */
    public final j$.time.chrono.ChronoLocalDate p(j$.time.temporal.o oVar) {
        return (j$.time.chrono.A) super.p(oVar);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.temporal.m
    public final j$.time.temporal.m p(j$.time.LocalDate localDate) {
        return (j$.time.chrono.A) super.p(localDate);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.v q(j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return sVar.y(this);
        }
        if (!j$.time.chrono.AbstractC6701g.h(this, sVar)) {
            throw new j$.time.temporal.u(j$.time.b.a("Unsupported field: ", sVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
        int i6 = j$.time.chrono.z.f47774a[aVar.ordinal()];
        if (i6 == 1 || i6 == 2 || i6 == 3) {
            return this.f47712a.q(sVar);
        }
        if (i6 != 4) {
            return j$.time.chrono.y.f47773e.F(aVar);
        }
        j$.time.temporal.v vVarN = j$.time.temporal.a.YEAR.n();
        return j$.time.temporal.v.j(1L, Q() <= 0 ? (-vVarN.e()) + 1912 : vVarN.d() - 1911);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f47712a.toEpochDay();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long u(j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return sVar.q(this);
        }
        int i6 = j$.time.chrono.z.f47774a[((j$.time.temporal.a) sVar).ordinal()];
        if (i6 == 4) {
            int iQ = Q();
            if (iQ < 1) {
                iQ = 1 - iQ;
            }
            return iQ;
        }
        j$.time.LocalDate localDate = this.f47712a;
        if (i6 == 5) {
            return ((((long) Q()) * 12) + ((long) localDate.getMonthValue())) - 1;
        }
        if (i6 == 6) {
            return Q();
        }
        if (i6 != 7) {
            return localDate.u(sVar);
        }
        return Q() < 1 ? 0 : 1;
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.ChronoLocalDateTime w(j$.time.LocalTime localTime) {
        return j$.time.chrono.C6699e.O(this, localTime);
    }

    @Override // j$.time.chrono.AbstractC6697c, j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.k z() {
        return Q() >= 1 ? j$.time.chrono.B.ROC : j$.time.chrono.B.BEFORE_ROC;
    }
}
