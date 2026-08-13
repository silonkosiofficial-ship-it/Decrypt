.class final LS/d1$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/d1;->b(ZLx7/a;Landroidx/compose/ui/d;ZLx7/p;Lx7/p;JJLz/l;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Z

.field final synthetic E:Lx7/a;

.field final synthetic F:Landroidx/compose/ui/d;

.field final synthetic G:Z

.field final synthetic H:Lx7/p;

.field final synthetic I:Lx7/p;

.field final synthetic J:J

.field final synthetic K:J

.field final synthetic L:Lz/l;

.field final synthetic M:I

.field final synthetic N:I


# direct methods
.method constructor <init>(ZLx7/a;Landroidx/compose/ui/d;ZLx7/p;Lx7/p;JJLz/l;II)V
    .locals 0

    iput-boolean p1, p0, LS/d1$b;->D:Z

    iput-object p2, p0, LS/d1$b;->E:Lx7/a;

    iput-object p3, p0, LS/d1$b;->F:Landroidx/compose/ui/d;

    iput-boolean p4, p0, LS/d1$b;->G:Z

    iput-object p5, p0, LS/d1$b;->H:Lx7/p;

    iput-object p6, p0, LS/d1$b;->I:Lx7/p;

    iput-wide p7, p0, LS/d1$b;->J:J

    iput-wide p9, p0, LS/d1$b;->K:J

    iput-object p11, p0, LS/d1$b;->L:Lz/l;

    iput p12, p0, LS/d1$b;->M:I

    iput p13, p0, LS/d1$b;->N:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 15

    move-object v0, p0

    iget-boolean v1, v0, LS/d1$b;->D:Z

    iget-object v2, v0, LS/d1$b;->E:Lx7/a;

    iget-object v3, v0, LS/d1$b;->F:Landroidx/compose/ui/d;

    iget-boolean v4, v0, LS/d1$b;->G:Z

    iget-object v5, v0, LS/d1$b;->H:Lx7/p;

    iget-object v6, v0, LS/d1$b;->I:Lx7/p;

    iget-wide v7, v0, LS/d1$b;->J:J

    iget-wide v9, v0, LS/d1$b;->K:J

    iget-object v11, v0, LS/d1$b;->L:Lz/l;

    iget v12, v0, LS/d1$b;->M:I

    or-int/lit8 v12, v12, 0x1

    invoke-static {v12}, LV/S0;->a(I)I

    move-result v13

    iget v14, v0, LS/d1$b;->N:I

    move-object/from16 v12, p1

    invoke-static/range {v1 .. v14}, LS/d1;->b(ZLx7/a;Landroidx/compose/ui/d;ZLx7/p;Lx7/p;JJLz/l;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/d1$b;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
