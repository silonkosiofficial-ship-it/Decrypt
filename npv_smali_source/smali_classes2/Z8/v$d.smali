.class final LZ8/v$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ8/v;->c(LZ8/f;)LZ8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:LZ8/g;

.field final synthetic D:Ly7/M;


# direct methods
.method constructor <init>(LZ8/g;Ly7/M;)V
    .locals 0

    iput-object p1, p0, LZ8/v$d;->C:LZ8/g;

    iput-object p2, p0, LZ8/v$d;->D:Ly7/M;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 7

    .prologue
    instance-of v0, p2, LZ8/v$d$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LZ8/v$d$a;

    iget v1, v0, LZ8/v$d$a;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LZ8/v$d$a;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, LZ8/v$d$a;

    invoke-direct {v0, p0, p2}, LZ8/v$d$a;-><init>(LZ8/v$d;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LZ8/v$d$a;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LZ8/v$d$a;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LZ8/v$d;->C:LZ8/g;

    new-instance v2, Lj7/L;

    iget-object v4, p0, LZ8/v$d;->D:Ly7/M;

    iget v5, v4, Ly7/M;->C:I

    add-int/lit8 v6, v5, 0x1

    iput v6, v4, Ly7/M;->C:I

    if-ltz v5, :cond_4

    invoke-direct {v2, v5, p1}, Lj7/L;-><init>(ILjava/lang/Object;)V

    iput v3, v0, LZ8/v$d$a;->H:I

    invoke-interface {p2, v2, v0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/ArithmeticException;

    const-string p2, "Index overflow has happened"

    invoke-direct {p1, p2}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
