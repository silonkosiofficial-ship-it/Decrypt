package J7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h implements J7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.reflect.Method f5797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f5798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.reflect.Type f5799c;

    public static final class a extends J7.h implements J7.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final java.lang.Object f5800d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(java.lang.reflect.Method method, java.lang.Object obj) {
            super(method, p097j7.AbstractC6879v.m(), null);
            p247y7.AbstractC7350t.f(method, "unboxMethod");
            this.f5800d = obj;
        }

        @Override // J7.e
        public java.lang.Object z(java.lang.Object[] objArr) {
            p247y7.AbstractC7350t.f(objArr, "args");
            b(objArr);
            return a(this.f5800d, objArr);
        }
    }

    public static final class b extends J7.h {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(java.lang.reflect.Method method) {
            super(method, p097j7.AbstractC6879v.e(method.getDeclaringClass()), null);
            p247y7.AbstractC7350t.f(method, "unboxMethod");
        }

        @Override // J7.e
        public java.lang.Object z(java.lang.Object[] objArr) {
            p247y7.AbstractC7350t.f(objArr, "args");
            b(objArr);
            java.lang.Object obj = objArr[0];
            J7.f.d dVar = J7.f.f5783e;
            return a(obj, objArr.length <= 1 ? new java.lang.Object[0] : p097j7.AbstractC6872n.r(objArr, 1, objArr.length));
        }
    }

    private h(java.lang.reflect.Method method, java.util.List list) {
        this.f5797a = method;
        this.f5798b = list;
        java.lang.Class<?> returnType = method.getReturnType();
        p247y7.AbstractC7350t.e(returnType, "getReturnType(...)");
        this.f5799c = returnType;
    }

    public /* synthetic */ h(java.lang.reflect.Method method, java.util.List list, p247y7.AbstractC7342k abstractC7342k) {
        this(method, list);
    }

    protected final java.lang.Object a(java.lang.Object obj, java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(objArr, "args");
        return this.f5797a.invoke(obj, java.util.Arrays.copyOf(objArr, objArr.length));
    }

    public void b(java.lang.Object[] objArr) {
        J7.e.a.a(this, objArr);
    }

    @Override // J7.e
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final java.lang.reflect.Method n() {
        return null;
    }

    @Override // J7.e
    public final java.lang.reflect.Type l() {
        return this.f5799c;
    }

    @Override // J7.e
    public final java.util.List m() {
        return this.f5798b;
    }
}
