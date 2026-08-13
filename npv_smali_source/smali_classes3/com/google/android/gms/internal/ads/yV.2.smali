.class public final Lcom/google/android/gms/internal/ads/yV;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/cU;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/nI;

.field private c:Lcom/google/android/gms/internal/ads/km;

.field private final d:Lw3/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/nI;Lw3/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/yV;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/yV;->b:Lcom/google/android/gms/internal/ads/nI;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/yV;->d:Lw3/a;

    return-void
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/yV;Lcom/google/android/gms/internal/ads/km;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/yV;->c:Lcom/google/android/gms/internal/ads/km;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)V
    .locals 11

    .prologue
    :try_start_0
    iget-object v0, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/Tm;

    iget-object v1, p2, Lcom/google/android/gms/internal/ads/R60;->Z:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Tm;->J0(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yV;->d:Lw3/a;

    iget v0, v0, Lw3/a;->E:I

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->P1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    iget-object v0, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/google/android/gms/internal/ads/Tm;

    iget-object v4, p2, Lcom/google/android/gms/internal/ads/R60;->U:Ljava/lang/String;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/R60;->v:Lorg/json/JSONObject;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object v6, p1, Lcom/google/android/gms/internal/ads/n70;->d:Ls3/X1;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/yV;->a:Landroid/content/Context;

    invoke-static {p1}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v7

    new-instance v8, Lcom/google/android/gms/internal/ads/wV;

    invoke-direct {v8, p0, p3, v2}, Lcom/google/android/gms/internal/ads/wV;-><init>(Lcom/google/android/gms/internal/ads/yV;Lcom/google/android/gms/internal/ads/YT;Lcom/google/android/gms/internal/ads/xV;)V

    iget-object p1, p3, Lcom/google/android/gms/internal/ads/YT;->c:Lcom/google/android/gms/internal/ads/qD;

    move-object v9, p1

    check-cast v9, Lcom/google/android/gms/internal/ads/bm;

    invoke-interface/range {v3 .. v9}, Lcom/google/android/gms/internal/ads/Tm;->L5(Ljava/lang/String;Ljava/lang/String;Ls3/X1;LX3/a;Lcom/google/android/gms/internal/ads/Mm;Lcom/google/android/gms/internal/ads/bm;)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-object v0, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/google/android/gms/internal/ads/Tm;

    iget-object v4, p2, Lcom/google/android/gms/internal/ads/R60;->U:Ljava/lang/String;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/R60;->v:Lorg/json/JSONObject;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object p2, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object v6, p2, Lcom/google/android/gms/internal/ads/n70;->d:Ls3/X1;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/yV;->a:Landroid/content/Context;

    invoke-static {p2}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v7

    new-instance v8, Lcom/google/android/gms/internal/ads/wV;

    invoke-direct {v8, p0, p3, v2}, Lcom/google/android/gms/internal/ads/wV;-><init>(Lcom/google/android/gms/internal/ads/yV;Lcom/google/android/gms/internal/ads/YT;Lcom/google/android/gms/internal/ads/xV;)V

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/YT;->c:Lcom/google/android/gms/internal/ads/qD;

    move-object v9, p2

    check-cast v9, Lcom/google/android/gms/internal/ads/bm;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object v10, p1, Lcom/google/android/gms/internal/ads/n70;->i:Lcom/google/android/gms/internal/ads/dh;

    invoke-interface/range {v3 .. v10}, Lcom/google/android/gms/internal/ads/Tm;->G2(Ljava/lang/String;Ljava/lang/String;Ls3/X1;LX3/a;Lcom/google/android/gms/internal/ads/Mm;Lcom/google/android/gms/internal/ads/bm;Lcom/google/android/gms/internal/ads/dh;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    new-instance p2, Lcom/google/android/gms/internal/ads/u70;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/u70;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final bridge synthetic b(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)Ljava/lang/Object;
    .locals 4

    .prologue
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/n70;->g:Ljava/util/ArrayList;

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yV;->c:Lcom/google/android/gms/internal/ads/km;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/eJ;->g0(Lcom/google/android/gms/internal/ads/km;)Lcom/google/android/gms/internal/ads/eJ;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->P()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/n70;->g:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/yV;->b:Lcom/google/android/gms/internal/ads/nI;

    iget-object v2, p3, Lcom/google/android/gms/internal/ads/YT;->a:Ljava/lang/String;

    new-instance v3, Lcom/google/android/gms/internal/ads/wA;

    invoke-direct {v3, p1, p2, v2}, Lcom/google/android/gms/internal/ads/wA;-><init>(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/qJ;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/qJ;-><init>(Lcom/google/android/gms/internal/ads/eJ;)V

    new-instance p2, Lcom/google/android/gms/internal/ads/lK;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yV;->c:Lcom/google/android/gms/internal/ads/km;

    const/4 v2, 0x0

    invoke-direct {p2, v2, v2, v0}, Lcom/google/android/gms/internal/ads/lK;-><init>(Lcom/google/android/gms/internal/ads/hm;Lcom/google/android/gms/internal/ads/gm;Lcom/google/android/gms/internal/ads/km;)V

    invoke-virtual {v1, v3, p1, p2}, Lcom/google/android/gms/internal/ads/nI;->d(Lcom/google/android/gms/internal/ads/wA;Lcom/google/android/gms/internal/ads/qJ;Lcom/google/android/gms/internal/ads/lK;)Lcom/google/android/gms/internal/ads/gJ;

    move-result-object p1

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/YT;->c:Lcom/google/android/gms/internal/ads/qD;

    check-cast p2, Lcom/google/android/gms/internal/ads/TU;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/hA;->f()Lcom/google/android/gms/internal/ads/JW;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/TU;->p6(Lcom/google/android/gms/internal/ads/bm;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/hJ;->h()Lcom/google/android/gms/internal/ads/ZI;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/XV;

    const/4 p2, 0x1

    const-string p3, "No corresponding native ad listener"

    invoke-direct {p1, p2, p3}, Lcom/google/android/gms/internal/ads/XV;-><init>(ILjava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/ads/XV;

    const/4 p2, 0x2

    const-string p3, "Unified must be used for RTB."

    invoke-direct {p1, p2, p3}, Lcom/google/android/gms/internal/ads/XV;-><init>(ILjava/lang/String;)V

    throw p1
.end method
