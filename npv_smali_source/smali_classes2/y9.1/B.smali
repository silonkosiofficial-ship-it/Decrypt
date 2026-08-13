.class public final Ly9/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/b;


# static fields
.field public static final a:Ly9/B;

.field private static final b:Lv9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Ly9/B;

    invoke-direct {v0}, Ly9/B;-><init>()V

    sput-object v0, Ly9/B;->a:Ly9/B;

    sget-object v2, Lv9/m$b;->a:Lv9/m$b;

    const/4 v0, 0x0

    new-array v3, v0, [Lv9/f;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const-string v1, "kotlinx.serialization.json.JsonNull"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lv9/l;->d(Ljava/lang/String;Lv9/m;[Lv9/f;Lx7/l;ILjava/lang/Object;)Lv9/f;

    move-result-object v0

    sput-object v0, Ly9/B;->b:Lv9/f;

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

    sget-object v0, Ly9/B;->b:Lv9/f;

    return-object v0
.end method

.method public bridge synthetic b(Lw9/h;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ly9/B;->f(Lw9/h;)Ly9/A;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lw9/j;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ly9/A;

    invoke-virtual {p0, p1, p2}, Ly9/B;->g(Lw9/j;Ly9/A;)V

    return-void
.end method

.method public f(Lw9/h;)Ly9/A;
    .locals 1

    .prologue
    const-string v0, "decoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ly9/r;->b(Lw9/h;)V

    invoke-interface {p1}, Lw9/h;->s()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lw9/h;->n()Ljava/lang/Void;

    sget-object p1, Ly9/A;->INSTANCE:Ly9/A;

    return-object p1

    :cond_0
    new-instance p1, Lz9/C;

    const-string v0, "Expected \'null\' literal"

    invoke-direct {p1, v0}, Lz9/C;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public g(Lw9/j;Ly9/A;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ly9/r;->c(Lw9/j;)V

    invoke-interface {p1}, Lw9/j;->d()V

    return-void
.end method
