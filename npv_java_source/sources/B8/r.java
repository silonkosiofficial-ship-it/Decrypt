package B8;

/* JADX INFO: loaded from: classes2.dex */
public interface r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B8.r f922a = new B8.r.a();

    static class a implements B8.r {
        a() {
        }

        private static /* synthetic */ void c(int i6) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i6 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i6 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // B8.r
        public void a(O7.InterfaceC1421b interfaceC1421b) {
            if (interfaceC1421b == null) {
                c(2);
            }
        }

        @Override // B8.r
        public void b(O7.InterfaceC1424e interfaceC1424e, java.util.List list) {
            if (interfaceC1424e == null) {
                c(0);
            }
            if (list == null) {
                c(1);
            }
        }
    }

    void a(O7.InterfaceC1421b interfaceC1421b);

    void b(O7.InterfaceC1424e interfaceC1424e, java.util.List list);
}
