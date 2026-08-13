.class public final La9/v;
.super Lo7/d;
.source "SourceFile"

# interfaces
.implements LZ8/g;
.implements Lo7/e;


# instance fields
.field public final F:LZ8/g;

.field public final G:Lm7/i;

.field public final H:I

.field private I:Lm7/i;

.field private J:Lm7/e;


# direct methods
.method public constructor <init>(LZ8/g;Lm7/i;)V
    .locals 2

    sget-object v0, La9/r;->C:La9/r;

    sget-object v1, Lm7/j;->C:Lm7/j;

    invoke-direct {p0, v0, v1}, Lo7/d;-><init>(Lm7/e;Lm7/i;)V

    iput-object p1, p0, La9/v;->F:LZ8/g;

    iput-object p2, p0, La9/v;->G:Lm7/i;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v0, La9/u;

    invoke-direct {v0}, La9/u;-><init>()V

    invoke-interface {p2, p1, v0}, Lm7/i;->D(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, p0, La9/v;->H:I

    return-void
.end method

.method public static synthetic H(ILm7/i$b;)I
    .locals 0

    invoke-static {p0, p1}, La9/v;->K(ILm7/i$b;)I

    move-result p0

    return p0
.end method

.method private final I(Lm7/i;Lm7/i;Ljava/lang/Object;)V
    .locals 1

    .prologue
    instance-of v0, p2, La9/m;

    if-eqz v0, :cond_0

    check-cast p2, La9/m;

    invoke-direct {p0, p2, p3}, La9/v;->M(La9/m;Ljava/lang/Object;)V

    :cond_0
    invoke-static {p0, p1}, La9/y;->b(La9/v;Lm7/i;)V

    return-void
.end method

.method private static final K(ILm7/i$b;)I
    .locals 0

    add-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private final L(Lm7/e;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-interface {p1}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    invoke-static {v0}, LW8/C0;->l(Lm7/i;)V

    iget-object v1, p0, La9/v;->I:Lm7/i;

    if-eq v1, v0, :cond_0

    invoke-direct {p0, v0, v1, p2}, La9/v;->I(Lm7/i;Lm7/i;Ljava/lang/Object;)V

    iput-object v0, p0, La9/v;->I:Lm7/i;

    :cond_0
    iput-object p1, p0, La9/v;->J:Lm7/e;

    invoke-static {}, La9/w;->a()Lx7/q;

    move-result-object p1

    iget-object v0, p0, La9/v;->F:LZ8/g;

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>"

    invoke-static {p0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0, p2, p0}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    iput-object p2, p0, La9/v;->J:Lm7/e;

    :cond_1
    return-object p1
.end method

.method private final M(La9/m;Ljava/lang/Object;)V
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\n            Flow exception transparency is violated:\n                Previous \'emit\' call has thrown exception "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, La9/m;->D:Ljava/lang/Throwable;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", but then emission attempt of value \'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' has been detected.\n                Emissions from \'catch\' blocks are prohibited in order to avoid unspecified behaviour, \'Flow.catch\' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LS8/r;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public A()Ljava/lang/StackTraceElement;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-static {p1}, Li7/w;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, La9/m;

    invoke-virtual {p0}, La9/v;->getContext()Lm7/i;

    move-result-object v2

    invoke-direct {v1, v0, v2}, La9/m;-><init>(Ljava/lang/Throwable;Lm7/i;)V

    iput-object v1, p0, La9/v;->I:Lm7/i;

    :cond_0
    iget-object v0, p0, La9/v;->J:Lm7/e;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lm7/e;->t(Ljava/lang/Object;)V

    :cond_1
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public D()V
    .locals 0

    invoke-super {p0}, Lo7/d;->D()V

    return-void
.end method

.method public a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    :try_start_0
    invoke-direct {p0, p2, p1}, La9/v;->L(Lm7/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lo7/h;->c(Lm7/e;)V

    :cond_0
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :catchall_0
    move-exception p1

    new-instance v0, La9/m;

    invoke-interface {p2}, Lm7/e;->getContext()Lm7/i;

    move-result-object p2

    invoke-direct {v0, p1, p2}, La9/m;-><init>(Ljava/lang/Throwable;Lm7/i;)V

    iput-object v0, p0, La9/v;->I:Lm7/i;

    throw p1
.end method

.method public e()Lo7/e;
    .locals 2

    .prologue
    iget-object v0, p0, La9/v;->J:Lm7/e;

    instance-of v1, v0, Lo7/e;

    if-eqz v1, :cond_0

    check-cast v0, Lo7/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getContext()Lm7/i;
    .locals 1

    .prologue
    iget-object v0, p0, La9/v;->I:Lm7/i;

    if-nez v0, :cond_0

    sget-object v0, Lm7/j;->C:Lm7/j;

    :cond_0
    return-object v0
.end method
