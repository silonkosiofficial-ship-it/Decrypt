.class public final Lcom/google/android/gms/internal/ads/hW;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/cU;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Lcom/google/android/gms/internal/ads/kM;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/kM;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/hW;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/hW;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/hW;->c:Lcom/google/android/gms/internal/ads/kM;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)V
    .locals 3

    .prologue
    :try_start_0
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/n70;->o:Lcom/google/android/gms/internal/ads/Z60;

    iget v0, v0, Lcom/google/android/gms/internal/ads/Z60;->a:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/M70;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/hW;->a:Landroid/content/Context;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/n70;->d:Ls3/X1;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/R60;->v:Lorg/json/JSONObject;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object v2, p3, Lcom/google/android/gms/internal/ads/YT;->c:Lcom/google/android/gms/internal/ads/qD;

    check-cast v2, Lcom/google/android/gms/internal/ads/bm;

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/ads/M70;->w(Landroid/content/Context;Ls3/X1;Ljava/lang/String;Lcom/google/android/gms/internal/ads/bm;)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-object v0, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/M70;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/hW;->a:Landroid/content/Context;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/n70;->d:Ls3/X1;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/R60;->v:Lorg/json/JSONObject;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object v2, p3, Lcom/google/android/gms/internal/ads/YT;->c:Lcom/google/android/gms/internal/ads/qD;

    check-cast v2, Lcom/google/android/gms/internal/ads/bm;

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/ads/M70;->v(Landroid/content/Context;Ls3/X1;Ljava/lang/String;Lcom/google/android/gms/internal/ads/bm;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    iget-object p2, p3, Lcom/google/android/gms/internal/ads/YT;->a:Ljava/lang/String;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "Fail to load ad from adapter "

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final bridge synthetic b(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/wA;

    iget-object v1, p3, Lcom/google/android/gms/internal/ads/YT;->a:Ljava/lang/String;

    invoke-direct {v0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/wA;-><init>(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/hM;

    new-instance p2, Lcom/google/android/gms/internal/ads/gW;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/ads/gW;-><init>(Lcom/google/android/gms/internal/ads/YT;)V

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/hM;-><init>(Lcom/google/android/gms/internal/ads/ZH;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/hW;->c:Lcom/google/android/gms/internal/ads/kM;

    invoke-virtual {p2, v0, p1}, Lcom/google/android/gms/internal/ads/kM;->d(Lcom/google/android/gms/internal/ads/wA;Lcom/google/android/gms/internal/ads/hM;)Lcom/google/android/gms/internal/ads/gM;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/hA;->c()Lcom/google/android/gms/internal/ads/eD;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/Bx;

    iget-object v1, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/M70;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/Bx;-><init>(Lcom/google/android/gms/internal/ads/M70;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/hW;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/ads/BF;->F0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/YT;->c:Lcom/google/android/gms/internal/ads/qD;

    check-cast p2, Lcom/google/android/gms/internal/ads/TU;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/gM;->n()Lcom/google/android/gms/internal/ads/nW;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/TU;->p6(Lcom/google/android/gms/internal/ads/bm;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/gM;->k()Lcom/google/android/gms/internal/ads/fM;

    move-result-object p1

    return-object p1
.end method
