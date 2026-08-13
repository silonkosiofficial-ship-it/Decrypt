.class public final Lx9/F;
.super Lx9/k0;
.source "SourceFile"


# instance fields
.field private final m:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lx9/E;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "generatedSerializer"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lx9/k0;-><init>(Ljava/lang/String;Lx9/E;I)V

    iput-boolean v0, p0, Lx9/F;->m:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    goto/16 :goto_2

    :cond_0
    instance-of v1, p1, Lx9/F;

    const/4 v2, 0x0

    if-nez v1, :cond_2

    :cond_1
    :goto_0
    move v0, v2

    goto/16 :goto_2

    :cond_2
    invoke-interface {p0}, Lv9/f;->a()Ljava/lang/String;

    move-result-object v1

    move-object v3, p1

    check-cast v3, Lv9/f;

    invoke-interface {v3}, Lv9/f;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    check-cast p1, Lx9/F;

    invoke-virtual {p1}, Lx9/F;->m()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lx9/k0;->w()[Lv9/f;

    move-result-object v1

    invoke-virtual {p1}, Lx9/k0;->w()[Lv9/f;

    move-result-object p1

    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p0}, Lv9/f;->e()I

    move-result p1

    invoke-interface {v3}, Lv9/f;->e()I

    move-result v1

    if-eq p1, v1, :cond_4

    goto :goto_0

    :cond_4
    invoke-interface {p0}, Lv9/f;->e()I

    move-result p1

    move v1, v2

    :goto_1
    if-ge v1, p1, :cond_7

    invoke-interface {p0, v1}, Lv9/f;->h(I)Lv9/f;

    move-result-object v4

    invoke-interface {v4}, Lv9/f;->a()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v1}, Lv9/f;->h(I)Lv9/f;

    move-result-object v5

    invoke-interface {v5}, Lv9/f;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_0

    :cond_5
    invoke-interface {p0, v1}, Lv9/f;->h(I)Lv9/f;

    move-result-object v4

    invoke-interface {v4}, Lv9/f;->j()Lv9/m;

    move-result-object v4

    invoke-interface {v3, v1}, Lv9/f;->h(I)Lv9/f;

    move-result-object v5

    invoke-interface {v5}, Lv9/f;->j()Lv9/m;

    move-result-object v5

    invoke-static {v4, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_0

    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_7
    :goto_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, Lx9/k0;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    return v0
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, Lx9/F;->m:Z

    return v0
.end method
