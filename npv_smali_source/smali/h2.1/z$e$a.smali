.class public final Lh2/z$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/z$e;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:LZ8/g;

.field final synthetic D:I


# direct methods
.method public constructor <init>(LZ8/g;I)V
    .locals 0

    iput-object p1, p0, Lh2/z$e$a;->C:LZ8/g;

    iput p2, p0, Lh2/z$e$a;->D:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p2, Lh2/z$e$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh2/z$e$a$a;

    iget v1, v0, Lh2/z$e$a$a;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh2/z$e$a$a;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh2/z$e$a$a;

    invoke-direct {v0, p0, p2}, Lh2/z$e$a$a;-><init>(Lh2/z$e$a;Lm7/e;)V

    :goto_0
    iget-object p2, v0, Lh2/z$e$a$a;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lh2/z$e$a$a;->G:I

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

    iget-object p2, p0, Lh2/z$e$a;->C:LZ8/g;

    check-cast p1, Lh2/Z;

    new-instance v2, Lh2/l;

    iget v4, p0, Lh2/z$e$a;->D:I

    invoke-direct {v2, v4, p1}, Lh2/l;-><init>(ILh2/Z;)V

    iput v3, v0, Lh2/z$e$a$a;->G:I

    invoke-interface {p2, v2, v0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
