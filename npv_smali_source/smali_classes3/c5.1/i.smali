.class public Lc5/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV4/a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LI4/a;

.field private final c:LY4/m;

.field private final d:Ljava/util/concurrent/Executor;

.field private final e:Ljava/util/concurrent/Executor;

.field private final f:LY4/n;


# direct methods
.method public constructor <init>(LQ4/f;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V
    .locals 8

    invoke-virtual {p1}, LQ4/f;->n()LQ4/o;

    move-result-object v0

    invoke-virtual {v0}, LQ4/o;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LQ4/f;->k()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LI4/b;->a(Landroid/content/Context;)LI4/a;

    move-result-object v3

    new-instance v4, LY4/m;

    invoke-direct {v4, p1}, LY4/m;-><init>(LQ4/f;)V

    new-instance v7, LY4/n;

    invoke-direct {v7}, LY4/n;-><init>()V

    move-object v1, p0

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v7}, Lc5/i;-><init>(Ljava/lang/String;LI4/a;LY4/m;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;LY4/n;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;LI4/a;LY4/m;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;LY4/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/i;->a:Ljava/lang/String;

    iput-object p2, p0, Lc5/i;->b:LI4/a;

    iput-object p3, p0, Lc5/i;->c:LY4/m;

    iput-object p4, p0, Lc5/i;->d:Ljava/util/concurrent/Executor;

    iput-object p5, p0, Lc5/i;->e:Ljava/util/concurrent/Executor;

    iput-object p6, p0, Lc5/i;->f:LY4/n;

    return-void
.end method

.method public static synthetic b(Lc5/i;Lc5/c;)Ll4/l;
    .locals 0

    invoke-direct {p0, p1}, Lc5/i;->i(Lc5/c;)Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LY4/a;)Ll4/l;
    .locals 0

    invoke-static {p0}, Lc5/i;->l(LY4/a;)Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lc5/i;Lc5/a;)LY4/a;
    .locals 0

    invoke-direct {p0, p1}, Lc5/i;->j(Lc5/a;)LY4/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lc5/i;LI4/e;)Ll4/l;
    .locals 0

    invoke-direct {p0, p1}, Lc5/i;->k(LI4/e;)Ll4/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lc5/i;Lc5/b;)Lc5/c;
    .locals 0

    invoke-direct {p0, p1}, Lc5/i;->h(Lc5/b;)Lc5/c;

    move-result-object p0

    return-object p0
.end method

.method private g()Ll4/l;
    .locals 3

    new-instance v0, Lc5/b;

    invoke-direct {v0}, Lc5/b;-><init>()V

    iget-object v1, p0, Lc5/i;->e:Ljava/util/concurrent/Executor;

    new-instance v2, Lc5/g;

    invoke-direct {v2, p0, v0}, Lc5/g;-><init>(Lc5/i;Lc5/b;)V

    invoke-static {v1, v2}, Ll4/o;->c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Ll4/l;

    move-result-object v0

    iget-object v1, p0, Lc5/i;->d:Ljava/util/concurrent/Executor;

    new-instance v2, Lc5/h;

    invoke-direct {v2, p0}, Lc5/h;-><init>(Lc5/i;)V

    invoke-virtual {v0, v1, v2}, Ll4/l;->p(Ljava/util/concurrent/Executor;Ll4/k;)Ll4/l;

    move-result-object v0

    return-object v0
.end method

.method private synthetic h(Lc5/b;)Lc5/c;
    .locals 2

    iget-object v0, p0, Lc5/i;->c:LY4/m;

    invoke-virtual {p1}, Lc5/b;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "UTF-8"

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    iget-object v1, p0, Lc5/i;->f:LY4/n;

    invoke-virtual {v0, p1, v1}, LY4/m;->c([BLY4/n;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc5/c;->a(Ljava/lang/String;)Lc5/c;

    move-result-object p1

    return-object p1
.end method

.method private synthetic i(Lc5/c;)Ll4/l;
    .locals 4

    iget-object v0, p0, Lc5/i;->b:LI4/a;

    invoke-static {}, LI4/d;->b()LI4/d$a;

    move-result-object v1

    iget-object v2, p0, Lc5/i;->a:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LI4/d$a;->b(J)LI4/d$a;

    move-result-object v1

    invoke-virtual {p1}, Lc5/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, LI4/d$a;->c(Ljava/lang/String;)LI4/d$a;

    move-result-object p1

    invoke-virtual {p1}, LI4/d$a;->a()LI4/d;

    move-result-object p1

    invoke-interface {v0, p1}, LI4/a;->a(LI4/d;)Ll4/l;

    move-result-object p1

    return-object p1
.end method

.method private synthetic j(Lc5/a;)LY4/a;
    .locals 3

    iget-object v0, p0, Lc5/i;->c:LY4/m;

    invoke-virtual {p1}, Lc5/a;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "UTF-8"

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    const/4 v1, 0x3

    iget-object v2, p0, Lc5/i;->f:LY4/n;

    invoke-virtual {v0, p1, v1, v2}, LY4/m;->b([BILY4/n;)LY4/a;

    move-result-object p1

    return-object p1
.end method

.method private synthetic k(LI4/e;)Ll4/l;
    .locals 2

    new-instance v0, Lc5/a;

    invoke-virtual {p1}, LI4/e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lc5/a;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lc5/i;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Lc5/f;

    invoke-direct {v1, p0, v0}, Lc5/f;-><init>(Lc5/i;Lc5/a;)V

    invoke-static {p1, v1}, Ll4/o;->c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Ll4/l;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic l(LY4/a;)Ll4/l;
    .locals 0

    invoke-static {p0}, LY4/b;->c(LY4/a;)LY4/b;

    move-result-object p0

    invoke-static {p0}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ll4/l;
    .locals 3

    invoke-direct {p0}, Lc5/i;->g()Ll4/l;

    move-result-object v0

    iget-object v1, p0, Lc5/i;->d:Ljava/util/concurrent/Executor;

    new-instance v2, Lc5/d;

    invoke-direct {v2, p0}, Lc5/d;-><init>(Lc5/i;)V

    invoke-virtual {v0, v1, v2}, Ll4/l;->p(Ljava/util/concurrent/Executor;Ll4/k;)Ll4/l;

    move-result-object v0

    iget-object v1, p0, Lc5/i;->d:Ljava/util/concurrent/Executor;

    new-instance v2, Lc5/e;

    invoke-direct {v2}, Lc5/e;-><init>()V

    invoke-virtual {v0, v1, v2}, Ll4/l;->p(Ljava/util/concurrent/Executor;Ll4/k;)Ll4/l;

    move-result-object v0

    return-object v0
.end method
