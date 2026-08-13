.class public final Lcom/google/android/gms/internal/ads/BY;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/L20;


# instance fields
.field private final a:LV3/f;

.field private final b:Lcom/google/android/gms/internal/ads/n70;


# direct methods
.method constructor <init>(LV3/f;Lcom/google/android/gms/internal/ads/n70;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/BY;->a:LV3/f;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/BY;->b:Lcom/google/android/gms/internal/ads/n70;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public final b()LP4/d;
    .locals 5

    new-instance v0, Lcom/google/android/gms/internal/ads/CY;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/BY;->a:LV3/f;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/BY;->b:Lcom/google/android/gms/internal/ads/n70;

    invoke-interface {v1}, LV3/f;->a()J

    move-result-wide v3

    invoke-direct {v0, v2, v3, v4}, Lcom/google/android/gms/internal/ads/CY;-><init>(Lcom/google/android/gms/internal/ads/n70;J)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    return-object v0
.end method
