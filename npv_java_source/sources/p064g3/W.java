package p064g3;

/* JADX INFO: loaded from: classes.dex */
final class W extends android.database.sqlite.SQLiteOpenHelper {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final java.lang.String f45482E = "INSERT INTO global_log_event_state VALUES (" + java.lang.System.currentTimeMillis() + ")";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    static int f45483F = 7;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final g3.W.a f45484G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final g3.W.a f45485H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final g3.W.a f45486I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final g3.W.a f45487J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final g3.W.a f45488K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final g3.W.a f45489L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final g3.W.a f45490M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final java.util.List f45491N;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f45492C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f45493D;

    public interface a {
        void a(android.database.sqlite.SQLiteDatabase sQLiteDatabase);
    }

    static {
        g3.W.a aVar = new g3.W.a() { // from class: g3.O
            @Override // g3.W.a
            public final void a(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
                p064g3.W.D(sQLiteDatabase);
            }
        };
        f45484G = aVar;
        g3.W.a aVar2 = new g3.W.a() { // from class: g3.P
            @Override // g3.W.a
            public final void a(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
                p064g3.W.H(sQLiteDatabase);
            }
        };
        f45485H = aVar2;
        g3.W.a aVar3 = new g3.W.a() { // from class: g3.Q
            @Override // g3.W.a
            public final void a(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f45486I = aVar3;
        g3.W.a aVar4 = new g3.W.a() { // from class: g3.S
            @Override // g3.W.a
            public final void a(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
                p064g3.W.R(sQLiteDatabase);
            }
        };
        f45487J = aVar4;
        g3.W.a aVar5 = new g3.W.a() { // from class: g3.T
            @Override // g3.W.a
            public final void a(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
                p064g3.W.e0(sQLiteDatabase);
            }
        };
        f45488K = aVar5;
        g3.W.a aVar6 = new g3.W.a() { // from class: g3.U
            @Override // g3.W.a
            public final void a(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
            }
        };
        f45489L = aVar6;
        g3.W.a aVar7 = new g3.W.a() { // from class: g3.V
            @Override // g3.W.a
            public final void a(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
                p064g3.W.n0(sQLiteDatabase);
            }
        };
        f45490M = aVar7;
        f45491N = java.util.Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    W(android.content.Context context, java.lang.String str, int i6) {
        super(context, str, (android.database.sqlite.SQLiteDatabase.CursorFactory) null, i6);
        this.f45493D = false;
        this.f45492C = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e0(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f45482E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n0(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    private void o0(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i6) {
        y(sQLiteDatabase);
        q0(sQLiteDatabase, 0, i6);
    }

    private void q0(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i6, int i10) {
        java.util.List list = f45491N;
        if (i10 <= list.size()) {
            while (i6 < i10) {
                ((g3.W.a) f45491N.get(i6)).a(sQLiteDatabase);
                i6++;
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Migration from " + i6 + " to " + i10 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    private void y(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (this.f45493D) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        this.f45493D = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new java.lang.String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        o0(sQLiteDatabase, this.f45492C);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i6, int i10) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        o0(sQLiteDatabase, i10);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        y(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i6, int i10) {
        y(sQLiteDatabase);
        q0(sQLiteDatabase, i6, i10);
    }
}
