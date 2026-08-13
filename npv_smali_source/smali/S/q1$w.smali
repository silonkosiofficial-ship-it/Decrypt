.class final LS/q1$w;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/q1;->p(Landroidx/compose/ui/d;ILS/t1;ILS/o1;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:I

.field final synthetic E:LS/t1;


# direct methods
.method constructor <init>(ILS/t1;)V
    .locals 0

    iput p1, p0, LS/q1$w;->D:I

    iput-object p2, p0, LS/q1$w;->E:LS/t1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    iget v0, p0, LS/q1$w;->D:I

    iget-object v1, p0, LS/q1$w;->E:LS/t1;

    invoke-interface {v1}, LS/t1;->g()I

    move-result v1

    invoke-static {v0, v1}, LS/s1;->f(II)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LS/q1$w;->E:LS/t1;

    iget v1, p0, LS/q1$w;->D:I

    invoke-interface {v0, v1}, LS/t1;->f(I)V

    :cond_0
    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LS/q1$w;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
