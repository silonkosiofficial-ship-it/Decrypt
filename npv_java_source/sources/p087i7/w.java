package p087i7;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements java.io.Serializable {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final i7.w.a f46751D = new i7.w.a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object f46752C;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public static final class b implements java.io.Serializable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public final java.lang.Throwable f46753C;

        public b(java.lang.Throwable th) {
            p247y7.AbstractC7350t.f(th, "exception");
            this.f46753C = th;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof i7.w.b) && p247y7.AbstractC7350t.b(this.f46753C, ((i7.w.b) obj).f46753C);
        }

        public int hashCode() {
            return this.f46753C.hashCode();
        }

        public java.lang.String toString() {
            return "Failure(" + this.f46753C + ')';
        }
    }

    private /* synthetic */ w(java.lang.Object obj) {
        this.f46752C = obj;
    }

    public static final /* synthetic */ p087i7.w a(java.lang.Object obj) {
        return new p087i7.w(obj);
    }

    public static java.lang.Object b(java.lang.Object obj) {
        return obj;
    }

    public static boolean c(java.lang.Object obj, java.lang.Object obj2) {
        return (obj2 instanceof p087i7.w) && p247y7.AbstractC7350t.b(obj, ((p087i7.w) obj2).j());
    }

    public static final boolean d(java.lang.Object obj, java.lang.Object obj2) {
        return p247y7.AbstractC7350t.b(obj, obj2);
    }

    public static final java.lang.Throwable e(java.lang.Object obj) {
        if (obj instanceof i7.w.b) {
            return ((i7.w.b) obj).f46753C;
        }
        return null;
    }

    public static int f(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean g(java.lang.Object obj) {
        return obj instanceof i7.w.b;
    }

    public static final boolean h(java.lang.Object obj) {
        return !(obj instanceof i7.w.b);
    }

    public static java.lang.String i(java.lang.Object obj) {
        if (obj instanceof i7.w.b) {
            return ((i7.w.b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return c(this.f46752C, obj);
    }

    public int hashCode() {
        return f(this.f46752C);
    }

    public final /* synthetic */ java.lang.Object j() {
        return this.f46752C;
    }

    public java.lang.String toString() {
        return i(this.f46752C);
    }
}
