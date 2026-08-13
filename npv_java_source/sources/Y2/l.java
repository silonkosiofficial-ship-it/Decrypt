package Y2;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static void a(W2.h hVar, W2.e eVar) {
        if (!(hVar instanceof Y2.s)) {
            p024c3.a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", hVar);
        } else {
            Y2.u.c().e().u(((Y2.s) hVar).d().f(eVar), 1);
        }
    }
}
