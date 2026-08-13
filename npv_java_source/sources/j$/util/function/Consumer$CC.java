package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.Consumer$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Consumer$CC {
    public static java.util.function.Consumer $default$andThen(java.util.function.Consumer consumer, java.util.function.Consumer consumer2) {
        j$.util.Objects.requireNonNull(consumer2);
        return new j$.util.concurrent.t(3, consumer, consumer2);
    }
}
