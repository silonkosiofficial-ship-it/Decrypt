.class final Ly9/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/b;


# static fields
.field public static final a:Ly9/x;

.field private static final b:Lv9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly9/x;

    invoke-direct {v0}, Ly9/x;-><init>()V

    sput-object v0, Ly9/x;->a:Ly9/x;

    const-string v0, "kotlinx.serialization.json.JsonLiteral"

    sget-object v1, Lv9/d$i;->a:Lv9/d$i;

    invoke-static {v0, v1}, Lv9/l;->b(Ljava/lang/String;Lv9/d;)Lv9/f;

    move-result-object v0

    sput-object v0, Ly9/x;->b:Lv9/f;

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

    sget-object v0, Ly9/x;->b:Lv9/f;

    return-object v0
.end method

.method public bridge synthetic b(Lw9/h;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ly9/x;->f(Lw9/h;)Ly9/w;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lw9/j;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ly9/w;

    invoke-virtual {p0, p1, p2}, Ly9/x;->g(Lw9/j;Ly9/w;)V

    return-void
.end method

.method public f(Lw9/h;)Ly9/w;
    .locals 2

    .prologue
    const-string v0, "decoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ly9/r;->d(Lw9/h;)Ly9/h;

    move-result-object p1

    invoke-interface {p1}, Ly9/h;->l()Ly9/i;

    move-result-object p1

    instance-of v0, p1, Ly9/w;

    if-eqz v0, :cond_0

    check-cast p1, Ly9/w;

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected JSON element, expected JsonLiteral, had "

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

.method public g(Lw9/j;Ly9/w;)V
    .locals 2

    .prologue
    const-string v0, "encoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ly9/r;->c(Lw9/j;)V

    invoke-virtual {p2}, Ly9/w;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Ly9/w;->d()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lw9/j;->E(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p2}, Ly9/w;->e()Lv9/f;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Ly9/w;->e()Lv9/f;

    move-result-object v0

    invoke-interface {p1, v0}, Lw9/j;->w(Lv9/f;)Lw9/j;

    move-result-object p1

    invoke-virtual {p2}, Ly9/w;->d()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lw9/j;->E(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {p2}, Ly9/w;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LS8/r;->x(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Lw9/j;->D(J)V

    return-void

    :cond_2
    invoke-virtual {p2}, Ly9/w;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LS8/N;->i(Ljava/lang/String;)Li7/G;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Li7/G;->q()J

    move-result-wide v0

    sget-object p2, Li7/G;->D:Li7/G$a;

    invoke-static {p2}, Lu9/a;->u(Li7/G$a;)Lt9/b;

    move-result-object p2

    invoke-interface {p2}, Lt9/b;->a()Lv9/f;

    move-result-object p2

    invoke-interface {p1, p2}, Lw9/j;->w(Lv9/f;)Lw9/j;

    move-result-object p1

    invoke-interface {p1, v0, v1}, Lw9/j;->D(J)V

    return-void

    :cond_3
    invoke-virtual {p2}, Ly9/w;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LS8/r;->s(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Lw9/j;->g(D)V

    return-void

    :cond_4
    invoke-virtual {p2}, Ly9/w;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LS8/r;->t1(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {p1, p2}, Lw9/j;->l(Z)V

    return-void

    :cond_5
    invoke-virtual {p2}, Ly9/w;->d()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lw9/j;->E(Ljava/lang/String;)V

    return-void
.end method
