package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class r extends com.google.android.gms.internal.measurement.AbstractC6095p0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.measurement.internal.C6404k f42606C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(com.google.android.gms.measurement.internal.C6404k c6404k, android.content.Context context, java.lang.String str) {
        super(context, str, null, 1);
        this.f42606C = c6404k;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final android.database.sqlite.SQLiteDatabase getWritableDatabase() {
        if (!this.f42606C.f42483e.b(3600000L)) {
            throw new android.database.sqlite.SQLiteException("Database open failed");
        }
        try {
            return super.getWritableDatabase();
        } catch (android.database.sqlite.SQLiteException unused) {
            this.f42606C.f42483e.c();
            this.f42606C.j().G().a("Opening the database failed, dropping and recreating it");
            if (!this.f42606C.a().getDatabasePath("google_app_measurement.db").delete()) {
                this.f42606C.j().G().b("Failed to delete corrupted db file", "google_app_measurement.db");
            }
            try {
                android.database.sqlite.SQLiteDatabase writableDatabase = super.getWritableDatabase();
                this.f42606C.f42483e.a();
                return writableDatabase;
            } catch (android.database.sqlite.SQLiteException e6) {
                this.f42606C.j().G().b("Failed to open freshly created database", e6);
                throw e6;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        com.google.android.gms.measurement.internal.AbstractC6473u.b(this.f42606C.j(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i6, int i10) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        com.google.android.gms.measurement.internal.AbstractC6473u.c(this.f42606C.j(), sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", com.google.android.gms.measurement.internal.C6404k.f42472f);
        com.google.android.gms.measurement.internal.AbstractC6473u.c(this.f42606C.j(), sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
        com.google.android.gms.measurement.internal.AbstractC6473u.c(this.f42606C.j(), sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        com.google.android.gms.measurement.internal.AbstractC6473u.c(this.f42606C.j(), sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", com.google.android.gms.measurement.internal.C6404k.f42473g);
        com.google.android.gms.measurement.internal.AbstractC6473u.c(this.f42606C.j(), sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", com.google.android.gms.measurement.internal.C6404k.f42474h);
        com.google.android.gms.measurement.internal.AbstractC6473u.c(this.f42606C.j(), sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", com.google.android.gms.measurement.internal.C6404k.f42476j);
        com.google.android.gms.measurement.internal.AbstractC6473u.c(this.f42606C.j(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        com.google.android.gms.measurement.internal.AbstractC6473u.c(this.f42606C.j(), sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", com.google.android.gms.measurement.internal.C6404k.f42475i);
        com.google.android.gms.measurement.internal.AbstractC6473u.c(this.f42606C.j(), sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", com.google.android.gms.measurement.internal.C6404k.f42477k);
        com.google.android.gms.measurement.internal.AbstractC6473u.c(this.f42606C.j(), sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", com.google.android.gms.measurement.internal.C6404k.f42478l);
        com.google.android.gms.measurement.internal.AbstractC6473u.c(this.f42606C.j(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        com.google.android.gms.measurement.internal.AbstractC6473u.c(this.f42606C.j(), sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", com.google.android.gms.measurement.internal.C6404k.f42479m);
        com.google.android.gms.measurement.internal.AbstractC6473u.c(this.f42606C.j(), sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
        com.google.android.gms.measurement.internal.AbstractC6473u.c(this.f42606C.j(), sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
        com.google.android.gms.measurement.internal.AbstractC6473u.c(this.f42606C.j(), sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", com.google.android.gms.measurement.internal.C6404k.f42480n);
        if (com.google.android.gms.internal.measurement.C6066l7.a()) {
            com.google.android.gms.measurement.internal.AbstractC6473u.c(this.f42606C.j(), sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", com.google.android.gms.measurement.internal.C6404k.f42481o);
        }
        com.google.android.gms.measurement.internal.AbstractC6473u.c(this.f42606C.j(), sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i6, int i10) {
    }
}
