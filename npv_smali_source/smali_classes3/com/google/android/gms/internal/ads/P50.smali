.class public final synthetic Lcom/google/android/gms/internal/ads/P50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/Q50;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Q50;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/P50;->C:Lcom/google/android/gms/internal/ads/Q50;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/P50;->C:Lcom/google/android/gms/internal/ads/Q50;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Q50;->e:Lcom/google/android/gms/internal/ads/R50;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/R50;->d(Lcom/google/android/gms/internal/ads/R50;)Lcom/google/android/gms/internal/ads/t60;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/t60;->u()V

    return-void
.end method
