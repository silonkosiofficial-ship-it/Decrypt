.class public final Lt8/c;
.super Lt8/g;
.source "SourceFile"


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {p0, p1}, Lt8/g;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LO7/G;)LF8/E;
    .locals 0

    invoke-virtual {p0, p1}, Lt8/c;->c(LO7/G;)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public c(LO7/G;)LF8/M;
    .locals 1

    const-string v0, "module"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/G;->t()LL7/g;

    move-result-object p1

    invoke-virtual {p1}, LL7/g;->n()LF8/M;

    move-result-object p1

    const-string v0, "getBooleanType(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
