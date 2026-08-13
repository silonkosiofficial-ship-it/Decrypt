package O7;

/* JADX INFO: loaded from: classes2.dex */
public interface a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O7.a0 f8143a = new O7.a0.a();

    static class a implements O7.a0 {
        a() {
        }

        private static /* synthetic */ void d(int i6) {
            throw new java.lang.IllegalStateException(java.lang.String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // O7.a0
        public O7.b0 a() {
            O7.b0 b0Var = O7.b0.f8149a;
            if (b0Var == null) {
                d(0);
            }
            return b0Var;
        }

        public java.lang.String toString() {
            return "NO_SOURCE";
        }
    }

    O7.b0 a();
}
