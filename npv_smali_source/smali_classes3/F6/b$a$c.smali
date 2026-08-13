.class final LF6/b$a$c;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF6/b$a;->h(LF6/b;LC6/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:LC6/c;

.field final synthetic K:LF6/b;


# direct methods
.method constructor <init>(LC6/c;LF6/b;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LF6/b$a$c;->J:LC6/c;

    iput-object p2, p0, LF6/b$a$c;->K:LF6/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method

.method public static synthetic H(LC6/c;LQ6/c;Ljava/lang/Throwable;)Li7/M;
    .locals 0

    invoke-static {p0, p1, p2}, LF6/b$a$c;->K(LC6/c;LQ6/c;Ljava/lang/Throwable;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method private static final K(LC6/c;LQ6/c;Ljava/lang/Throwable;)Li7/M;
    .locals 0

    .prologue
    if-eqz p2, :cond_0

    invoke-virtual {p0}, LC6/c;->s()LS6/b;

    move-result-object p0

    invoke-static {}, LR6/a;->c()LS6/a;

    move-result-object p2

    invoke-virtual {p0, p2, p1}, LS6/b;->a(LS6/a;Ljava/lang/Object;)V

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LF6/b$a$c;->G:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LF6/b$a$c;->I:Ljava/lang/Object;

    check-cast v1, LO6/e;

    iget-object v3, p0, LF6/b$a$c;->H:Ljava/lang/Object;

    check-cast v3, La7/e;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LF6/b$a$c;->H:Ljava/lang/Object;

    check-cast p1, La7/e;

    iget-object v1, p0, LF6/b$a$c;->I:Ljava/lang/Object;

    new-instance v5, LO6/d;

    invoke-direct {v5}, LO6/d;-><init>()V

    invoke-virtual {p1}, La7/e;->b()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LO6/d;

    invoke-virtual {v5, v6}, LO6/d;->r(LO6/d;)LO6/d;

    const-class v6, Ljava/lang/Object;

    if-nez v1, :cond_3

    sget-object v1, LU6/a;->a:LU6/a;

    invoke-virtual {v5, v1}, LO6/d;->k(Ljava/lang/Object;)V

    invoke-static {v6}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    :try_start_0
    invoke-static {v6}, Ly7/P;->p(Ljava/lang/Class;)LF7/o;

    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-object v6, v4

    :goto_0
    new-instance v7, Lb7/a;

    invoke-direct {v7, v1, v6}, Lb7/a;-><init>(LF7/c;LF7/o;)V

    :goto_1
    invoke-virtual {v5, v7}, LO6/d;->l(Lb7/a;)V

    goto :goto_3

    :cond_3
    instance-of v7, v1, LU6/b;

    invoke-virtual {v5, v1}, LO6/d;->k(Ljava/lang/Object;)V

    if-eqz v7, :cond_4

    invoke-virtual {v5, v4}, LO6/d;->l(Lb7/a;)V

    goto :goto_3

    :cond_4
    invoke-static {v6}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    :try_start_1
    invoke-static {v6}, Ly7/P;->p(Ljava/lang/Class;)LF7/o;

    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-object v6, v4

    :goto_2
    new-instance v7, Lb7/a;

    invoke-direct {v7, v1, v6}, Lb7/a;-><init>(LF7/c;LF7/o;)V

    goto :goto_1

    :goto_3
    iget-object v1, p0, LF6/b$a$c;->J:LC6/c;

    invoke-virtual {v1}, LC6/c;->s()LS6/b;

    move-result-object v1

    invoke-static {}, LR6/a;->b()LS6/a;

    move-result-object v6

    invoke-virtual {v1, v6, v5}, LS6/b;->a(LS6/a;Ljava/lang/Object;)V

    invoke-virtual {v5}, LO6/d;->c()LO6/e;

    move-result-object v1

    iget-object v5, p0, LF6/b$a$c;->J:LC6/c;

    invoke-virtual {v1}, LO6/e;->a()LW6/b;

    move-result-object v6

    invoke-static {}, LF6/l;->c()LW6/a;

    move-result-object v7

    invoke-virtual {v5}, LC6/c;->o()LC6/j;

    move-result-object v5

    invoke-interface {v6, v7, v5}, LW6/b;->f(LW6/a;Ljava/lang/Object;)V

    invoke-static {v1}, LF6/l;->a(LO6/e;)V

    iget-object v5, p0, LF6/b$a$c;->K:LF6/b;

    invoke-static {v5, v1}, LF6/b$a;->a(LF6/b;LO6/e;)V

    iget-object v5, p0, LF6/b$a$c;->K:LF6/b;

    iput-object p1, p0, LF6/b$a$c;->H:Ljava/lang/Object;

    iput-object v1, p0, LF6/b$a$c;->I:Ljava/lang/Object;

    iput v3, p0, LF6/b$a$c;->G:I

    invoke-static {v5, v1, p0}, LF6/b$a;->b(LF6/b;LO6/e;Lm7/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_5

    return-object v0

    :cond_5
    move-object v8, v3

    move-object v3, p1

    move-object p1, v8

    :goto_4
    check-cast p1, LO6/h;

    new-instance v5, LD6/b;

    iget-object v6, p0, LF6/b$a$c;->J:LC6/c;

    invoke-direct {v5, v6, v1, p1}, LD6/b;-><init>(LC6/c;LO6/e;LO6/h;)V

    invoke-virtual {v5}, LD6/b;->e()LQ6/c;

    move-result-object p1

    iget-object v1, p0, LF6/b$a$c;->J:LC6/c;

    invoke-virtual {v1}, LC6/c;->s()LS6/b;

    move-result-object v1

    invoke-static {}, LR6/a;->e()LS6/a;

    move-result-object v6

    invoke-virtual {v1, v6, p1}, LS6/b;->a(LS6/a;Ljava/lang/Object;)V

    invoke-interface {p1}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object v1

    invoke-static {v1}, LW8/C0;->m(Lm7/i;)LW8/z0;

    move-result-object v1

    iget-object v6, p0, LF6/b$a$c;->J:LC6/c;

    new-instance v7, LF6/c;

    invoke-direct {v7, v6, p1}, LF6/c;-><init>(LC6/c;LQ6/c;)V

    invoke-interface {v1, v7}, LW8/z0;->e1(Lx7/l;)LW8/f0;

    iput-object v4, p0, LF6/b$a$c;->H:Ljava/lang/Object;

    iput-object v4, p0, LF6/b$a$c;->I:Ljava/lang/Object;

    iput v2, p0, LF6/b$a$c;->G:I

    invoke-virtual {v3, v5, p0}, La7/e;->e(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    :goto_5
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final I(La7/e;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, LF6/b$a$c;

    iget-object v1, p0, LF6/b$a$c;->J:LC6/c;

    iget-object v2, p0, LF6/b$a$c;->K:LF6/b;

    invoke-direct {v0, v1, v2, p3}, LF6/b$a$c;-><init>(LC6/c;LF6/b;Lm7/e;)V

    iput-object p1, v0, LF6/b$a$c;->H:Ljava/lang/Object;

    iput-object p2, v0, LF6/b$a$c;->I:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, LF6/b$a$c;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, La7/e;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, LF6/b$a$c;->I(La7/e;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
