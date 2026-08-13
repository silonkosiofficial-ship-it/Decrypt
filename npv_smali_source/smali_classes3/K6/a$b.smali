.class final LK6/a$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK6/a;->b()Lio/ktor/utils/io/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Ly7/O;


# direct methods
.method constructor <init>(Ly7/O;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LK6/a$b;->I:Ly7/O;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LK6/a$b;->G:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LK6/a$b;->H:Ljava/lang/Object;

    check-cast v1, Lio/ktor/utils/io/t;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LK6/a$b;->H:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lio/ktor/utils/io/t;

    iget-object p1, p0, LK6/a$b;->I:Ly7/O;

    iget-object p1, p1, Ly7/O;->C:Ljava/lang/Object;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast p1, LK6/a$a;

    iput-object v1, p0, LK6/a$b;->H:Ljava/lang/Object;

    iput v3, p0, LK6/a$b;->G:I

    invoke-virtual {p1, p0}, LK6/a$a;->a(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    move-object v4, p1

    check-cast v4, [B

    invoke-virtual {v1}, Lio/ktor/utils/io/t;->a()Lio/ktor/utils/io/g;

    move-result-object v3

    const/4 p1, 0x0

    iput-object p1, p0, LK6/a$b;->H:Ljava/lang/Object;

    iput v2, p0, LK6/a$b;->G:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    move-object v7, p0

    invoke-static/range {v3 .. v9}, Lio/ktor/utils/io/k;->i(Lio/ktor/utils/io/g;[BIILm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(Lio/ktor/utils/io/t;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LK6/a$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LK6/a$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LK6/a$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/ktor/utils/io/t;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LK6/a$b;->H(Lio/ktor/utils/io/t;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, LK6/a$b;

    iget-object v1, p0, LK6/a$b;->I:Ly7/O;

    invoke-direct {v0, v1, p2}, LK6/a$b;-><init>(Ly7/O;Lm7/e;)V

    iput-object p1, v0, LK6/a$b;->H:Ljava/lang/Object;

    return-object v0
.end method
