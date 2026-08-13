package p258z9;

/* JADX INFO: renamed from: z9.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7412z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f57781a = p258z9.AbstractC7411y.a(16);

    /* JADX INFO: renamed from: z9.z$a */
    public static final class a {
    }

    public final java.lang.Object a(p219v9.f fVar, p258z9.C7412z.a aVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        p247y7.AbstractC7350t.f(aVar, "key");
        java.util.Map map = (java.util.Map) this.f57781a.get(fVar);
        java.lang.Object obj = map != null ? map.get(aVar) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final java.lang.Object b(p219v9.f fVar, p258z9.C7412z.a aVar, p237x7.a aVar2) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        p247y7.AbstractC7350t.f(aVar, "key");
        p247y7.AbstractC7350t.f(aVar2, "defaultValue");
        java.lang.Object objA = a(fVar, aVar);
        if (objA != null) {
            return objA;
        }
        java.lang.Object objB = aVar2.b();
        c(fVar, aVar, objB);
        return objB;
    }

    public final void c(p219v9.f fVar, p258z9.C7412z.a aVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        p247y7.AbstractC7350t.f(aVar, "key");
        p247y7.AbstractC7350t.f(obj, "value");
        java.util.Map map = this.f57781a;
        java.lang.Object objA = map.get(fVar);
        if (objA == null) {
            objA = p258z9.AbstractC7411y.a(2);
            map.put(fVar, objA);
        }
        ((java.util.Map) objA).put(aVar, obj);
    }
}
