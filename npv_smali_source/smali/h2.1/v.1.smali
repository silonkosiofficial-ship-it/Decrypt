.class public final Lh2/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private final b:LZ8/y;

.field private final c:LZ8/N;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lh2/v;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v0, 0x0

    invoke-static {v0}, LZ8/P;->a(Ljava/lang/Object;)LZ8/y;

    move-result-object v0

    iput-object v0, p0, Lh2/v;->b:LZ8/y;

    invoke-static {v0}, LZ8/h;->b(LZ8/y;)LZ8/N;

    move-result-object v0

    iput-object v0, p0, Lh2/v;->c:LZ8/N;

    return-void
.end method

.method public static final synthetic a(Lh2/v;Lh2/g;Lh2/s;Lh2/s;)Lh2/g;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lh2/v;->c(Lh2/g;Lh2/s;Lh2/s;)Lh2/g;

    move-result-object p0

    return-object p0
.end method

.method private final b(Lh2/r;Lh2/r;Lh2/r;Lh2/r;)Lh2/r;
    .locals 0

    .prologue
    if-nez p4, :cond_0

    return-object p3

    :cond_0
    instance-of p3, p1, Lh2/r$b;

    if-eqz p3, :cond_2

    instance-of p2, p2, Lh2/r$c;

    if-eqz p2, :cond_1

    instance-of p2, p4, Lh2/r$c;

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    instance-of p2, p4, Lh2/r$a;

    if-eqz p2, :cond_3

    :cond_2
    :goto_0
    move-object p1, p4

    :cond_3
    return-object p1
.end method

.method private final c(Lh2/g;Lh2/s;Lh2/s;)Lh2/g;
    .locals 11

    .prologue
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lh2/g;->d()Lh2/r;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Lh2/r$c;->b:Lh2/r$c$a;

    invoke-virtual {v0}, Lh2/r$c$a;->b()Lh2/r$c;

    move-result-object v0

    :cond_1
    invoke-virtual {p2}, Lh2/s;->f()Lh2/r;

    move-result-object v1

    invoke-virtual {p2}, Lh2/s;->f()Lh2/r;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Lh2/s;->f()Lh2/r;

    move-result-object v4

    goto :goto_0

    :cond_2
    move-object v4, v3

    :goto_0
    invoke-direct {p0, v0, v1, v2, v4}, Lh2/v;->b(Lh2/r;Lh2/r;Lh2/r;Lh2/r;)Lh2/r;

    move-result-object v6

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lh2/g;->c()Lh2/r;

    move-result-object v0

    if-nez v0, :cond_4

    :cond_3
    sget-object v0, Lh2/r$c;->b:Lh2/r$c$a;

    invoke-virtual {v0}, Lh2/r$c$a;->b()Lh2/r$c;

    move-result-object v0

    :cond_4
    invoke-virtual {p2}, Lh2/s;->f()Lh2/r;

    move-result-object v1

    invoke-virtual {p2}, Lh2/s;->e()Lh2/r;

    move-result-object v2

    if-eqz p3, :cond_5

    invoke-virtual {p3}, Lh2/s;->e()Lh2/r;

    move-result-object v4

    goto :goto_1

    :cond_5
    move-object v4, v3

    :goto_1
    invoke-direct {p0, v0, v1, v2, v4}, Lh2/v;->b(Lh2/r;Lh2/r;Lh2/r;Lh2/r;)Lh2/r;

    move-result-object v7

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lh2/g;->a()Lh2/r;

    move-result-object p1

    if-nez p1, :cond_7

    :cond_6
    sget-object p1, Lh2/r$c;->b:Lh2/r$c$a;

    invoke-virtual {p1}, Lh2/r$c$a;->b()Lh2/r$c;

    move-result-object p1

    :cond_7
    invoke-virtual {p2}, Lh2/s;->f()Lh2/r;

    move-result-object v0

    invoke-virtual {p2}, Lh2/s;->d()Lh2/r;

    move-result-object v1

    if-eqz p3, :cond_8

    invoke-virtual {p3}, Lh2/s;->d()Lh2/r;

    move-result-object v3

    :cond_8
    invoke-direct {p0, p1, v0, v1, v3}, Lh2/v;->b(Lh2/r;Lh2/r;Lh2/r;Lh2/r;)Lh2/r;

    move-result-object v8

    new-instance p1, Lh2/g;

    move-object v5, p1

    move-object v9, p2

    move-object v10, p3

    invoke-direct/range {v5 .. v10}, Lh2/g;-><init>(Lh2/r;Lh2/r;Lh2/r;Lh2/s;Lh2/s;)V

    return-object p1
.end method

.method private final d(Lx7/l;)V
    .locals 4

    .prologue
    iget-object v0, p0, Lh2/v;->b:LZ8/y;

    :cond_0
    invoke-interface {v0}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lh2/g;

    invoke-interface {p1, v2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh2/g;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface {v0, v1, v3}, LZ8/y;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v3, :cond_1

    iget-object p1, p0, Lh2/v;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx7/l;

    invoke-interface {v0, v3}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final e()LZ8/N;
    .locals 1

    iget-object v0, p0, Lh2/v;->c:LZ8/N;

    return-object v0
.end method

.method public final f(Lh2/s;Lh2/s;)V
    .locals 1

    const-string v0, "sourceLoadStates"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh2/v$a;

    invoke-direct {v0, p0, p1, p2}, Lh2/v$a;-><init>(Lh2/v;Lh2/s;Lh2/s;)V

    invoke-direct {p0, v0}, Lh2/v;->d(Lx7/l;)V

    return-void
.end method

.method public final g(Lh2/t;ZLh2/r;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh2/v$b;

    invoke-direct {v0, p2, p1, p3, p0}, Lh2/v$b;-><init>(ZLh2/t;Lh2/r;Lh2/v;)V

    invoke-direct {p0, v0}, Lh2/v;->d(Lx7/l;)V

    return-void
.end method
