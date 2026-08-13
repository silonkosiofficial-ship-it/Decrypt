.class public final Lcom/google/android/gms/internal/ads/si;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ln3/m;

.field private final b:Ln3/l;

.field private c:Lcom/google/android/gms/internal/ads/Ih;


# direct methods
.method public constructor <init>(Ln3/m;Ln3/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/si;->a:Ln3/m;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/si;->b:Ln3/l;

    return-void
.end method

.method static bridge synthetic a(Lcom/google/android/gms/internal/ads/si;)Ln3/l;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/si;->b:Ln3/l;

    return-object p0
.end method

.method static bridge synthetic b(Lcom/google/android/gms/internal/ads/si;)Ln3/m;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/si;->a:Ln3/m;

    return-object p0
.end method

.method static bridge synthetic e(Lcom/google/android/gms/internal/ads/si;Lcom/google/android/gms/internal/ads/Hh;)Lcom/google/android/gms/internal/ads/Ih;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/si;->f(Lcom/google/android/gms/internal/ads/Hh;)Lcom/google/android/gms/internal/ads/Ih;

    move-result-object p0

    return-object p0
.end method

.method private final declared-synchronized f(Lcom/google/android/gms/internal/ads/Hh;)Lcom/google/android/gms/internal/ads/Ih;
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/si;->c:Lcom/google/android/gms/internal/ads/Ih;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    new-instance v0, Lcom/google/android/gms/internal/ads/Ih;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/Ih;-><init>(Lcom/google/android/gms/internal/ads/Hh;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/si;->c:Lcom/google/android/gms/internal/ads/Ih;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method


# virtual methods
.method public final c()Lcom/google/android/gms/internal/ads/Sh;
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/si;->b:Ln3/l;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/oi;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/oi;-><init>(Lcom/google/android/gms/internal/ads/si;Lcom/google/android/gms/internal/ads/qi;)V

    return-object v0
.end method

.method public final d()Lcom/google/android/gms/internal/ads/Vh;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/pi;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/pi;-><init>(Lcom/google/android/gms/internal/ads/si;Lcom/google/android/gms/internal/ads/qi;)V

    return-object v0
.end method
