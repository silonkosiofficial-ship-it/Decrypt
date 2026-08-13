package p257z8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements p257z8.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final F8.E f57656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p257z8.g f57657b;

    public a(F8.E e6, p257z8.g gVar) {
        if (e6 == null) {
            b(0);
        }
        this.f57656a = e6;
        this.f57657b = gVar == null ? this : gVar;
    }

    private static /* synthetic */ void b(int i6) {
        java.lang.String str = (i6 == 1 || i6 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 1 || i6 == 2) ? 2 : 3];
        if (i6 == 1 || i6 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i6 == 1) {
            objArr[1] = "getType";
        } else if (i6 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i6 != 1 && i6 != 2) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 1 && i6 != 2) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // p257z8.g
    public F8.E getType() {
        F8.E e6 = this.f57656a;
        if (e6 == null) {
            b(1);
        }
        return e6;
    }
}
