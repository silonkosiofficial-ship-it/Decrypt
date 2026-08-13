package P7;

/* JADX INFO: loaded from: classes2.dex */
public class d implements P7.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F8.E f8364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f8365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O7.a0 f8366c;

    public d(F8.E e6, java.util.Map map, O7.a0 a0Var) {
        if (e6 == null) {
            b(0);
        }
        if (map == null) {
            b(1);
        }
        if (a0Var == null) {
            b(2);
        }
        this.f8364a = e6;
        this.f8365b = map;
        this.f8366c = a0Var;
    }

    private static /* synthetic */ void b(int i6) {
        java.lang.String str = (i6 == 3 || i6 == 4 || i6 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 3 || i6 == 4 || i6 == 5) ? 2 : 3];
        if (i6 == 1) {
            objArr[0] = "valueArguments";
        } else if (i6 == 2) {
            objArr[0] = "source";
        } else if (i6 == 3 || i6 == 4 || i6 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i6 == 3) {
            objArr[1] = "getType";
        } else if (i6 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i6 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i6 != 3 && i6 != 4 && i6 != 5) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 3 && i6 != 4 && i6 != 5) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // P7.c
    public java.util.Map a() {
        java.util.Map map = this.f8365b;
        if (map == null) {
            b(4);
        }
        return map;
    }

    @Override // P7.c
    public p138n8.c e() {
        return P7.c.a.a(this);
    }

    @Override // P7.c
    public F8.E getType() {
        F8.E e6 = this.f8364a;
        if (e6 == null) {
            b(3);
        }
        return e6;
    }

    @Override // P7.c
    public O7.a0 o() {
        O7.a0 a0Var = this.f8366c;
        if (a0Var == null) {
            b(5);
        }
        return a0Var;
    }

    public java.lang.String toString() {
        return p168q8.c.f53159g.r(this, null);
    }
}
