.class final Lh2/b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/b$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:Lh2/b;


# direct methods
.method constructor <init>(Lh2/b;)V
    .locals 0

    iput-object p1, p0, Lh2/b$b$a;->C:Lh2/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lj7/L;

    invoke-virtual {p0, p1, p2}, Lh2/b$b$a;->b(Lj7/L;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lj7/L;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p2, Lh2/b$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh2/b$b$a$a;

    iget v1, v0, Lh2/b$b$a$a;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh2/b$b$a$a;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh2/b$b$a$a;

    invoke-direct {v0, p0, p2}, Lh2/b$b$a$a;-><init>(Lh2/b$b$a;Lm7/e;)V

    :goto_0
    iget-object p2, v0, Lh2/b$b$a$a;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lh2/b$b$a$a;->J:I

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
    iget-object p1, v0, Lh2/b$b$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lj7/L;

    iget-object v2, v0, Lh2/b$b$a$a;->F:Ljava/lang/Object;

    check-cast v2, Lh2/b$b$a;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lh2/b$b$a;->C:Lh2/b;

    invoke-static {p2}, Lh2/b;->b(Lh2/b;)LZ8/x;

    move-result-object p2

    iput-object p0, v0, Lh2/b$b$a$a;->F:Ljava/lang/Object;

    iput-object p1, v0, Lh2/b$b$a$a;->G:Ljava/lang/Object;

    iput v4, v0, Lh2/b$b$a$a;->J:I

    invoke-interface {p2, p1, v0}, LZ8/x;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    iget-object p2, v2, Lh2/b$b$a;->C:Lh2/b;

    invoke-static {p2}, Lh2/b;->c(Lh2/b;)Lh2/i;

    move-result-object p2

    const/4 v2, 0x0

    iput-object v2, v0, Lh2/b$b$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Lh2/b$b$a$a;->G:Ljava/lang/Object;

    iput v3, v0, Lh2/b$b$a$a;->J:I

    invoke-virtual {p2, p1, v0}, Lh2/i;->c(Lj7/L;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
