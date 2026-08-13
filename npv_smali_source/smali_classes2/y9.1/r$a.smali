.class public final Ly9/r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv9/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly9/r;->f(Lx7/a;)Lv9/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Li7/n;


# direct methods
.method constructor <init>(Lx7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, Ly9/r$a;->a:Li7/n;

    return-void
.end method

.method private final b()Lv9/f;
    .locals 1

    iget-object v0, p0, Ly9/r$a;->a:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv9/f;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Ly9/r$a;->b()Lv9/f;

    move-result-object v0

    invoke-interface {v0}, Lv9/f;->a()Ljava/lang/String;

    move-result-object v0

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

    invoke-direct {p0}, Ly9/r$a;->b()Lv9/f;

    move-result-object v0

    invoke-interface {v0, p1}, Lv9/f;->d(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public e()I
    .locals 1

    invoke-direct {p0}, Ly9/r$a;->b()Lv9/f;

    move-result-object v0

    invoke-interface {v0}, Lv9/f;->e()I

    move-result v0

    return v0
.end method

.method public f(I)Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Ly9/r$a;->b()Lv9/f;

    move-result-object v0

    invoke-interface {v0, p1}, Lv9/f;->f(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public g(I)Ljava/util/List;
    .locals 1

    invoke-direct {p0}, Ly9/r$a;->b()Lv9/f;

    move-result-object v0

    invoke-interface {v0, p1}, Lv9/f;->g(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public h(I)Lv9/f;
    .locals 1

    invoke-direct {p0}, Ly9/r$a;->b()Lv9/f;

    move-result-object v0

    invoke-interface {v0, p1}, Lv9/f;->h(I)Lv9/f;

    move-result-object p1

    return-object p1
.end method

.method public i(I)Z
    .locals 1

    invoke-direct {p0}, Ly9/r$a;->b()Lv9/f;

    move-result-object v0

    invoke-interface {v0, p1}, Lv9/f;->i(I)Z

    move-result p1

    return p1
.end method

.method public j()Lv9/m;
    .locals 1

    invoke-direct {p0}, Ly9/r$a;->b()Lv9/f;

    move-result-object v0

    invoke-interface {v0}, Lv9/f;->j()Lv9/m;

    move-result-object v0

    return-object v0
.end method

.method public synthetic k()Ljava/util/List;
    .locals 1

    invoke-static {p0}, Lv9/e;->a(Lv9/f;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public synthetic m()Z
    .locals 1

    invoke-static {p0}, Lv9/e;->b(Lv9/f;)Z

    move-result v0

    return v0
.end method
