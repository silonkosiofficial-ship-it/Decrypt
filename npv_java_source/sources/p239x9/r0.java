package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Map f57034a = p239x9.AbstractC7297d0.a();

    public static final p219v9.f a(java.lang.String str, p219v9.d dVar) {
        p247y7.AbstractC7350t.f(str, "serialName");
        p247y7.AbstractC7350t.f(dVar, "kind");
        b(str);
        return new p239x9.C7323q0(str, dVar);
    }

    public static final void b(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "serialName");
        for (p199t9.b bVar : f57034a.values()) {
            if (p247y7.AbstractC7350t.b(str, bVar.a().a())) {
                throw new java.lang.IllegalArgumentException(S8.r.o("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exists " + p247y7.P.b(bVar.getClass()).c() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
