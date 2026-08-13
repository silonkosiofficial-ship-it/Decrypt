.class public LD8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP7/g;


# static fields
.field static final synthetic D:[LF7/k;


# instance fields
.field private final C:LE8/i;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ly7/G;

    const-class v1, LD8/a;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v2, "annotations"

    const-string v3, "getAnnotations()Ljava/util/List;"

    invoke-direct {v0, v1, v2, v3}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [LF7/k;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, LD8/a;->D:[LF7/k;

    return-void
.end method

.method public constructor <init>(LE8/n;Lx7/a;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "compute"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1, p2}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, LD8/a;->C:LE8/i;

    return-void
.end method

.method private final d()Ljava/util/List;
    .locals 3

    iget-object v0, p0, LD8/a;->C:LE8/i;

    sget-object v1, LD8/a;->D:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public H(Ln8/c;)Z
    .locals 0

    invoke-static {p0, p1}, LP7/g$b;->b(LP7/g;Ln8/c;)Z

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    invoke-direct {p0}, LD8/a;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    invoke-direct {p0}, LD8/a;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public j(Ln8/c;)LP7/c;
    .locals 0

    invoke-static {p0, p1}, LP7/g$b;->a(LP7/g;Ln8/c;)LP7/c;

    move-result-object p1

    return-object p1
.end method
