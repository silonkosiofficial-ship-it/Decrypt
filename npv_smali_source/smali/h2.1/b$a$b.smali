.class final Lh2/b$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/b$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:Ly7/M;

.field final synthetic D:LZ8/g;


# direct methods
.method constructor <init>(Ly7/M;LZ8/g;)V
    .locals 0

    iput-object p1, p0, Lh2/b$a$b;->C:Ly7/M;

    iput-object p2, p0, Lh2/b$a$b;->D:LZ8/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lj7/L;

    invoke-virtual {p0, p1, p2}, Lh2/b$a$b;->b(Lj7/L;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lj7/L;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p2, Lh2/b$a$b$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh2/b$a$b$a;

    iget v1, v0, Lh2/b$a$b$a;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh2/b$a$b$a;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh2/b$a$b$a;

    invoke-direct {v0, p0, p2}, Lh2/b$a$b$a;-><init>(Lh2/b$a$b;Lm7/e;)V

    :goto_0
    iget-object p2, v0, Lh2/b$a$b$a;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lh2/b$a$b$a;->J:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lh2/b$a$b$a;->G:Ljava/lang/Object;

    check-cast p1, Lj7/L;

    iget-object v0, v0, Lh2/b$a$b$a;->F:Ljava/lang/Object;

    check-cast v0, Lh2/b$a$b;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lj7/L;->c()I

    move-result p2

    iget-object v2, p0, Lh2/b$a$b;->C:Ly7/M;

    iget v2, v2, Ly7/M;->C:I

    if-le p2, v2, :cond_4

    iget-object p2, p0, Lh2/b$a$b;->D:LZ8/g;

    invoke-virtual {p1}, Lj7/L;->d()Ljava/lang/Object;

    move-result-object v2

    iput-object p0, v0, Lh2/b$a$b$a;->F:Ljava/lang/Object;

    iput-object p1, v0, Lh2/b$a$b$a;->G:Ljava/lang/Object;

    iput v3, v0, Lh2/b$a$b$a;->J:I

    invoke-interface {p2, v2, v0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    iget-object p2, v0, Lh2/b$a$b;->C:Ly7/M;

    invoke-virtual {p1}, Lj7/L;->c()I

    move-result p1

    iput p1, p2, Ly7/M;->C:I

    :cond_4
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
