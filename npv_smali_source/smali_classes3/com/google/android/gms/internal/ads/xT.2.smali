.class public final synthetic Lcom/google/android/gms/internal/ads/xT;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/Bb0;

.field public final synthetic D:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Bb0;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xT;->C:Lcom/google/android/gms/internal/ads/Bb0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/xT;->D:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->c5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zb0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xT;->D:Landroid/view/View;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/xT;->C:Lcom/google/android/gms/internal/ads/Bb0;

    sget-object v2, Lcom/google/android/gms/internal/ads/Ib0;->E:Lcom/google/android/gms/internal/ads/Ib0;

    const-string v3, "Ad overlay"

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/internal/ads/Bb0;->b(Landroid/view/View;Lcom/google/android/gms/internal/ads/Ib0;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
