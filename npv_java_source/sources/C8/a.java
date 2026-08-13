package C8;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends A8.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C8.a f1375r = new C8.a();

    /* JADX WARN: Illegal instructions before constructor call */
    private a() {
        p158p8.g gVarD = p158p8.g.d();
        p098j8.b.a(gVarD);
        p247y7.AbstractC7350t.e(gVarD, "apply(...)");
        p8.i.f fVar = p098j8.b.f49322a;
        p247y7.AbstractC7350t.e(fVar, "packageFqName");
        p8.i.f fVar2 = p098j8.b.f49324c;
        p247y7.AbstractC7350t.e(fVar2, "constructorAnnotation");
        p8.i.f fVar3 = p098j8.b.f49323b;
        p247y7.AbstractC7350t.e(fVar3, "classAnnotation");
        p8.i.f fVar4 = p098j8.b.f49325d;
        p247y7.AbstractC7350t.e(fVar4, "functionAnnotation");
        p8.i.f fVar5 = p098j8.b.f49326e;
        p247y7.AbstractC7350t.e(fVar5, "propertyAnnotation");
        p8.i.f fVar6 = p098j8.b.f49327f;
        p247y7.AbstractC7350t.e(fVar6, "propertyGetterAnnotation");
        p8.i.f fVar7 = p098j8.b.f49328g;
        p247y7.AbstractC7350t.e(fVar7, "propertySetterAnnotation");
        p8.i.f fVar8 = p098j8.b.f49330i;
        p247y7.AbstractC7350t.e(fVar8, "enumEntryAnnotation");
        p8.i.f fVar9 = p098j8.b.f49329h;
        p247y7.AbstractC7350t.e(fVar9, "compileTimeValue");
        p8.i.f fVar10 = p098j8.b.f49331j;
        p247y7.AbstractC7350t.e(fVar10, "parameterAnnotation");
        p8.i.f fVar11 = p098j8.b.f49332k;
        p247y7.AbstractC7350t.e(fVar11, "typeAnnotation");
        p8.i.f fVar12 = p098j8.b.f49333l;
        p247y7.AbstractC7350t.e(fVar12, "typeParameterAnnotation");
        super(gVarD, fVar, fVar2, fVar3, fVar4, null, fVar5, fVar6, fVar7, null, null, null, fVar8, fVar9, fVar10, fVar11, fVar12);
    }

    private final java.lang.String s(p138n8.c cVar) {
        if (cVar.d()) {
            return "default-package";
        }
        java.lang.String strG = cVar.g().g();
        p247y7.AbstractC7350t.e(strG, "asString(...)");
        return strG;
    }

    public final java.lang.String q(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        return s(cVar) + ".kotlin_builtins";
    }

    public final java.lang.String r(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String strB = cVar.b();
        p247y7.AbstractC7350t.e(strB, "asString(...)");
        sb.append(S8.r.Q(strB, '.', '/', false, 4, null));
        sb.append('/');
        sb.append(q(cVar));
        return sb.toString();
    }
}
