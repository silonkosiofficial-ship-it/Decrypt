package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public interface Collection<E> extends j$.lang.a {

    /* JADX INFO: renamed from: j$.util.Collection$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static j$.util.stream.Stream $default$parallelStream(java.util.Collection collection) {
            return j$.util.stream.AbstractC6845y0.f0(j$.util.Collection.EL.c(collection), true);
        }

        public static boolean $default$removeIf(java.util.Collection collection, java.util.function.Predicate predicate) {
            j$.util.Objects.requireNonNull(predicate);
            java.util.Iterator<E> it = collection.iterator();
            boolean z6 = false;
            while (it.hasNext()) {
                if (predicate.test(it.next())) {
                    it.remove();
                    z6 = true;
                }
            }
            return z6;
        }

        public static j$.util.Spliterator $default$spliterator(java.util.Collection collection) {
            return j$.util.Spliterators.spliterator(collection, 0);
        }

        public static j$.util.stream.Stream $default$stream(java.util.Collection collection) {
            return j$.util.stream.AbstractC6845y0.f0(j$.util.Collection.EL.c(collection), false);
        }
    }

    /* JADX INFO: renamed from: j$.util.Collection$-EL, reason: invalid class name */
    public final /* synthetic */ class EL {
        public static void a(java.util.Collection collection, java.util.function.Consumer consumer) {
            if (collection instanceof j$.util.Collection) {
                ((j$.util.Collection) collection).forEach(consumer);
                return;
            }
            j$.util.Objects.requireNonNull(consumer);
            java.util.Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                consumer.accept(it.next());
            }
        }

        public static /* synthetic */ j$.util.stream.Stream b(java.util.Collection collection) {
            return collection instanceof j$.util.Collection ? ((j$.util.Collection) collection).parallelStream() : j$.util.Collection.CC.$default$parallelStream(collection);
        }

        public static j$.util.Spliterator c(java.util.Collection collection) {
            if (collection instanceof j$.util.Collection) {
                return ((j$.util.Collection) collection).spliterator();
            }
            if (collection instanceof java.util.LinkedHashSet) {
                return j$.util.Spliterators.spliterator((java.util.LinkedHashSet) collection, 17);
            }
            if (collection instanceof java.util.SortedSet) {
                java.util.SortedSet sortedSet = (java.util.SortedSet) collection;
                return new j$.util.P(sortedSet, sortedSet);
            }
            if (collection instanceof java.util.Set) {
                return j$.util.Spliterators.spliterator((java.util.Set) collection, 1);
            }
            return collection instanceof java.util.List ? j$.util.List.CC.$default$spliterator((java.util.List) collection) : j$.util.Collection.CC.$default$spliterator(collection);
        }

        public static /* synthetic */ j$.util.stream.Stream stream(java.util.Collection collection) {
            return collection instanceof j$.util.Collection ? ((j$.util.Collection) collection).stream() : j$.util.Collection.CC.$default$stream(collection);
        }
    }

    @Override // j$.util.Collection, j$.lang.a
    void forEach(java.util.function.Consumer<? super E> consumer);

    j$.util.stream.Stream<E> parallelStream();

    boolean removeIf(java.util.function.Predicate<? super E> predicate);

    j$.util.Spliterator<E> spliterator();

    j$.util.stream.Stream<E> stream();

    <T> T[] toArray(java.util.function.IntFunction<T[]> intFunction);
}
