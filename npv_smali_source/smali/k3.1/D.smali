.class public final synthetic Lk3/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lk3/k;

.field public final synthetic D:Lk3/g;


# direct methods
.method public synthetic constructor <init>(Lk3/k;Lk3/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/D;->C:Lk3/k;

    iput-object p2, p0, Lk3/D;->D:Lk3/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    iget-object v0, p0, Lk3/D;->C:Lk3/k;

    iget-object v1, p0, Lk3/D;->D:Lk3/g;

    :try_start_0
    iget-object v2, v0, Lk3/k;->C:Ls3/i1;

    iget-object v1, v1, Lk3/g;->a:Ls3/f1;

    invoke-virtual {v2, v1}, Ls3/i1;->m(Ls3/f1;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/lo;->c(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/no;

    move-result-object v0

    const-string v2, "BaseAdView.loadAd"

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/no;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method
