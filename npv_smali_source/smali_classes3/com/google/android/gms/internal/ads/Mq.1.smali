.class final Lcom/google/android/gms/internal/ads/Mq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:J

.field final synthetic c:Lcom/google/android/gms/internal/ads/Nq;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Nq;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Mq;->c:Lcom/google/android/gms/internal/ads/Nq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/Mq;->a:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/Mq;->b:J

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/Mq;->b:J

    return-wide v0
.end method

.method public final b()Landroid/os/Bundle;
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "topen"

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/Mq;->a:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v1, "tclose"

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/Mq;->b:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    return-object v0
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Mq;->c:Lcom/google/android/gms/internal/ads/Nq;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nq;->b(Lcom/google/android/gms/internal/ads/Nq;)LV3/f;

    move-result-object v0

    invoke-interface {v0}, LV3/f;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/Mq;->b:J

    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Mq;->c:Lcom/google/android/gms/internal/ads/Nq;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nq;->b(Lcom/google/android/gms/internal/ads/Nq;)LV3/f;

    move-result-object v0

    invoke-interface {v0}, LV3/f;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/Mq;->a:J

    return-void
.end method
