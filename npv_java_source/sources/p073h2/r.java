package p073h2;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f46232a;

    public static final class a extends p073h2.r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.Throwable f46233b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(java.lang.Throwable th) {
            super(false, null);
            p247y7.AbstractC7350t.f(th, "error");
            this.f46233b = th;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof h2.r.a) {
                h2.r.a aVar = (h2.r.a) obj;
                if (a() == aVar.a() && p247y7.AbstractC7350t.b(this.f46233b, aVar.f46233b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return p190t.h.a(a()) + this.f46233b.hashCode();
        }

        public java.lang.String toString() {
            return "Error(endOfPaginationReached=" + a() + ", error=" + this.f46233b + ')';
        }
    }

    public static final class b extends p073h2.r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h2.r.b f46234b = new h2.r.b();

        private b() {
            super(false, null);
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof h2.r.b) && a() == ((h2.r.b) obj).a();
        }

        public int hashCode() {
            return p190t.h.a(a());
        }

        public java.lang.String toString() {
            return "Loading(endOfPaginationReached=" + a() + ')';
        }
    }

    public static final class c extends p073h2.r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h2.r.c.a f46235b = new h2.r.c.a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final h2.r.c f46236c = new h2.r.c(true);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final h2.r.c f46237d = new h2.r.c(false);

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public final h2.r.c a() {
                return h2.r.c.f46236c;
            }

            public final h2.r.c b() {
                return h2.r.c.f46237d;
            }
        }

        public c(boolean z6) {
            super(z6, null);
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof h2.r.c) && a() == ((h2.r.c) obj).a();
        }

        public int hashCode() {
            return p190t.h.a(a());
        }

        public java.lang.String toString() {
            return "NotLoading(endOfPaginationReached=" + a() + ')';
        }
    }

    private r(boolean z6) {
        this.f46232a = z6;
    }

    public /* synthetic */ r(boolean z6, p247y7.AbstractC7342k abstractC7342k) {
        this(z6);
    }

    public final boolean a() {
        return this.f46232a;
    }
}
