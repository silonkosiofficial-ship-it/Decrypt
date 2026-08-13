.class final LS/Y0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS/U0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS/Y0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:LS/b1;

.field private final b:LW8/l;


# direct methods
.method public constructor <init>(LS/b1;LW8/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS/Y0$a;->a:LS/b1;

    iput-object p2, p0, LS/Y0$a;->b:LW8/l;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    iget-object v0, p0, LS/Y0$a;->b:LW8/l;

    invoke-interface {v0}, LW8/l;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LS/Y0$a;->b:LW8/l;

    sget-object v1, Li7/w;->D:Li7/w$a;

    sget-object v1, LS/a1;->D:LS/a1;

    invoke-static {v1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lm7/e;->t(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public b()LS/b1;
    .locals 1

    iget-object v0, p0, LS/Y0$a;->a:LS/b1;

    return-object v0
.end method

.method public dismiss()V
    .locals 2

    .prologue
    iget-object v0, p0, LS/Y0$a;->b:LW8/l;

    invoke-interface {v0}, LW8/l;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LS/Y0$a;->b:LW8/l;

    sget-object v1, Li7/w;->D:Li7/w$a;

    sget-object v1, LS/a1;->C:LS/a1;

    invoke-static {v1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lm7/e;->t(Ljava/lang/Object;)V

    :cond_0
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

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, LS/Y0$a;

    if-eq v3, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, LS/Y0$a;

    invoke-virtual {p0}, LS/Y0$a;->b()LS/b1;

    move-result-object v2

    invoke-virtual {p1}, LS/Y0$a;->b()LS/b1;

    move-result-object v3

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, LS/Y0$a;->b:LW8/l;

    iget-object p1, p1, LS/Y0$a;->b:LW8/l;

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

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, LS/Y0$a;->b()LS/b1;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LS/Y0$a;->b:LW8/l;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
