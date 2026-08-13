.class public final Lh2/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh2/y$a;,
        Lh2/y$b;,
        Lh2/y$c;
    }
.end annotation


# instance fields
.field private final a:Lx7/l;

.field private final b:Ljava/lang/Object;

.field private final c:Lh2/E;

.field private final d:Lh2/h;

.field private final e:Lh2/h;

.field private final f:LZ8/f;


# direct methods
.method public constructor <init>(Lx7/l;Ljava/lang/Object;Lh2/E;Lh2/O;)V
    .locals 1

    const-string v0, "pagingSourceFactory"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/y;->a:Lx7/l;

    iput-object p2, p0, Lh2/y;->b:Ljava/lang/Object;

    iput-object p3, p0, Lh2/y;->c:Lh2/E;

    new-instance p1, Lh2/h;

    const/4 p2, 0x0

    const/4 p3, 0x1

    invoke-direct {p1, p2, p3, p2}, Lh2/h;-><init>(Ljava/lang/Object;ILy7/k;)V

    iput-object p1, p0, Lh2/y;->d:Lh2/h;

    new-instance p1, Lh2/h;

    invoke-direct {p1, p2, p3, p2}, Lh2/h;-><init>(Ljava/lang/Object;ILy7/k;)V

    iput-object p1, p0, Lh2/y;->e:Lh2/h;

    new-instance p1, Lh2/y$d;

    invoke-direct {p1, p4, p0, p2}, Lh2/y$d;-><init>(Lh2/O;Lh2/y;Lm7/e;)V

    invoke-static {p1}, Lh2/S;->a(Lx7/p;)LZ8/f;

    move-result-object p1

    iput-object p1, p0, Lh2/y;->f:LZ8/f;

    return-void
.end method

.method public static final synthetic a(Lh2/y;Lh2/L;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lh2/y;->h(Lh2/L;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lh2/y;)Lh2/E;
    .locals 0

    iget-object p0, p0, Lh2/y;->c:Lh2/E;

    return-object p0
.end method

.method public static final synthetic c(Lh2/y;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lh2/y;->b:Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic d(Lh2/y;)Lh2/h;
    .locals 0

    iget-object p0, p0, Lh2/y;->d:Lh2/h;

    return-object p0
.end method

.method public static final synthetic e(Lh2/y;)Lh2/h;
    .locals 0

    iget-object p0, p0, Lh2/y;->e:Lh2/h;

    return-object p0
.end method

.method public static final synthetic f(Lh2/y;Lh2/z;LW8/z0;Lh2/P;)LZ8/f;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lh2/y;->j(Lh2/z;LW8/z0;Lh2/P;)LZ8/f;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lh2/y;)V
    .locals 0

    invoke-direct {p0}, Lh2/y;->k()V

    return-void
.end method

.method private final h(Lh2/L;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p2, Lh2/y$e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh2/y$e;

    iget v1, v0, Lh2/y$e;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh2/y$e;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh2/y$e;

    invoke-direct {v0, p0, p2}, Lh2/y$e;-><init>(Lh2/y;Lm7/e;)V

    :goto_0
    iget-object p2, v0, Lh2/y$e;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lh2/y$e;->J:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lh2/y$e;->G:Ljava/lang/Object;

    check-cast p1, Lh2/L;

    iget-object v0, v0, Lh2/y$e;->F:Ljava/lang/Object;

    check-cast v0, Lh2/y;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lh2/y;->a:Lx7/l;

    iput-object p0, v0, Lh2/y$e;->F:Ljava/lang/Object;

    iput-object p1, v0, Lh2/y$e;->G:Ljava/lang/Object;

    iput v3, v0, Lh2/y$e;->J:I

    invoke-interface {p2, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    check-cast p2, Lh2/L;

    if-eq p2, p1, :cond_7

    new-instance v1, Lh2/y$f;

    invoke-direct {v1, v0}, Lh2/y$f;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p2, v1}, Lh2/L;->g(Lx7/a;)V

    if-eqz p1, :cond_4

    new-instance v1, Lh2/y$g;

    invoke-direct {v1, v0}, Lh2/y$g;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Lh2/L;->h(Lx7/a;)V

    :cond_4
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lh2/L;->e()V

    :cond_5
    sget-object p1, Lh2/K;->a:Lh2/K;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lh2/K;->a(I)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Generated new PagingSource "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Lh2/K;->b(ILjava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    return-object p2

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final j(Lh2/z;LW8/z0;Lh2/P;)LZ8/f;
    .locals 3

    .prologue
    if-nez p3, :cond_0

    invoke-virtual {p1}, Lh2/z;->u()LZ8/f;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lh2/w;

    invoke-direct {v0}, Lh2/w;-><init>()V

    new-instance v1, Lh2/y$h;

    const/4 v2, 0x0

    invoke-direct {v1, p3, p1, v0, v2}, Lh2/y$h;-><init>(Lh2/P;Lh2/z;Lh2/w;Lm7/e;)V

    invoke-static {p2, v1}, Lh2/d;->a(LW8/z0;Lx7/p;)LZ8/f;

    move-result-object p1

    return-object p1
.end method

.method private final k()V
    .locals 2

    iget-object v0, p0, Lh2/y;->d:Lh2/h;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lh2/h;->b(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final i()LZ8/f;
    .locals 1

    iget-object v0, p0, Lh2/y;->f:LZ8/f;

    return-object v0
.end method

.method public final l()V
    .locals 2

    iget-object v0, p0, Lh2/y;->d:Lh2/h;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lh2/h;->b(Ljava/lang/Object;)V

    return-void
.end method
