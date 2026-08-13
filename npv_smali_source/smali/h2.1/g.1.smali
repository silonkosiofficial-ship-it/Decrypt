.class public final Lh2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lh2/r;

.field private final b:Lh2/r;

.field private final c:Lh2/r;

.field private final d:Lh2/s;

.field private final e:Lh2/s;

.field private final f:Z

.field private final g:Z


# direct methods
.method public constructor <init>(Lh2/r;Lh2/r;Lh2/r;Lh2/s;Lh2/s;)V
    .locals 1

    .prologue
    const-string v0, "refresh"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prepend"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "append"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/g;->a:Lh2/r;

    iput-object p2, p0, Lh2/g;->b:Lh2/r;

    iput-object p3, p0, Lh2/g;->c:Lh2/r;

    iput-object p4, p0, Lh2/g;->d:Lh2/s;

    iput-object p5, p0, Lh2/g;->e:Lh2/s;

    invoke-virtual {p4}, Lh2/s;->h()Z

    move-result p1

    const/4 p2, 0x0

    const/4 p3, 0x1

    if-eqz p1, :cond_1

    if-eqz p5, :cond_0

    invoke-virtual {p5}, Lh2/s;->h()Z

    move-result p1

    goto :goto_0

    :cond_0
    move p1, p3

    :goto_0
    if-eqz p1, :cond_1

    move p1, p3

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    iput-boolean p1, p0, Lh2/g;->f:Z

    invoke-virtual {p4}, Lh2/s;->g()Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz p5, :cond_2

    invoke-virtual {p5}, Lh2/s;->g()Z

    move-result p1

    goto :goto_2

    :cond_2
    move p1, p2

    :goto_2
    if-eqz p1, :cond_4

    :cond_3
    move p2, p3

    :cond_4
    iput-boolean p2, p0, Lh2/g;->g:Z

    return-void
.end method

.method public synthetic constructor <init>(Lh2/r;Lh2/r;Lh2/r;Lh2/s;Lh2/s;ILy7/k;)V
    .locals 6

    .prologue
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lh2/g;-><init>(Lh2/r;Lh2/r;Lh2/r;Lh2/s;Lh2/s;)V

    return-void
.end method


# virtual methods
.method public final a()Lh2/r;
    .locals 1

    iget-object v0, p0, Lh2/g;->c:Lh2/r;

    return-object v0
.end method

.method public final b()Lh2/s;
    .locals 1

    iget-object v0, p0, Lh2/g;->e:Lh2/s;

    return-object v0
.end method

.method public final c()Lh2/r;
    .locals 1

    iget-object v0, p0, Lh2/g;->b:Lh2/r;

    return-object v0
.end method

.method public final d()Lh2/r;
    .locals 1

    iget-object v0, p0, Lh2/g;->a:Lh2/r;

    return-object v0
.end method

.method public final e()Lh2/s;
    .locals 1

    iget-object v0, p0, Lh2/g;->d:Lh2/s;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Lh2/g;

    if-eq v3, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lh2/g;

    iget-object v2, p0, Lh2/g;->a:Lh2/r;

    iget-object v3, p1, Lh2/g;->a:Lh2/r;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lh2/g;->b:Lh2/r;

    iget-object v3, p1, Lh2/g;->b:Lh2/r;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lh2/g;->c:Lh2/r;

    iget-object v3, p1, Lh2/g;->c:Lh2/r;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Lh2/g;->d:Lh2/s;

    iget-object v3, p1, Lh2/g;->d:Lh2/s;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_5
    iget-object v2, p0, Lh2/g;->e:Lh2/s;

    iget-object p1, p1, Lh2/g;->e:Lh2/s;

    invoke-static {v2, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v1

    :cond_6
    return v0

    :cond_7
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    .prologue
    iget-object v0, p0, Lh2/g;->a:Lh2/r;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lh2/g;->b:Lh2/r;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lh2/g;->c:Lh2/r;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lh2/g;->d:Lh2/s;

    invoke-virtual {v1}, Lh2/s;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lh2/g;->e:Lh2/s;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lh2/s;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CombinedLoadStates(refresh="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh2/g;->a:Lh2/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", prepend="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh2/g;->b:Lh2/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", append="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh2/g;->c:Lh2/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", source="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh2/g;->d:Lh2/s;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mediator="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh2/g;->e:Lh2/s;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
