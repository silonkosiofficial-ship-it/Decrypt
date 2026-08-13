package p044e3;

/* JADX INFO: loaded from: classes.dex */
public final class i implements p004a3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p077h7.a f44664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p077h7.a f44665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p077h7.a f44666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p077h7.a f44667d;

    public i(p077h7.a aVar, p077h7.a aVar2, p077h7.a aVar3, p077h7.a aVar4) {
        this.f44664a = aVar;
        this.f44665b = aVar2;
        this.f44666c = aVar3;
        this.f44667d = aVar4;
    }

    public static p044e3.i a(p077h7.a aVar, p077h7.a aVar2, p077h7.a aVar3, p077h7.a aVar4) {
        return new p044e3.i(aVar, aVar2, aVar3, aVar4);
    }

    public static p054f3.x c(android.content.Context context, p064g3.InterfaceC6599d interfaceC6599d, p054f3.f fVar, p084i3.a aVar) {
        return (p054f3.x) p004a3.d.d(p044e3.h.a(context, interfaceC6599d, fVar, aVar));
    }

    @Override // p077h7.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p054f3.x get() {
        return c((android.content.Context) this.f44664a.get(), (p064g3.InterfaceC6599d) this.f44665b.get(), (p054f3.f) this.f44666c.get(), (p084i3.a) this.f44667d.get());
    }
}
