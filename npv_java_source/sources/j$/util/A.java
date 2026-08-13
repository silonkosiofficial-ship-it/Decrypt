package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public final class A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j$.util.A f48006c = new j$.util.A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f48007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48008b;

    private A() {
        this.f48007a = false;
        this.f48008b = 0;
    }

    private A(int i6) {
        this.f48007a = true;
        this.f48008b = i6;
    }

    public static j$.util.A a() {
        return f48006c;
    }

    public static j$.util.A d(int i6) {
        return new j$.util.A(i6);
    }

    public final int b() {
        if (this.f48007a) {
            return this.f48008b;
        }
        throw new java.util.NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f48007a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j$.util.A)) {
            return false;
        }
        j$.util.A a6 = (j$.util.A) obj;
        boolean z6 = this.f48007a;
        if (z6 && a6.f48007a) {
            if (this.f48008b == a6.f48008b) {
                return true;
            }
        } else if (z6 == a6.f48007a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f48007a) {
            return this.f48008b;
        }
        return 0;
    }

    public final java.lang.String toString() {
        if (!this.f48007a) {
            return "OptionalInt.empty";
        }
        return "OptionalInt[" + this.f48008b + "]";
    }
}
