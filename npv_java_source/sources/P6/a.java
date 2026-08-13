package P6;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f8336a = new java.util.ArrayList();

    public final void a(java.lang.String str, byte[] bArr, T6.InterfaceC1668p interfaceC1668p) {
        p247y7.AbstractC7350t.f(str, "key");
        p247y7.AbstractC7350t.f(bArr, "value");
        p247y7.AbstractC7350t.f(interfaceC1668p, "headers");
        this.f8336a.add(new P6.k(str, bArr, interfaceC1668p));
    }

    public final java.util.List b() {
        return this.f8336a;
    }
}
