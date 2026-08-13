package p177r7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends p167q7.a {

    /* JADX INFO: renamed from: r7.a$a, reason: collision with other inner class name */
    private static final class C0702a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p177r7.a.C0702a f53981a = new p177r7.a.C0702a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final java.lang.Integer f53982b;

        static {
            java.lang.Integer num;
            java.lang.Integer num2 = null;
            try {
                java.lang.Object obj = java.lang.Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            } catch (java.lang.Throwable unused) {
            }
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f53982b = num2;
        }

        private C0702a() {
        }
    }

    private final boolean c(int i6) {
        java.lang.Integer num = p177r7.a.C0702a.f53982b;
        return num == null || num.intValue() >= i6;
    }

    @Override // p167q7.a
    public void a(java.lang.Throwable th, java.lang.Throwable th2) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        p247y7.AbstractC7350t.f(th, "cause");
        p247y7.AbstractC7350t.f(th2, "exception");
        if (c(19)) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
