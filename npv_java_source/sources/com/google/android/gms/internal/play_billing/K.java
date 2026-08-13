package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j$.util.stream.Collector f41426a = j$.util.stream.Collector.CC.of(new java.util.function.Supplier() { // from class: com.google.android.gms.internal.play_billing.y
        @Override // java.util.function.Supplier
        public final java.lang.Object get() {
            return new com.google.android.gms.internal.play_billing.C6182a0(4);
        }
    }, new java.util.function.BiConsumer() { // from class: com.google.android.gms.internal.play_billing.B
        @Override // java.util.function.BiConsumer
        public final void accept(java.lang.Object obj, java.lang.Object obj2) {
            ((com.google.android.gms.internal.play_billing.C6182a0) obj).e(obj2);
        }

        public /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
            return j$.util.function.BiConsumer$CC.$default$andThen(this, biConsumer);
        }
    }, new java.util.function.BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.C
        public /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
            return j$.util.function.BiFunction$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.BiFunction
        public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
            com.google.android.gms.internal.play_billing.C6182a0 c6182a0 = (com.google.android.gms.internal.play_billing.C6182a0) obj;
            com.google.android.gms.internal.play_billing.C6182a0 c6182a1 = (com.google.android.gms.internal.play_billing.C6182a0) obj2;
            c6182a0.c(c6182a1.f41495a, c6182a1.f41496b);
            return c6182a0;
        }
    }, new java.util.function.Function() { // from class: com.google.android.gms.internal.play_billing.D
        public /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
            return j$.util.function.Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            return ((com.google.android.gms.internal.play_billing.C6182a0) obj).f();
        }

        public /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
            return j$.util.function.Function$CC.$default$compose(this, function);
        }
    }, new j$.util.stream.Collector.Characteristics[0]);

    static {
        j$.util.stream.Collector.CC.of(new java.util.function.Supplier() { // from class: com.google.android.gms.internal.play_billing.E
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return new com.google.android.gms.internal.play_billing.C6242k0();
            }
        }, new java.util.function.BiConsumer() { // from class: com.google.android.gms.internal.play_billing.F
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.play_billing.C6242k0) obj).e(obj2);
            }

            public /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
                return j$.util.function.BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.G
            public /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
                return j$.util.function.BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.play_billing.C6242k0 c6242k0 = (com.google.android.gms.internal.play_billing.C6242k0) obj;
                com.google.android.gms.internal.play_billing.C6242k0 c6242k1 = (com.google.android.gms.internal.play_billing.C6242k0) obj2;
                c6242k0.c(c6242k1.f41495a, c6242k1.f41496b);
                return c6242k0;
            }
        }, new java.util.function.Function() { // from class: com.google.android.gms.internal.play_billing.H
            public /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return j$.util.function.Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                com.google.android.gms.internal.play_billing.C6242k0 c6242k0 = (com.google.android.gms.internal.play_billing.C6242k0) obj;
                int i6 = c6242k0.f41496b;
                if (i6 == 0) {
                    return com.google.android.gms.internal.play_billing.H0.f41411K;
                }
                if (i6 == 1) {
                    java.lang.Object obj2 = c6242k0.f41495a[0];
                    j$.util.Objects.requireNonNull(obj2);
                    return new com.google.android.gms.internal.play_billing.K0(obj2);
                }
                com.google.android.gms.internal.play_billing.AbstractC6248l0 abstractC6248l0E = com.google.android.gms.internal.play_billing.AbstractC6248l0.E(i6, c6242k0.f41495a);
                c6242k0.f41496b = abstractC6248l0E.size();
                c6242k0.f41497c = true;
                return abstractC6248l0E;
            }

            public /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return j$.util.function.Function$CC.$default$compose(this, function);
            }
        }, new j$.util.stream.Collector.Characteristics[0]);
        j$.util.stream.Collector.CC.of(new java.util.function.Supplier() { // from class: com.google.android.gms.internal.play_billing.I
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return new com.google.android.gms.internal.play_billing.C6230i0();
            }
        }, new java.util.function.BiConsumer() { // from class: com.google.android.gms.internal.play_billing.J
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.play_billing.C6230i0) obj).a((com.google.android.gms.internal.play_billing.C6325y0) obj2);
            }

            public /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
                return j$.util.function.BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new java.util.function.BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.z
            public /* synthetic */ java.util.function.BiFunction andThen(java.util.function.Function function) {
                return j$.util.function.BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.play_billing.C6230i0 c6230i0 = (com.google.android.gms.internal.play_billing.C6230i0) obj;
                c6230i0.b((com.google.android.gms.internal.play_billing.C6230i0) obj2);
                return c6230i0;
            }
        }, new java.util.function.Function() { // from class: com.google.android.gms.internal.play_billing.A
            public /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return j$.util.function.Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((com.google.android.gms.internal.play_billing.C6230i0) obj).c();
            }

            public /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return j$.util.function.Function$CC.$default$compose(this, function);
            }
        }, new j$.util.stream.Collector.Characteristics[0]);
    }

    static j$.util.stream.Collector a() {
        return f41426a;
    }
}
