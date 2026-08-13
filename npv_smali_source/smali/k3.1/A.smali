.class public final synthetic Lk3/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lk3/k;


# direct methods
.method public synthetic constructor <init>(Lk3/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/A;->C:Lk3/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    iget-object v0, p0, Lk3/A;->C:Lk3/k;

    :try_start_0
    iget-object v1, v0, Lk3/k;->C:Ls3/i1;

    invoke-virtual {v1}, Ls3/i1;->o()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/lo;->c(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/no;

    move-result-object v0

    const-string v2, "BaseAdView.resume"

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/no;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method
