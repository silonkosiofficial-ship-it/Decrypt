package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public interface Map<K, V> {

    /* JADX INFO: renamed from: j$.util.Map$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* JADX WARN: Multi-variable type inference failed */
        public static java.lang.Object $default$compute(java.util.Map map, java.lang.Object obj, java.util.function.BiFunction biFunction) {
            j$.util.Objects.requireNonNull(biFunction);
            java.lang.Object obj2 = map.get(obj);
            java.lang.Object objApply = biFunction.apply(obj, obj2);
            if (objApply != null) {
                map.put(obj, objApply);
                return objApply;
            }
            if (obj2 == null && !map.containsKey(obj)) {
                return null;
            }
            map.remove(obj);
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static java.lang.Object $default$computeIfAbsent(java.util.Map map, java.lang.Object obj, java.util.function.Function function) {
            java.lang.Object objApply;
            j$.util.Objects.requireNonNull(function);
            java.lang.Object obj2 = map.get(obj);
            if (obj2 != null || (objApply = function.apply(obj)) == null) {
                return obj2;
            }
            map.put(obj, objApply);
            return objApply;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static java.lang.Object $default$computeIfPresent(java.util.Map map, java.lang.Object obj, java.util.function.BiFunction biFunction) {
            j$.util.Objects.requireNonNull(biFunction);
            java.lang.Object obj2 = map.get(obj);
            if (obj2 != null) {
                java.lang.Object objApply = biFunction.apply(obj, obj2);
                if (objApply != null) {
                    map.put(obj, objApply);
                    return objApply;
                }
                map.remove(obj);
            }
            return null;
        }

        public static void $default$forEach(java.util.Map map, java.util.function.BiConsumer biConsumer) {
            j$.util.Objects.requireNonNull(biConsumer);
            for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
                try {
                    biConsumer.accept(entry.getKey(), entry.getValue());
                } catch (java.lang.IllegalStateException e6) {
                    throw new java.util.ConcurrentModificationException(e6);
                }
            }
        }

        public static java.lang.Object $default$getOrDefault(java.util.Map map, java.lang.Object obj, java.lang.Object obj2) {
            java.lang.Object obj3 = map.get(obj);
            return (obj3 != null || map.containsKey(obj)) ? obj3 : obj2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static java.lang.Object $default$merge(java.util.Map map, java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
            j$.util.Objects.requireNonNull(biFunction);
            j$.util.Objects.requireNonNull(obj2);
            java.lang.Object obj3 = map.get(obj);
            if (obj3 != null) {
                obj2 = biFunction.apply(obj3, obj2);
            }
            if (obj2 == null) {
                map.remove(obj);
            } else {
                map.put(obj, obj2);
            }
            return obj2;
        }

        public static java.lang.Object $default$putIfAbsent(java.util.Map map, java.lang.Object obj, java.lang.Object obj2) {
            java.lang.Object obj3 = map.get(obj);
            return obj3 == null ? map.put(obj, obj2) : obj3;
        }

        public static boolean $default$remove(java.util.Map map, java.lang.Object obj, java.lang.Object obj2) {
            java.lang.Object obj3 = map.get(obj);
            if (!j$.util.Objects.equals(obj3, obj2)) {
                return false;
            }
            if (obj3 == null && !map.containsKey(obj)) {
                return false;
            }
            map.remove(obj);
            return true;
        }

        public static java.lang.Object $default$replace(java.util.Map map, java.lang.Object obj, java.lang.Object obj2) {
            java.lang.Object obj3 = map.get(obj);
            return (obj3 != null || map.containsKey(obj)) ? map.put(obj, obj2) : obj3;
        }

        public static boolean $default$replace(java.util.Map map, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            java.lang.Object obj4 = map.get(obj);
            if (!j$.util.Objects.equals(obj4, obj2)) {
                return false;
            }
            if (obj4 == null && !map.containsKey(obj)) {
                return false;
            }
            map.put(obj, obj3);
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void $default$replaceAll(java.util.Map map, java.util.function.BiFunction biFunction) {
            j$.util.Objects.requireNonNull(biFunction);
            for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
                try {
                    try {
                        entry.setValue(biFunction.apply(entry.getKey(), entry.getValue()));
                    } catch (java.lang.IllegalStateException e6) {
                        throw new java.util.ConcurrentModificationException(e6);
                    }
                } catch (java.lang.IllegalStateException e10) {
                    throw new java.util.ConcurrentModificationException(e10);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j$.util.Map$-EL, reason: invalid class name */
    public final /* synthetic */ class EL {
        public static /* synthetic */ void a(java.util.Map map, java.util.function.BiConsumer biConsumer) {
            if (map instanceof j$.util.Map) {
                ((j$.util.Map) map).forEach(biConsumer);
            } else if (map instanceof java.util.concurrent.ConcurrentMap) {
                j$.util.concurrent.u.a((java.util.concurrent.ConcurrentMap) map, biConsumer);
            } else {
                j$.util.Map.CC.$default$forEach(map, biConsumer);
            }
        }

        public static /* synthetic */ java.lang.Object b(java.util.Map map, java.lang.Object obj, java.lang.Object obj2) {
            return map instanceof j$.util.Map ? ((j$.util.Map) map).putIfAbsent(obj, obj2) : j$.util.Map.CC.$default$putIfAbsent(map, obj, obj2);
        }

        public static java.lang.Object getOrDefault(java.util.Map map, java.lang.Object obj, java.lang.Object obj2) {
            if (map instanceof j$.util.Map) {
                return ((j$.util.Map) map).getOrDefault(obj, obj2);
            }
            if (!(map instanceof java.util.concurrent.ConcurrentMap)) {
                return j$.util.Map.CC.$default$getOrDefault(map, obj, obj2);
            }
            java.lang.Object obj3 = ((java.util.concurrent.ConcurrentMap) map).get(obj);
            return obj3 != null ? obj3 : obj2;
        }
    }

    V compute(K k6, java.util.function.BiFunction<? super K, ? super V, ? extends V> biFunction);

    V computeIfAbsent(K k6, java.util.function.Function<? super K, ? extends V> function);

    V computeIfPresent(K k6, java.util.function.BiFunction<? super K, ? super V, ? extends V> biFunction);

    void forEach(java.util.function.BiConsumer<? super K, ? super V> biConsumer);

    V getOrDefault(java.lang.Object obj, V v6);

    V merge(K k6, V v6, java.util.function.BiFunction<? super V, ? super V, ? extends V> biFunction);

    V putIfAbsent(K k6, V v6);

    boolean remove(java.lang.Object obj, java.lang.Object obj2);

    V replace(K k6, V v6);

    boolean replace(K k6, V v6, V v10);

    void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V> biFunction);
}
