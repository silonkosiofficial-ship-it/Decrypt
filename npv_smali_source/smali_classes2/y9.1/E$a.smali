.class final Ly9/E$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv9/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly9/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field public static final b:Ly9/E$a;

.field private static final c:Ljava/lang/String;


# instance fields
.field private final synthetic a:Lv9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly9/E$a;

    invoke-direct {v0}, Ly9/E$a;-><init>()V

    sput-object v0, Ly9/E$a;->b:Ly9/E$a;

    const-string v0, "kotlinx.serialization.json.JsonObject"

    sput-object v0, Ly9/E$a;->c:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ly7/V;->a:Ly7/V;

    invoke-static {v0}, Lu9/a;->F(Ly7/V;)Lt9/b;

    move-result-object v0

    sget-object v1, Ly9/q;->a:Ly9/q;

    invoke-static {v0, v1}, Lu9/a;->i(Lt9/b;Lt9/b;)Lt9/b;

    move-result-object v0

    invoke-interface {v0}, Lt9/b;->a()Lv9/f;

    move-result-object v0

    iput-object v0, p0, Ly9/E$a;->a:Lv9/f;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    sget-object v0, Ly9/E$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Ly9/E$a;->a:Lv9/f;

    invoke-interface {v0}, Lv9/f;->c()Z

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/String;)I
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly9/E$a;->a:Lv9/f;

    invoke-interface {v0, p1}, Lv9/f;->d(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, Ly9/E$a;->a:Lv9/f;

    invoke-interface {v0}, Lv9/f;->e()I

    move-result v0

    return v0
.end method

.method public f(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly9/E$a;->a:Lv9/f;

    invoke-interface {v0, p1}, Lv9/f;->f(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public g(I)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ly9/E$a;->a:Lv9/f;

    invoke-interface {v0, p1}, Lv9/f;->g(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public h(I)Lv9/f;
    .locals 1

    iget-object v0, p0, Ly9/E$a;->a:Lv9/f;

    invoke-interface {v0, p1}, Lv9/f;->h(I)Lv9/f;

    move-result-object p1

    return-object p1
.end method

.method public i(I)Z
    .locals 1

    iget-object v0, p0, Ly9/E$a;->a:Lv9/f;

    invoke-interface {v0, p1}, Lv9/f;->i(I)Z

    move-result p1

    return p1
.end method

.method public j()Lv9/m;
    .locals 1

    iget-object v0, p0, Ly9/E$a;->a:Lv9/f;

    invoke-interface {v0}, Lv9/f;->j()Lv9/m;

    move-result-object v0

    return-object v0
.end method

.method public k()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ly9/E$a;->a:Lv9/f;

    invoke-interface {v0}, Lv9/f;->k()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public m()Z
    .locals 1

    iget-object v0, p0, Ly9/E$a;->a:Lv9/f;

    invoke-interface {v0}, Lv9/f;->m()Z

    move-result v0

    return v0
.end method
