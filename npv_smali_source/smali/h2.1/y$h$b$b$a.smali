.class public final Lh2/y$h$b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/y$h$b$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:Lh2/Y;

.field final synthetic D:I


# direct methods
.method public constructor <init>(Lh2/Y;I)V
    .locals 0

    iput-object p1, p0, Lh2/y$h$b$b$a;->C:Lh2/Y;

    iput p2, p0, Lh2/y$h$b$b$a;->D:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p2, Lh2/y$h$b$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh2/y$h$b$b$a$a;

    iget v1, v0, Lh2/y$h$b$b$a$a;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh2/y$h$b$b$a$a;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh2/y$h$b$b$a$a;

    invoke-direct {v0, p0, p2}, Lh2/y$h$b$b$a$a;-><init>(Lh2/y$h$b$b$a;Lm7/e;)V

    :goto_0
    iget-object p2, v0, Lh2/y$h$b$b$a$a;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lh2/y$h$b$b$a$a;->G:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lh2/y$h$b$b$a;->C:Lh2/Y;

    iget v2, p0, Lh2/y$h$b$b$a;->D:I

    iput v4, v0, Lh2/y$h$b$b$a$a;->G:I

    invoke-virtual {p2, v2, p1, v0}, Lh2/Y;->a(ILjava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    iput v3, v0, Lh2/y$h$b$b$a$a;->G:I

    invoke-static {v0}, LW8/g1;->a(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
