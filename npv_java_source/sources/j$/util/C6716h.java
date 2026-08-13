package j$.util;

/* JADX INFO: renamed from: j$.util.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6716h implements java.util.Map, java.io.Serializable, j$.util.Map {
    private static final long serialVersionUID = 1978198479659022715L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f48148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.lang.Object f48149b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient java.util.Set f48150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient java.util.Set f48151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient java.util.Collection f48152e;

    C6716h(java.util.Map map) {
        this.f48148a = (java.util.Map) j$.util.Objects.requireNonNull(map);
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) {
        synchronized (this.f48149b) {
            objectOutputStream.defaultWriteObject();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.f48149b) {
            this.f48148a.clear();
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        java.lang.Object obj$default$compute;
        java.lang.Object objApply;
        synchronized (this.f48149b) {
            java.util.Map map = this.f48148a;
            if (map instanceof j$.util.Map) {
                obj$default$compute = ((j$.util.Map) map).compute(obj, biFunction);
            } else if (map instanceof java.util.concurrent.ConcurrentMap) {
                java.util.concurrent.ConcurrentMap concurrentMap = (java.util.concurrent.ConcurrentMap) map;
                loop0: while (true) {
                    java.lang.Object objPutIfAbsent = concurrentMap.get(obj);
                    while (true) {
                        objApply = biFunction.apply(obj, objPutIfAbsent);
                        if (objApply == null) {
                            if (objPutIfAbsent != null && !concurrentMap.remove(obj, objPutIfAbsent)) {
                                break;
                            }
                            obj$default$compute = null;
                        } else {
                            if (objPutIfAbsent != null) {
                                if (!concurrentMap.replace(obj, objPutIfAbsent, objApply)) {
                                    break;
                                }
                                break;
                            }
                            objPutIfAbsent = concurrentMap.putIfAbsent(obj, objApply);
                            if (objPutIfAbsent == null) {
                                break loop0;
                            }
                        }
                        throw th;
                    }
                }
                obj$default$compute = objApply;
            } else {
                obj$default$compute = j$.util.Map.CC.$default$compute(map, obj, biFunction);
            }
        }
        return obj$default$compute;
    }

    @Override // java.util.Map, j$.util.Map
    public final java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        java.lang.Object obj$default$computeIfAbsent;
        java.lang.Object objApply;
        synchronized (this.f48149b) {
            java.util.Map map = this.f48148a;
            if (map instanceof j$.util.Map) {
                obj$default$computeIfAbsent = ((j$.util.Map) map).computeIfAbsent(obj, function);
            } else if (map instanceof java.util.concurrent.ConcurrentMap) {
                java.util.concurrent.ConcurrentMap concurrentMap = (java.util.concurrent.ConcurrentMap) map;
                j$.util.Objects.requireNonNull(function);
                java.lang.Object objPutIfAbsent = concurrentMap.get(obj);
                obj$default$computeIfAbsent = (objPutIfAbsent == null && (objApply = function.apply(obj)) != null && (objPutIfAbsent = concurrentMap.putIfAbsent(obj, objApply)) == null) ? objApply : objPutIfAbsent;
            } else {
                obj$default$computeIfAbsent = j$.util.Map.CC.$default$computeIfAbsent(map, obj, function);
            }
        }
        return obj$default$computeIfAbsent;
    }

    @Override // java.util.Map, j$.util.Map
    public final java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        java.lang.Object obj$default$computeIfPresent;
        synchronized (this.f48149b) {
            java.util.Map map = this.f48148a;
            if (map instanceof j$.util.Map) {
                obj$default$computeIfPresent = ((j$.util.Map) map).computeIfPresent(obj, biFunction);
            } else if (map instanceof java.util.concurrent.ConcurrentMap) {
                java.util.concurrent.ConcurrentMap concurrentMap = (java.util.concurrent.ConcurrentMap) map;
                j$.util.Objects.requireNonNull(biFunction);
                while (true) {
                    java.lang.Object obj2 = concurrentMap.get(obj);
                    if (obj2 == null) {
                        obj$default$computeIfPresent = null;
                        break;
                    }
                    java.lang.Object objApply = biFunction.apply(obj, obj2);
                    if (objApply == null) {
                        if (concurrentMap.remove(obj, obj2)) {
                            obj$default$computeIfPresent = objApply;
                            break;
                        }
                    } else if (concurrentMap.replace(obj, obj2, objApply)) {
                        obj$default$computeIfPresent = objApply;
                        break;
                    }
                }
            } else {
                obj$default$computeIfPresent = j$.util.Map.CC.$default$computeIfPresent(map, obj, biFunction);
            }
        }
        return obj$default$computeIfPresent;
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        boolean zContainsKey;
        synchronized (this.f48149b) {
            zContainsKey = this.f48148a.containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        boolean zContainsValue;
        synchronized (this.f48149b) {
            zContainsValue = this.f48148a.containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        java.util.Set set;
        synchronized (this.f48149b) {
            try {
                if (this.f48151d == null) {
                    this.f48151d = new j$.util.C6718j(this.f48148a.entrySet(), this.f48149b);
                }
                set = this.f48151d;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return set;
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f48149b) {
            zEquals = this.f48148a.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Map, j$.util.Map
    public final void forEach(java.util.function.BiConsumer biConsumer) {
        synchronized (this.f48149b) {
            j$.util.Map.EL.a(this.f48148a, biConsumer);
        }
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Object obj2;
        synchronized (this.f48149b) {
            obj2 = this.f48148a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map, j$.util.Map
    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object orDefault;
        synchronized (this.f48149b) {
            orDefault = j$.util.Map.EL.getOrDefault(this.f48148a, obj, obj2);
        }
        return orDefault;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f48149b) {
            iHashCode = this.f48148a.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f48149b) {
            zIsEmpty = this.f48148a.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        java.util.Set set;
        synchronized (this.f48149b) {
            try {
                if (this.f48150c == null) {
                    this.f48150c = new j$.util.C6718j(this.f48148a.keySet(), this.f48149b);
                }
                set = this.f48150c;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return set;
    }

    @Override // java.util.Map, j$.util.Map
    public final java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        java.lang.Object obj$default$merge;
        synchronized (this.f48149b) {
            java.util.Map map = this.f48148a;
            if (map instanceof j$.util.Map) {
                obj$default$merge = ((j$.util.Map) map).merge(obj, obj2, biFunction);
            } else if (map instanceof java.util.concurrent.ConcurrentMap) {
                java.util.concurrent.ConcurrentMap concurrentMap = (java.util.concurrent.ConcurrentMap) map;
                j$.util.Objects.requireNonNull(biFunction);
                j$.util.Objects.requireNonNull(obj2);
                loop0: while (true) {
                    java.lang.Object objPutIfAbsent = concurrentMap.get(obj);
                    while (objPutIfAbsent == null) {
                        objPutIfAbsent = concurrentMap.putIfAbsent(obj, obj2);
                        if (objPutIfAbsent == null) {
                            break loop0;
                        }
                    }
                    java.lang.Object objApply = biFunction.apply(objPutIfAbsent, obj2);
                    if (objApply != null) {
                        if (concurrentMap.replace(obj, objPutIfAbsent, objApply)) {
                            obj2 = objApply;
                            break;
                        }
                    } else if (concurrentMap.remove(obj, objPutIfAbsent)) {
                        obj2 = null;
                        break;
                    }
                }
                obj$default$merge = obj2;
            } else {
                obj$default$merge = j$.util.Map.CC.$default$merge(map, obj, obj2, biFunction);
            }
        }
        return obj$default$merge;
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object objPut;
        synchronized (this.f48149b) {
            objPut = this.f48148a.put(obj, obj2);
        }
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        synchronized (this.f48149b) {
            this.f48148a.putAll(map);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object objB;
        synchronized (this.f48149b) {
            objB = j$.util.Map.EL.b(this.f48148a, obj, obj2);
        }
        return objB;
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        java.lang.Object objRemove;
        synchronized (this.f48149b) {
            objRemove = this.f48148a.remove(obj);
        }
        return objRemove;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        boolean zRemove;
        synchronized (this.f48149b) {
            java.util.Map map = this.f48148a;
            zRemove = map instanceof j$.util.Map ? ((j$.util.Map) map).remove(obj, obj2) : j$.util.Map.CC.$default$remove(map, obj, obj2);
        }
        return zRemove;
    }

    @Override // java.util.Map, j$.util.Map
    public final java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object objReplace;
        synchronized (this.f48149b) {
            java.util.Map map = this.f48148a;
            objReplace = map instanceof j$.util.Map ? ((j$.util.Map) map).replace(obj, obj2) : j$.util.Map.CC.$default$replace(map, obj, obj2);
        }
        return objReplace;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean zReplace;
        synchronized (this.f48149b) {
            java.util.Map map = this.f48148a;
            zReplace = map instanceof j$.util.Map ? ((j$.util.Map) map).replace(obj, obj2, obj3) : j$.util.Map.CC.$default$replace(map, obj, obj2, obj3);
        }
        return zReplace;
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(java.util.function.BiFunction biFunction) {
        synchronized (this.f48149b) {
            java.util.Map map = this.f48148a;
            if (map instanceof j$.util.Map) {
                ((j$.util.Map) map).replaceAll(biFunction);
            } else if (map instanceof java.util.concurrent.ConcurrentMap) {
                java.util.concurrent.ConcurrentMap concurrentMap = (java.util.concurrent.ConcurrentMap) map;
                j$.util.Objects.requireNonNull(biFunction);
                j$.util.concurrent.t tVar = new j$.util.concurrent.t(0, concurrentMap, biFunction);
                if (concurrentMap instanceof j$.util.concurrent.v) {
                    ((j$.util.concurrent.v) concurrentMap).forEach(tVar);
                } else {
                    j$.util.concurrent.u.a(concurrentMap, tVar);
                }
            } else {
                j$.util.Map.CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.f48149b) {
            size = this.f48148a.size();
        }
        return size;
    }

    public final java.lang.String toString() {
        java.lang.String string;
        synchronized (this.f48149b) {
            string = this.f48148a.toString();
        }
        return string;
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        java.util.Collection collection;
        synchronized (this.f48149b) {
            try {
                if (this.f48152e == null) {
                    this.f48152e = new j$.util.C6714f(this.f48148a.values(), this.f48149b);
                }
                collection = this.f48152e;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return collection;
    }
}
