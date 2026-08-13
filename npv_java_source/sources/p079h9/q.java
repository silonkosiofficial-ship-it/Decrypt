package p079h9;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class q {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(j$.time.ZoneId zoneId) {
        try {
            return zoneId.getRules().isFixedOffset();
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            return false;
        }
    }

    public static final p079h9.g c(p079h9.j jVar, p079h9.o oVar) {
        p247y7.AbstractC7350t.f(jVar, "<this>");
        p247y7.AbstractC7350t.f(oVar, "timeZone");
        return new p079h9.g(jVar.o().m(oVar.c()).toInstant());
    }

    public static final p079h9.j d(p079h9.g gVar, p079h9.o oVar) {
        p247y7.AbstractC7350t.f(gVar, "<this>");
        p247y7.AbstractC7350t.f(oVar, "timeZone");
        try {
            return new p079h9.j(j$.time.LocalDateTime.ofInstant(gVar.n(), oVar.c()));
        } catch (j$.time.DateTimeException e6) {
            throw new p079h9.b(e6);
        }
    }
}
