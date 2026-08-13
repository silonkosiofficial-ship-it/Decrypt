.class public final Li1/d;
.super Li1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li1/d$a;
    }
.end annotation


# static fields
.field public static final N:Li1/d$a;

.field private static final O:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li1/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li1/d$a;-><init>(Ly7/k;)V

    sput-object v0, Li1/d;->N:Li1/d$a;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Li1/d;->O:Ljava/util/ArrayList;

    const-string v1, "ConstraintSets"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "Variables"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "Generate"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "Transitions"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "KeyFrames"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "KeyAttributes"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "KeyPositions"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "KeyCycles"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(Li1/d;)V
    .locals 1

    const-string v0, "clKey"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Li1/b;-><init>(Li1/b;)V

    return-void
.end method

.method public constructor <init>([C)V
    .locals 1

    const-string v0, "content"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Li1/b;-><init>([C)V

    return-void
.end method


# virtual methods
.method public bridge synthetic d()Li1/c;
    .locals 1

    invoke-virtual {p0}, Li1/d;->n0()Li1/b;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Li1/d;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Li1/d;->o0()Ljava/lang/String;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Li1/d;

    invoke-virtual {v1}, Li1/d;->o0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-super {p0, p1}, Li1/b;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, Li1/b;->hashCode()I

    move-result v0

    return v0
.end method

.method public n0()Li1/b;
    .locals 1

    new-instance v0, Li1/d;

    invoke-direct {v0, p0}, Li1/d;-><init>(Li1/d;)V

    return-object v0
.end method

.method public final o0()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Li1/c;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final p0()Li1/c;
    .locals 2

    .prologue
    invoke-virtual {p0}, Li1/b;->Z()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Li1/b;->Z()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v0, Li1/c;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method

.method public final q0(Li1/c;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, Li1/b;->Z()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Li1/b;->Z()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Li1/b;->Z()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method
