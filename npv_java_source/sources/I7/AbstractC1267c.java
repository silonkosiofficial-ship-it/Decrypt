package I7;

/* JADX INFO: renamed from: I7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1267c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final I7.AbstractC1265a f5342a = I7.AbstractC1266b.a(I7.AbstractC1267c.d.f5350D);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final I7.AbstractC1265a f5343b = I7.AbstractC1266b.a(I7.AbstractC1267c.e.f5351D);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final I7.AbstractC1265a f5344c = I7.AbstractC1266b.a(I7.AbstractC1267c.a.f5347D);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final I7.AbstractC1265a f5345d = I7.AbstractC1266b.a(I7.AbstractC1267c.C0123c.f5349D);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final I7.AbstractC1265a f5346e = I7.AbstractC1266b.a(I7.AbstractC1267c.b.f5348D);

    /* JADX INFO: renamed from: I7.c$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final I7.AbstractC1267c.a f5347D = new I7.AbstractC1267c.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F7.o l(java.lang.Class cls) {
            p247y7.AbstractC7350t.f(cls, "it");
            return G7.c.b(I7.AbstractC1267c.c(cls), p097j7.AbstractC6879v.m(), false, p097j7.AbstractC6879v.m());
        }
    }

    /* JADX INFO: renamed from: I7.c$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final I7.AbstractC1267c.b f5348D = new I7.AbstractC1267c.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j$.util.concurrent.ConcurrentHashMap l(java.lang.Class cls) {
            p247y7.AbstractC7350t.f(cls, "it");
            return new j$.util.concurrent.ConcurrentHashMap();
        }
    }

    /* JADX INFO: renamed from: I7.c$c, reason: collision with other inner class name */
    static final class C0123c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final I7.AbstractC1267c.C0123c f5349D = new I7.AbstractC1267c.C0123c();

        C0123c() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F7.o l(java.lang.Class cls) {
            p247y7.AbstractC7350t.f(cls, "it");
            return G7.c.b(I7.AbstractC1267c.c(cls), p097j7.AbstractC6879v.m(), true, p097j7.AbstractC6879v.m());
        }
    }

    /* JADX INFO: renamed from: I7.c$d */
    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final I7.AbstractC1267c.d f5350D = new I7.AbstractC1267c.d();

        d() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I7.C1275k l(java.lang.Class cls) {
            p247y7.AbstractC7350t.f(cls, "it");
            return new I7.C1275k(cls);
        }
    }

    /* JADX INFO: renamed from: I7.c$e */
    static final class e extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final I7.AbstractC1267c.e f5351D = new I7.AbstractC1267c.e();

        e() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I7.t l(java.lang.Class cls) {
            p247y7.AbstractC7350t.f(cls, "it");
            return new I7.t(cls);
        }
    }

    public static final F7.o a(java.lang.Class cls, java.util.List list, boolean z6) {
        p247y7.AbstractC7350t.f(cls, "jClass");
        p247y7.AbstractC7350t.f(list, "arguments");
        if (list.isEmpty()) {
            return (F7.o) (z6 ? f5345d : f5344c).a(cls);
        }
        return b(cls, list, z6);
    }

    private static final F7.o b(java.lang.Class cls, java.util.List list, boolean z6) {
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = (j$.util.concurrent.ConcurrentHashMap) f5346e.a(cls);
        p087i7.u uVarA = p087i7.B.a(list, java.lang.Boolean.valueOf(z6));
        java.lang.Object obj = concurrentHashMap.get(uVarA);
        if (obj == null) {
            F7.o oVarB = G7.c.b(c(cls), list, z6, p097j7.AbstractC6879v.m());
            java.lang.Object objPutIfAbsent = concurrentHashMap.putIfAbsent(uVarA, oVarB);
            obj = objPutIfAbsent == null ? oVarB : objPutIfAbsent;
        }
        p247y7.AbstractC7350t.e(obj, "getOrPut(...)");
        return (F7.o) obj;
    }

    public static final I7.C1275k c(java.lang.Class cls) {
        p247y7.AbstractC7350t.f(cls, "jClass");
        java.lang.Object objA = f5342a.a(cls);
        p247y7.AbstractC7350t.d(objA, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (I7.C1275k) objA;
    }

    public static final F7.e d(java.lang.Class cls) {
        p247y7.AbstractC7350t.f(cls, "jClass");
        return (F7.e) f5343b.a(cls);
    }
}
