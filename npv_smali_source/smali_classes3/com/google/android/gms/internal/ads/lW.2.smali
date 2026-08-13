.class public final Lcom/google/android/gms/internal/ads/lW;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/cU;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/kM;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/kM;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/lW;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/lW;->b:Lcom/google/android/gms/internal/ads/kM;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)V
    .locals 10

    .prologue
    :try_start_0
    iget-object v0, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/Tm;

    iget-object v1, p2, Lcom/google/android/gms/internal/ads/R60;->Z:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Tm;->J0(Ljava/lang/String;)V

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/n70;->o:Lcom/google/android/gms/internal/ads/Z60;

    iget v0, v0, Lcom/google/android/gms/internal/ads/Z60;->a:I

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

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

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/lW;->a:Landroid/content/Context;

    invoke-static {p1}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v7

    new-instance v8, Lcom/google/android/gms/internal/ads/jW;

    invoke-direct {v8, p0, p3, v2}, Lcom/google/android/gms/internal/ads/jW;-><init>(Lcom/google/android/gms/internal/ads/lW;Lcom/google/android/gms/internal/ads/YT;Lcom/google/android/gms/internal/ads/kW;)V

    iget-object p1, p3, Lcom/google/android/gms/internal/ads/YT;->c:Lcom/google/android/gms/internal/ads/qD;

    move-object v9, p1

    check-cast v9, Lcom/google/android/gms/internal/ads/bm;

    invoke-interface/range {v3 .. v9}, Lcom/google/android/gms/internal/ads/Tm;->K1(Ljava/lang/String;Ljava/lang/String;Ls3/X1;LX3/a;Lcom/google/android/gms/internal/ads/Qm;Lcom/google/android/gms/internal/ads/bm;)V

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

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object v6, p1, Lcom/google/android/gms/internal/ads/n70;->d:Ls3/X1;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/lW;->a:Landroid/content/Context;

    invoke-static {p1}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v7

    new-instance v8, Lcom/google/android/gms/internal/ads/jW;

    invoke-direct {v8, p0, p3, v2}, Lcom/google/android/gms/internal/ads/jW;-><init>(Lcom/google/android/gms/internal/ads/lW;Lcom/google/android/gms/internal/ads/YT;Lcom/google/android/gms/internal/ads/kW;)V

    iget-object p1, p3, Lcom/google/android/gms/internal/ads/YT;->c:Lcom/google/android/gms/internal/ads/qD;

    move-object v9, p1

    check-cast v9, Lcom/google/android/gms/internal/ads/bm;

    invoke-interface/range {v3 .. v9}, Lcom/google/android/gms/internal/ads/Tm;->u2(Ljava/lang/String;Ljava/lang/String;Ls3/X1;LX3/a;Lcom/google/android/gms/internal/ads/Qm;Lcom/google/android/gms/internal/ads/bm;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    const-string p2, "Remote exception loading a rewarded RTB ad"

    invoke-static {p2, p1}, Lv3/q0;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final bridge synthetic b(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/dV;

    iget-object v1, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/Tm;

    sget-object v2, Lk3/c;->F:Lk3/c;

    invoke-direct {v0, p2, v1, v2}, Lcom/google/android/gms/internal/ads/dV;-><init>(Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/Tm;Lk3/c;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/wA;

    iget-object v2, p3, Lcom/google/android/gms/internal/ads/YT;->a:Ljava/lang/String;

    invoke-direct {v1, p1, p2, v2}, Lcom/google/android/gms/internal/ads/wA;-><init>(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/hM;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/hM;-><init>(Lcom/google/android/gms/internal/ads/ZH;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/lW;->b:Lcom/google/android/gms/internal/ads/kM;

    invoke-virtual {p2, v1, p1}, Lcom/google/android/gms/internal/ads/kM;->d(Lcom/google/android/gms/internal/ads/wA;Lcom/google/android/gms/internal/ads/hM;)Lcom/google/android/gms/internal/ads/gM;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/hA;->b()Lcom/google/android/gms/internal/ads/XC;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/dV;->b(Lcom/google/android/gms/internal/ads/XC;)V

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/YT;->c:Lcom/google/android/gms/internal/ads/qD;

    check-cast p2, Lcom/google/android/gms/internal/ads/TU;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/gM;->o()Lcom/google/android/gms/internal/ads/IW;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/TU;->p6(Lcom/google/android/gms/internal/ads/bm;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/gM;->k()Lcom/google/android/gms/internal/ads/fM;

    move-result-object p1

    return-object p1
.end method
