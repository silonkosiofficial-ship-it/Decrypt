.class public Lz9/b0;
.super Lz9/a;
.source "SourceFile"


# instance fields
.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lz9/a;-><init>()V

    iput-object p1, p0, Lz9/b0;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic B()Ljava/lang/CharSequence;
    .locals 1

    invoke-virtual {p0}, Lz9/b0;->P()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public F(I)I
    .locals 1

    .prologue
    invoke-virtual {p0}, Lz9/b0;->P()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public H()I
    .locals 4

    .prologue
    iget v0, p0, Lz9/a;->a:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lz9/b0;->P()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_2

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x20

    if-eq v2, v3, :cond_1

    const/16 v3, 0xa

    if-eq v2, v3, :cond_1

    const/16 v3, 0xd

    if-eq v2, v3, :cond_1

    const/16 v3, 0x9

    if-ne v2, v3, :cond_2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iput v0, p0, Lz9/a;->a:I

    return v0
.end method

.method protected P()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lz9/b0;->e:Ljava/lang/String;

    return-object v0
.end method

.method public f()Z
    .locals 5

    .prologue
    iget v0, p0, Lz9/a;->a:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0}, Lz9/b0;->P()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v0, v3, :cond_3

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x20

    if-eq v3, v4, :cond_2

    const/16 v4, 0xa

    if-eq v3, v4, :cond_2

    const/16 v4, 0xd

    if-eq v3, v4, :cond_2

    const/16 v4, 0x9

    if-ne v3, v4, :cond_1

    goto :goto_1

    :cond_1
    iput v0, p0, Lz9/a;->a:I

    invoke-virtual {p0, v3}, Lz9/a;->C(C)Z

    move-result v0

    return v0

    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    iput v0, p0, Lz9/a;->a:I

    return v2
.end method

.method public j()Ljava/lang/String;
    .locals 7

    .prologue
    const/16 v0, 0x22

    invoke-virtual {p0, v0}, Lz9/b0;->m(C)V

    iget v0, p0, Lz9/a;->a:I

    invoke-virtual {p0}, Lz9/b0;->P()Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v2, 0x22

    const/4 v4, 0x0

    move v3, v0

    invoke-static/range {v1 .. v6}, LS8/r;->o0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2

    invoke-virtual {p0}, Lz9/a;->s()Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lz9/b;->c(B)Ljava/lang/String;

    move-result-object v0

    iget v3, p0, Lz9/a;->a:I

    invoke-static {p0}, Lz9/a;->a(Lz9/a;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-eq v3, v1, :cond_1

    if-gez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lz9/a;->a(Lz9/a;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    :goto_0
    const-string v1, "EOF"

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Expected "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", but had \'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' instead"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lz9/a;->y(Lz9/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :cond_2
    move v2, v0

    :goto_2
    if-ge v2, v1, :cond_4

    invoke-virtual {p0}, Lz9/b0;->P()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x5c

    if-ne v3, v4, :cond_3

    invoke-virtual {p0}, Lz9/b0;->P()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lz9/a;->a:I

    invoke-virtual {p0, v0, v1, v2}, Lz9/a;->r(Ljava/lang/CharSequence;II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lz9/a;->a:I

    invoke-virtual {p0}, Lz9/b0;->P()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "substring(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public k()B
    .locals 5

    .prologue
    invoke-virtual {p0}, Lz9/b0;->P()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lz9/a;->a:I

    :goto_0
    const/4 v2, -0x1

    const/16 v3, 0xa

    if-eq v1, v2, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    add-int/lit8 v2, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v4, 0x20

    if-eq v1, v4, :cond_1

    if-eq v1, v3, :cond_1

    const/16 v3, 0xd

    if-eq v1, v3, :cond_1

    const/16 v3, 0x9

    if-ne v1, v3, :cond_0

    goto :goto_1

    :cond_0
    iput v2, p0, Lz9/a;->a:I

    invoke-static {v1}, Lz9/b;->a(C)B

    move-result v0

    return v0

    :cond_1
    :goto_1
    move v1, v2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iput v0, p0, Lz9/a;->a:I

    return v3
.end method

.method public m(C)V
    .locals 5

    .prologue
    iget v0, p0, Lz9/a;->a:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1}, Lz9/a;->N(C)V

    :cond_0
    invoke-virtual {p0}, Lz9/b0;->P()Ljava/lang/String;

    move-result-object v0

    iget v2, p0, Lz9/a;->a:I

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_4

    add-int/lit8 v3, v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v4, 0x20

    if-eq v2, v4, :cond_3

    const/16 v4, 0xa

    if-eq v2, v4, :cond_3

    const/16 v4, 0xd

    if-eq v2, v4, :cond_3

    const/16 v4, 0x9

    if-ne v2, v4, :cond_1

    goto :goto_1

    :cond_1
    iput v3, p0, Lz9/a;->a:I

    if-ne v2, p1, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0, p1}, Lz9/a;->N(C)V

    :cond_3
    :goto_1
    move v2, v3

    goto :goto_0

    :cond_4
    iput v1, p0, Lz9/a;->a:I

    invoke-virtual {p0, p1}, Lz9/a;->N(C)V

    return-void
.end method
