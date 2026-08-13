package p258z9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Set f57739a = p097j7.Z.g(p209u9.a.t(p087i7.E.f46705D).a(), p209u9.a.u(p087i7.G.f46710D).a(), p209u9.a.s(p087i7.C.f46700D).a(), p209u9.a.v(p087i7.J.f46716D).a());

    public static final boolean a(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "<this>");
        return fVar.m() && p247y7.AbstractC7350t.b(fVar, p249y9.j.h());
    }

    public static final boolean b(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "<this>");
        return fVar.m() && f57739a.contains(fVar);
    }
}
