.class public final synthetic Lcom/google/android/gms/internal/ads/ET;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/Nb0;

.field public final synthetic D:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Nb0;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ET;->C:Lcom/google/android/gms/internal/ads/Nb0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ET;->D:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ET;->C:Lcom/google/android/gms/internal/ads/Nb0;

    sget-object v1, Lcom/google/android/gms/internal/ads/Ib0;->E:Lcom/google/android/gms/internal/ads/Ib0;

    const-string v2, "Ad overlay"

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ET;->D:Landroid/view/View;

    invoke-virtual {v0, v3, v1, v2}, Lcom/google/android/gms/internal/ads/Nb0;->f(Landroid/view/View;Lcom/google/android/gms/internal/ads/Ib0;Ljava/lang/String;)V

    return-void
.end method
