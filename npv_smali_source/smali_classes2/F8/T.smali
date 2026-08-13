.class public final LF8/T;
.super LF8/j0;
.source "SourceFile"


# instance fields
.field private final a:LO7/f0;

.field private final b:Li7/n;


# direct methods
.method public constructor <init>(LO7/f0;)V
    .locals 1

    const-string v0, "typeParameter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LF8/j0;-><init>()V

    iput-object p1, p0, LF8/T;->a:LO7/f0;

    sget-object p1, Li7/r;->D:Li7/r;

    new-instance v0, LF8/T$a;

    invoke-direct {v0, p0}, LF8/T$a;-><init>(LF8/T;)V

    invoke-static {p1, v0}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LF8/T;->b:Li7/n;

    return-void
.end method

.method public static final synthetic c(LF8/T;)LO7/f0;
    .locals 0

    iget-object p0, p0, LF8/T;->a:LO7/f0;

    return-object p0
.end method

.method private final d()LF8/E;
    .locals 1

    iget-object v0, p0, LF8/T;->b:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/E;

    return-object v0
.end method


# virtual methods
.method public a()LF8/u0;
    .locals 1

    sget-object v0, LF8/u0;->I:LF8/u0;

    return-object v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getType()LF8/E;
    .locals 1

    invoke-direct {p0}, LF8/T;->d()LF8/E;

    move-result-object v0

    return-object v0
.end method

.method public v(LG8/g;)LF8/i0;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
