.class final Lcom/google/android/gms/internal/ads/Ut;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field final synthetic C:Lcom/google/android/gms/internal/ads/aq;

.field final synthetic D:Lcom/google/android/gms/internal/ads/Zt;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Zt;Lcom/google/android/gms/internal/ads/aq;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ut;->C:Lcom/google/android/gms/internal/ads/aq;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ut;->D:Lcom/google/android/gms/internal/ads/Zt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ut;->C:Lcom/google/android/gms/internal/ads/aq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Ut;->D:Lcom/google/android/gms/internal/ads/Zt;

    const/16 v2, 0xa

    invoke-static {v1, p1, v0, v2}, Lcom/google/android/gms/internal/ads/Zt;->O(Lcom/google/android/gms/internal/ads/Zt;Landroid/view/View;Lcom/google/android/gms/internal/ads/aq;I)V

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
