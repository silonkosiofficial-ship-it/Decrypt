.class final LN/a$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/a;->b(LN/i;ZLX0/i;ZJLandroidx/compose/ui/d;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LN/i;

.field final synthetic E:Z

.field final synthetic F:LX0/i;

.field final synthetic G:Z

.field final synthetic H:J

.field final synthetic I:Landroidx/compose/ui/d;

.field final synthetic J:I

.field final synthetic K:I


# direct methods
.method constructor <init>(LN/i;ZLX0/i;ZJLandroidx/compose/ui/d;II)V
    .locals 0

    iput-object p1, p0, LN/a$c;->D:LN/i;

    iput-boolean p2, p0, LN/a$c;->E:Z

    iput-object p3, p0, LN/a$c;->F:LX0/i;

    iput-boolean p4, p0, LN/a$c;->G:Z

    iput-wide p5, p0, LN/a$c;->H:J

    iput-object p7, p0, LN/a$c;->I:Landroidx/compose/ui/d;

    iput p8, p0, LN/a$c;->J:I

    iput p9, p0, LN/a$c;->K:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 10

    iget-object v0, p0, LN/a$c;->D:LN/i;

    iget-boolean v1, p0, LN/a$c;->E:Z

    iget-object v2, p0, LN/a$c;->F:LX0/i;

    iget-boolean v3, p0, LN/a$c;->G:Z

    iget-wide v4, p0, LN/a$c;->H:J

    iget-object v6, p0, LN/a$c;->I:Landroidx/compose/ui/d;

    iget p2, p0, LN/a$c;->J:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v8

    iget v9, p0, LN/a$c;->K:I

    move-object v7, p1

    invoke-static/range {v0 .. v9}, LN/a;->b(LN/i;ZLX0/i;ZJLandroidx/compose/ui/d;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/a$c;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
