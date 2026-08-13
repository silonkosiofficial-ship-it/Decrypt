.class final LS/f$f;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/f;->b(Landroidx/compose/ui/d;JJFLA/B;LA/S;LS/j;Lx7/q;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:F


# direct methods
.method constructor <init>(LS/j;Lm7/e;)V
    .locals 0

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, LS/f$f;->G:I

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final H(LW8/N;FLm7/e;)Ljava/lang/Object;
    .locals 1

    new-instance p1, LS/f$f;

    const/4 v0, 0x0

    invoke-direct {p1, v0, p3}, LS/f$f;-><init>(LS/j;Lm7/e;)V

    iput p2, p1, LS/f$f;->H:F

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LS/f$f;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, LS/f$f;->H(LW8/N;FLm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
