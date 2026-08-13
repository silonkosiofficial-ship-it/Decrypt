package p223w2;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class c {
    public static final void a(p243y2.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "connection");
        java.util.List listC = p097j7.AbstractC6879v.c();
        p243y2.e eVarE = bVar.e("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (eVarE.p()) {
            try {
                listC.add(eVarE.o(0));
            } catch (java.lang.Throwable th) {
                eVarE.close();
                throw th;
            }
        }
        p087i7.M m6 = p087i7.M.f46721a;
        eVarE.close();
        for (java.lang.String str : p097j7.AbstractC6879v.a(listC)) {
            if (S8.r.V(str, "room_fts_content_sync_", false, 2, null)) {
                p243y2.a.a(bVar, "DROP TRIGGER IF EXISTS " + str);
            }
        }
    }
}
