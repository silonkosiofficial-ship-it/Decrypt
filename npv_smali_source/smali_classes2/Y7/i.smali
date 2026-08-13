.class public final LY7/i;
.super LY7/b;
.source "SourceFile"


# static fields
.field static final synthetic h:[LF7/k;


# instance fields
.field private final g:LE8/i;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ly7/G;

    const-class v1, LY7/i;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v2, "allValueArguments"

    const-string v3, "getAllValueArguments()Ljava/util/Map;"

    invoke-direct {v0, v1, v2, v3}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [LF7/k;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, LY7/i;->h:[LF7/k;

    return-void
.end method

.method public constructor <init>(Le8/a;La8/g;)V
    .locals 1

    const-string v0, "annotation"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LL7/j$a;->H:Ln8/c;

    invoke-direct {p0, p2, p1, v0}, LY7/b;-><init>(La8/g;Le8/a;Ln8/c;)V

    invoke-virtual {p2}, La8/g;->e()LE8/n;

    move-result-object p1

    new-instance p2, LY7/i$a;

    invoke-direct {p2, p0}, LY7/i$a;-><init>(LY7/i;)V

    invoke-interface {p1, p2}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, LY7/i;->g:LE8/i;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 3

    iget-object v0, p0, LY7/i;->g:LE8/i;

    sget-object v1, LY7/i;->h:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method
