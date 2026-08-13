package p064g3;

/* JADX INFO: loaded from: classes.dex */
public class M implements p064g3.InterfaceC6599d, p074h3.b, p064g3.InterfaceC6598c {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final W2.b f45469H = W2.b.b("proto");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p064g3.W f45470C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p084i3.a f45471D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p084i3.a f45472E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final p064g3.AbstractC6600e f45473F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final p077h7.a f45474G;

    interface b {
        java.lang.Object apply(java.lang.Object obj);
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.lang.String f45475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final java.lang.String f45476b;

        private c(java.lang.String str, java.lang.String str2) {
            this.f45475a = str;
            this.f45476b = str2;
        }
    }

    interface d {
        java.lang.Object a();
    }

    M(p084i3.a aVar, p084i3.a aVar2, p064g3.AbstractC6600e abstractC6600e, p064g3.W w6, p077h7.a aVar3) {
        this.f45470C = w6;
        this.f45471D = aVar;
        this.f45472E = aVar2;
        this.f45473F = abstractC6600e;
        this.f45474G = aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object A1(android.database.Cursor cursor) {
        while (cursor.moveToNext()) {
            i(cursor.getInt(0), b3.c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Integer B1(long j6, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        java.lang.String[] strArr = {java.lang.String.valueOf(j6)};
        h2(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new g3.M.b() { // from class: g3.r
            @Override // g3.M.b
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f45527a.A1((android.database.Cursor) obj);
            }
        });
        return java.lang.Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object C1(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object D1(java.lang.Throwable th) {
        throw new p074h3.a("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ android.database.sqlite.SQLiteDatabase E1(java.lang.Throwable th) {
        throw new p074h3.a("Timed out while trying to open db.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Long F1(android.database.Cursor cursor) {
        return java.lang.Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p014b3.f G1(long j6, android.database.Cursor cursor) {
        cursor.moveToNext();
        return p014b3.f.c().c(cursor.getLong(0)).b(j6).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p014b3.f H1(final long j6, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        return (p014b3.f) h2(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new java.lang.String[0]), new g3.M.b() { // from class: g3.D
            @Override // g3.M.b
            public final java.lang.Object apply(java.lang.Object obj) {
                return p064g3.M.G1(j6, (android.database.Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Long I1(android.database.Cursor cursor) {
        if (cursor.moveToNext()) {
            return java.lang.Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Boolean J1(Y2.p pVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        java.lang.Long lW1 = w1(sQLiteDatabase, pVar);
        return lW1 == null ? java.lang.Boolean.FALSE : (java.lang.Boolean) h2(l1().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new java.lang.String[]{lW1.toString()}), new g3.M.b() { // from class: g3.t
            @Override // g3.M.b
            public final java.lang.Object apply(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(((android.database.Cursor) obj).moveToNext());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.util.List K1(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        return (java.util.List) h2(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new java.lang.String[0]), new g3.M.b() { // from class: g3.J
            @Override // g3.M.b
            public final java.lang.Object apply(java.lang.Object obj) {
                return p064g3.M.L1((android.database.Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.util.List L1(android.database.Cursor cursor) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(Y2.p.a().b(cursor.getString(1)).d(p094j3.a.b(cursor.getInt(2))).c(b2(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.util.List M1(Y2.p pVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        java.util.List listZ1 = Z1(sQLiteDatabase, pVar, this.f45473F.d());
        for (W2.e eVar : W2.e.values()) {
            if (eVar != pVar.d()) {
                int iD = this.f45473F.d() - listZ1.size();
                if (iD <= 0) {
                    break;
                }
                listZ1.addAll(Z1(sQLiteDatabase, pVar.f(eVar), iD));
            }
        }
        return z1(listZ1, a2(sQLiteDatabase, listZ1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ p014b3.a N1(java.util.Map map, p014b3.a.C0459a c0459a, android.database.Cursor cursor) {
        while (cursor.moveToNext()) {
            java.lang.String string = cursor.getString(0);
            b3.c.b bVarC1 = c1(cursor.getInt(1));
            long j6 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new java.util.ArrayList());
            }
            ((java.util.List) map.get(string)).add(p014b3.c.c().c(bVarC1).b(j6).a());
        }
        c2(c0459a, map);
        return c0459a.e(v1()).d(m1()).c((java.lang.String) this.f45474G.get()).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ p014b3.a O1(java.lang.String str, final java.util.Map map, final p014b3.a.C0459a c0459a, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        return (p014b3.a) h2(sQLiteDatabase.rawQuery(str, new java.lang.String[0]), new g3.M.b() { // from class: g3.A
            @Override // g3.M.b
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f45456a.N1(map, c0459a, (android.database.Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object P1(java.util.List list, Y2.p pVar, android.database.Cursor cursor) {
        while (cursor.moveToNext()) {
            long j6 = cursor.getLong(0);
            boolean z6 = cursor.getInt(7) != 0;
            Y2.i.a aVarO = Y2.i.a().n(cursor.getString(1)).i(cursor.getLong(2)).o(cursor.getLong(3));
            aVarO.h(z6 ? new Y2.h(f2(cursor.getString(4)), cursor.getBlob(5)) : new Y2.h(f2(cursor.getString(4)), d2(j6)));
            if (!cursor.isNull(6)) {
                aVarO.g(java.lang.Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                aVarO.l(java.lang.Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                aVarO.m(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                aVarO.j(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                aVarO.k(cursor.getBlob(11));
            }
            list.add(p064g3.AbstractC6606k.a(j6, pVar, aVarO.d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object Q1(java.util.Map map, android.database.Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j6 = cursor.getLong(0);
            java.util.Set hashSet = (java.util.Set) map.get(java.lang.Long.valueOf(j6));
            if (hashSet == null) {
                hashSet = new java.util.HashSet();
                map.put(java.lang.Long.valueOf(j6), hashSet);
            }
            hashSet.add(new g3.M.c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Long R1(Y2.i iVar, Y2.p pVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (y1()) {
            i(1L, b3.c.b.CACHE_FULL, iVar.n());
            return -1L;
        }
        long jE1 = e1(sQLiteDatabase, pVar);
        int iE = this.f45473F.e();
        byte[] bArrA = iVar.e().a();
        boolean z6 = bArrA.length <= iE;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("context_id", java.lang.Long.valueOf(jE1));
        contentValues.put("transport_name", iVar.n());
        contentValues.put("timestamp_ms", java.lang.Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", java.lang.Long.valueOf(iVar.o()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (java.lang.Integer) 0);
        contentValues.put("inline", java.lang.Boolean.valueOf(z6));
        contentValues.put("payload", z6 ? bArrA : new byte[0]);
        contentValues.put("product_id", iVar.l());
        contentValues.put("pseudonymous_id", iVar.m());
        contentValues.put("experiment_ids_clear_blob", iVar.g());
        contentValues.put("experiment_ids_encrypted_blob", iVar.h());
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z6) {
            int iCeil = (int) java.lang.Math.ceil(((double) bArrA.length) / ((double) iE));
            for (int i6 = 1; i6 <= iCeil; i6++) {
                byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArrA, (i6 - 1) * iE, java.lang.Math.min(i6 * iE, bArrA.length));
                android.content.ContentValues contentValues2 = new android.content.ContentValues();
                contentValues2.put("event_id", java.lang.Long.valueOf(jInsert));
                contentValues2.put("sequence_num", java.lang.Integer.valueOf(i6));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (java.util.Map.Entry entry : iVar.k().entrySet()) {
            android.content.ContentValues contentValues3 = new android.content.ContentValues();
            contentValues3.put("event_id", java.lang.Long.valueOf(jInsert));
            contentValues3.put("name", (java.lang.String) entry.getKey());
            contentValues3.put("value", (java.lang.String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return java.lang.Long.valueOf(jInsert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] S1(android.database.Cursor cursor) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            byte[] bArr2 = (byte[]) arrayList.get(i6);
            java.lang.System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object T1(android.database.Cursor cursor) {
        while (cursor.moveToNext()) {
            i(cursor.getInt(0), b3.c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object U1(java.lang.String str, java.lang.String str2, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        h2(sQLiteDatabase.rawQuery(str2, null), new g3.M.b() { // from class: g3.u
            @Override // g3.M.b
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f45532a.T1((android.database.Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Boolean V1(android.database.Cursor cursor) {
        return java.lang.Boolean.valueOf(cursor.getCount() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object W1(java.lang.String str, b3.c.b bVar, long j6, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (((java.lang.Boolean) h2(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new java.lang.String[]{str, java.lang.Integer.toString(bVar.c())}), new g3.M.b() { // from class: g3.y
            @Override // g3.M.b
            public final java.lang.Object apply(java.lang.Object obj) {
                return p064g3.M.V1((android.database.Cursor) obj);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j6 + " WHERE log_source = ? AND reason = ?", new java.lang.String[]{str, java.lang.Integer.toString(bVar.c())});
        } else {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", java.lang.Integer.valueOf(bVar.c()));
            contentValues.put("events_dropped_count", java.lang.Long.valueOf(j6));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object X1(long j6, Y2.p pVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("next_request_ms", java.lang.Long.valueOf(j6));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new java.lang.String[]{pVar.b(), java.lang.String.valueOf(p094j3.a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put("priority", java.lang.Integer.valueOf(p094j3.a.a(pVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object Y1(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f45471D.a()).execute();
        return null;
    }

    private java.util.List Z1(android.database.sqlite.SQLiteDatabase sQLiteDatabase, final Y2.p pVar, int i6) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Long lW1 = w1(sQLiteDatabase, pVar);
        if (lW1 == null) {
            return arrayList;
        }
        h2(sQLiteDatabase.query("events", new java.lang.String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new java.lang.String[]{lW1.toString()}, null, null, null, java.lang.String.valueOf(i6)), new g3.M.b() { // from class: g3.v
            @Override // g3.M.b
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f45533a.P1(arrayList, pVar, (android.database.Cursor) obj);
            }
        });
        return arrayList;
    }

    private java.util.Map a2(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.util.List list) {
        final java.util.HashMap map = new java.util.HashMap();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("event_id IN (");
        for (int i6 = 0; i6 < list.size(); i6++) {
            sb.append(((p064g3.AbstractC6606k) list.get(i6)).c());
            if (i6 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        h2(sQLiteDatabase.query("event_metadata", new java.lang.String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new g3.M.b() { // from class: g3.z
            @Override // g3.M.b
            public final java.lang.Object apply(java.lang.Object obj) {
                return p064g3.M.Q1(map, (android.database.Cursor) obj);
            }
        });
        return map;
    }

    private static byte[] b2(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return android.util.Base64.decode(str, 0);
    }

    private b3.c.b c1(int i6) {
        b3.c.b bVar = b3.c.b.REASON_UNKNOWN;
        if (i6 == bVar.c()) {
            return bVar;
        }
        b3.c.b bVar2 = b3.c.b.MESSAGE_TOO_OLD;
        if (i6 == bVar2.c()) {
            return bVar2;
        }
        b3.c.b bVar3 = b3.c.b.CACHE_FULL;
        if (i6 == bVar3.c()) {
            return bVar3;
        }
        b3.c.b bVar4 = b3.c.b.PAYLOAD_TOO_BIG;
        if (i6 == bVar4.c()) {
            return bVar4;
        }
        b3.c.b bVar5 = b3.c.b.MAX_RETRIES_REACHED;
        if (i6 == bVar5.c()) {
            return bVar5;
        }
        b3.c.b bVar6 = b3.c.b.INVALID_PAYLOD;
        if (i6 == bVar6.c()) {
            return bVar6;
        }
        b3.c.b bVar7 = b3.c.b.SERVER_ERROR;
        if (i6 == bVar7.c()) {
            return bVar7;
        }
        p024c3.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", java.lang.Integer.valueOf(i6));
        return bVar;
    }

    private void c2(p014b3.a.C0459a c0459a, java.util.Map map) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            c0459a.a(p014b3.d.c().c((java.lang.String) entry.getKey()).b((java.util.List) entry.getValue()).a());
        }
    }

    private void d1(final android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        e2(new g3.M.d() { // from class: g3.l
            @Override // g3.M.d
            public final java.lang.Object a() {
                return p064g3.M.C1(sQLiteDatabase);
            }
        }, new g3.M.b() { // from class: g3.w
            @Override // g3.M.b
            public final java.lang.Object apply(java.lang.Object obj) {
                return p064g3.M.D1((java.lang.Throwable) obj);
            }
        });
    }

    private byte[] d2(long j6) {
        return (byte[]) h2(l1().query("event_payloads", new java.lang.String[]{"bytes"}, "event_id = ?", new java.lang.String[]{java.lang.String.valueOf(j6)}, null, null, "sequence_num"), new g3.M.b() { // from class: g3.B
            @Override // g3.M.b
            public final java.lang.Object apply(java.lang.Object obj) {
                return p064g3.M.S1((android.database.Cursor) obj);
            }
        });
    }

    private long e1(android.database.sqlite.SQLiteDatabase sQLiteDatabase, Y2.p pVar) {
        java.lang.Long lW1 = w1(sQLiteDatabase, pVar);
        if (lW1 != null) {
            return lW1.longValue();
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("backend_name", pVar.b());
        contentValues.put("priority", java.lang.Integer.valueOf(p094j3.a.a(pVar.d())));
        contentValues.put("next_request_ms", (java.lang.Integer) 0);
        if (pVar.c() != null) {
            contentValues.put("extras", android.util.Base64.encodeToString(pVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private java.lang.Object e2(g3.M.d dVar, g3.M.b bVar) {
        long jA = this.f45472E.a();
        while (true) {
            try {
                return dVar.a();
            } catch (android.database.sqlite.SQLiteDatabaseLockedException e6) {
                if (this.f45472E.a() >= ((long) this.f45473F.b()) + jA) {
                    return bVar.apply(e6);
                }
                android.os.SystemClock.sleep(50L);
            }
        }
    }

    private static W2.b f2(java.lang.String str) {
        return str == null ? f45469H : W2.b.b(str);
    }

    private static java.lang.String g2(java.lang.Iterable iterable) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((p064g3.AbstractC6606k) it.next()).c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    static java.lang.Object h2(android.database.Cursor cursor, g3.M.b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private p014b3.b m1() {
        return p014b3.b.b().b(p014b3.e.c().b(f1()).c(p064g3.AbstractC6600e.f45510a.f()).a()).a();
    }

    private long t1() {
        return l1().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long u1() {
        return l1().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private p014b3.f v1() {
        final long jA = this.f45471D.a();
        return (p014b3.f) x1(new g3.M.b() { // from class: g3.C
            @Override // g3.M.b
            public final java.lang.Object apply(java.lang.Object obj) {
                return p064g3.M.H1(jA, (android.database.sqlite.SQLiteDatabase) obj);
            }
        });
    }

    private java.lang.Long w1(android.database.sqlite.SQLiteDatabase sQLiteDatabase, Y2.p pVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("backend_name = ? and priority = ?");
        java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(pVar.b(), java.lang.String.valueOf(p094j3.a.a(pVar.d()))));
        if (pVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(android.util.Base64.encodeToString(pVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (java.lang.Long) h2(sQLiteDatabase.query("transport_contexts", new java.lang.String[]{"_id"}, sb.toString(), (java.lang.String[]) arrayList.toArray(new java.lang.String[0]), null, null, null), new g3.M.b() { // from class: g3.x
            @Override // g3.M.b
            public final java.lang.Object apply(java.lang.Object obj) {
                return p064g3.M.I1((android.database.Cursor) obj);
            }
        });
    }

    private boolean y1() {
        return t1() * u1() >= this.f45473F.f();
    }

    private java.util.List z1(java.util.List list, java.util.Map map) {
        java.util.ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            p064g3.AbstractC6606k abstractC6606k = (p064g3.AbstractC6606k) listIterator.next();
            if (map.containsKey(java.lang.Long.valueOf(abstractC6606k.c()))) {
                Y2.i.a aVarP = abstractC6606k.b().p();
                for (g3.M.c cVar : (java.util.Set) map.get(java.lang.Long.valueOf(abstractC6606k.c()))) {
                    aVarP.c(cVar.f45475a, cVar.f45476b);
                }
                listIterator.set(p064g3.AbstractC6606k.a(abstractC6606k.c(), abstractC6606k.d(), aVarP.d()));
            }
        }
        return list;
    }

    @Override // p064g3.InterfaceC6599d
    public long M(Y2.p pVar) {
        return ((java.lang.Long) h2(l1().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new java.lang.String[]{pVar.b(), java.lang.String.valueOf(p094j3.a.a(pVar.d()))}), new g3.M.b() { // from class: g3.H
            @Override // g3.M.b
            public final java.lang.Object apply(java.lang.Object obj) {
                return p064g3.M.F1((android.database.Cursor) obj);
            }
        })).longValue();
    }

    @Override // p064g3.InterfaceC6599d
    public p064g3.AbstractC6606k U0(final Y2.p pVar, final Y2.i iVar) {
        p024c3.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), iVar.n(), pVar.b());
        long jLongValue = ((java.lang.Long) x1(new g3.M.b() { // from class: g3.m
            @Override // g3.M.b
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f45516a.R1(iVar, pVar, (android.database.sqlite.SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return p064g3.AbstractC6606k.a(jLongValue, pVar, iVar);
    }

    @Override // p064g3.InterfaceC6599d
    public java.lang.Iterable Y() {
        return (java.lang.Iterable) x1(new g3.M.b() { // from class: g3.G
            @Override // g3.M.b
            public final java.lang.Object apply(java.lang.Object obj) {
                return p064g3.M.K1((android.database.sqlite.SQLiteDatabase) obj);
            }
        });
    }

    @Override // p064g3.InterfaceC6599d
    public boolean Z(final Y2.p pVar) {
        return ((java.lang.Boolean) x1(new g3.M.b() { // from class: g3.n
            @Override // g3.M.b
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f45519a.J1(pVar, (android.database.sqlite.SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // p064g3.InterfaceC6598c
    public void a() {
        x1(new g3.M.b() { // from class: g3.p
            @Override // g3.M.b
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f45523a.Y1((android.database.sqlite.SQLiteDatabase) obj);
            }
        });
    }

    @Override // p064g3.InterfaceC6599d
    public java.lang.Iterable a0(final Y2.p pVar) {
        return (java.lang.Iterable) x1(new g3.M.b() { // from class: g3.L
            @Override // g3.M.b
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f45467a.M1(pVar, (android.database.sqlite.SQLiteDatabase) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f45470C.close();
    }

    @Override // p074h3.b
    public java.lang.Object f(h3.b.a aVar) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseL1 = l1();
        d1(sQLiteDatabaseL1);
        try {
            java.lang.Object objN = aVar.n();
            sQLiteDatabaseL1.setTransactionSuccessful();
            return objN;
        } finally {
            sQLiteDatabaseL1.endTransaction();
        }
    }

    long f1() {
        return t1() * u1();
    }

    @Override // p064g3.InterfaceC6598c
    public p014b3.a g() {
        final p014b3.a.C0459a c0459aE = p014b3.a.e();
        final java.util.HashMap map = new java.util.HashMap();
        final java.lang.String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (p014b3.a) x1(new g3.M.b() { // from class: g3.s
            @Override // g3.M.b
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f45528a.O1(str, map, c0459aE, (android.database.sqlite.SQLiteDatabase) obj);
            }
        });
    }

    @Override // p064g3.InterfaceC6598c
    public void i(final long j6, final b3.c.b bVar, final java.lang.String str) {
        x1(new g3.M.b() { // from class: g3.q
            @Override // g3.M.b
            public final java.lang.Object apply(java.lang.Object obj) {
                return p064g3.M.W1(str, bVar, j6, (android.database.sqlite.SQLiteDatabase) obj);
            }
        });
    }

    @Override // p064g3.InterfaceC6599d
    public void j1(java.lang.Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final java.lang.String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + g2(iterable);
            final java.lang.String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            x1(new g3.M.b() { // from class: g3.K
                @Override // g3.M.b
                public final java.lang.Object apply(java.lang.Object obj) {
                    return this.f45464a.U1(str, str2, (android.database.sqlite.SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // p064g3.InterfaceC6599d
    public void k1(final Y2.p pVar, final long j6) {
        x1(new g3.M.b() { // from class: g3.o
            @Override // g3.M.b
            public final java.lang.Object apply(java.lang.Object obj) {
                return p064g3.M.X1(j6, pVar, (android.database.sqlite.SQLiteDatabase) obj);
            }
        });
    }

    android.database.sqlite.SQLiteDatabase l1() {
        final p064g3.W w6 = this.f45470C;
        j$.util.Objects.requireNonNull(w6);
        return (android.database.sqlite.SQLiteDatabase) e2(new g3.M.d() { // from class: g3.E
            @Override // g3.M.d
            public final java.lang.Object a() {
                return w6.getWritableDatabase();
            }
        }, new g3.M.b() { // from class: g3.F
            @Override // g3.M.b
            public final java.lang.Object apply(java.lang.Object obj) {
                return p064g3.M.E1((java.lang.Throwable) obj);
            }
        });
    }

    @Override // p064g3.InterfaceC6599d
    public int v() {
        final long jA = this.f45471D.a() - this.f45473F.c();
        return ((java.lang.Integer) x1(new g3.M.b() { // from class: g3.I
            @Override // g3.M.b
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f45462a.B1(jA, (android.database.sqlite.SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // p064g3.InterfaceC6599d
    public void x(java.lang.Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            l1().compileStatement("DELETE FROM events WHERE _id in " + g2(iterable)).execute();
        }
    }

    java.lang.Object x1(g3.M.b bVar) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseL1 = l1();
        sQLiteDatabaseL1.beginTransaction();
        try {
            java.lang.Object objApply = bVar.apply(sQLiteDatabaseL1);
            sQLiteDatabaseL1.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseL1.endTransaction();
        }
    }
}
