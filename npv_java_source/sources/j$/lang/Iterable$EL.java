package j$.lang;

/* JADX INFO: renamed from: j$.lang.Iterable$-EL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Iterable$EL {
    public static void forEach(java.lang.Iterable iterable, java.util.function.Consumer consumer) {
        if (iterable instanceof j$.lang.a) {
            ((j$.lang.a) iterable).forEach(consumer);
            return;
        }
        if (!(iterable instanceof java.util.Collection)) {
            j$.lang.Iterable$CC.$default$forEach(iterable, consumer);
            return;
        }
        j$.util.Objects.requireNonNull(consumer);
        java.util.Iterator it = ((java.util.Collection) iterable).iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}
