.class public final Lcom/google/android/gms/internal/ads/jV;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/cU;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/QH;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/QH;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/jV;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/jV;->b:Lcom/google/android/gms/internal/ads/QH;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)V
    .locals 8

    .prologue
    :try_start_0
    iget-object v0, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/Tm;

    iget-object v1, p2, Lcom/google/android/gms/internal/ads/R60;->Z:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Tm;->J0(Ljava/lang/String;)V

    iget-object v0, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/internal/ads/Tm;

    iget-object v2, p2, Lcom/google/android/gms/internal/ads/R60;->U:Ljava/lang/String;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/R60;->v:Lorg/json/JSONObject;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object v4, p1, Lcom/google/android/gms/internal/ads/n70;->d:Ls3/X1;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/jV;->a:Landroid/content/Context;

    invoke-static {p1}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v5

    new-instance v6, Lcom/google/android/gms/internal/ads/hV;

    const/4 p1, 0x0

    invoke-direct {v6, p0, p3, p1}, Lcom/google/android/gms/internal/ads/hV;-><init>(Lcom/google/android/gms/internal/ads/jV;Lcom/google/android/gms/internal/ads/YT;Lcom/google/android/gms/internal/ads/iV;)V

    iget-object p1, p3, Lcom/google/android/gms/internal/ads/YT;->c:Lcom/google/android/gms/internal/ads/qD;

    move-object v7, p1

    check-cast v7, Lcom/google/android/gms/internal/ads/bm;

    invoke-interface/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/Tm;->T5(Ljava/lang/String;Ljava/lang/String;Ls3/X1;LX3/a;Lcom/google/android/gms/internal/ads/Jm;Lcom/google/android/gms/internal/ads/bm;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "Remote exception loading a interstitial RTB ad"

    invoke-static {p2, p1}, Lv3/q0;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p2, Lcom/google/android/gms/internal/ads/u70;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/u70;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final bridge synthetic b(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/dV;

    iget-object v1, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/Tm;

    sget-object v2, Lk3/c;->E:Lk3/c;

    invoke-direct {v0, p2, v1, v2}, Lcom/google/android/gms/internal/ads/dV;-><init>(Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/Tm;Lk3/c;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/wA;

    iget-object v2, p3, Lcom/google/android/gms/internal/ads/YT;->a:Ljava/lang/String;

    invoke-direct {v1, p1, p2, v2}, Lcom/google/android/gms/internal/ads/wA;-><init>(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/pH;

    const/4 p2, 0x0

    invoke-direct {p1, v0, p2}, Lcom/google/android/gms/internal/ads/pH;-><init>(Lcom/google/android/gms/internal/ads/ZH;Lcom/google/android/gms/internal/ads/Ot;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/jV;->b:Lcom/google/android/gms/internal/ads/QH;

    invoke-virtual {p2, v1, p1}, Lcom/google/android/gms/internal/ads/QH;->c(Lcom/google/android/gms/internal/ads/wA;Lcom/google/android/gms/internal/ads/pH;)Lcom/google/android/gms/internal/ads/mH;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/mH;->b()Lcom/google/android/gms/internal/ads/XC;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/dV;->b(Lcom/google/android/gms/internal/ads/XC;)V

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/YT;->c:Lcom/google/android/gms/internal/ads/qD;

    check-cast p2, Lcom/google/android/gms/internal/ads/TU;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/hA;->f()Lcom/google/android/gms/internal/ads/JW;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/TU;->p6(Lcom/google/android/gms/internal/ads/bm;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/mH;->i()Lcom/google/android/gms/internal/ads/lH;

    move-result-object p1

    return-object p1
.end method
