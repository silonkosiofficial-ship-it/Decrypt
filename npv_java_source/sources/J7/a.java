package J7;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements J7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Class f5759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f5760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final J7.a.EnumC0134a f5761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f5762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.List f5763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.List f5764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.List f5765g;

    /* JADX INFO: renamed from: J7.a$a, reason: collision with other inner class name */
    public enum EnumC0134a {
        CALL_BY_NAME,
        POSITIONAL_CALL;


        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private static final /* synthetic */ p157p7.a f5769F = p157p7.b.a(e());
    }

    public enum b {
        JAVA,
        KOTLIN;


        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private static final /* synthetic */ p157p7.a f5773F = p157p7.b.a(e());
    }

    public a(java.lang.Class cls, java.util.List list, J7.a.EnumC0134a enumC0134a, J7.a.b bVar, java.util.List list2) {
        p247y7.AbstractC7350t.f(cls, "jClass");
        p247y7.AbstractC7350t.f(list, "parameterNames");
        p247y7.AbstractC7350t.f(enumC0134a, "callMode");
        p247y7.AbstractC7350t.f(bVar, "origin");
        p247y7.AbstractC7350t.f(list2, "methods");
        this.f5759a = cls;
        this.f5760b = list;
        this.f5761c = enumC0134a;
        this.f5762d = list2;
        java.util.List list3 = list2;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list3, 10));
        java.util.Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((java.lang.reflect.Method) it.next()).getGenericReturnType());
        }
        this.f5763e = arrayList;
        java.util.List list4 = this.f5762d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list4, 10));
        java.util.Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            java.lang.Class<?> returnType = ((java.lang.reflect.Method) it2.next()).getReturnType();
            p247y7.AbstractC7350t.c(returnType);
            java.lang.Class<?> clsG = U7.d.g(returnType);
            if (clsG != null) {
                returnType = clsG;
            }
            arrayList2.add(returnType);
        }
        this.f5764f = arrayList2;
        java.util.List list5 = this.f5762d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list5, 10));
        java.util.Iterator it3 = list5.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((java.lang.reflect.Method) it3.next()).getDefaultValue());
        }
        this.f5765g = arrayList3;
        if (this.f5761c == J7.a.EnumC0134a.POSITIONAL_CALL && bVar == J7.a.b.JAVA && (!p097j7.AbstractC6879v.z0(this.f5760b, "value").isEmpty())) {
            throw new java.lang.UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    public /* synthetic */ a(java.lang.Class cls, java.util.List list, J7.a.EnumC0134a enumC0134a, J7.a.b bVar, java.util.List list2, int i6, p247y7.AbstractC7342k abstractC7342k) {
        java.util.List list3;
        if ((i6 & 16) != 0) {
            java.util.List list4 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list4, 10));
            java.util.Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((java.lang.String) it.next(), null));
            }
            list3 = arrayList;
        } else {
            list3 = list2;
        }
        this(cls, list, enumC0134a, bVar, list3);
    }

    public void a(java.lang.Object[] objArr) {
        J7.e.a.a(this, objArr);
    }

    public java.lang.Void b() {
        return null;
    }

    @Override // J7.e
    public java.lang.reflect.Type l() {
        return this.f5759a;
    }

    @Override // J7.e
    public java.util.List m() {
        return this.f5763e;
    }

    @Override // J7.e
    public /* bridge */ /* synthetic */ java.lang.reflect.Member n() {
        return (java.lang.reflect.Member) b();
    }

    @Override // J7.e
    public java.lang.Object z(java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "args");
        a(objArr);
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        int length = objArr.length;
        int i6 = 0;
        int i10 = 0;
        while (i6 < length) {
            java.lang.Object obj = objArr[i6];
            int i11 = i10 + 1;
            java.lang.Object objK = (obj == null && this.f5761c == J7.a.EnumC0134a.CALL_BY_NAME) ? this.f5765g.get(i10) : J7.c.k(obj, (java.lang.Class) this.f5764f.get(i10));
            if (objK == null) {
                J7.c.j(i10, (java.lang.String) this.f5760b.get(i10), (java.lang.Class) this.f5764f.get(i10));
                throw null;
            }
            arrayList.add(objK);
            i6++;
            i10 = i11;
        }
        return J7.c.d(this.f5759a, p097j7.S.q(p097j7.AbstractC6879v.c1(this.f5760b, arrayList)), this.f5762d);
    }
}
