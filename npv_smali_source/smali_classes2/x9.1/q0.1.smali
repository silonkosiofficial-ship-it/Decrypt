.class public final Lx9/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv9/f;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lv9/d;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lv9/d;)V
    .locals 1

    const-string v0, "serialName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx9/q0;->a:Ljava/lang/String;

    iput-object p2, p0, Lx9/q0;->b:Lv9/d;

    return-void
.end method

.method private final b()Ljava/lang/Void;
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Primitive descriptor "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lx9/q0;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " does not have elements"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx9/q0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public synthetic c()Z
    .locals 1

    invoke-static {p0}, Lv9/e;->c(Lv9/f;)Z

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/String;)I
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lx9/q0;->b()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public e()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lx9/q0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lx9/q0;->a()Ljava/lang/String;

    move-result-object v1

    check-cast p1, Lx9/q0;

    invoke-virtual {p1}, Lx9/q0;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lx9/q0;->l()Lv9/d;

    move-result-object v1

    invoke-virtual {p1}, Lx9/q0;->l()Lv9/d;

    move-result-object p1

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public f(I)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lx9/q0;->b()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public g(I)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, Lx9/q0;->b()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public h(I)Lv9/f;
    .locals 0

    invoke-direct {p0}, Lx9/q0;->b()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lx9/q0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-virtual {p0}, Lx9/q0;->l()Lv9/d;

    move-result-object v1

    invoke-virtual {v1}, Lv9/m;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v0, v1

    return v0
.end method

.method public i(I)Z
    .locals 0

    invoke-direct {p0}, Lx9/q0;->b()Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

.method public bridge synthetic j()Lv9/m;
    .locals 1

    invoke-virtual {p0}, Lx9/q0;->l()Lv9/d;

    move-result-object v0

    return-object v0
.end method

.method public synthetic k()Ljava/util/List;
    .locals 1

    invoke-static {p0}, Lv9/e;->a(Lv9/f;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public l()Lv9/d;
    .locals 1

    iget-object v0, p0, Lx9/q0;->b:Lv9/d;

    return-object v0
.end method

.method public synthetic m()Z
    .locals 1

    invoke-static {p0}, Lv9/e;->b(Lv9/f;)Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PrimitiveDescriptor("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lx9/q0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
