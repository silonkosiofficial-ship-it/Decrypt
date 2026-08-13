.class final Lh2/H$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/H;->n(Lh2/F;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:Lh2/H;

.field final synthetic I:Lh2/F;


# direct methods
.method constructor <init>(Lh2/H;Lh2/F;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lh2/H$b;->H:Lh2/H;

    iput-object p2, p0, Lh2/H$b;->I:Lh2/F;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lh2/H$b;->G:I

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

    iget-object p1, p0, Lh2/H$b;->H:Lh2/H;

    iget-object v1, p0, Lh2/H$b;->I:Lh2/F;

    invoke-virtual {v1}, Lh2/F;->d()Lh2/X;

    move-result-object v1

    invoke-static {p1, v1}, Lh2/H;->l(Lh2/H;Lh2/X;)V

    iget-object p1, p0, Lh2/H$b;->I:Lh2/F;

    invoke-virtual {p1}, Lh2/F;->b()LZ8/f;

    move-result-object p1

    new-instance v1, Lh2/H$b$a;

    iget-object v3, p0, Lh2/H$b;->H:Lh2/H;

    iget-object v4, p0, Lh2/H$b;->I:Lh2/F;

    invoke-direct {v1, v3, v4}, Lh2/H$b$a;-><init>(Lh2/H;Lh2/F;)V

    iput v2, p0, Lh2/H$b;->G:I

    invoke-interface {p1, v1, p0}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(Lm7/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lh2/H$b;->y(Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lh2/H$b;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-virtual {p1, v0}, Lh2/H$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm7/e;

    invoke-virtual {p0, p1}, Lh2/H$b;->H(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final y(Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, Lh2/H$b;

    iget-object v1, p0, Lh2/H$b;->H:Lh2/H;

    iget-object v2, p0, Lh2/H$b;->I:Lh2/F;

    invoke-direct {v0, v1, v2, p1}, Lh2/H$b;-><init>(Lh2/H;Lh2/F;Lm7/e;)V

    return-object v0
.end method
