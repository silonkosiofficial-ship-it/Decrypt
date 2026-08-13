.class public final synthetic Lcom/google/android/gms/internal/ads/WZ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/XZ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    new-instance v0, Lcom/google/android/gms/internal/ads/YZ;

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v1

    invoke-interface {v1}, LV3/f;->a()J

    move-result-wide v1

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/Uq;->j()Lv3/s0;

    move-result-object v3

    invoke-interface {v3}, Lv3/s0;->i()Lcom/google/android/gms/internal/ads/Oq;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/Oq;->a()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/YZ;-><init>(J)V

    return-object v0
.end method
