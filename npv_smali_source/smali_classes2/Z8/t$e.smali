.class public final LZ8/t$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ8/t;->c(LZ8/f;Lx7/p;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:Lx7/p;

.field final synthetic D:Ly7/O;


# direct methods
.method public constructor <init>(Lx7/p;Ly7/O;)V
    .locals 0

    iput-object p1, p0, LZ8/t$e;->C:Lx7/p;

    iput-object p2, p0, LZ8/t$e;->D:Ly7/O;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p2, LZ8/t$e$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LZ8/t$e$a;

    iget v1, v0, LZ8/t$e$a;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LZ8/t$e$a;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, LZ8/t$e$a;

    invoke-direct {v0, p0, p2}, LZ8/t$e$a;-><init>(LZ8/t$e;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LZ8/t$e$a;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LZ8/t$e$a;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LZ8/t$e$a;->J:Ljava/lang/Object;

    iget-object v0, v0, LZ8/t$e$a;->F:Ljava/lang/Object;

    check-cast v0, LZ8/t$e;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LZ8/t$e;->C:Lx7/p;

    iput-object p0, v0, LZ8/t$e$a;->F:Ljava/lang/Object;

    iput-object p1, v0, LZ8/t$e$a;->J:Ljava/lang/Object;

    iput v3, v0, LZ8/t$e$a;->H:I

    const/4 v2, 0x6

    invoke-static {v2}, Ly7/r;->a(I)V

    invoke-interface {p2, p1, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    const/4 v0, 0x7

    invoke-static {v0}, Ly7/r;->a(I)V

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_4

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_4
    iget-object p2, v0, LZ8/t$e;->D:Ly7/O;

    iput-object p1, p2, Ly7/O;->C:Ljava/lang/Object;

    new-instance p1, La9/a;

    invoke-direct {p1, v0}, La9/a;-><init>(Ljava/lang/Object;)V

    throw p1
.end method
