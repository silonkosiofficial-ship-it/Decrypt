.class final Lh2/z$c;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/z;->q(LZ8/f;Lh2/t;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:Ljava/lang/Object;

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:Lh2/t;


# direct methods
.method constructor <init>(Lh2/t;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lh2/z$c;->J:Lh2/t;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, Lh2/z$c;->G:I

    if-nez v0, :cond_1

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lh2/z$c;->H:Ljava/lang/Object;

    check-cast p1, Lh2/l;

    iget-object v0, p0, Lh2/z$c;->I:Ljava/lang/Object;

    check-cast v0, Lh2/l;

    iget-object v1, p0, Lh2/z$c;->J:Lh2/t;

    invoke-static {v0, p1, v1}, Lh2/A;->a(Lh2/l;Lh2/l;Lh2/t;)Z

    move-result v1

    if-eqz v1, :cond_0

    move-object p1, v0

    :cond_0
    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(Lh2/l;Lh2/l;Lm7/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lh2/z$c;

    iget-object v1, p0, Lh2/z$c;->J:Lh2/t;

    invoke-direct {v0, v1, p3}, Lh2/z$c;-><init>(Lh2/t;Lm7/e;)V

    iput-object p1, v0, Lh2/z$c;->H:Ljava/lang/Object;

    iput-object p2, v0, Lh2/z$c;->I:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, Lh2/z$c;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh2/l;

    check-cast p2, Lh2/l;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, Lh2/z$c;->H(Lh2/l;Lh2/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
