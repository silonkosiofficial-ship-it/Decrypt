.class public final Lx9/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/b;


# instance fields
.field private final a:Lt9/b;

.field private final b:Lv9/f;


# direct methods
.method public constructor <init>(Lt9/b;)V
    .locals 1

    const-string v0, "serializer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx9/Z;->a:Lt9/b;

    new-instance v0, Lx9/t0;

    invoke-interface {p1}, Lt9/b;->a()Lv9/f;

    move-result-object p1

    invoke-direct {v0, p1}, Lx9/t0;-><init>(Lv9/f;)V

    iput-object v0, p0, Lx9/Z;->b:Lv9/f;

    return-void
.end method


# virtual methods
.method public a()Lv9/f;
    .locals 1

    iget-object v0, p0, Lx9/Z;->b:Lv9/f;

    return-object v0
.end method

.method public b(Lw9/h;)Ljava/lang/Object;
    .locals 1

    .prologue
    const-string v0, "decoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lw9/h;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lx9/Z;->a:Lt9/b;

    invoke-interface {p1, v0}, Lw9/h;->x(Lt9/a;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lw9/h;->n()Ljava/lang/Void;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public e(Lw9/j;Ljava/lang/Object;)V
    .locals 1

    .prologue
    const-string v0, "encoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-interface {p1}, Lw9/j;->q()V

    iget-object v0, p0, Lx9/Z;->a:Lt9/b;

    invoke-interface {p1, v0, p2}, Lw9/j;->t(Lt9/e;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lw9/j;->d()V

    :goto_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Lx9/Z;

    if-eq v3, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lx9/Z;

    iget-object v2, p0, Lx9/Z;->a:Lt9/b;

    iget-object p1, p1, Lx9/Z;->a:Lt9/b;

    invoke-static {v2, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lx9/Z;->a:Lt9/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
