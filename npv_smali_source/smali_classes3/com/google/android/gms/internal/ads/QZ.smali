.class public final Lcom/google/android/gms/internal/ads/QZ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/L20;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/l50;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/l50;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/QZ;->a:Lcom/google/android/gms/internal/ads/l50;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/16 v0, 0xf

    return v0
.end method

.method public final b()LP4/d;
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/QZ;->a:Lcom/google/android/gms/internal/ads/l50;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/PZ;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/PZ;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/l50;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LV3/r;->b(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/PZ;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/PZ;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v1, Lcom/google/android/gms/internal/ads/PZ;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/PZ;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    return-object v0
.end method
