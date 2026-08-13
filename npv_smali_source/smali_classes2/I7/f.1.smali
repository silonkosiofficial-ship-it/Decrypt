.class public final LI7/f;
.super LI7/n;
.source "SourceFile"


# static fields
.field public static final F:LI7/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI7/f;

    invoke-direct {v0}, LI7/f;-><init>()V

    sput-object v0, LI7/f;->F:LI7/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LI7/n;-><init>()V

    return-void
.end method

.method private final D()Ljava/lang/Void;
    .locals 2

    new-instance v0, LI7/D;

    const-string v1, "Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection"

    invoke-direct {v0, v1}, LI7/D;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public e()Ljava/lang/Class;
    .locals 1

    invoke-direct {p0}, LI7/f;->D()Ljava/lang/Void;

    const/4 v0, 0x0

    throw v0
.end method

.method public q()Ljava/util/Collection;
    .locals 1

    invoke-direct {p0}, LI7/f;->D()Ljava/lang/Void;

    const/4 v0, 0x0

    throw v0
.end method

.method public r(Ln8/f;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LI7/f;->D()Ljava/lang/Void;

    const/4 p1, 0x0

    throw p1
.end method

.method public t(I)LO7/U;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public w(Ln8/f;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LI7/f;->D()Ljava/lang/Void;

    const/4 p1, 0x0

    throw p1
.end method
