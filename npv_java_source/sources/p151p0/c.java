package p151p0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p0.c.a f52619d = new p0.c.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f52620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f52621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f52622c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    private c(java.lang.String str, long j6, int i6) {
        this.f52620a = str;
        this.f52621b = j6;
        this.f52622c = i6;
        if (str.length() == 0) {
            throw new java.lang.IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i6 < -1 || i6 > 63) {
            throw new java.lang.IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public /* synthetic */ c(java.lang.String str, long j6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(str, j6, i6);
    }

    public final int a() {
        return p151p0.b.f(this.f52621b);
    }

    public final int b() {
        return this.f52622c;
    }

    public abstract float c(int i6);

    public abstract float d(int i6);

    public final long e() {
        return this.f52621b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p151p0.c cVar = (p151p0.c) obj;
        if (this.f52622c == cVar.f52622c && p247y7.AbstractC7350t.b(this.f52620a, cVar.f52620a)) {
            return p151p0.b.e(this.f52621b, cVar.f52621b);
        }
        return false;
    }

    public final java.lang.String f() {
        return this.f52620a;
    }

    public boolean g() {
        return false;
    }

    public abstract long h(float f6, float f10, float f11);

    public int hashCode() {
        return (((this.f52620a.hashCode() * 31) + p151p0.b.g(this.f52621b)) * 31) + this.f52622c;
    }

    public abstract float i(float f6, float f10, float f11);

    public abstract long j(float f6, float f10, float f11, float f12, p151p0.c cVar);

    public java.lang.String toString() {
        return this.f52620a + " (id=" + this.f52622c + ", model=" + ((java.lang.Object) p151p0.b.h(this.f52621b)) + ')';
    }
}
