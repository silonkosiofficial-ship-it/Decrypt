package H2;

/* JADX INFO: renamed from: H2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1234a implements H2.p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.Set f4284c = new java.util.HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f4285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f4286b;

    /* JADX INFO: renamed from: H2.a$a, reason: collision with other inner class name */
    private static class C0104a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final java.util.Set f4287a = new java.util.HashSet(java.util.Arrays.asList(H2.x.c().a()));
    }

    /* JADX INFO: renamed from: H2.a$b */
    public static class b extends H2.AbstractC1234a {
        b(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        @Override // H2.AbstractC1234a
        public final boolean c() {
            return true;
        }
    }

    /* JADX INFO: renamed from: H2.a$c */
    public static class c extends H2.AbstractC1234a {
        c(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        @Override // H2.AbstractC1234a
        public final boolean c() {
            return android.os.Build.VERSION.SDK_INT >= 24;
        }
    }

    /* JADX INFO: renamed from: H2.a$d */
    public static class d extends H2.AbstractC1234a {
        d(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        @Override // H2.AbstractC1234a
        public final boolean c() {
            return false;
        }
    }

    /* JADX INFO: renamed from: H2.a$e */
    public static class e extends H2.AbstractC1234a {
        e(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        @Override // H2.AbstractC1234a
        public final boolean c() {
            return android.os.Build.VERSION.SDK_INT >= 26;
        }
    }

    /* JADX INFO: renamed from: H2.a$f */
    public static class f extends H2.AbstractC1234a {
        f(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        @Override // H2.AbstractC1234a
        public final boolean c() {
            return android.os.Build.VERSION.SDK_INT >= 27;
        }
    }

    /* JADX INFO: renamed from: H2.a$g */
    public static class g extends H2.AbstractC1234a {
        g(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        @Override // H2.AbstractC1234a
        public final boolean c() {
            return android.os.Build.VERSION.SDK_INT >= 28;
        }
    }

    /* JADX INFO: renamed from: H2.a$h */
    public static class h extends H2.AbstractC1234a {
        h(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        @Override // H2.AbstractC1234a
        public final boolean c() {
            return android.os.Build.VERSION.SDK_INT >= 29;
        }
    }

    /* JADX INFO: renamed from: H2.a$i */
    public static class i extends H2.AbstractC1234a {
        i(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        @Override // H2.AbstractC1234a
        public final boolean c() {
            return android.os.Build.VERSION.SDK_INT >= 33;
        }
    }

    AbstractC1234a(java.lang.String str, java.lang.String str2) {
        this.f4285a = str;
        this.f4286b = str2;
        f4284c.add(this);
    }

    public static java.util.Set e() {
        return j$.util.DesugarCollections.unmodifiableSet(f4284c);
    }

    @Override // H2.p
    public boolean a() {
        return c() || d();
    }

    @Override // H2.p
    public java.lang.String b() {
        return this.f4285a;
    }

    public abstract boolean c();

    public boolean d() {
        return Z9.a.b(H2.AbstractC1234a.C0104a.f4287a, this.f4286b);
    }
}
