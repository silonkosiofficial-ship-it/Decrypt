package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class Z1 extends j$.util.stream.AbstractC6730a2 {
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        this.f48405b++;
    }

    @Override // j$.util.stream.U1
    public final void f(j$.util.stream.U1 u6) {
        this.f48405b += ((j$.util.stream.AbstractC6730a2) u6).f48405b;
    }

    @Override // j$.util.stream.V1, java.util.function.Supplier
    public final java.lang.Object get() {
        return java.lang.Long.valueOf(this.f48405b);
    }
}
