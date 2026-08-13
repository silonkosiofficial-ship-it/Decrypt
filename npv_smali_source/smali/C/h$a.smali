.class final LC/h$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/h;->a(LC/b;Landroidx/compose/ui/d;LC/K;LA/B;ZLA/b$m;LA/b$e;Lx/p;ZLx7/l;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LC/b;

.field final synthetic E:Landroidx/compose/ui/d;

.field final synthetic F:LC/K;

.field final synthetic G:LA/B;

.field final synthetic H:Z

.field final synthetic I:LA/b$m;

.field final synthetic J:LA/b$e;

.field final synthetic K:Lx/p;

.field final synthetic L:Z

.field final synthetic M:Lx7/l;

.field final synthetic N:I

.field final synthetic O:I


# direct methods
.method constructor <init>(LC/b;Landroidx/compose/ui/d;LC/K;LA/B;ZLA/b$m;LA/b$e;Lx/p;ZLx7/l;II)V
    .locals 0

    iput-object p1, p0, LC/h$a;->D:LC/b;

    iput-object p2, p0, LC/h$a;->E:Landroidx/compose/ui/d;

    iput-object p3, p0, LC/h$a;->F:LC/K;

    iput-object p4, p0, LC/h$a;->G:LA/B;

    iput-boolean p5, p0, LC/h$a;->H:Z

    iput-object p6, p0, LC/h$a;->I:LA/b$m;

    iput-object p7, p0, LC/h$a;->J:LA/b$e;

    iput-object p8, p0, LC/h$a;->K:Lx/p;

    iput-boolean p9, p0, LC/h$a;->L:Z

    iput-object p10, p0, LC/h$a;->M:Lx7/l;

    iput p11, p0, LC/h$a;->N:I

    iput p12, p0, LC/h$a;->O:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 13

    iget-object v0, p0, LC/h$a;->D:LC/b;

    iget-object v1, p0, LC/h$a;->E:Landroidx/compose/ui/d;

    iget-object v2, p0, LC/h$a;->F:LC/K;

    iget-object v3, p0, LC/h$a;->G:LA/B;

    iget-boolean v4, p0, LC/h$a;->H:Z

    iget-object v5, p0, LC/h$a;->I:LA/b$m;

    iget-object v6, p0, LC/h$a;->J:LA/b$e;

    iget-object v7, p0, LC/h$a;->K:Lx/p;

    iget-boolean v8, p0, LC/h$a;->L:Z

    iget-object v9, p0, LC/h$a;->M:Lx7/l;

    iget p2, p0, LC/h$a;->N:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v11

    iget v12, p0, LC/h$a;->O:I

    move-object v10, p1

    invoke-static/range {v0 .. v12}, LC/h;->a(LC/b;Landroidx/compose/ui/d;LC/K;LA/B;ZLA/b$m;LA/b$e;Lx/p;ZLx7/l;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LC/h$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
