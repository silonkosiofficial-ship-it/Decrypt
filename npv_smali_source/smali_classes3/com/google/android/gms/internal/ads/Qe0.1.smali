.class public final Lcom/google/android/gms/internal/ads/Qe0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lcom/google/android/gms/internal/ads/Qe0;


# instance fields
.field final a:Lcom/google/android/gms/internal/ads/Me0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Me0;->b(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/Me0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Qe0;->a:Lcom/google/android/gms/internal/ads/Me0;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Le0;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/Le0;

    return-void
.end method

.method public static final a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/Qe0;
    .locals 2

    .prologue
    const-class v0, Lcom/google/android/gms/internal/ads/Qe0;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/Qe0;->b:Lcom/google/android/gms/internal/ads/Qe0;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/Qe0;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/Qe0;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/google/android/gms/internal/ads/Qe0;->b:Lcom/google/android/gms/internal/ads/Qe0;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p0, Lcom/google/android/gms/internal/ads/Qe0;->b:Lcom/google/android/gms/internal/ads/Qe0;

    monitor-exit v0

    return-object p0

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/internal/ads/Ke0;)V
    .locals 2

    .prologue
    const-class p1, Lcom/google/android/gms/internal/ads/Qe0;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Qe0;->a:Lcom/google/android/gms/internal/ads/Me0;

    const-string v1, "vendor_scoped_gpid_v2_id"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Me0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Qe0;->a:Lcom/google/android/gms/internal/ads/Me0;

    const-string v1, "vendor_scoped_gpid_v2_creation_time"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Me0;->e(Ljava/lang/String;)V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
