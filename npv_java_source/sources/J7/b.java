package J7;

/* JADX INFO: loaded from: classes2.dex */
class b implements java.lang.reflect.InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Class f5774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f5775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f5776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f5777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.List f5778e;

    public b(java.lang.Class cls, java.util.Map map, p087i7.InterfaceC6668n interfaceC6668n, p087i7.InterfaceC6668n interfaceC6668n2, java.util.List list) {
        this.f5774a = cls;
        this.f5775b = map;
        this.f5776c = interfaceC6668n;
        this.f5777d = interfaceC6668n2;
        this.f5778e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        return J7.c.i(this.f5774a, this.f5775b, this.f5776c, this.f5777d, this.f5778e, obj, method, objArr);
    }
}
