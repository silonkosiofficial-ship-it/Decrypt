.class public final Lcom/google/android/gms/internal/ads/CU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/cU;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/vz;

.field private final c:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/vz;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/CU;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/CU;->b:Lcom/google/android/gms/internal/ads/vz;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/CU;->c:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)V
    .locals 10

    .prologue
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/n70;->e:Ls3/c2;

    iget-boolean v1, v0, Ls3/c2;->P:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/CU;->a:Landroid/content/Context;

    new-instance v2, Ls3/c2;

    iget v3, v0, Ls3/c2;->G:I

    iget v0, v0, Ls3/c2;->D:I

    invoke-static {v3, v0}, Lk3/z;->d(II)Lk3/h;

    move-result-object v0

    invoke-direct {v2, v1, v0}, Ls3/c2;-><init>(Landroid/content/Context;Lk3/h;)V

    :goto_0
    move-object v5, v2

    goto :goto_1

    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->J7:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p2, Lcom/google/android/gms/internal/ads/R60;->g0:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/CU;->a:Landroid/content/Context;

    new-instance v2, Ls3/c2;

    iget v3, v0, Ls3/c2;->G:I

    iget v0, v0, Ls3/c2;->D:I

    invoke-static {v3, v0}, Lk3/z;->e(II)Lk3/h;

    move-result-object v0

    invoke-direct {v2, v1, v0}, Ls3/c2;-><init>(Landroid/content/Context;Lk3/h;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/CU;->a:Landroid/content/Context;

    iget-object v1, p2, Lcom/google/android/gms/internal/ads/R60;->u:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/t70;->a(Landroid/content/Context;Ljava/util/List;)Ls3/c2;

    move-result-object v2

    goto :goto_0

    :goto_1
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->J7:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p2, Lcom/google/android/gms/internal/ads/R60;->g0:Z

    if-eqz v0, :cond_2

    iget-object v0, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/CU;->a:Landroid/content/Context;

    move-object v3, v0

    check-cast v3, Lcom/google/android/gms/internal/ads/M70;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object v0, p2, Lcom/google/android/gms/internal/ads/R60;->v:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v7

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/R60;->s:Lcom/google/android/gms/internal/ads/W60;

    invoke-static {p2}, Lv3/V;->m(Lcom/google/android/gms/internal/ads/W60;)Ljava/lang/String;

    move-result-object v8

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/YT;->c:Lcom/google/android/gms/internal/ads/qD;

    move-object v9, p2

    check-cast v9, Lcom/google/android/gms/internal/ads/bm;

    iget-object v6, p1, Lcom/google/android/gms/internal/ads/n70;->d:Ls3/X1;

    invoke-virtual/range {v3 .. v9}, Lcom/google/android/gms/internal/ads/M70;->s(Landroid/content/Context;Ls3/c2;Ls3/X1;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/bm;)V

    return-void

    :cond_2
    iget-object v0, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/CU;->a:Landroid/content/Context;

    move-object v3, v0

    check-cast v3, Lcom/google/android/gms/internal/ads/M70;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object v0, p2, Lcom/google/android/gms/internal/ads/R60;->v:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v7

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/R60;->s:Lcom/google/android/gms/internal/ads/W60;

    invoke-static {p2}, Lv3/V;->m(Lcom/google/android/gms/internal/ads/W60;)Ljava/lang/String;

    move-result-object v8

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/YT;->c:Lcom/google/android/gms/internal/ads/qD;

    move-object v9, p2

    check-cast v9, Lcom/google/android/gms/internal/ads/bm;

    iget-object v6, p1, Lcom/google/android/gms/internal/ads/n70;->d:Ls3/X1;

    invoke-virtual/range {v3 .. v9}, Lcom/google/android/gms/internal/ads/M70;->r(Landroid/content/Context;Ls3/c2;Ls3/X1;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/bm;)V

    return-void
.end method

.method public final bridge synthetic b(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)Ljava/lang/Object;
    .locals 6

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->J7:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-boolean v0, p2, Lcom/google/android/gms/internal/ads/R60;->g0:Z

    if-eqz v0, :cond_2

    iget-object v0, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/M70;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/M70;->h()Lcom/google/android/gms/internal/ads/em;

    move-result-object v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/em;->d()LX3/a;

    move-result-object v2

    invoke-static {v2}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/em;->e()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_2

    if-eqz v2, :cond_0

    if-eqz v0, :cond_3

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    new-instance v3, Lcom/google/android/gms/internal/ads/zU;

    invoke-direct {v3, p0, v2, p2}, Lcom/google/android/gms/internal/ads/zU;-><init>(Lcom/google/android/gms/internal/ads/CU;Landroid/view/View;Lcom/google/android/gms/internal/ads/R60;)V

    sget-object v2, Lcom/google/android/gms/internal/ads/dr;->f:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {v0, v3, v2}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v0

    :try_start_1
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/View;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    new-instance p2, Lcom/google/android/gms/internal/ads/u70;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/u70;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/u70;

    new-instance p2, Ljava/lang/Exception;

    const-string p3, "BannerAdapterWrapper interscrollerView should not be null"

    invoke-direct {p2, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/u70;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_2
    move-exception p1

    new-instance p2, Lcom/google/android/gms/internal/ads/u70;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/u70;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_1
    const-string p1, "getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."

    invoke-static {p1}, Lw3/p;->d(Ljava/lang/String;)V

    new-instance p2, Lcom/google/android/gms/internal/ads/u70;

    new-instance p3, Ljava/lang/Exception;

    invoke-direct {p3, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/ads/u70;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_2
    iget-object v0, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/M70;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/M70;->f()Landroid/view/View;

    move-result-object v2

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/CU;->b:Lcom/google/android/gms/internal/ads/vz;

    iget-object v3, p3, Lcom/google/android/gms/internal/ads/YT;->a:Ljava/lang/String;

    new-instance v4, Lcom/google/android/gms/internal/ads/wA;

    invoke-direct {v4, p1, p2, v3}, Lcom/google/android/gms/internal/ads/wA;-><init>(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/lang/String;)V

    iget-object p1, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    new-instance v3, Lcom/google/android/gms/internal/ads/Xy;

    check-cast p1, Lcom/google/android/gms/internal/ads/M70;

    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lcom/google/android/gms/internal/ads/BU;

    invoke-direct {v5, p1}, Lcom/google/android/gms/internal/ads/BU;-><init>(Lcom/google/android/gms/internal/ads/M70;)V

    iget-object p1, p2, Lcom/google/android/gms/internal/ads/R60;->u:Ljava/util/List;

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/S60;

    invoke-direct {v3, v2, v1, v5, p1}, Lcom/google/android/gms/internal/ads/Xy;-><init>(Landroid/view/View;Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/dA;Lcom/google/android/gms/internal/ads/S60;)V

    invoke-virtual {v0, v4, v3}, Lcom/google/android/gms/internal/ads/vz;->a(Lcom/google/android/gms/internal/ads/wA;Lcom/google/android/gms/internal/ads/Xy;)Lcom/google/android/gms/internal/ads/Ry;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Ry;->i()Lcom/google/android/gms/internal/ads/GG;

    move-result-object p2

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/GG;->q1(Landroid/view/View;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/hA;->c()Lcom/google/android/gms/internal/ads/eD;

    move-result-object p2

    iget-object v0, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/ads/Bx;

    check-cast v0, Lcom/google/android/gms/internal/ads/M70;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/Bx;-><init>(Lcom/google/android/gms/internal/ads/M70;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/CU;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, v1, v0}, Lcom/google/android/gms/internal/ads/BF;->F0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/YT;->c:Lcom/google/android/gms/internal/ads/qD;

    check-cast p2, Lcom/google/android/gms/internal/ads/TU;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/hA;->g()Lcom/google/android/gms/internal/ads/PW;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/TU;->p6(Lcom/google/android/gms/internal/ads/bm;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Ry;->h()Lcom/google/android/gms/internal/ads/Qy;

    move-result-object p1

    return-object p1
.end method

.method final synthetic c(Landroid/view/View;Lcom/google/android/gms/internal/ads/R60;Ljava/lang/Object;)LP4/d;
    .locals 0

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/CU;->a:Landroid/content/Context;

    invoke-static {p3, p1, p2}, Lcom/google/android/gms/internal/ads/Rz;->a(Landroid/content/Context;Landroid/view/View;Lcom/google/android/gms/internal/ads/R60;)Lcom/google/android/gms/internal/ads/Rz;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method
