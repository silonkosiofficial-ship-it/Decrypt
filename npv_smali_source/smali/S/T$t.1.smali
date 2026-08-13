.class final LS/T$t;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->g(Landroidx/compose/ui/d;ZLx7/a;ZZZZLjava/lang/String;LS/M;Lx7/p;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:Z

.field final synthetic F:Lx7/a;

.field final synthetic G:Z

.field final synthetic H:Z

.field final synthetic I:Z

.field final synthetic J:Z

.field final synthetic K:Ljava/lang/String;

.field final synthetic L:LS/M;

.field final synthetic M:Lx7/p;

.field final synthetic N:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;ZLx7/a;ZZZZLjava/lang/String;LS/M;Lx7/p;I)V
    .locals 0

    iput-object p1, p0, LS/T$t;->D:Landroidx/compose/ui/d;

    iput-boolean p2, p0, LS/T$t;->E:Z

    iput-object p3, p0, LS/T$t;->F:Lx7/a;

    iput-boolean p4, p0, LS/T$t;->G:Z

    iput-boolean p5, p0, LS/T$t;->H:Z

    iput-boolean p6, p0, LS/T$t;->I:Z

    iput-boolean p7, p0, LS/T$t;->J:Z

    iput-object p8, p0, LS/T$t;->K:Ljava/lang/String;

    iput-object p9, p0, LS/T$t;->L:LS/M;

    iput-object p10, p0, LS/T$t;->M:Lx7/p;

    iput p11, p0, LS/T$t;->N:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 12

    iget-object v0, p0, LS/T$t;->D:Landroidx/compose/ui/d;

    iget-boolean v1, p0, LS/T$t;->E:Z

    iget-object v2, p0, LS/T$t;->F:Lx7/a;

    iget-boolean v3, p0, LS/T$t;->G:Z

    iget-boolean v4, p0, LS/T$t;->H:Z

    iget-boolean v5, p0, LS/T$t;->I:Z

    iget-boolean v6, p0, LS/T$t;->J:Z

    iget-object v7, p0, LS/T$t;->K:Ljava/lang/String;

    iget-object v8, p0, LS/T$t;->L:LS/M;

    iget-object v9, p0, LS/T$t;->M:Lx7/p;

    iget p2, p0, LS/T$t;->N:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v11

    move-object v10, p1

    invoke-static/range {v0 .. v11}, LS/T;->t(Landroidx/compose/ui/d;ZLx7/a;ZZZZLjava/lang/String;LS/M;Lx7/p;LV/n;I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/T$t;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
