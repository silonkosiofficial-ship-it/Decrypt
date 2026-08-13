.class final Lh2/c$c;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/c;->b(LZ8/f;LW8/N;Lh2/a;)LZ8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:Ljava/lang/Object;

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
    .locals 3

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lh2/c$c;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lh2/c$c;->H:Ljava/lang/Object;

    check-cast v0, Lh2/u;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lh2/c$c;->H:Ljava/lang/Object;

    check-cast p1, Lh2/u;

    iget-object v1, p0, Lh2/c$c;->I:Ljava/lang/Object;

    check-cast v1, Lh2/u;

    iput-object v1, p0, Lh2/c$c;->H:Ljava/lang/Object;

    iput v2, p0, Lh2/c$c;->G:I

    invoke-virtual {p1, p0}, Lh2/u;->c(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public final H(Lh2/u;Lh2/u;Lm7/e;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lh2/c$c;

    invoke-direct {v0, p3}, Lh2/c$c;-><init>(Lm7/e;)V

    iput-object p1, v0, Lh2/c$c;->H:Ljava/lang/Object;

    iput-object p2, v0, Lh2/c$c;->I:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, Lh2/c$c;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh2/u;

    check-cast p2, Lh2/u;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, Lh2/c$c;->H(Lh2/u;Lh2/u;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
