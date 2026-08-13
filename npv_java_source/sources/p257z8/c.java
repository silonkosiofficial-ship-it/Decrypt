package p257z8;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends p257z8.a implements p257z8.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O7.InterfaceC1420a f57660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p138n8.f f57661d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(O7.InterfaceC1420a interfaceC1420a, F8.E e6, p138n8.f fVar, p257z8.g gVar) {
        super(e6, gVar);
        p247y7.AbstractC7350t.f(interfaceC1420a, "declarationDescriptor");
        p247y7.AbstractC7350t.f(e6, "receiverType");
        this.f57660c = interfaceC1420a;
        this.f57661d = fVar;
    }

    @Override // p257z8.f
    public p138n8.f a() {
        return this.f57661d;
    }

    public O7.InterfaceC1420a c() {
        return this.f57660c;
    }

    public java.lang.String toString() {
        return "Cxt { " + c() + " }";
    }
}
