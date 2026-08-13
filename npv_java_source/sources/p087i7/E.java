package p087i7;

/* JADX INFO: loaded from: classes3.dex */
public final class E implements java.lang.Comparable {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final i7.E.a f46705D = new i7.E.a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f46706C;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    private /* synthetic */ E(int i6) {
        this.f46706C = i6;
    }

    public static final /* synthetic */ p087i7.E e(int i6) {
        return new p087i7.E(i6);
    }

    public static int g(int i6) {
        return i6;
    }

    public static boolean i(int i6, java.lang.Object obj) {
        return (obj instanceof p087i7.E) && i6 == ((p087i7.E) obj).o();
    }

    public static int m(int i6) {
        return i6;
    }

    public static java.lang.String n(int i6) {
        return java.lang.String.valueOf(((long) i6) & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return p087i7.O.a(o(), ((p087i7.E) obj).o());
    }

    public boolean equals(java.lang.Object obj) {
        return i(this.f46706C, obj);
    }

    public int hashCode() {
        return m(this.f46706C);
    }

    public final /* synthetic */ int o() {
        return this.f46706C;
    }

    public java.lang.String toString() {
        return n(this.f46706C);
    }
}
