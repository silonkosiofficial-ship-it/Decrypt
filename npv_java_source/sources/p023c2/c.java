package p023c2;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f24407a = new java.util.LinkedHashMap();

    public final void a(F7.c cVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(cVar, "clazz");
        p247y7.AbstractC7350t.f(lVar, "initializer");
        if (!this.f24407a.containsKey(cVar)) {
            this.f24407a.put(cVar, new p023c2.f(cVar, lVar));
            return;
        }
        throw new java.lang.IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + p043e2.h.a(cVar) + '.').toString());
    }

    public final androidx.lifecycle.V.c b() {
        return p043e2.g.f44643a.a(this.f24407a.values());
    }
}
