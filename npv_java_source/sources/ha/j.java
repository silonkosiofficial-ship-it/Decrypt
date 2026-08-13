package ha;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String[] f46589a = {"System.out", "stdout", "sysout"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ha.j.b f46590b = e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ha.j.a f46591c = g();

    private enum a {
        DEBUG(0),
        INFO(1),
        WARN(2),
        ERROR(3);


        /* JADX INFO: renamed from: C, reason: collision with root package name */
        int f46597C;

        a(int i6) {
            this.f46597C = i6;
        }
    }

    private enum b {
        Stderr,
        Stdout
    }

    public static void a(java.lang.String str) {
        if (h(ha.j.a.DEBUG)) {
            d().println("SLF4J(D): " + str);
        }
    }

    public static final void b(java.lang.String str) {
        d().println("SLF4J(E): " + str);
    }

    public static final void c(java.lang.String str, java.lang.Throwable th) {
        d().println("SLF4J(E): " + str);
        d().println("SLF4J(E): Reported exception:");
        th.printStackTrace(d());
    }

    private static java.io.PrintStream d() {
        return f46590b.ordinal() != 1 ? java.lang.System.err : java.lang.System.out;
    }

    private static ha.j.b e() {
        java.lang.String property = java.lang.System.getProperty("slf4j.internal.report.stream");
        if (property == null || property.isEmpty()) {
            return ha.j.b.Stderr;
        }
        for (java.lang.String str : f46589a) {
            if (str.equalsIgnoreCase(property)) {
                return ha.j.b.Stdout;
            }
        }
        return ha.j.b.Stderr;
    }

    public static void f(java.lang.String str) {
        if (h(ha.j.a.INFO)) {
            d().println("SLF4J(I): " + str);
        }
    }

    private static ha.j.a g() {
        java.lang.String property = java.lang.System.getProperty("slf4j.internal.verbosity");
        if (property == null || property.isEmpty()) {
            return ha.j.a.INFO;
        }
        if (property.equalsIgnoreCase("DEBUG")) {
            return ha.j.a.DEBUG;
        }
        if (property.equalsIgnoreCase("ERROR")) {
            return ha.j.a.ERROR;
        }
        return property.equalsIgnoreCase("WARN") ? ha.j.a.WARN : ha.j.a.INFO;
    }

    static boolean h(ha.j.a aVar) {
        return aVar.f46597C >= f46591c.f46597C;
    }

    public static final void i(java.lang.String str) {
        if (h(ha.j.a.WARN)) {
            d().println("SLF4J(W): " + str);
        }
    }
}
