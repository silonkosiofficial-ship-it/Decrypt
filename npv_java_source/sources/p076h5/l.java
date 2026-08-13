package p076h5;

/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F5.a f46506a;

    public l(F5.a aVar) {
        this.f46506a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(p076h5.e eVar, F5.b bVar) {
        ((P5.a) bVar.get()).a("firebase", eVar);
        p076h5.g.f().b("Registering RemoteConfig Rollouts subscriber");
    }

    public void c(p126m5.n nVar) {
        if (nVar == null) {
            p076h5.g.f().k("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final p076h5.e eVar = new p076h5.e(nVar);
            this.f46506a.a(new F5.a.InterfaceC0063a() { // from class: h5.k
                @Override // F5.a.InterfaceC0063a
                public final void a(F5.b bVar) {
                    p076h5.l.b(eVar, bVar);
                }
            });
        }
    }
}
