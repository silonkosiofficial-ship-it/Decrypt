package j$.time.chrono;

/* JADX INFO: renamed from: j$.time.chrono.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6700f implements j$.time.temporal.r, java.io.Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f47729e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.time.chrono.Chronology f47730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f47731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f47732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f47733d;

    static {
        j$.com.android.tools.r8.a.i(new java.lang.Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    C6700f(j$.time.chrono.Chronology chronology, int i6, int i10, int i11) {
        j$.util.Objects.requireNonNull(chronology, "chrono");
        this.f47730a = chronology;
        this.f47731b = i6;
        this.f47732c = i10;
        this.f47733d = i11;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    final void a(java.io.DataOutput dataOutput) throws java.io.IOException {
        dataOutput.writeUTF(this.f47730a.getId());
        dataOutput.writeInt(this.f47731b);
        dataOutput.writeInt(this.f47732c);
        dataOutput.writeInt(this.f47733d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j$.time.chrono.C6700f)) {
            return false;
        }
        j$.time.chrono.C6700f c6700f = (j$.time.chrono.C6700f) obj;
        return this.f47731b == c6700f.f47731b && this.f47732c == c6700f.f47732c && this.f47733d == c6700f.f47733d && this.f47730a.equals(c6700f.f47730a);
    }

    public final int hashCode() {
        return this.f47730a.hashCode() ^ (java.lang.Integer.rotateLeft(this.f47733d, 16) + (java.lang.Integer.rotateLeft(this.f47732c, 8) + this.f47731b));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // j$.time.temporal.r
    public final j$.time.temporal.m n(j$.time.chrono.ChronoLocalDate chronoLocalDate) {
        long j6;
        j$.time.chrono.ChronoLocalDate chronoLocalDate2;
        j$.time.temporal.b bVar;
        int i6;
        j$.time.chrono.ChronoLocalDate chronoLocalDate3;
        j$.util.Objects.requireNonNull(chronoLocalDate, "temporal");
        j$.time.chrono.Chronology chronology = (j$.time.chrono.Chronology) chronoLocalDate.x(j$.time.temporal.n.e());
        j$.time.chrono.Chronology chronology2 = this.f47730a;
        if (chronology != null && !chronology2.equals(chronology)) {
            throw new j$.time.DateTimeException("Chronology mismatch, expected: " + chronology2.getId() + ", actual: " + chronology.getId());
        }
        int i10 = this.f47731b;
        int i11 = this.f47732c;
        j$.time.temporal.m mVarD = chronoLocalDate;
        if (i11 == 0) {
            if (i10 != 0) {
                j6 = i10;
                bVar = j$.time.temporal.b.YEARS;
                chronoLocalDate3 = chronoLocalDate;
            }
            i6 = this.f47733d;
            if (i6 != 0) {
                return mVarD.d(i6, j$.time.temporal.b.DAYS);
            }
            return mVarD;
        }
        j$.time.temporal.v vVarF = chronology2.F(j$.time.temporal.a.MONTH_OF_YEAR);
        long jD = (vVarF.g() && vVarF.h()) ? (vVarF.d() - vVarF.e()) + 1 : -1L;
        j$.time.chrono.ChronoLocalDate chronoLocalDateD = chronoLocalDate;
        if (jD > 0) {
            j6 = (((long) i10) * jD) + ((long) i11);
            chronoLocalDate2 = chronoLocalDate;
        } else {
            if (i10 != 0) {
                chronoLocalDateD = chronoLocalDate.d(i10, (j$.time.temporal.t) j$.time.temporal.b.YEARS);
            }
            j6 = i11;
            chronoLocalDate2 = chronoLocalDateD;
        }
        bVar = j$.time.temporal.b.MONTHS;
        chronoLocalDate3 = chronoLocalDate2;
        mVarD = chronoLocalDate3.d(j6, (j$.time.temporal.t) bVar);
        i6 = this.f47733d;
        if (i6 != 0) {
            return mVarD.d(i6, j$.time.temporal.b.DAYS);
        }
        return mVarD;
    }

    public final java.lang.String toString() {
        j$.time.chrono.Chronology chronology = this.f47730a;
        int i6 = this.f47733d;
        int i10 = this.f47732c;
        int i11 = this.f47731b;
        if (i11 == 0 && i10 == 0 && i6 == 0) {
            return chronology.toString() + " P0D";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(chronology.toString());
        sb.append(" P");
        if (i11 != 0) {
            sb.append(i11);
            sb.append('Y');
        }
        if (i10 != 0) {
            sb.append(i10);
            sb.append('M');
        }
        if (i6 != 0) {
            sb.append(i6);
            sb.append('D');
        }
        return sb.toString();
    }

    protected java.lang.Object writeReplace() {
        return new j$.time.chrono.C((byte) 9, this);
    }
}
