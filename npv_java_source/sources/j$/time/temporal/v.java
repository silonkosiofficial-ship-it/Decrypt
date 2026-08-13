package j$.time.temporal;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements java.io.Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f47959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f47960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f47961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f47962d;

    private v(long j6, long j10, long j11, long j12) {
        this.f47959a = j6;
        this.f47960b = j10;
        this.f47961c = j11;
        this.f47962d = j12;
    }

    private java.lang.String c(long j6, j$.time.temporal.s sVar) {
        if (sVar == null) {
            return "Invalid value (valid values " + this + "): " + j6;
        }
        return "Invalid value for " + sVar + " (valid values " + this + "): " + j6;
    }

    public static j$.time.temporal.v j(long j6, long j10) {
        if (j6 <= j10) {
            return new j$.time.temporal.v(j6, j6, j10, j10);
        }
        throw new java.lang.IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static j$.time.temporal.v k(long j6, long j10, long j11) {
        if (j6 > 1) {
            throw new java.lang.IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j10 > j11) {
            throw new java.lang.IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 <= j11) {
            return new j$.time.temporal.v(j6, 1L, j10, j11);
        }
        throw new java.lang.IllegalArgumentException("Minimum value must be less than maximum value");
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        long j6 = this.f47959a;
        long j10 = this.f47960b;
        if (j6 > j10) {
            throw new java.io.InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j11 = this.f47961c;
        long j12 = this.f47962d;
        if (j11 > j12) {
            throw new java.io.InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j10 > j12) {
            throw new java.io.InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final int a(long j6, j$.time.temporal.s sVar) {
        if (h() && i(j6)) {
            return (int) j6;
        }
        throw new j$.time.DateTimeException(c(j6, sVar));
    }

    public final void b(long j6, j$.time.temporal.s sVar) {
        if (!i(j6)) {
            throw new j$.time.DateTimeException(c(j6, sVar));
        }
    }

    public final long d() {
        return this.f47962d;
    }

    public final long e() {
        return this.f47959a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j$.time.temporal.v)) {
            return false;
        }
        j$.time.temporal.v vVar = (j$.time.temporal.v) obj;
        return this.f47959a == vVar.f47959a && this.f47960b == vVar.f47960b && this.f47961c == vVar.f47961c && this.f47962d == vVar.f47962d;
    }

    public final long f() {
        return this.f47961c;
    }

    public final boolean g() {
        return this.f47959a == this.f47960b && this.f47961c == this.f47962d;
    }

    public final boolean h() {
        return this.f47959a >= -2147483648L && this.f47962d <= 2147483647L;
    }

    public final int hashCode() {
        long j6 = this.f47960b;
        long j10 = this.f47959a + (j6 << 16) + (j6 >> 48);
        long j11 = this.f47961c;
        long j12 = j10 + (j11 << 32) + (j11 >> 32);
        long j13 = this.f47962d;
        long j14 = j12 + (j13 << 48) + (j13 >> 16);
        return (int) ((j14 >>> 32) ^ j14);
    }

    public final boolean i(long j6) {
        return j6 >= this.f47959a && j6 <= this.f47962d;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        long j6 = this.f47959a;
        sb.append(j6);
        long j10 = this.f47960b;
        if (j6 != j10) {
            sb.append('/');
            sb.append(j10);
        }
        sb.append(" - ");
        long j11 = this.f47961c;
        sb.append(j11);
        long j12 = this.f47962d;
        if (j11 != j12) {
            sb.append('/');
            sb.append(j12);
        }
        return sb.toString();
    }
}
