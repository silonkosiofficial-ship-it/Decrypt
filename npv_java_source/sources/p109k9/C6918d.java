package p109k9;

/* JADX INFO: renamed from: k9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6918d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f49841a = new java.util.ArrayList();

    public final void a(p109k9.o oVar) {
        p247y7.AbstractC7350t.f(oVar, "format");
        if (oVar instanceof p109k9.s) {
            this.f49841a.add(oVar);
        } else if (oVar instanceof p109k9.h) {
            java.util.Iterator it = ((p109k9.h) oVar).c().iterator();
            while (it.hasNext()) {
                this.f49841a.add((p109k9.s) it.next());
            }
        }
    }

    public final p109k9.h b() {
        return new p109k9.h(this.f49841a);
    }
}
