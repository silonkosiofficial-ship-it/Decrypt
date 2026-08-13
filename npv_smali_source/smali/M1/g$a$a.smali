.class final LM1/g$a$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM1/g$a;->b(Ljava/util/List;)Lx7/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Ljava/util/List;


# direct methods
.method constructor <init>(Ljava/util/List;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LM1/g$a$a;->I:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LM1/g$a$a;->G:I

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

    iget-object p1, p0, LM1/g$a$a;->H:Ljava/lang/Object;

    check-cast p1, LM1/m;

    sget-object v1, LM1/g;->a:LM1/g$a;

    iget-object v3, p0, LM1/g$a$a;->I:Ljava/util/List;

    iput v2, p0, LM1/g$a$a;->G:I

    invoke-static {v1, v3, p1, p0}, LM1/g$a;->a(LM1/g$a;Ljava/util/List;LM1/m;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LM1/m;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LM1/g$a$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LM1/g$a$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LM1/g$a$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LM1/m;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LM1/g$a$a;->H(LM1/m;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, LM1/g$a$a;

    iget-object v1, p0, LM1/g$a$a;->I:Ljava/util/List;

    invoke-direct {v0, v1, p2}, LM1/g$a$a;-><init>(Ljava/util/List;Lm7/e;)V

    iput-object p1, v0, LM1/g$a$a;->H:Ljava/lang/Object;

    return-object v0
.end method
