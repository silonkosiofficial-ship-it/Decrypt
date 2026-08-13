.class public final Lcom/google/android/gms/internal/ads/cC;
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

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/cC;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/cC;->b:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/cC;->a:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/cC;->b:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v1, Lcom/google/android/gms/internal/ads/xA;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/xA;->a()Lcom/google/android/gms/internal/ads/R60;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/Rn;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/Rn;-><init>()V

    new-instance v3, Lcom/google/android/gms/internal/ads/bC;

    invoke-direct {v3, v0, v1, v2}, Lcom/google/android/gms/internal/ads/bC;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/Rn;)V

    return-object v3
.end method
