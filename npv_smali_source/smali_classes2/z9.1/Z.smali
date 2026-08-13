.class public final Lz9/Z;
.super Lw9/b;
.source "SourceFile"

# interfaces
.implements Ly9/s;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz9/Z$a;
    }
.end annotation


# instance fields
.field private final a:Lz9/n;

.field private final b:Ly9/b;

.field private final c:Lz9/i0;

.field private final d:[Ly9/s;

.field private final e:LA9/b;

.field private final f:Ly9/g;

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lz9/A;Ly9/b;Lz9/i0;[Ly9/s;)V
    .locals 1

    const-string v0, "output"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modeReuseCache"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lz9/x;->a(Lz9/A;Ly9/b;)Lz9/n;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3, p4}, Lz9/Z;-><init>(Lz9/n;Ly9/b;Lz9/i0;[Ly9/s;)V

    return-void
.end method

.method public constructor <init>(Lz9/n;Ly9/b;Lz9/i0;[Ly9/s;)V
    .locals 1

    .prologue
    const-string v0, "composer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lw9/b;-><init>()V

    iput-object p1, p0, Lz9/Z;->a:Lz9/n;

    iput-object p2, p0, Lz9/Z;->b:Ly9/b;

    iput-object p3, p0, Lz9/Z;->c:Lz9/i0;

    iput-object p4, p0, Lz9/Z;->d:[Ly9/s;

    invoke-virtual {p0}, Lz9/Z;->z()Ly9/b;

    move-result-object p1

    invoke-virtual {p1}, Ly9/b;->f()LA9/b;

    move-result-object p1

    iput-object p1, p0, Lz9/Z;->e:LA9/b;

    invoke-virtual {p0}, Lz9/Z;->z()Ly9/b;

    move-result-object p1

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object p1

    iput-object p1, p0, Lz9/Z;->f:Ly9/g;

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p4, :cond_1

    aget-object p2, p4, p1

    if-nez p2, :cond_0

    if-eq p2, p0, :cond_1

    :cond_0
    aput-object p0, p4, p1

    :cond_1
    return-void
.end method

.method private final I(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {v0}, Lz9/n;->c()V

    invoke-virtual {p0, p1}, Lz9/Z;->E(Ljava/lang/String;)V

    iget-object p1, p0, Lz9/Z;->a:Lz9/n;

    const/16 v0, 0x3a

    invoke-virtual {p1, v0}, Lz9/n;->f(C)V

    iget-object p1, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {p1}, Lz9/n;->p()V

    invoke-virtual {p0, p2}, Lz9/Z;->E(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public A(I)V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lz9/Z;->g:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz9/Z;->E(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {v0, p1}, Lz9/n;->i(I)V

    :goto_0
    return-void
.end method

.method public D(J)V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lz9/Z;->g:Z

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz9/Z;->E(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {v0, p1, p2}, Lz9/n;->j(J)V

    :goto_0
    return-void
.end method

.method public E(Ljava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {v0, p1}, Lz9/n;->n(Ljava/lang/String;)V

    return-void
.end method

.method public F(Lv9/f;I)Z
    .locals 6

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz9/Z;->c:Lz9/i0;

    sget-object v1, Lz9/Z$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/16 v1, 0x2c

    const/4 v2, 0x1

    if-eq v0, v2, :cond_7

    const/16 v3, 0x3a

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-eq v0, v5, :cond_3

    const/4 v5, 0x3

    if-eq v0, v5, :cond_1

    iget-object v0, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {v0}, Lz9/n;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {v0, v1}, Lz9/n;->f(C)V

    :cond_0
    iget-object v0, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {v0}, Lz9/n;->c()V

    invoke-virtual {p0}, Lz9/Z;->z()Ly9/b;

    move-result-object v0

    invoke-static {p1, v0, p2}, Lz9/I;->h(Lv9/f;Ly9/b;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz9/Z;->E(Ljava/lang/String;)V

    iget-object p1, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {p1, v3}, Lz9/n;->f(C)V

    iget-object p1, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {p1}, Lz9/n;->p()V

    goto :goto_3

    :cond_1
    if-nez p2, :cond_2

    iput-boolean v2, p0, Lz9/Z;->g:Z

    :cond_2
    if-ne p2, v2, :cond_8

    iget-object p1, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {p1, v1}, Lz9/n;->f(C)V

    :goto_0
    iget-object p1, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {p1}, Lz9/n;->p()V

    :goto_1
    iput-boolean v4, p0, Lz9/Z;->g:Z

    goto :goto_3

    :cond_3
    iget-object p1, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {p1}, Lz9/n;->a()Z

    move-result p1

    if-nez p1, :cond_5

    rem-int/2addr p2, v5

    iget-object p1, p0, Lz9/Z;->a:Lz9/n;

    if-nez p2, :cond_4

    invoke-virtual {p1, v1}, Lz9/n;->f(C)V

    iget-object p1, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {p1}, Lz9/n;->c()V

    move v4, v2

    goto :goto_1

    :cond_4
    invoke-virtual {p1, v3}, Lz9/n;->f(C)V

    goto :goto_0

    :cond_5
    iput-boolean v2, p0, Lz9/Z;->g:Z

    :cond_6
    :goto_2
    iget-object p1, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {p1}, Lz9/n;->c()V

    goto :goto_3

    :cond_7
    iget-object p1, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {p1}, Lz9/n;->a()Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {p1, v1}, Lz9/n;->f(C)V

    goto :goto_2

    :cond_8
    :goto_3
    return v2
.end method

.method public a(Lv9/f;)Lw9/f;
    .locals 4

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lz9/Z;->z()Ly9/b;

    move-result-object v0

    invoke-static {v0, p1}, Lz9/j0;->b(Ly9/b;Lv9/f;)Lz9/i0;

    move-result-object v0

    iget-char v1, v0, Lz9/i0;->C:C

    if-eqz v1, :cond_0

    iget-object v2, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {v2, v1}, Lz9/n;->f(C)V

    iget-object v1, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {v1}, Lz9/n;->b()V

    :cond_0
    iget-object v1, p0, Lz9/Z;->h:Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v2, p0, Lz9/Z;->i:Ljava/lang/String;

    if-nez v2, :cond_1

    invoke-interface {p1}, Lv9/f;->a()Ljava/lang/String;

    move-result-object v2

    :cond_1
    invoke-direct {p0, v1, v2}, Lz9/Z;->I(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lz9/Z;->h:Ljava/lang/String;

    iput-object p1, p0, Lz9/Z;->i:Ljava/lang/String;

    :cond_2
    iget-object p1, p0, Lz9/Z;->c:Lz9/i0;

    if-ne p1, v0, :cond_3

    return-object p0

    :cond_3
    iget-object p1, p0, Lz9/Z;->d:[Ly9/s;

    if-eqz p1, :cond_4

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget-object p1, p1, v1

    if-eqz p1, :cond_4

    goto :goto_0

    :cond_4
    new-instance p1, Lz9/Z;

    iget-object v1, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {p0}, Lz9/Z;->z()Ly9/b;

    move-result-object v2

    iget-object v3, p0, Lz9/Z;->d:[Ly9/s;

    invoke-direct {p1, v1, v2, v0, v3}, Lz9/Z;-><init>(Lz9/n;Ly9/b;Lz9/i0;[Ly9/s;)V

    :goto_0
    return-object p1
.end method

.method public b(Lv9/f;)V
    .locals 1

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lz9/Z;->c:Lz9/i0;

    iget-char p1, p1, Lz9/i0;->D:C

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {p1}, Lz9/n;->q()V

    iget-object p1, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {p1}, Lz9/n;->d()V

    iget-object p1, p0, Lz9/Z;->a:Lz9/n;

    iget-object v0, p0, Lz9/Z;->c:Lz9/i0;

    iget-char v0, v0, Lz9/i0;->D:C

    invoke-virtual {p1, v0}, Lz9/n;->f(C)V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lz9/Z;->a:Lz9/n;

    const-string v1, "null"

    invoke-virtual {v0, v1}, Lz9/n;->k(Ljava/lang/String;)V

    return-void
.end method

.method public g(D)V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lz9/Z;->g:Z

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lz9/Z;->E(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {v0, p1, p2}, Lz9/n;->g(D)V

    :goto_0
    iget-object v0, p0, Lz9/Z;->f:Ly9/g;

    invoke-virtual {v0}, Ly9/g;->b()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1, p2}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iget-object p2, p0, Lz9/Z;->a:Lz9/n;

    iget-object p2, p2, Lz9/n;->a:Lz9/A;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lz9/G;->b(Ljava/lang/Number;Ljava/lang/String;)Lz9/E;

    move-result-object p1

    throw p1

    :cond_2
    :goto_1
    return-void
.end method

.method public h(S)V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lz9/Z;->g:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz9/Z;->E(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {v0, p1}, Lz9/n;->l(S)V

    :goto_0
    return-void
.end method

.method public i(Lv9/f;I)V
    .locals 1

    const-string v0, "enumDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lv9/f;->f(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz9/Z;->E(Ljava/lang/String;)V

    return-void
.end method

.method public j(B)V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lz9/Z;->g:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz9/Z;->E(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {v0, p1}, Lz9/n;->e(B)V

    :goto_0
    return-void
.end method

.method public l(Z)V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lz9/Z;->g:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz9/Z;->E(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {v0, p1}, Lz9/n;->m(Z)V

    :goto_0
    return-void
.end method

.method public n(F)V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lz9/Z;->g:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lz9/Z;->E(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz9/Z;->a:Lz9/n;

    invoke-virtual {v0, p1}, Lz9/n;->h(F)V

    :goto_0
    iget-object v0, p0, Lz9/Z;->f:Ly9/g;

    invoke-virtual {v0}, Ly9/g;->b()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iget-object v0, p0, Lz9/Z;->a:Lz9/n;

    iget-object v0, v0, Lz9/n;->a:Lz9/A;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lz9/G;->b(Ljava/lang/Number;Ljava/lang/String;)Lz9/E;

    move-result-object p1

    throw p1

    :cond_2
    :goto_1
    return-void
.end method

.method public o(Lv9/f;I)Z
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lz9/Z;->f:Ly9/g;

    invoke-virtual {p1}, Ly9/g;->i()Z

    move-result p1

    return p1
.end method

.method public p(C)V
    .locals 0

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz9/Z;->E(Ljava/lang/String;)V

    return-void
.end method

.method public t(Lt9/e;Ljava/lang/Object;)V
    .locals 2

    .prologue
    const-string v0, "serializer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ly9/s;->z()Ly9/b;

    move-result-object v0

    invoke-virtual {v0}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    invoke-interface {p1, p0, p2}, Lt9/e;->e(Lw9/j;Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    invoke-interface {p0}, Ly9/s;->z()Ly9/b;

    move-result-object v0

    invoke-virtual {v0}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->f()Ly9/a;

    move-result-object v0

    sget-object v1, Lz9/X$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    invoke-interface {p1}, Lt9/e;->a()Lv9/f;

    move-result-object v0

    invoke-interface {v0}, Lv9/f;->j()Lv9/m;

    move-result-object v0

    sget-object v1, Lv9/n$a;->a:Lv9/n$a;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Lv9/n$d;->a:Lv9/n$d;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_2
    invoke-interface {p1}, Lt9/e;->a()Lv9/f;

    move-result-object v0

    invoke-interface {p0}, Ly9/s;->z()Ly9/b;

    move-result-object v1

    invoke-static {v0, v1}, Lz9/X;->a(Lv9/f;Ly9/b;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_0

    invoke-interface {p1}, Lt9/e;->a()Lv9/f;

    move-result-object v1

    invoke-interface {v1}, Lv9/f;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v0, p0, Lz9/Z;->h:Ljava/lang/String;

    iput-object v1, p0, Lz9/Z;->i:Ljava/lang/String;

    goto :goto_0

    :goto_2
    return-void
.end method

.method public w(Lv9/f;)Lw9/j;
    .locals 4

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lz9/a0;->b(Lv9/f;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lz9/Z;->a:Lz9/n;

    instance-of v0, p1, Lz9/v;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lz9/n;->a:Lz9/A;

    iget-boolean v0, p0, Lz9/Z;->g:Z

    new-instance v2, Lz9/v;

    invoke-direct {v2, p1, v0}, Lz9/v;-><init>(Lz9/A;Z)V

    move-object p1, v2

    :goto_0
    invoke-virtual {p0}, Lz9/Z;->z()Ly9/b;

    move-result-object v0

    iget-object v2, p0, Lz9/Z;->c:Lz9/i0;

    new-instance v3, Lz9/Z;

    invoke-direct {v3, p1, v0, v2, v1}, Lz9/Z;-><init>(Lz9/n;Ly9/b;Lz9/i0;[Ly9/s;)V

    goto :goto_2

    :cond_1
    invoke-static {p1}, Lz9/a0;->a(Lv9/f;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p1, p0, Lz9/Z;->a:Lz9/n;

    instance-of v0, p1, Lz9/o;

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object p1, p1, Lz9/n;->a:Lz9/A;

    iget-boolean v0, p0, Lz9/Z;->g:Z

    new-instance v2, Lz9/o;

    invoke-direct {v2, p1, v0}, Lz9/o;-><init>(Lz9/A;Z)V

    move-object p1, v2

    :goto_1
    invoke-virtual {p0}, Lz9/Z;->z()Ly9/b;

    move-result-object v0

    iget-object v2, p0, Lz9/Z;->c:Lz9/i0;

    new-instance v3, Lz9/Z;

    invoke-direct {v3, p1, v0, v2, v1}, Lz9/Z;-><init>(Lz9/n;Ly9/b;Lz9/i0;[Ly9/s;)V

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lz9/Z;->h:Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-interface {p1}, Lv9/f;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lz9/Z;->i:Ljava/lang/String;

    move-object v3, p0

    goto :goto_2

    :cond_4
    invoke-super {p0, p1}, Lw9/b;->w(Lv9/f;)Lw9/j;

    move-result-object v3

    :goto_2
    return-object v3
.end method

.method public x(Lv9/f;ILt9/e;Ljava/lang/Object;)V
    .locals 1

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p4, :cond_0

    iget-object v0, p0, Lz9/Z;->f:Ly9/g;

    invoke-virtual {v0}, Ly9/g;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Lw9/b;->x(Lv9/f;ILt9/e;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public z()Ly9/b;
    .locals 1

    iget-object v0, p0, Lz9/Z;->b:Ly9/b;

    return-object v0
.end method
