.class public final Lcom/google/android/gms/internal/ads/US;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/od;

.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/internal/ads/zS;

.field private final d:Lw3/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lw3/a;Lcom/google/android/gms/internal/ads/od;Lcom/google/android/gms/internal/ads/zS;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/US;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/US;->d:Lw3/a;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/US;->a:Lcom/google/android/gms/internal/ads/od;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/US;->c:Lcom/google/android/gms/internal/ads/zS;

    return-void
.end method


# virtual methods
.method final synthetic a(ZLandroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;
    .locals 17

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v10, p2

    const/4 v11, 0x0

    if-eqz p1, :cond_0

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/US;->b:Landroid/content/Context;

    const-string v2, "OfflineUpload.db"

    invoke-virtual {v0, v2}, Landroid/content/Context;->deleteDatabase(Ljava/lang/String;)Z

    goto/16 :goto_3

    :cond_0
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    const-string v13, "serialized_proto_data"

    filled-new-array {v13}, [Ljava/lang/String;

    move-result-object v4

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v3, "offline_signal_contents"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v2, p2

    invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2, v13}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0

    :try_start_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Hd;->G0([B)Lcom/google/android/gms/internal/ads/Hd;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/Vv0; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v3, "Unable to deserialize proto from offline signals database:"

    invoke-static {v3}, Lw3/p;->d(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw3/p;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/US;->b:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/internal/ads/Md;->s0()Lcom/google/android/gms/internal/ads/Jd;

    move-result-object v2

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/Jd;->F(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Jd;

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/Jd;->H(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Jd;

    const/4 v0, 0x0

    invoke-static {v10, v0}, Lcom/google/android/gms/internal/ads/OS;->a(Landroid/database/sqlite/SQLiteDatabase;I)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/Jd;->z(I)Lcom/google/android/gms/internal/ads/Jd;

    invoke-virtual {v2, v12}, Lcom/google/android/gms/internal/ads/Jd;->E(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/Jd;

    const/4 v3, 0x1

    invoke-static {v10, v3}, Lcom/google/android/gms/internal/ads/OS;->a(Landroid/database/sqlite/SQLiteDatabase;I)I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/Jd;->B(I)Lcom/google/android/gms/internal/ads/Jd;

    const/4 v4, 0x3

    invoke-static {v10, v4}, Lcom/google/android/gms/internal/ads/OS;->a(Landroid/database/sqlite/SQLiteDatabase;I)I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/Jd;->G(I)Lcom/google/android/gms/internal/ads/Jd;

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v4

    invoke-interface {v4}, LV3/f;->a()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/internal/ads/Jd;->C(J)Lcom/google/android/gms/internal/ads/Jd;

    const/4 v4, 0x2

    invoke-static {v10, v4}, Lcom/google/android/gms/internal/ads/OS;->b(Landroid/database/sqlite/SQLiteDatabase;I)J

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Lcom/google/android/gms/internal/ads/Jd;->A(J)Lcom/google/android/gms/internal/ads/Jd;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/Md;

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v5

    const-wide/16 v6, 0x0

    move v8, v0

    move-wide v13, v6

    :goto_1
    if-ge v8, v5, :cond_3

    invoke-interface {v12, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/ads/Hd;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/Hd;->D0()Lcom/google/android/gms/internal/ads/Ve;

    move-result-object v15

    sget-object v0, Lcom/google/android/gms/internal/ads/Ve;->E:Lcom/google/android/gms/internal/ads/Ve;

    if-ne v15, v0, :cond_2

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/Hd;->C0()J

    move-result-wide v15

    cmp-long v0, v15, v13

    if-lez v0, :cond_2

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/Hd;->C0()J

    move-result-wide v13

    :cond_2
    add-int/lit8 v8, v8, 0x1

    const/4 v0, 0x0

    goto :goto_1

    :cond_3
    cmp-long v0, v13, v6

    if-eqz v0, :cond_4

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const-string v6, "value"

    invoke-virtual {v0, v6, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v5, "statistic_name = \'last_successful_request_time\'"

    const-string v6, "offline_signal_statistics"

    invoke-virtual {v10, v6, v0, v5, v11}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    :cond_4
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/US;->a:Lcom/google/android/gms/internal/ads/od;

    new-instance v5, Lcom/google/android/gms/internal/ads/SS;

    invoke-direct {v5, v2}, Lcom/google/android/gms/internal/ads/SS;-><init>(Lcom/google/android/gms/internal/ads/Md;)V

    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ads/od;->b(Lcom/google/android/gms/internal/ads/nd;)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/US;->d:Lw3/a;

    invoke-static {}, Lcom/google/android/gms/internal/ads/Yd;->h0()Lcom/google/android/gms/internal/ads/Xd;

    move-result-object v2

    iget v0, v0, Lw3/a;->D:I

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/Xd;->z(I)Lcom/google/android/gms/internal/ads/Xd;

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/US;->d:Lw3/a;

    iget v0, v0, Lw3/a;->E:I

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/Xd;->B(I)Lcom/google/android/gms/internal/ads/Xd;

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/US;->d:Lw3/a;

    iget-boolean v0, v0, Lw3/a;->F:Z

    if-eq v3, v0, :cond_5

    move v0, v4

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/Xd;->A(I)Lcom/google/android/gms/internal/ads/Xd;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Yd;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/US;->a:Lcom/google/android/gms/internal/ads/od;

    new-instance v3, Lcom/google/android/gms/internal/ads/TS;

    invoke-direct {v3, v0}, Lcom/google/android/gms/internal/ads/TS;-><init>(Lcom/google/android/gms/internal/ads/Yd;)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/od;->b(Lcom/google/android/gms/internal/ads/nd;)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/US;->a:Lcom/google/android/gms/internal/ads/od;

    const/16 v2, 0x2714

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/od;->c(I)V

    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/internal/ads/OS;->e(Landroid/database/sqlite/SQLiteDatabase;)V

    :goto_3
    return-object v11
.end method

.method public final b(Z)V
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/US;->c:Lcom/google/android/gms/internal/ads/zS;

    new-instance v1, Lcom/google/android/gms/internal/ads/RS;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/RS;-><init>(Lcom/google/android/gms/internal/ads/US;Z)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zS;->a(Lcom/google/android/gms/internal/ads/Y80;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Error in offline signals database startup: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lw3/p;->d(Ljava/lang/String;)V

    return-void
.end method
