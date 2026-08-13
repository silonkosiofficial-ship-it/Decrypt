.class public final Lcom/google/android/gms/internal/ads/wA;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/e70;

.field private final b:Lcom/google/android/gms/internal/ads/R60;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/lang/String;)V
    .locals 0

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wA;->a:Lcom/google/android/gms/internal/ads/e70;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/wA;->b:Lcom/google/android/gms/internal/ads/R60;

    if-nez p3, :cond_0

    const-string p3, "com.google.ads.mediation.admob.AdMobAdapter"

    :cond_0
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/wA;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/R60;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wA;->b:Lcom/google/android/gms/internal/ads/R60;

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/internal/ads/U60;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wA;->a:Lcom/google/android/gms/internal/ads/e70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    return-object v0
.end method

.method public final c()Lcom/google/android/gms/internal/ads/e70;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wA;->a:Lcom/google/android/gms/internal/ads/e70;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wA;->c:Ljava/lang/String;

    return-object v0
.end method
