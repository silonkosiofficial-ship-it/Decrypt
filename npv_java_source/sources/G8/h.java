package G8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final O7.F f3137a = new O7.F("KotlinTypeRefiner");

    public static final O7.F a() {
        return f3137a;
    }

    public static final java.util.List b(G8.g gVar, java.lang.Iterable iterable) {
        p247y7.AbstractC7350t.f(gVar, "<this>");
        p247y7.AbstractC7350t.f(iterable, "types");
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(gVar.a((F8.E) it.next()));
        }
        return arrayList;
    }
}
