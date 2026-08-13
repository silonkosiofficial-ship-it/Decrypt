.class final LS/B0$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/B0;->a(Landroidx/compose/ui/d;JFJILV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:J

.field final synthetic E:Lq0/m;

.field final synthetic F:LV/G1;

.field final synthetic G:LV/G1;

.field final synthetic H:LV/G1;

.field final synthetic I:LV/G1;

.field final synthetic J:F

.field final synthetic K:J


# direct methods
.method constructor <init>(JLq0/m;LV/G1;LV/G1;LV/G1;LV/G1;FJ)V
    .locals 0

    iput-wide p1, p0, LS/B0$a;->D:J

    iput-object p3, p0, LS/B0$a;->E:Lq0/m;

    iput-object p4, p0, LS/B0$a;->F:LV/G1;

    iput-object p5, p0, LS/B0$a;->G:LV/G1;

    iput-object p6, p0, LS/B0$a;->H:LV/G1;

    iput-object p7, p0, LS/B0$a;->I:LV/G1;

    iput p8, p0, LS/B0$a;->J:F

    iput-wide p9, p0, LS/B0$a;->K:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq0/g;)V
    .locals 9

    iget-wide v0, p0, LS/B0$a;->D:J

    iget-object v2, p0, LS/B0$a;->E:Lq0/m;

    invoke-static {p1, v0, v1, v2}, LS/B0;->b(Lq0/g;JLq0/m;)V

    iget-object v0, p0, LS/B0$a;->F:LV/G1;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    const/high16 v1, 0x43580000    # 216.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x43b40000    # 360.0f

    rem-float/2addr v0, v1

    iget-object v1, p0, LS/B0$a;->G:LV/G1;

    invoke-interface {v1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iget-object v2, p0, LS/B0$a;->H:LV/G1;

    invoke-interface {v2}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v5

    const/high16 v1, -0x3d4c0000    # -90.0f

    add-float/2addr v0, v1

    iget-object v1, p0, LS/B0$a;->I:LV/G1;

    invoke-interface {v1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    add-float/2addr v0, v1

    iget-object v1, p0, LS/B0$a;->H:LV/G1;

    invoke-interface {v1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    add-float v3, v1, v0

    iget v4, p0, LS/B0$a;->J:F

    iget-wide v6, p0, LS/B0$a;->K:J

    iget-object v8, p0, LS/B0$a;->E:Lq0/m;

    move-object v2, p1

    invoke-static/range {v2 .. v8}, LS/B0;->c(Lq0/g;FFFJLq0/m;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq0/g;

    invoke-virtual {p0, p1}, LS/B0$a;->a(Lq0/g;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
