.class final LI6/j$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI6/j;->b(LC6/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field synthetic I:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lm7/e;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI6/j$b;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI6/j$b;->H:Ljava/lang/Object;

    check-cast p1, La7/e;

    iget-object v1, p0, LI6/j$b;->I:Ljava/lang/Object;

    check-cast v1, LQ6/d;

    invoke-virtual {v1}, LQ6/d;->a()Lb7/a;

    move-result-object v3

    invoke-virtual {v1}, LQ6/d;->b()Ljava/lang/Object;

    move-result-object v1

    instance-of v4, v1, Lio/ktor/utils/io/d;

    if-nez v4, :cond_2

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_2
    invoke-virtual {v3}, Lb7/a;->a()LF7/c;

    move-result-object v4

    const-class v5, Ljava/io/InputStream;

    invoke-static {v5}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v5

    invoke-static {v4, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    check-cast v1, Lio/ktor/utils/io/d;

    invoke-virtual {p1}, La7/e;->b()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LD6/b;

    invoke-virtual {v4}, LD6/b;->getCoroutineContext()Lm7/i;

    move-result-object v4

    sget-object v5, LW8/z0;->h:LW8/z0$b;

    invoke-interface {v4, v5}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v4

    check-cast v4, LW8/z0;

    invoke-static {v1, v4}, Le7/a;->a(Lio/ktor/utils/io/d;LW8/z0;)Ljava/io/InputStream;

    move-result-object v1

    new-instance v4, LI6/j$b$a;

    invoke-direct {v4, v1}, LI6/j$b$a;-><init>(Ljava/io/InputStream;)V

    new-instance v1, LQ6/d;

    invoke-direct {v1, v3, v4}, LQ6/d;-><init>(Lb7/a;Ljava/lang/Object;)V

    const/4 v3, 0x0

    iput-object v3, p0, LI6/j$b;->H:Ljava/lang/Object;

    iput v2, p0, LI6/j$b;->G:I

    invoke-virtual {p1, v1, p0}, La7/e;->e(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(La7/e;LQ6/d;Lm7/e;)Ljava/lang/Object;
    .locals 1

    new-instance v0, LI6/j$b;

    invoke-direct {v0, p3}, LI6/j$b;-><init>(Lm7/e;)V

    iput-object p1, v0, LI6/j$b;->H:Ljava/lang/Object;

    iput-object p2, v0, LI6/j$b;->I:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, LI6/j$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, La7/e;

    check-cast p2, LQ6/d;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, LI6/j$b;->H(La7/e;LQ6/d;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
