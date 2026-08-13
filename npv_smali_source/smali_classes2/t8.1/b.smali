.class public Lt8/b;
.super Lt8/g;
.source "SourceFile"


# instance fields
.field private final b:Lx7/l;


# direct methods
.method public constructor <init>(Ljava/util/List;Lx7/l;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "computeType"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lt8/g;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lt8/b;->b:Lx7/l;

    return-void
.end method


# virtual methods
.method public a(LO7/G;)LF8/E;
    .locals 1

    .prologue
    const-string v0, "module"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lt8/b;->b:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF8/E;

    invoke-static {p1}, LL7/g;->c0(LF8/E;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, LL7/g;->q0(LF8/E;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, LL7/g;->D0(LF8/E;)Z

    :cond_0
    return-object p1
.end method
