.class final LJ6/n$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ6/n;->b(LC6/c;Lx7/s;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:I

.field private synthetic I:Ljava/lang/Object;

.field final synthetic J:Lx7/s;


# direct methods
.method constructor <init>(Lx7/s;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LJ6/n$a;->J:Lx7/s;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LJ6/n$a;->H:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LJ6/n$a;->G:Ljava/lang/Object;

    check-cast v1, Lb7/a;

    iget-object v3, p0, LJ6/n$a;->I:Ljava/lang/Object;

    check-cast v3, La7/e;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LJ6/n$a;->I:Ljava/lang/Object;

    check-cast p1, La7/e;

    invoke-virtual {p1}, La7/e;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LQ6/d;

    invoke-virtual {v1}, LQ6/d;->a()Lb7/a;

    move-result-object v10

    invoke-virtual {v1}, LQ6/d;->b()Ljava/lang/Object;

    move-result-object v7

    instance-of v1, v7, Lio/ktor/utils/io/d;

    if-nez v1, :cond_3

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_3
    iget-object v4, p0, LJ6/n$a;->J:Lx7/s;

    new-instance v5, LJ6/m;

    invoke-direct {v5}, LJ6/m;-><init>()V

    invoke-virtual {p1}, La7/e;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LD6/b;

    invoke-virtual {v1}, LD6/b;->e()LQ6/c;

    move-result-object v6

    iput-object p1, p0, LJ6/n$a;->I:Ljava/lang/Object;

    iput-object v10, p0, LJ6/n$a;->G:Ljava/lang/Object;

    iput v3, p0, LJ6/n$a;->H:I

    move-object v8, v10

    move-object v9, p0

    invoke-interface/range {v4 .. v9}, Lx7/s;->v(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    return-object v0

    :cond_4
    move-object v3, p1

    move-object p1, v1

    move-object v1, v10

    :goto_0
    if-nez p1, :cond_5

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_5
    instance-of v4, p1, LU6/a;

    if-nez v4, :cond_7

    invoke-virtual {v1}, Lb7/a;->a()LF7/c;

    move-result-object v4

    invoke-interface {v4, p1}, LF7/c;->d(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_1

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "transformResponseBody returned "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " but expected value of type "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_1
    new-instance v4, LQ6/d;

    invoke-direct {v4, v1, p1}, LQ6/d;-><init>(Lb7/a;Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-object p1, p0, LJ6/n$a;->I:Ljava/lang/Object;

    iput-object p1, p0, LJ6/n$a;->G:Ljava/lang/Object;

    iput v2, p0, LJ6/n$a;->H:I

    invoke-virtual {v3, v4, p0}, La7/e;->e(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_8
    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(La7/e;LQ6/d;Lm7/e;)Ljava/lang/Object;
    .locals 1

    new-instance p2, LJ6/n$a;

    iget-object v0, p0, LJ6/n$a;->J:Lx7/s;

    invoke-direct {p2, v0, p3}, LJ6/n$a;-><init>(Lx7/s;Lm7/e;)V

    iput-object p1, p2, LJ6/n$a;->I:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {p2, p1}, LJ6/n$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, La7/e;

    check-cast p2, LQ6/d;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, LJ6/n$a;->H(La7/e;LQ6/d;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
