.class public final synthetic Lcom/google/android/gms/internal/ads/XU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/ZC;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/Ot;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Ot;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/XU;->C:Lcom/google/android/gms/internal/ads/Ot;

    return-void
.end method


# virtual methods
.method public final t()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/XU;->C:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ku;->u()V

    :cond_0
    return-void
.end method
