.class public final Le7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/ktor/utils/io/d;


# instance fields
.field private final b:Lo9/h;

.field private final c:Lm7/i;

.field private d:Lio/ktor/utils/io/n;

.field private final e:Lo9/a;

.field private final f:LW8/y;

.field private final g:Lm7/i;


# direct methods
.method public constructor <init>(Lo9/h;Lm7/i;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parent"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/b;->b:Lo9/h;

    iput-object p2, p0, Le7/b;->c:Lm7/i;

    new-instance p1, Lo9/a;

    invoke-direct {p1}, Lo9/a;-><init>()V

    iput-object p1, p0, Le7/b;->e:Lo9/a;

    sget-object p1, LW8/z0;->h:LW8/z0$b;

    invoke-interface {p2, p1}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p1

    check-cast p1, LW8/z0;

    invoke-static {p1}, LW8/C0;->a(LW8/z0;)LW8/y;

    move-result-object p1

    iput-object p1, p0, Le7/b;->f:LW8/y;

    invoke-interface {p2, p1}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p1

    new-instance p2, LW8/M;

    const-string v0, "RawSourceChannel"

    invoke-direct {p2, v0}, LW8/M;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p1

    iput-object p1, p0, Le7/b;->g:Lm7/i;

    return-void
.end method

.method public static final synthetic b(Le7/b;)Lo9/a;
    .locals 0

    iget-object p0, p0, Le7/b;->e:Lo9/a;

    return-object p0
.end method

.method public static final synthetic c(Le7/b;)Lo9/h;
    .locals 0

    iget-object p0, p0, Le7/b;->b:Lo9/h;

    return-object p0
.end method

.method public static final synthetic e(Le7/b;Lio/ktor/utils/io/n;)V
    .locals 0

    iput-object p1, p0, Le7/b;->d:Lio/ktor/utils/io/n;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Throwable;
    .locals 1

    .prologue
    iget-object v0, p0, Le7/b;->d:Lio/ktor/utils/io/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/ktor/utils/io/n;->a()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public d()Lo9/q;
    .locals 1

    iget-object v0, p0, Le7/b;->e:Lo9/a;

    return-object v0
.end method

.method public f(ILm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p2, Le7/b$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Le7/b$a;

    iget v1, v0, Le7/b$a;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le7/b$a;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Le7/b$a;

    invoke-direct {v0, p0, p2}, Le7/b$a;-><init>(Le7/b;Lm7/e;)V

    :goto_0
    iget-object p2, v0, Le7/b$a;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Le7/b$a;->J:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Le7/b$a;->G:I

    iget-object v0, v0, Le7/b$a;->F:Ljava/lang/Object;

    check-cast v0, Le7/b;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Le7/b;->d:Lio/ktor/utils/io/n;

    if-eqz p2, :cond_3

    invoke-static {v3}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object p2, p0, Le7/b;->g:Lm7/i;

    new-instance v2, Le7/b$b;

    const/4 v4, 0x0

    invoke-direct {v2, p0, p1, v4}, Le7/b$b;-><init>(Le7/b;ILm7/e;)V

    iput-object p0, v0, Le7/b$a;->F:Ljava/lang/Object;

    iput p1, v0, Le7/b$a;->G:I

    iput v3, v0, Le7/b$a;->J:I

    invoke-static {p2, v2, v0}, LW8/g;->g(Lm7/i;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v0, p0

    :goto_1
    iget-object p2, v0, Le7/b;->e:Lo9/a;

    invoke-static {p2}, Ld7/d;->d(Lo9/q;)J

    move-result-wide v0

    int-to-long p1, p1

    cmp-long p1, v0, p1

    if-ltz p1, :cond_5

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    :goto_2
    invoke-static {v3}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final g()LW8/y;
    .locals 1

    iget-object v0, p0, Le7/b;->f:LW8/y;

    return-object v0
.end method

.method public h()Z
    .locals 1

    .prologue
    iget-object v0, p0, Le7/b;->d:Lio/ktor/utils/io/n;

    if-eqz v0, :cond_0

    iget-object v0, p0, Le7/b;->e:Lo9/a;

    invoke-virtual {v0}, Lo9/a;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k(Ljava/lang/Throwable;)V
    .locals 4

    .prologue
    iget-object v0, p0, Le7/b;->d:Lio/ktor/utils/io/n;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Le7/b;->f:LW8/y;

    const-string v1, "Channel was cancelled"

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    :cond_1
    move-object v2, v1

    :cond_2
    invoke-static {v0, v2, p1}, LW8/C0;->c(LW8/z0;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Le7/b;->b:Lo9/h;

    invoke-interface {v0}, Lo9/h;->close()V

    new-instance v0, Lio/ktor/utils/io/n;

    new-instance v2, Ljava/io/IOException;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    move-object v1, v3

    :cond_4
    :goto_0
    invoke-direct {v2, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v0, v2}, Lio/ktor/utils/io/n;-><init>(Ljava/lang/Throwable;)V

    iput-object v0, p0, Le7/b;->d:Lio/ktor/utils/io/n;

    return-void
.end method
