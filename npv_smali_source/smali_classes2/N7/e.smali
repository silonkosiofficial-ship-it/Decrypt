.class public final LN7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ7/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN7/e$b;
    }
.end annotation


# static fields
.field public static final d:LN7/e$b;

.field static final synthetic e:[LF7/k;

.field private static final f:Ln8/c;

.field private static final g:Ln8/f;

.field private static final h:Ln8/b;


# instance fields
.field private final a:LO7/G;

.field private final b:Lx7/l;

.field private final c:LE8/i;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ly7/G;

    const-class v1, LN7/e;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v2, "cloneable"

    const-string v3, "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"

    invoke-direct {v0, v1, v2, v3}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [LF7/k;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, LN7/e;->e:[LF7/k;

    new-instance v0, LN7/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LN7/e$b;-><init>(Ly7/k;)V

    sput-object v0, LN7/e;->d:LN7/e$b;

    sget-object v0, LL7/j;->y:Ln8/c;

    sput-object v0, LN7/e;->f:Ln8/c;

    sget-object v0, LL7/j$a;->d:Ln8/d;

    invoke-virtual {v0}, Ln8/d;->i()Ln8/f;

    move-result-object v1

    const-string v2, "shortName(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v1, LN7/e;->g:Ln8/f;

    invoke-virtual {v0}, Ln8/d;->l()Ln8/c;

    move-result-object v0

    invoke-static {v0}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v0

    const-string v1, "topLevel(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LN7/e;->h:Ln8/b;

    return-void
.end method

.method public constructor <init>(LE8/n;LO7/G;Lx7/l;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moduleDescriptor"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "computeContainingDeclaration"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LN7/e;->a:LO7/G;

    iput-object p3, p0, LN7/e;->b:Lx7/l;

    new-instance p2, LN7/e$c;

    invoke-direct {p2, p0, p1}, LN7/e$c;-><init>(LN7/e;LE8/n;)V

    invoke-interface {p1, p2}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, LN7/e;->c:LE8/i;

    return-void
.end method

.method public synthetic constructor <init>(LE8/n;LO7/G;Lx7/l;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    sget-object p3, LN7/e$a;->D:LN7/e$a;

    :cond_0
    invoke-direct {p0, p1, p2, p3}, LN7/e;-><init>(LE8/n;LO7/G;Lx7/l;)V

    return-void
.end method

.method public static final synthetic d()Ln8/b;
    .locals 1

    sget-object v0, LN7/e;->h:Ln8/b;

    return-object v0
.end method

.method public static final synthetic e()Ln8/f;
    .locals 1

    sget-object v0, LN7/e;->g:Ln8/f;

    return-object v0
.end method

.method public static final synthetic f(LN7/e;)Lx7/l;
    .locals 0

    iget-object p0, p0, LN7/e;->b:Lx7/l;

    return-object p0
.end method

.method public static final synthetic g()Ln8/c;
    .locals 1

    sget-object v0, LN7/e;->f:Ln8/c;

    return-object v0
.end method

.method public static final synthetic h(LN7/e;)LO7/G;
    .locals 0

    iget-object p0, p0, LN7/e;->a:LO7/G;

    return-object p0
.end method

.method private final i()LR7/h;
    .locals 3

    iget-object v0, p0, LN7/e;->c:LE8/i;

    sget-object v1, LN7/e;->e:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LR7/h;

    return-object v0
.end method


# virtual methods
.method public a(Ln8/c;)Ljava/util/Collection;
    .locals 1

    .prologue
    const-string v0, "packageFqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LN7/e;->f:Ln8/c;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, LN7/e;->i()LR7/h;

    move-result-object p1

    invoke-static {p1}, Lj7/Z;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    :goto_0
    check-cast p1, Ljava/util/Collection;

    goto :goto_1

    :cond_0
    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p1

    goto :goto_0

    :goto_1
    return-object p1
.end method

.method public b(Ln8/c;Ln8/f;)Z
    .locals 1

    .prologue
    const-string v0, "packageFqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LN7/e;->g:Ln8/f;

    invoke-static {p2, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, LN7/e;->f:Ln8/c;

    invoke-static {p1, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public c(Ln8/b;)LO7/e;
    .locals 1

    .prologue
    const-string v0, "classId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LN7/e;->h:Ln8/b;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, LN7/e;->i()LR7/h;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
