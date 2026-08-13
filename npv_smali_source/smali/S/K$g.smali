.class final LS/K$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/K;->b(Landroidx/compose/ui/d;Ljava/lang/Long;Lx7/l;LT/f;Lx7/p;Lx7/p;ILS/L;LT/k;Ljava/util/Locale;LS/M;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:Ljava/lang/Long;

.field final synthetic F:Lx7/l;

.field final synthetic G:LT/f;

.field final synthetic H:Lx7/p;

.field final synthetic I:Lx7/p;

.field final synthetic J:I

.field final synthetic K:LS/L;

.field final synthetic L:LT/k;

.field final synthetic M:Ljava/util/Locale;

.field final synthetic N:LS/M;

.field final synthetic O:I

.field final synthetic P:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;Ljava/lang/Long;Lx7/l;LT/f;Lx7/p;Lx7/p;ILS/L;LT/k;Ljava/util/Locale;LS/M;II)V
    .locals 0

    iput-object p1, p0, LS/K$g;->D:Landroidx/compose/ui/d;

    iput-object p2, p0, LS/K$g;->E:Ljava/lang/Long;

    iput-object p3, p0, LS/K$g;->F:Lx7/l;

    iput-object p4, p0, LS/K$g;->G:LT/f;

    iput-object p5, p0, LS/K$g;->H:Lx7/p;

    iput-object p6, p0, LS/K$g;->I:Lx7/p;

    iput p7, p0, LS/K$g;->J:I

    iput-object p8, p0, LS/K$g;->K:LS/L;

    iput-object p9, p0, LS/K$g;->L:LT/k;

    iput-object p10, p0, LS/K$g;->M:Ljava/util/Locale;

    iput-object p11, p0, LS/K$g;->N:LS/M;

    iput p12, p0, LS/K$g;->O:I

    iput p13, p0, LS/K$g;->P:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 15

    move-object v0, p0

    iget-object v1, v0, LS/K$g;->D:Landroidx/compose/ui/d;

    iget-object v2, v0, LS/K$g;->E:Ljava/lang/Long;

    iget-object v3, v0, LS/K$g;->F:Lx7/l;

    iget-object v4, v0, LS/K$g;->G:LT/f;

    iget-object v5, v0, LS/K$g;->H:Lx7/p;

    iget-object v6, v0, LS/K$g;->I:Lx7/p;

    iget v7, v0, LS/K$g;->J:I

    iget-object v8, v0, LS/K$g;->K:LS/L;

    iget-object v9, v0, LS/K$g;->L:LT/k;

    iget-object v10, v0, LS/K$g;->M:Ljava/util/Locale;

    iget-object v11, v0, LS/K$g;->N:LS/M;

    iget v12, v0, LS/K$g;->O:I

    or-int/lit8 v12, v12, 0x1

    invoke-static {v12}, LV/S0;->a(I)I

    move-result v13

    iget v12, v0, LS/K$g;->P:I

    invoke-static {v12}, LV/S0;->a(I)I

    move-result v14

    move-object/from16 v12, p1

    invoke-static/range {v1 .. v14}, LS/K;->b(Landroidx/compose/ui/d;Ljava/lang/Long;Lx7/l;LT/f;Lx7/p;Lx7/p;ILS/L;LT/k;Ljava/util/Locale;LS/M;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/K$g;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
