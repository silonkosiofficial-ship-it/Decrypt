.class public final Landroidx/compose/ui/platform/K0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lx7/p;

.field private b:Landroid/graphics/Matrix;

.field private c:Landroid/graphics/Matrix;

.field private d:[F

.field private e:[F

.field private f:Z

.field private g:Z

.field private h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lx7/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/K0;->a:Lx7/p;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/compose/ui/platform/K0;->f:Z

    iput-boolean p1, p0, Landroidx/compose/ui/platform/K0;->g:Z

    iput-boolean p1, p0, Landroidx/compose/ui/platform/K0;->h:Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)[F
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/K0;->e:[F

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {v1, v0, v1}, Lo0/J1;->c([FILy7/k;)[F

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/K0;->e:[F

    :cond_0
    iget-boolean v2, p0, Landroidx/compose/ui/platform/K0;->g:Z

    if-eqz v2, :cond_1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/K0;->b(Ljava/lang/Object;)[F

    move-result-object p1

    invoke-static {p1, v0}, Landroidx/compose/ui/platform/I0;->a([F[F)Z

    move-result p1

    iput-boolean p1, p0, Landroidx/compose/ui/platform/K0;->h:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/compose/ui/platform/K0;->g:Z

    :cond_1
    iget-boolean p1, p0, Landroidx/compose/ui/platform/K0;->h:Z

    if-eqz p1, :cond_2

    move-object v1, v0

    :cond_2
    return-object v1
.end method

.method public final b(Ljava/lang/Object;)[F
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/K0;->d:[F

    if-nez v0, :cond_0

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v1, v0, v1}, Lo0/J1;->c([FILy7/k;)[F

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/K0;->d:[F

    :cond_0
    iget-boolean v1, p0, Landroidx/compose/ui/platform/K0;->f:Z

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    iget-object v1, p0, Landroidx/compose/ui/platform/K0;->b:Landroid/graphics/Matrix;

    if-nez v1, :cond_2

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Landroidx/compose/ui/platform/K0;->b:Landroid/graphics/Matrix;

    :cond_2
    iget-object v2, p0, Landroidx/compose/ui/platform/K0;->a:Lx7/p;

    invoke-interface {v2, p1, v1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Landroidx/compose/ui/platform/K0;->c:Landroid/graphics/Matrix;

    if-eqz p1, :cond_3

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    :cond_3
    invoke-static {v0, v1}, Lo0/S;->b([FLandroid/graphics/Matrix;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/K0;->b:Landroid/graphics/Matrix;

    iput-object v1, p0, Landroidx/compose/ui/platform/K0;->c:Landroid/graphics/Matrix;

    :cond_4
    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/compose/ui/platform/K0;->f:Z

    return-object v0
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/K0;->f:Z

    iput-boolean v0, p0, Landroidx/compose/ui/platform/K0;->g:Z

    return-void
.end method
