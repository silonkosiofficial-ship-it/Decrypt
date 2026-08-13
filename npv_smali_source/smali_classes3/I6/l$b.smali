.class final LI6/l$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI6/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:Z


# direct methods
.method constructor <init>(ZLm7/e;)V
    .locals 0

    iput-boolean p1, p0, LI6/l$b;->J:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method

.method public static synthetic H(LK6/a;)Lio/ktor/utils/io/d;
    .locals 0

    invoke-static {p0}, LI6/l$b;->K(LK6/a;)Lio/ktor/utils/io/d;

    move-result-object p0

    return-object p0
.end method

.method private static final K(LK6/a;)Lio/ktor/utils/io/d;
    .locals 0

    invoke-virtual {p0}, LK6/a;->b()Lio/ktor/utils/io/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI6/l$b;->G:I

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

    iget-object p1, p0, LI6/l$b;->H:Ljava/lang/Object;

    check-cast p1, La7/e;

    iget-object v1, p0, LI6/l$b;->I:Ljava/lang/Object;

    check-cast v1, LQ6/c;

    iget-boolean v3, p0, LI6/l$b;->J:Z

    if-eqz v3, :cond_2

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_2
    invoke-virtual {v1}, LQ6/c;->H0()LD6/b;

    move-result-object v3

    invoke-virtual {v3}, LD6/b;->x0()LW6/b;

    move-result-object v3

    invoke-static {}, LI6/l;->d()LW6/a;

    move-result-object v4

    invoke-interface {v3, v4}, LW6/b;->e(LW6/a;)Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_3
    new-instance v3, LK6/a;

    invoke-virtual {v1}, LQ6/c;->b()Lio/ktor/utils/io/d;

    move-result-object v4

    invoke-direct {v3, v4}, LK6/a;-><init>(Lio/ktor/utils/io/d;)V

    invoke-virtual {v1}, LQ6/c;->H0()LD6/b;

    move-result-object v1

    new-instance v4, LI6/m;

    invoke-direct {v4, v3}, LI6/m;-><init>(LK6/a;)V

    invoke-static {v1, v4}, LL6/b;->a(LD6/b;Lx7/a;)LD6/b;

    move-result-object v1

    invoke-virtual {v1}, LD6/b;->x0()LW6/b;

    move-result-object v3

    invoke-static {}, LI6/l;->c()LW6/a;

    move-result-object v4

    sget-object v5, Li7/M;->a:Li7/M;

    invoke-interface {v3, v4, v5}, LW6/b;->f(LW6/a;Ljava/lang/Object;)V

    invoke-virtual {v1}, LD6/b;->e()LQ6/c;

    move-result-object v1

    const/4 v3, 0x0

    iput-object v3, p0, LI6/l$b;->H:Ljava/lang/Object;

    iput v2, p0, LI6/l$b;->G:I

    invoke-virtual {p1, v1, p0}, La7/e;->e(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final I(La7/e;LQ6/c;Lm7/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LI6/l$b;

    iget-boolean v1, p0, LI6/l$b;->J:Z

    invoke-direct {v0, v1, p3}, LI6/l$b;-><init>(ZLm7/e;)V

    iput-object p1, v0, LI6/l$b;->H:Ljava/lang/Object;

    iput-object p2, v0, LI6/l$b;->I:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, LI6/l$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, La7/e;

    check-cast p2, LQ6/c;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, LI6/l$b;->I(La7/e;LQ6/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
