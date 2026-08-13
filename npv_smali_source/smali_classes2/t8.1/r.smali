.class public final Lt8/r;
.super Lt8/g;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lt8/g;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LO7/G;)LF8/E;
    .locals 0

    invoke-virtual {p0, p1}, Lt8/r;->c(LO7/G;)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public c(LO7/G;)LF8/M;
    .locals 1

    const-string v0, "module"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/G;->t()LL7/g;

    move-result-object p1

    invoke-virtual {p1}, LL7/g;->J()LF8/M;

    move-result-object p1

    const-string v0, "getNullableNothingType(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
