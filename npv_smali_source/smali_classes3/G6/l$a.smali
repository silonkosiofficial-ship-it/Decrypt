.class final LG6/l$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG6/l;->h(LU6/b;Lm7/i;)LH9/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:LU6/b;


# direct methods
.method constructor <init>(LU6/b;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LG6/l$a;->I:LU6/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LG6/l$a;->G:I

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

    iget-object p1, p0, LG6/l$a;->H:Ljava/lang/Object;

    check-cast p1, Lio/ktor/utils/io/t;

    iget-object v1, p0, LG6/l$a;->I:LU6/b;

    check-cast v1, LU6/b$d;

    invoke-virtual {p1}, Lio/ktor/utils/io/t;->a()Lio/ktor/utils/io/g;

    move-result-object p1

    iput v2, p0, LG6/l$a;->G:I

    invoke-virtual {v1, p1, p0}, LU6/b$d;->d(Lio/ktor/utils/io/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(Lio/ktor/utils/io/t;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LG6/l$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LG6/l$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LG6/l$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/ktor/utils/io/t;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LG6/l$a;->H(Lio/ktor/utils/io/t;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, LG6/l$a;

    iget-object v1, p0, LG6/l$a;->I:LU6/b;

    invoke-direct {v0, v1, p2}, LG6/l$a;-><init>(LU6/b;Lm7/e;)V

    iput-object p1, v0, LG6/l$a;->H:Ljava/lang/Object;

    return-object v0
.end method
