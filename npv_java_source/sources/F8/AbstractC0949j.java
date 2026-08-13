package F8;

/* JADX INFO: renamed from: F8.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0949j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ F7.k[] f2939a = {p247y7.P.j(new p247y7.G(p247y7.P.d(F8.AbstractC0949j.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final B7.c f2940b;

    static {
        M8.n nVarC = F8.a0.f2872D.c(p247y7.P.b(F8.C0948i.class));
        p247y7.AbstractC7350t.d(nVarC, "null cannot be cast to non-null type kotlin.properties.ReadOnlyProperty<org.jetbrains.kotlin.types.TypeAttributes, T of org.jetbrains.kotlin.types.TypeAttributes.Companion.attributeAccessor?>");
        f2940b = nVarC;
    }

    public static final P7.g a(F8.a0 a0Var) {
        P7.g gVarE;
        p247y7.AbstractC7350t.f(a0Var, "<this>");
        F8.C0948i c0948iB = b(a0Var);
        return (c0948iB == null || (gVarE = c0948iB.e()) == null) ? P7.g.f8385d.b() : gVarE;
    }

    public static final F8.C0948i b(F8.a0 a0Var) {
        p247y7.AbstractC7350t.f(a0Var, "<this>");
        return (F8.C0948i) f2940b.a(a0Var, f2939a[0]);
    }
}
