package j$.time.zone;

/* JADX INFO: loaded from: classes4.dex */
final class g implements java.security.PrivilegedAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.util.List f48001a;

    g(java.util.ArrayList arrayList) {
        this.f48001a = arrayList;
    }

    @Override // java.security.PrivilegedAction
    public final java.lang.Object run() {
        java.lang.String property = java.lang.System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property == null) {
            j$.time.zone.i.e(new j$.time.zone.h());
            return null;
        }
        try {
            j$.time.zone.i iVar = (j$.time.zone.i) j$.time.zone.i.class.cast(java.lang.Class.forName(property, true, j$.time.zone.i.class.getClassLoader()).newInstance());
            j$.time.zone.i.e(iVar);
            this.f48001a.add(iVar);
            return null;
        } catch (java.lang.Exception e6) {
            throw new java.lang.Error(e6);
        }
    }
}
