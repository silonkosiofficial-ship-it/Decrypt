package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public interface d0 extends j$.util.Spliterator {
    void forEachRemaining(java.lang.Object obj);

    boolean tryAdvance(java.lang.Object obj);

    @Override // j$.util.Spliterator
    j$.util.d0 trySplit();
}
