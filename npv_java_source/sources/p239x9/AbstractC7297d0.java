package p239x9;

/* JADX INFO: renamed from: x9.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7297d0 {
    public static final java.util.Map a() {
        java.util.Map mapC = p097j7.S.c();
        mapC.put(p247y7.P.b(java.lang.String.class), p209u9.a.F(p247y7.V.f57259a));
        mapC.put(p247y7.P.b(java.lang.Character.TYPE), p209u9.a.z(p247y7.C7338g.f57293a));
        mapC.put(p247y7.P.b(char[].class), p209u9.a.c());
        mapC.put(p247y7.P.b(java.lang.Double.TYPE), p209u9.a.A(p247y7.C7343l.f57302a));
        mapC.put(p247y7.P.b(double[].class), p209u9.a.d());
        mapC.put(p247y7.P.b(java.lang.Float.TYPE), p209u9.a.B(p247y7.C7344m.f57303a));
        mapC.put(p247y7.P.b(float[].class), p209u9.a.e());
        mapC.put(p247y7.P.b(java.lang.Long.TYPE), p209u9.a.D(p247y7.C7353w.f57308a));
        mapC.put(p247y7.P.b(long[].class), p209u9.a.h());
        mapC.put(p247y7.P.b(p087i7.G.class), p209u9.a.u(p087i7.G.f46710D));
        mapC.put(p247y7.P.b(java.lang.Integer.TYPE), p209u9.a.C(p247y7.C7349s.f57306a));
        mapC.put(p247y7.P.b(int[].class), p209u9.a.f());
        mapC.put(p247y7.P.b(p087i7.E.class), p209u9.a.t(p087i7.E.f46705D));
        mapC.put(p247y7.P.b(java.lang.Short.TYPE), p209u9.a.E(p247y7.T.f57257a));
        mapC.put(p247y7.P.b(short[].class), p209u9.a.k());
        mapC.put(p247y7.P.b(p087i7.J.class), p209u9.a.v(p087i7.J.f46716D));
        mapC.put(p247y7.P.b(java.lang.Byte.TYPE), p209u9.a.y(p247y7.C7336e.f57284a));
        mapC.put(p247y7.P.b(byte[].class), p209u9.a.b());
        mapC.put(p247y7.P.b(p087i7.C.class), p209u9.a.s(p087i7.C.f46700D));
        mapC.put(p247y7.P.b(java.lang.Boolean.TYPE), p209u9.a.x(p247y7.C7335d.f57283a));
        mapC.put(p247y7.P.b(boolean[].class), p209u9.a.a());
        mapC.put(p247y7.P.b(p087i7.M.class), p209u9.a.w(p087i7.M.f46721a));
        mapC.put(p247y7.P.b(java.lang.Void.class), p209u9.a.j());
        try {
            mapC.put(p247y7.P.b(T8.a.class), p209u9.a.q(T8.a.f13312D));
        } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError unused) {
        }
        try {
            mapC.put(p247y7.P.b(p087i7.H.class), p209u9.a.n());
        } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError unused2) {
        }
        try {
            mapC.put(p247y7.P.b(p087i7.F.class), p209u9.a.m());
        } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError unused3) {
        }
        try {
            mapC.put(p247y7.P.b(p087i7.K.class), p209u9.a.o());
        } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError unused4) {
        }
        try {
            mapC.put(p247y7.P.b(p087i7.D.class), p209u9.a.l());
        } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError unused5) {
        }
        try {
            mapC.put(p247y7.P.b(U8.b.class), p209u9.a.r(U8.b.f14617E));
        } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError unused6) {
        }
        return p097j7.S.b(mapC);
    }

    public static final java.lang.Object[] b(java.util.ArrayList arrayList, F7.c cVar) {
        p247y7.AbstractC7350t.f(arrayList, "<this>");
        p247y7.AbstractC7350t.f(cVar, "eClass");
        java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) p227w7.a.b(cVar), arrayList.size());
        p247y7.AbstractC7350t.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        java.lang.Object[] array = arrayList.toArray((java.lang.Object[]) objNewInstance);
        p247y7.AbstractC7350t.e(array, "toArray(...)");
        return array;
    }
}
