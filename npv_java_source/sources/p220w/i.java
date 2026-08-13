package p220w;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V.InterfaceC1753w0 f56123a;

    public static abstract class a {

        /* JADX INFO: renamed from: w.i$a$a, reason: collision with other inner class name */
        public static final class C0740a extends w.i.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final w.i.a.C0740a f56124a = new w.i.a.C0740a();

            private C0740a() {
                super(null);
            }

            public java.lang.String toString() {
                return "Closed";
            }
        }

        public static final class b extends w.i.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f56125a;

            private b(long j6) {
                super(null);
                this.f56125a = j6;
                if (!p131n0.h.c(j6)) {
                    throw new java.lang.IllegalStateException("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.".toString());
                }
            }

            public /* synthetic */ b(long j6, p247y7.AbstractC7342k abstractC7342k) {
                this(j6);
            }

            public final long a() {
                return this.f56125a;
            }

            public boolean equals(java.lang.Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof w.i.a.b) {
                    return p131n0.g.j(this.f56125a, ((w.i.a.b) obj).f56125a);
                }
                return false;
            }

            public int hashCode() {
                return p131n0.g.o(this.f56125a);
            }

            public java.lang.String toString() {
                return "Open(offset=" + ((java.lang.Object) p131n0.g.t(this.f56125a)) + ')';
            }
        }

        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public i(w.i.a aVar) {
        this.f56123a = V.A1.d(aVar, null, 2, null);
    }

    public /* synthetic */ i(w.i.a aVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? w.i.a.C0740a.f56124a : aVar);
    }

    public final w.i.a a() {
        return (w.i.a) this.f56123a.getValue();
    }

    public final void b(w.i.a aVar) {
        this.f56123a.setValue(aVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p220w.i) {
            return p247y7.AbstractC7350t.b(((p220w.i) obj).a(), a());
        }
        return false;
    }

    public int hashCode() {
        return a().hashCode();
    }

    public java.lang.String toString() {
        return "ContextMenuState(status=" + a() + ')';
    }
}
