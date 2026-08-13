package j$.time.format;

/* JADX INFO: loaded from: classes4.dex */
final class p extends j$.time.format.j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final j$.time.LocalDate f47862i = j$.time.LocalDate.of(2000, 1, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f47863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j$.time.chrono.ChronoLocalDate f47864h;

    /* JADX WARN: Illegal instructions before constructor call */
    p(j$.time.temporal.s sVar) {
        j$.time.LocalDate localDate = f47862i;
        this(sVar, 2, 2, 0, localDate, 0);
        if (localDate == null) {
            long j6 = 0;
            if (!sVar.n().i(j6)) {
                throw new java.lang.IllegalArgumentException("The base value must be within the range of the field");
            }
            if (j6 + j$.time.format.j.f47837f[2] > 2147483647L) {
                throw new j$.time.DateTimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
            }
        }
    }

    /* synthetic */ p(j$.time.temporal.s sVar, int i6) {
        this(sVar, 2, 2, 0, f47862i, i6);
    }

    private p(j$.time.temporal.s sVar, int i6, int i10, int i11, j$.time.chrono.ChronoLocalDate chronoLocalDate, int i12) {
        super(sVar, i6, i10, j$.time.format.D.NOT_NEGATIVE, i12);
        this.f47863g = i11;
        this.f47864h = chronoLocalDate;
    }

    @Override // j$.time.format.j
    final long b(j$.time.format.x xVar, long j6) {
        long jAbs = java.lang.Math.abs(j6);
        j$.time.chrono.ChronoLocalDate chronoLocalDate = this.f47864h;
        long jN = chronoLocalDate != null ? j$.time.chrono.Chronology.CC.a(xVar.d()).o(chronoLocalDate).n(this.f47838a) : this.f47863g;
        long[] jArr = j$.time.format.j.f47837f;
        if (j6 >= jN) {
            long j10 = jArr[this.f47839b];
            if (j6 < jN + j10) {
                return jAbs % j10;
            }
        }
        return jAbs % jArr[this.f47840c];
    }

    @Override // j$.time.format.j
    final boolean c(j$.time.format.v vVar) {
        if (vVar.l()) {
            return super.c(vVar);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [j$.time.format.o] */
    @Override // j$.time.format.j
    final int d(final j$.time.format.v vVar, final long j6, final int i6, final int i10) {
        int iN;
        j$.time.chrono.ChronoLocalDate chronoLocalDate = this.f47864h;
        if (chronoLocalDate != null) {
            iN = vVar.h().o(chronoLocalDate).n(this.f47838a);
            vVar.a(new java.util.function.Consumer() { // from class: j$.time.format.o
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f47857a.d(vVar, j6, i6, i10);
                }

                public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                    return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            iN = this.f47863g;
        }
        int i11 = i10 - i6;
        int i12 = this.f47839b;
        if (i11 == i12 && j6 >= 0) {
            long j10 = j$.time.format.j.f47837f[i12];
            long j11 = iN;
            long j12 = j11 - (j11 % j10);
            j6 = iN > 0 ? j12 + j6 : j12 - j6;
            if (j6 < j11) {
                j6 += j10;
            }
        }
        return vVar.o(this.f47838a, j6, i6, i10);
    }

    @Override // j$.time.format.j
    final j$.time.format.j e() {
        if (this.f47842e == -1) {
            return this;
        }
        return new j$.time.format.p(this.f47838a, this.f47839b, this.f47840c, this.f47863g, this.f47864h, -1);
    }

    @Override // j$.time.format.j
    final j$.time.format.j f(int i6) {
        int i10 = this.f47842e + i6;
        return new j$.time.format.p(this.f47838a, this.f47839b, this.f47840c, this.f47863g, this.f47864h, i10);
    }

    @Override // j$.time.format.j
    public final java.lang.String toString() {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.f47863g);
        java.lang.Object objRequireNonNull = this.f47864h;
        if (objRequireNonNull == null) {
            objRequireNonNull = j$.util.Objects.requireNonNull(numValueOf, "defaultObj");
        }
        return "ReducedValue(" + this.f47838a + "," + this.f47839b + "," + this.f47840c + "," + objRequireNonNull + ")";
    }
}
