.class public final LN7/f;
.super LL7/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN7/f$a;,
        LN7/f$b;,
        LN7/f$c;
    }
.end annotation


# static fields
.field static final synthetic k:[LF7/k;


# instance fields
.field private final h:LN7/f$a;

.field private i:Lx7/a;

.field private final j:LE8/i;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ly7/G;

    const-class v1, LN7/f;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v2, "customizer"

    const-string v3, "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"

    invoke-direct {v0, v1, v2, v3}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [LF7/k;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, LN7/f;->k:[LF7/k;

    return-void
.end method

.method public constructor <init>(LE8/n;LN7/f$a;)V
    .locals 1

    .prologue
    const-string v0, "storageManager"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LL7/g;-><init>(LE8/n;)V

    iput-object p2, p0, LN7/f;->h:LN7/f$a;

    new-instance v0, LN7/f$d;

    invoke-direct {v0, p0, p1}, LN7/f$d;-><init>(LN7/f;LE8/n;)V

    invoke-interface {p1, v0}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, LN7/f;->j:LE8/i;

    sget-object p1, LN7/f$c;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x2

    if-eq p1, p2, :cond_1

    const/4 p2, 0x3

    if-eq p1, p2, :cond_0

    goto :goto_1

    :cond_0
    const/4 p1, 0x1

    :goto_0
    invoke-virtual {p0, p1}, LL7/g;->f(Z)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    return-void
.end method

.method public static final synthetic F0(LN7/f;)Lx7/a;
    .locals 0

    iget-object p0, p0, LN7/f;->i:Lx7/a;

    return-object p0
.end method

.method public static final synthetic G0(LN7/f;Lx7/a;)V
    .locals 0

    iput-object p1, p0, LN7/f;->i:Lx7/a;

    return-void
.end method


# virtual methods
.method protected H0()Ljava/util/List;
    .locals 8

    invoke-super {p0}, LL7/g;->v()Ljava/lang/Iterable;

    move-result-object v0

    const-string v1, "getClassDescriptorFactories(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LN7/e;

    invoke-virtual {p0}, LL7/g;->U()LE8/n;

    move-result-object v3

    const-string v2, "getStorageManager(...)"

    invoke-static {v3, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LL7/g;->r()LR7/x;

    move-result-object v4

    const-string v2, "getBuiltInsModule(...)"

    invoke-static {v4, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, LN7/e;-><init>(LE8/n;LO7/G;Lx7/l;ILy7/k;)V

    invoke-static {v0, v1}, Lj7/v;->B0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final I0()LN7/i;
    .locals 3

    iget-object v0, p0, LN7/f;->j:LE8/i;

    sget-object v1, LN7/f;->k:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN7/i;

    return-object v0
.end method

.method public final J0(LO7/G;Z)V
    .locals 1

    const-string v0, "moduleDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LN7/f$e;

    invoke-direct {v0, p1, p2}, LN7/f$e;-><init>(LO7/G;Z)V

    invoke-virtual {p0, v0}, LN7/f;->K0(Lx7/a;)V

    return-void
.end method

.method public final K0(Lx7/a;)V
    .locals 1

    const-string v0, "computation"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LN7/f;->i:Lx7/a;

    return-void
.end method

.method protected M()LQ7/c;
    .locals 1

    invoke-virtual {p0}, LN7/f;->I0()LN7/i;

    move-result-object v0

    return-object v0
.end method

.method protected g()LQ7/a;
    .locals 1

    invoke-virtual {p0}, LN7/f;->I0()LN7/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic v()Ljava/lang/Iterable;
    .locals 1

    invoke-virtual {p0}, LN7/f;->H0()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    return-object v0
.end method
