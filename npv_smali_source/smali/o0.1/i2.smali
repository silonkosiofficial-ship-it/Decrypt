.class public final Lo0/i2;
.super Lo0/a2;
.source "SourceFile"


# instance fields
.field private final e:J

.field private final f:Ljava/util/List;

.field private final g:Ljava/util/List;


# direct methods
.method private constructor <init>(JLjava/util/List;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Lo0/a2;-><init>()V

    iput-wide p1, p0, Lo0/i2;->e:J

    iput-object p3, p0, Lo0/i2;->f:Ljava/util/List;

    iput-object p4, p0, Lo0/i2;->g:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(JLjava/util/List;Ljava/util/List;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lo0/i2;-><init>(JLjava/util/List;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public b(J)Landroid/graphics/Shader;
    .locals 4

    .prologue
    iget-wide v0, p0, Lo0/i2;->e:J

    invoke-static {v0, v1}, Ln0/h;->d(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Ln0/n;->b(J)J

    move-result-wide p1

    goto :goto_2

    :cond_0
    iget-wide v0, p0, Lo0/i2;->e:J

    invoke-static {v0, v1}, Ln0/g;->m(J)F

    move-result v0

    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    cmpg-float v0, v0, v1

    if-nez v0, :cond_1

    invoke-static {p1, p2}, Ln0/m;->i(J)F

    move-result v0

    goto :goto_0

    :cond_1
    iget-wide v2, p0, Lo0/i2;->e:J

    invoke-static {v2, v3}, Ln0/g;->m(J)F

    move-result v0

    :goto_0
    iget-wide v2, p0, Lo0/i2;->e:J

    invoke-static {v2, v3}, Ln0/g;->n(J)F

    move-result v2

    cmpg-float v1, v2, v1

    if-nez v1, :cond_2

    invoke-static {p1, p2}, Ln0/m;->g(J)F

    move-result p1

    goto :goto_1

    :cond_2
    iget-wide p1, p0, Lo0/i2;->e:J

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result p1

    :goto_1
    invoke-static {v0, p1}, Ln0/h;->a(FF)J

    move-result-wide p1

    :goto_2
    iget-object v0, p0, Lo0/i2;->f:Ljava/util/List;

    iget-object v1, p0, Lo0/i2;->g:Ljava/util/List;

    invoke-static {p1, p2, v0, v1}, Lo0/b2;->c(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lo0/i2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-wide v3, p0, Lo0/i2;->e:J

    check-cast p1, Lo0/i2;

    iget-wide v5, p1, Lo0/i2;->e:J

    invoke-static {v3, v4, v5, v6}, Ln0/g;->j(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lo0/i2;->f:Ljava/util/List;

    iget-object v3, p1, Lo0/i2;->f:Ljava/util/List;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lo0/i2;->g:Ljava/util/List;

    iget-object p1, p1, Lo0/i2;->g:Ljava/util/List;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    iget-wide v0, p0, Lo0/i2;->e:J

    invoke-static {v0, v1}, Ln0/g;->o(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lo0/i2;->f:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lo0/i2;->g:Ljava/util/List;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    iget-wide v0, p0, Lo0/i2;->e:J

    invoke-static {v0, v1}, Ln0/h;->c(J)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "center="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lo0/i2;->e:J

    invoke-static {v1, v2}, Ln0/g;->t(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SweepGradient("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "colors="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lo0/i2;->f:Ljava/util/List;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", stops="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lo0/i2;->g:Ljava/util/List;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
