package j$.time;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements j$.time.temporal.r, java.io.Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j$.time.m f47904d = new j$.time.m(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f47907c;

    static {
        java.util.regex.Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.com.android.tools.r8.a.i(new java.lang.Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    private m(int i6, int i10, int i11) {
        this.f47905a = i6;
        this.f47906b = i10;
        this.f47907c = i11;
    }

    public static j$.time.m b(int i6) {
        return i6 == 0 ? f47904d : new j$.time.m(0, 0, i6);
    }

    static j$.time.m c(java.io.DataInput dataInput) throws java.io.IOException {
        int i6 = dataInput.readInt();
        int i10 = dataInput.readInt();
        int i11 = dataInput.readInt();
        return ((i6 | i10) | i11) == 0 ? f47904d : new j$.time.m(i6, i10, i11);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.n((byte) 14, this);
    }

    public final int a() {
        return this.f47907c;
    }

    public final long d() {
        return (((long) this.f47905a) * 12) + ((long) this.f47906b);
    }

    final void e(java.io.DataOutput dataOutput) {
        dataOutput.writeInt(this.f47905a);
        dataOutput.writeInt(this.f47906b);
        dataOutput.writeInt(this.f47907c);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j$.time.m)) {
            return false;
        }
        j$.time.m mVar = (j$.time.m) obj;
        return this.f47905a == mVar.f47905a && this.f47906b == mVar.f47906b && this.f47907c == mVar.f47907c;
    }

    public final int hashCode() {
        return java.lang.Integer.rotateLeft(this.f47907c, 16) + java.lang.Integer.rotateLeft(this.f47906b, 8) + this.f47905a;
    }

    @Override // j$.time.temporal.r
    public final j$.time.temporal.m n(j$.time.chrono.ChronoLocalDate chronoLocalDate) {
        long jD;
        j$.time.temporal.b bVar;
        j$.time.chrono.ChronoLocalDate chronoLocalDateD;
        j$.util.Objects.requireNonNull(chronoLocalDate, "temporal");
        j$.time.chrono.Chronology chronology = (j$.time.chrono.Chronology) chronoLocalDate.x(j$.time.temporal.n.e());
        if (chronology != null && !j$.time.chrono.q.f47758e.equals(chronology)) {
            throw new j$.time.DateTimeException("Chronology mismatch, expected: ISO, actual: " + chronology.getId());
        }
        if (this.f47906b == 0) {
            int i6 = this.f47905a;
            if (i6 != 0) {
                chronoLocalDateD = chronoLocalDate;
                jD = i6;
                bVar = j$.time.temporal.b.YEARS;
                chronoLocalDateD = chronoLocalDate.d(jD, (j$.time.temporal.t) bVar);
            }
        } else {
            jD = d();
            if (jD != 0) {
                chronoLocalDateD = chronoLocalDate;
                bVar = j$.time.temporal.b.MONTHS;
                chronoLocalDateD = chronoLocalDate.d(jD, (j$.time.temporal.t) bVar);
            }
        }
        chronoLocalDateD = chronoLocalDate;
        chronoLocalDateD = chronoLocalDate;
        int i10 = this.f47907c;
        return i10 != 0 ? chronoLocalDateD.d(i10, (j$.time.temporal.t) j$.time.temporal.b.DAYS) : chronoLocalDateD;
    }

    public final java.lang.String toString() {
        if (this == f47904d) {
            return "P0D";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("P");
        int i6 = this.f47905a;
        if (i6 != 0) {
            sb.append(i6);
            sb.append('Y');
        }
        int i10 = this.f47906b;
        if (i10 != 0) {
            sb.append(i10);
            sb.append('M');
        }
        int i11 = this.f47907c;
        if (i11 != 0) {
            sb.append(i11);
            sb.append('D');
        }
        return sb.toString();
    }
}
