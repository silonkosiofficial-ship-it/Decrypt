.class final LC/r$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/r;->a(Landroidx/compose/ui/d;LC/K;LC/H;LA/B;ZZLx/p;ZLA/b$m;LA/b$e;Lx7/l;LV/n;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:LC/K;

.field final synthetic F:LC/H;

.field final synthetic G:LA/B;

.field final synthetic H:Z

.field final synthetic I:Z

.field final synthetic J:Lx/p;

.field final synthetic K:Z

.field final synthetic L:LA/b$m;

.field final synthetic M:LA/b$e;

.field final synthetic N:Lx7/l;

.field final synthetic O:I

.field final synthetic P:I

.field final synthetic Q:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;LC/K;LC/H;LA/B;ZZLx/p;ZLA/b$m;LA/b$e;Lx7/l;III)V
    .locals 0

    iput-object p1, p0, LC/r$a;->D:Landroidx/compose/ui/d;

    iput-object p2, p0, LC/r$a;->E:LC/K;

    iput-object p3, p0, LC/r$a;->F:LC/H;

    iput-object p4, p0, LC/r$a;->G:LA/B;

    iput-boolean p5, p0, LC/r$a;->H:Z

    iput-boolean p6, p0, LC/r$a;->I:Z

    iput-object p7, p0, LC/r$a;->J:Lx/p;

    iput-boolean p8, p0, LC/r$a;->K:Z

    iput-object p9, p0, LC/r$a;->L:LA/b$m;

    iput-object p10, p0, LC/r$a;->M:LA/b$e;

    iput-object p11, p0, LC/r$a;->N:Lx7/l;

    iput p12, p0, LC/r$a;->O:I

    iput p13, p0, LC/r$a;->P:I

    iput p14, p0, LC/r$a;->Q:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, LC/r$a;->D:Landroidx/compose/ui/d;

    iget-object v2, v0, LC/r$a;->E:LC/K;

    iget-object v3, v0, LC/r$a;->F:LC/H;

    iget-object v4, v0, LC/r$a;->G:LA/B;

    iget-boolean v5, v0, LC/r$a;->H:Z

    iget-boolean v6, v0, LC/r$a;->I:Z

    iget-object v7, v0, LC/r$a;->J:Lx/p;

    iget-boolean v8, v0, LC/r$a;->K:Z

    iget-object v9, v0, LC/r$a;->L:LA/b$m;

    iget-object v10, v0, LC/r$a;->M:LA/b$e;

    iget-object v11, v0, LC/r$a;->N:Lx7/l;

    iget v12, v0, LC/r$a;->O:I

    or-int/lit8 v12, v12, 0x1

    invoke-static {v12}, LV/S0;->a(I)I

    move-result v13

    iget v12, v0, LC/r$a;->P:I

    invoke-static {v12}, LV/S0;->a(I)I

    move-result v14

    iget v15, v0, LC/r$a;->Q:I

    move-object/from16 v12, p1

    invoke-static/range {v1 .. v15}, LC/r;->a(Landroidx/compose/ui/d;LC/K;LC/H;LA/B;ZZLx/p;ZLA/b$m;LA/b$e;Lx7/l;LV/n;III)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LC/r$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
