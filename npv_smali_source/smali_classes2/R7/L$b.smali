.class public final LR7/L$b;
.super LR7/L;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR7/L;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final O:Li7/n;


# direct methods
.method public constructor <init>(LO7/a;LO7/j0;ILP7/g;Ln8/f;LF8/E;ZZZLF8/E;LO7/a0;Lx7/a;)V
    .locals 1

    const-string v0, "containingDeclaration"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outType"

    invoke-static {p6, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p11, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destructuringVariables"

    invoke-static {p12, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p11}, LR7/L;-><init>(LO7/a;LO7/j0;ILP7/g;Ln8/f;LF8/E;ZZZLF8/E;LO7/a0;)V

    invoke-static {p12}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LR7/L$b;->O:Li7/n;

    return-void
.end method


# virtual methods
.method public final W0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LR7/L$b;->O:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public g0(LO7/a;Ln8/f;I)LO7/j0;
    .locals 15

    const-string v0, "newOwner"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newName"

    move-object/from16 v6, p2

    invoke-static {v6, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LR7/L$b;

    invoke-virtual {p0}, LP7/b;->k()LP7/g;

    move-result-object v5

    const-string v1, "<get-annotations>(...)"

    invoke-static {v5, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LR7/M;->getType()LF8/E;

    move-result-object v7

    const-string v1, "getType(...)"

    invoke-static {v7, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LR7/L;->D0()Z

    move-result v8

    invoke-virtual {p0}, LR7/L;->j0()Z

    move-result v9

    invoke-virtual {p0}, LR7/L;->e0()Z

    move-result v10

    invoke-virtual {p0}, LR7/L;->u0()LF8/E;

    move-result-object v11

    sget-object v12, LO7/a0;->a:LO7/a0;

    const-string v1, "NO_SOURCE"

    invoke-static {v12, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v13, LR7/L$b$a;

    move-object v14, p0

    invoke-direct {v13, p0}, LR7/L$b$a;-><init>(LR7/L$b;)V

    const/4 v3, 0x0

    move-object v1, v0

    move/from16 v4, p3

    invoke-direct/range {v1 .. v13}, LR7/L$b;-><init>(LO7/a;LO7/j0;ILP7/g;Ln8/f;LF8/E;ZZZLF8/E;LO7/a0;Lx7/a;)V

    return-object v0
.end method
