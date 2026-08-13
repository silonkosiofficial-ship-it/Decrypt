.class public final Lcom/google/android/gms/internal/ads/ml;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Ljava/lang/Object;

.field private c:Lcom/google/android/gms/internal/ads/wl;

.field private d:Lcom/google/android/gms/internal/ads/wl;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ml;->a:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ml;->b:Ljava/lang/Object;

    return-void
.end method

.method private static final c(Landroid/content/Context;)Landroid/content/Context;
    .locals 1

    .prologue
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lw3/a;Lcom/google/android/gms/internal/ads/T90;)Lcom/google/android/gms/internal/ads/wl;
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ml;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ml;->c:Lcom/google/android/gms/internal/ads/wl;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/wl;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ml;->c(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    sget-object v2, Lcom/google/android/gms/internal/ads/Af;->a:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v1, p1, p2, v2, p3}, Lcom/google/android/gms/internal/ads/wl;-><init>(Landroid/content/Context;Lw3/a;Ljava/lang/String;Lcom/google/android/gms/internal/ads/T90;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/ml;->c:Lcom/google/android/gms/internal/ads/wl;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ml;->c:Lcom/google/android/gms/internal/ads/wl;

    monitor-exit v0

    return-object p1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final b(Landroid/content/Context;Lw3/a;Lcom/google/android/gms/internal/ads/T90;)Lcom/google/android/gms/internal/ads/wl;
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ml;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ml;->d:Lcom/google/android/gms/internal/ads/wl;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/wl;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ml;->c(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    sget-object v2, Lcom/google/android/gms/internal/ads/Mg;->a:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v1, p1, p2, v2, p3}, Lcom/google/android/gms/internal/ads/wl;-><init>(Landroid/content/Context;Lw3/a;Ljava/lang/String;Lcom/google/android/gms/internal/ads/T90;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/ml;->d:Lcom/google/android/gms/internal/ads/wl;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ml;->d:Lcom/google/android/gms/internal/ads/wl;

    monitor-exit v0

    return-object p1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
