.class final Lx/D$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I


# direct methods
.method constructor <init>(Lm7/e;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, Lx/D$a;->G:I

    if-nez v0, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(Lx/t;JLm7/e;)Ljava/lang/Object;
    .locals 0

    new-instance p1, Lx/D$a;

    invoke-direct {p1, p4}, Lx/D$a;-><init>(Lm7/e;)V

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lx/D$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lx/t;

    check-cast p2, Ln0/g;

    invoke-virtual {p2}, Ln0/g;->v()J

    move-result-wide v0

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, v0, v1, p3}, Lx/D$a;->H(Lx/t;JLm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
