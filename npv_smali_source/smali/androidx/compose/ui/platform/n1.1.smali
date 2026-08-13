.class public final Landroidx/compose/ui/platform/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/p0;


# instance fields
.field private final C:I

.field private final D:Ljava/util/List;

.field private E:Ljava/lang/Float;

.field private F:Ljava/lang/Float;

.field private G:LK0/i;

.field private H:LK0/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;LK0/i;LK0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/compose/ui/platform/n1;->C:I

    iput-object p2, p0, Landroidx/compose/ui/platform/n1;->D:Ljava/util/List;

    iput-object p3, p0, Landroidx/compose/ui/platform/n1;->E:Ljava/lang/Float;

    iput-object p4, p0, Landroidx/compose/ui/platform/n1;->F:Ljava/lang/Float;

    iput-object p5, p0, Landroidx/compose/ui/platform/n1;->G:LK0/i;

    iput-object p6, p0, Landroidx/compose/ui/platform/n1;->H:LK0/i;

    return-void
.end method


# virtual methods
.method public R()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/n1;->D:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final a()LK0/i;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/n1;->G:LK0/i;

    return-object v0
.end method

.method public final b()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/n1;->E:Ljava/lang/Float;

    return-object v0
.end method

.method public final c()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/n1;->F:Ljava/lang/Float;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/platform/n1;->C:I

    return v0
.end method

.method public final e()LK0/i;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/n1;->H:LK0/i;

    return-object v0
.end method

.method public final f(LK0/i;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/n1;->G:LK0/i;

    return-void
.end method

.method public final g(Ljava/lang/Float;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/n1;->E:Ljava/lang/Float;

    return-void
.end method

.method public final h(Ljava/lang/Float;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/n1;->F:Ljava/lang/Float;

    return-void
.end method

.method public final i(LK0/i;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/n1;->H:LK0/i;

    return-void
.end method
