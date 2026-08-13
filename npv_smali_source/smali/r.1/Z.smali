.class public Lr/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public synthetic C:Z

.field public synthetic D:[I

.field public synthetic E:[Ljava/lang/Object;

.field public synthetic F:I


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lr/Z;-><init>(IILy7/k;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    sget-object p1, Ls/a;->a:[I

    iput-object p1, p0, Lr/Z;->D:[I

    sget-object p1, Ls/a;->c:[Ljava/lang/Object;

    iput-object p1, p0, Lr/Z;->E:[Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ls/a;->e(I)I

    move-result p1

    new-array v0, p1, [I

    iput-object v0, p0, Lr/Z;->D:[I

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Lr/Z;->E:[Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public synthetic constructor <init>(IILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/16 p1, 0xa

    :cond_0
    invoke-direct {p0, p1}, Lr/Z;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/Object;)V
    .locals 4

    .prologue
    iget v0, p0, Lr/Z;->F:I

    if-eqz v0, :cond_0

    iget-object v1, p0, Lr/Z;->D:[I

    add-int/lit8 v2, v0, -0x1

    aget v1, v1, v2

    if-gt p1, v1, :cond_0

    invoke-virtual {p0, p1, p2}, Lr/Z;->m(ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lr/Z;->C:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lr/Z;->D:[I

    array-length v1, v1

    if-lt v0, v1, :cond_1

    invoke-static {p0}, Lr/a0;->a(Lr/Z;)V

    :cond_1
    iget v0, p0, Lr/Z;->F:I

    iget-object v1, p0, Lr/Z;->D:[I

    array-length v1, v1

    if-lt v0, v1, :cond_2

    add-int/lit8 v1, v0, 0x1

    invoke-static {v1}, Ls/a;->e(I)I

    move-result v1

    iget-object v2, p0, Lr/Z;->D:[I

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    const-string v3, "copyOf(this, newSize)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lr/Z;->D:[I

    iget-object v2, p0, Lr/Z;->E:[Ljava/lang/Object;

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lr/Z;->E:[Ljava/lang/Object;

    :cond_2
    iget-object v1, p0, Lr/Z;->D:[I

    aput p1, v1, v0

    iget-object p1, p0, Lr/Z;->E:[Ljava/lang/Object;

    aput-object p2, p1, v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lr/Z;->F:I

    :goto_0
    return-void
.end method

.method public b()V
    .locals 5

    .prologue
    iget v0, p0, Lr/Z;->F:I

    iget-object v1, p0, Lr/Z;->E:[Ljava/lang/Object;

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_0

    const/4 v4, 0x0

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iput v2, p0, Lr/Z;->F:I

    iput-boolean v2, p0, Lr/Z;->C:Z

    return-void
.end method

.method public c()Lr/Z;
    .locals 2

    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lr/Z;

    iget-object v1, p0, Lr/Z;->D:[I

    invoke-virtual {v1}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iput-object v1, v0, Lr/Z;->D:[I

    iget-object v1, p0, Lr/Z;->E:[Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    iput-object v1, v0, Lr/Z;->E:[Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lr/Z;->c()Lr/Z;

    move-result-object v0

    return-object v0
.end method

.method public d(I)Z
    .locals 0

    .prologue
    invoke-virtual {p0, p1}, Lr/Z;->j(I)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public e(I)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lr/a0;->c(Lr/Z;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public h(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lr/a0;->d(Lr/Z;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public j(I)I
    .locals 2

    .prologue
    iget-boolean v0, p0, Lr/Z;->C:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lr/a0;->a(Lr/Z;)V

    :cond_0
    iget-object v0, p0, Lr/Z;->D:[I

    iget v1, p0, Lr/Z;->F:I

    invoke-static {v0, v1, p1}, Ls/a;->a([III)I

    move-result p1

    return p1
.end method

.method public k(Ljava/lang/Object;)I
    .locals 3

    .prologue
    iget-boolean v0, p0, Lr/Z;->C:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lr/a0;->a(Lr/Z;)V

    :cond_0
    iget v0, p0, Lr/Z;->F:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    iget-object v2, p0, Lr/Z;->E:[Ljava/lang/Object;

    aget-object v2, v2, v1

    if-ne v2, p1, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, -0x1

    :goto_1
    return v1
.end method

.method public l(I)I
    .locals 1

    .prologue
    iget-boolean v0, p0, Lr/Z;->C:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lr/a0;->a(Lr/Z;)V

    :cond_0
    iget-object v0, p0, Lr/Z;->D:[I

    aget p1, v0, p1

    return p1
.end method

.method public m(ILjava/lang/Object;)V
    .locals 4

    .prologue
    iget-object v0, p0, Lr/Z;->D:[I

    iget v1, p0, Lr/Z;->F:I

    invoke-static {v0, v1, p1}, Ls/a;->a([III)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object p1, p0, Lr/Z;->E:[Ljava/lang/Object;

    aput-object p2, p1, v0

    goto/16 :goto_0

    :cond_0
    not-int v0, v0

    iget v1, p0, Lr/Z;->F:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lr/Z;->E:[Ljava/lang/Object;

    aget-object v1, v1, v0

    invoke-static {}, Lr/a0;->b()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lr/Z;->D:[I

    aput p1, v1, v0

    iget-object p1, p0, Lr/Z;->E:[Ljava/lang/Object;

    aput-object p2, p1, v0

    goto :goto_0

    :cond_1
    iget-boolean v1, p0, Lr/Z;->C:Z

    if-eqz v1, :cond_2

    iget v1, p0, Lr/Z;->F:I

    iget-object v2, p0, Lr/Z;->D:[I

    array-length v2, v2

    if-lt v1, v2, :cond_2

    invoke-static {p0}, Lr/a0;->a(Lr/Z;)V

    iget-object v0, p0, Lr/Z;->D:[I

    iget v1, p0, Lr/Z;->F:I

    invoke-static {v0, v1, p1}, Ls/a;->a([III)I

    move-result v0

    not-int v0, v0

    :cond_2
    iget v1, p0, Lr/Z;->F:I

    iget-object v2, p0, Lr/Z;->D:[I

    array-length v2, v2

    if-lt v1, v2, :cond_3

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ls/a;->e(I)I

    move-result v1

    iget-object v2, p0, Lr/Z;->D:[I

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    const-string v3, "copyOf(this, newSize)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lr/Z;->D:[I

    iget-object v2, p0, Lr/Z;->E:[Ljava/lang/Object;

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lr/Z;->E:[Ljava/lang/Object;

    :cond_3
    iget v1, p0, Lr/Z;->F:I

    sub-int v2, v1, v0

    if-eqz v2, :cond_4

    iget-object v2, p0, Lr/Z;->D:[I

    add-int/lit8 v3, v0, 0x1

    invoke-static {v2, v2, v3, v0, v1}, Lj7/n;->j([I[IIII)[I

    iget-object v1, p0, Lr/Z;->E:[Ljava/lang/Object;

    iget v2, p0, Lr/Z;->F:I

    invoke-static {v1, v1, v3, v0, v2}, Lj7/n;->l([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    :cond_4
    iget-object v1, p0, Lr/Z;->D:[I

    aput p1, v1, v0

    iget-object p1, p0, Lr/Z;->E:[Ljava/lang/Object;

    aput-object p2, p1, v0

    iget p1, p0, Lr/Z;->F:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lr/Z;->F:I

    :goto_0
    return-void
.end method

.method public n()I
    .locals 1

    .prologue
    iget-boolean v0, p0, Lr/Z;->C:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lr/a0;->a(Lr/Z;)V

    :cond_0
    iget v0, p0, Lr/Z;->F:I

    return v0
.end method

.method public p(I)Ljava/lang/Object;
    .locals 1

    .prologue
    iget-boolean v0, p0, Lr/Z;->C:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lr/a0;->a(Lr/Z;)V

    :cond_0
    iget-object v0, p0, Lr/Z;->E:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    invoke-virtual {p0}, Lr/Z;->n()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "{}"

    goto :goto_2

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    iget v1, p0, Lr/Z;->F:I

    mul-int/lit8 v1, v1, 0x1c

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Lr/Z;->F:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    if-lez v2, :cond_1

    const-string v3, ", "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {p0, v2}, Lr/Z;->l(I)I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v3, 0x3d

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Lr/Z;->p(I)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, p0, :cond_2

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const-string v3, "(this Map)"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "buffer.toString()"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    return-object v0
.end method
