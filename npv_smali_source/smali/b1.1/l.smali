.class public final Lb1/l;
.super Lb1/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb1/l$a;,
        Lb1/l$b;
    }
.end annotation


# instance fields
.field private f:Z

.field private g:Lb1/l$b;

.field private final h:I

.field private i:I

.field private final j:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lb1/i;-><init>(Li1/f;)V

    iget v0, p0, Lb1/l;->h:I

    iput v0, p0, Lb1/l;->i:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb1/l;->j:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public d()V
    .locals 1

    invoke-super {p0}, Lb1/i;->d()V

    iget v0, p0, Lb1/l;->h:I

    iput v0, p0, Lb1/l;->i:I

    return-void
.end method

.method public final e(Landroidx/compose/ui/d;Lb1/f;Lx7/l;)Landroidx/compose/ui/d;
    .locals 3

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ref"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constrainBlock"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lb1/l;->f:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p2}, Lb1/i;->b(Lb1/w;)Li1/f;

    move-result-object v0

    new-instance v1, Lb1/e;

    invoke-virtual {p2}, Lb1/f;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lb1/e;-><init>(Ljava/lang/Object;Li1/f;)V

    invoke-interface {p3, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    new-instance v0, Lb1/l$a;

    invoke-direct {v0, p2, p3}, Lb1/l$a;-><init>(Lb1/f;Lx7/l;)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method

.method public final f()Lb1/f;
    .locals 3

    .prologue
    iget-object v0, p0, Lb1/l;->j:Ljava/util/ArrayList;

    iget v1, p0, Lb1/l;->i:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lb1/l;->i:I

    invoke-static {v0, v1}, Lj7/v;->l0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb1/f;

    if-nez v0, :cond_0

    new-instance v0, Lb1/f;

    iget v1, p0, Lb1/l;->i:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lb1/f;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lb1/l;->j:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v0
.end method

.method public final g()Lb1/l$b;
    .locals 1

    .prologue
    iget-object v0, p0, Lb1/l;->g:Lb1/l$b;

    if-nez v0, :cond_0

    new-instance v0, Lb1/l$b;

    invoke-direct {v0, p0}, Lb1/l$b;-><init>(Lb1/l;)V

    iput-object v0, p0, Lb1/l;->g:Lb1/l$b;

    :cond_0
    return-object v0
.end method
