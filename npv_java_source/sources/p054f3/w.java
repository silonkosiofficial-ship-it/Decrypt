package p054f3;

/* JADX INFO: loaded from: classes.dex */
public final class w implements p004a3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p077h7.a f45008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p077h7.a f45009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p077h7.a f45010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p077h7.a f45011d;

    public w(p077h7.a aVar, p077h7.a aVar2, p077h7.a aVar3, p077h7.a aVar4) {
        this.f45008a = aVar;
        this.f45009b = aVar2;
        this.f45010c = aVar3;
        this.f45011d = aVar4;
    }

    public static p054f3.w a(p077h7.a aVar, p077h7.a aVar2, p077h7.a aVar3, p077h7.a aVar4) {
        return new p054f3.w(aVar, aVar2, aVar3, aVar4);
    }

    public static p054f3.v c(java.util.concurrent.Executor executor, p064g3.InterfaceC6599d interfaceC6599d, p054f3.x xVar, p074h3.b bVar) {
        return new p054f3.v(executor, interfaceC6599d, xVar, bVar);
    }

    @Override // p077h7.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p054f3.v get() {
        return c((java.util.concurrent.Executor) this.f45008a.get(), (p064g3.InterfaceC6599d) this.f45009b.get(), (p054f3.x) this.f45010c.get(), (p074h3.b) this.f45011d.get());
    }
}
