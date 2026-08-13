package p031d0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p001a0.d implements V.H0, j$.util.Map {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final d0.e.b f44279I = new d0.e.b(null);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final p031d0.e f44280J;

    public static final class a extends p001a0.f implements V.H0.a, j$.util.Map {

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private p031d0.e f44281I;

        public a(p031d0.e eVar) {
            super(eVar);
            this.f44281I = eVar;
        }

        @Override // p001a0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(java.lang.Object obj) {
            if (obj instanceof V.AbstractC1752w) {
                return q((V.AbstractC1752w) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(java.lang.Object obj) {
            if (obj instanceof V.M1) {
                return r((V.M1) obj);
            }
            return false;
        }

        @Override // p001a0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
            if (obj instanceof V.AbstractC1752w) {
                return s((V.AbstractC1752w) obj);
            }
            return null;
        }

        @Override // java.util.Map, j$.util.Map
        public final /* bridge */ /* synthetic */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
            return !(obj instanceof V.AbstractC1752w) ? obj2 : t((V.AbstractC1752w) obj, (V.M1) obj2);
        }

        @Override // V.H0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public p031d0.e i() {
            p031d0.e eVar;
            if (g() == this.f44281I.r()) {
                eVar = this.f44281I;
            } else {
                m(new p021c0.e());
                eVar = new p031d0.e(g(), size());
            }
            this.f44281I = eVar;
            return eVar;
        }

        public /* bridge */ boolean q(V.AbstractC1752w abstractC1752w) {
            return super.containsKey(abstractC1752w);
        }

        public /* bridge */ boolean r(V.M1 m6) {
            return super.containsValue(m6);
        }

        @Override // p001a0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ java.lang.Object remove(java.lang.Object obj) {
            if (obj instanceof V.AbstractC1752w) {
                return u((V.AbstractC1752w) obj);
            }
            return null;
        }

        public /* bridge */ V.M1 s(V.AbstractC1752w abstractC1752w) {
            return (V.M1) super.get(abstractC1752w);
        }

        public /* bridge */ V.M1 t(V.AbstractC1752w abstractC1752w, V.M1 m6) {
            return (V.M1) j$.util.Map.CC.$default$getOrDefault(this, abstractC1752w, m6);
        }

        public /* bridge */ V.M1 u(V.AbstractC1752w abstractC1752w) {
            return (V.M1) super.remove(abstractC1752w);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p031d0.e a() {
            return p031d0.e.f44280J;
        }
    }

    static {
        p001a0.t tVarA = p001a0.t.f17020e.a();
        p247y7.AbstractC7350t.d(tVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        f44280J = new p031d0.e(tVarA, 0);
    }

    public e(p001a0.t tVar, int i6) {
        super(tVar, i6);
    }

    public /* bridge */ boolean A(V.AbstractC1752w abstractC1752w) {
        return super.containsKey(abstractC1752w);
    }

    public /* bridge */ boolean B(V.M1 m6) {
        return super.containsValue(m6);
    }

    public /* bridge */ V.M1 C(V.AbstractC1752w abstractC1752w) {
        return (V.M1) super.get(abstractC1752w);
    }

    public /* bridge */ V.M1 D(V.AbstractC1752w abstractC1752w, V.M1 m6) {
        return (V.M1) j$.util.Map.CC.$default$getOrDefault(this, abstractC1752w, m6);
    }

    @Override // V.InterfaceC1754x
    public /* synthetic */ java.lang.Object a(V.AbstractC1752w abstractC1752w) {
        return V.G0.a(this, abstractC1752w);
    }

    @Override // V.InterfaceC1758z
    public java.lang.Object b(V.AbstractC1752w abstractC1752w) {
        return V.A.b(this, abstractC1752w);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        return j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // p001a0.d, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof V.AbstractC1752w) {
            return A((V.AbstractC1752w) obj);
        }
        return false;
    }

    @Override // p097j7.AbstractC6864f, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof V.M1) {
            return B((V.M1) obj);
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // p001a0.d, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof V.AbstractC1752w) {
            return C((V.AbstractC1752w) obj);
        }
        return null;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof V.AbstractC1752w) ? obj2 : D((V.AbstractC1752w) obj, (V.M1) obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        return j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // V.H0
    public V.H0 n(V.AbstractC1752w abstractC1752w, V.M1 m6) {
        a0.t.b bVarP = r().P(abstractC1752w.hashCode(), abstractC1752w, m6, 0);
        return bVarP == null ? this : new p031d0.e(bVarP.a(), size() + bVarP.b());
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return j$.util.Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // V.H0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public d0.e.a builder() {
        return new d0.e.a(this);
    }
}
