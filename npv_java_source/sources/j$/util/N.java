package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public interface N extends j$.util.O {
    @Override // java.util.Iterator, j$.util.InterfaceC6856x
    void forEachRemaining(java.util.function.Consumer consumer);

    void forEachRemaining(java.util.function.LongConsumer longConsumer);

    @Override // java.util.Iterator
    java.lang.Long next();

    long nextLong();
}
