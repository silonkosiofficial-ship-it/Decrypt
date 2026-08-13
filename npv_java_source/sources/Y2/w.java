package Y2;

/* JADX INFO: loaded from: classes.dex */
public final class w implements p004a3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p077h7.a f16343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p077h7.a f16344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p077h7.a f16345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p077h7.a f16346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p077h7.a f16347e;

    public w(p077h7.a aVar, p077h7.a aVar2, p077h7.a aVar3, p077h7.a aVar4, p077h7.a aVar5) {
        this.f16343a = aVar;
        this.f16344b = aVar2;
        this.f16345c = aVar3;
        this.f16346d = aVar4;
        this.f16347e = aVar5;
    }

    public static Y2.w a(p077h7.a aVar, p077h7.a aVar2, p077h7.a aVar3, p077h7.a aVar4, p077h7.a aVar5) {
        return new Y2.w(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static Y2.u c(p084i3.a aVar, p084i3.a aVar2, p044e3.e eVar, p054f3.r rVar, p054f3.v vVar) {
        return new Y2.u(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // p077h7.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Y2.u get() {
        return c((p084i3.a) this.f16343a.get(), (p084i3.a) this.f16344b.get(), (p044e3.e) this.f16345c.get(), (p054f3.r) this.f16346d.get(), (p054f3.v) this.f16347e.get());
    }
}
