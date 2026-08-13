package p216v5;

/* JADX INFO: loaded from: classes3.dex */
public class b implements p226w5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F5.a f56007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f56008b = new java.util.concurrent.atomic.AtomicReference();

    public b(F5.a aVar) {
        this.f56007a = aVar;
        aVar.a(new F5.a.InterfaceC0063a() { // from class: v5.a
            @Override // F5.a.InterfaceC0063a
            public final void a(F5.b bVar) {
                this.f56006a.b(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(F5.b bVar) {
        this.f56008b.set((p006a5.a) bVar.get());
    }
}
