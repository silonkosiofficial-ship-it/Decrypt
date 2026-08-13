package j$.time.zone;

/* JADX INFO: loaded from: classes4.dex */
final class h extends j$.time.zone.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Set f48002d;

    h() {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.String str : java.util.TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.f48002d = java.util.Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // j$.time.zone.i
    protected final j$.time.zone.ZoneRules c(java.lang.String str) {
        if (this.f48002d.contains(str)) {
            return new j$.time.zone.ZoneRules(java.util.TimeZone.getTimeZone(str));
        }
        throw new j$.time.zone.f("Not a built-in time zone: " + str);
    }

    @Override // j$.time.zone.i
    protected final java.util.Set d() {
        return this.f48002d;
    }
}
