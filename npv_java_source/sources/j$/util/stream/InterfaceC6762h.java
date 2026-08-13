package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC6762h extends java.lang.AutoCloseable {
    boolean isParallel();

    java.util.Iterator iterator();

    j$.util.stream.InterfaceC6762h onClose(java.lang.Runnable runnable);

    j$.util.stream.InterfaceC6762h parallel();

    j$.util.stream.InterfaceC6762h sequential();

    j$.util.Spliterator spliterator();

    j$.util.stream.InterfaceC6762h unordered();
}
