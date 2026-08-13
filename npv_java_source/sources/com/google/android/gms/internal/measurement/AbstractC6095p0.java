package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6095p0 extends android.database.sqlite.SQLiteOpenHelper {
    public AbstractC6095p0(android.content.Context context, java.lang.String str, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory, int i6) {
        this(context, str, null, 1, com.google.android.gms.internal.measurement.AbstractC6110r0.f41162a);
    }

    private AbstractC6095p0(android.content.Context context, java.lang.String str, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory, int i6, com.google.android.gms.internal.measurement.AbstractC6110r0 abstractC6110r0) {
        super(context, (str == null || com.google.android.gms.internal.measurement.AbstractC6050k0.a().a(str, abstractC6110r0, com.google.android.gms.internal.measurement.EnumC6086o0.SQLITE_OPEN_HELPER_TYPE).equals("")) ? null : str, (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
    }
}
