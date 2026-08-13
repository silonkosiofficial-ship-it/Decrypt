.class final LS/a0$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/a0;->a(Landroidx/compose/ui/d;FJLV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:F

.field final synthetic E:J


# direct methods
.method constructor <init>(FJ)V
    .locals 0

    iput p1, p0, LS/a0$a;->D:F

    iput-wide p2, p0, LS/a0$a;->E:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq0/g;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, LS/a0$a;->D:F

    invoke-interface {v1, v2}, LY0/e;->B0(F)F

    move-result v8

    iget v2, v0, LS/a0$a;->D:F

    invoke-interface {v1, v2}, LY0/e;->B0(F)F

    move-result v2

    const/4 v3, 0x2

    int-to-float v3, v3

    div-float/2addr v2, v3

    const/4 v4, 0x0

    invoke-static {v4, v2}, Ln0/h;->a(FF)J

    move-result-wide v4

    invoke-interface/range {p1 .. p1}, Lq0/g;->i()J

    move-result-wide v6

    invoke-static {v6, v7}, Ln0/m;->i(J)F

    move-result v2

    iget v6, v0, LS/a0$a;->D:F

    invoke-interface {v1, v6}, LY0/e;->B0(F)F

    move-result v6

    div-float/2addr v6, v3

    invoke-static {v2, v6}, Ln0/h;->a(FF)J

    move-result-wide v6

    iget-wide v2, v0, LS/a0$a;->E:J

    const/16 v14, 0x1f0

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v1 .. v15}, Lq0/f;->i(Lq0/g;JJJFILo0/R1;FLo0/z0;IILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq0/g;

    invoke-virtual {p0, p1}, LS/a0$a;->a(Lq0/g;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
