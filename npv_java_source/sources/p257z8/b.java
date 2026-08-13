package p257z8;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends p257z8.a implements p257z8.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O7.InterfaceC1424e f57658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p138n8.f f57659d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(O7.InterfaceC1424e interfaceC1424e, F8.E e6, p138n8.f fVar, p257z8.g gVar) {
        super(e6, gVar);
        p247y7.AbstractC7350t.f(interfaceC1424e, "classDescriptor");
        p247y7.AbstractC7350t.f(e6, "receiverType");
        this.f57658c = interfaceC1424e;
        this.f57659d = fVar;
    }

    @Override // p257z8.f
    public p138n8.f a() {
        return this.f57659d;
    }

    public java.lang.String toString() {
        return getType() + ": Ctx { " + this.f57658c + " }";
    }
}
