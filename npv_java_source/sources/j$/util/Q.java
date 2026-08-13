package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class Q {
    public static void a(j$.util.U u6, java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.DoubleConsumer) {
            u6.forEachRemaining((java.util.function.DoubleConsumer) consumer);
        } else {
            if (j$.util.t0.f48607a) {
                j$.util.t0.a(u6.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            j$.util.Objects.requireNonNull(consumer);
            u6.forEachRemaining((java.util.function.DoubleConsumer) new j$.util.C(consumer));
        }
    }

    public static void b(j$.util.X x6, java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.IntConsumer) {
            x6.forEachRemaining((java.util.function.IntConsumer) consumer);
        } else {
            if (j$.util.t0.f48607a) {
                j$.util.t0.a(x6.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            j$.util.Objects.requireNonNull(consumer);
            x6.forEachRemaining((java.util.function.IntConsumer) new j$.util.G(consumer));
        }
    }

    public static void c(j$.util.a0 a0Var, java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.LongConsumer) {
            a0Var.forEachRemaining((java.util.function.LongConsumer) consumer);
        } else {
            if (j$.util.t0.f48607a) {
                j$.util.t0.a(a0Var.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            j$.util.Objects.requireNonNull(consumer);
            a0Var.forEachRemaining((java.util.function.LongConsumer) new j$.util.K(consumer));
        }
    }

    public static long d(j$.util.Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean e(j$.util.Spliterator spliterator, int i6) {
        return (spliterator.characteristics() & i6) == i6;
    }

    public static boolean f(j$.util.U u6, java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.DoubleConsumer) {
            return u6.tryAdvance((java.util.function.DoubleConsumer) consumer);
        }
        if (j$.util.t0.f48607a) {
            j$.util.t0.a(u6.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        j$.util.Objects.requireNonNull(consumer);
        return u6.tryAdvance((java.util.function.DoubleConsumer) new j$.util.C(consumer));
    }

    public static boolean g(j$.util.X x6, java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.IntConsumer) {
            return x6.tryAdvance((java.util.function.IntConsumer) consumer);
        }
        if (j$.util.t0.f48607a) {
            j$.util.t0.a(x6.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        j$.util.Objects.requireNonNull(consumer);
        return x6.tryAdvance((java.util.function.IntConsumer) new j$.util.G(consumer));
    }

    public static boolean h(j$.util.a0 a0Var, java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.LongConsumer) {
            return a0Var.tryAdvance((java.util.function.LongConsumer) consumer);
        }
        if (j$.util.t0.f48607a) {
            j$.util.t0.a(a0Var.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        j$.util.Objects.requireNonNull(consumer);
        return a0Var.tryAdvance((java.util.function.LongConsumer) new j$.util.K(consumer));
    }

    public static j$.util.Optional i(java.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? j$.util.Optional.of(optional.get()) : j$.util.Optional.empty();
    }

    public static j$.util.C6858z j(java.util.OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        return optionalDouble.isPresent() ? j$.util.C6858z.d(optionalDouble.getAsDouble()) : j$.util.C6858z.a();
    }

    public static j$.util.A k(java.util.OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? j$.util.A.d(optionalInt.getAsInt()) : j$.util.A.a();
    }

    public static j$.util.B l(java.util.OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? j$.util.B.d(optionalLong.getAsLong()) : j$.util.B.a();
    }

    public static java.util.Optional m(j$.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.b() ? java.util.Optional.of(optional.a()) : java.util.Optional.empty();
    }

    public static java.util.OptionalDouble n(j$.util.C6858z c6858z) {
        if (c6858z == null) {
            return null;
        }
        return c6858z.c() ? java.util.OptionalDouble.of(c6858z.b()) : java.util.OptionalDouble.empty();
    }

    public static java.util.OptionalInt o(j$.util.A a6) {
        if (a6 == null) {
            return null;
        }
        return a6.c() ? java.util.OptionalInt.of(a6.b()) : java.util.OptionalInt.empty();
    }

    public static java.util.OptionalLong p(j$.util.B b6) {
        if (b6 == null) {
            return null;
        }
        return b6.c() ? java.util.OptionalLong.of(b6.b()) : java.util.OptionalLong.empty();
    }

    public static void q(java.util.Iterator it, java.util.function.Consumer consumer) {
        if (it instanceof j$.util.InterfaceC6856x) {
            ((j$.util.InterfaceC6856x) it).forEachRemaining(consumer);
            return;
        }
        j$.util.Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static /* synthetic */ void r(java.util.List list, java.util.Comparator comparator) {
        if (list instanceof j$.util.List) {
            ((j$.util.List) list).sort(comparator);
        } else {
            j$.util.List.CC.$default$sort(list, comparator);
        }
    }

    public static /* synthetic */ java.util.Comparator s(java.util.Comparator comparator, java.util.Comparator comparator2) {
        return comparator instanceof j$.util.Comparator ? ((j$.util.Comparator) comparator).thenComparing(comparator2) : j$.util.Comparator.CC.$default$thenComparing(comparator, comparator2);
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(java.lang.Object obj) {
        j$.util.Objects.requireNonNull(obj);
    }

    public boolean tryAdvance(java.lang.Object obj) {
        j$.util.Objects.requireNonNull(obj);
        return false;
    }

    public j$.util.Spliterator trySplit() {
        return null;
    }
}
