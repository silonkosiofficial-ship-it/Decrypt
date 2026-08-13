package p257z8;

/* JADX INFO: loaded from: classes2.dex */
public class d extends p257z8.a implements p257z8.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O7.InterfaceC1420a f57662c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(O7.InterfaceC1420a interfaceC1420a, F8.E e6, p257z8.g gVar) {
        super(e6, gVar);
        if (interfaceC1420a == null) {
            b(0);
        }
        if (e6 == null) {
            b(1);
        }
        this.f57662c = interfaceC1420a;
    }

    private static /* synthetic */ void b(int i6) {
        java.lang.String str = i6 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i6 != 2 ? 3 : 2];
        if (i6 == 1) {
            objArr[0] = "receiverType";
        } else if (i6 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i6 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i6 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i6 != 2) {
            if (i6 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 == 2) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    public java.lang.String toString() {
        return getType() + ": Ext {" + this.f57662c + "}";
    }
}
