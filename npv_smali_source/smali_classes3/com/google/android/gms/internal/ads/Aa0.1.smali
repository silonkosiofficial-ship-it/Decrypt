.class public final Lcom/google/android/gms/internal/ads/Aa0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lw3/y;

.field private final b:Lw3/v;

.field private final c:Lcom/google/android/gms/internal/ads/Zk0;

.field private final d:Lcom/google/android/gms/internal/ads/Ba0;


# direct methods
.method public constructor <init>(Lw3/y;Lw3/v;Lcom/google/android/gms/internal/ads/Zk0;Lcom/google/android/gms/internal/ads/Ba0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Aa0;->a:Lw3/y;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Aa0;->b:Lw3/v;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Aa0;->c:Lcom/google/android/gms/internal/ads/Zk0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/Aa0;->d:Lcom/google/android/gms/internal/ads/Ba0;

    return-void
.end method

.method private final e(Ljava/lang/String;JI)LP4/d;
    .locals 8

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Aa0;->a:Lw3/y;

    invoke-virtual {v0}, Lw3/y;->c()I

    move-result v1

    if-le p4, v1, :cond_1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Aa0;->d:Lcom/google/android/gms/internal/ads/Ba0;

    if-eqz p2, :cond_0

    invoke-virtual {v0}, Lw3/y;->d()Z

    move-result p3

    if-eqz p3, :cond_0

    const-string p3, ""

    const/4 p4, 0x2

    invoke-virtual {p2, p1, p3, p4}, Lcom/google/android/gms/internal/ads/Ba0;->a(Ljava/lang/String;Ljava/lang/String;I)V

    sget-object p1, Lw3/u;->F:Lw3/u;

    :goto_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    goto :goto_1

    :cond_0
    sget-object p1, Lw3/u;->E:Lw3/u;

    goto :goto_0

    :goto_1
    return-object p1

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->w8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getEncodedQuery()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->clearQuery()Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-static {p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "pa"

    invoke-virtual {v0, v3, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    move-object v0, p1

    :goto_2
    new-instance v7, Lcom/google/android/gms/internal/ads/za0;

    move-object v1, v7

    move-object v2, p0

    move v3, p4

    move-wide v4, p2

    move-object v6, p1

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/za0;-><init>(Lcom/google/android/gms/internal/ads/Aa0;IJLjava/lang/String;)V

    const-wide/16 v1, 0x0

    cmp-long p1, p2, v1

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Aa0;->c:Lcom/google/android/gms/internal/ads/Zk0;

    new-instance p2, Lcom/google/android/gms/internal/ads/ya0;

    invoke-direct {p2, p0, v0}, Lcom/google/android/gms/internal/ads/ya0;-><init>(Lcom/google/android/gms/internal/ads/Aa0;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/Yk0;->H0(Ljava/util/concurrent/Callable;)LP4/d;

    move-result-object p1

    :goto_3
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Aa0;->c:Lcom/google/android/gms/internal/ads/Zk0;

    invoke-static {p1, v7, p2}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Aa0;->c:Lcom/google/android/gms/internal/ads/Zk0;

    new-instance p4, Lcom/google/android/gms/internal/ads/xa0;

    invoke-direct {p4, p0, v0}, Lcom/google/android/gms/internal/ads/xa0;-><init>(Lcom/google/android/gms/internal/ads/Aa0;Ljava/lang/String;)V

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, p4, p2, p3, v0}, Lcom/google/android/gms/internal/ads/Zk0;->u0(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/internal/ads/Xk0;

    move-result-object p1

    goto :goto_3
.end method


# virtual methods
.method final synthetic a(Ljava/lang/String;)Lw3/u;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Aa0;->b:Lw3/v;

    invoke-virtual {v0, p1}, Lw3/v;->o(Ljava/lang/String;)Lw3/u;

    move-result-object p1

    return-object p1
.end method

.method final synthetic b(Ljava/lang/String;)Lw3/u;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Aa0;->b:Lw3/v;

    invoke-virtual {v0, p1}, Lw3/v;->o(Ljava/lang/String;)Lw3/u;

    move-result-object p1

    return-object p1
.end method

.method final synthetic c(IJLjava/lang/String;Lw3/u;)LP4/d;
    .locals 3

    .prologue
    sget-object v0, Lw3/u;->E:Lw3/u;

    if-eq p5, v0, :cond_0

    invoke-static {p5}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p5, p0, Lcom/google/android/gms/internal/ads/Aa0;->a:Lw3/y;

    invoke-virtual {p5}, Lw3/y;->b()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    if-eq p1, v2, :cond_1

    long-to-double p2, p2

    invoke-virtual {p5}, Lw3/y;->a()D

    move-result-wide v0

    mul-double/2addr v0, p2

    double-to-long v0, v0

    :cond_1
    add-int/2addr p1, v2

    invoke-direct {p0, p4, v0, v1, p1}, Lcom/google/android/gms/internal/ads/Aa0;->e(Ljava/lang/String;JI)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/String;)LP4/d;
    .locals 3

    .prologue
    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    :try_start_0
    invoke-direct {p0, p1, v0, v1, v2}, Lcom/google/android/gms/internal/ads/Aa0;->e(Ljava/lang/String;JI)LP4/d;

    move-result-object p1
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    sget-object p1, Lw3/u;->D:Lw3/u;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method
