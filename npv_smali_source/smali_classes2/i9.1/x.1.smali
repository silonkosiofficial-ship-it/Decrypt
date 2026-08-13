.class public final Li9/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/N;
.implements Lm9/c;


# instance fields
.field private a:Ljava/lang/Integer;

.field private b:Ljava/lang/Integer;

.field private c:Li9/g;

.field private d:Ljava/lang/Integer;

.field private e:Ljava/lang/Integer;

.field private f:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Li9/g;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li9/x;->a:Ljava/lang/Integer;

    iput-object p2, p0, Li9/x;->b:Ljava/lang/Integer;

    iput-object p3, p0, Li9/x;->c:Li9/g;

    iput-object p4, p0, Li9/x;->d:Ljava/lang/Integer;

    iput-object p5, p0, Li9/x;->e:Ljava/lang/Integer;

    iput-object p6, p0, Li9/x;->f:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Li9/g;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILy7/k;)V
    .locals 5

    .prologue
    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p8, v0

    goto :goto_0

    :cond_0
    move-object p8, p1

    :goto_0
    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    move-object v1, v0

    goto :goto_1

    :cond_1
    move-object v1, p2

    :goto_1
    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    move-object v2, v0

    goto :goto_2

    :cond_2
    move-object v2, p3

    :goto_2
    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    move-object v3, v0

    goto :goto_3

    :cond_3
    move-object v3, p4

    :goto_3
    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    move-object v4, v0

    goto :goto_4

    :cond_4
    move-object v4, p5

    :goto_4
    and-int/lit8 p1, p7, 0x20

    if-eqz p1, :cond_5

    move-object p7, v0

    goto :goto_5

    :cond_5
    move-object p7, p6

    :goto_5
    move-object p1, p0

    move-object p2, p8

    move-object p3, v1

    move-object p4, v2

    move-object p5, v3

    move-object p6, v4

    invoke-direct/range {p1 .. p7}, Li9/x;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Li9/g;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method


# virtual methods
.method public A()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/x;->e:Ljava/lang/Integer;

    return-object v0
.end method

.method public C(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Li9/x;->e:Ljava/lang/Integer;

    return-void
.end method

.method public a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/x;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public b()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/x;->a:Ljava/lang/Integer;

    return-object v0
.end method

.method public c()Li9/x;
    .locals 8

    new-instance v7, Li9/x;

    invoke-virtual {p0}, Li9/x;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0}, Li9/x;->r()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0}, Li9/x;->f()Li9/g;

    move-result-object v3

    invoke-virtual {p0}, Li9/x;->a()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p0}, Li9/x;->A()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p0}, Li9/x;->q()Ljava/lang/Integer;

    move-result-object v6

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Li9/x;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Li9/g;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object v7
.end method

.method public d(Lj9/a;)V
    .locals 0

    invoke-static {p0, p1}, Li9/N$a;->b(Li9/N;Lj9/a;)V

    return-void
.end method

.method public bridge synthetic e()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li9/x;->c()Li9/x;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, Li9/x;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Li9/x;->b()Ljava/lang/Integer;

    move-result-object v0

    check-cast p1, Li9/x;

    invoke-virtual {p1}, Li9/x;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Li9/x;->r()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1}, Li9/x;->r()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Li9/x;->f()Li9/g;

    move-result-object v0

    invoke-virtual {p1}, Li9/x;->f()Li9/g;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Li9/x;->a()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1}, Li9/x;->a()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Li9/x;->A()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1}, Li9/x;->A()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Li9/x;->q()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1}, Li9/x;->q()Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f()Li9/g;
    .locals 1

    iget-object v0, p0, Li9/x;->c:Li9/g;

    return-object v0
.end method

.method public g(Li9/g;)V
    .locals 0

    iput-object p1, p0, Li9/x;->c:Li9/g;

    return-void
.end method

.method public final h(Lh9/l;)V
    .locals 2

    .prologue
    const-string v0, "localTime"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lh9/l;->g()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Li9/x;->x(Ljava/lang/Integer;)V

    invoke-virtual {p1}, Lh9/l;->g()I

    move-result v0

    add-int/lit8 v0, v0, 0xb

    const/16 v1, 0xc

    rem-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Li9/x;->i(Ljava/lang/Integer;)V

    invoke-virtual {p1}, Lh9/l;->g()I

    move-result v0

    if-lt v0, v1, :cond_0

    sget-object v0, Li9/g;->D:Li9/g;

    goto :goto_0

    :cond_0
    sget-object v0, Li9/g;->C:Li9/g;

    :goto_0
    invoke-virtual {p0, v0}, Li9/x;->g(Li9/g;)V

    invoke-virtual {p1}, Lh9/l;->i()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Li9/x;->m(Ljava/lang/Integer;)V

    invoke-virtual {p1}, Lh9/l;->n()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Li9/x;->C(Ljava/lang/Integer;)V

    invoke-virtual {p1}, Lh9/l;->m()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Li9/x;->j(Ljava/lang/Integer;)V

    return-void
.end method

.method public hashCode()I
    .locals 3

    .prologue
    invoke-virtual {p0}, Li9/x;->b()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Li9/x;->r()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    mul-int/lit8 v2, v2, 0x1f

    add-int/2addr v0, v2

    invoke-virtual {p0}, Li9/x;->f()Li9/g;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    mul-int/lit8 v2, v2, 0x1f

    add-int/2addr v0, v2

    invoke-virtual {p0}, Li9/x;->a()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_3

    :cond_3
    move v2, v1

    :goto_3
    mul-int/lit8 v2, v2, 0x1f

    add-int/2addr v0, v2

    invoke-virtual {p0}, Li9/x;->A()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_4

    :cond_4
    move v2, v1

    :goto_4
    mul-int/lit8 v2, v2, 0x1f

    add-int/2addr v0, v2

    invoke-virtual {p0}, Li9/x;->q()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :cond_5
    add-int/2addr v0, v1

    return v0
.end method

.method public i(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Li9/x;->b:Ljava/lang/Integer;

    return-void
.end method

.method public j(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Li9/x;->f:Ljava/lang/Integer;

    return-void
.end method

.method public final k()Lh9/l;
    .locals 6

    .prologue
    invoke-virtual {p0}, Li9/x;->b()Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0xc

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0}, Li9/x;->r()Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    add-int/lit8 v5, v0, 0xb

    rem-int/2addr v5, v1

    add-int/2addr v5, v4

    if-ne v5, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Inconsistent hour and hour-of-am-pm: hour is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", but hour-of-am-pm is "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    invoke-virtual {p0}, Li9/x;->f()Li9/g;

    move-result-object v3

    if-eqz v3, :cond_9

    sget-object v5, Li9/g;->D:Li9/g;

    if-ne v3, v5, :cond_2

    move v5, v4

    goto :goto_1

    :cond_2
    move v5, v2

    :goto_1
    if-lt v0, v1, :cond_3

    goto :goto_2

    :cond_3
    move v4, v2

    :goto_2
    if-ne v5, v4, :cond_4

    goto :goto_4

    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Inconsistent hour and the AM/PM marker: hour is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", but the AM/PM marker is "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    invoke-virtual {p0}, Li9/x;->r()Ljava/lang/Integer;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0}, Li9/x;->f()Li9/g;

    move-result-object v4

    if-eqz v4, :cond_8

    if-ne v0, v1, :cond_6

    move v0, v2

    :cond_6
    sget-object v3, Li9/g;->D:Li9/g;

    if-ne v4, v3, :cond_7

    goto :goto_3

    :cond_7
    move v1, v2

    :goto_3
    add-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :cond_8
    if-eqz v3, :cond_c

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :cond_9
    :goto_4
    new-instance v1, Lh9/l;

    invoke-virtual {p0}, Li9/x;->a()Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "minute"

    invoke-static {v3, v4}, Li9/A;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {p0}, Li9/x;->A()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_a

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_5

    :cond_a
    move v4, v2

    :goto_5
    invoke-virtual {p0}, Li9/x;->q()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_b

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :cond_b
    invoke-direct {v1, v0, v3, v4, v2}, Lh9/l;-><init>(IIII)V

    return-object v1

    :cond_c
    new-instance v0, Lh9/c;

    const-string v1, "Incomplete time: missing hour"

    invoke-direct {v0, v1}, Lh9/c;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public m(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Li9/x;->d:Ljava/lang/Integer;

    return-void
.end method

.method public p()Lj9/a;
    .locals 1

    invoke-static {p0}, Li9/N$a;->a(Li9/N;)Lj9/a;

    move-result-object v0

    return-object v0
.end method

.method public q()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/x;->f:Ljava/lang/Integer;

    return-object v0
.end method

.method public r()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/x;->b:Ljava/lang/Integer;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Li9/x;->b()Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "??"

    if-nez v1, :cond_0

    move-object v1, v2

    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Li9/x;->a()Ljava/lang/Integer;

    move-result-object v3

    if-nez v3, :cond_1

    move-object v3, v2

    :cond_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Li9/x;->A()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Li9/x;->q()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    rsub-int/lit8 v2, v2, 0x9

    const/16 v3, 0x30

    invoke-static {v1, v2, v3}, LS8/r;->B0(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    :cond_3
    const-string v1, "???"

    :cond_4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public x(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Li9/x;->a:Ljava/lang/Integer;

    return-void
.end method
