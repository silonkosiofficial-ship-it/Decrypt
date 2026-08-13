package ja;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ja.a.b[] f49337a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static volatile ja.a.b[] f49339c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.List f49338b = new java.util.ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ja.a.b f49340d = new ja.a.C0618a();

    /* JADX INFO: renamed from: ja.a$a, reason: collision with other inner class name */
    static class C0618a extends ja.a.b {
        C0618a() {
        }

        @Override // ja.a.b
        public void a(java.lang.String str, java.lang.Object... objArr) {
            for (ja.a.b bVar : ja.a.f49339c) {
                bVar.a(str, objArr);
            }
        }

        @Override // ja.a.b
        public void b(java.lang.String str, java.lang.Object... objArr) {
            for (ja.a.b bVar : ja.a.f49339c) {
                bVar.b(str, objArr);
            }
        }

        @Override // ja.a.b
        public void c(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
            for (ja.a.b bVar : ja.a.f49339c) {
                bVar.c(th, str, objArr);
            }
        }

        @Override // ja.a.b
        public void d(java.lang.String str, java.lang.Object... objArr) {
            for (ja.a.b bVar : ja.a.f49339c) {
                bVar.d(str, objArr);
            }
        }

        @Override // ja.a.b
        public void e(java.lang.String str, java.lang.Object... objArr) {
            for (ja.a.b bVar : ja.a.f49339c) {
                bVar.e(str, objArr);
            }
        }

        @Override // ja.a.b
        public void f(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
            for (ja.a.b bVar : ja.a.f49339c) {
                bVar.f(th, str, objArr);
            }
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.lang.ThreadLocal f49341a = new java.lang.ThreadLocal();

        public abstract void a(java.lang.String str, java.lang.Object... objArr);

        public abstract void b(java.lang.String str, java.lang.Object... objArr);

        public abstract void c(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr);

        public abstract void d(java.lang.String str, java.lang.Object... objArr);

        public abstract void e(java.lang.String str, java.lang.Object... objArr);

        public abstract void f(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr);
    }

    static {
        ja.a.b[] bVarArr = new ja.a.b[0];
        f49337a = bVarArr;
        f49339c = bVarArr;
    }

    public static void a(java.lang.String str, java.lang.Object... objArr) {
        f49340d.a(str, objArr);
    }

    public static void b(java.lang.String str, java.lang.Object... objArr) {
        f49340d.b(str, objArr);
    }

    public static void c(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        f49340d.c(th, str, objArr);
    }

    public static void d(java.lang.String str, java.lang.Object... objArr) {
        f49340d.d(str, objArr);
    }

    public static void e(java.lang.String str, java.lang.Object... objArr) {
        f49340d.e(str, objArr);
    }

    public static void f(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        f49340d.f(th, str, objArr);
    }
}
