.class public final Lcom/google/android/gms/internal/ads/hb;
.super Lcom/google/android/gms/internal/ads/tb;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Da;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/u8;II)V
    .locals 7

    const-string v3, "nPlMagQmW6RSJqnTQ57SbpssxbOxIap7X2C6yeu+l3U="

    const/4 v6, 0x3

    const-string v2, "GGM8PCgCXWCZ0992hlu+wbFZrEEMwhwHhgONgPT83ZyPiH7oTYURaPK5zfMGe4DG"

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/tb;-><init>(Lcom/google/android/gms/internal/ads/Da;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/u8;II)V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 5

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->V2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/tb;->e:Ljava/lang/reflect/Method;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/tb;->a:Lcom/google/android/gms/internal/ads/Da;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Da;->b()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const/4 v2, 0x1

    aput-object v0, v3, v2

    const/4 v0, 0x0

    invoke-virtual {v1, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Lcom/google/android/gms/internal/ads/ia;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/ia;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tb;->d:Lcom/google/android/gms/internal/ads/u8;

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/tb;->d:Lcom/google/android/gms/internal/ads/u8;

    iget-wide v3, v1, Lcom/google/android/gms/internal/ads/ia;->b:J

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/ads/u8;->u0(J)Lcom/google/android/gms/internal/ads/u8;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/tb;->d:Lcom/google/android/gms/internal/ads/u8;

    iget-wide v3, v1, Lcom/google/android/gms/internal/ads/ia;->c:J

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/ads/u8;->B(J)Lcom/google/android/gms/internal/ads/u8;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
