package T0;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T0.g.a f12887b = new T0.g.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Locale f12888a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final T0.g a() {
            return T0.j.a().b().f(0);
        }
    }

    public g(java.lang.String str) {
        this(T0.j.a().c(str));
    }

    public g(java.util.Locale locale) {
        this.f12888a = locale;
    }

    public final java.lang.String a() {
        return this.f12888a.getLanguage();
    }

    public final java.util.Locale b() {
        return this.f12888a;
    }

    public final java.lang.String c() {
        return T0.k.b(this.f12888a);
    }

    public final java.lang.String d() {
        return T0.k.a(this.f12888a);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof T0.g)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return p247y7.AbstractC7350t.b(d(), ((T0.g) obj).d());
    }

    public int hashCode() {
        return d().hashCode();
    }

    public java.lang.String toString() {
        return d();
    }
}
