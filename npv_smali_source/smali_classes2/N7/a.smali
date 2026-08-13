.class public final LN7/a;
.super Ly8/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN7/a$a;
    }
.end annotation


# static fields
.field public static final e:LN7/a$a;

.field private static final f:Ln8/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LN7/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LN7/a$a;-><init>(Ly7/k;)V

    sput-object v0, LN7/a;->e:LN7/a$a;

    const-string v0, "clone"

    invoke-static {v0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v0

    const-string v1, "identifier(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LN7/a;->f:Ln8/f;

    return-void
.end method

.method public constructor <init>(LE8/n;LO7/e;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingClass"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Ly8/e;-><init>(LE8/n;LO7/e;)V

    return-void
.end method

.method public static final synthetic m()Ln8/f;
    .locals 1

    sget-object v0, LN7/a;->f:Ln8/f;

    return-object v0
.end method


# virtual methods
.method protected i()Ljava/util/List;
    .locals 14

    invoke-virtual {p0}, Ly8/e;->l()LO7/e;

    move-result-object v0

    sget-object v1, LP7/g;->d:LP7/g$a;

    invoke-virtual {v1}, LP7/g$a;->b()LP7/g;

    move-result-object v1

    sget-object v2, LN7/a;->f:Ln8/f;

    sget-object v3, LO7/b$a;->C:LO7/b$a;

    sget-object v4, LO7/a0;->a:LO7/a0;

    invoke-static {v0, v1, v2, v3, v4}, LR7/G;->u1(LO7/m;LP7/g;Ln8/f;LO7/b$a;LO7/a0;)LR7/G;

    move-result-object v0

    invoke-virtual {p0}, Ly8/e;->l()LO7/e;

    move-result-object v1

    invoke-interface {v1}, LO7/e;->S0()LO7/X;

    move-result-object v7

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v8

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v9

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v10

    invoke-virtual {p0}, Ly8/e;->l()LO7/e;

    move-result-object v1

    invoke-static {v1}, Lv8/c;->j(LO7/m;)LL7/g;

    move-result-object v1

    invoke-virtual {v1}, LL7/g;->i()LF8/M;

    move-result-object v11

    sget-object v12, LO7/D;->F:LO7/D;

    sget-object v13, LO7/t;->c:LO7/u;

    const/4 v6, 0x0

    move-object v5, v0

    invoke-virtual/range {v5 .. v13}, LR7/G;->w1(LO7/X;LO7/X;Ljava/util/List;Ljava/util/List;Ljava/util/List;LF8/E;LO7/D;LO7/u;)LR7/G;

    invoke-static {v0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
