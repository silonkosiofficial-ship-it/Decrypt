package j$.time;

/* JADX INFO: loaded from: classes4.dex */
public final class Duration implements j$.time.temporal.r, java.lang.Comparable<j$.time.Duration>, java.io.Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j$.time.Duration f47679c = new j$.time.Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f47680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47681b;

    static {
        java.math.BigInteger.valueOf(1000000000L);
    }

    private Duration(long j6, int i6) {
        this.f47680a = j6;
        this.f47681b = i6;
    }

    public static j$.time.Duration ofMillis(long j6) {
        long j10 = j6 / 1000;
        int i6 = (int) (j6 % 1000);
        if (i6 < 0) {
            i6 += 1000;
            j10--;
        }
        return p(j10, i6 * 1000000);
    }

    public static j$.time.Duration ofMinutes(long j6) {
        return p(j$.com.android.tools.r8.a.m(j6, 60), 0);
    }

    private static j$.time.Duration p(long j6, int i6) {
        return (((long) i6) | j6) == 0 ? f47679c : new j$.time.Duration(j6, i6);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.n((byte) 1, this);
    }

    public static j$.time.Duration x(long j6) {
        return p(j6, 0);
    }

    public static j$.time.Duration y(long j6, long j10) {
        return p(j$.com.android.tools.r8.a.g(j6, j$.com.android.tools.r8.a.l(j10, 1000000000L)), (int) j$.com.android.tools.r8.a.k(j10, 1000000000L));
    }

    final void M(java.io.DataOutput dataOutput) throws java.io.IOException {
        dataOutput.writeLong(this.f47680a);
        dataOutput.writeInt(this.f47681b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(j$.time.Duration duration) {
        j$.time.Duration duration2 = duration;
        int iCompare = java.lang.Long.compare(this.f47680a, duration2.f47680a);
        return iCompare != 0 ? iCompare : this.f47681b - duration2.f47681b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j$.time.Duration)) {
            return false;
        }
        j$.time.Duration duration = (j$.time.Duration) obj;
        return this.f47680a == duration.f47680a && this.f47681b == duration.f47681b;
    }

    public final int hashCode() {
        long j6 = this.f47680a;
        return (this.f47681b * 51) + ((int) (j6 ^ (j6 >>> 32)));
    }

    @Override // j$.time.temporal.r
    public final j$.time.temporal.m n(j$.time.chrono.ChronoLocalDate chronoLocalDate) {
        long j6 = this.f47680a;
        j$.time.chrono.ChronoLocalDate chronoLocalDateD = chronoLocalDate;
        if (j6 != 0) {
            chronoLocalDateD = chronoLocalDate.d(j6, (j$.time.temporal.t) j$.time.temporal.b.SECONDS);
        }
        int i6 = this.f47681b;
        return i6 != 0 ? chronoLocalDateD.d(i6, (j$.time.temporal.t) j$.time.temporal.b.NANOS) : chronoLocalDateD;
    }

    public final int q() {
        return this.f47681b;
    }

    public long toMillis() {
        long j6 = this.f47681b;
        long j10 = this.f47680a;
        if (j10 < 0) {
            j10++;
            j6 -= 1000000000;
        }
        return j$.com.android.tools.r8.a.g(j$.com.android.tools.r8.a.m(j10, 1000), j6 / 1000000);
    }

    public final java.lang.String toString() {
        if (this == f47679c) {
            return "PT0S";
        }
        long j6 = this.f47680a;
        int i6 = this.f47681b;
        long j10 = (j6 >= 0 || i6 <= 0) ? j6 : 1 + j6;
        long j11 = j10 / 3600;
        int i10 = (int) ((j10 % 3600) / 60);
        int i11 = (int) (j10 % 60);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(24);
        sb.append("PT");
        if (j11 != 0) {
            sb.append(j11);
            sb.append('H');
        }
        if (i10 != 0) {
            sb.append(i10);
            sb.append('M');
        }
        if (i11 == 0 && i6 == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j6 >= 0 || i6 <= 0 || i11 != 0) {
            sb.append(i11);
        } else {
            sb.append("-0");
        }
        if (i6 > 0) {
            int length = sb.length();
            sb.append(j6 < 0 ? 2000000000 - ((long) i6) : ((long) i6) + 1000000000);
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    public final long u() {
        return this.f47680a;
    }
}
