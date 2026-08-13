.class final Lo2/D$d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo2/D$d;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:Ly7/O;

.field final synthetic D:Z

.field final synthetic E:LZ8/g;

.field final synthetic F:[Ljava/lang/String;

.field final synthetic G:[I


# direct methods
.method constructor <init>(Ly7/O;ZLZ8/g;[Ljava/lang/String;[I)V
    .locals 0

    iput-object p1, p0, Lo2/D$d$b;->C:Ly7/O;

    iput-boolean p2, p0, Lo2/D$d$b;->D:Z

    iput-object p3, p0, Lo2/D$d$b;->E:LZ8/g;

    iput-object p4, p0, Lo2/D$d$b;->F:[Ljava/lang/String;

    iput-object p5, p0, Lo2/D$d$b;->G:[I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [I

    invoke-virtual {p0, p1, p2}, Lo2/D$d$b;->b([ILm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b([ILm7/e;)Ljava/lang/Object;
    .locals 13

    .prologue
    instance-of v0, p2, Lo2/D$d$b$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lo2/D$d$b$a;

    iget v1, v0, Lo2/D$d$b$a;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo2/D$d$b$a;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo2/D$d$b$a;

    invoke-direct {v0, p0, p2}, Lo2/D$d$b$a;-><init>(Lo2/D$d$b;Lm7/e;)V

    :goto_0
    iget-object p2, v0, Lo2/D$d$b$a;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lo2/D$d$b$a;->J:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    iget-object p1, v0, Lo2/D$d$b$a;->G:Ljava/lang/Object;

    check-cast p1, [I

    iget-object v0, v0, Lo2/D$d$b$a;->F:Ljava/lang/Object;

    check-cast v0, Lo2/D$d$b;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lo2/D$d$b;->C:Ly7/O;

    iget-object v2, p2, Ly7/O;->C:Ljava/lang/Object;

    if-nez v2, :cond_4

    iget-boolean p2, p0, Lo2/D$d$b;->D:Z

    if-eqz p2, :cond_8

    iget-object p2, p0, Lo2/D$d$b;->E:LZ8/g;

    iget-object v2, p0, Lo2/D$d$b;->F:[Ljava/lang/String;

    invoke-static {v2}, Lj7/n;->d1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    iput-object p0, v0, Lo2/D$d$b$a;->F:Ljava/lang/Object;

    iput-object p1, v0, Lo2/D$d$b$a;->G:Ljava/lang/Object;

    iput v4, v0, Lo2/D$d$b$a;->J:I

    invoke-interface {p2, v2, v0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_8

    return-object v1

    :cond_4
    iget-object v2, p0, Lo2/D$d$b;->F:[Ljava/lang/String;

    iget-object v5, p0, Lo2/D$d$b;->G:[I

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    array-length v7, v2

    const/4 v8, 0x0

    move v9, v8

    :goto_2
    if-ge v8, v7, :cond_7

    aget-object v10, v2, v8

    add-int/lit8 v11, v9, 0x1

    iget-object v12, p2, Ly7/O;->C:Ljava/lang/Object;

    if-eqz v12, :cond_6

    check-cast v12, [I

    aget v9, v5, v9

    aget v12, v12, v9

    aget v9, p1, v9

    if-eq v12, v9, :cond_5

    invoke-interface {v6, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v8, v8, 0x1

    move v9, v11

    goto :goto_2

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Required value was null."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    xor-int/2addr p2, v4

    if-eqz p2, :cond_8

    iget-object p2, p0, Lo2/D$d$b;->E:LZ8/g;

    invoke-static {v6}, Lj7/v;->Y0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    iput-object p0, v0, Lo2/D$d$b$a;->F:Ljava/lang/Object;

    iput-object p1, v0, Lo2/D$d$b$a;->G:Ljava/lang/Object;

    iput v3, v0, Lo2/D$d$b$a;->J:I

    invoke-interface {p2, v2, v0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_8

    return-object v1

    :cond_8
    move-object v0, p0

    :goto_3
    iget-object p2, v0, Lo2/D$d$b;->C:Ly7/O;

    iput-object p1, p2, Ly7/O;->C:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
