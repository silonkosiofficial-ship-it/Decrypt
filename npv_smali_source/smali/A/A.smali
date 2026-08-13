.class final LA/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA/S;


# instance fields
.field private final b:LA/S;

.field private final c:I


# direct methods
.method private constructor <init>(LA/S;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA/A;->b:LA/S;

    iput p2, p0, LA/A;->c:I

    return-void
.end method

.method public synthetic constructor <init>(LA/S;ILy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LA/A;-><init>(LA/S;I)V

    return-void
.end method


# virtual methods
.method public a(LY0/e;LY0/v;)I
    .locals 2

    .prologue
    sget-object v0, LY0/v;->C:LY0/v;

    if-ne p2, v0, :cond_0

    sget-object v0, LA/W;->a:LA/W$a;

    invoke-virtual {v0}, LA/W$a;->c()I

    move-result v0

    goto :goto_0

    :cond_0
    sget-object v0, LA/W;->a:LA/W$a;

    invoke-virtual {v0}, LA/W$a;->d()I

    move-result v0

    :goto_0
    iget v1, p0, LA/A;->c:I

    invoke-static {v1, v0}, LA/W;->j(II)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LA/A;->b:LA/S;

    invoke-interface {v0, p1, p2}, LA/S;->a(LY0/e;LY0/v;)I

    move-result p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public b(LY0/e;)I
    .locals 2

    .prologue
    iget v0, p0, LA/A;->c:I

    sget-object v1, LA/W;->a:LA/W$a;

    invoke-virtual {v1}, LA/W$a;->e()I

    move-result v1

    invoke-static {v0, v1}, LA/W;->j(II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LA/A;->b:LA/S;

    invoke-interface {v0, p1}, LA/S;->b(LY0/e;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public c(LY0/e;)I
    .locals 2

    .prologue
    iget v0, p0, LA/A;->c:I

    sget-object v1, LA/W;->a:LA/W$a;

    invoke-virtual {v1}, LA/W$a;->g()I

    move-result v1

    invoke-static {v0, v1}, LA/W;->j(II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LA/A;->b:LA/S;

    invoke-interface {v0, p1}, LA/S;->c(LY0/e;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public d(LY0/e;LY0/v;)I
    .locals 2

    .prologue
    sget-object v0, LY0/v;->C:LY0/v;

    if-ne p2, v0, :cond_0

    sget-object v0, LA/W;->a:LA/W$a;

    invoke-virtual {v0}, LA/W$a;->a()I

    move-result v0

    goto :goto_0

    :cond_0
    sget-object v0, LA/W;->a:LA/W$a;

    invoke-virtual {v0}, LA/W$a;->b()I

    move-result v0

    :goto_0
    iget v1, p0, LA/A;->c:I

    invoke-static {v1, v0}, LA/W;->j(II)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LA/A;->b:LA/S;

    invoke-interface {v0, p1, p2}, LA/S;->d(LY0/e;LY0/v;)I

    move-result p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LA/A;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, LA/A;->b:LA/S;

    check-cast p1, LA/A;

    iget-object v3, p1, LA/A;->b:LA/S;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, LA/A;->c:I

    iget p1, p1, LA/A;->c:I

    invoke-static {v1, p1}, LA/W;->i(II)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LA/A;->b:LA/S;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LA/A;->c:I

    invoke-static {v1}, LA/W;->k(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, LA/A;->b:LA/S;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " only "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LA/A;->c:I

    invoke-static {v1}, LA/W;->m(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
