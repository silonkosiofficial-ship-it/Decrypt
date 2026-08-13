.class public abstract LI6/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lfa/d;

.field private static final b:LJ6/b;

.field private static final c:LW6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const-string v0, "io.ktor.client.plugins.HttpCallValidator"

    invoke-static {v0}, LZ6/a;->a(Ljava/lang/String;)Lfa/d;

    move-result-object v0

    sput-object v0, LI6/p;->a:Lfa/d;

    sget-object v0, LI6/p$a;->L:LI6/p$a;

    new-instance v1, LI6/o;

    invoke-direct {v1}, LI6/o;-><init>()V

    const-string v2, "HttpResponseValidator"

    invoke-static {v2, v0, v1}, LJ6/i;->b(Ljava/lang/String;Lx7/a;Lx7/l;)LJ6/b;

    move-result-object v0

    sput-object v0, LI6/p;->b:LJ6/b;

    const-class v0, Ljava/lang/Boolean;

    invoke-static {v0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v0

    :try_start_0
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Ly7/P;->p(Ljava/lang/Class;)LF7/o;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Lb7/a;

    invoke-direct {v2, v0, v1}, Lb7/a;-><init>(LF7/c;LF7/o;)V

    new-instance v0, LW6/a;

    const-string v1, "ExpectSuccessAttributeKey"

    invoke-direct {v0, v1, v2}, LW6/a;-><init>(Ljava/lang/String;Lb7/a;)V

    sput-object v0, LI6/p;->c:LW6/a;

    return-void
.end method

.method public static synthetic a(LJ6/d;)Li7/M;
    .locals 0

    invoke-static {p0}, LI6/p;->b(LJ6/d;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method private static final b(LJ6/d;)Li7/M;
    .locals 6

    const-string v0, "$this$createClientPlugin"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LJ6/d;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI6/n;

    invoke-virtual {v0}, LI6/n;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lj7/v;->E0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, LJ6/d;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LI6/n;

    invoke-virtual {v1}, LI6/n;->b()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lj7/v;->E0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, LJ6/d;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LI6/n;

    invoke-virtual {v2}, LI6/n;->a()Z

    move-result v2

    sget-object v3, LJ6/l;->a:LJ6/l;

    new-instance v4, LI6/p$b;

    const/4 v5, 0x0

    invoke-direct {v4, v2, v5}, LI6/p$b;-><init>(ZLm7/e;)V

    invoke-virtual {p0, v3, v4}, LJ6/d;->f(LJ6/a;Ljava/lang/Object;)V

    sget-object v2, LJ6/k;->a:LJ6/k;

    new-instance v3, LI6/p$c;

    invoke-direct {v3, v0, v5}, LI6/p$c;-><init>(Ljava/util/List;Lm7/e;)V

    invoke-virtual {p0, v2, v3}, LJ6/d;->f(LJ6/a;Ljava/lang/Object;)V

    sget-object v0, LI6/N;->a:LI6/N;

    new-instance v2, LI6/p$d;

    invoke-direct {v2, v1, v5}, LI6/p$d;-><init>(Ljava/util/List;Lm7/e;)V

    invoke-virtual {p0, v0, v2}, LJ6/d;->f(LJ6/a;Ljava/lang/Object;)V

    sget-object v0, LI6/K;->a:LI6/K;

    new-instance v2, LI6/p$e;

    invoke-direct {v2, v1, v5}, LI6/p$e;-><init>(Ljava/util/List;Lm7/e;)V

    invoke-virtual {p0, v0, v2}, LJ6/d;->f(LJ6/a;Ljava/lang/Object;)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private static final c(Ljava/util/List;Ljava/lang/Throwable;LO6/b;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p3, LI6/p$f;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LI6/p$f;

    iget v1, v0, LI6/p$f;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LI6/p$f;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, LI6/p$f;

    invoke-direct {v0, p3}, LI6/p$f;-><init>(Lm7/e;)V

    :goto_0
    iget-object p3, v0, LI6/p$f;->I:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v1, v0, LI6/p$f;->J:I

    if-eqz v1, :cond_3

    const/4 p0, 0x1

    if-eq v1, p0, :cond_1

    const/4 p0, 0x2

    if-ne v1, p0, :cond_2

    :cond_1
    iget-object p0, v0, LI6/p$f;->H:Ljava/lang/Object;

    check-cast p0, Ljava/util/Iterator;

    iget-object p1, v0, LI6/p$f;->G:Ljava/lang/Object;

    check-cast p1, LO6/b;

    iget-object p1, v0, LI6/p$f;->F:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    sget-object p3, LI6/p;->a:Lfa/d;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Processing exception "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for request "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, LO6/b;->r()LT6/g0;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lfa/d;->g(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-nez p1, :cond_4

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0

    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0
.end method

.method private static final d(Ljava/util/List;LQ6/c;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p2, LI6/p$g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LI6/p$g;

    iget v1, v0, LI6/p$g;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LI6/p$g;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, LI6/p$g;

    invoke-direct {v0, p2}, LI6/p$g;-><init>(Lm7/e;)V

    :goto_0
    iget-object p2, v0, LI6/p$g;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI6/p$g;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LI6/p$g;->G:Ljava/lang/Object;

    check-cast p0, Ljava/util/Iterator;

    iget-object p1, v0, LI6/p$g;->F:Ljava/lang/Object;

    check-cast p1, LQ6/c;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    sget-object p2, LI6/p;->a:Lfa/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Validating response for request "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LQ6/c;->H0()LD6/b;

    move-result-object v4

    invoke-virtual {v4}, LD6/b;->d()LO6/b;

    move-result-object v4

    invoke-interface {v4}, LO6/b;->r()LT6/g0;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v2}, Lfa/d;->g(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lx7/p;

    iput-object p1, v0, LI6/p$g;->F:Ljava/lang/Object;

    iput-object p0, v0, LI6/p$g;->G:Ljava/lang/Object;

    iput v3, v0, LI6/p$g;->I:I

    invoke-interface {p2, p1, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_4
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private static final e(LO6/d;)LO6/b;
    .locals 1

    new-instance v0, LI6/p$h;

    invoke-direct {v0, p0}, LI6/p$h;-><init>(LO6/d;)V

    return-object v0
.end method

.method public static final f(LC6/j;Lx7/l;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LI6/p;->b:LJ6/b;

    invoke-virtual {p0, v0, p1}, LC6/j;->o(LI6/r;Lx7/l;)V

    return-void
.end method

.method public static final synthetic g(Ljava/util/List;Ljava/lang/Throwable;LO6/b;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LI6/p;->c(Ljava/util/List;Ljava/lang/Throwable;LO6/b;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Ljava/util/List;LQ6/c;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LI6/p;->d(Ljava/util/List;LQ6/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(LO6/d;)LO6/b;
    .locals 0

    invoke-static {p0}, LI6/p;->e(LO6/d;)LO6/b;

    move-result-object p0

    return-object p0
.end method

.method public static final j()LW6/a;
    .locals 1

    sget-object v0, LI6/p;->c:LW6/a;

    return-object v0
.end method

.method public static final k()LJ6/b;
    .locals 1

    sget-object v0, LI6/p;->b:LJ6/b;

    return-object v0
.end method
