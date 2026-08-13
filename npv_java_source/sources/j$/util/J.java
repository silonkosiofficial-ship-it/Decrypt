package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public interface J extends j$.util.O {
    @Override // java.util.Iterator, j$.util.InterfaceC6856x
    void forEachRemaining(java.util.function.Consumer consumer);

    void forEachRemaining(java.util.function.IntConsumer intConsumer);

    @Override // java.util.Iterator
    java.lang.Integer next();

    int nextInt();
}
