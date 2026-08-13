.class public final Ly9/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/b;


# static fields
.field public static final a:Ly9/q;

.field private static final b:Lv9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ly9/q;

    invoke-direct {v0}, Ly9/q;-><init>()V

    sput-object v0, Ly9/q;->a:Ly9/q;

    sget-object v0, Lv9/c$a;->a:Lv9/c$a;

    const/4 v1, 0x0

    new-array v1, v1, [Lv9/f;

    new-instance v2, Ly9/k;

    invoke-direct {v2}, Ly9/k;-><init>()V

    const-string v3, "kotlinx.serialization.json.JsonElement"

    invoke-static {v3, v0, v1, v2}, Lv9/l;->c(Ljava/lang/String;Lv9/m;[Lv9/f;Lx7/l;)Lv9/f;

    move-result-object v0

    sput-object v0, Ly9/q;->b:Lv9/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic f(Lv9/a;)Li7/M;
    .locals 0

    invoke-static {p0}, Ly9/q;->l(Lv9/a;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g()Lv9/f;
    .locals 1

    invoke-static {}, Ly9/q;->m()Lv9/f;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h()Lv9/f;
    .locals 1

    invoke-static {}, Ly9/q;->n()Lv9/f;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i()Lv9/f;
    .locals 1

    invoke-static {}, Ly9/q;->o()Lv9/f;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic j()Lv9/f;
    .locals 1

    invoke-static {}, Ly9/q;->p()Lv9/f;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic k()Lv9/f;
    .locals 1

    invoke-static {}, Ly9/q;->q()Lv9/f;

    move-result-object v0

    return-object v0
.end method

.method private static final l(Lv9/a;)Li7/M;
    .locals 8

    const-string v0, "$this$buildSerialDescriptor"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly9/l;

    invoke-direct {v0}, Ly9/l;-><init>()V

    invoke-static {v0}, Ly9/r;->a(Lx7/a;)Lv9/f;

    move-result-object v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-string v2, "JsonPrimitive"

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lv9/a;->b(Lv9/a;Ljava/lang/String;Lv9/f;Ljava/util/List;ZILjava/lang/Object;)V

    new-instance v0, Ly9/m;

    invoke-direct {v0}, Ly9/m;-><init>()V

    invoke-static {v0}, Ly9/r;->a(Lx7/a;)Lv9/f;

    move-result-object v3

    const-string v2, "JsonNull"

    invoke-static/range {v1 .. v7}, Lv9/a;->b(Lv9/a;Ljava/lang/String;Lv9/f;Ljava/util/List;ZILjava/lang/Object;)V

    new-instance v0, Ly9/n;

    invoke-direct {v0}, Ly9/n;-><init>()V

    invoke-static {v0}, Ly9/r;->a(Lx7/a;)Lv9/f;

    move-result-object v3

    const-string v2, "JsonLiteral"

    invoke-static/range {v1 .. v7}, Lv9/a;->b(Lv9/a;Ljava/lang/String;Lv9/f;Ljava/util/List;ZILjava/lang/Object;)V

    new-instance v0, Ly9/o;

    invoke-direct {v0}, Ly9/o;-><init>()V

    invoke-static {v0}, Ly9/r;->a(Lx7/a;)Lv9/f;

    move-result-object v3

    const-string v2, "JsonObject"

    invoke-static/range {v1 .. v7}, Lv9/a;->b(Lv9/a;Ljava/lang/String;Lv9/f;Ljava/util/List;ZILjava/lang/Object;)V

    new-instance v0, Ly9/p;

    invoke-direct {v0}, Ly9/p;-><init>()V

    invoke-static {v0}, Ly9/r;->a(Lx7/a;)Lv9/f;

    move-result-object v3

    const-string v2, "JsonArray"

    invoke-static/range {v1 .. v7}, Lv9/a;->b(Lv9/a;Ljava/lang/String;Lv9/f;Ljava/util/List;ZILjava/lang/Object;)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private static final m()Lv9/f;
    .locals 1

    sget-object v0, Ly9/G;->a:Ly9/G;

    invoke-virtual {v0}, Ly9/G;->a()Lv9/f;

    move-result-object v0

    return-object v0
.end method

.method private static final n()Lv9/f;
    .locals 1

    sget-object v0, Ly9/B;->a:Ly9/B;

    invoke-virtual {v0}, Ly9/B;->a()Lv9/f;

    move-result-object v0

    return-object v0
.end method

.method private static final o()Lv9/f;
    .locals 1

    sget-object v0, Ly9/x;->a:Ly9/x;

    invoke-virtual {v0}, Ly9/x;->a()Lv9/f;

    move-result-object v0

    return-object v0
.end method

.method private static final p()Lv9/f;
    .locals 1

    sget-object v0, Ly9/E;->a:Ly9/E;

    invoke-virtual {v0}, Ly9/E;->a()Lv9/f;

    move-result-object v0

    return-object v0
.end method

.method private static final q()Lv9/f;
    .locals 1

    sget-object v0, Ly9/d;->a:Ly9/d;

    invoke-virtual {v0}, Ly9/d;->a()Lv9/f;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Lv9/f;
    .locals 1

    sget-object v0, Ly9/q;->b:Lv9/f;

    return-object v0
.end method

.method public bridge synthetic b(Lw9/h;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ly9/q;->r(Lw9/h;)Ly9/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lw9/j;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ly9/i;

    invoke-virtual {p0, p1, p2}, Ly9/q;->s(Lw9/j;Ly9/i;)V

    return-void
.end method

.method public r(Lw9/h;)Ly9/i;
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ly9/r;->d(Lw9/h;)Ly9/h;

    move-result-object p1

    invoke-interface {p1}, Ly9/h;->l()Ly9/i;

    move-result-object p1

    return-object p1
.end method

.method public s(Lw9/j;Ly9/i;)V
    .locals 1

    .prologue
    const-string v0, "encoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ly9/r;->c(Lw9/j;)V

    instance-of v0, p2, Ly9/F;

    if-eqz v0, :cond_0

    sget-object v0, Ly9/G;->a:Ly9/G;

    :goto_0
    invoke-interface {p1, v0, p2}, Lw9/j;->t(Lt9/e;Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    instance-of v0, p2, Ly9/D;

    if-eqz v0, :cond_1

    sget-object v0, Ly9/E;->a:Ly9/E;

    goto :goto_0

    :cond_1
    instance-of v0, p2, Ly9/c;

    if-eqz v0, :cond_2

    sget-object v0, Ly9/d;->a:Ly9/d;

    goto :goto_0

    :goto_1
    return-void

    :cond_2
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1
.end method
