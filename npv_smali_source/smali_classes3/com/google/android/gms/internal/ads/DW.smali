.class public final Lcom/google/android/gms/internal/ads/DW;
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

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/DW;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/DW;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/DW;->c:Lcom/google/android/gms/internal/ads/kM;

    return-void
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/DW;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/DW;->b:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method static bridge synthetic d(Lcom/google/android/gms/internal/ads/DW;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)V
    .locals 0

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/DW;->e(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)V

    return-void
.end method

.method private static final e(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)V
    .locals 1

    .prologue
    :try_start_0
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/M70;

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/n70;->d:Ls3/X1;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/R60;->v:Lorg/json/JSONObject;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/internal/ads/M70;->p(Ls3/X1;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    iget-object p1, p2, Lcom/google/android/gms/internal/ads/YT;->a:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "Fail to load ad from adapter "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)V
    .locals 7

    .prologue
    iget-object v0, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/ads/M70;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/M70;->c()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/BW;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/BW;-><init>(Lcom/google/android/gms/internal/ads/DW;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)V

    iget-object v1, p3, Lcom/google/android/gms/internal/ads/YT;->c:Lcom/google/android/gms/internal/ads/qD;

    check-cast v1, Lcom/google/android/gms/internal/ads/UU;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/UU;->q6(Lcom/google/android/gms/internal/ads/YG;)V

    iget-object v0, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/DW;->a:Landroid/content/Context;

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/internal/ads/M70;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/e70;->a:Lcom/google/android/gms/internal/ads/a70;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/a70;->a:Lcom/google/android/gms/internal/ads/n70;

    iget-object p3, p3, Lcom/google/android/gms/internal/ads/YT;->c:Lcom/google/android/gms/internal/ads/qD;

    move-object v5, p3

    check-cast v5, Lcom/google/android/gms/internal/ads/np;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/R60;->v:Lorg/json/JSONObject;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v6

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/n70;->d:Ls3/X1;

    const/4 v4, 0x0

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/M70;->m(Landroid/content/Context;Ls3/X1;Ljava/lang/String;Lcom/google/android/gms/internal/ads/np;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/DW;->e(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)V

    return-void
.end method

.method public final bridge synthetic b(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/YT;)Ljava/lang/Object;
    .locals 8

    new-instance v0, Lcom/google/android/gms/internal/ads/wA;

    iget-object v1, p3, Lcom/google/android/gms/internal/ads/YT;->a:Ljava/lang/String;

    invoke-direct {v0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/wA;-><init>(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/lang/String;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/hM;

    new-instance p2, Lcom/google/android/gms/internal/ads/zW;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/ads/zW;-><init>(Lcom/google/android/gms/internal/ads/YT;)V

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/hM;-><init>(Lcom/google/android/gms/internal/ads/ZH;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/DW;->c:Lcom/google/android/gms/internal/ads/kM;

    invoke-virtual {p2, v0, p1}, Lcom/google/android/gms/internal/ads/kM;->d(Lcom/google/android/gms/internal/ads/wA;Lcom/google/android/gms/internal/ads/hM;)Lcom/google/android/gms/internal/ads/gM;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/hA;->c()Lcom/google/android/gms/internal/ads/eD;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/Bx;

    iget-object v1, p3, Lcom/google/android/gms/internal/ads/YT;->b:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/internal/ads/M70;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/Bx;-><init>(Lcom/google/android/gms/internal/ads/M70;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/DW;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/ads/BF;->F0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/hA;->d()Lcom/google/android/gms/internal/ads/nD;

    move-result-object v6

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/hA;->a()Lcom/google/android/gms/internal/ads/CC;

    move-result-object v5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/gM;->h()Lcom/google/android/gms/internal/ads/MD;

    move-result-object v4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/gM;->i()Lcom/google/android/gms/internal/ads/WG;

    move-result-object v7

    iget-object p2, p3, Lcom/google/android/gms/internal/ads/YT;->c:Lcom/google/android/gms/internal/ads/qD;

    check-cast p2, Lcom/google/android/gms/internal/ads/UU;

    new-instance p3, Lcom/google/android/gms/internal/ads/CW;

    move-object v2, p3

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/CW;-><init>(Lcom/google/android/gms/internal/ads/DW;Lcom/google/android/gms/internal/ads/MD;Lcom/google/android/gms/internal/ads/CC;Lcom/google/android/gms/internal/ads/nD;Lcom/google/android/gms/internal/ads/WG;)V

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/UU;->p6(Lcom/google/android/gms/internal/ads/np;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/gM;->k()Lcom/google/android/gms/internal/ads/fM;

    move-result-object p1

    return-object p1
.end method
