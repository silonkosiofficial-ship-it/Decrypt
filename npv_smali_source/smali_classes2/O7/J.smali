.class public final LO7/J;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO7/J$a;,
        LO7/J$b;
    }
.end annotation


# instance fields
.field private final a:LE8/n;

.field private final b:LO7/G;

.field private final c:LE8/g;

.field private final d:LE8/g;


# direct methods
.method public constructor <init>(LE8/n;LO7/G;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "module"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO7/J;->a:LE8/n;

    iput-object p2, p0, LO7/J;->b:LO7/G;

    new-instance p2, LO7/J$d;

    invoke-direct {p2, p0}, LO7/J$d;-><init>(LO7/J;)V

    invoke-interface {p1, p2}, LE8/n;->b(Lx7/l;)LE8/g;

    move-result-object p2

    iput-object p2, p0, LO7/J;->c:LE8/g;

    new-instance p2, LO7/J$c;

    invoke-direct {p2, p0}, LO7/J$c;-><init>(LO7/J;)V

    invoke-interface {p1, p2}, LE8/n;->b(Lx7/l;)LE8/g;

    move-result-object p1

    iput-object p1, p0, LO7/J;->d:LE8/g;

    return-void
.end method

.method public static final synthetic a(LO7/J;)LO7/G;
    .locals 0

    iget-object p0, p0, LO7/J;->b:LO7/G;

    return-object p0
.end method

.method public static final synthetic b(LO7/J;)LE8/g;
    .locals 0

    iget-object p0, p0, LO7/J;->c:LE8/g;

    return-object p0
.end method

.method public static final synthetic c(LO7/J;)LE8/n;
    .locals 0

    iget-object p0, p0, LO7/J;->a:LE8/n;

    return-object p0
.end method


# virtual methods
.method public final d(Ln8/b;Ljava/util/List;)LO7/e;
    .locals 2

    const-string v0, "classId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParametersCount"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LO7/J;->d:LE8/g;

    new-instance v1, LO7/J$a;

    invoke-direct {v1, p1, p2}, LO7/J$a;-><init>(Ln8/b;Ljava/util/List;)V

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO7/e;

    return-object p1
.end method
