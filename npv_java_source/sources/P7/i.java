package P7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i {
    public static final P7.g a(P7.g gVar, P7.g gVar2) {
        p247y7.AbstractC7350t.f(gVar, "first");
        p247y7.AbstractC7350t.f(gVar2, "second");
        if (gVar.isEmpty()) {
            return gVar2;
        }
        return gVar2.isEmpty() ? gVar : new P7.k(gVar, gVar2);
    }
}
