.class public final LS/j1$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/j1;->n(Landroidx/compose/ui/d;ZZLz/j;LS/i1;FF)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic D:Z

.field final synthetic E:Z

.field final synthetic F:Lz/j;

.field final synthetic G:LS/i1;

.field final synthetic H:F

.field final synthetic I:F


# direct methods
.method public constructor <init>(ZZLz/j;LS/i1;FF)V
    .locals 0

    iput-boolean p1, p0, LS/j1$f;->D:Z

    iput-boolean p2, p0, LS/j1$f;->E:Z

    iput-object p3, p0, LS/j1$f;->F:Lz/j;

    iput-object p4, p0, LS/j1$f;->G:LS/i1;

    iput p5, p0, LS/j1$f;->H:F

    iput p6, p0, LS/j1$f;->I:F

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/platform/G0;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LS/j1$f;->a(Landroidx/compose/ui/platform/G0;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
