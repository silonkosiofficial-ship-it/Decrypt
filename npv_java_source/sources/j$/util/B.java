package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public final class B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j$.util.B f48009c = new j$.util.B();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f48010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f48011b;

    private B() {
        this.f48010a = false;
        this.f48011b = 0L;
    }

    private B(long j6) {
        this.f48010a = true;
        this.f48011b = j6;
    }

    public static j$.util.B a() {
        return f48009c;
    }

    public static j$.util.B d(long j6) {
        return new j$.util.B(j6);
    }

    public final long b() {
        if (this.f48010a) {
            return this.f48011b;
        }
        throw new java.util.NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f48010a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j$.util.B)) {
            return false;
        }
        j$.util.B b6 = (j$.util.B) obj;
        boolean z6 = this.f48010a;
        if (z6 && b6.f48010a) {
            if (this.f48011b == b6.f48011b) {
                return true;
            }
        } else if (z6 == b6.f48010a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f48010a) {
            return 0;
        }
        long j6 = this.f48011b;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final java.lang.String toString() {
        if (!this.f48010a) {
            return "OptionalLong.empty";
        }
        return "OptionalLong[" + this.f48011b + "]";
    }
}
