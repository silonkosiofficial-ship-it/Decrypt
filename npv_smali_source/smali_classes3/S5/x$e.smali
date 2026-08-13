.class final LS5/x$e;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS5/x;-><init>(Landroid/content/Context;Lm7/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

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
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LS5/x$e;->G:I

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

    iget-object p1, p0, LS5/x$e;->H:Ljava/lang/Object;

    check-cast p1, LZ8/g;

    iget-object v1, p0, LS5/x$e;->I:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    const-string v3, "FirebaseSessionsRepo"

    const-string v4, "Error reading stored session data."

    nop

    invoke-static {}, LQ1/g;->a()LQ1/f;

    move-result-object v1

    const/4 v3, 0x0

    iput-object v3, p0, LS5/x$e;->H:Ljava/lang/Object;

    iput v2, p0, LS5/x$e;->G:I

    invoke-interface {p1, v1, p0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LZ8/g;Ljava/lang/Throwable;Lm7/e;)Ljava/lang/Object;
    .locals 1

    new-instance v0, LS5/x$e;

    invoke-direct {v0, p3}, LS5/x$e;-><init>(Lm7/e;)V

    iput-object p1, v0, LS5/x$e;->H:Ljava/lang/Object;

    iput-object p2, v0, LS5/x$e;->I:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, LS5/x$e;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZ8/g;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, LS5/x$e;->H(LZ8/g;Ljava/lang/Throwable;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
