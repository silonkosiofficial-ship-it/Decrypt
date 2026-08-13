.class public final LE9/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE9/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE9/b;->a(Landroidx/compose/animation/h;Landroidx/compose/animation/j;Landroidx/compose/animation/j;Landroidx/compose/animation/h;FF)LE9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Landroidx/compose/animation/h;

.field private final b:Landroidx/compose/animation/j;

.field private final c:Landroidx/compose/animation/j;

.field private final d:Landroidx/compose/animation/h;

.field private final e:F

.field private final f:F


# direct methods
.method constructor <init>(Landroidx/compose/animation/h;Landroidx/compose/animation/j;Landroidx/compose/animation/j;Landroidx/compose/animation/h;FF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE9/b$a;->a:Landroidx/compose/animation/h;

    iput-object p2, p0, LE9/b$a;->b:Landroidx/compose/animation/j;

    iput-object p3, p0, LE9/b$a;->c:Landroidx/compose/animation/j;

    iput-object p4, p0, LE9/b$a;->d:Landroidx/compose/animation/h;

    iput p5, p0, LE9/b$a;->e:F

    iput p6, p0, LE9/b$a;->f:F

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    iget v0, p0, LE9/b$a;->e:F

    return v0
.end method

.method public b()Landroidx/compose/animation/j;
    .locals 1

    iget-object v0, p0, LE9/b$a;->b:Landroidx/compose/animation/j;

    return-object v0
.end method

.method public c()F
    .locals 1

    iget v0, p0, LE9/b$a;->f:F

    return v0
.end method

.method public d()Landroidx/compose/animation/j;
    .locals 1

    iget-object v0, p0, LE9/b$a;->c:Landroidx/compose/animation/j;

    return-object v0
.end method

.method public e()Landroidx/compose/animation/h;
    .locals 1

    iget-object v0, p0, LE9/b$a;->d:Landroidx/compose/animation/h;

    return-object v0
.end method

.method public f()Landroidx/compose/animation/h;
    .locals 1

    iget-object v0, p0, LE9/b$a;->a:Landroidx/compose/animation/h;

    return-object v0
.end method
