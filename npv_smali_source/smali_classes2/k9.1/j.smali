.class public final Lk9/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/s;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "string"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/j;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ll9/e;
    .locals 2

    new-instance v0, Ll9/c;

    iget-object v1, p0, Lk9/j;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Ll9/c;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public b()Lm9/q;
    .locals 8

    .prologue
    iget-object v0, p0, Lk9/j;->a:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    goto/16 :goto_a

    :cond_0
    invoke-static {}, Lj7/v;->c()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lk9/j;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Lj9/f;->b(C)Z

    move-result v1

    const-string v3, ""

    const-string v4, "substring(...)"

    if-eqz v1, :cond_5

    iget-object v1, p0, Lk9/j;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    move v6, v2

    :goto_0
    if-ge v6, v5, :cond_2

    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v7}, Lj9/f;->b(C)Z

    move-result v7

    if-nez v7, :cond_1

    invoke-virtual {v1, v2, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    new-instance v5, Lm9/b;

    invoke-direct {v5, v1}, Lm9/b;-><init>(Ljava/lang/String;)V

    invoke-static {v5}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v5, Lm9/h;

    invoke-direct {v5, v1}, Lm9/h;-><init>(Ljava/util/List;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lk9/j;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    move v6, v2

    :goto_2
    if-ge v6, v5, :cond_4

    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v7}, Lj9/f;->b(C)Z

    move-result v7

    if-nez v7, :cond_3

    invoke-virtual {v1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_4
    move-object v1, v3

    goto :goto_3

    :cond_5
    iget-object v1, p0, Lk9/j;->a:Ljava/lang/String;

    :goto_3
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-lez v5, :cond_b

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5}, Lj9/f;->b(C)Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-static {v1}, LS8/r;->j0(Ljava/lang/CharSequence;)I

    move-result v5

    :goto_4
    const/4 v6, -0x1

    if-ge v6, v5, :cond_7

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v7}, Lj9/f;->b(C)Z

    move-result v7

    if-nez v7, :cond_6

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v1, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_5

    :cond_6
    add-int/lit8 v5, v5, -0x1

    goto :goto_4

    :cond_7
    :goto_5
    new-instance v2, Lm9/r;

    invoke-direct {v2, v3}, Lm9/r;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, LS8/r;->j0(Ljava/lang/CharSequence;)I

    move-result v2

    :goto_6
    if-ge v6, v2, :cond_9

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Lj9/f;->b(C)Z

    move-result v3

    if-nez v3, :cond_8

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_7

    :cond_8
    add-int/lit8 v2, v2, -0x1

    goto :goto_6

    :cond_9
    :goto_7
    new-instance v2, Lm9/b;

    invoke-direct {v2, v1}, Lm9/b;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lm9/h;

    invoke-direct {v2, v1}, Lm9/h;-><init>(Ljava/util/List;)V

    :goto_8
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_a
    new-instance v2, Lm9/r;

    invoke-direct {v2, v1}, Lm9/r;-><init>(Ljava/lang/String;)V

    goto :goto_8

    :cond_b
    :goto_9
    invoke-static {v0}, Lj7/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    :goto_a
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v1

    new-instance v2, Lm9/q;

    invoke-direct {v2, v0, v1}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, Lk9/j;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk9/j;->a:Ljava/lang/String;

    check-cast p1, Lk9/j;

    iget-object p1, p1, Lk9/j;->a:Ljava/lang/String;

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

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lk9/j;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ConstantFormatStructure("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk9/j;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
