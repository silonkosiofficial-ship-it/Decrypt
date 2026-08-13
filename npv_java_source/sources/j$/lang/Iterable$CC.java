package j$.lang;

/* JADX INFO: renamed from: j$.lang.Iterable$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Iterable$CC {
    public static void $default$forEach(java.lang.Iterable iterable, java.util.function.Consumer consumer) {
        j$.util.Objects.requireNonNull(consumer);
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}
