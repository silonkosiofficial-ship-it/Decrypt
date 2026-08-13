.class public final Lcom/google/android/gms/internal/ads/fV;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/cU;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/QH;

.field private final c:Lw3/a;

.field private final d:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lw3/a;Lcom/google/android/gms/internal/ads/QH;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fV;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/fV;->c:Lw3/a;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/fV;->b:Lcom/google/android/gms/internal/ads/QH;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/fV;->d:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)V
    .locals 7

    iget-object v0, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/internal/ads/M70;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object v0, p2, Lcom/google/android/gms/internal/ads/R60;->v:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/R60;->s:Lcom/google/android/gms/internal/ads/W60;

    invoke-static {p2}, Lv3/V;->m(Lcom/google/android/gms/internal/ads/W60;)Ljava/lang/String;

    move-result-object v5

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/fV;->a:Landroid/content/Context;

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/YT;->c:Lcom/google/android/gms/internal/ads/qD;

    move-object v6, p2

    check-cast v6, Lcom/google/android/gms/internal/ads/bm;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/n70;->d:Ls3/X1;

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/M70;->t(Landroid/content/Context;Ls3/X1;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/bm;)V

    return-void
.end method

.method public final bridge synthetic b(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/wA;

    iget-object v1, p3, Lcom/google/android/gms/internal/ads/YT;->a:Ljava/lang/String;

    invoke-direct {v0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/wA;-><init>(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/pH;

    new-instance p2, Lcom/google/android/gms/internal/ads/eV;

    invoke-direct {p2, p0, p3}, Lcom/google/android/gms/internal/ads/eV;-><init>(Lcom/google/android/gms/internal/ads/fV;Lcom/google/android/gms/internal/ads/YT;)V

    const/4 v1, 0x0

    invoke-direct {p1, p2, v1}, Lcom/google/android/gms/internal/ads/pH;-><init>(Lcom/google/android/gms/internal/ads/ZH;Lcom/google/android/gms/internal/ads/Ot;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/fV;->b:Lcom/google/android/gms/internal/ads/QH;

    invoke-virtual {p2, v0, p1}, Lcom/google/android/gms/internal/ads/QH;->c(Lcom/google/android/gms/internal/ads/wA;Lcom/google/android/gms/internal/ads/pH;)Lcom/google/android/gms/internal/ads/mH;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/hA;->c()Lcom/google/android/gms/internal/ads/eD;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/Bx;

    iget-object v1, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/M70;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/Bx;-><init>(Lcom/google/android/gms/internal/ads/M70;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/fV;->d:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/ads/BF;->F0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/YT;->c:Lcom/google/android/gms/internal/ads/qD;

    check-cast p2, Lcom/google/android/gms/internal/ads/TU;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/hA;->g()Lcom/google/android/gms/internal/ads/PW;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/TU;->p6(Lcom/google/android/gms/internal/ads/bm;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/mH;->i()Lcom/google/android/gms/internal/ads/lH;

    move-result-object p1

    return-object p1
.end method

.method final synthetic c(Lcom/google/android/gms/internal/ads/YT;ZLandroid/content/Context;Lcom/google/android/gms/internal/ads/SC;)V
    .locals 1

    .prologue
    :try_start_0
    iget-object p4, p1, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    check-cast p4, Lcom/google/android/gms/internal/ads/M70;

    invoke-virtual {p4, p2}, Lcom/google/android/gms/internal/ads/M70;->A(Z)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/fV;->c:Lw3/a;

    iget p2, p2, Lw3/a;->E:I

    sget-object p4, Lcom/google/android/gms/internal/ads/Af;->S0:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    if-ge p2, p4, :cond_0

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/internal/ads/M70;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/M70;->C()V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/internal/ads/M70;

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/M70;->D(Landroid/content/Context;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/u70; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    const-string p2, "Cannot show interstitial."

    invoke-static {p2}, Lw3/p;->f(Ljava/lang/String;)V

    new-instance p2, Lcom/google/android/gms/internal/ads/YH;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/YH;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
