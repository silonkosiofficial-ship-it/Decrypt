.class Lz9/P;
.super Lz9/c;
.source "SourceFile"


# instance fields
.field private final h:Ly9/D;

.field private final i:Lv9/f;

.field private j:I

.field private k:Z


# direct methods
.method public constructor <init>(Ly9/b;Ly9/D;Ljava/lang/String;Lv9/f;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lz9/c;-><init>(Ly9/b;Ly9/i;Ljava/lang/String;Ly7/k;)V

    iput-object p2, p0, Lz9/P;->h:Ly9/D;

    iput-object p4, p0, Lz9/P;->i:Lv9/f;

    return-void
.end method

.method public synthetic constructor <init>(Ly9/b;Ly9/D;Ljava/lang/String;Lv9/f;ILy7/k;)V
    .locals 1

    .prologue
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move-object p4, v0

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lz9/P;-><init>(Ly9/b;Ly9/D;Ljava/lang/String;Lv9/f;)V

    return-void
.end method

.method private final B0(Lv9/f;I)Z
    .locals 1

    .prologue
    invoke-virtual {p0}, Lz9/c;->w0()Ly9/b;

    move-result-object v0

    invoke-virtual {v0}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->j()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, Lv9/f;->i(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, Lv9/f;->h(I)Lv9/f;

    move-result-object p1

    invoke-interface {p1}, Lv9/f;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lz9/P;->k:Z

    return p1
.end method

.method private final C0(Lv9/f;ILjava/lang/String;)Z
    .locals 5

    .prologue
    invoke-virtual {p0}, Lz9/c;->w0()Ly9/b;

    move-result-object v0

    invoke-interface {p1, p2}, Lv9/f;->i(I)Z

    move-result v1

    invoke-interface {p1, p2}, Lv9/f;->h(I)Lv9/f;

    move-result-object p1

    const/4 p2, 0x1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Lv9/f;->c()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0, p3}, Lz9/P;->j0(Ljava/lang/String;)Ly9/i;

    move-result-object v2

    instance-of v2, v2, Ly9/A;

    if-eqz v2, :cond_0

    goto :goto_3

    :cond_0
    invoke-interface {p1}, Lv9/f;->j()Lv9/m;

    move-result-object v2

    sget-object v3, Lv9/m$b;->a:Lv9/m$b;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {p1}, Lv9/f;->c()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, p3}, Lz9/P;->j0(Ljava/lang/String;)Ly9/i;

    move-result-object v2

    instance-of v2, v2, Ly9/A;

    if-eqz v2, :cond_2

    :cond_1
    :goto_0
    move p2, v3

    goto :goto_3

    :cond_2
    invoke-virtual {p0, p3}, Lz9/P;->j0(Ljava/lang/String;)Ly9/i;

    move-result-object p3

    instance-of v2, p3, Ly9/F;

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    check-cast p3, Ly9/F;

    goto :goto_1

    :cond_3
    move-object p3, v4

    :goto_1
    if-eqz p3, :cond_4

    invoke-static {p3}, Ly9/j;->e(Ly9/F;)Ljava/lang/String;

    move-result-object v4

    :cond_4
    if-nez v4, :cond_5

    goto :goto_0

    :cond_5
    invoke-static {p1, v0, v4}, Lz9/I;->i(Lv9/f;Ly9/b;Ljava/lang/String;)I

    move-result p3

    invoke-virtual {v0}, Ly9/b;->e()Ly9/g;

    move-result-object v0

    invoke-virtual {v0}, Ly9/g;->j()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-interface {p1}, Lv9/f;->c()Z

    move-result p1

    if-eqz p1, :cond_6

    move p1, p2

    goto :goto_2

    :cond_6
    move p1, v3

    :goto_2
    const/4 v0, -0x3

    if-ne p3, v0, :cond_1

    if-nez v1, :cond_7

    if-eqz p1, :cond_1

    :cond_7
    :goto_3
    return p2
.end method


# virtual methods
.method public D0()Ly9/D;
    .locals 1

    iget-object v0, p0, Lz9/P;->h:Ly9/D;

    return-object v0
.end method

.method public a(Lv9/f;)Lw9/d;
    .locals 4

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz9/P;->i:Lv9/f;

    if-ne p1, v0, :cond_1

    new-instance p1, Lz9/P;

    invoke-virtual {p0}, Lz9/c;->w0()Ly9/b;

    move-result-object v0

    invoke-virtual {p0}, Lz9/c;->k0()Ly9/i;

    move-result-object v1

    iget-object v2, p0, Lz9/P;->i:Lv9/f;

    invoke-interface {v2}, Lv9/f;->a()Ljava/lang/String;

    move-result-object v2

    instance-of v3, v1, Ly9/D;

    if-eqz v3, :cond_0

    check-cast v1, Ly9/D;

    invoke-virtual {p0}, Lz9/c;->x0()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lz9/P;->i:Lv9/f;

    invoke-direct {p1, v0, v1, v2, v3}, Lz9/P;-><init>(Ly9/b;Ly9/D;Ljava/lang/String;Lv9/f;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Expected "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v0, Ly9/D;

    invoke-static {v0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v0

    invoke-interface {v0}, LF7/c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", but had "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v0

    invoke-interface {v0}, LF7/c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " as the serialized body of "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " at element: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lz9/c;->i0(Lz9/c;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    invoke-static {v1, p1, v0}, Lz9/G;->f(ILjava/lang/String;Ljava/lang/CharSequence;)Lz9/C;

    move-result-object p1

    throw p1

    :cond_1
    invoke-super {p0, p1}, Lz9/c;->a(Lv9/f;)Lw9/d;

    move-result-object p1

    return-object p1
.end method

.method public b(Lv9/f;)V
    .locals 4

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lz9/c;->w0()Ly9/b;

    move-result-object v0

    invoke-static {p1, v0}, Lz9/I;->m(Lv9/f;Ly9/b;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-interface {p1}, Lv9/f;->j()Lv9/m;

    move-result-object v0

    instance-of v0, v0, Lv9/c;

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p0}, Lz9/c;->w0()Ly9/b;

    move-result-object v0

    invoke-static {p1, v0}, Lz9/I;->n(Lv9/f;Ly9/b;)Ly9/z;

    iget-object v0, p0, Lz9/c;->g:Ly9/g;

    invoke-virtual {v0}, Ly9/g;->o()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-static {p1}, Lx9/K;->a(Lv9/f;)Ljava/util/Set;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lx9/K;->a(Lv9/f;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, Lz9/c;->w0()Ly9/b;

    move-result-object v2

    invoke-static {v2}, Ly9/H;->a(Ly9/b;)Lz9/z;

    move-result-object v2

    invoke-static {}, Lz9/I;->g()Lz9/z$a;

    move-result-object v3

    invoke-virtual {v2, p1, v3}, Lz9/z;->a(Lv9/f;Lz9/z$a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    goto :goto_0

    :cond_2
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_3

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p1

    :cond_3
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v0, p1}, Lj7/Z;->j(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    :goto_1
    invoke-virtual {p0}, Lz9/P;->D0()Ly9/D;

    move-result-object v0

    invoke-virtual {v0}, Ly9/D;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {p0}, Lz9/c;->x0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_2

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Encountered an unknown key \'"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' at element: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lx9/U;->g0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\nUse \'ignoreUnknownKeys = true\' in \'Json {}\' builder or \'@JsonIgnoreUnknownKeys\' annotation to ignore unknown keys.\nJSON input: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lz9/P;->D0()Ly9/D;

    move-result-object v0

    invoke-virtual {v0}, Ly9/D;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1}, Lz9/G;->j(Ljava/lang/CharSequence;IILjava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, -0x1

    invoke-static {v0, p1}, Lz9/G;->e(ILjava/lang/String;)Lz9/C;

    move-result-object p1

    throw p1

    :cond_6
    :goto_3
    return-void
.end method

.method protected d0(Lv9/f;I)Ljava/lang/String;
    .locals 4

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lz9/c;->w0()Ly9/b;

    move-result-object v0

    invoke-static {p1, v0}, Lz9/I;->n(Lv9/f;Ly9/b;)Ly9/z;

    invoke-interface {p1, p2}, Lv9/f;->f(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lz9/c;->g:Ly9/g;

    invoke-virtual {v1}, Ly9/g;->o()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lz9/P;->D0()Ly9/D;

    move-result-object v1

    invoke-virtual {v1}, Ly9/D;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p0}, Lz9/c;->w0()Ly9/b;

    move-result-object v1

    invoke-static {v1, p1}, Lz9/I;->e(Ly9/b;Lv9/f;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0}, Lz9/P;->D0()Ly9/D;

    move-result-object v1

    invoke-virtual {v1}, Ly9/D;->keySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v3, p2, :cond_2

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    :goto_1
    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_5

    return-object v2

    :cond_5
    return-object v0
.end method

.method protected j0(Ljava/lang/String;)Ly9/i;
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lz9/P;->D0()Ly9/D;

    move-result-object v0

    invoke-static {v0, p1}, Lj7/S;->i(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly9/i;

    return-object p1
.end method

.method public r(Lv9/f;)I
    .locals 3

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    iget v0, p0, Lz9/P;->j:I

    invoke-interface {p1}, Lv9/f;->e()I

    move-result v1

    if-ge v0, v1, :cond_3

    iget v0, p0, Lz9/P;->j:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lz9/P;->j:I

    invoke-virtual {p0, p1, v0}, Lx9/U;->e0(Lv9/f;I)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lz9/P;->j:I

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    iput-boolean v2, p0, Lz9/P;->k:Z

    invoke-virtual {p0}, Lz9/P;->D0()Ly9/D;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-direct {p0, p1, v1}, Lz9/P;->B0(Lv9/f;I)Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_1
    iget-object v2, p0, Lz9/c;->g:Ly9/g;

    invoke-virtual {v2}, Ly9/g;->g()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-direct {p0, p1, v1, v0}, Lz9/P;->C0(Lv9/f;ILjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    :cond_2
    return v1

    :cond_3
    const/4 p1, -0x1

    return p1
.end method

.method public s()Z
    .locals 1

    .prologue
    iget-boolean v0, p0, Lz9/P;->k:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Lz9/c;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic y0()Ly9/i;
    .locals 1

    invoke-virtual {p0}, Lz9/P;->D0()Ly9/D;

    move-result-object v0

    return-object v0
.end method
