.class public Lcom/google/android/gms/ads/internal/util/WorkManagerUtil;
.super Lv3/T;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0
    .annotation build Lcom/google/android/apps/common/proguard/UsedByReflection;
        value = "This class must be instantiated reflectively so that the default class loader can be used."
    .end annotation

    invoke-direct {p0}, Lv3/T;-><init>()V

    return-void
.end method

.method private static o6(Landroid/content/Context;)V
    .locals 1

    .prologue
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    new-instance v0, Landroidx/work/a$b;

    invoke-direct {v0}, Landroidx/work/a$b;-><init>()V

    invoke-virtual {v0}, Landroidx/work/a$b;->a()Landroidx/work/a;

    move-result-object v0

    invoke-static {p0, v0}, LI2/t;->e(Landroid/content/Context;Landroidx/work/a;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method public final zze(LX3/a;)V
    .locals 4

    .prologue
    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/WorkManagerUtil;->o6(Landroid/content/Context;)V

    :try_start_0
    invoke-static {p1}, LI2/t;->d(Landroid/content/Context;)LI2/t;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v0, "offline_ping_sender_work"

    invoke-virtual {p1, v0}, LI2/t;->a(Ljava/lang/String;)LI2/m;

    new-instance v1, LI2/b$a;

    invoke-direct {v1}, LI2/b$a;-><init>()V

    sget-object v2, LI2/k;->D:LI2/k;

    invoke-virtual {v1, v2}, LI2/b$a;->b(LI2/k;)LI2/b$a;

    move-result-object v1

    invoke-virtual {v1}, LI2/b$a;->a()LI2/b;

    move-result-object v1

    new-instance v2, LI2/l$a;

    const-class v3, Lcom/google/android/gms/ads/internal/offline/buffering/OfflinePingSender;

    invoke-direct {v2, v3}, LI2/l$a;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v2, v1}, LI2/u$a;->e(LI2/b;)LI2/u$a;

    move-result-object v1

    check-cast v1, LI2/l$a;

    invoke-virtual {v1, v0}, LI2/u$a;->a(Ljava/lang/String;)LI2/u$a;

    move-result-object v0

    check-cast v0, LI2/l$a;

    invoke-virtual {v0}, LI2/u$a;->b()LI2/u;

    move-result-object v0

    check-cast v0, LI2/l;

    invoke-virtual {p1, v0}, LI2/t;->b(LI2/u;)LI2/m;

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Failed to instantiate WorkManager."

    invoke-static {v0, p1}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final zzf(LX3/a;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    new-instance v0, Lt3/a;

    const-string v1, ""

    invoke-direct {v0, p2, p3, v1}, Lt3/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/ads/internal/util/WorkManagerUtil;->zzg(LX3/a;Lt3/a;)Z

    move-result p1

    return p1
.end method

.method public final zzg(LX3/a;Lt3/a;)Z
    .locals 4

    .prologue
    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/WorkManagerUtil;->o6(Landroid/content/Context;)V

    new-instance v0, LI2/b$a;

    invoke-direct {v0}, LI2/b$a;-><init>()V

    sget-object v1, LI2/k;->D:LI2/k;

    invoke-virtual {v0, v1}, LI2/b$a;->b(LI2/k;)LI2/b$a;

    move-result-object v0

    invoke-virtual {v0}, LI2/b$a;->a()LI2/b;

    move-result-object v0

    new-instance v1, Landroidx/work/b$a;

    invoke-direct {v1}, Landroidx/work/b$a;-><init>()V

    iget-object v2, p2, Lt3/a;->C:Ljava/lang/String;

    const-string v3, "uri"

    invoke-virtual {v1, v3, v2}, Landroidx/work/b$a;->e(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    move-result-object v1

    const-string v2, "gws_query_id"

    iget-object v3, p2, Lt3/a;->D:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroidx/work/b$a;->e(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    move-result-object v1

    const-string v2, "image_url"

    iget-object p2, p2, Lt3/a;->E:Ljava/lang/String;

    invoke-virtual {v1, v2, p2}, Landroidx/work/b$a;->e(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/work/b$a;->a()Landroidx/work/b;

    move-result-object p2

    new-instance v1, LI2/l$a;

    const-class v2, Lcom/google/android/gms/ads/internal/offline/buffering/OfflineNotificationPoster;

    invoke-direct {v1, v2}, LI2/l$a;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v1, v0}, LI2/u$a;->e(LI2/b;)LI2/u$a;

    move-result-object v0

    check-cast v0, LI2/l$a;

    invoke-virtual {v0, p2}, LI2/u$a;->f(Landroidx/work/b;)LI2/u$a;

    move-result-object p2

    check-cast p2, LI2/l$a;

    const-string v0, "offline_notification_work"

    invoke-virtual {p2, v0}, LI2/u$a;->a(Ljava/lang/String;)LI2/u$a;

    move-result-object p2

    check-cast p2, LI2/l$a;

    invoke-virtual {p2}, LI2/u$a;->b()LI2/u;

    move-result-object p2

    check-cast p2, LI2/l;

    :try_start_0
    invoke-static {p1}, LI2/t;->d(Landroid/content/Context;)LI2/t;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1, p2}, LI2/t;->b(LI2/u;)LI2/m;

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p1

    const-string p2, "Failed to instantiate WorkManager."

    invoke-static {p2, p1}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return p1
.end method
