.class final LS/T$E;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->k(Landroidx/compose/ui/d;ZZZLjava/lang/String;Lx7/a;Lx7/a;Lx7/a;LS/M;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:Z

.field final synthetic F:Z

.field final synthetic G:Z

.field final synthetic H:Ljava/lang/String;

.field final synthetic I:Lx7/a;

.field final synthetic J:Lx7/a;

.field final synthetic K:Lx7/a;

.field final synthetic L:LS/M;

.field final synthetic M:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;ZZZLjava/lang/String;Lx7/a;Lx7/a;Lx7/a;LS/M;I)V
    .locals 0

    iput-object p1, p0, LS/T$E;->D:Landroidx/compose/ui/d;

    iput-boolean p2, p0, LS/T$E;->E:Z

    iput-boolean p3, p0, LS/T$E;->F:Z

    iput-boolean p4, p0, LS/T$E;->G:Z

    iput-object p5, p0, LS/T$E;->H:Ljava/lang/String;

    iput-object p6, p0, LS/T$E;->I:Lx7/a;

    iput-object p7, p0, LS/T$E;->J:Lx7/a;

    iput-object p8, p0, LS/T$E;->K:Lx7/a;

    iput-object p9, p0, LS/T$E;->L:LS/M;

    iput p10, p0, LS/T$E;->M:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 11

    iget-object v0, p0, LS/T$E;->D:Landroidx/compose/ui/d;

    iget-boolean v1, p0, LS/T$E;->E:Z

    iget-boolean v2, p0, LS/T$E;->F:Z

    iget-boolean v3, p0, LS/T$E;->G:Z

    iget-object v4, p0, LS/T$E;->H:Ljava/lang/String;

    iget-object v5, p0, LS/T$E;->I:Lx7/a;

    iget-object v6, p0, LS/T$E;->J:Lx7/a;

    iget-object v7, p0, LS/T$E;->K:Lx7/a;

    iget-object v8, p0, LS/T$E;->L:LS/M;

    iget p2, p0, LS/T$E;->M:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v10

    move-object v9, p1

    invoke-static/range {v0 .. v10}, LS/T;->v(Landroidx/compose/ui/d;ZZZLjava/lang/String;Lx7/a;Lx7/a;Lx7/a;LS/M;LV/n;I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/T$E;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
