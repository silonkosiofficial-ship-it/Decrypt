.class public final synthetic Lx3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Landroid/content/Context;

.field public final synthetic D:Ljava/lang/String;

.field public final synthetic E:Lk3/g;

.field public final synthetic F:Lx3/b;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Lk3/g;Lx3/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx3/c;->C:Landroid/content/Context;

    iput-object p2, p0, Lx3/c;->D:Ljava/lang/String;

    iput-object p3, p0, Lx3/c;->E:Lk3/g;

    iput-object p4, p0, Lx3/c;->F:Lx3/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    iget-object v0, p0, Lx3/c;->C:Landroid/content/Context;

    iget-object v1, p0, Lx3/c;->D:Ljava/lang/String;

    iget-object v2, p0, Lx3/c;->E:Lk3/g;

    iget-object v3, p0, Lx3/c;->F:Lx3/b;

    :try_start_0
    new-instance v4, Lcom/google/android/gms/internal/ads/xk;

    invoke-direct {v4, v0, v1}, Lcom/google/android/gms/internal/ads/xk;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v2}, Lk3/g;->a()Ls3/f1;

    move-result-object v1

    invoke-virtual {v4, v1, v3}, Lcom/google/android/gms/internal/ads/xk;->f(Ls3/f1;Lk3/e;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/lo;->c(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/no;

    move-result-object v0

    const-string v2, "InterstitialAd.load"

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/no;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method
