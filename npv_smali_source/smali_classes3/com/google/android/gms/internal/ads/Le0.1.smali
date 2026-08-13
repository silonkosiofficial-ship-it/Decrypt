.class public final Lcom/google/android/gms/internal/ads/Le0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lcom/google/android/gms/internal/ads/Le0;


# instance fields
.field final a:Lcom/google/android/gms/internal/ads/Me0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Me0;->b(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/Me0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Le0;->a:Lcom/google/android/gms/internal/ads/Me0;

    return-void
.end method

.method public static final a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/Le0;
    .locals 2

    .prologue
    const-class v0, Lcom/google/android/gms/internal/ads/Le0;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/Le0;->b:Lcom/google/android/gms/internal/ads/Le0;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/Le0;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/Le0;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/google/android/gms/internal/ads/Le0;->b:Lcom/google/android/gms/internal/ads/Le0;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p0, Lcom/google/android/gms/internal/ads/Le0;->b:Lcom/google/android/gms/internal/ads/Le0;

    monitor-exit v0

    return-object p0

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public final b(Z)V
    .locals 3

    .prologue
    const-class v0, Lcom/google/android/gms/internal/ads/Le0;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Le0;->a:Lcom/google/android/gms/internal/ads/Me0;

    const-string v2, "paidv2_user_option"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/internal/ads/Me0;->d(Ljava/lang/String;Ljava/lang/Object;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final c(Z)V
    .locals 4

    .prologue
    const-class v0, Lcom/google/android/gms/internal/ads/Le0;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Le0;->a:Lcom/google/android/gms/internal/ads/Me0;

    const-string v2, "paidv2_publisher_option"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/Me0;->d(Ljava/lang/String;Ljava/lang/Object;)V

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Le0;->a:Lcom/google/android/gms/internal/ads/Me0;

    const-string v1, "paidv2_creation_time"

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/Me0;->e(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Le0;->a:Lcom/google/android/gms/internal/ads/Me0;

    const-string v1, "paidv2_id"

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/Me0;->e(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Le0;->a:Lcom/google/android/gms/internal/ads/Me0;

    const-string v1, "vendor_scoped_gpid_v2_id"

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/Me0;->e(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Le0;->a:Lcom/google/android/gms/internal/ads/Me0;

    const-string v1, "vendor_scoped_gpid_v2_creation_time"

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/Me0;->e(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final d()Z
    .locals 4

    .prologue
    const-class v0, Lcom/google/android/gms/internal/ads/Le0;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Le0;->a:Lcom/google/android/gms/internal/ads/Me0;

    const-string v2, "paidv2_publisher_option"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/Me0;->f(Ljava/lang/String;Z)Z

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final e()Z
    .locals 4

    .prologue
    const-class v0, Lcom/google/android/gms/internal/ads/Le0;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Le0;->a:Lcom/google/android/gms/internal/ads/Me0;

    const-string v2, "paidv2_user_option"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/Me0;->f(Ljava/lang/String;Z)Z

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
