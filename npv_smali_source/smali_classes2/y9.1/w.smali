.class public final Ly9/w;
.super Ly9/F;
.source "SourceFile"


# instance fields
.field private final C:Z

.field private final D:Lv9/f;

.field private final E:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Object;ZLv9/f;)V
    .locals 1

    .prologue
    const-string v0, "body"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly9/F;-><init>(Ly7/k;)V

    iput-boolean p2, p0, Ly9/w;->C:Z

    iput-object p3, p0, Ly9/w;->D:Lv9/f;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ly9/w;->E:Ljava/lang/String;

    if-eqz p3, :cond_1

    invoke-interface {p3}, Lv9/f;->m()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLv9/f;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Ly9/w;-><init>(Ljava/lang/Object;ZLv9/f;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly9/w;->E:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Lv9/f;
    .locals 1

    iget-object v0, p0, Ly9/w;->D:Lv9/f;

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

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Ly9/w;

    if-eq v3, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Ly9/w;

    invoke-virtual {p0}, Ly9/w;->f()Z

    move-result v2

    invoke-virtual {p1}, Ly9/w;->f()Z

    move-result v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0}, Ly9/w;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ly9/w;->d()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    return v0

    :cond_4
    :goto_0
    return v1
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Ly9/w;->C:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ly9/w;->f()Z

    move-result v0

    invoke-static {v0}, Lt/h;->a(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Ly9/w;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    invoke-virtual {p0}, Ly9/w;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ly9/w;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lz9/e0;->c(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ly9/w;->d()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
