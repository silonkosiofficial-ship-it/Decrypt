.class public abstract LI7/y$c;
.super LI7/y$a;
.source "SourceFile"

# interfaces
.implements LF7/k$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI7/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation


# static fields
.field static final synthetic K:[LF7/k;


# instance fields
.field private final I:LI7/F$a;

.field private final J:Li7/n;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ly7/G;

    const-class v1, LI7/y$c;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v2, "descriptor"

    const-string v3, "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"

    invoke-direct {v0, v1, v2, v3}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [LF7/k;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, LI7/y$c;->K:[LF7/k;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LI7/y$a;-><init>()V

    new-instance v0, LI7/y$c$b;

    invoke-direct {v0, p0}, LI7/y$c$b;-><init>(LI7/y$c;)V

    invoke-static {v0}, LI7/F;->c(Lx7/a;)LI7/F$a;

    move-result-object v0

    iput-object v0, p0, LI7/y$c;->I:LI7/F$a;

    sget-object v0, Li7/r;->D:Li7/r;

    new-instance v1, LI7/y$c$a;

    invoke-direct {v1, p0}, LI7/y$c$a;-><init>(LI7/y$c;)V

    invoke-static {v0, v1}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object v0

    iput-object v0, p0, LI7/y$c;->J:Li7/n;

    return-void
.end method


# virtual methods
.method public bridge synthetic A()LO7/b;
    .locals 1

    invoke-virtual {p0}, LI7/y$c;->H()LO7/V;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic F()LO7/T;
    .locals 1

    invoke-virtual {p0}, LI7/y$c;->H()LO7/V;

    move-result-object v0

    return-object v0
.end method

.method public H()LO7/V;
    .locals 3

    iget-object v0, p0, LI7/y$c;->I:LI7/F$a;

    sget-object v1, LI7/y$c;->K:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, LI7/F$b;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LO7/V;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, LI7/y$c;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LI7/y$a;->G()LI7/y;

    move-result-object v0

    check-cast p1, LI7/y$c;

    invoke-virtual {p1}, LI7/y$a;->G()LI7/y;

    move-result-object p1

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<get-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LI7/y$a;->G()LI7/y;

    move-result-object v1

    invoke-virtual {v1}, LI7/y;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, LI7/y$a;->G()LI7/y;

    move-result-object v0

    invoke-virtual {v0}, LI7/y;->hashCode()I

    move-result v0

    return v0
.end method

.method public s()LJ7/e;
    .locals 1

    iget-object v0, p0, LI7/y$c;->J:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ7/e;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getter of "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LI7/y$a;->G()LI7/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
