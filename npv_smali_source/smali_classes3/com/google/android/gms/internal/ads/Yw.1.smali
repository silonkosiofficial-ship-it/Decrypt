.class public final Lcom/google/android/gms/internal/ads/Yw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Yw;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Yw;->b:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/Xw;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Yw;->a:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/ez0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ez0;->d()Ljava/util/Map;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Yw;->b:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v1, Lcom/google/android/gms/internal/ads/ez0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ez0;->d()Ljava/util/Map;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    new-instance v2, Lcom/google/android/gms/internal/ads/Xw;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/ads/Xw;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    return-object v2
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Yw;->a()Lcom/google/android/gms/internal/ads/Xw;

    move-result-object v0

    return-object v0
.end method
