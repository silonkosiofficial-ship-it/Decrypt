package P7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements P7.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final P7.g f8363C;

    public b(P7.g gVar) {
        if (gVar == null) {
            M(0);
        }
        this.f8363C = gVar;
    }

    private static /* synthetic */ void M(int i6) {
        java.lang.String str = i6 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i6 != 1 ? 3 : 2];
        if (i6 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i6 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i6 != 1) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 == 1) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    @Override // P7.a
    public P7.g k() {
        P7.g gVar = this.f8363C;
        if (gVar == null) {
            M(1);
        }
        return gVar;
    }
}
