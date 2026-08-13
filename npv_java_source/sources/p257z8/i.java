package p257z8;

/* JADX INFO: loaded from: classes2.dex */
public class i extends p257z8.a {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(F8.E e6) {
        this(e6, null);
        if (e6 == null) {
            b(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private i(F8.E e6, p257z8.g gVar) {
        super(e6, gVar);
        if (e6 == null) {
            b(1);
        }
    }

    private static /* synthetic */ void b(int i6) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i6 != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i6 != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public java.lang.String toString() {
        return "{Transient} : " + getType();
    }
}
