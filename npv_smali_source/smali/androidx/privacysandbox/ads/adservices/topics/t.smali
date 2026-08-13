.class public abstract Landroidx/privacysandbox/ads/adservices/topics/t;
.super Landroidx/privacysandbox/ads/adservices/topics/d;
.source "SourceFile"


# instance fields
.field private final b:Landroid/adservices/topics/TopicsManager;


# direct methods
.method public constructor <init>(Landroid/adservices/topics/TopicsManager;)V
    .locals 1

    const-string v0, "mTopicsManager"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/privacysandbox/ads/adservices/topics/d;-><init>()V

    iput-object p1, p0, Landroidx/privacysandbox/ads/adservices/topics/t;->b:Landroid/adservices/topics/TopicsManager;

    return-void
.end method

.method public static final synthetic b(Landroidx/privacysandbox/ads/adservices/topics/t;)Landroid/adservices/topics/TopicsManager;
    .locals 0

    iget-object p0, p0, Landroidx/privacysandbox/ads/adservices/topics/t;->b:Landroid/adservices/topics/TopicsManager;

    return-object p0
.end method

.method static synthetic e(Landroidx/privacysandbox/ads/adservices/topics/t;Landroidx/privacysandbox/ads/adservices/topics/a;Lm7/e;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/privacysandbox/ads/adservices/topics/t;",
            "Landroidx/privacysandbox/ads/adservices/topics/a;",
            "Lm7/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .prologue
    instance-of v0, p2, Landroidx/privacysandbox/ads/adservices/topics/t$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Landroidx/privacysandbox/ads/adservices/topics/t$a;

    iget v1, v0, Landroidx/privacysandbox/ads/adservices/topics/t$a;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/privacysandbox/ads/adservices/topics/t$a;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/privacysandbox/ads/adservices/topics/t$a;

    invoke-direct {v0, p0, p2}, Landroidx/privacysandbox/ads/adservices/topics/t$a;-><init>(Landroidx/privacysandbox/ads/adservices/topics/t;Lm7/e;)V

    :goto_0
    iget-object p2, v0, Landroidx/privacysandbox/ads/adservices/topics/t$a;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Landroidx/privacysandbox/ads/adservices/topics/t$a;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Landroidx/privacysandbox/ads/adservices/topics/t$a;->F:Ljava/lang/Object;

    check-cast p0, Landroidx/privacysandbox/ads/adservices/topics/t;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Landroidx/privacysandbox/ads/adservices/topics/t;->c(Landroidx/privacysandbox/ads/adservices/topics/a;)Landroid/adservices/topics/GetTopicsRequest;

    move-result-object p1

    iput-object p0, v0, Landroidx/privacysandbox/ads/adservices/topics/t$a;->F:Ljava/lang/Object;

    iput v3, v0, Landroidx/privacysandbox/ads/adservices/topics/t$a;->I:I

    invoke-direct {p0, p1, v0}, Landroidx/privacysandbox/ads/adservices/topics/t;->f(Landroid/adservices/topics/GetTopicsRequest;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-static {p2}, Landroidx/privacysandbox/ads/adservices/topics/m;->a(Ljava/lang/Object;)Landroid/adservices/topics/GetTopicsResponse;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/privacysandbox/ads/adservices/topics/t;->d(Landroid/adservices/topics/GetTopicsResponse;)Landroidx/privacysandbox/ads/adservices/topics/b;

    move-result-object p0

    return-object p0
.end method

.method private final f(Landroid/adservices/topics/GetTopicsRequest;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    new-instance v0, LW8/n;

    invoke-static {p2}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LW8/n;-><init>(Lm7/e;I)V

    invoke-virtual {v0}, LW8/n;->E()V

    invoke-static {p0}, Landroidx/privacysandbox/ads/adservices/topics/t;->b(Landroidx/privacysandbox/ads/adservices/topics/t;)Landroid/adservices/topics/TopicsManager;

    move-result-object v1

    new-instance v2, Lm2/m;

    invoke-direct {v2}, Lm2/m;-><init>()V

    invoke-static {v0}, Landroidx/core/os/r;->a(Lm7/e;)Landroid/os/OutcomeReceiver;

    move-result-object v3

    invoke-static {v1, p1, v2, v3}, Landroidx/privacysandbox/ads/adservices/topics/s;->a(Landroid/adservices/topics/TopicsManager;Landroid/adservices/topics/GetTopicsRequest;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    invoke-virtual {v0}, LW8/n;->x()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lo7/h;->c(Lm7/e;)V

    :cond_0
    return-object p1
.end method


# virtual methods
.method public a(Landroidx/privacysandbox/ads/adservices/topics/a;Lm7/e;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/privacysandbox/ads/adservices/topics/a;",
            "Lm7/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Landroidx/privacysandbox/ads/adservices/topics/t;->e(Landroidx/privacysandbox/ads/adservices/topics/t;Landroidx/privacysandbox/ads/adservices/topics/a;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroidx/privacysandbox/ads/adservices/topics/a;)Landroid/adservices/topics/GetTopicsRequest;
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/privacysandbox/ads/adservices/topics/k;->a()Landroid/adservices/topics/GetTopicsRequest$Builder;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/privacysandbox/ads/adservices/topics/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/privacysandbox/ads/adservices/topics/h;->a(Landroid/adservices/topics/GetTopicsRequest$Builder;Ljava/lang/String;)Landroid/adservices/topics/GetTopicsRequest$Builder;

    move-result-object p1

    invoke-static {p1}, Landroidx/privacysandbox/ads/adservices/topics/j;->a(Landroid/adservices/topics/GetTopicsRequest$Builder;)Landroid/adservices/topics/GetTopicsRequest;

    move-result-object p1

    const-string v0, "Builder()\n            .s\u2026ame)\n            .build()"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final d(Landroid/adservices/topics/GetTopicsResponse;)Landroidx/privacysandbox/ads/adservices/topics/b;
    .locals 9

    .prologue
    const-string v0, "response"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Landroidx/privacysandbox/ads/adservices/topics/n;->a(Landroid/adservices/topics/GetTopicsResponse;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Landroidx/privacysandbox/ads/adservices/topics/o;->a(Ljava/lang/Object;)Landroid/adservices/topics/Topic;

    move-result-object v1

    new-instance v8, Landroidx/privacysandbox/ads/adservices/topics/c;

    invoke-static {v1}, Landroidx/privacysandbox/ads/adservices/topics/p;->a(Landroid/adservices/topics/Topic;)J

    move-result-wide v3

    invoke-static {v1}, Landroidx/privacysandbox/ads/adservices/topics/q;->a(Landroid/adservices/topics/Topic;)J

    move-result-wide v5

    invoke-static {v1}, Landroidx/privacysandbox/ads/adservices/topics/r;->a(Landroid/adservices/topics/Topic;)I

    move-result v7

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Landroidx/privacysandbox/ads/adservices/topics/c;-><init>(JJI)V

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Landroidx/privacysandbox/ads/adservices/topics/b;

    invoke-direct {p1, v0}, Landroidx/privacysandbox/ads/adservices/topics/b;-><init>(Ljava/util/List;)V

    return-object p1
.end method
