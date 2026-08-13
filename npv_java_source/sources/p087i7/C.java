package p087i7;

/* JADX INFO: loaded from: classes3.dex */
public final class C implements java.lang.Comparable {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final i7.C.a f46700D = new i7.C.a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final byte f46701C;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    private /* synthetic */ C(byte b6) {
        this.f46701C = b6;
    }

    public static final /* synthetic */ p087i7.C e(byte b6) {
        return new p087i7.C(b6);
    }

    public static byte g(byte b6) {
        return b6;
    }

    public static boolean i(byte b6, java.lang.Object obj) {
        return (obj instanceof p087i7.C) && b6 == ((p087i7.C) obj).o();
    }

    public static int m(byte b6) {
        return b6;
    }

    public static java.lang.String n(byte b6) {
        return java.lang.String.valueOf(b6 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return p247y7.AbstractC7350t.g(o() & 255, ((p087i7.C) obj).o() & 255);
    }

    public boolean equals(java.lang.Object obj) {
        return i(this.f46701C, obj);
    }

    public int hashCode() {
        return m(this.f46701C);
    }

    public final /* synthetic */ byte o() {
        return this.f46701C;
    }

    public java.lang.String toString() {
        return n(this.f46701C);
    }
}
