.class public final LZ8/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ8/i;->e([Ljava/lang/Object;)LZ8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:[Ljava/lang/Object;


# direct methods
.method public constructor <init>([Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LZ8/i$a;->C:[Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 7

    .prologue
    instance-of v0, p2, LZ8/i$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LZ8/i$a$a;

    iget v1, v0, LZ8/i$a$a;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LZ8/i$a$a;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, LZ8/i$a$a;

    invoke-direct {v0, p0, p2}, LZ8/i$a$a;-><init>(LZ8/i$a;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LZ8/i$a$a;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LZ8/i$a$a;->G:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, LZ8/i$a$a;->L:I

    iget v2, v0, LZ8/i$a$a;->K:I

    iget-object v4, v0, LZ8/i$a$a;->J:Ljava/lang/Object;

    check-cast v4, LZ8/g;

    iget-object v5, v0, LZ8/i$a$a;->I:Ljava/lang/Object;

    check-cast v5, LZ8/i$a;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    move-object p2, v4

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LZ8/i$a;->C:[Ljava/lang/Object;

    array-length p2, p2

    const/4 v2, 0x0

    move-object v5, p0

    move v6, p2

    move-object p2, p1

    move p1, v6

    :goto_1
    if-ge v2, p1, :cond_4

    iget-object v4, v5, LZ8/i$a;->C:[Ljava/lang/Object;

    aget-object v4, v4, v2

    iput-object v5, v0, LZ8/i$a$a;->I:Ljava/lang/Object;

    iput-object p2, v0, LZ8/i$a$a;->J:Ljava/lang/Object;

    iput v2, v0, LZ8/i$a$a;->K:I

    iput p1, v0, LZ8/i$a$a;->L:I

    iput v3, v0, LZ8/i$a$a;->G:I

    invoke-interface {p2, v4, v0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    add-int/2addr v2, v3

    goto :goto_1

    :cond_4
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
