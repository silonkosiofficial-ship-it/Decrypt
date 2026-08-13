package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ne0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4597ne0 extends android.database.sqlite.SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4597ne0(android.content.Context context, java.lang.String str, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory, int i6, com.google.android.gms.internal.ads.AbstractC4927qe0 abstractC4927qe0) {
        super(context, true == str.equals("") ? null : str, (android.database.sqlite.SQLiteDatabase.CursorFactory) null, i6);
        com.google.android.gms.internal.ads.AbstractC4157je0.a();
    }
}
