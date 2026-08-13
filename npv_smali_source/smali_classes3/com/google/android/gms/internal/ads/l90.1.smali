.class public final Lcom/google/android/gms/internal/ads/l90;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Ljava/lang/String;

.field private final c:LP4/d;

.field private final d:Ljava/util/List;

.field private final e:LP4/d;

.field final synthetic f:Lcom/google/android/gms/internal/ads/n90;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/n90;Ljava/lang/Object;Ljava/lang/String;LP4/d;Ljava/util/List;LP4/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/l90;->f:Lcom/google/android/gms/internal/ads/n90;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/l90;->a:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/l90;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/l90;->c:LP4/d;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/l90;->d:Ljava/util/List;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/l90;->e:LP4/d;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/n90;Ljava/lang/Object;Ljava/lang/String;LP4/d;Ljava/util/List;LP4/d;Lcom/google/android/gms/internal/ads/m90;)V
    .locals 7

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/l90;-><init>(Lcom/google/android/gms/internal/ads/n90;Ljava/lang/Object;Ljava/lang/String;LP4/d;Ljava/util/List;LP4/d;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/a90;
    .locals 4

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/ads/a90;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/l90;->a:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/l90;->b:Ljava/lang/String;

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/l90;->f:Lcom/google/android/gms/internal/ads/n90;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/n90;->f(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :cond_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/l90;->e:LP4/d;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/a90;-><init>(Ljava/lang/Object;Ljava/lang/String;LP4/d;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/l90;->f:Lcom/google/android/gms/internal/ads/n90;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/n90;->c(Lcom/google/android/gms/internal/ads/n90;)Lcom/google/android/gms/internal/ads/o90;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/o90;->W(Lcom/google/android/gms/internal/ads/a90;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/l90;->c:LP4/d;

    new-instance v2, Lcom/google/android/gms/internal/ads/j90;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/ads/j90;-><init>(Lcom/google/android/gms/internal/ads/l90;Lcom/google/android/gms/internal/ads/a90;)V

    sget-object v3, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-interface {v1, v2, v3}, LP4/d;->e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/k90;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/ads/k90;-><init>(Lcom/google/android/gms/internal/ads/l90;Lcom/google/android/gms/internal/ads/a90;)V

    invoke-static {v0, v1, v3}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public final b(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/l90;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/l90;->f:Lcom/google/android/gms/internal/ads/n90;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/l90;->a()Lcom/google/android/gms/internal/ads/a90;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/n90;->b(Ljava/lang/Object;LP4/d;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/tk0;)Lcom/google/android/gms/internal/ads/l90;
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/l90;->f:Lcom/google/android/gms/internal/ads/n90;

    new-instance v8, Lcom/google/android/gms/internal/ads/l90;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/n90;->e(Lcom/google/android/gms/internal/ads/n90;)Lcom/google/android/gms/internal/ads/Yk0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/l90;->e:LP4/d;

    invoke-static {v1, p1, p2, v0}, Lcom/google/android/gms/internal/ads/Nk0;->f(LP4/d;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v7

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/l90;->f:Lcom/google/android/gms/internal/ads/n90;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/l90;->a:Ljava/lang/Object;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/l90;->b:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/l90;->c:LP4/d;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/l90;->d:Ljava/util/List;

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/l90;-><init>(Lcom/google/android/gms/internal/ads/n90;Ljava/lang/Object;Ljava/lang/String;LP4/d;Ljava/util/List;LP4/d;)V

    return-object v8
.end method

.method public final d(LP4/d;)Lcom/google/android/gms/internal/ads/l90;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/i90;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/i90;-><init>(LP4/d;)V

    sget-object p1, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/ads/l90;->g(Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lcom/google/android/gms/internal/ads/Y80;)Lcom/google/android/gms/internal/ads/l90;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/g90;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/g90;-><init>(Lcom/google/android/gms/internal/ads/Y80;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/l90;->f(Lcom/google/android/gms/internal/ads/tk0;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lcom/google/android/gms/internal/ads/tk0;)Lcom/google/android/gms/internal/ads/l90;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/l90;->f:Lcom/google/android/gms/internal/ads/n90;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/n90;->e(Lcom/google/android/gms/internal/ads/n90;)Lcom/google/android/gms/internal/ads/Yk0;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/l90;->g(Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object p1

    return-object p1
.end method

.method public final g(Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/l90;
    .locals 8

    new-instance v7, Lcom/google/android/gms/internal/ads/l90;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/l90;->e:LP4/d;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/l90;->f:Lcom/google/android/gms/internal/ads/n90;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/l90;->a:Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/l90;->b:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/l90;->c:LP4/d;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/l90;->d:Ljava/util/List;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v6

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/l90;-><init>(Lcom/google/android/gms/internal/ads/n90;Ljava/lang/Object;Ljava/lang/String;LP4/d;Ljava/util/List;LP4/d;)V

    return-object v7
.end method

.method public final h(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/l90;
    .locals 8

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/l90;->c:LP4/d;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/l90;->d:Ljava/util/List;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/l90;->e:LP4/d;

    new-instance v7, Lcom/google/android/gms/internal/ads/l90;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/l90;->f:Lcom/google/android/gms/internal/ads/n90;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/l90;->a:Ljava/lang/Object;

    move-object v0, v7

    move-object v3, p1

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/l90;-><init>(Lcom/google/android/gms/internal/ads/n90;Ljava/lang/Object;Ljava/lang/String;LP4/d;Ljava/util/List;LP4/d;)V

    return-object v7
.end method

.method public final i(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/internal/ads/l90;
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/l90;->f:Lcom/google/android/gms/internal/ads/n90;

    new-instance v8, Lcom/google/android/gms/internal/ads/l90;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/n90;->g(Lcom/google/android/gms/internal/ads/n90;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/l90;->e:LP4/d;

    invoke-static {v1, p1, p2, p3, v0}, Lcom/google/android/gms/internal/ads/Nk0;->o(LP4/d;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)LP4/d;

    move-result-object v7

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/l90;->f:Lcom/google/android/gms/internal/ads/n90;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/l90;->a:Ljava/lang/Object;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/l90;->b:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/l90;->c:LP4/d;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/l90;->d:Ljava/util/List;

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/l90;-><init>(Lcom/google/android/gms/internal/ads/n90;Ljava/lang/Object;Ljava/lang/String;LP4/d;Ljava/util/List;LP4/d;)V

    return-object v8
.end method
