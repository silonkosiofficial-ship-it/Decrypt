package j$.time.zone;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.concurrent.CopyOnWriteArrayList f48003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j$.util.concurrent.ConcurrentHashMap f48004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile java.util.Set f48005c;

    static {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        f48003a = copyOnWriteArrayList;
        f48004b = new j$.util.concurrent.ConcurrentHashMap(512, 0.75f, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.security.AccessController.doPrivileged(new j$.time.zone.g(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    public static java.util.Set a() {
        return f48005c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static j$.time.zone.ZoneRules b(java.lang.String str, boolean z6) {
        j$.util.Objects.requireNonNull(str, "zoneId");
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = f48004b;
        j$.time.zone.i iVar = (j$.time.zone.i) concurrentHashMap.get(str);
        if (iVar != null) {
            return iVar.c(str);
        }
        if (concurrentHashMap.isEmpty()) {
            throw new j$.time.zone.f("No time-zone data files registered");
        }
        throw new j$.time.zone.f("Unknown time-zone ID: " + str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(j$.time.zone.i iVar) {
        j$.util.Objects.requireNonNull(iVar, "provider");
        synchronized (j$.time.zone.i.class) {
            try {
                for (java.lang.String str : iVar.d()) {
                    j$.util.Objects.requireNonNull(str, "zoneId");
                    if (((j$.time.zone.i) f48004b.putIfAbsent(str, iVar)) != null) {
                        throw new j$.time.zone.f("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + iVar);
                    }
                }
                f48005c = java.util.Collections.unmodifiableSet(new java.util.HashSet(f48004b.keySet()));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        f48003a.add(iVar);
    }

    protected abstract j$.time.zone.ZoneRules c(java.lang.String str);

    protected abstract java.util.Set d();
}
