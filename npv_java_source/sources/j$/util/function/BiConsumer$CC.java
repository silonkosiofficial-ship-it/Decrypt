package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.BiConsumer$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class BiConsumer$CC {
    public static java.util.function.BiConsumer $default$andThen(java.util.function.BiConsumer biConsumer, java.util.function.BiConsumer biConsumer2) {
        j$.util.Objects.requireNonNull(biConsumer2);
        return new j$.util.concurrent.t(1, biConsumer, biConsumer2);
    }
}
