.class public final Lx9/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv9/f;
.implements Lx9/k;


# instance fields
.field private final a:Lv9/f;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/util/Set;


# direct methods
.method public constructor <init>(Lv9/f;)V
    .locals 2

    const-string v0, "original"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx9/t0;->a:Lv9/f;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Lv9/f;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lx9/t0;->b:Ljava/lang/String;

    invoke-static {p1}, Lx9/e0;->a(Lv9/f;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lx9/t0;->c:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx9/t0;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lx9/t0;->c:Ljava/util/Set;

    return-object v0
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public d(Ljava/lang/String;)I
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx9/t0;->a:Lv9/f;

    invoke-interface {v0, p1}, Lv9/f;->d(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, Lx9/t0;->a:Lv9/f;

    invoke-interface {v0}, Lv9/f;->e()I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lx9/t0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Lx9/t0;->a:Lv9/f;

    check-cast p1, Lx9/t0;

    iget-object p1, p1, Lx9/t0;->a:Lv9/f;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public f(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx9/t0;->a:Lv9/f;

    invoke-interface {v0, p1}, Lv9/f;->f(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public g(I)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lx9/t0;->a:Lv9/f;

    invoke-interface {v0, p1}, Lv9/f;->g(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public h(I)Lv9/f;
    .locals 1

    iget-object v0, p0, Lx9/t0;->a:Lv9/f;

    invoke-interface {v0, p1}, Lv9/f;->h(I)Lv9/f;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lx9/t0;->a:Lv9/f;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    return v0
.end method

.method public i(I)Z
    .locals 1

    iget-object v0, p0, Lx9/t0;->a:Lv9/f;

    invoke-interface {v0, p1}, Lv9/f;->i(I)Z

    move-result p1

    return p1
.end method

.method public j()Lv9/m;
    .locals 1

    iget-object v0, p0, Lx9/t0;->a:Lv9/f;

    invoke-interface {v0}, Lv9/f;->j()Lv9/m;

    move-result-object v0

    return-object v0
.end method

.method public k()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lx9/t0;->a:Lv9/f;

    invoke-interface {v0}, Lv9/f;->k()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final l()Lv9/f;
    .locals 1

    iget-object v0, p0, Lx9/t0;->a:Lv9/f;

    return-object v0
.end method

.method public m()Z
    .locals 1

    iget-object v0, p0, Lx9/t0;->a:Lv9/f;

    invoke-interface {v0}, Lv9/f;->m()Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lx9/t0;->a:Lv9/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
