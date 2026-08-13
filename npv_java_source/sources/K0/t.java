package K0;

/* JADX INFO: loaded from: classes.dex */
public final class t extends p247y7.AbstractC7352v implements p237x7.p {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final K0.t f6071D = new K0.t();

    public t() {
        super(2);
    }

    @Override // p237x7.p
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K0.a u(K0.a aVar, K0.a aVar2) {
        java.lang.String strB;
        p087i7.InterfaceC6663i interfaceC6663iA;
        if (aVar == null || (strB = aVar.b()) == null) {
            strB = aVar2.b();
        }
        if (aVar == null || (interfaceC6663iA = aVar.a()) == null) {
            interfaceC6663iA = aVar2.a();
        }
        return new K0.a(strB, interfaceC6663iA);
    }
}
