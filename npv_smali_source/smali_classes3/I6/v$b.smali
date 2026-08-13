.class final LI6/v$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI6/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:Ljava/lang/Object;

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:Ljava/lang/String;

.field final synthetic K:Ljava/nio/charset/Charset;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/nio/charset/Charset;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LI6/v$b;->J:Ljava/lang/String;

    iput-object p2, p0, LI6/v$b;->K:Ljava/nio/charset/Charset;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, LI6/v$b;->G:I

    if-nez v0, :cond_2

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI6/v$b;->H:Ljava/lang/Object;

    check-cast p1, LO6/d;

    iget-object v0, p0, LI6/v$b;->I:Ljava/lang/Object;

    iget-object v1, p0, LI6/v$b;->J:Ljava/lang/String;

    invoke-static {v1, p1}, LI6/v;->f(Ljava/lang/String;LO6/d;)V

    instance-of v1, v0, Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    invoke-static {p1}, LT6/z;->d(LT6/y;)LT6/h;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LT6/h;->e()Ljava/lang/String;

    move-result-object v3

    sget-object v4, LT6/h$d;->a:LT6/h$d;

    invoke-virtual {v4}, LT6/h$d;->b()LT6/h;

    move-result-object v4

    invoke-virtual {v4}, LT6/h;->e()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    return-object v2

    :cond_1
    iget-object v2, p0, LI6/v$b;->K:Ljava/nio/charset/Charset;

    check-cast v0, Ljava/lang/String;

    invoke-static {v2, p1, v0, v1}, LI6/v;->h(Ljava/nio/charset/Charset;LO6/d;Ljava/lang/String;LT6/h;)LU6/b;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(LO6/d;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, LI6/v$b;

    iget-object v1, p0, LI6/v$b;->J:Ljava/lang/String;

    iget-object v2, p0, LI6/v$b;->K:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2, p3}, LI6/v$b;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;Lm7/e;)V

    iput-object p1, v0, LI6/v$b;->H:Ljava/lang/Object;

    iput-object p2, v0, LI6/v$b;->I:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, LI6/v$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO6/d;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, LI6/v$b;->H(LO6/d;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
