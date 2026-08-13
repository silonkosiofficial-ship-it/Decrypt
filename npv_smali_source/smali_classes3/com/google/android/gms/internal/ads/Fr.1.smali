.class final Lcom/google/android/gms/internal/ads/Fr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:Lcom/google/android/gms/internal/ads/Ir;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Ir;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Fr;->C:Lcom/google/android/gms/internal/ads/Ir;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fr;->C:Lcom/google/android/gms/internal/ads/Ir;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Ir;->J(Lcom/google/android/gms/internal/ads/Ir;)Lcom/google/android/gms/internal/ads/Jr;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Ir;->M(Lcom/google/android/gms/internal/ads/Ir;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Ir;->J(Lcom/google/android/gms/internal/ads/Ir;)Lcom/google/android/gms/internal/ads/Jr;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Jr;->i()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fr;->C:Lcom/google/android/gms/internal/ads/Ir;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/Ir;->K(Lcom/google/android/gms/internal/ads/Ir;Z)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fr;->C:Lcom/google/android/gms/internal/ads/Ir;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Ir;->J(Lcom/google/android/gms/internal/ads/Ir;)Lcom/google/android/gms/internal/ads/Jr;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Jr;->d()V

    :cond_1
    return-void
.end method
