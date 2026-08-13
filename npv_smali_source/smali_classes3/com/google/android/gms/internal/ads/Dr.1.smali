.class final Lcom/google/android/gms/internal/ads/Dr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:I

.field final synthetic D:I

.field final synthetic E:Lcom/google/android/gms/internal/ads/Ir;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Ir;II)V
    .locals 0

    iput p2, p0, Lcom/google/android/gms/internal/ads/Dr;->C:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/Dr;->D:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Dr;->E:Lcom/google/android/gms/internal/ads/Ir;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dr;->E:Lcom/google/android/gms/internal/ads/Ir;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Ir;->J(Lcom/google/android/gms/internal/ads/Ir;)Lcom/google/android/gms/internal/ads/Jr;

    move-result-object v1

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/google/android/gms/internal/ads/Dr;->C:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/Dr;->D:I

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Ir;->J(Lcom/google/android/gms/internal/ads/Ir;)Lcom/google/android/gms/internal/ads/Jr;

    move-result-object v0

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Jr;->F0(II)V

    :cond_0
    return-void
.end method
