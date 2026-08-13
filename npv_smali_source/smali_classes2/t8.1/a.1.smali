.class public final Lt8/a;
.super Lt8/g;
.source "SourceFile"


# direct methods
.method public constructor <init>(LP7/c;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lt8/g;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(LO7/G;)LF8/E;
    .locals 1

    const-string v0, "module"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LP7/c;

    invoke-interface {p1}, LP7/c;->getType()LF8/E;

    move-result-object p1

    return-object p1
.end method
