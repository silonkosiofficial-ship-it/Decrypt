.class final LS/t0$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/t0;->f(LD0/M;LD0/G;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:I

.field final synthetic E:LD0/X;

.field final synthetic F:I


# direct methods
.method constructor <init>(ILD0/X;I)V
    .locals 0

    iput p1, p0, LS/t0$a;->D:I

    iput-object p2, p0, LS/t0$a;->E:LD0/X;

    iput p3, p0, LS/t0$a;->F:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 9

    iget v0, p0, LS/t0$a;->D:I

    iget-object v1, p0, LS/t0$a;->E:LD0/X;

    invoke-virtual {v1}, LD0/X;->I0()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-static {v0}, LA7/a;->d(F)I

    move-result v4

    iget v0, p0, LS/t0$a;->F:I

    iget-object v2, p0, LS/t0$a;->E:LD0/X;

    invoke-virtual {v2}, LD0/X;->w0()I

    move-result v2

    sub-int/2addr v0, v2

    int-to-float v0, v0

    div-float/2addr v0, v1

    invoke-static {v0}, LA7/a;->d(F)I

    move-result v5

    iget-object v3, p0, LS/t0$a;->E:LD0/X;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v8}, LD0/X$a;->h(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, LS/t0$a;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
