.class public abstract Lcom/google/android/gms/internal/ads/Bb0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/Cb0;Lcom/google/android/gms/internal/ads/Db0;)Lcom/google/android/gms/internal/ads/Bb0;
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/ads/xc0;->a()V

    new-instance v0, Lcom/google/android/gms/internal/ads/Fb0;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/internal/ads/Fb0;-><init>(Lcom/google/android/gms/internal/ads/Cb0;Lcom/google/android/gms/internal/ads/Db0;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public abstract b(Landroid/view/View;Lcom/google/android/gms/internal/ads/Ib0;Ljava/lang/String;)V
.end method

.method public abstract c()V
.end method

.method public abstract d(Landroid/view/View;)V
.end method

.method public abstract e()V
.end method
