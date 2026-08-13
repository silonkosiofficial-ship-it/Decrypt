.class public final Lcom/google/android/gms/internal/ads/KM;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/aD;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/Ot;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Ot;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/KM;->C:Lcom/google/android/gms/internal/ads/Ot;

    return-void
.end method


# virtual methods
.method public final g(Landroid/content/Context;)V
    .locals 0

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/KM;->C:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->destroy()V

    :cond_0
    return-void
.end method

.method public final k(Landroid/content/Context;)V
    .locals 0

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/KM;->C:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->onPause()V

    :cond_0
    return-void
.end method

.method public final r(Landroid/content/Context;)V
    .locals 0

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/KM;->C:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Ot;->onResume()V

    :cond_0
    return-void
.end method
