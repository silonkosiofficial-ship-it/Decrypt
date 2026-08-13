package p044e3;

/* JADX INFO: loaded from: classes.dex */
public final class d implements p004a3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p077h7.a f44658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p077h7.a f44659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p077h7.a f44660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p077h7.a f44661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p077h7.a f44662e;

    public d(p077h7.a aVar, p077h7.a aVar2, p077h7.a aVar3, p077h7.a aVar4, p077h7.a aVar5) {
        this.f44658a = aVar;
        this.f44659b = aVar2;
        this.f44660c = aVar3;
        this.f44661d = aVar4;
        this.f44662e = aVar5;
    }

    public static p044e3.d a(p077h7.a aVar, p077h7.a aVar2, p077h7.a aVar3, p077h7.a aVar4, p077h7.a aVar5) {
        return new p044e3.d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static p044e3.c c(java.util.concurrent.Executor executor, Z2.e eVar, p054f3.x xVar, p064g3.InterfaceC6599d interfaceC6599d, p074h3.b bVar) {
        return new p044e3.c(executor, eVar, xVar, interfaceC6599d, bVar);
    }

    @Override // p077h7.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p044e3.c get() {
        return c((java.util.concurrent.Executor) this.f44658a.get(), (Z2.e) this.f44659b.get(), (p054f3.x) this.f44660c.get(), (p064g3.InterfaceC6599d) this.f44661d.get(), (p074h3.b) this.f44662e.get());
    }
}
