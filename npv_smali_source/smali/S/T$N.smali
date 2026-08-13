.class final LS/T$N;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->n(Landroidx/compose/ui/d;ZZLx7/a;ZLjava/lang/String;LS/M;Lx7/p;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:Z

.field final synthetic F:Z

.field final synthetic G:Lx7/a;

.field final synthetic H:Z

.field final synthetic I:Ljava/lang/String;

.field final synthetic J:LS/M;

.field final synthetic K:Lx7/p;

.field final synthetic L:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;ZZLx7/a;ZLjava/lang/String;LS/M;Lx7/p;I)V
    .locals 0

    iput-object p1, p0, LS/T$N;->D:Landroidx/compose/ui/d;

    iput-boolean p2, p0, LS/T$N;->E:Z

    iput-boolean p3, p0, LS/T$N;->F:Z

    iput-object p4, p0, LS/T$N;->G:Lx7/a;

    iput-boolean p5, p0, LS/T$N;->H:Z

    iput-object p6, p0, LS/T$N;->I:Ljava/lang/String;

    iput-object p7, p0, LS/T$N;->J:LS/M;

    iput-object p8, p0, LS/T$N;->K:Lx7/p;

    iput p9, p0, LS/T$N;->L:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 10

    iget-object v0, p0, LS/T$N;->D:Landroidx/compose/ui/d;

    iget-boolean v1, p0, LS/T$N;->E:Z

    iget-boolean v2, p0, LS/T$N;->F:Z

    iget-object v3, p0, LS/T$N;->G:Lx7/a;

    iget-boolean v4, p0, LS/T$N;->H:Z

    iget-object v5, p0, LS/T$N;->I:Ljava/lang/String;

    iget-object v6, p0, LS/T$N;->J:LS/M;

    iget-object v7, p0, LS/T$N;->K:Lx7/p;

    iget p2, p0, LS/T$N;->L:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v9

    move-object v8, p1

    invoke-static/range {v0 .. v9}, LS/T;->x(Landroidx/compose/ui/d;ZZLx7/a;ZLjava/lang/String;LS/M;Lx7/p;LV/n;I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/T$N;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
