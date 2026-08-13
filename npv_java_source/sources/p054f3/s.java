package p054f3;

/* JADX INFO: loaded from: classes.dex */
public final class s implements p004a3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p077h7.a f44993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p077h7.a f44994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p077h7.a f44995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p077h7.a f44996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p077h7.a f44997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p077h7.a f44998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p077h7.a f44999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p077h7.a f45000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p077h7.a f45001i;

    public s(p077h7.a aVar, p077h7.a aVar2, p077h7.a aVar3, p077h7.a aVar4, p077h7.a aVar5, p077h7.a aVar6, p077h7.a aVar7, p077h7.a aVar8, p077h7.a aVar9) {
        this.f44993a = aVar;
        this.f44994b = aVar2;
        this.f44995c = aVar3;
        this.f44996d = aVar4;
        this.f44997e = aVar5;
        this.f44998f = aVar6;
        this.f44999g = aVar7;
        this.f45000h = aVar8;
        this.f45001i = aVar9;
    }

    public static p054f3.s a(p077h7.a aVar, p077h7.a aVar2, p077h7.a aVar3, p077h7.a aVar4, p077h7.a aVar5, p077h7.a aVar6, p077h7.a aVar7, p077h7.a aVar8, p077h7.a aVar9) {
        return new p054f3.s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static p054f3.r c(android.content.Context context, Z2.e eVar, p064g3.InterfaceC6599d interfaceC6599d, p054f3.x xVar, java.util.concurrent.Executor executor, p074h3.b bVar, p084i3.a aVar, p084i3.a aVar2, p064g3.InterfaceC6598c interfaceC6598c) {
        return new p054f3.r(context, eVar, interfaceC6599d, xVar, executor, bVar, aVar, aVar2, interfaceC6598c);
    }

    @Override // p077h7.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p054f3.r get() {
        return c((android.content.Context) this.f44993a.get(), (Z2.e) this.f44994b.get(), (p064g3.InterfaceC6599d) this.f44995c.get(), (p054f3.x) this.f44996d.get(), (java.util.concurrent.Executor) this.f44997e.get(), (p074h3.b) this.f44998f.get(), (p084i3.a) this.f44999g.get(), (p084i3.a) this.f45000h.get(), (p064g3.InterfaceC6598c) this.f45001i.get());
    }
}
