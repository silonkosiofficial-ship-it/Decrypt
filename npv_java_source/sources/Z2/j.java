package Z2;

/* JADX INFO: loaded from: classes.dex */
public final class j implements p004a3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p077h7.a f16690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p077h7.a f16691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p077h7.a f16692c;

    public j(p077h7.a aVar, p077h7.a aVar2, p077h7.a aVar3) {
        this.f16690a = aVar;
        this.f16691b = aVar2;
        this.f16692c = aVar3;
    }

    public static Z2.j a(p077h7.a aVar, p077h7.a aVar2, p077h7.a aVar3) {
        return new Z2.j(aVar, aVar2, aVar3);
    }

    public static Z2.i c(android.content.Context context, p084i3.a aVar, p084i3.a aVar2) {
        return new Z2.i(context, aVar, aVar2);
    }

    @Override // p077h7.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Z2.i get() {
        return c((android.content.Context) this.f16690a.get(), (p084i3.a) this.f16691b.get(), (p084i3.a) this.f16692c.get());
    }
}
