.class public final Lt/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroidx/compose/animation/h;

.field private final b:Landroidx/compose/animation/j;

.field private final c:LV/q0;

.field private d:Lt/x;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/animation/h;Landroidx/compose/animation/j;FLt/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt/k;->a:Landroidx/compose/animation/h;

    iput-object p2, p0, Lt/k;->b:Landroidx/compose/animation/j;

    invoke-static {p3}, LV/J0;->a(F)LV/q0;

    move-result-object p1

    iput-object p1, p0, Lt/k;->c:LV/q0;

    iput-object p4, p0, Lt/k;->d:Lt/x;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/animation/h;Landroidx/compose/animation/j;FLt/x;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/4 p3, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const/4 p4, 0x0

    const/4 p5, 0x3

    const/4 p6, 0x0

    invoke-static {p4, p6, p5, p6}, Landroidx/compose/animation/a;->d(ZLx7/p;ILjava/lang/Object;)Lt/x;

    move-result-object p4

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lt/k;-><init>(Landroidx/compose/animation/h;Landroidx/compose/animation/j;FLt/x;)V

    return-void
.end method


# virtual methods
.method public final a()Landroidx/compose/animation/j;
    .locals 1

    iget-object v0, p0, Lt/k;->b:Landroidx/compose/animation/j;

    return-object v0
.end method

.method public final b()Lt/x;
    .locals 1

    iget-object v0, p0, Lt/k;->d:Lt/x;

    return-object v0
.end method

.method public final c()Landroidx/compose/animation/h;
    .locals 1

    iget-object v0, p0, Lt/k;->a:Landroidx/compose/animation/h;

    return-object v0
.end method

.method public final d()F
    .locals 1

    iget-object v0, p0, Lt/k;->c:LV/q0;

    invoke-interface {v0}, LV/S;->b()F

    move-result v0

    return v0
.end method

.method public final e(Lt/x;)V
    .locals 0

    iput-object p1, p0, Lt/k;->d:Lt/x;

    return-void
.end method
