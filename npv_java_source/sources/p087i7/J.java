package p087i7;

/* JADX INFO: loaded from: classes3.dex */
public final class J implements java.lang.Comparable {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final i7.J.a f46716D = new i7.J.a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final short f46717C;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    private /* synthetic */ J(short s6) {
        this.f46717C = s6;
    }

    public static final /* synthetic */ p087i7.J e(short s6) {
        return new p087i7.J(s6);
    }

    public static short g(short s6) {
        return s6;
    }

    public static boolean i(short s6, java.lang.Object obj) {
        return (obj instanceof p087i7.J) && s6 == ((p087i7.J) obj).o();
    }

    public static int m(short s6) {
        return s6;
    }

    public static java.lang.String n(short s6) {
        return java.lang.String.valueOf(s6 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return p247y7.AbstractC7350t.g(o() & 65535, ((p087i7.J) obj).o() & 65535);
    }

    public boolean equals(java.lang.Object obj) {
        return i(this.f46717C, obj);
    }

    public int hashCode() {
        return m(this.f46717C);
    }

    public final /* synthetic */ short o() {
        return this.f46717C;
    }

    public java.lang.String toString() {
        return n(this.f46717C);
    }
}
