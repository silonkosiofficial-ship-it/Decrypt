package p247y7;

/* JADX INFO: renamed from: y7.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7350t {

    /* JADX INFO: renamed from: y7.t$a */
    public static class a {
    }

    public static boolean a(java.lang.Float f6, float f10) {
        return f6 != null && f6.floatValue() == f10;
    }

    public static boolean b(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void c(java.lang.Object obj) {
        if (obj == null) {
            l();
        }
    }

    public static void d(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            m(str);
        }
    }

    public static void e(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return;
        }
        throw ((java.lang.NullPointerException) j(new java.lang.NullPointerException(str + " must not be null")));
    }

    public static void f(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            n(str);
        }
    }

    public static int g(int i6, int i10) {
        if (i6 < i10) {
            return -1;
        }
        return i6 == i10 ? 0 : 1;
    }

    public static int h(long j6, long j10) {
        if (j6 < j10) {
            return -1;
        }
        return j6 == j10 ? 0 : 1;
    }

    private static java.lang.String i(java.lang.String str) {
        java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
        java.lang.String name = p247y7.AbstractC7350t.class.getName();
        int i6 = 0;
        while (!stackTrace[i6].getClassName().equals(name)) {
            i6++;
        }
        while (stackTrace[i6].getClassName().equals(name)) {
            i6++;
        }
        java.lang.StackTraceElement stackTraceElement = stackTrace[i6];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    private static java.lang.Throwable j(java.lang.Throwable th) {
        return k(th, p247y7.AbstractC7350t.class.getName());
    }

    static java.lang.Throwable k(java.lang.Throwable th, java.lang.String str) {
        java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i6 = -1;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(stackTrace[i10].getClassName())) {
                i6 = i10;
            }
        }
        th.setStackTrace((java.lang.StackTraceElement[]) java.util.Arrays.copyOfRange(stackTrace, i6 + 1, length));
        return th;
    }

    public static void l() {
        throw ((java.lang.NullPointerException) j(new java.lang.NullPointerException()));
    }

    public static void m(java.lang.String str) {
        throw ((java.lang.NullPointerException) j(new java.lang.NullPointerException(str)));
    }

    private static void n(java.lang.String str) {
        throw ((java.lang.NullPointerException) j(new java.lang.NullPointerException(i(str))));
    }

    public static void o(java.lang.String str) {
        throw ((p087i7.L) j(new p087i7.L(str)));
    }

    public static void p(java.lang.String str) {
        o("lateinit property " + str + " has not been initialized");
    }
}
