.class public final Ly9/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/b;


# static fields
.field public static final a:Ly9/G;

.field private static final b:Lv9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Ly9/G;

    invoke-direct {v0}, Ly9/G;-><init>()V

    sput-object v0, Ly9/G;->a:Ly9/G;

    sget-object v2, Lv9/d$i;->a:Lv9/d$i;

    const/4 v0, 0x0

    new-array v3, v0, [Lv9/f;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const-string v1, "kotlinx.serialization.json.JsonPrimitive"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lv9/l;->d(Ljava/lang/String;Lv9/m;[Lv9/f;Lx7/l;ILjava/lang/Object;)Lv9/f;

    move-result-object v0

    sput-object v0, Ly9/G;->b:Lv9/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lv9/f;
    .locals 1

    sget-object v0, Ly9/G;->b:Lv9/f;

    return-object v0
.end method

.method public bridge synthetic b(Lw9/h;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ly9/G;->f(Lw9/h;)Ly9/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lw9/j;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ly9/F;

    invoke-virtual {p0, p1, p2}, Ly9/G;->g(Lw9/j;Ly9/F;)V

    return-void
.end method

.method public f(Lw9/h;)Ly9/F;
    .locals 2

    .prologue
    const-string v0, "decoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ly9/r;->d(Lw9/h;)Ly9/h;

    move-result-object p1

    invoke-interface {p1}, Ly9/h;->l()Ly9/i;

    move-result-object p1

    instance-of v0, p1, Ly9/F;

    if-eqz v0, :cond_0

    check-cast p1, Ly9/F;

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected JSON element, expected JsonPrimitive, had "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, -0x1

    invoke-static {v1, v0, p1}, Lz9/G;->f(ILjava/lang/String;Ljava/lang/CharSequence;)Lz9/C;

    move-result-object p1

    throw p1
.end method

.method public g(Lw9/j;Ly9/F;)V
    .locals 1

    .prologue
    const-string v0, "encoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ly9/r;->c(Lw9/j;)V

    instance-of v0, p2, Ly9/A;

    if-eqz v0, :cond_0

    sget-object p2, Ly9/B;->a:Ly9/B;

    sget-object v0, Ly9/A;->INSTANCE:Ly9/A;

    invoke-interface {p1, p2, v0}, Lw9/j;->t(Lt9/e;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object v0, Ly9/x;->a:Ly9/x;

    check-cast p2, Ly9/w;

    invoke-interface {p1, v0, p2}, Lw9/j;->t(Lt9/e;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
