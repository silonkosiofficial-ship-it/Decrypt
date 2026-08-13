.class public final Lv3/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/google/android/gms/internal/ads/e7;

.field private static final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lv3/Q;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    :cond_0
    sget-object v0, Lv3/Q;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lv3/Q;->a:Lcom/google/android/gms/internal/ads/e7;

    if-nez v1, :cond_2

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Af;->a(Landroid/content/Context;)V

    invoke-static {}, LV3/e;->a()Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->w4:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1}, Lv3/A;->b(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/e7;

    move-result-object p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    invoke-static {p1, v1}, Lcom/google/android/gms/internal/ads/J7;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/q7;)Lcom/google/android/gms/internal/ads/e7;

    move-result-object p1

    :goto_0
    sput-object p1, Lv3/Q;->a:Lcom/google/android/gms/internal/ads/e7;

    :cond_2
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method public final a(Ljava/lang/String;)LP4/d;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/mr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/mr;-><init>()V

    sget-object v1, Lv3/Q;->a:Lcom/google/android/gms/internal/ads/e7;

    new-instance v2, Lv3/O;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v3, v0}, Lv3/O;-><init>(Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/internal/ads/mr;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/e7;->a(Lcom/google/android/gms/internal/ads/d7;)Lcom/google/android/gms/internal/ads/d7;

    return-object v0
.end method

.method public final b(ILjava/lang/String;Ljava/util/Map;[B)LP4/d;
    .locals 14

    .prologue
    move-object/from16 v0, p2

    new-instance v10, Lv3/M;

    const/4 v1, 0x0

    invoke-direct {v10, v1}, Lv3/M;-><init>(Lv3/P;)V

    new-instance v6, Lv3/K;

    move-object v11, p0

    invoke-direct {v6, p0, v0, v10}, Lv3/K;-><init>(Lv3/Q;Ljava/lang/String;Lv3/M;)V

    new-instance v12, Lw3/m;

    invoke-direct {v12, v1}, Lw3/m;-><init>(Ljava/lang/String;)V

    new-instance v13, Lv3/L;

    move-object v1, v13

    move-object v2, p0

    move v3, p1

    move-object/from16 v4, p2

    move-object v5, v10

    move-object/from16 v7, p4

    move-object/from16 v8, p3

    move-object v9, v12

    invoke-direct/range {v1 .. v9}, Lv3/L;-><init>(Lv3/Q;ILjava/lang/String;Lcom/google/android/gms/internal/ads/g7;Lcom/google/android/gms/internal/ads/f7;[BLjava/util/Map;Lw3/m;)V

    invoke-static {}, Lw3/m;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    const-string v1, "GET"

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/d7;->u()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/d7;->G()[B

    move-result-object v3

    invoke-virtual {v12, v0, v1, v2, v3}, Lw3/m;->d(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[B)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/L6; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw3/p;->g(Ljava/lang/String;)V

    :cond_0
    :goto_0
    sget-object v0, Lv3/Q;->a:Lcom/google/android/gms/internal/ads/e7;

    invoke-virtual {v0, v13}, Lcom/google/android/gms/internal/ads/e7;->a(Lcom/google/android/gms/internal/ads/d7;)Lcom/google/android/gms/internal/ads/d7;

    return-object v10
.end method
