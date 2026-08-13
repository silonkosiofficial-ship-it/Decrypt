package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6404k extends com.google.android.gms.measurement.internal.E5 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.lang.String[] f42472f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.lang.String[] f42473g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final java.lang.String[] f42474h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final java.lang.String[] f42475i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final java.lang.String[] f42476j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final java.lang.String[] f42477k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final java.lang.String[] f42478l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final java.lang.String[] f42479m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final java.lang.String[] f42480n = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final java.lang.String[] f42481o = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.r f42482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.C6507y5 f42483e;

    C6404k(com.google.android.gms.measurement.internal.H5 h6) {
        super(h6);
        this.f42483e = new com.google.android.gms.measurement.internal.C6507y5(b());
        this.f42482d = new com.google.android.gms.measurement.internal.r(this, a(), "google_app_measurement.db");
    }

    private final long C0(java.lang.String str, java.lang.String[] strArr) {
        android.database.Cursor cursor = null;
        try {
            try {
                android.database.Cursor cursorRawQuery = B().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new android.database.sqlite.SQLiteException("Database returned empty set");
                }
                long j6 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j6;
            } catch (android.database.sqlite.SQLiteException e6) {
                j().G().c("Database error", str, e6);
                throw e6;
            }
        } catch (java.lang.Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    private final long G(java.lang.String str, java.lang.String[] strArr, long j6) {
        android.database.Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = B().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j6;
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (android.database.sqlite.SQLiteException e6) {
                j().G().c("Database error", str, e6);
                throw e6;
            }
        } catch (java.lang.Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    private final boolean G0(java.lang.String str, java.util.List list) {
        Q3.AbstractC1477p.f(str);
        u();
        n();
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseB = B();
        try {
            long jC0 = C0("select count(1) from audience_filter_values where app_id=?", new java.lang.String[]{str});
            int iMax = java.lang.Math.max(0, java.lang.Math.min(2000, d().w(str, com.google.android.gms.measurement.internal.G.f41826I)));
            if (jC0 <= iMax) {
                return false;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i6 = 0; i6 < list.size(); i6++) {
                java.lang.Integer num = (java.lang.Integer) list.get(i6);
                if (num == null) {
                    return false;
                }
                arrayList.add(java.lang.Integer.toString(num.intValue()));
            }
            java.lang.String str2 = "(" + android.text.TextUtils.join(",", arrayList) + ")";
            java.lang.StringBuilder sb = new java.lang.StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb.append(str2);
            sb.append(" order by rowid desc limit -1 offset ?)");
            return sQLiteDatabaseB.delete("audience_filter_values", sb.toString(), new java.lang.String[]{str, java.lang.Integer.toString(iMax)}) > 0;
        } catch (android.database.sqlite.SQLiteException e6) {
            j().G().c("Database error querying filters. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e6);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x012c  */
    /* JADX WARN: Multi-variable type inference failed */
    private final com.google.android.gms.measurement.internal.A J0(java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.Throwable {
        android.database.Cursor cursorQuery;
        java.lang.Boolean boolValueOf;
        Q3.AbstractC1477p.f(str2);
        Q3.AbstractC1477p.f(str3);
        n();
        u();
        p213v2.c.C0735c c0735c = 0;
        try {
            try {
                cursorQuery = B().query(str, (java.lang.String[]) new java.util.ArrayList(java.util.Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new java.lang.String[0]), "app_id=? and name=?", new java.lang.String[]{str2, str3}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j6 = cursorQuery.getLong(0);
                    long j10 = cursorQuery.getLong(1);
                    long j11 = cursorQuery.getLong(2);
                    long j12 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                    java.lang.Long lValueOf = cursorQuery.isNull(4) ? null : java.lang.Long.valueOf(cursorQuery.getLong(4));
                    java.lang.Long lValueOf2 = cursorQuery.isNull(5) ? null : java.lang.Long.valueOf(cursorQuery.getLong(5));
                    java.lang.Long lValueOf3 = cursorQuery.isNull(6) ? null : java.lang.Long.valueOf(cursorQuery.getLong(6));
                    if (cursorQuery.isNull(7)) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = java.lang.Boolean.valueOf(cursorQuery.getLong(7) == 1);
                    }
                    com.google.android.gms.measurement.internal.A a6 = new com.google.android.gms.measurement.internal.A(str2, str3, j6, j10, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j11, j12, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                    if (cursorQuery.moveToNext()) {
                        j().G().b("Got multiple records for event aggregates, expected one. appId", com.google.android.gms.measurement.internal.C6428n2.v(str2));
                    }
                    cursorQuery.close();
                    return a6;
                } catch (android.database.sqlite.SQLiteException e6) {
                    e = e6;
                    j().G().d("Error querying events. appId", com.google.android.gms.measurement.internal.C6428n2.v(str2), g().c(str3), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                c0735c = "current_bundle_count";
                if (c0735c != 0) {
                    c0735c.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e10) {
            e = e10;
            cursorQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (c0735c != 0) {
                c0735c.close();
            }
            throw th;
        }
    }

    private final java.lang.Object M(android.database.Cursor cursor, int i6) {
        int type = cursor.getType(i6);
        if (type == 0) {
            j().G().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return java.lang.Long.valueOf(cursor.getLong(i6));
        }
        if (type == 2) {
            return java.lang.Double.valueOf(cursor.getDouble(i6));
        }
        if (type == 3) {
            return cursor.getString(i6);
        }
        if (type != 4) {
            j().G().b("Loaded invalid unknown value type, ignoring it", java.lang.Integer.valueOf(type));
            return null;
        }
        j().G().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    private final java.lang.Object N(java.lang.String str, java.lang.String[] strArr, com.google.android.gms.measurement.internal.InterfaceC6459s interfaceC6459s) throws java.lang.Throwable {
        android.database.Cursor cursorRawQuery;
        ?? r6 = 0;
        try {
            try {
                cursorRawQuery = B().rawQuery(str, strArr);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        java.lang.Object objA = interfaceC6459s.a(cursorRawQuery);
                        cursorRawQuery.close();
                        return objA;
                    }
                    j().K().a("No data found");
                    cursorRawQuery.close();
                    return null;
                } catch (android.database.sqlite.SQLiteException e6) {
                    e = e6;
                    j().G().b("Error querying database.", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                r6 = str;
                if (r6 != 0) {
                    r6.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e10) {
            e = e10;
            cursorRawQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (r6 != 0) {
                r6.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    private final java.lang.String P(java.lang.String str, java.lang.String[] strArr, java.lang.String str2) {
        android.database.Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = B().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return str2;
                }
                java.lang.String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (android.database.sqlite.SQLiteException e6) {
                j().G().c("Database error", str, e6);
                throw e6;
            }
        } catch (java.lang.Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    private static void T(android.content.ContentValues contentValues, java.lang.String str, java.lang.Object obj) {
        Q3.AbstractC1477p.f(str);
        Q3.AbstractC1477p.l(obj);
        if (obj instanceof java.lang.String) {
            contentValues.put(str, (java.lang.String) obj);
        } else if (obj instanceof java.lang.Long) {
            contentValues.put(str, (java.lang.Long) obj);
        } else {
            if (!(obj instanceof java.lang.Double)) {
                throw new java.lang.IllegalArgumentException("Invalid value type");
            }
            contentValues.put(str, (java.lang.Double) obj);
        }
    }

    private final void V0(java.lang.String str, java.lang.String str2) {
        Q3.AbstractC1477p.f(str2);
        n();
        u();
        try {
            B().delete(str, "app_id=?", new java.lang.String[]{str2});
        } catch (android.database.sqlite.SQLiteException e6) {
            j().G().c("Error deleting snapshot. appId", com.google.android.gms.measurement.internal.C6428n2.v(str2), e6);
        }
    }

    private final void Z(java.lang.String str, com.google.android.gms.measurement.internal.A a6) {
        Q3.AbstractC1477p.l(a6);
        n();
        u();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", a6.f41689a);
        contentValues.put("name", a6.f41690b);
        contentValues.put("lifetime_count", java.lang.Long.valueOf(a6.f41691c));
        contentValues.put("current_bundle_count", java.lang.Long.valueOf(a6.f41692d));
        contentValues.put("last_fire_timestamp", java.lang.Long.valueOf(a6.f41694f));
        contentValues.put("last_bundled_timestamp", java.lang.Long.valueOf(a6.f41695g));
        contentValues.put("last_bundled_day", a6.f41696h);
        contentValues.put("last_sampled_complex_event_id", a6.f41697i);
        contentValues.put("last_sampling_rate", a6.f41698j);
        contentValues.put("current_session_count", java.lang.Long.valueOf(a6.f41693e));
        java.lang.Boolean bool = a6.f41699k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (B().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                j().G().b("Failed to insert/update event aggregates (got -1). appId", com.google.android.gms.measurement.internal.C6428n2.v(a6.f41689a));
            }
        } catch (android.database.sqlite.SQLiteException e6) {
            j().G().c("Error storing event aggregates. appId", com.google.android.gms.measurement.internal.C6428n2.v(a6.f41689a), e6);
        }
    }

    private final void b0(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        try {
            android.database.sqlite.SQLiteDatabase sQLiteDatabaseB = B();
            java.lang.String asString = contentValues.getAsString(str2);
            if (asString == null) {
                j().H().b("Value of the primary key is not set.", com.google.android.gms.measurement.internal.C6428n2.v(str2));
                return;
            }
            if (sQLiteDatabaseB.update(str, contentValues, str2 + " = ?", new java.lang.String[]{asString}) == 0 && sQLiteDatabaseB.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                j().G().c("Failed to insert/update table (got -1). key", com.google.android.gms.measurement.internal.C6428n2.v(str), com.google.android.gms.measurement.internal.C6428n2.v(str2));
            }
        } catch (android.database.sqlite.SQLiteException e6) {
            j().G().d("Error storing into table. key", com.google.android.gms.measurement.internal.C6428n2.v(str), com.google.android.gms.measurement.internal.C6428n2.v(str2), e6);
        }
    }

    private final boolean e0(long j6, com.google.android.gms.measurement.internal.B b6, long j10, boolean z6) {
        n();
        u();
        Q3.AbstractC1477p.l(b6);
        Q3.AbstractC1477p.f(b6.f41722a);
        byte[] bArrJ = o().E(b6).j();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", b6.f41722a);
        contentValues.put("name", b6.f41723b);
        contentValues.put("timestamp", java.lang.Long.valueOf(b6.f41725d));
        contentValues.put("metadata_fingerprint", java.lang.Long.valueOf(j10));
        contentValues.put("data", bArrJ);
        contentValues.put("realtime", java.lang.Integer.valueOf(z6 ? 1 : 0));
        try {
            long jUpdate = B().update("raw_events", contentValues, "rowid = ?", new java.lang.String[]{java.lang.String.valueOf(j6)});
            if (jUpdate == 1) {
                return true;
            }
            j().G().c("Failed to update raw event. appId, updatedRows", com.google.android.gms.measurement.internal.C6428n2.v(b6.f41722a), java.lang.Long.valueOf(jUpdate));
            return false;
        } catch (android.database.sqlite.SQLiteException e6) {
            j().G().c("Error updating raw event. appId", com.google.android.gms.measurement.internal.C6428n2.v(b6.f41722a), e6);
            return false;
        }
    }

    private final boolean j0(java.lang.String str, int i6, com.google.android.gms.internal.measurement.K1 k6) {
        u();
        n();
        Q3.AbstractC1477p.f(str);
        Q3.AbstractC1477p.l(k6);
        if (k6.M().isEmpty()) {
            j().L().d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", com.google.android.gms.measurement.internal.C6428n2.v(str), java.lang.Integer.valueOf(i6), java.lang.String.valueOf(k6.S() ? java.lang.Integer.valueOf(k6.I()) : null));
            return false;
        }
        byte[] bArrJ = k6.j();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", java.lang.Integer.valueOf(i6));
        contentValues.put("filter_id", k6.S() ? java.lang.Integer.valueOf(k6.I()) : null);
        contentValues.put("event_name", k6.M());
        contentValues.put("session_scoped", k6.T() ? java.lang.Boolean.valueOf(k6.Q()) : null);
        contentValues.put("data", bArrJ);
        try {
            if (B().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            j().G().b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.C6428n2.v(str));
            return true;
        } catch (android.database.sqlite.SQLiteException e6) {
            j().G().c("Error storing event filter. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e6);
            return false;
        }
    }

    private final boolean k0(java.lang.String str, int i6, com.google.android.gms.internal.measurement.N1 n6) {
        u();
        n();
        Q3.AbstractC1477p.f(str);
        Q3.AbstractC1477p.l(n6);
        if (n6.J().isEmpty()) {
            j().L().d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", com.google.android.gms.measurement.internal.C6428n2.v(str), java.lang.Integer.valueOf(i6), java.lang.String.valueOf(n6.N() ? java.lang.Integer.valueOf(n6.k()) : null));
            return false;
        }
        byte[] bArrJ = n6.j();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", java.lang.Integer.valueOf(i6));
        contentValues.put("filter_id", n6.N() ? java.lang.Integer.valueOf(n6.k()) : null);
        contentValues.put("property_name", n6.J());
        contentValues.put("session_scoped", n6.O() ? java.lang.Boolean.valueOf(n6.M()) : null);
        contentValues.put("data", bArrJ);
        try {
            if (B().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            j().G().b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.C6428n2.v(str));
            return false;
        } catch (android.database.sqlite.SQLiteException e6) {
            j().G().c("Error storing property filter. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e6);
            return false;
        }
    }

    private final java.lang.String z0() {
        long jA = b().a();
        p085i4.C c6 = p085i4.C.GOOGLE_SIGNAL;
        return "(" + ("(upload_type = " + c6.a() + " AND (ABS(creation_timestamp - " + jA + ") > CAST(" + ((java.lang.Long) com.google.android.gms.measurement.internal.G.f41822G.a(null)).longValue() + " AS INTEGER)))") + " OR " + ("(upload_type != " + c6.a() + " AND (ABS(creation_timestamp - " + jA + ") > CAST(" + com.google.android.gms.measurement.internal.C6376g.P() + " AS INTEGER)))") + ")";
    }

    public final long A() {
        return G("select max(timestamp) from raw_events", null, 0L);
    }

    public final long A0(java.lang.String str) {
        Q3.AbstractC1477p.f(str);
        n();
        u();
        return G("select first_open_count from app2 where app_id=?", new java.lang.String[]{str}, -1L);
    }

    final android.database.sqlite.SQLiteDatabase B() {
        n();
        try {
            return this.f42482d.getWritableDatabase();
        } catch (android.database.sqlite.SQLiteException e6) {
            j().L().b("Error opening database", e6);
            throw e6;
        }
    }

    protected final long B0(java.lang.String str, java.lang.String str2) {
        Q3.AbstractC1477p.f(str);
        Q3.AbstractC1477p.f(str2);
        n();
        u();
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseB = B();
        sQLiteDatabaseB.beginTransaction();
        long j6 = 0;
        try {
            try {
                long jG = G("select " + str2 + " from app2 where app_id=?", new java.lang.String[]{str}, -1L);
                if (jG == -1) {
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (java.lang.Integer) 0);
                    contentValues.put("previous_install_count", (java.lang.Integer) 0);
                    if (sQLiteDatabaseB.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        j().G().c("Failed to insert column (got -1). appId", com.google.android.gms.measurement.internal.C6428n2.v(str), str2);
                        return -1L;
                    }
                    jG = 0;
                    j().G().d("Error inserting column. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), str2, e);
                    return j6;
                }
                try {
                    android.content.ContentValues contentValues2 = new android.content.ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put(str2, java.lang.Long.valueOf(1 + jG));
                    if (sQLiteDatabaseB.update("app2", contentValues2, "app_id = ?", new java.lang.String[]{str}) == 0) {
                        j().G().c("Failed to update column (got 0). appId", com.google.android.gms.measurement.internal.C6428n2.v(str), str2);
                        return -1L;
                    }
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return jG;
                } catch (android.database.sqlite.SQLiteException e6) {
                    long j10 = jG;
                    e = e6;
                    j6 = j10;
                }
            } finally {
                sQLiteDatabaseB.endTransaction();
            }
        } catch (android.database.sqlite.SQLiteException e10) {
            e = e10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    public final java.lang.String C() throws java.lang.Throwable {
        java.lang.Throwable th;
        android.database.Cursor cursorRawQuery;
        ?? B6 = B();
        try {
            try {
                cursorRawQuery = B6.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        cursorRawQuery.close();
                        return null;
                    }
                    java.lang.String string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                    return string;
                } catch (android.database.sqlite.SQLiteException e6) {
                    e = e6;
                    j().G().b("Database error getting next bundle app id", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (B6 != 0) {
                    B6.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e10) {
            e = e10;
            cursorRawQuery = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            B6 = 0;
            if (B6 != 0) {
                B6.close();
            }
            throw th;
        }
    }

    public final int D(java.lang.String str, java.lang.String str2) {
        Q3.AbstractC1477p.f(str);
        Q3.AbstractC1477p.f(str2);
        n();
        u();
        try {
            return B().delete("conditional_properties", "app_id=? and name=?", new java.lang.String[]{str, str2});
        } catch (android.database.sqlite.SQLiteException e6) {
            j().G().d("Error deleting conditional property", com.google.android.gms.measurement.internal.C6428n2.v(str), g().g(str2), e6);
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0120  */
    /* JADX WARN: Code duplicated, block: B:51:0x0126  */
    public final java.util.List D0(java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.Throwable {
        java.lang.String str4;
        Q3.AbstractC1477p.f(str);
        n();
        u();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor cursorQuery = null;
        try {
            try {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(3);
                try {
                    arrayList2.add(str);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("app_id=?");
                    if (android.text.TextUtils.isEmpty(str2)) {
                        str4 = str2;
                    } else {
                        str4 = str2;
                        try {
                            arrayList2.add(str4);
                            sb.append(" and origin=?");
                        } catch (android.database.sqlite.SQLiteException e6) {
                            e = e6;
                            j().G().d("(2)Error querying user properties", com.google.android.gms.measurement.internal.C6428n2.v(str), str4, e);
                            java.util.List listEmptyList = java.util.Collections.emptyList();
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return listEmptyList;
                        }
                    }
                    if (!android.text.TextUtils.isEmpty(str3)) {
                        arrayList2.add(str3 + "*");
                        sb.append(" and name glob ?");
                    }
                    cursorQuery = B().query("user_attributes", new java.lang.String[]{"name", "set_timestamp", "value", "origin"}, sb.toString(), (java.lang.String[]) arrayList2.toArray(new java.lang.String[arrayList2.size()]), null, null, "rowid", "1001");
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return arrayList;
                    }
                    while (arrayList.size() < 1000) {
                        java.lang.String string = cursorQuery.getString(0);
                        long j6 = cursorQuery.getLong(1);
                        try {
                            try {
                                java.lang.Object objM = M(cursorQuery, 2);
                                java.lang.String string2 = cursorQuery.getString(3);
                                if (objM == null) {
                                    try {
                                        j().G().d("(2)Read invalid user property value, ignoring it", com.google.android.gms.measurement.internal.C6428n2.v(str), string2, str3);
                                    } catch (android.database.sqlite.SQLiteException e10) {
                                        e = e10;
                                        str4 = string2;
                                        j().G().d("(2)Error querying user properties", com.google.android.gms.measurement.internal.C6428n2.v(str), str4, e);
                                        java.util.List listEmptyList2 = java.util.Collections.emptyList();
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        return listEmptyList2;
                                    }
                                } else {
                                    arrayList.add(new com.google.android.gms.measurement.internal.a6(str, string2, string, j6, objM));
                                }
                                if (!cursorQuery.moveToNext()) {
                                    cursorQuery.close();
                                    return arrayList;
                                }
                                str4 = string2;
                            } catch (android.database.sqlite.SQLiteException e11) {
                                e = e11;
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            throw th;
                        }
                    }
                    j().G().b("Read more than the max allowed user properties, ignoring excess", 1000);
                    cursorQuery.close();
                    return arrayList;
                } catch (android.database.sqlite.SQLiteException e12) {
                    e = e12;
                    str4 = str2;
                    j().G().d("(2)Error querying user properties", com.google.android.gms.measurement.internal.C6428n2.v(str), str4, e);
                    java.util.List listEmptyList3 = java.util.Collections.emptyList();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return listEmptyList3;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e13) {
            e = e13;
        }
    }

    public final long E(com.google.android.gms.internal.measurement.C6105q2 c6105q2) {
        n();
        u();
        Q3.AbstractC1477p.l(c6105q2);
        Q3.AbstractC1477p.f(c6105q2.x2());
        byte[] bArrJ = c6105q2.j();
        long jA = o().A(bArrJ);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", c6105q2.x2());
        contentValues.put("metadata_fingerprint", java.lang.Long.valueOf(jA));
        contentValues.put("metadata", bArrJ);
        try {
            B().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jA;
        } catch (android.database.sqlite.SQLiteException e6) {
            j().G().c("Error storing raw event metadata. appId", com.google.android.gms.measurement.internal.C6428n2.v(c6105q2.x2()), e6);
            throw e6;
        }
    }

    public final void E0(java.lang.String str, com.google.android.gms.measurement.internal.A3 a6) {
        Q3.AbstractC1477p.l(str);
        Q3.AbstractC1477p.l(a6);
        n();
        u();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", a6.x());
        contentValues.put("consent_source", java.lang.Integer.valueOf(a6.b()));
        b0("consent_settings", "app_id", contentValues);
    }

    public final long F(java.lang.String str) {
        Q3.AbstractC1477p.f(str);
        n();
        u();
        try {
            return B().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new java.lang.String[]{str, java.lang.String.valueOf(java.lang.Math.max(0, java.lang.Math.min(1000000, d().w(str, com.google.android.gms.measurement.internal.G.f41907q))))});
        } catch (android.database.sqlite.SQLiteException e6) {
            j().G().c("Error deleting over the limit events. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e6);
            return 0L;
        }
    }

    final boolean F0(java.lang.String str, android.os.Bundle bundle) {
        n();
        u();
        byte[] bArrJ = o().E(new com.google.android.gms.measurement.internal.B(this.f42679a, "", str, "dep", 0L, 0L, bundle)).j();
        j().K().c("Saving default event parameters, appId, data size", g().c(str), java.lang.Integer.valueOf(bArrJ.length));
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrJ);
        try {
            if (B().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            j().G().b("Failed to insert default event parameters (got -1). appId", com.google.android.gms.measurement.internal.C6428n2.v(str));
            return false;
        } catch (android.database.sqlite.SQLiteException e6) {
            j().G().c("Error storing default event parameters. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e6);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0031: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:10:0x0031 */
    public final android.util.Pair H(java.lang.String str, java.lang.Long l6) throws java.lang.Throwable {
        android.database.Cursor cursorRawQuery;
        android.database.Cursor cursor;
        n();
        u();
        android.database.Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = B().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new java.lang.String[]{str, java.lang.String.valueOf(l6)});
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        j().K().a("Main event not found");
                        cursorRawQuery.close();
                        return null;
                    }
                    try {
                        android.util.Pair pairCreate = android.util.Pair.create((com.google.android.gms.internal.measurement.C6061l2) ((com.google.android.gms.internal.measurement.AbstractC6130t4) ((com.google.android.gms.internal.measurement.C6061l2.a) com.google.android.gms.measurement.internal.Z5.G(com.google.android.gms.internal.measurement.C6061l2.R(), cursorRawQuery.getBlob(0))).q()), java.lang.Long.valueOf(cursorRawQuery.getLong(1)));
                        cursorRawQuery.close();
                        return pairCreate;
                    } catch (java.io.IOException e6) {
                        j().G().d("Failed to merge main event. appId, eventId", com.google.android.gms.measurement.internal.C6428n2.v(str), l6, e6);
                        cursorRawQuery.close();
                        return null;
                    }
                } catch (android.database.sqlite.SQLiteException e10) {
                    e = e10;
                    j().G().b("Error selecting main event", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e11) {
            e = e11;
            cursorRawQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    public final long H0(java.lang.String str) {
        Q3.AbstractC1477p.f(str);
        return G("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new java.lang.String[]{str}, 0L);
    }

    public final com.google.android.gms.measurement.internal.C6432o I(long j6, java.lang.String str, long j10, boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        Q3.AbstractC1477p.f(str);
        n();
        u();
        java.lang.String[] strArr = {str};
        com.google.android.gms.measurement.internal.C6432o c6432o = new com.google.android.gms.measurement.internal.C6432o();
        android.database.Cursor cursor = null;
        try {
            try {
                android.database.sqlite.SQLiteDatabase sQLiteDatabaseB = B();
                android.database.Cursor cursorQuery = sQLiteDatabaseB.query("apps", new java.lang.String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new java.lang.String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    j().L().b("Not updating daily counts, app is not known. appId", com.google.android.gms.measurement.internal.C6428n2.v(str));
                    cursorQuery.close();
                    return c6432o;
                }
                if (cursorQuery.getLong(0) == j6) {
                    c6432o.f42560b = cursorQuery.getLong(1);
                    c6432o.f42559a = cursorQuery.getLong(2);
                    c6432o.f42561c = cursorQuery.getLong(3);
                    c6432o.f42562d = cursorQuery.getLong(4);
                    c6432o.f42563e = cursorQuery.getLong(5);
                    c6432o.f42564f = cursorQuery.getLong(6);
                    c6432o.f42565g = cursorQuery.getLong(7);
                }
                if (z6) {
                    c6432o.f42560b += j10;
                }
                if (z10) {
                    c6432o.f42559a += j10;
                }
                if (z11) {
                    c6432o.f42561c += j10;
                }
                if (z12) {
                    c6432o.f42562d += j10;
                }
                if (z13) {
                    c6432o.f42563e += j10;
                }
                if (z14) {
                    c6432o.f42564f += j10;
                }
                if (z15) {
                    c6432o.f42565g += j10;
                }
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("day", java.lang.Long.valueOf(j6));
                contentValues.put("daily_public_events_count", java.lang.Long.valueOf(c6432o.f42559a));
                contentValues.put("daily_events_count", java.lang.Long.valueOf(c6432o.f42560b));
                contentValues.put("daily_conversions_count", java.lang.Long.valueOf(c6432o.f42561c));
                contentValues.put("daily_error_events_count", java.lang.Long.valueOf(c6432o.f42562d));
                contentValues.put("daily_realtime_events_count", java.lang.Long.valueOf(c6432o.f42563e));
                contentValues.put("daily_realtime_dcu_count", java.lang.Long.valueOf(c6432o.f42564f));
                contentValues.put("daily_registered_triggers_count", java.lang.Long.valueOf(c6432o.f42565g));
                sQLiteDatabaseB.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return c6432o;
            } catch (android.database.sqlite.SQLiteException e6) {
                j().G().c("Error updating daily counts. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e6);
                if (0 != 0) {
                    cursor.close();
                }
                return c6432o;
            }
        } catch (java.lang.Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x011c  */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0053: MOVE (r8 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:14:0x0053 */
    public final com.google.android.gms.measurement.internal.C6362e I0(java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        android.database.Cursor cursorQuery;
        android.database.Cursor cursor;
        Q3.AbstractC1477p.f(str);
        Q3.AbstractC1477p.f(str2);
        n();
        u();
        android.database.Cursor cursor2 = null;
        try {
            try {
                cursorQuery = B().query("conditional_properties", new java.lang.String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new java.lang.String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    java.lang.String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    java.lang.String str3 = string;
                    java.lang.Object objM = M(cursorQuery, 1);
                    boolean z6 = cursorQuery.getInt(2) != 0;
                    java.lang.String string2 = cursorQuery.getString(3);
                    long j6 = cursorQuery.getLong(4);
                    com.google.android.gms.measurement.internal.Z5 z5O = o();
                    byte[] blob = cursorQuery.getBlob(5);
                    android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.E> creator = com.google.android.gms.measurement.internal.E.CREATOR;
                    com.google.android.gms.measurement.internal.C6362e c6362e = new com.google.android.gms.measurement.internal.C6362e(str, str3, new com.google.android.gms.measurement.internal.Y5(str2, cursorQuery.getLong(8), objM, str3), cursorQuery.getLong(6), z6, string2, (com.google.android.gms.measurement.internal.E) z5O.D(blob, creator), j6, (com.google.android.gms.measurement.internal.E) o().D(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (com.google.android.gms.measurement.internal.E) o().D(cursorQuery.getBlob(10), creator));
                    if (cursorQuery.moveToNext()) {
                        j().G().c("Got multiple records for conditional property, expected one", com.google.android.gms.measurement.internal.C6428n2.v(str), g().g(str2));
                    }
                    cursorQuery.close();
                    return c6362e;
                } catch (android.database.sqlite.SQLiteException e6) {
                    e = e6;
                    j().G().d("Error querying conditional property", com.google.android.gms.measurement.internal.C6428n2.v(str), g().g(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e10) {
            e = e10;
            cursorQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    public final com.google.android.gms.measurement.internal.C6432o J(long j6, java.lang.String str, boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        return I(j6, str, 1L, false, false, z11, false, z13, z14, z15);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x002d: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:10:0x002d */
    public final android.os.Bundle K0(java.lang.String str) throws java.lang.Throwable {
        android.database.Cursor cursorRawQuery;
        android.database.Cursor cursor;
        n();
        u();
        android.database.Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = B().rawQuery("select parameters from default_event_params where app_id=?", new java.lang.String[]{str});
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        j().K().a("Default event parameters not found");
                        cursorRawQuery.close();
                        return null;
                    }
                    try {
                        com.google.android.gms.internal.measurement.C6061l2 c6061l2 = (com.google.android.gms.internal.measurement.C6061l2) ((com.google.android.gms.internal.measurement.AbstractC6130t4) ((com.google.android.gms.internal.measurement.C6061l2.a) com.google.android.gms.measurement.internal.Z5.G(com.google.android.gms.internal.measurement.C6061l2.R(), cursorRawQuery.getBlob(0))).q());
                        o();
                        android.os.Bundle bundleB = com.google.android.gms.measurement.internal.Z5.B(c6061l2.U());
                        cursorRawQuery.close();
                        return bundleB;
                    } catch (java.io.IOException e6) {
                        j().G().c("Failed to retrieve default event parameters. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e6);
                        cursorRawQuery.close();
                        return null;
                    }
                } catch (android.database.sqlite.SQLiteException e10) {
                    e = e10;
                    j().G().b("Error selecting default event parameters", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e11) {
            e = e11;
            cursorRawQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    public final com.google.android.gms.measurement.internal.A L0(java.lang.String str, java.lang.String str2) {
        return J0("events", str, str2);
    }

    public final com.google.android.gms.measurement.internal.C6351c2 M0(java.lang.String str) {
        android.database.Cursor cursorQuery;
        java.lang.Boolean boolValueOf;
        Q3.AbstractC1477p.f(str);
        n();
        u();
        android.database.Cursor cursor = null;
        try {
            cursorQuery = B().query("apps", new java.lang.String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info"}, "app_id=?", new java.lang.String[]{str}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    com.google.android.gms.measurement.internal.C6351c2 c6351c2 = new com.google.android.gms.measurement.internal.C6351c2(this.f41809b.t0(), str);
                    if (!com.google.android.gms.internal.measurement.C6038i6.a() || !d().t(com.google.android.gms.measurement.internal.G.f41861Z0) || this.f41809b.U(str).m(com.google.android.gms.measurement.internal.A3.a.ANALYTICS_STORAGE)) {
                        c6351c2.J(cursorQuery.getString(0));
                    }
                    c6351c2.Z(cursorQuery.getString(1));
                    if (!com.google.android.gms.internal.measurement.C6038i6.a() || !d().t(com.google.android.gms.measurement.internal.G.f41861Z0) || this.f41809b.U(str).m(com.google.android.gms.measurement.internal.A3.a.AD_STORAGE)) {
                        c6351c2.f0(cursorQuery.getString(2));
                    }
                    c6351c2.A0(cursorQuery.getLong(3));
                    c6351c2.C0(cursorQuery.getLong(4));
                    c6351c2.y0(cursorQuery.getLong(5));
                    c6351c2.S(cursorQuery.getString(6));
                    c6351c2.O(cursorQuery.getString(7));
                    c6351c2.u0(cursorQuery.getLong(8));
                    c6351c2.n0(cursorQuery.getLong(9));
                    c6351c2.K(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                    c6351c2.k0(cursorQuery.getLong(11));
                    c6351c2.e0(cursorQuery.getLong(12));
                    c6351c2.b0(cursorQuery.getLong(13));
                    c6351c2.V(cursorQuery.getLong(14));
                    c6351c2.R(cursorQuery.getLong(15));
                    c6351c2.s0(cursorQuery.getLong(16));
                    c6351c2.H(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                    c6351c2.W(cursorQuery.getString(18));
                    c6351c2.Y(cursorQuery.getLong(19));
                    c6351c2.h0(cursorQuery.getLong(20));
                    c6351c2.c0(cursorQuery.getString(21));
                    c6351c2.h(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                    c6351c2.f(cursorQuery.getString(24));
                    c6351c2.q0(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                    if (!cursorQuery.isNull(26)) {
                        c6351c2.g(java.util.Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                    }
                    if (!com.google.android.gms.internal.measurement.C6038i6.a() || !d().t(com.google.android.gms.measurement.internal.G.f41861Z0) || this.f41809b.U(str).m(com.google.android.gms.measurement.internal.A3.a.ANALYTICS_STORAGE)) {
                        c6351c2.l0(cursorQuery.getString(28));
                    }
                    if (com.google.android.gms.internal.measurement.s7.a() && d().t(com.google.android.gms.measurement.internal.G.f41924y0)) {
                        i();
                        if (com.google.android.gms.measurement.internal.d6.H0(str)) {
                            c6351c2.P((cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true);
                            c6351c2.w0(cursorQuery.getLong(39));
                            if (d().t(com.google.android.gms.measurement.internal.G.f41926z0)) {
                                c6351c2.o0(cursorQuery.getString(36));
                            }
                        }
                    }
                    c6351c2.G0(cursorQuery.getLong(30));
                    c6351c2.E0(cursorQuery.getLong(31));
                    if (com.google.android.gms.internal.measurement.C6066l7.a() && d().F(str, com.google.android.gms.measurement.internal.G.f41827I0)) {
                        c6351c2.b(cursorQuery.getInt(32));
                        c6351c2.N(cursorQuery.getLong(35));
                    }
                    c6351c2.T((cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true);
                    if (cursorQuery.isNull(34)) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = java.lang.Boolean.valueOf(cursorQuery.getInt(34) != 0);
                    }
                    c6351c2.d(boolValueOf);
                    c6351c2.M(cursorQuery.getInt(37));
                    c6351c2.G(cursorQuery.getInt(38));
                    c6351c2.i0(cursorQuery.isNull(40) ? "" : (java.lang.String) Q3.AbstractC1477p.l(cursorQuery.getString(40)));
                    if (d().t(com.google.android.gms.measurement.internal.G.f41857X0)) {
                        if (!cursorQuery.isNull(41)) {
                            c6351c2.e(java.lang.Long.valueOf(cursorQuery.getLong(41)));
                        }
                        if (!cursorQuery.isNull(42)) {
                            c6351c2.I(java.lang.Long.valueOf(cursorQuery.getLong(42)));
                        }
                    }
                    if (com.google.android.gms.internal.measurement.S6.a() && d().F(str, com.google.android.gms.measurement.internal.G.f41853V0)) {
                        c6351c2.i(cursorQuery.getBlob(43));
                    }
                    c6351c2.x();
                    if (cursorQuery.moveToNext()) {
                        j().G().b("Got multiple records for app, expected one. appId", com.google.android.gms.measurement.internal.C6428n2.v(str));
                    }
                    cursorQuery.close();
                    return c6351c2;
                } catch (android.database.sqlite.SQLiteException e6) {
                    e = e6;
                    j().G().c("Error querying app. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cursor = cursorQuery;
            }
        } catch (android.database.sqlite.SQLiteException e10) {
            e = e10;
            cursorQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        th = th;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:19:0x006a */
    public final com.google.android.gms.measurement.internal.a6 N0(java.lang.String str, java.lang.String str2) {
        android.database.Cursor cursorQuery;
        android.database.Cursor cursor;
        Q3.AbstractC1477p.f(str);
        Q3.AbstractC1477p.f(str2);
        n();
        u();
        android.database.Cursor cursor2 = null;
        try {
            try {
                cursorQuery = B().query("user_attributes", new java.lang.String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new java.lang.String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j6 = cursorQuery.getLong(0);
                    java.lang.Object objM = M(cursorQuery, 1);
                    if (objM == null) {
                        cursorQuery.close();
                        return null;
                    }
                    com.google.android.gms.measurement.internal.a6 a6Var = new com.google.android.gms.measurement.internal.a6(str, cursorQuery.getString(2), str2, j6, objM);
                    if (cursorQuery.moveToNext()) {
                        j().G().b("Got multiple records for user property, expected one. appId", com.google.android.gms.measurement.internal.C6428n2.v(str));
                    }
                    cursorQuery.close();
                    return a6Var;
                } catch (android.database.sqlite.SQLiteException e6) {
                    e = e6;
                    j().G().d("Error querying user property. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), g().g(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e10) {
            e = e10;
            cursorQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r4v0, types: [long] */
    public final java.lang.String O(long j6) throws java.lang.Throwable {
        android.database.Cursor cursorRawQuery;
        n();
        u();
        ?? r6 = 0;
        try {
            try {
                cursorRawQuery = B().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new java.lang.String[]{java.lang.String.valueOf((long) j6)});
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        java.lang.String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                    j().K().a("No expired configs for apps with pending events");
                    cursorRawQuery.close();
                    return null;
                } catch (android.database.sqlite.SQLiteException e6) {
                    e = e6;
                    j().G().b("Error selecting expired configs", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                r6 = j6;
                if (r6 != 0) {
                    r6.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e10) {
            e = e10;
            cursorRawQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (r6 != 0) {
                r6.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0059: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:14:0x0059 */
    public final com.google.android.gms.measurement.internal.C6411l O0(java.lang.String str) {
        android.database.Cursor cursorQuery;
        android.database.Cursor cursor;
        Q3.AbstractC1477p.f(str);
        n();
        u();
        android.database.Cursor cursor2 = null;
        try {
            try {
                cursorQuery = B().query("apps", new java.lang.String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new java.lang.String[]{str}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    byte[] blob = cursorQuery.getBlob(0);
                    java.lang.String string = cursorQuery.getString(1);
                    java.lang.String string2 = cursorQuery.getString(2);
                    if (cursorQuery.moveToNext()) {
                        j().G().b("Got multiple records for app config, expected one. appId", com.google.android.gms.measurement.internal.C6428n2.v(str));
                    }
                    if (blob == null) {
                        cursorQuery.close();
                        return null;
                    }
                    com.google.android.gms.measurement.internal.C6411l c6411l = new com.google.android.gms.measurement.internal.C6411l(blob, string, string2);
                    cursorQuery.close();
                    return c6411l;
                } catch (android.database.sqlite.SQLiteException e6) {
                    e = e6;
                    j().G().c("Error querying remote config. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e10) {
            e = e10;
            cursorQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    final java.util.Map P0(java.lang.String str, java.lang.String str2) {
        u();
        n();
        Q3.AbstractC1477p.f(str);
        Q3.AbstractC1477p.f(str2);
        p170r.C7026a c7026a = new p170r.C7026a();
        android.database.Cursor cursor = null;
        try {
            try {
                android.database.Cursor cursorQuery = B().query("event_filters", new java.lang.String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new java.lang.String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    java.util.Map mapEmptyMap = java.util.Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.K1 k6 = (com.google.android.gms.internal.measurement.K1) ((com.google.android.gms.internal.measurement.AbstractC6130t4) ((com.google.android.gms.internal.measurement.K1.a) com.google.android.gms.measurement.internal.Z5.G(com.google.android.gms.internal.measurement.K1.J(), cursorQuery.getBlob(1))).q());
                        int i6 = cursorQuery.getInt(0);
                        java.util.List arrayList = (java.util.List) c7026a.get(java.lang.Integer.valueOf(i6));
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                            c7026a.put(java.lang.Integer.valueOf(i6), arrayList);
                        }
                        arrayList.add(k6);
                    } catch (java.io.IOException e6) {
                        j().G().c("Failed to merge filter. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e6);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c7026a;
            } catch (android.database.sqlite.SQLiteException e10) {
                j().G().c("Database error querying filters. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e10);
                java.util.Map mapEmptyMap2 = java.util.Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (java.lang.Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final java.util.List Q(java.lang.String str, int i6, int i10) {
        com.google.android.gms.measurement.internal.C6442p2 c6442p2G;
        java.lang.String str2;
        java.lang.Object objV;
        long jO;
        long jO2;
        n();
        u();
        int i11 = 1;
        Q3.AbstractC1477p.a(i6 > 0);
        Q3.AbstractC1477p.a(i10 > 0);
        Q3.AbstractC1477p.f(str);
        android.database.Cursor cursor = null;
        try {
            try {
                android.database.Cursor cursorQuery = B().query("queue", new java.lang.String[]{"rowid", "data", "retry_count"}, "app_id=?", new java.lang.String[]{str}, null, null, "rowid", java.lang.String.valueOf(i6));
                if (!cursorQuery.moveToFirst()) {
                    java.util.List listEmptyList = java.util.Collections.emptyList();
                    cursorQuery.close();
                    return listEmptyList;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int length = 0;
                while (true) {
                    long j6 = cursorQuery.getLong(0);
                    try {
                        byte[] bArrJ0 = o().j0(cursorQuery.getBlob(i11));
                        if (!arrayList.isEmpty() && bArrJ0.length + length > i10) {
                            break;
                        }
                        try {
                            com.google.android.gms.internal.measurement.C6105q2.a aVar = (com.google.android.gms.internal.measurement.C6105q2.a) com.google.android.gms.measurement.internal.Z5.G(com.google.android.gms.internal.measurement.C6105q2.u2(), bArrJ0);
                            if (!arrayList.isEmpty()) {
                                com.google.android.gms.internal.measurement.C6105q2 c6105q2 = (com.google.android.gms.internal.measurement.C6105q2) ((android.util.Pair) arrayList.get(0)).first;
                                com.google.android.gms.internal.measurement.C6105q2 c6105q3 = (com.google.android.gms.internal.measurement.C6105q2) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVar.q());
                                if (!c6105q2.X().equals(c6105q3.X()) || !c6105q2.W().equals(c6105q3.W()) || c6105q2.o0() != c6105q3.o0() || !c6105q2.Y().equals(c6105q3.Y())) {
                                    break;
                                }
                                java.util.Iterator it = c6105q2.m0().iterator();
                                while (true) {
                                    jO = -1;
                                    if (!it.hasNext()) {
                                        jO2 = -1;
                                        break;
                                    }
                                    com.google.android.gms.internal.measurement.C6136u2 c6136u2 = (com.google.android.gms.internal.measurement.C6136u2) it.next();
                                    if ("_npa".equals(c6136u2.T())) {
                                        jO2 = c6136u2.O();
                                        break;
                                    }
                                }
                                for (com.google.android.gms.internal.measurement.C6136u2 c6136u3 : c6105q3.m0()) {
                                    if ("_npa".equals(c6136u3.T())) {
                                        jO = c6136u3.O();
                                        break;
                                    }
                                }
                                if (jO2 != jO) {
                                    break;
                                }
                            }
                            if (!cursorQuery.isNull(2)) {
                                aVar.E0(cursorQuery.getInt(2));
                            }
                            length += bArrJ0.length;
                            arrayList.add(android.util.Pair.create((com.google.android.gms.internal.measurement.C6105q2) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVar.q()), java.lang.Long.valueOf(j6)));
                        } catch (java.io.IOException e6) {
                            e = e6;
                            c6442p2G = j().G();
                            str2 = "Failed to merge queued bundle. appId";
                            objV = com.google.android.gms.measurement.internal.C6428n2.v(str);
                            c6442p2G.c(str2, objV, e);
                        }
                        if (!cursorQuery.moveToNext() || length > i10) {
                            break;
                        }
                        i11 = 1;
                    } catch (java.io.IOException e10) {
                        e = e10;
                        c6442p2G = j().G();
                        str2 = "Failed to unzip queued bundle. appId";
                        objV = com.google.android.gms.measurement.internal.C6428n2.v(str);
                    }
                }
                cursorQuery.close();
                return arrayList;
            } catch (android.database.sqlite.SQLiteException e11) {
                j().G().c("Error querying bundles. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e11);
                java.util.List listEmptyList2 = java.util.Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return listEmptyList2;
            }
        } catch (java.lang.Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final com.google.android.gms.measurement.internal.C6480v Q0(java.lang.String str) {
        Q3.AbstractC1477p.l(str);
        n();
        u();
        return com.google.android.gms.measurement.internal.C6480v.d(P("select dma_consent_settings from consent_settings where app_id=? limit 1;", new java.lang.String[]{str}, ""));
    }

    public final java.util.List R(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Q3.AbstractC1477p.f(str);
        n();
        u();
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        arrayList.add(str);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("app_id=?");
        if (!android.text.TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!android.text.TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return S(sb.toString(), (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]));
    }

    final java.util.Map R0(java.lang.String str, java.lang.String str2) {
        u();
        n();
        Q3.AbstractC1477p.f(str);
        Q3.AbstractC1477p.f(str2);
        p170r.C7026a c7026a = new p170r.C7026a();
        android.database.Cursor cursor = null;
        try {
            try {
                android.database.Cursor cursorQuery = B().query("property_filters", new java.lang.String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new java.lang.String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    java.util.Map mapEmptyMap = java.util.Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.N1 n6 = (com.google.android.gms.internal.measurement.N1) ((com.google.android.gms.internal.measurement.AbstractC6130t4) ((com.google.android.gms.internal.measurement.N1.a) com.google.android.gms.measurement.internal.Z5.G(com.google.android.gms.internal.measurement.N1.H(), cursorQuery.getBlob(1))).q());
                        int i6 = cursorQuery.getInt(0);
                        java.util.List arrayList = (java.util.List) c7026a.get(java.lang.Integer.valueOf(i6));
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                            c7026a.put(java.lang.Integer.valueOf(i6), arrayList);
                        }
                        arrayList.add(n6);
                    } catch (java.io.IOException e6) {
                        j().G().c("Failed to merge filter", com.google.android.gms.measurement.internal.C6428n2.v(str), e6);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c7026a;
            } catch (android.database.sqlite.SQLiteException e10) {
                j().G().c("Database error querying filters. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e10);
                java.util.Map mapEmptyMap2 = java.util.Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (java.lang.Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final java.util.List S(java.lang.String str, java.lang.String[] strArr) {
        n();
        u();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = B().query("conditional_properties", new java.lang.String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                while (arrayList.size() < 1000) {
                    java.lang.String string = cursorQuery.getString(0);
                    java.lang.String string2 = cursorQuery.getString(1);
                    java.lang.String string3 = cursorQuery.getString(2);
                    java.lang.Object objM = M(cursorQuery, 3);
                    boolean z6 = cursorQuery.getInt(4) != 0;
                    java.lang.String string4 = cursorQuery.getString(5);
                    long j6 = cursorQuery.getLong(6);
                    com.google.android.gms.measurement.internal.Z5 z5O = o();
                    byte[] blob = cursorQuery.getBlob(7);
                    android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.E> creator = com.google.android.gms.measurement.internal.E.CREATOR;
                    com.google.android.gms.measurement.internal.E e6 = (com.google.android.gms.measurement.internal.E) z5O.D(blob, creator);
                    arrayList.add(new com.google.android.gms.measurement.internal.C6362e(string, string2, new com.google.android.gms.measurement.internal.Y5(string3, cursorQuery.getLong(10), objM, string2), cursorQuery.getLong(8), z6, string4, e6, j6, (com.google.android.gms.measurement.internal.E) o().D(cursorQuery.getBlob(9), creator), cursorQuery.getLong(11), (com.google.android.gms.measurement.internal.E) o().D(cursorQuery.getBlob(12), creator)));
                    if (!cursorQuery.moveToNext()) {
                        cursorQuery.close();
                        return arrayList;
                    }
                }
                j().G().b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                cursorQuery.close();
                return arrayList;
            } catch (android.database.sqlite.SQLiteException e10) {
                j().G().b("Error querying conditional user property value", e10);
                java.util.List listEmptyList = java.util.Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (java.lang.Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final com.google.android.gms.measurement.internal.A3 S0(java.lang.String str) {
        Q3.AbstractC1477p.l(str);
        n();
        u();
        return com.google.android.gms.measurement.internal.A3.q(P("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new java.lang.String[]{str}, ""));
    }

    public final void T0(java.lang.String str, java.lang.String str2) {
        Q3.AbstractC1477p.f(str);
        Q3.AbstractC1477p.f(str2);
        n();
        u();
        try {
            B().delete("user_attributes", "app_id=? and name=?", new java.lang.String[]{str, str2});
        } catch (android.database.sqlite.SQLiteException e6) {
            j().G().d("Error deleting user property. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), g().g(str2), e6);
        }
    }

    public final void U(com.google.android.gms.measurement.internal.A a6) {
        Z("events", a6);
    }

    public final com.google.android.gms.measurement.internal.A3 U0(java.lang.String str) {
        Q3.AbstractC1477p.l(str);
        n();
        u();
        com.google.android.gms.measurement.internal.A3 a6 = (com.google.android.gms.measurement.internal.A3) N("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new java.lang.String[]{str}, new com.google.android.gms.measurement.internal.InterfaceC6459s() { // from class: com.google.android.gms.measurement.internal.m
            @Override // com.google.android.gms.measurement.internal.InterfaceC6459s
            public final java.lang.Object a(android.database.Cursor cursor) {
                return com.google.android.gms.measurement.internal.A3.f(cursor.getString(0), cursor.getInt(1));
            }
        });
        return a6 == null ? com.google.android.gms.measurement.internal.A3.f41705c : a6;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0045  */
    public final void V(com.google.android.gms.measurement.internal.C6351c2 c6351c2, boolean z6, boolean z10) {
        Q3.AbstractC1477p.l(c6351c2);
        n();
        u();
        java.lang.String strL = c6351c2.l();
        Q3.AbstractC1477p.l(strL);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", strL);
        if (!com.google.android.gms.internal.measurement.C6038i6.a() || !d().t(com.google.android.gms.measurement.internal.G.f41861Z0)) {
            contentValues.put("app_instance_id", c6351c2.m());
        } else if (z6) {
            contentValues.put("app_instance_id", (java.lang.String) null);
        } else if (this.f41809b.U(strL).m(com.google.android.gms.measurement.internal.A3.a.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", c6351c2.m());
        }
        contentValues.put("gmp_app_id", c6351c2.q());
        if (!com.google.android.gms.internal.measurement.C6038i6.a() || !d().t(com.google.android.gms.measurement.internal.G.f41861Z0) || this.f41809b.U(strL).m(com.google.android.gms.measurement.internal.A3.a.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", c6351c2.s());
        }
        contentValues.put("last_bundle_index", java.lang.Long.valueOf(c6351c2.F0()));
        contentValues.put("last_bundle_start_timestamp", java.lang.Long.valueOf(c6351c2.H0()));
        contentValues.put("last_bundle_end_timestamp", java.lang.Long.valueOf(c6351c2.D0()));
        contentValues.put("app_version", c6351c2.o());
        contentValues.put("app_store", c6351c2.n());
        contentValues.put("gmp_version", java.lang.Long.valueOf(c6351c2.z0()));
        contentValues.put("dev_cert_hash", java.lang.Long.valueOf(c6351c2.t0()));
        contentValues.put("measurement_enabled", java.lang.Boolean.valueOf(c6351c2.A()));
        contentValues.put("day", java.lang.Long.valueOf(c6351c2.r0()));
        contentValues.put("daily_public_events_count", java.lang.Long.valueOf(c6351c2.m0()));
        contentValues.put("daily_events_count", java.lang.Long.valueOf(c6351c2.j0()));
        contentValues.put("daily_conversions_count", java.lang.Long.valueOf(c6351c2.d0()));
        contentValues.put("config_fetched_time", java.lang.Long.valueOf(c6351c2.a0()));
        contentValues.put("failed_config_fetch_time", java.lang.Long.valueOf(c6351c2.x0()));
        contentValues.put("app_version_int", java.lang.Long.valueOf(c6351c2.U()));
        contentValues.put("firebase_instance_id", c6351c2.p());
        contentValues.put("daily_error_events_count", java.lang.Long.valueOf(c6351c2.g0()));
        contentValues.put("daily_realtime_events_count", java.lang.Long.valueOf(c6351c2.p0()));
        contentValues.put("health_monitor_sample", c6351c2.r());
        contentValues.put("android_id", java.lang.Long.valueOf(c6351c2.Q()));
        contentValues.put("adid_reporting_enabled", java.lang.Boolean.valueOf(c6351c2.z()));
        contentValues.put("admob_app_id", c6351c2.j());
        contentValues.put("dynamite_version", java.lang.Long.valueOf(c6351c2.v0()));
        if (!com.google.android.gms.internal.measurement.C6038i6.a() || !d().t(com.google.android.gms.measurement.internal.G.f41861Z0) || this.f41809b.U(strL).m(com.google.android.gms.measurement.internal.A3.a.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", c6351c2.u());
        }
        contentValues.put("sgtm_upload_enabled", java.lang.Boolean.valueOf(c6351c2.C()));
        contentValues.put("target_os_version", java.lang.Long.valueOf(c6351c2.J0()));
        contentValues.put("session_stitching_token_hash", java.lang.Long.valueOf(c6351c2.I0()));
        if (com.google.android.gms.internal.measurement.C6066l7.a() && d().F(strL, com.google.android.gms.measurement.internal.G.f41827I0)) {
            contentValues.put("ad_services_version", java.lang.Integer.valueOf(c6351c2.a()));
            contentValues.put("attribution_eligibility_status", java.lang.Long.valueOf(c6351c2.X()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", java.lang.Boolean.valueOf(c6351c2.D()));
        contentValues.put("npa_metadata_value", c6351c2.K0());
        if (com.google.android.gms.internal.measurement.s7.a() && d().F(strL, com.google.android.gms.measurement.internal.G.f41924y0)) {
            i();
            if (com.google.android.gms.measurement.internal.d6.H0(strL)) {
                contentValues.put("bundle_delivery_index", java.lang.Long.valueOf(c6351c2.B0()));
            }
        }
        if (com.google.android.gms.internal.measurement.s7.a() && d().F(strL, com.google.android.gms.measurement.internal.G.f41926z0)) {
            contentValues.put("sgtm_preview_key", c6351c2.v());
        }
        contentValues.put("dma_consent_state", java.lang.Integer.valueOf(c6351c2.L()));
        contentValues.put("daily_realtime_dcu_count", java.lang.Integer.valueOf(c6351c2.F()));
        contentValues.put("serialized_npa_metadata", c6351c2.t());
        java.util.List listW = c6351c2.w();
        if (listW != null) {
            if (listW.isEmpty()) {
                j().L().b("Safelisted events should not be an empty list. appId", strL);
            } else {
                contentValues.put("safelisted_events", android.text.TextUtils.join(",", listW));
            }
        }
        if (com.google.android.gms.internal.measurement.C6140u6.a() && d().t(com.google.android.gms.measurement.internal.G.f41918v0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (java.lang.String) null);
        }
        if (d().t(com.google.android.gms.measurement.internal.G.f41857X0)) {
            contentValues.put("unmatched_pfo", c6351c2.L0());
            contentValues.put("unmatched_uwa", c6351c2.M0());
        }
        if (com.google.android.gms.internal.measurement.S6.a() && d().F(strL, com.google.android.gms.measurement.internal.G.f41853V0)) {
            contentValues.put("ad_campaign_info", c6351c2.E());
        }
        try {
            android.database.sqlite.SQLiteDatabase sQLiteDatabaseB = B();
            if (sQLiteDatabaseB.update("apps", contentValues, "app_id = ?", new java.lang.String[]{strL}) == 0 && sQLiteDatabaseB.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                j().G().b("Failed to insert/update app (got -1). appId", com.google.android.gms.measurement.internal.C6428n2.v(strL));
            }
        } catch (android.database.sqlite.SQLiteException e6) {
            j().G().c("Error storing app. appId", com.google.android.gms.measurement.internal.C6428n2.v(strL), e6);
        }
    }

    final void W(java.lang.Long l6) {
        n();
        u();
        Q3.AbstractC1477p.l(l6);
        if ((!com.google.android.gms.internal.measurement.s7.a() || d().t(com.google.android.gms.measurement.internal.G.f41815C0)) && o0()) {
            if (C0("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l6 + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                j().L().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                B().execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + l6 + " AND retry_count < 2147483647");
            } catch (android.database.sqlite.SQLiteException e6) {
                j().G().b("Error incrementing retry count. error", e6);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x017f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final com.google.android.gms.measurement.internal.V5 W0(java.lang.String str) throws java.lang.Throwable {
        android.database.Cursor cursorQuery;
        boolean zT;
        Q3.AbstractC1477p.f(str);
        n();
        u();
        boolean zA = com.google.android.gms.internal.measurement.s7.a();
        ?? r6 = 0;
        ?? r10 = zA;
        if (zA && !(zT = d().t(com.google.android.gms.measurement.internal.G.f41815C0))) {
            r10 = zT;
            return null;
        }
        try {
            try {
                r10 = zT;
                cursorQuery = B().query("upload_queue", new java.lang.String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count"}, "app_id=? AND NOT " + z0(), new java.lang.String[]{str}, null, null, "creation_timestamp ASC", "1");
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    java.lang.String string = cursorQuery.getString(3);
                    if (android.text.TextUtils.isEmpty(string)) {
                        j().F().a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
                        cursorQuery.close();
                        return null;
                    }
                    try {
                        com.google.android.gms.internal.measurement.C6097p2.a aVar = (com.google.android.gms.internal.measurement.C6097p2.a) com.google.android.gms.measurement.internal.Z5.G(com.google.android.gms.internal.measurement.C6097p2.K(), cursorQuery.getBlob(2));
                        p085i4.C c6 = p085i4.C.values()[cursorQuery.getInt(5)];
                        if (c6 == p085i4.C.SGTM || c6 == p085i4.C.GOOGLE_ANALYTICS) {
                            if (cursorQuery.getInt(6) > 0) {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.util.Iterator it = aVar.E().iterator();
                                while (it.hasNext()) {
                                    com.google.android.gms.internal.measurement.C6105q2.a aVar2 = (com.google.android.gms.internal.measurement.C6105q2.a) ((com.google.android.gms.internal.measurement.C6105q2) it.next()).x();
                                    aVar2.E0(cursorQuery.getInt(6));
                                    arrayList.add((com.google.android.gms.internal.measurement.C6105q2) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVar2.q()));
                                }
                                aVar.A();
                                aVar.x(arrayList);
                            }
                        }
                        java.util.HashMap map = new java.util.HashMap();
                        java.lang.String string2 = cursorQuery.getString(4);
                        if (string2 != null) {
                            for (java.lang.String str2 : string2.split("\r\n")) {
                                if (str2.isEmpty()) {
                                    break;
                                }
                                java.lang.String[] strArrSplit = str2.split("=", 2);
                                if (strArrSplit.length != 2) {
                                    j().G().b("Invalid upload header: ", str2);
                                    break;
                                }
                                map.put(strArrSplit[0], strArrSplit[1]);
                            }
                        }
                        com.google.android.gms.measurement.internal.V5 v5A = new com.google.android.gms.measurement.internal.X5().b(cursorQuery.getLong(0)).c((com.google.android.gms.internal.measurement.C6097p2) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVar.q())).e(string).f(map).d(c6).a();
                        cursorQuery.close();
                        return v5A;
                    } catch (java.io.IOException e6) {
                        j().G().c("Failed to queued MeasurementBatch from upload_queue. appId", str, e6);
                        cursorQuery.close();
                        return null;
                    }
                } catch (android.database.sqlite.SQLiteException e10) {
                    e = e10;
                    j().G().c("Error to querying MeasurementBatch from upload_queue. appId", str, e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                r6 = r10;
                if (r6 != 0) {
                    r6.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (r6 != 0) {
                r6.close();
            }
            throw th;
        }
    }

    public final void X(java.lang.String str, android.os.Bundle bundle) {
        Q3.AbstractC1477p.l(bundle);
        n();
        u();
        com.google.android.gms.measurement.internal.C6439p c6439p = new com.google.android.gms.measurement.internal.C6439p(this, str);
        for (java.util.List<com.google.android.gms.measurement.internal.C6425n> listA = c6439p.a(); !listA.isEmpty(); listA = c6439p.a()) {
            for (com.google.android.gms.measurement.internal.C6425n c6425n : listA) {
                com.google.android.gms.measurement.internal.Z5 z5O = o();
                com.google.android.gms.internal.measurement.C6061l2 c6061l2 = c6425n.f42539d;
                android.os.Bundle bundle2 = new android.os.Bundle();
                for (com.google.android.gms.internal.measurement.C6079n2 c6079n2 : c6061l2.U()) {
                    if (c6079n2.Y()) {
                        bundle2.putDouble(c6079n2.V(), c6079n2.F());
                    } else if (c6079n2.Z()) {
                        bundle2.putFloat(c6079n2.V(), c6079n2.M());
                    } else if (c6079n2.a0()) {
                        bundle2.putLong(c6079n2.V(), c6079n2.R());
                    } else if (c6079n2.c0()) {
                        bundle2.putString(c6079n2.V(), c6079n2.W());
                    } else if (c6079n2.X().isEmpty()) {
                        z5O.j().G().b("Unexpected parameter type for parameter", c6079n2);
                    } else {
                        bundle2.putParcelableArray(c6079n2.V(), com.google.android.gms.measurement.internal.Z5.i0(c6079n2.X()));
                    }
                }
                java.lang.String string = bundle2.getString("_o");
                bundle2.remove("_o");
                java.lang.String strT = c6061l2.T();
                if (string == null) {
                    string = "";
                }
                com.google.android.gms.measurement.internal.C6455r2 c6455r2 = new com.google.android.gms.measurement.internal.C6455r2(strT, string, bundle2, c6061l2.Q());
                i().N(c6455r2.f42610d, bundle);
                e0(c6425n.f42536a, new com.google.android.gms.measurement.internal.B(this.f42679a, c6455r2.f42608b, str, c6425n.f42539d.T(), c6425n.f42539d.Q(), c6425n.f42539d.P(), c6455r2.f42610d), c6425n.f42537b, c6425n.f42538c);
            }
        }
    }

    public final java.util.List X0(java.lang.String str) {
        Q3.AbstractC1477p.f(str);
        n();
        u();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = B().query("trigger_uris", new java.lang.String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new java.lang.String[]{str}, null, null, "rowid", null);
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    java.lang.String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(new com.google.android.gms.measurement.internal.B5(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (android.database.sqlite.SQLiteException e6) {
                j().G().c("Error querying trigger uris. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e6);
                java.util.List listEmptyList = java.util.Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (java.lang.Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final void Y(java.lang.String str, com.google.android.gms.measurement.internal.C6480v c6480v) {
        Q3.AbstractC1477p.l(str);
        Q3.AbstractC1477p.l(c6480v);
        n();
        u();
        if (d().t(com.google.android.gms.measurement.internal.G.f41847S0)) {
            com.google.android.gms.measurement.internal.A3 a3U0 = U0(str);
            com.google.android.gms.measurement.internal.A3 a6 = com.google.android.gms.measurement.internal.A3.f41705c;
            if (a3U0 == a6) {
                E0(str, a6);
            }
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", c6480v.j());
        b0("consent_settings", "app_id", contentValues);
    }

    public final java.util.List Y0(java.lang.String str) {
        Q3.AbstractC1477p.f(str);
        n();
        u();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = B().query("user_attributes", new java.lang.String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new java.lang.String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    java.lang.String string = cursorQuery.getString(0);
                    java.lang.String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    java.lang.String str2 = string2;
                    long j6 = cursorQuery.getLong(2);
                    java.lang.Object objM = M(cursorQuery, 3);
                    if (objM == null) {
                        j().G().b("Read invalid user property value, ignoring it. appId", com.google.android.gms.measurement.internal.C6428n2.v(str));
                    } else {
                        arrayList.add(new com.google.android.gms.measurement.internal.a6(str, str2, string, j6, objM));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (android.database.sqlite.SQLiteException e6) {
                j().G().c("Error querying user properties. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e6);
                java.util.List listEmptyList = java.util.Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (java.lang.Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    final java.util.Map Z0(java.lang.String str) {
        u();
        n();
        Q3.AbstractC1477p.f(str);
        android.database.Cursor cursor = null;
        try {
            try {
                android.database.Cursor cursorQuery = B().query("audience_filter_values", new java.lang.String[]{"audience_id", "current_results"}, "app_id=?", new java.lang.String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    java.util.Map mapEmptyMap = java.util.Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                p170r.C7026a c7026a = new p170r.C7026a();
                do {
                    int i6 = cursorQuery.getInt(0);
                    try {
                        c7026a.put(java.lang.Integer.valueOf(i6), (com.google.android.gms.internal.measurement.C6120s2) ((com.google.android.gms.internal.measurement.AbstractC6130t4) ((com.google.android.gms.internal.measurement.C6120s2.a) com.google.android.gms.measurement.internal.Z5.G(com.google.android.gms.internal.measurement.C6120s2.Q(), cursorQuery.getBlob(1))).q()));
                    } catch (java.io.IOException e6) {
                        j().G().d("Failed to merge filter results. appId, audienceId, error", com.google.android.gms.measurement.internal.C6428n2.v(str), java.lang.Integer.valueOf(i6), e6);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c7026a;
            } catch (android.database.sqlite.SQLiteException e10) {
                j().G().c("Database error querying filter results. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e10);
                java.util.Map mapEmptyMap2 = java.util.Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (java.lang.Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void a0(java.lang.String str, com.google.android.gms.measurement.internal.A3 a6) {
        Q3.AbstractC1477p.l(str);
        Q3.AbstractC1477p.l(a6);
        n();
        u();
        E0(str, U0(str));
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", a6.x());
        b0("consent_settings", "app_id", contentValues);
    }

    final java.util.Map a1(java.lang.String str) {
        Q3.AbstractC1477p.f(str);
        p170r.C7026a c7026a = new p170r.C7026a();
        android.database.Cursor cursor = null;
        try {
            try {
                android.database.Cursor cursorQuery = B().query("event_filters", new java.lang.String[]{"audience_id", "data"}, "app_id=?", new java.lang.String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    java.util.Map mapEmptyMap = java.util.Collections.emptyMap();
                    cursorQuery.close();
                    return mapEmptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.K1 k6 = (com.google.android.gms.internal.measurement.K1) ((com.google.android.gms.internal.measurement.AbstractC6130t4) ((com.google.android.gms.internal.measurement.K1.a) com.google.android.gms.measurement.internal.Z5.G(com.google.android.gms.internal.measurement.K1.J(), cursorQuery.getBlob(1))).q());
                        if (k6.R()) {
                            int i6 = cursorQuery.getInt(0);
                            java.util.List arrayList = (java.util.List) c7026a.get(java.lang.Integer.valueOf(i6));
                            if (arrayList == null) {
                                arrayList = new java.util.ArrayList();
                                c7026a.put(java.lang.Integer.valueOf(i6), arrayList);
                            }
                            arrayList.add(k6);
                        }
                    } catch (java.io.IOException e6) {
                        j().G().c("Failed to merge filter. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e6);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return c7026a;
            } catch (java.lang.Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e10) {
            j().G().c("Database error querying filters. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e10);
            java.util.Map mapEmptyMap2 = java.util.Collections.emptyMap();
            if (0 != 0) {
                cursor.close();
            }
            return mapEmptyMap2;
        }
    }

    final java.util.Map b1(java.lang.String str) {
        u();
        n();
        Q3.AbstractC1477p.f(str);
        p170r.C7026a c7026a = new p170r.C7026a();
        android.database.Cursor cursor = null;
        try {
            try {
                android.database.Cursor cursorRawQuery = B().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new java.lang.String[]{str, str});
                if (!cursorRawQuery.moveToFirst()) {
                    java.util.Map mapEmptyMap = java.util.Collections.emptyMap();
                    cursorRawQuery.close();
                    return mapEmptyMap;
                }
                do {
                    int i6 = cursorRawQuery.getInt(0);
                    java.util.List arrayList = (java.util.List) c7026a.get(java.lang.Integer.valueOf(i6));
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                        c7026a.put(java.lang.Integer.valueOf(i6), arrayList);
                    }
                    arrayList.add(java.lang.Integer.valueOf(cursorRawQuery.getInt(1)));
                } while (cursorRawQuery.moveToNext());
                cursorRawQuery.close();
                return c7026a;
            } catch (android.database.sqlite.SQLiteException e6) {
                j().G().c("Database error querying scoped filters. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e6);
                java.util.Map mapEmptyMap2 = java.util.Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return mapEmptyMap2;
            }
        } catch (java.lang.Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    final void c0(java.lang.String str, java.util.List list) {
        boolean z6;
        com.google.android.gms.measurement.internal.C6442p2 c6442p2L;
        java.lang.String str2;
        java.lang.Object objV;
        java.lang.Integer numValueOf;
        boolean z10;
        Q3.AbstractC1477p.l(list);
        for (int i6 = 0; i6 < list.size(); i6++) {
            com.google.android.gms.internal.measurement.J1.a aVarX = (com.google.android.gms.internal.measurement.J1.a) ((com.google.android.gms.internal.measurement.J1) list.get(i6)).x();
            if (aVarX.v() != 0) {
                for (int i10 = 0; i10 < aVarX.v(); i10++) {
                    com.google.android.gms.internal.measurement.K1.a aVar = (com.google.android.gms.internal.measurement.K1.a) aVarX.y(i10).x();
                    com.google.android.gms.internal.measurement.K1.a aVar2 = (com.google.android.gms.internal.measurement.K1.a) ((com.google.android.gms.internal.measurement.AbstractC6130t4.b) aVar.clone());
                    java.lang.String strB = p085i4.q.b(aVar.z());
                    if (strB != null) {
                        aVar2.x(strB);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    for (int i11 = 0; i11 < aVar.v(); i11++) {
                        com.google.android.gms.internal.measurement.L1 l1Y = aVar.y(i11);
                        java.lang.String strA = p085i4.s.a(l1Y.K());
                        if (strA != null) {
                            aVar2.w(i11, (com.google.android.gms.internal.measurement.L1) ((com.google.android.gms.internal.measurement.AbstractC6130t4) ((com.google.android.gms.internal.measurement.L1.a) l1Y.x()).v(strA).q()));
                            z10 = true;
                        }
                    }
                    if (z10) {
                        com.google.android.gms.internal.measurement.J1.a aVarW = aVarX.w(i10, aVar2);
                        list.set(i6, (com.google.android.gms.internal.measurement.J1) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVarW.q()));
                        aVarX = aVarW;
                    }
                }
            }
            if (aVarX.z() != 0) {
                for (int i12 = 0; i12 < aVarX.z(); i12++) {
                    com.google.android.gms.internal.measurement.N1 n1A = aVarX.A(i12);
                    java.lang.String strA2 = p085i4.r.a(n1A.J());
                    if (strA2 != null) {
                        aVarX = aVarX.x(i12, ((com.google.android.gms.internal.measurement.N1.a) n1A.x()).v(strA2));
                        list.set(i6, (com.google.android.gms.internal.measurement.J1) ((com.google.android.gms.internal.measurement.AbstractC6130t4) aVarX.q()));
                    }
                }
            }
        }
        u();
        n();
        Q3.AbstractC1477p.f(str);
        Q3.AbstractC1477p.l(list);
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseB = B();
        sQLiteDatabaseB.beginTransaction();
        try {
            u();
            n();
            Q3.AbstractC1477p.f(str);
            android.database.sqlite.SQLiteDatabase sQLiteDatabaseB2 = B();
            sQLiteDatabaseB2.delete("property_filters", "app_id=?", new java.lang.String[]{str});
            sQLiteDatabaseB2.delete("event_filters", "app_id=?", new java.lang.String[]{str});
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.J1 j6 = (com.google.android.gms.internal.measurement.J1) it.next();
                u();
                n();
                Q3.AbstractC1477p.f(str);
                Q3.AbstractC1477p.l(j6);
                if (j6.O()) {
                    int iK = j6.k();
                    java.util.Iterator it2 = j6.M().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            java.util.Iterator it3 = j6.N().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    java.util.Iterator it4 = j6.M().iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            if (!j0(str, iK, (com.google.android.gms.internal.measurement.K1) it4.next())) {
                                                z6 = false;
                                                break;
                                            }
                                        } else {
                                            z6 = true;
                                            break;
                                        }
                                    }
                                    if (z6) {
                                        java.util.Iterator it5 = j6.N().iterator();
                                        while (it5.hasNext()) {
                                            if (!k0(str, iK, (com.google.android.gms.internal.measurement.N1) it5.next())) {
                                                z6 = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (!z6) {
                                        u();
                                        n();
                                        Q3.AbstractC1477p.f(str);
                                        android.database.sqlite.SQLiteDatabase sQLiteDatabaseB3 = B();
                                        sQLiteDatabaseB3.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{str, java.lang.String.valueOf(iK)});
                                        sQLiteDatabaseB3.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{str, java.lang.String.valueOf(iK)});
                                        break;
                                    }
                                    break;
                                }
                                if (!((com.google.android.gms.internal.measurement.N1) it3.next()).N()) {
                                    c6442p2L = j().L();
                                    str2 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
                                    objV = com.google.android.gms.measurement.internal.C6428n2.v(str);
                                    numValueOf = java.lang.Integer.valueOf(iK);
                                }
                            }
                        } else if (!((com.google.android.gms.internal.measurement.K1) it2.next()).S()) {
                            c6442p2L = j().L();
                            str2 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                            objV = com.google.android.gms.measurement.internal.C6428n2.v(str);
                            numValueOf = java.lang.Integer.valueOf(iK);
                        }
                        c6442p2L.c(str2, objV, numValueOf);
                        break;
                    }
                }
                j().L().b("Audience with no ID. appId", com.google.android.gms.measurement.internal.C6428n2.v(str));
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                com.google.android.gms.internal.measurement.J1 j10 = (com.google.android.gms.internal.measurement.J1) it6.next();
                arrayList.add(j10.O() ? java.lang.Integer.valueOf(j10.k()) : null);
            }
            G0(str, arrayList);
            sQLiteDatabaseB.setTransactionSuccessful();
        } finally {
            sQLiteDatabaseB.endTransaction();
        }
    }

    public final void c1() {
        u();
        B().beginTransaction();
    }

    final void d0(java.util.List list) {
        n();
        u();
        Q3.AbstractC1477p.l(list);
        Q3.AbstractC1477p.n(list.size());
        if (o0()) {
            java.lang.String str = "(" + android.text.TextUtils.join(",", list) + ")";
            if (C0("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                j().L().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                B().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (android.database.sqlite.SQLiteException e6) {
                j().G().b("Error incrementing retry count. error", e6);
            }
        }
    }

    public final void d1(java.lang.String str) {
        n();
        u();
        try {
            B().execSQL("delete from default_event_params where app_id=?", new java.lang.String[]{str});
        } catch (android.database.sqlite.SQLiteException e6) {
            j().G().b("Error clearing default event params", e6);
        }
    }

    public final void e1(java.lang.String str) {
        com.google.android.gms.measurement.internal.A aL0;
        V0("events_snapshot", str);
        android.database.Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = B().query("events", (java.lang.String[]) java.util.Collections.singletonList("name").toArray(new java.lang.String[0]), "app_id=?", new java.lang.String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return;
                }
                do {
                    java.lang.String string = cursorQuery.getString(0);
                    if (string != null && (aL0 = L0(str, string)) != null) {
                        Z("events_snapshot", aL0);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
            } catch (android.database.sqlite.SQLiteException e6) {
                j().G().c("Error creating snapshot. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e6);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (java.lang.Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final boolean f0(com.google.android.gms.internal.measurement.C6105q2 c6105q2, boolean z6) {
        com.google.android.gms.measurement.internal.C6442p2 c6442p2G;
        java.lang.Object objV;
        java.lang.String str;
        n();
        u();
        Q3.AbstractC1477p.l(c6105q2);
        Q3.AbstractC1477p.f(c6105q2.x2());
        Q3.AbstractC1477p.o(c6105q2.L0());
        j1();
        long jA = b().a();
        if (c6105q2.c2() < jA - com.google.android.gms.measurement.internal.C6376g.P() || c6105q2.c2() > com.google.android.gms.measurement.internal.C6376g.P() + jA) {
            j().L().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", com.google.android.gms.measurement.internal.C6428n2.v(c6105q2.x2()), java.lang.Long.valueOf(jA), java.lang.Long.valueOf(c6105q2.c2()));
        }
        try {
            byte[] bArrH0 = o().h0(c6105q2.j());
            j().K().b("Saving bundle, size", java.lang.Integer.valueOf(bArrH0.length));
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("app_id", c6105q2.x2());
            contentValues.put("bundle_end_timestamp", java.lang.Long.valueOf(c6105q2.c2()));
            contentValues.put("data", bArrH0);
            contentValues.put("has_realtime", java.lang.Integer.valueOf(z6 ? 1 : 0));
            if (c6105q2.S0()) {
                contentValues.put("retry_count", java.lang.Integer.valueOf(c6105q2.B1()));
            }
            try {
                if (B().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                j().G().b("Failed to insert bundle (got -1). appId", com.google.android.gms.measurement.internal.C6428n2.v(c6105q2.x2()));
                return false;
            } catch (android.database.sqlite.SQLiteException e6) {
                e = e6;
                c6442p2G = j().G();
                objV = com.google.android.gms.measurement.internal.C6428n2.v(c6105q2.x2());
                str = "Error storing bundle. appId";
                c6442p2G.c(str, objV, e);
                return false;
            }
        } catch (java.io.IOException e10) {
            e = e10;
            c6442p2G = j().G();
            objV = com.google.android.gms.measurement.internal.C6428n2.v(c6105q2.x2());
            str = "Data loss. Failed to serialize bundle. appId";
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:70:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0108 A[ADDED_TO_REGION] */
    public final void f1(java.lang.String str) throws java.lang.Throwable {
        boolean z6;
        com.google.android.gms.measurement.internal.A aJ0;
        java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList("name", "lifetime_count"));
        com.google.android.gms.measurement.internal.A aL0 = L0(str, "_f");
        com.google.android.gms.measurement.internal.A aL1 = L0(str, "_v");
        V0("events", str);
        boolean z10 = false;
        android.database.Cursor cursorQuery = null;
        try {
            cursorQuery = B().query("events_snapshot", (java.lang.String[]) arrayList.toArray(new java.lang.String[0]), "app_id=?", new java.lang.String[]{str}, null, null, null);
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                if (aL0 != null) {
                    Z("events", aL0);
                } else if (aL1 != null) {
                    Z("events", aL1);
                }
                V0("events_snapshot", str);
                return;
            }
            boolean z11 = false;
            z6 = false;
            do {
                try {
                    java.lang.String string = cursorQuery.getString(0);
                    if (d().t(com.google.android.gms.measurement.internal.G.f41867b1)) {
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z11 = true;
                            } else if ("_v".equals(string)) {
                                z6 = true;
                            }
                        }
                    } else if ("_f".equals(string)) {
                        z11 = true;
                    } else if ("_v".equals(string)) {
                        z6 = true;
                    }
                    if (string != null && (aJ0 = J0("events_snapshot", str, string)) != null) {
                        Z("events", aJ0);
                    }
                } catch (android.database.sqlite.SQLiteException e6) {
                    e = e6;
                    z10 = z11;
                    try {
                        j().G().c("Error querying snapshot. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (!z10 && aL0 != null) {
                            Z("events", aL0);
                        } else if (!z6 && aL1 != null) {
                            Z("events", aL1);
                        }
                        V0("events_snapshot", str);
                        return;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z10 && aL0 != null) {
                            Z("events", aL0);
                        } else if (!z6 && aL1 != null) {
                            Z("events", aL1);
                        }
                        V0("events_snapshot", str);
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    z10 = z11;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (z10) {
                        if (!z6) {
                            Z("events", aL1);
                        }
                    } else if (!z6) {
                        Z("events", aL1);
                    }
                    V0("events_snapshot", str);
                    throw th;
                }
            } while (cursorQuery.moveToNext());
            cursorQuery.close();
            if (!z11 && aL0 != null) {
                Z("events", aL0);
            } else if (!z6 && aL1 != null) {
                Z("events", aL1);
            }
            V0("events_snapshot", str);
        } catch (android.database.sqlite.SQLiteException e10) {
            e = e10;
            z6 = false;
        } catch (java.lang.Throwable th3) {
            th = th3;
            z6 = false;
        }
    }

    public final boolean g0(com.google.android.gms.measurement.internal.C6362e c6362e) {
        Q3.AbstractC1477p.l(c6362e);
        n();
        u();
        java.lang.String str = c6362e.f42359C;
        Q3.AbstractC1477p.l(str);
        if (N0(str, c6362e.f42361E.f42230D) == null && C0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new java.lang.String[]{str}) >= 1000) {
            return false;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c6362e.f42360D);
        contentValues.put("name", c6362e.f42361E.f42230D);
        T(contentValues, "value", Q3.AbstractC1477p.l(c6362e.f42361E.e()));
        contentValues.put("active", java.lang.Boolean.valueOf(c6362e.f42363G));
        contentValues.put("trigger_event_name", c6362e.f42364H);
        contentValues.put("trigger_timeout", java.lang.Long.valueOf(c6362e.f42366J));
        i();
        contentValues.put("timed_out_event", com.google.android.gms.measurement.internal.d6.q0(c6362e.f42365I));
        contentValues.put("creation_timestamp", java.lang.Long.valueOf(c6362e.f42362F));
        i();
        contentValues.put("triggered_event", com.google.android.gms.measurement.internal.d6.q0(c6362e.f42367K));
        contentValues.put("triggered_timestamp", java.lang.Long.valueOf(c6362e.f42361E.f42231E));
        contentValues.put("time_to_live", java.lang.Long.valueOf(c6362e.f42368L));
        i();
        contentValues.put("expired_event", com.google.android.gms.measurement.internal.d6.q0(c6362e.f42369M));
        try {
            if (B().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            j().G().b("Failed to insert/update conditional user property (got -1)", com.google.android.gms.measurement.internal.C6428n2.v(str));
            return true;
        } catch (android.database.sqlite.SQLiteException e6) {
            j().G().c("Error storing conditional user property", com.google.android.gms.measurement.internal.C6428n2.v(str), e6);
            return true;
        }
    }

    public final boolean g1(java.lang.String str) {
        if (com.google.android.gms.internal.measurement.s7.a() && !d().t(com.google.android.gms.measurement.internal.G.f41815C0)) {
            return false;
        }
        java.lang.String strZ0 = z0();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ");
        sb.append(strZ0);
        return C0(sb.toString(), new java.lang.String[]{str}) != 0;
    }

    public final boolean h0(com.google.android.gms.measurement.internal.B b6, long j6, boolean z6) {
        n();
        u();
        Q3.AbstractC1477p.l(b6);
        Q3.AbstractC1477p.f(b6.f41722a);
        byte[] bArrJ = o().E(b6).j();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", b6.f41722a);
        contentValues.put("name", b6.f41723b);
        contentValues.put("timestamp", java.lang.Long.valueOf(b6.f41725d));
        contentValues.put("metadata_fingerprint", java.lang.Long.valueOf(j6));
        contentValues.put("data", bArrJ);
        contentValues.put("realtime", java.lang.Integer.valueOf(z6 ? 1 : 0));
        try {
            if (B().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            j().G().b("Failed to insert raw event (got -1). appId", com.google.android.gms.measurement.internal.C6428n2.v(b6.f41722a));
            return false;
        } catch (android.database.sqlite.SQLiteException e6) {
            j().G().c("Error storing raw event. appId", com.google.android.gms.measurement.internal.C6428n2.v(b6.f41722a), e6);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    final boolean h1(java.lang.String str) {
        boolean z6;
        boolean z10;
        android.database.Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = B().rawQuery("select timestamp from raw_events where app_id=? and name = '_f' limit 1;", new java.lang.String[]{str});
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return false;
                }
                z6 = b().a() < cursorRawQuery.getLong(0) + 15000;
                try {
                    z10 = G("select count(*) from raw_events where app_id=? and name not like '!_%' escape '!' limit 1;", new java.lang.String[]{str}, 0L) > 0;
                    cursorRawQuery.close();
                } catch (android.database.sqlite.SQLiteException e6) {
                    e = e6;
                    j().G().b("Error checking backfill conditions", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    z10 = false;
                }
                return (z6 || z10) ? false : true;
            } catch (java.lang.Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e10) {
            e = e10;
            z6 = false;
        }
        j().G().b("Error checking backfill conditions", e);
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        z10 = false;
        if (z6) {
        }
    }

    public final boolean i0(com.google.android.gms.measurement.internal.a6 a6Var) {
        Q3.AbstractC1477p.l(a6Var);
        n();
        u();
        if (N0(a6Var.f42260a, a6Var.f42262c) == null) {
            if (com.google.android.gms.measurement.internal.d6.K0(a6Var.f42262c)) {
                if (C0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new java.lang.String[]{a6Var.f42260a}) >= d().q(a6Var.f42260a, com.google.android.gms.measurement.internal.G.f41828J, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(a6Var.f42262c) && C0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new java.lang.String[]{a6Var.f42260a, a6Var.f42261b}) >= 25) {
                return false;
            }
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", a6Var.f42260a);
        contentValues.put("origin", a6Var.f42261b);
        contentValues.put("name", a6Var.f42262c);
        contentValues.put("set_timestamp", java.lang.Long.valueOf(a6Var.f42263d));
        T(contentValues, "value", a6Var.f42264e);
        try {
            if (B().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            j().G().b("Failed to insert/update user property (got -1). appId", com.google.android.gms.measurement.internal.C6428n2.v(a6Var.f42260a));
            return true;
        } catch (android.database.sqlite.SQLiteException e6) {
            j().G().c("Error storing user property. appId", com.google.android.gms.measurement.internal.C6428n2.v(a6Var.f42260a), e6);
            return true;
        }
    }

    public final void i1() {
        u();
        B().endTransaction();
    }

    final void j1() {
        int iDelete;
        n();
        u();
        if (o0()) {
            long jA = s().f42458e.a();
            long jC = b().c();
            if (java.lang.Math.abs(jC - jA) > com.google.android.gms.measurement.internal.C6376g.Q()) {
                s().f42458e.b(jC);
                n();
                u();
                if (!o0() || (iDelete = B().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new java.lang.String[]{java.lang.String.valueOf(b().a()), java.lang.String.valueOf(com.google.android.gms.measurement.internal.C6376g.P())})) <= 0) {
                    return;
                }
                j().K().b("Deleted stale rows. rowsDeleted", java.lang.Integer.valueOf(iDelete));
            }
        }
    }

    public final void k1() {
        u();
        B().setTransactionSuccessful();
    }

    public final boolean l0(java.lang.String str, com.google.android.gms.internal.measurement.C6097p2 c6097p2, java.lang.String str2, java.util.Map map, p085i4.C c6) {
        int iDelete;
        n();
        u();
        Q3.AbstractC1477p.l(c6097p2);
        Q3.AbstractC1477p.f(str);
        if (com.google.android.gms.internal.measurement.s7.a() && !d().t(com.google.android.gms.measurement.internal.G.f41815C0)) {
            return false;
        }
        n();
        u();
        if (o0()) {
            long jA = s().f42459f.a();
            long jC = b().c();
            if (java.lang.Math.abs(jC - jA) > com.google.android.gms.measurement.internal.C6376g.Q()) {
                s().f42459f.b(jC);
                n();
                u();
                if (o0() && (iDelete = B().delete("upload_queue", z0(), new java.lang.String[0])) > 0) {
                    j().K().b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", java.lang.Integer.valueOf(iDelete));
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : map.entrySet()) {
            arrayList.add(((java.lang.String) entry.getKey()) + "=" + ((java.lang.String) entry.getValue()));
        }
        byte[] bArrJ = c6097p2.j();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrJ);
        contentValues.put("upload_uri", str2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int size = arrayList.size();
        if (size > 0) {
            sb.append((java.lang.CharSequence) arrayList.get(0));
            int i6 = 1;
            while (i6 < size) {
                sb.append((java.lang.CharSequence) "\r\n");
                java.lang.Object obj = arrayList.get(i6);
                i6++;
                sb.append((java.lang.CharSequence) obj);
            }
        }
        contentValues.put("upload_headers", sb.toString());
        contentValues.put("upload_type", java.lang.Integer.valueOf(c6.a()));
        contentValues.put("creation_timestamp", java.lang.Long.valueOf(b().a()));
        contentValues.put("retry_count", (java.lang.Integer) 0);
        try {
            if (B().insert("upload_queue", null, contentValues) != -1) {
                return true;
            }
            j().G().b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return false;
        } catch (android.database.sqlite.SQLiteException e6) {
            j().G().c("Error storing MeasurementBatch to upload_queue. appId", str, e6);
            return false;
        }
    }

    public final boolean l1() {
        return C0("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean m0(java.lang.String str, com.google.android.gms.measurement.internal.B5 b6) {
        n();
        u();
        Q3.AbstractC1477p.l(b6);
        Q3.AbstractC1477p.f(str);
        long jA = b().a();
        long j6 = b6.f41739D;
        com.google.android.gms.measurement.internal.C6344b2 c6344b2 = com.google.android.gms.measurement.internal.G.f41887i0;
        if (j6 < jA - ((java.lang.Long) c6344b2.a(null)).longValue() || b6.f41739D > ((java.lang.Long) c6344b2.a(null)).longValue() + jA) {
            j().L().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", com.google.android.gms.measurement.internal.C6428n2.v(str), java.lang.Long.valueOf(jA), java.lang.Long.valueOf(b6.f41739D));
        }
        j().K().a("Saving trigger URI");
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", b6.f41738C);
        contentValues.put("source", java.lang.Integer.valueOf(b6.f41740E));
        contentValues.put("timestamp_millis", java.lang.Long.valueOf(b6.f41739D));
        try {
            if (B().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            j().G().b("Failed to insert trigger URI (got -1). appId", com.google.android.gms.measurement.internal.C6428n2.v(str));
            return false;
        } catch (android.database.sqlite.SQLiteException e6) {
            j().G().c("Error storing trigger URI. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e6);
            return false;
        }
    }

    public final boolean m1() {
        return C0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean n0(java.lang.String str, java.lang.Long l6, long j6, com.google.android.gms.internal.measurement.C6061l2 c6061l2) {
        n();
        u();
        Q3.AbstractC1477p.l(c6061l2);
        Q3.AbstractC1477p.f(str);
        Q3.AbstractC1477p.l(l6);
        byte[] bArrJ = c6061l2.j();
        j().K().c("Saving complex main event, appId, data size", g().c(str), java.lang.Integer.valueOf(bArrJ.length));
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l6);
        contentValues.put("children_to_process", java.lang.Long.valueOf(j6));
        contentValues.put("main_event", bArrJ);
        try {
            if (B().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            j().G().b("Failed to insert complex main event (got -1). appId", com.google.android.gms.measurement.internal.C6428n2.v(str));
            return false;
        } catch (android.database.sqlite.SQLiteException e6) {
            j().G().c("Error storing complex main event. appId", com.google.android.gms.measurement.internal.C6428n2.v(str), e6);
            return false;
        }
    }

    public final boolean n1() {
        return C0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    protected final boolean o0() {
        return a().getDatabasePath("google_app_measurement.db").exists();
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean x() {
        return false;
    }

    public final long y() {
        android.database.Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = B().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return -1L;
                }
                long j6 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j6;
            } catch (android.database.sqlite.SQLiteException e6) {
                j().G().b("Error querying raw events", e6);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return -1L;
            }
        } catch (java.lang.Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final long z() {
        return G("select max(bundle_end_timestamp) from queue", null, 0L);
    }
}
