.class final Lu2/b$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu2/b;->e(Lo2/u;Lo2/n;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Ljava/lang/String;

.field final synthetic J:Lo2/u;


# direct methods
.method constructor <init>(Ljava/lang/String;Lo2/u;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lu2/b$b;->I:Ljava/lang/String;

    iput-object p2, p0, Lu2/b$b;->J:Lo2/u;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lu2/b$b;->G:I

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

    iget-object p1, p0, Lu2/b$b;->H:Ljava/lang/Object;

    check-cast p1, Lo2/B;

    iget-object v1, p0, Lu2/b$b;->I:Ljava/lang/String;

    new-instance v3, Lu2/b$b$a;

    iget-object v4, p0, Lu2/b$b;->J:Lo2/u;

    invoke-direct {v3, v4}, Lu2/b$b$a;-><init>(Lo2/u;)V

    iput v2, p0, Lu2/b$b;->G:I

    invoke-interface {p1, v1, v3, p0}, Lo2/k;->b(Ljava/lang/String;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    return-object p1
.end method

.method public final H(Lo2/B;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lu2/b$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lu2/b$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lu2/b$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo2/B;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lu2/b$b;->H(Lo2/B;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, Lu2/b$b;

    iget-object v1, p0, Lu2/b$b;->I:Ljava/lang/String;

    iget-object v2, p0, Lu2/b$b;->J:Lo2/u;

    invoke-direct {v0, v1, v2, p2}, Lu2/b$b;-><init>(Ljava/lang/String;Lo2/u;Lm7/e;)V

    iput-object p1, v0, Lu2/b$b;->H:Ljava/lang/Object;

    return-object v0
.end method
