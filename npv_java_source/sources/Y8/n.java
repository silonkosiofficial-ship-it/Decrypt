package Y8;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Y8.n.b f16556b = new Y8.n.b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Y8.n.c f16557c = new Y8.n.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f16558a;

    public static final class a extends Y8.n.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.Throwable f16559a;

        public a(java.lang.Throwable th) {
            this.f16559a = th;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof Y8.n.a) && p247y7.AbstractC7350t.b(this.f16559a, ((Y8.n.a) obj).f16559a);
        }

        public int hashCode() {
            java.lang.Throwable th = this.f16559a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // Y8.n.c
        public java.lang.String toString() {
            return "Closed(" + this.f16559a + ')';
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final java.lang.Object a(java.lang.Throwable th) {
            return Y8.n.c(new Y8.n.a(th));
        }

        public final java.lang.Object b() {
            return Y8.n.c(Y8.n.f16557c);
        }

        public final java.lang.Object c(java.lang.Object obj) {
            return Y8.n.c(obj);
        }
    }

    public static class c {
        public java.lang.String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ n(java.lang.Object obj) {
        this.f16558a = obj;
    }

    public static final /* synthetic */ Y8.n b(java.lang.Object obj) {
        return new Y8.n(obj);
    }

    public static java.lang.Object c(java.lang.Object obj) {
        return obj;
    }

    public static boolean d(java.lang.Object obj, java.lang.Object obj2) {
        return (obj2 instanceof Y8.n) && p247y7.AbstractC7350t.b(obj, ((Y8.n) obj2).l());
    }

    public static final java.lang.Throwable e(java.lang.Object obj) {
        Y8.n.a aVar = obj instanceof Y8.n.a ? (Y8.n.a) obj : null;
        if (aVar != null) {
            return aVar.f16559a;
        }
        return null;
    }

    public static final java.lang.Object f(java.lang.Object obj) {
        if (obj instanceof Y8.n.c) {
            return null;
        }
        return obj;
    }

    public static final java.lang.Object g(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Throwable th;
        if (!(obj instanceof Y8.n.c)) {
            return obj;
        }
        if ((obj instanceof Y8.n.a) && (th = ((Y8.n.a) obj).f16559a) != null) {
            throw th;
        }
        throw new java.lang.IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
    }

    public static int h(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean i(java.lang.Object obj) {
        return obj instanceof Y8.n.a;
    }

    public static final boolean j(java.lang.Object obj) {
        return !(obj instanceof Y8.n.c);
    }

    public static java.lang.String k(java.lang.Object obj) {
        if (obj instanceof Y8.n.a) {
            return ((Y8.n.a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return d(this.f16558a, obj);
    }

    public int hashCode() {
        return h(this.f16558a);
    }

    public final /* synthetic */ java.lang.Object l() {
        return this.f16558a;
    }

    public java.lang.String toString() {
        return k(this.f16558a);
    }
}
