package p064g3;

/* JADX INFO: loaded from: classes.dex */
public final class N implements p004a3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p077h7.a f45477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p077h7.a f45478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p077h7.a f45479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p077h7.a f45480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p077h7.a f45481e;

    public N(p077h7.a aVar, p077h7.a aVar2, p077h7.a aVar3, p077h7.a aVar4, p077h7.a aVar5) {
        this.f45477a = aVar;
        this.f45478b = aVar2;
        this.f45479c = aVar3;
        this.f45480d = aVar4;
        this.f45481e = aVar5;
    }

    public static p064g3.N a(p077h7.a aVar, p077h7.a aVar2, p077h7.a aVar3, p077h7.a aVar4, p077h7.a aVar5) {
        return new p064g3.N(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static p064g3.M c(p084i3.a aVar, p084i3.a aVar2, java.lang.Object obj, java.lang.Object obj2, p077h7.a aVar3) {
        return new p064g3.M(aVar, aVar2, (p064g3.AbstractC6600e) obj, (p064g3.W) obj2, aVar3);
    }

    @Override // p077h7.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p064g3.M get() {
        return c((p084i3.a) this.f45477a.get(), (p084i3.a) this.f45478b.get(), this.f45479c.get(), this.f45480d.get(), this.f45481e);
    }
}
