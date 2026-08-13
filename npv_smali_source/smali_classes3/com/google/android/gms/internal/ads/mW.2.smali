.class public final Lcom/google/android/gms/internal/ads/mW;
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

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/mW;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/mW;->b:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/lW;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mW;->a:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/mW;->b:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/kM;

    new-instance v2, Lcom/google/android/gms/internal/ads/lW;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/ads/lW;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/kM;)V

    return-object v2
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/mW;->a()Lcom/google/android/gms/internal/ads/lW;

    move-result-object v0

    return-object v0
.end method
