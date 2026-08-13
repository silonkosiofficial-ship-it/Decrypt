.class public LY4/h;
.super LV4/e;
.source "SourceFile"


# instance fields
.field private final a:LQ4/f;

.field private final b:LF5/b;

.field private final c:Ljava/util/List;

.field private final d:Ljava/util/List;

.field private final e:LY4/p;

.field private final f:LY4/q;

.field private final g:Ljava/util/concurrent/Executor;

.field private final h:Ljava/util/concurrent/Executor;

.field private final i:Ljava/util/concurrent/Executor;

.field private final j:Ll4/l;

.field private final k:LZ4/a;

.field private l:LV4/b;

.field private m:LV4/a;

.field private n:LV4/c;

.field private o:Ll4/l;


# direct methods
.method public constructor <init>(LQ4/f;LF5/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 2

    invoke-direct {p0}, LV4/e;-><init>()V

    invoke-static {p1}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LY4/h;->a:LQ4/f;

    iput-object p2, p0, LY4/h;->b:LF5/b;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, LY4/h;->c:Ljava/util/List;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, LY4/h;->d:Ljava/util/List;

    new-instance p2, LY4/p;

    invoke-virtual {p1}, LQ4/f;->k()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, LQ4/f;->o()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v0, v1}, LY4/p;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object p2, p0, LY4/h;->e:LY4/p;

    new-instance p2, LY4/q;

    invoke-virtual {p1}, LQ4/f;->k()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1, p0, p4, p6}, LY4/q;-><init>(Landroid/content/Context;LY4/h;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    iput-object p2, p0, LY4/h;->f:LY4/q;

    iput-object p3, p0, LY4/h;->g:Ljava/util/concurrent/Executor;

    iput-object p4, p0, LY4/h;->h:Ljava/util/concurrent/Executor;

    iput-object p5, p0, LY4/h;->i:Ljava/util/concurrent/Executor;

    invoke-direct {p0, p5}, LY4/h;->q(Ljava/util/concurrent/Executor;)Ll4/l;

    move-result-object p1

    iput-object p1, p0, LY4/h;->j:Ll4/l;

    new-instance p1, LZ4/a$a;

    invoke-direct {p1}, LZ4/a$a;-><init>()V

    iput-object p1, p0, LY4/h;->k:LZ4/a;

    return-void
.end method

.method public static synthetic e(LY4/h;LV4/c;)V
    .locals 0

    invoke-direct {p0, p1}, LY4/h;->p(LV4/c;)V

    return-void
.end method

.method public static synthetic f(LY4/h;LV4/c;)Ll4/l;
    .locals 0

    invoke-direct {p0, p1}, LY4/h;->m(LV4/c;)Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(LY4/h;ZLl4/l;)Ll4/l;
    .locals 0

    invoke-direct {p0, p1, p2}, LY4/h;->n(ZLl4/l;)Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(LY4/h;Ll4/m;)V
    .locals 0

    invoke-direct {p0, p1}, LY4/h;->o(Ll4/m;)V

    return-void
.end method

.method private k()Z
    .locals 4

    .prologue
    iget-object v0, p0, LY4/h;->n:LV4/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LV4/c;->a()J

    move-result-wide v0

    iget-object v2, p0, LY4/h;->k:LZ4/a;

    invoke-interface {v2}, LZ4/a;->a()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x493e0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private synthetic m(LV4/c;)Ll4/l;
    .locals 3

    .prologue
    invoke-direct {p0, p1}, LY4/h;->s(LV4/c;)V

    iget-object v0, p0, LY4/h;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    invoke-static {p1}, LY4/c;->a(LV4/c;)LY4/c;

    iget-object v0, p0, LY4/h;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p1}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    throw v2

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    throw v2
.end method

.method private synthetic n(ZLl4/l;)Ll4/l;
    .locals 0

    .prologue
    if-nez p1, :cond_0

    invoke-direct {p0}, LY4/h;->k()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LY4/h;->n:LV4/c;

    invoke-static {p1}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, LY4/h;->m:LV4/a;

    if-nez p1, :cond_1

    new-instance p1, LQ4/m;

    const-string p2, "No AppCheckProvider installed."

    invoke-direct {p1, p2}, LQ4/m;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ll4/o;->d(Ljava/lang/Exception;)Ll4/l;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p1, p0, LY4/h;->o:Ll4/l;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ll4/l;->n()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, LY4/h;->o:Ll4/l;

    invoke-virtual {p1}, Ll4/l;->m()Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    invoke-virtual {p0}, LY4/h;->i()Ll4/l;

    move-result-object p1

    iput-object p1, p0, LY4/h;->o:Ll4/l;

    :cond_3
    iget-object p1, p0, LY4/h;->o:Ll4/l;

    return-object p1
.end method

.method private synthetic o(Ll4/m;)V
    .locals 1

    .prologue
    iget-object v0, p0, LY4/h;->e:LY4/p;

    invoke-virtual {v0}, LY4/p;->d()LV4/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, LY4/h;->r(LV4/c;)V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll4/m;->c(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic p(LV4/c;)V
    .locals 1

    iget-object v0, p0, LY4/h;->e:LY4/p;

    invoke-virtual {v0, p1}, LY4/p;->e(LV4/c;)V

    return-void
.end method

.method private q(Ljava/util/concurrent/Executor;)Ll4/l;
    .locals 2

    new-instance v0, Ll4/m;

    invoke-direct {v0}, Ll4/m;-><init>()V

    new-instance v1, LY4/d;

    invoke-direct {v1, p0, v0}, LY4/d;-><init>(LY4/h;Ll4/m;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ll4/m;->a()Ll4/l;

    move-result-object p1

    return-object p1
.end method

.method private s(LV4/c;)V
    .locals 2

    iget-object v0, p0, LY4/h;->i:Ljava/util/concurrent/Executor;

    new-instance v1, LY4/f;

    invoke-direct {v1, p0, p1}, LY4/f;-><init>(LY4/h;LV4/c;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {p0, p1}, LY4/h;->r(LV4/c;)V

    iget-object v0, p0, LY4/h;->f:LY4/q;

    invoke-virtual {v0, p1}, LY4/q;->d(LV4/c;)V

    return-void
.end method


# virtual methods
.method public a(Z)Ll4/l;
    .locals 3

    iget-object v0, p0, LY4/h;->j:Ll4/l;

    iget-object v1, p0, LY4/h;->h:Ljava/util/concurrent/Executor;

    new-instance v2, LY4/g;

    invoke-direct {v2, p0, p1}, LY4/g;-><init>(LY4/h;Z)V

    invoke-virtual {v0, v1, v2}, Ll4/l;->i(Ljava/util/concurrent/Executor;Ll4/c;)Ll4/l;

    move-result-object p1

    return-object p1
.end method

.method public d(LV4/b;)V
    .locals 1

    iget-object v0, p0, LY4/h;->a:LQ4/f;

    invoke-virtual {v0}, LQ4/f;->t()Z

    move-result v0

    invoke-virtual {p0, p1, v0}, LY4/h;->l(LV4/b;Z)V

    return-void
.end method

.method i()Ll4/l;
    .locals 3

    iget-object v0, p0, LY4/h;->m:LV4/a;

    invoke-interface {v0}, LV4/a;->a()Ll4/l;

    move-result-object v0

    iget-object v1, p0, LY4/h;->g:Ljava/util/concurrent/Executor;

    new-instance v2, LY4/e;

    invoke-direct {v2, p0}, LY4/e;-><init>(LY4/h;)V

    invoke-virtual {v0, v1, v2}, Ll4/l;->p(Ljava/util/concurrent/Executor;Ll4/k;)Ll4/l;

    move-result-object v0

    return-object v0
.end method

.method j()LF5/b;
    .locals 1

    iget-object v0, p0, LY4/h;->b:LF5/b;

    return-object v0
.end method

.method public l(LV4/b;Z)V
    .locals 1

    invoke-static {p1}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LY4/h;->l:LV4/b;

    iget-object v0, p0, LY4/h;->a:LQ4/f;

    invoke-interface {p1, v0}, LV4/b;->a(LQ4/f;)LV4/a;

    move-result-object p1

    iput-object p1, p0, LY4/h;->m:LV4/a;

    iget-object p1, p0, LY4/h;->f:LY4/q;

    invoke-virtual {p1, p2}, LY4/q;->e(Z)V

    return-void
.end method

.method r(LV4/c;)V
    .locals 0

    iput-object p1, p0, LY4/h;->n:LV4/c;

    return-void
.end method
