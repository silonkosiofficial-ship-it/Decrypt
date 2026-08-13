.class final LZ8/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ8/e;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:LZ8/e;

.field final synthetic D:Ly7/O;

.field final synthetic E:LZ8/g;


# direct methods
.method constructor <init>(LZ8/e;Ly7/O;LZ8/g;)V
    .locals 0

    iput-object p1, p0, LZ8/e$a;->C:LZ8/e;

    iput-object p2, p0, LZ8/e$a;->D:Ly7/O;

    iput-object p3, p0, LZ8/e$a;->E:LZ8/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p2, LZ8/e$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LZ8/e$a$a;

    iget v1, v0, LZ8/e$a$a;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LZ8/e$a$a;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, LZ8/e$a$a;

    invoke-direct {v0, p0, p2}, LZ8/e$a$a;-><init>(LZ8/e$a;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LZ8/e$a$a;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LZ8/e$a$a;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

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

    iget-object p2, p0, LZ8/e$a;->C:LZ8/e;

    iget-object p2, p2, LZ8/e;->D:Lx7/l;

    invoke-interface {p2, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iget-object v2, p0, LZ8/e$a;->D:Ly7/O;

    iget-object v2, v2, Ly7/O;->C:Ljava/lang/Object;

    sget-object v4, La9/t;->a:Lb9/D;

    if-eq v2, v4, :cond_4

    iget-object v4, p0, LZ8/e$a;->C:LZ8/e;

    iget-object v4, v4, LZ8/e;->E:Lx7/p;

    invoke-interface {v4, v2, p2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_4
    :goto_1
    iget-object v2, p0, LZ8/e$a;->D:Ly7/O;

    iput-object p2, v2, Ly7/O;->C:Ljava/lang/Object;

    iget-object p2, p0, LZ8/e$a;->E:LZ8/g;

    iput v3, v0, LZ8/e$a$a;->H:I

    invoke-interface {p2, p1, v0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
