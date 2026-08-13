.class final Laa/A$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa/A;->g(Laa/q;Laa/r;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:Laa/r;

.field final synthetic I:Laa/q;


# direct methods
.method constructor <init>(Laa/r;Laa/q;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Laa/A$a;->H:Laa/r;

    iput-object p2, p0, Laa/A$a;->I:Laa/q;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .prologue
    const/4 v0, 0x1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Laa/A$a;->G:I

    if-eqz v2, :cond_1

    if-ne v2, v0, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object v2, p0, Laa/A$a;->H:Laa/r;

    iget-object p1, p0, Laa/A$a;->I:Laa/q;

    invoke-virtual {p1}, Laa/q;->b()Ljava/lang/String;

    move-result-object v3

    iget-object p1, p0, Laa/A$a;->I:Laa/q;

    invoke-virtual {p1}, Laa/q;->a()J

    move-result-wide v4

    iget-object p1, p0, Laa/A$a;->I:Laa/q;

    invoke-virtual {p1}, Laa/q;->d()J

    move-result-wide v6

    iput v0, p0, Laa/A$a;->G:I

    move-object v8, p0

    invoke-interface/range {v2 .. v8}, Laa/r;->a(Ljava/lang/String;JJLm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    check-cast p1, [B

    invoke-static {p1}, LS8/r;->C([B)Ljava/lang/String;

    move-result-object v1

    new-array v2, v0, [C

    const/16 p1, 0x7c

    const/4 v0, 0x0

    aput-char p1, v2, v0

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LS8/r;->S0(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lj7/v;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string v1, "plurals"

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p1}, Laa/A;->b(Ljava/lang/String;)Laa/w;

    move-result-object p1

    goto :goto_1

    :cond_3
    const-string v1, "string-array"

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p1}, Laa/A;->a(Ljava/lang/String;)Laa/v;

    move-result-object p1

    goto :goto_1

    :cond_4
    invoke-static {p1}, Laa/A;->c(Ljava/lang/String;)Laa/x;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public final H(Lm7/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Laa/A$a;->y(Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Laa/A$a;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-virtual {p1, v0}, Laa/A$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm7/e;

    invoke-virtual {p0, p1}, Laa/A$a;->H(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final y(Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, Laa/A$a;

    iget-object v1, p0, Laa/A$a;->H:Laa/r;

    iget-object v2, p0, Laa/A$a;->I:Laa/q;

    invoke-direct {v0, v1, v2, p1}, Laa/A$a;-><init>(Laa/r;Laa/q;Lm7/e;)V

    return-object v0
.end method
