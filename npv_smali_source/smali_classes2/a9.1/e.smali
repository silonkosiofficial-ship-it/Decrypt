.class public abstract La9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La9/q;


# instance fields
.field public final C:Lm7/i;

.field public final D:I

.field public final E:LY8/d;


# direct methods
.method public constructor <init>(Lm7/i;ILY8/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La9/e;->C:Lm7/i;

    iput p2, p0, La9/e;->D:I

    iput-object p3, p0, La9/e;->E:LY8/d;

    return-void
.end method

.method static synthetic f(La9/e;LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    new-instance v0, La9/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, La9/e$a;-><init>(LZ8/g;La9/e;Lm7/e;)V

    invoke-static {v0, p2}, LW8/O;->f(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method


# virtual methods
.method public b(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, La9/e;->f(La9/e;LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(Lm7/i;ILY8/d;)LZ8/f;
    .locals 1

    .prologue
    iget-object v0, p0, La9/e;->C:Lm7/i;

    invoke-interface {p1, v0}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p1

    sget-object v0, LY8/d;->C:LY8/d;

    if-eq p3, v0, :cond_0

    goto :goto_2

    :cond_0
    iget p3, p0, La9/e;->D:I

    const/4 v0, -0x3

    if-ne p3, v0, :cond_1

    goto :goto_1

    :cond_1
    if-ne p2, v0, :cond_2

    :goto_0
    move p2, p3

    goto :goto_1

    :cond_2
    const/4 v0, -0x2

    if-ne p3, v0, :cond_3

    goto :goto_1

    :cond_3
    if-ne p2, v0, :cond_4

    goto :goto_0

    :cond_4
    add-int/2addr p2, p3

    if-ltz p2, :cond_5

    goto :goto_1

    :cond_5
    const p2, 0x7fffffff

    :goto_1
    iget-object p3, p0, La9/e;->E:LY8/d;

    :goto_2
    iget-object v0, p0, La9/e;->C:Lm7/i;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget v0, p0, La9/e;->D:I

    if-ne p2, v0, :cond_6

    iget-object v0, p0, La9/e;->E:LY8/d;

    if-ne p3, v0, :cond_6

    return-object p0

    :cond_6
    invoke-virtual {p0, p1, p2, p3}, La9/e;->i(Lm7/i;ILY8/d;)La9/e;

    move-result-object p1

    return-object p1
.end method

.method protected e()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected abstract h(LY8/z;Lm7/e;)Ljava/lang/Object;
.end method

.method protected abstract i(Lm7/i;ILY8/d;)La9/e;
.end method

.method public j()LZ8/f;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final k()Lx7/p;
    .locals 2

    new-instance v0, La9/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, La9/e$b;-><init>(La9/e;Lm7/e;)V

    return-object v0
.end method

.method public final l()I
    .locals 2

    .prologue
    iget v0, p0, La9/e;->D:I

    const/4 v1, -0x3

    if-ne v0, v1, :cond_0

    const/4 v0, -0x2

    :cond_0
    return v0
.end method

.method public o(LW8/N;)LY8/B;
    .locals 9

    iget-object v1, p0, La9/e;->C:Lm7/i;

    invoke-virtual {p0}, La9/e;->l()I

    move-result v2

    iget-object v3, p0, La9/e;->E:LY8/d;

    sget-object v4, LW8/P;->E:LW8/P;

    invoke-virtual {p0}, La9/e;->k()Lx7/p;

    move-result-object v6

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v8}, LY8/x;->d(LW8/N;Lm7/i;ILY8/d;LW8/P;Lx7/l;Lx7/p;ILjava/lang/Object;)LY8/B;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    .prologue
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, La9/e;->e()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, La9/e;->C:Lm7/i;

    sget-object v2, Lm7/j;->C:Lm7/j;

    if-eq v1, v2, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "context="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, La9/e;->C:Lm7/i;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget v1, p0, La9/e;->D:I

    const/4 v2, -0x3

    if-eq v1, v2, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "capacity="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, La9/e;->D:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-object v1, p0, La9/e;->E:LY8/d;

    sget-object v2, LY8/d;->C:LY8/d;

    if-eq v1, v2, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onBufferOverflow="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, La9/e;->E:LY8/d;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LW8/S;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const-string v1, ", "

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lj7/v;->r0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x5d

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
