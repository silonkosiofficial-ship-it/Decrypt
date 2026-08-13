.class public final Lcom/google/android/gms/internal/ads/bl;
.super Lcom/google/android/gms/internal/ads/tr;
.source "SourceFile"


# instance fields
.field private final c:Ljava/lang/Object;

.field private final d:Lcom/google/android/gms/internal/ads/gl;

.field private e:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/gl;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/tr;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/bl;->c:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bl;->d:Lcom/google/android/gms/internal/ads/gl;

    return-void
.end method

.method static bridge synthetic g(Lcom/google/android/gms/internal/ads/bl;)Lcom/google/android/gms/internal/ads/gl;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/bl;->d:Lcom/google/android/gms/internal/ads/gl;

    return-object p0
.end method


# virtual methods
.method public final h()V
    .locals 3

    .prologue
    const-string v0, "release: Trying to acquire lock"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bl;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v1, "release: Lock acquired"

    invoke-static {v1}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/bl;->e:Z

    if-eqz v1, :cond_0

    const-string v1, "release: Lock already released"

    invoke-static {v1}, Lv3/q0;->k(Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/bl;->e:Z

    new-instance v1, Lcom/google/android/gms/internal/ads/Yk;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/Yk;-><init>(Lcom/google/android/gms/internal/ads/bl;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/pr;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/pr;-><init>()V

    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/internal/ads/tr;->f(Lcom/google/android/gms/internal/ads/qr;Lcom/google/android/gms/internal/ads/or;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/Zk;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/Zk;-><init>(Lcom/google/android/gms/internal/ads/bl;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/al;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/al;-><init>(Lcom/google/android/gms/internal/ads/bl;)V

    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/internal/ads/tr;->f(Lcom/google/android/gms/internal/ads/qr;Lcom/google/android/gms/internal/ads/or;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v0, "release: Lock released"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    return-void

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
