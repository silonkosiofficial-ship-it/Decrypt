package I2;

/* JADX INFO: loaded from: classes.dex */
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I2.m.b.c f4980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I2.m.b.C0116b f4981b;

    public static abstract class b {

        public static final class a extends I2.m.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final java.lang.Throwable f4982a;

            public a(java.lang.Throwable th) {
                this.f4982a = th;
            }

            public java.lang.Throwable a() {
                return this.f4982a;
            }

            public java.lang.String toString() {
                return java.lang.String.format("FAILURE (%s)", this.f4982a.getMessage());
            }
        }

        /* JADX INFO: renamed from: I2.m$b$b, reason: collision with other inner class name */
        public static final class C0116b extends I2.m.b {
            private C0116b() {
            }

            public java.lang.String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class c extends I2.m.b {
            private c() {
            }

            public java.lang.String toString() {
                return "SUCCESS";
            }
        }

        b() {
        }
    }

    static {
        f4980a = new I2.m.b.c();
        f4981b = new I2.m.b.C0116b();
    }
}
