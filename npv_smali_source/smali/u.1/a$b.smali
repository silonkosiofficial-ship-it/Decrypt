.class final Lu/a$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/a;->s(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:Lu/a;

.field final synthetic I:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lu/a;Ljava/lang/Object;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lu/a$b;->H:Lu/a;

    iput-object p2, p0, Lu/a$b;->I:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, Lu/a$b;->G:I

    if-nez v0, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lu/a$b;->H:Lu/a;

    invoke-static {p1}, Lu/a;->b(Lu/a;)V

    iget-object p1, p0, Lu/a$b;->H:Lu/a;

    iget-object v0, p0, Lu/a$b;->I:Ljava/lang/Object;

    invoke-static {p1, v0}, Lu/a;->a(Lu/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lu/a$b;->H:Lu/a;

    invoke-virtual {v0}, Lu/a;->j()Lu/l;

    move-result-object v0

    invoke-virtual {v0, p1}, Lu/l;->v(Ljava/lang/Object;)V

    iget-object v0, p0, Lu/a$b;->H:Lu/a;

    invoke-static {v0, p1}, Lu/a;->d(Lu/a;Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(Lm7/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lu/a$b;->y(Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lu/a$b;

    sget-object v0, Li7/M;->a:Li7/M;

    invoke-virtual {p1, v0}, Lu/a$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm7/e;

    invoke-virtual {p0, p1}, Lu/a$b;->H(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final y(Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, Lu/a$b;

    iget-object v1, p0, Lu/a$b;->H:Lu/a;

    iget-object v2, p0, Lu/a$b;->I:Ljava/lang/Object;

    invoke-direct {v0, v1, v2, p1}, Lu/a$b;-><init>(Lu/a;Ljava/lang/Object;Lm7/e;)V

    return-object v0
.end method
