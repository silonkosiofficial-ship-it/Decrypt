.class public final Lcom/google/android/gms/internal/ads/VN;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/ads/VN;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/UN;->a()Lcom/google/android/gms/internal/ads/VN;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final synthetic b()Ljava/lang/Object;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/gO;

    sget-object v1, Lcom/google/android/gms/internal/ads/p90;->D:Lcom/google/android/gms/internal/ads/p90;

    sget-object v2, Lcom/google/android/gms/internal/ads/p90;->G:Lcom/google/android/gms/internal/ads/p90;

    const-string v3, "ttc"

    invoke-direct {v0, v3, v1, v2}, Lcom/google/android/gms/internal/ads/gO;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/p90;Lcom/google/android/gms/internal/ads/p90;)V

    return-object v0
.end method
