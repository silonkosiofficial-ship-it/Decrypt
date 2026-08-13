.class abstract Lz9/c;
.super Lx9/U;
.source "SourceFile"

# interfaces
.implements Ly9/h;


# instance fields
.field private final d:Ly9/b;

.field private final e:Ly9/i;

.field private final f:Ljava/lang/String;

.field protected final g:Ly9/g;


# direct methods
.method private constructor <init>(Ly9/b;Ly9/i;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lx9/U;-><init>()V

    iput-object p1, p0, Lz9/c;->d:Ly9/b;

    iput-object p2, p0, Lz9/c;->e:Ly9/i;

    iput-object p3, p0, Lz9/c;->f:Ljava/lang/String;

    invoke-virtual {p0}, Lz9/c;->w0()Ly9/b;

    move-result-object p1

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object p1

    iput-object p1, p0, Lz9/c;->g:Ly9/g;

    return-void
.end method

.method public synthetic constructor <init>(Ly9/b;Ly9/i;Ljava/lang/String;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    const/4 p5, 0x0

    if-eqz p4, :cond_0

    move-object p3, p5

    :cond_0
    invoke-direct {p0, p1, p2, p3, p5}, Lz9/c;-><init>(Ly9/b;Ly9/i;Ljava/lang/String;Ly7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(Ly9/b;Ly9/i;Ljava/lang/String;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lz9/c;-><init>(Ly9/b;Ly9/i;Ljava/lang/String;)V

    return-void
.end method

.method private final A0(Ly9/F;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;
    .locals 4

    .prologue
    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, "i"

    const/4 v3, 0x0

    invoke-static {p2, v2, v3, v0, v1}, LS8/r;->V(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "an "

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "a "

    goto :goto_0

    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to parse literal \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' as "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " value at element: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Lz9/c;->z0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lz9/c;->k0()Ly9/i;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 p3, -0x1

    invoke-static {p3, p1, p2}, Lz9/G;->f(ILjava/lang/String;Ljava/lang/CharSequence;)Lz9/C;

    move-result-object p1

    throw p1
.end method

.method public static final synthetic h0(Lz9/c;Ljava/lang/String;)Ly9/i;
    .locals 0

    invoke-virtual {p0, p1}, Lz9/c;->j0(Ljava/lang/String;)Ly9/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i0(Lz9/c;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lx9/U;->g0()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic L(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lz9/c;->l0(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic M(Ljava/lang/Object;)B
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lz9/c;->m0(Ljava/lang/String;)B

    move-result p1

    return p1
.end method

.method public bridge synthetic N(Ljava/lang/Object;)C
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lz9/c;->n0(Ljava/lang/String;)C

    move-result p1

    return p1
.end method

.method public bridge synthetic O(Ljava/lang/Object;)D
    .locals 2

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lz9/c;->o0(Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic P(Ljava/lang/Object;Lv9/f;)I
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lz9/c;->p0(Ljava/lang/String;Lv9/f;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic Q(Ljava/lang/Object;)F
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lz9/c;->q0(Ljava/lang/String;)F

    move-result p1

    return p1
.end method

.method public bridge synthetic R(Ljava/lang/Object;Lv9/f;)Lw9/h;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lz9/c;->r0(Ljava/lang/String;Lv9/f;)Lw9/h;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic S(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lz9/c;->s0(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic T(Ljava/lang/Object;)J
    .locals 2

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lz9/c;->t0(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic U(Ljava/lang/Object;)S
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lz9/c;->u0(Ljava/lang/String;)S

    move-result p1

    return p1
.end method

.method public bridge synthetic V(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lz9/c;->v0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public a(Lv9/f;)Lw9/d;
    .locals 12

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lz9/c;->k0()Ly9/i;

    move-result-object v0

    invoke-interface {p1}, Lv9/f;->j()Lv9/m;

    move-result-object v1

    sget-object v2, Lv9/n$b;->a:Lv9/n$b;

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-class v3, Ly9/c;

    const-string v4, " at element: "

    const-string v5, " as the serialized body of "

    const-string v6, ", but had "

    const-string v7, "Expected "

    const/4 v8, -0x1

    if-nez v2, :cond_8

    instance-of v2, v1, Lv9/c;

    if-eqz v2, :cond_0

    goto/16 :goto_1

    :cond_0
    sget-object v2, Lv9/n$c;->a:Lv9/n$c;

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-class v2, Ly9/D;

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Lz9/c;->w0()Ly9/b;

    move-result-object v1

    const/4 v9, 0x0

    invoke-interface {p1, v9}, Lv9/f;->h(I)Lv9/f;

    move-result-object v9

    invoke-virtual {v1}, Ly9/b;->f()LA9/b;

    move-result-object v10

    invoke-static {v9, v10}, Lz9/j0;->a(Lv9/f;LA9/b;)Lv9/f;

    move-result-object v9

    invoke-interface {v9}, Lv9/f;->j()Lv9/m;

    move-result-object v10

    instance-of v11, v10, Lv9/d;

    if-nez v11, :cond_4

    sget-object v11, Lv9/m$b;->a:Lv9/m$b;

    invoke-static {v10, v11}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ly9/b;->e()Ly9/g;

    move-result-object v1

    invoke-virtual {v1}, Ly9/g;->c()Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Lz9/S;

    invoke-virtual {p0}, Lz9/c;->w0()Ly9/b;

    move-result-object v2

    invoke-interface {p1}, Lv9/f;->a()Ljava/lang/String;

    move-result-object p1

    instance-of v9, v0, Ly9/c;

    if-eqz v9, :cond_2

    check-cast v0, Ly9/c;

    invoke-direct {v1, v2, v0}, Lz9/S;-><init>(Ly9/b;Ly9/c;)V

    goto/16 :goto_2

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    invoke-interface {v2}, LF7/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    invoke-interface {v2}, LF7/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lz9/c;->i0(Lz9/c;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, p1, v0}, Lz9/G;->f(ILjava/lang/String;Ljava/lang/CharSequence;)Lz9/C;

    move-result-object p1

    throw p1

    :cond_3
    invoke-static {v9}, Lz9/G;->d(Lv9/f;)Lz9/E;

    move-result-object p1

    throw p1

    :cond_4
    :goto_0
    new-instance v1, Lz9/U;

    invoke-virtual {p0}, Lz9/c;->w0()Ly9/b;

    move-result-object v3

    invoke-interface {p1}, Lv9/f;->a()Ljava/lang/String;

    move-result-object p1

    instance-of v9, v0, Ly9/D;

    if-eqz v9, :cond_5

    check-cast v0, Ly9/D;

    invoke-direct {v1, v3, v0}, Lz9/U;-><init>(Ly9/b;Ly9/D;)V

    goto/16 :goto_2

    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    invoke-interface {v2}, LF7/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    invoke-interface {v2}, LF7/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lz9/c;->i0(Lz9/c;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, p1, v0}, Lz9/G;->f(ILjava/lang/String;Ljava/lang/CharSequence;)Lz9/C;

    move-result-object p1

    throw p1

    :cond_6
    new-instance v9, Lz9/P;

    invoke-virtual {p0}, Lz9/c;->w0()Ly9/b;

    move-result-object v1

    invoke-interface {p1}, Lv9/f;->a()Ljava/lang/String;

    move-result-object p1

    instance-of v3, v0, Ly9/D;

    if-eqz v3, :cond_7

    move-object v2, v0

    check-cast v2, Ly9/D;

    iget-object v3, p0, Lz9/c;->f:Ljava/lang/String;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v6}, Lz9/P;-><init>(Ly9/b;Ly9/D;Ljava/lang/String;Lv9/f;ILy7/k;)V

    move-object v1, v9

    goto :goto_2

    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    invoke-interface {v2}, LF7/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    invoke-interface {v2}, LF7/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lz9/c;->i0(Lz9/c;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, p1, v0}, Lz9/G;->f(ILjava/lang/String;Ljava/lang/CharSequence;)Lz9/C;

    move-result-object p1

    throw p1

    :cond_8
    :goto_1
    new-instance v1, Lz9/S;

    invoke-virtual {p0}, Lz9/c;->w0()Ly9/b;

    move-result-object v2

    invoke-interface {p1}, Lv9/f;->a()Ljava/lang/String;

    move-result-object p1

    instance-of v9, v0, Ly9/c;

    if-eqz v9, :cond_9

    check-cast v0, Ly9/c;

    invoke-direct {v1, v2, v0}, Lz9/S;-><init>(Ly9/b;Ly9/c;)V

    :goto_2
    return-object v1

    :cond_9
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    invoke-interface {v2}, LF7/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    invoke-interface {v2}, LF7/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lz9/c;->i0(Lz9/c;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, p1, v0}, Lz9/G;->f(ILjava/lang/String;Ljava/lang/CharSequence;)Lz9/C;

    move-result-object p1

    throw p1
.end method

.method public b(Lv9/f;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected c0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "parentName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "childName"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p2
.end method

.method protected abstract j0(Ljava/lang/String;)Ly9/i;
.end method

.method protected final k0()Ly9/i;
    .locals 1

    .prologue
    invoke-virtual {p0}, Lx9/B0;->W()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lz9/c;->j0(Ljava/lang/String;)Ly9/i;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lz9/c;->y0()Ly9/i;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public l()Ly9/i;
    .locals 1

    invoke-virtual {p0}, Lz9/c;->k0()Ly9/i;

    move-result-object v0

    return-object v0
.end method

.method protected l0(Ljava/lang/String;)Z
    .locals 4

    .prologue
    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lz9/c;->j0(Ljava/lang/String;)Ly9/i;

    move-result-object v0

    instance-of v1, v0, Ly9/F;

    const-string v2, "boolean"

    if-eqz v1, :cond_1

    check-cast v0, Ly9/F;

    :try_start_0
    invoke-static {v0}, Ly9/j;->d(Ly9/F;)Ljava/lang/Boolean;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :cond_0
    :try_start_1
    invoke-direct {p0, v0, v2, p1}, Lz9/c;->A0(Ly9/F;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    new-instance v1, Li7/k;

    invoke-direct {v1}, Li7/k;-><init>()V

    throw v1
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    invoke-direct {p0, v0, v2, p1}, Lz9/c;->A0(Ly9/F;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v3, Ly9/F;

    invoke-static {v3}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v3

    invoke-interface {v3}, LF7/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", but had "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v3

    invoke-interface {v3}, LF7/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " as the serialized body of "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " at element: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lz9/c;->z0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    invoke-static {v1, p1, v0}, Lz9/G;->f(ILjava/lang/String;Ljava/lang/CharSequence;)Lz9/C;

    move-result-object p1

    throw p1
.end method

.method protected m0(Ljava/lang/String;)B
    .locals 7

    .prologue
    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lz9/c;->j0(Ljava/lang/String;)Ly9/i;

    move-result-object v0

    instance-of v1, v0, Ly9/F;

    const-string v2, "byte"

    if-eqz v1, :cond_2

    check-cast v0, Ly9/F;

    :try_start_0
    invoke-static {v0}, Ly9/j;->i(Ly9/F;)J

    move-result-wide v3

    const-wide/16 v5, -0x80

    cmp-long v1, v5, v3

    if-gtz v1, :cond_0

    const-wide/16 v5, 0x7f

    cmp-long v1, v3, v5

    if-gtz v1, :cond_0

    long-to-int v1, v3

    int-to-byte v1, v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    return p1

    :cond_1
    :try_start_1
    invoke-direct {p0, v0, v2, p1}, Lz9/c;->A0(Ly9/F;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    new-instance v1, Li7/k;

    invoke-direct {v1}, Li7/k;-><init>()V

    throw v1
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    invoke-direct {p0, v0, v2, p1}, Lz9/c;->A0(Ly9/F;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v3, Ly9/F;

    invoke-static {v3}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v3

    invoke-interface {v3}, LF7/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", but had "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v3

    invoke-interface {v3}, LF7/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " as the serialized body of "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " at element: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lz9/c;->z0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    invoke-static {v1, p1, v0}, Lz9/G;->f(ILjava/lang/String;Ljava/lang/CharSequence;)Lz9/C;

    move-result-object p1

    throw p1
.end method

.method protected n0(Ljava/lang/String;)C
    .locals 4

    .prologue
    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lz9/c;->j0(Ljava/lang/String;)Ly9/i;

    move-result-object v0

    instance-of v1, v0, Ly9/F;

    const-string v2, "char"

    if-eqz v1, :cond_0

    check-cast v0, Ly9/F;

    :try_start_0
    invoke-virtual {v0}, Ly9/F;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LS8/r;->A1(Ljava/lang/CharSequence;)C

    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    invoke-direct {p0, v0, v2, p1}, Lz9/c;->A0(Ly9/F;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v3, Ly9/F;

    invoke-static {v3}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v3

    invoke-interface {v3}, LF7/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", but had "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v3

    invoke-interface {v3}, LF7/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " as the serialized body of "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " at element: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lz9/c;->z0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    invoke-static {v1, p1, v0}, Lz9/G;->f(ILjava/lang/String;Ljava/lang/CharSequence;)Lz9/C;

    move-result-object p1

    throw p1
.end method

.method protected o0(Ljava/lang/String;)D
    .locals 4

    .prologue
    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lz9/c;->j0(Ljava/lang/String;)Ly9/i;

    move-result-object v0

    instance-of v1, v0, Ly9/F;

    const-string v2, "double"

    if-eqz v1, :cond_2

    check-cast v0, Ly9/F;

    :try_start_0
    invoke-static {v0}, Ly9/j;->f(Ly9/F;)D

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0}, Lz9/c;->w0()Ly9/b;

    move-result-object v2

    invoke-virtual {v2}, Ly9/b;->e()Ly9/g;

    move-result-object v2

    invoke-virtual {v2}, Ly9/g;->b()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p0}, Lz9/c;->k0()Ly9/i;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lz9/G;->a(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;)Lz9/C;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    return-wide v0

    :catch_0
    invoke-direct {p0, v0, v2, p1}, Lz9/c;->A0(Ly9/F;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v3, Ly9/F;

    invoke-static {v3}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v3

    invoke-interface {v3}, LF7/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", but had "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v3

    invoke-interface {v3}, LF7/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " as the serialized body of "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " at element: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lz9/c;->z0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    invoke-static {v1, p1, v0}, Lz9/G;->f(ILjava/lang/String;Ljava/lang/CharSequence;)Lz9/C;

    move-result-object p1

    throw p1
.end method

.method public p(Lv9/f;)Lw9/h;
    .locals 4

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx9/B0;->W()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Lx9/B0;->p(Lv9/f;)Lw9/h;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v0, Lz9/K;

    invoke-virtual {p0}, Lz9/c;->w0()Ly9/b;

    move-result-object v1

    invoke-virtual {p0}, Lz9/c;->y0()Ly9/i;

    move-result-object v2

    iget-object v3, p0, Lz9/c;->f:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Lz9/K;-><init>(Ly9/b;Ly9/i;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lz9/c;->p(Lv9/f;)Lw9/h;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method protected p0(Ljava/lang/String;Lv9/f;)I
    .locals 7

    .prologue
    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enumDescriptor"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lz9/c;->w0()Ly9/b;

    move-result-object v2

    invoke-static {p0, p1}, Lz9/c;->h0(Lz9/c;Ljava/lang/String;)Ly9/i;

    move-result-object v0

    invoke-interface {p2}, Lv9/f;->a()Ljava/lang/String;

    move-result-object v1

    instance-of v3, v0, Ly9/F;

    if-eqz v3, :cond_0

    check-cast v0, Ly9/F;

    invoke-virtual {v0}, Ly9/F;->d()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v6}, Lz9/I;->k(Lv9/f;Ly9/b;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)I

    move-result p1

    return p1

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v2, Ly9/F;

    invoke-static {v2}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    invoke-interface {v2}, LF7/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", but had "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    invoke-interface {v2}, LF7/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " as the serialized body of "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " at element: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lz9/c;->z0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v0, -0x1

    invoke-static {v0, p1, p2}, Lz9/G;->f(ILjava/lang/String;Ljava/lang/CharSequence;)Lz9/C;

    move-result-object p1

    throw p1
.end method

.method protected q0(Ljava/lang/String;)F
    .locals 4

    .prologue
    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lz9/c;->j0(Ljava/lang/String;)Ly9/i;

    move-result-object v0

    instance-of v1, v0, Ly9/F;

    const-string v2, "float"

    if-eqz v1, :cond_2

    check-cast v0, Ly9/F;

    :try_start_0
    invoke-static {v0}, Ly9/j;->g(Ly9/F;)F

    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0}, Lz9/c;->w0()Ly9/b;

    move-result-object v1

    invoke-virtual {v1}, Ly9/b;->e()Ly9/g;

    move-result-object v1

    invoke-virtual {v1}, Ly9/g;->b()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p0}, Lz9/c;->k0()Ly9/i;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lz9/G;->a(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;)Lz9/C;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    return v0

    :catch_0
    invoke-direct {p0, v0, v2, p1}, Lz9/c;->A0(Ly9/F;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v3, Ly9/F;

    invoke-static {v3}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v3

    invoke-interface {v3}, LF7/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", but had "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v3

    invoke-interface {v3}, LF7/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " as the serialized body of "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " at element: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lz9/c;->z0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    invoke-static {v1, p1, v0}, Lz9/G;->f(ILjava/lang/String;Ljava/lang/CharSequence;)Lz9/C;

    move-result-object p1

    throw p1
.end method

.method protected r0(Ljava/lang/String;Lv9/f;)Lw9/h;
    .locals 3

    .prologue
    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inlineDescriptor"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lz9/a0;->b(Lv9/f;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lz9/c;->w0()Ly9/b;

    move-result-object v0

    invoke-static {p0, p1}, Lz9/c;->h0(Lz9/c;Ljava/lang/String;)Ly9/i;

    move-result-object v1

    invoke-interface {p2}, Lv9/f;->a()Ljava/lang/String;

    move-result-object p2

    instance-of v2, v1, Ly9/F;

    if-eqz v2, :cond_0

    check-cast v1, Ly9/F;

    invoke-virtual {v1}, Ly9/F;->d()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lz9/c0;->a(Ly9/b;Ljava/lang/String;)Lz9/b0;

    move-result-object p1

    new-instance p2, Lz9/B;

    invoke-virtual {p0}, Lz9/c;->w0()Ly9/b;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Lz9/B;-><init>(Lz9/a;Ly9/b;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v2, Ly9/F;

    invoke-static {v2}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    invoke-interface {v2}, LF7/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", but had "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    invoke-interface {v2}, LF7/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " as the serialized body of "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " at element: "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lz9/c;->z0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v0, -0x1

    invoke-static {v0, p1, p2}, Lz9/G;->f(ILjava/lang/String;Ljava/lang/CharSequence;)Lz9/C;

    move-result-object p1

    throw p1

    :cond_1
    invoke-super {p0, p1, p2}, Lx9/B0;->R(Ljava/lang/Object;Lv9/f;)Lw9/h;

    move-result-object p2

    :goto_0
    return-object p2
.end method

.method public s()Z
    .locals 1

    invoke-virtual {p0}, Lz9/c;->k0()Ly9/i;

    move-result-object v0

    instance-of v0, v0, Ly9/A;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method protected s0(Ljava/lang/String;)I
    .locals 7

    .prologue
    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lz9/c;->j0(Ljava/lang/String;)Ly9/i;

    move-result-object v0

    instance-of v1, v0, Ly9/F;

    const-string v2, "int"

    if-eqz v1, :cond_2

    check-cast v0, Ly9/F;

    :try_start_0
    invoke-static {v0}, Ly9/j;->i(Ly9/F;)J

    move-result-wide v3

    const-wide/32 v5, -0x80000000

    cmp-long v1, v5, v3

    if-gtz v1, :cond_0

    const-wide/32 v5, 0x7fffffff

    cmp-long v1, v3, v5

    if-gtz v1, :cond_0

    long-to-int v1, v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1

    :cond_1
    :try_start_1
    invoke-direct {p0, v0, v2, p1}, Lz9/c;->A0(Ly9/F;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    new-instance v1, Li7/k;

    invoke-direct {v1}, Li7/k;-><init>()V

    throw v1
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    invoke-direct {p0, v0, v2, p1}, Lz9/c;->A0(Ly9/F;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v3, Ly9/F;

    invoke-static {v3}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v3

    invoke-interface {v3}, LF7/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", but had "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v3

    invoke-interface {v3}, LF7/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " as the serialized body of "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " at element: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lz9/c;->z0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    invoke-static {v1, p1, v0}, Lz9/G;->f(ILjava/lang/String;Ljava/lang/CharSequence;)Lz9/C;

    move-result-object p1

    throw p1
.end method

.method protected t0(Ljava/lang/String;)J
    .locals 4

    .prologue
    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lz9/c;->j0(Ljava/lang/String;)Ly9/i;

    move-result-object v0

    instance-of v1, v0, Ly9/F;

    const-string v2, "long"

    if-eqz v1, :cond_0

    check-cast v0, Ly9/F;

    :try_start_0
    invoke-static {v0}, Ly9/j;->i(Ly9/F;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    invoke-direct {p0, v0, v2, p1}, Lz9/c;->A0(Ly9/F;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v3, Ly9/F;

    invoke-static {v3}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v3

    invoke-interface {v3}, LF7/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", but had "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v3

    invoke-interface {v3}, LF7/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " as the serialized body of "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " at element: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lz9/c;->z0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    invoke-static {v1, p1, v0}, Lz9/G;->f(ILjava/lang/String;Ljava/lang/CharSequence;)Lz9/C;

    move-result-object p1

    throw p1
.end method

.method protected u0(Ljava/lang/String;)S
    .locals 7

    .prologue
    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lz9/c;->j0(Ljava/lang/String;)Ly9/i;

    move-result-object v0

    instance-of v1, v0, Ly9/F;

    const-string v2, "short"

    if-eqz v1, :cond_2

    check-cast v0, Ly9/F;

    :try_start_0
    invoke-static {v0}, Ly9/j;->i(Ly9/F;)J

    move-result-wide v3

    const-wide/16 v5, -0x8000

    cmp-long v1, v5, v3

    if-gtz v1, :cond_0

    const-wide/16 v5, 0x7fff

    cmp-long v1, v3, v5

    if-gtz v1, :cond_0

    long-to-int v1, v3

    int-to-short v1, v1

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Number;->shortValue()S

    move-result p1

    return p1

    :cond_1
    :try_start_1
    invoke-direct {p0, v0, v2, p1}, Lz9/c;->A0(Ly9/F;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    new-instance v1, Li7/k;

    invoke-direct {v1}, Li7/k;-><init>()V

    throw v1
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    invoke-direct {p0, v0, v2, p1}, Lz9/c;->A0(Ly9/F;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v3, Ly9/F;

    invoke-static {v3}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v3

    invoke-interface {v3}, LF7/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", but had "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v3

    invoke-interface {v3}, LF7/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " as the serialized body of "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " at element: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lz9/c;->z0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    invoke-static {v1, p1, v0}, Lz9/G;->f(ILjava/lang/String;Ljava/lang/CharSequence;)Lz9/C;

    move-result-object p1

    throw p1
.end method

.method protected v0(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lz9/c;->j0(Ljava/lang/String;)Ly9/i;

    move-result-object v0

    instance-of v1, v0, Ly9/F;

    const/4 v2, -0x1

    if-eqz v1, :cond_3

    check-cast v0, Ly9/F;

    instance-of v1, v0, Ly9/w;

    if-eqz v1, :cond_2

    check-cast v0, Ly9/w;

    invoke-virtual {v0}, Ly9/w;->f()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lz9/c;->w0()Ly9/b;

    move-result-object v1

    invoke-virtual {v1}, Ly9/b;->e()Ly9/g;

    move-result-object v1

    invoke-virtual {v1}, Ly9/g;->q()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "String literal for key \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' should be quoted at element: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lz9/c;->z0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".\nUse \'isLenient = true\' in \'Json {}\' builder to accept non-compliant JSON."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lz9/c;->k0()Ly9/i;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, p1, v0}, Lz9/G;->f(ILjava/lang/String;Ljava/lang/CharSequence;)Lz9/C;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {v0}, Ly9/w;->d()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Expected string value for a non-null key \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', got null literal instead at element: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lz9/c;->z0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lz9/c;->k0()Ly9/i;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, p1, v0}, Lz9/G;->f(ILjava/lang/String;Ljava/lang/CharSequence;)Lz9/C;

    move-result-object p1

    throw p1

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v3, Ly9/F;

    invoke-static {v3}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v3

    invoke-interface {v3}, LF7/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", but had "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v3

    invoke-interface {v3}, LF7/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " as the serialized body of "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "string"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " at element: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lz9/c;->z0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, p1, v0}, Lz9/G;->f(ILjava/lang/String;Ljava/lang/CharSequence;)Lz9/C;

    move-result-object p1

    throw p1
.end method

.method public w0()Ly9/b;
    .locals 1

    iget-object v0, p0, Lz9/c;->d:Ly9/b;

    return-object v0
.end method

.method public x(Lt9/a;)Ljava/lang/Object;
    .locals 1

    const-string v0, "deserializer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lt9/a;->b(Lw9/h;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected final x0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lz9/c;->f:Ljava/lang/String;

    return-object v0
.end method

.method public abstract y0()Ly9/i;
.end method

.method public final z0(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "currentTag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lx9/U;->g0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
