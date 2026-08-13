package p216v5;

/* JADX INFO: loaded from: classes3.dex */
public class d implements p226w5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F5.a f56010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f56011b = new java.util.concurrent.atomic.AtomicReference();

    public d(F5.a aVar) {
        this.f56010a = aVar;
        aVar.a(new F5.a.InterfaceC0063a() { // from class: v5.c
            @Override // F5.a.InterfaceC0063a
            public final void a(F5.b bVar) {
                this.f56009a.b(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(F5.b bVar) {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f56011b;
        androidx.appcompat.app.D.a(bVar.get());
        atomicReference.set(null);
    }
}
