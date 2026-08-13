.class final Lx/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx/A;


# instance fields
.field private final a:Lx7/l;

.field private final b:Lx/w;

.field private final c:Lv/N;

.field private final d:LV/w0;

.field private final e:LV/w0;

.field private final f:LV/w0;


# direct methods
.method public constructor <init>(Lx7/l;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx/k;->a:Lx7/l;

    new-instance p1, Lx/k$b;

    invoke-direct {p1, p0}, Lx/k$b;-><init>(Lx/k;)V

    iput-object p1, p0, Lx/k;->b:Lx/w;

    new-instance p1, Lv/N;

    invoke-direct {p1}, Lv/N;-><init>()V

    iput-object p1, p0, Lx/k;->c:Lv/N;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v2

    iput-object v2, p0, Lx/k;->d:LV/w0;

    invoke-static {p1, v0, v1, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v2

    iput-object v2, p0, Lx/k;->e:LV/w0;

    invoke-static {p1, v0, v1, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, Lx/k;->f:LV/w0;

    return-void
.end method

.method public static final synthetic f(Lx/k;)Lv/N;
    .locals 0

    iget-object p0, p0, Lx/k;->c:Lv/N;

    return-object p0
.end method

.method public static final synthetic g(Lx/k;)Lx/w;
    .locals 0

    iget-object p0, p0, Lx/k;->b:Lx/w;

    return-object p0
.end method

.method public static final synthetic h(Lx/k;)LV/w0;
    .locals 0

    iget-object p0, p0, Lx/k;->f:LV/w0;

    return-object p0
.end method

.method public static final synthetic i(Lx/k;)LV/w0;
    .locals 0

    iget-object p0, p0, Lx/k;->e:LV/w0;

    return-object p0
.end method

.method public static final synthetic j(Lx/k;)LV/w0;
    .locals 0

    iget-object p0, p0, Lx/k;->d:LV/w0;

    return-object p0
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lx/k;->d:LV/w0;

    invoke-interface {v0}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public synthetic b()Z
    .locals 1

    invoke-static {p0}, Lx/z;->a(Lx/A;)Z

    move-result v0

    return v0
.end method

.method public synthetic c()Z
    .locals 1

    invoke-static {p0}, Lx/z;->b(Lx/A;)Z

    move-result v0

    return v0
.end method

.method public d(Lv/L;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    new-instance v0, Lx/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lx/k$a;-><init>(Lx/k;Lv/L;Lx7/p;Lm7/e;)V

    invoke-static {v0, p3}, LW8/O;->f(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public e(F)F
    .locals 1

    iget-object v0, p0, Lx/k;->a:Lx7/l;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    return p1
.end method

.method public final k()Lx7/l;
    .locals 1

    iget-object v0, p0, Lx/k;->a:Lx7/l;

    return-object v0
.end method
