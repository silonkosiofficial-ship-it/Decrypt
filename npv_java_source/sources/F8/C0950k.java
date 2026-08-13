package F8;

/* JADX INFO: renamed from: F8.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0950k extends F8.AbstractC0941b implements F8.e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final O7.InterfaceC1424e f2941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.List f2942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.Collection f2943f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0950k(O7.InterfaceC1424e interfaceC1424e, java.util.List list, java.util.Collection collection, E8.n nVar) {
        super(nVar);
        if (interfaceC1424e == null) {
            p(0);
        }
        if (list == null) {
            p(1);
        }
        if (collection == null) {
            p(2);
        }
        if (nVar == null) {
            p(3);
        }
        this.f2941d = interfaceC1424e;
        this.f2942e = j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(list));
        this.f2943f = j$.util.DesugarCollections.unmodifiableCollection(collection);
    }

    private static /* synthetic */ void p(int i6) {
        java.lang.String str = (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) ? 2 : 3];
        switch (i6) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i6 == 4) {
            objArr[1] = "getParameters";
        } else if (i6 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i6 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i6 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i6 != 4 && i6 != 5 && i6 != 6 && i6 != 7) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 4 && i6 != 5 && i6 != 6 && i6 != 7) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // F8.AbstractC0945f
    protected java.util.Collection g() {
        java.util.Collection collection = this.f2943f;
        if (collection == null) {
            p(6);
        }
        return collection;
    }

    @Override // F8.AbstractC0945f
    protected O7.d0 k() {
        O7.d0.a aVar = O7.d0.a.f8153a;
        if (aVar == null) {
            p(7);
        }
        return aVar;
    }

    @Override // F8.AbstractC0951l, F8.e0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public O7.InterfaceC1424e w() {
        O7.InterfaceC1424e interfaceC1424e = this.f2941d;
        if (interfaceC1424e == null) {
            p(5);
        }
        return interfaceC1424e;
    }

    public java.lang.String toString() {
        return p178r8.f.m(this.f2941d).b();
    }

    @Override // F8.e0
    public java.util.List x() {
        java.util.List list = this.f2942e;
        if (list == null) {
            p(4);
        }
        return list;
    }

    @Override // F8.e0
    public boolean y() {
        return true;
    }
}
