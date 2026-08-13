package j$.util;

/* JADX INFO: renamed from: j$.util.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C6858z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j$.util.C6858z f48610c = new j$.util.C6858z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f48611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f48612b;

    private C6858z() {
        this.f48611a = false;
        this.f48612b = Double.NaN;
    }

    private C6858z(double d6) {
        this.f48611a = true;
        this.f48612b = d6;
    }

    public static j$.util.C6858z a() {
        return f48610c;
    }

    public static j$.util.C6858z d(double d6) {
        return new j$.util.C6858z(d6);
    }

    public final double b() {
        if (this.f48611a) {
            return this.f48612b;
        }
        throw new java.util.NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f48611a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j$.util.C6858z)) {
            return false;
        }
        j$.util.C6858z c6858z = (j$.util.C6858z) obj;
        boolean z6 = this.f48611a;
        if (z6 && c6858z.f48611a) {
            if (java.lang.Double.compare(this.f48612b, c6858z.f48612b) == 0) {
                return true;
            }
        } else if (z6 == c6858z.f48611a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f48611a) {
            return 0;
        }
        long jDoubleToLongBits = java.lang.Double.doubleToLongBits(this.f48612b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final java.lang.String toString() {
        if (!this.f48611a) {
            return "OptionalDouble.empty";
        }
        return "OptionalDouble[" + this.f48612b + "]";
    }
}
