.class LY7/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY7/a$a;->a(LO7/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:LY7/a$a;


# direct methods
.method constructor <init>(LY7/a$a;)V
    .locals 0

    iput-object p1, p0, LY7/a$a$a;->C:LY7/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static synthetic a(I)V
    .locals 2

    const/4 p0, 0x3

    new-array p0, p0, [Ljava/lang/Object;

    const-string v0, "descriptor"

    const/4 v1, 0x0

    aput-object v0, p0, v1

    const-string v0, "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1"

    const/4 v1, 0x1

    aput-object v0, p0, v1

    const-string v0, "invoke"

    const/4 v1, 0x2

    aput-object v0, p0, v1

    const-string v0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public e(LO7/b;)Li7/M;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LY7/a$a$a;->a(I)V

    :cond_0
    iget-object v0, p0, LY7/a$a$a;->C:LY7/a$a;

    iget-object v0, v0, LY7/a$a;->a:LB8/r;

    invoke-interface {v0, p1}, LB8/r;->a(LO7/b;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/b;

    invoke-virtual {p0, p1}, LY7/a$a$a;->e(LO7/b;)Li7/M;

    move-result-object p1

    return-object p1
.end method
