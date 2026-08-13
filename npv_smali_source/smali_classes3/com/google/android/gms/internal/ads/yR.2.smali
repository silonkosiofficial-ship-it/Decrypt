.class public final Lcom/google/android/gms/internal/ads/yR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/yR;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/yR;->b:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/xR;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yR;->a:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/hz0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/hz0;->d()Ljava/util/Map;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {}, Lcom/google/android/gms/internal/ads/O80;->c()Lcom/google/android/gms/internal/ads/Yk0;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/yR;->b:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v2, Lcom/google/android/gms/internal/ads/dE;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/dE;->a()Lcom/google/android/gms/internal/ads/cE;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/xR;

    invoke-direct {v3, v0, v1, v2}, Lcom/google/android/gms/internal/ads/xR;-><init>(Ljava/util/Map;Lcom/google/android/gms/internal/ads/Yk0;Lcom/google/android/gms/internal/ads/cE;)V

    return-object v3
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/yR;->a()Lcom/google/android/gms/internal/ads/xR;

    move-result-object v0

    return-object v0
.end method
