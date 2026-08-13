.class public abstract La9/g;
.super La9/e;
.source "SourceFile"


# instance fields
.field protected final F:LZ8/f;


# direct methods
.method public constructor <init>(LZ8/f;Lm7/i;ILY8/d;)V
    .locals 0

    invoke-direct {p0, p2, p3, p4}, La9/e;-><init>(Lm7/i;ILY8/d;)V

    iput-object p1, p0, La9/g;->F:LZ8/f;

    return-void
.end method

.method static synthetic q(La9/g;LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    iget v0, p0, La9/e;->D:I

    const/4 v1, -0x3

    if-ne v0, v1, :cond_3

    invoke-interface {p2}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    iget-object v1, p0, La9/e;->C:Lm7/i;

    invoke-static {v0, v1}, LW8/H;->k(Lm7/i;Lm7/i;)Lm7/i;

    move-result-object v1

    invoke-static {v1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, p1, p2}, La9/g;->t(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0

    :cond_1
    sget-object v2, Lm7/f;->A:Lm7/f$b;

    invoke-interface {v1, v2}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v3

    invoke-interface {v0, v2}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v0

    invoke-static {v3, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0, p1, v1, p2}, La9/g;->s(LZ8/g;Lm7/i;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2

    return-object p0

    :cond_2
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0

    :cond_3
    invoke-super {p0, p1, p2}, La9/e;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_4

    return-object p0

    :cond_4
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method static synthetic r(La9/g;LY8/z;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    new-instance v0, La9/z;

    invoke-direct {v0, p1}, La9/z;-><init>(LY8/C;)V

    invoke-virtual {p0, v0, p2}, La9/g;->t(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private final s(LZ8/g;Lm7/i;Lm7/e;)Ljava/lang/Object;
    .locals 8

    invoke-interface {p3}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    invoke-static {p1, v0}, La9/f;->a(LZ8/g;Lm7/i;)LZ8/g;

    move-result-object v2

    new-instance v4, La9/g$a;

    const/4 p1, 0x0

    invoke-direct {v4, p0, p1}, La9/g$a;-><init>(La9/g;Lm7/e;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object v1, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, La9/f;->c(Lm7/i;Ljava/lang/Object;Ljava/lang/Object;Lx7/p;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public b(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, La9/g;->q(La9/g;LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected h(LY8/z;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, La9/g;->r(La9/g;LY8/z;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected abstract t(LZ8/g;Lm7/e;)Ljava/lang/Object;
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, La9/g;->F:LZ8/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, La9/e;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
