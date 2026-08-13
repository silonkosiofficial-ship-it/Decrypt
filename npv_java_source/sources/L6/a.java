package L6;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends D6.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C6.c cVar, p237x7.a aVar, D6.b bVar, T6.InterfaceC1668p interfaceC1668p) {
        super(cVar);
        p247y7.AbstractC7350t.f(cVar, "client");
        p247y7.AbstractC7350t.f(aVar, "block");
        p247y7.AbstractC7350t.f(bVar, "originCall");
        p247y7.AbstractC7350t.f(interfaceC1668p, "responseHeaders");
        h(new L6.c(this, bVar.d()));
        i(new L6.d(this, aVar, bVar.e(), interfaceC1668p));
    }

    public /* synthetic */ a(C6.c cVar, p237x7.a aVar, D6.b bVar, T6.InterfaceC1668p interfaceC1668p, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(cVar, aVar, bVar, (i6 & 8) != 0 ? bVar.e().a() : interfaceC1668p);
    }
}
