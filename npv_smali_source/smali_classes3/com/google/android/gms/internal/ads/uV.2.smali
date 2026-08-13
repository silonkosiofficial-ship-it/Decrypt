.class public final Lcom/google/android/gms/internal/ads/uV;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/cU;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/nI;

.field private final c:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/nI;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/uV;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/uV;->b:Lcom/google/android/gms/internal/ads/nI;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/uV;->c:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private static final c(Lcom/google/android/gms/internal/ads/e70;I)Z
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/n70;->g:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)V
    .locals 9

    iget-object v0, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/internal/ads/M70;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object v2, p2, Lcom/google/android/gms/internal/ads/R60;->v:Lorg/json/JSONObject;

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/R60;->s:Lcom/google/android/gms/internal/ads/W60;

    invoke-static {p2}, Lv3/V;->m(Lcom/google/android/gms/internal/ads/W60;)Ljava/lang/String;

    move-result-object v5

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/YT;->c:Lcom/google/android/gms/internal/ads/qD;

    move-object v6, p2

    check-cast v6, Lcom/google/android/gms/internal/ads/bm;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/uV;->a:Landroid/content/Context;

    iget-object v7, p1, Lcom/google/android/gms/internal/ads/n70;->i:Lcom/google/android/gms/internal/ads/dh;

    iget-object v8, p1, Lcom/google/android/gms/internal/ads/n70;->g:Ljava/util/ArrayList;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/n70;->d:Ls3/X1;

    invoke-virtual/range {v1 .. v8}, Lcom/google/android/gms/internal/ads/M70;->u(Landroid/content/Context;Ls3/X1;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/bm;Lcom/google/android/gms/internal/ads/dh;Ljava/util/List;)V

    return-void
.end method

.method public final bridge synthetic b(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)Ljava/lang/Object;
    .locals 7

    .prologue
    iget-object v0, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/M70;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/M70;->d()Lcom/google/android/gms/internal/ads/gm;

    move-result-object v0

    iget-object v1, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/M70;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/M70;->e()Lcom/google/android/gms/internal/ads/hm;

    move-result-object v1

    iget-object v2, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/gms/internal/ads/M70;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/M70;->i()Lcom/google/android/gms/internal/ads/km;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x6

    if-eqz v2, :cond_0

    invoke-static {p1, v4}, Lcom/google/android/gms/internal/ads/uV;->c(Lcom/google/android/gms/internal/ads/e70;I)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/eJ;->g0(Lcom/google/android/gms/internal/ads/km;)Lcom/google/android/gms/internal/ads/eJ;

    move-result-object v4

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    invoke-static {p1, v4}, Lcom/google/android/gms/internal/ads/uV;->c(Lcom/google/android/gms/internal/ads/e70;I)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/eJ;->J(Lcom/google/android/gms/internal/ads/gm;)Lcom/google/android/gms/internal/ads/eJ;

    move-result-object v4

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    const/4 v5, 0x2

    invoke-static {p1, v5}, Lcom/google/android/gms/internal/ads/uV;->c(Lcom/google/android/gms/internal/ads/e70;I)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/eJ;->H(Lcom/google/android/gms/internal/ads/gm;)Lcom/google/android/gms/internal/ads/eJ;

    move-result-object v4

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-static {p1, v4}, Lcom/google/android/gms/internal/ads/uV;->c(Lcom/google/android/gms/internal/ads/e70;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/eJ;->K(Lcom/google/android/gms/internal/ads/hm;)Lcom/google/android/gms/internal/ads/eJ;

    move-result-object v4

    goto :goto_0

    :cond_3
    if-eqz v1, :cond_5

    invoke-static {p1, v3}, Lcom/google/android/gms/internal/ads/uV;->c(Lcom/google/android/gms/internal/ads/e70;I)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/eJ;->I(Lcom/google/android/gms/internal/ads/hm;)Lcom/google/android/gms/internal/ads/eJ;

    move-result-object v4

    :goto_0
    if-eqz v4, :cond_4

    iget-object v5, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/eJ;->P()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v6

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/n70;->g:Ljava/util/ArrayList;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/uV;->b:Lcom/google/android/gms/internal/ads/nI;

    iget-object v5, p3, Lcom/google/android/gms/internal/ads/YT;->a:Ljava/lang/String;

    new-instance v6, Lcom/google/android/gms/internal/ads/wA;

    invoke-direct {v6, p1, p2, v5}, Lcom/google/android/gms/internal/ads/wA;-><init>(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/qJ;

    invoke-direct {p1, v4}, Lcom/google/android/gms/internal/ads/qJ;-><init>(Lcom/google/android/gms/internal/ads/eJ;)V

    new-instance p2, Lcom/google/android/gms/internal/ads/lK;

    invoke-direct {p2, v1, v0, v2}, Lcom/google/android/gms/internal/ads/lK;-><init>(Lcom/google/android/gms/internal/ads/hm;Lcom/google/android/gms/internal/ads/gm;Lcom/google/android/gms/internal/ads/km;)V

    invoke-virtual {v3, v6, p1, p2}, Lcom/google/android/gms/internal/ads/nI;->d(Lcom/google/android/gms/internal/ads/wA;Lcom/google/android/gms/internal/ads/qJ;Lcom/google/android/gms/internal/ads/lK;)Lcom/google/android/gms/internal/ads/gJ;

    move-result-object p1

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/YT;->c:Lcom/google/android/gms/internal/ads/qD;

    check-cast p2, Lcom/google/android/gms/internal/ads/TU;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/hA;->g()Lcom/google/android/gms/internal/ads/PW;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/TU;->p6(Lcom/google/android/gms/internal/ads/bm;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/hA;->c()Lcom/google/android/gms/internal/ads/eD;

    move-result-object p2

    iget-object p3, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/ads/Bx;

    check-cast p3, Lcom/google/android/gms/internal/ads/M70;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/ads/Bx;-><init>(Lcom/google/android/gms/internal/ads/M70;)V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/uV;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, v0, p3}, Lcom/google/android/gms/internal/ads/BF;->F0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/hJ;->h()Lcom/google/android/gms/internal/ads/ZI;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Lcom/google/android/gms/internal/ads/XV;

    const-string p2, "No corresponding native ad listener"

    invoke-direct {p1, v3, p2}, Lcom/google/android/gms/internal/ads/XV;-><init>(ILjava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Lcom/google/android/gms/internal/ads/XV;

    const-string p2, "No native ad mappers"

    invoke-direct {p1, v3, p2}, Lcom/google/android/gms/internal/ads/XV;-><init>(ILjava/lang/String;)V

    throw p1
.end method
