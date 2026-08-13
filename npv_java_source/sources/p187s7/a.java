package p187s7;

/* JADX INFO: loaded from: classes3.dex */
public class a extends p177r7.a {

    /* JADX INFO: renamed from: s7.a$a, reason: collision with other inner class name */
    private static final class C0705a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p187s7.a.C0705a f54400a = new p187s7.a.C0705a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final java.lang.Integer f54401b;

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
            f54401b = num2;
        }

        private C0705a() {
        }
    }

    private final boolean c(int i6) {
        java.lang.Integer num = p187s7.a.C0705a.f54401b;
        return num == null || num.intValue() >= i6;
    }

    @Override // p167q7.a
    public C7.c b() {
        return c(34) ? new D7.a() : super.b();
    }
}
