.class public final Lb7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LF7/c;

.field private final b:LF7/o;


# direct methods
.method public constructor <init>(LF7/c;LF7/o;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/a;->a:LF7/c;

    iput-object p2, p0, Lb7/a;->b:LF7/o;

    return-void
.end method


# virtual methods
.method public final a()LF7/c;
    .locals 1

    iget-object v0, p0, Lb7/a;->a:LF7/c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lb7/a;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object v0, p0, Lb7/a;->b:LF7/o;

    if-nez v0, :cond_3

    move-object v1, p1

    check-cast v1, Lb7/a;

    iget-object v2, v1, Lb7/a;->b:LF7/o;

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lb7/a;->a:LF7/c;

    iget-object v0, v1, Lb7/a;->a:LF7/c;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lb7/a;

    iget-object p1, p1, Lb7/a;->b:LF7/o;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    :goto_1
    return p1
.end method

.method public hashCode()I
    .locals 1

    .prologue
    iget-object v0, p0, Lb7/a;->b:LF7/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb7/a;->a:LF7/c;

    invoke-interface {v0}, LF7/c;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TypeInfo("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb7/a;->b:LF7/o;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lb7/a;->a:LF7/c;

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
